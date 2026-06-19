package com.bilibili.music.podcast.utils;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bilibili.music.podcast.data.MusicPlayItem;
import com.bilibili.music.podcast.data.MusicPlayVideo;
import com.bilibili.player.history.MediaHistoryEntry;
import com.bilibili.player.history.MediaHistoryHelper;
import cq0.C6749b;
import gi0.C7309M;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.music.podcast.utils.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/k.class */
public final class C5431k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Li0.d f67012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ViewPager2 f67013b;

    public C5431k(@NotNull Li0.d dVar, @Nullable ViewPager2 viewPager2) {
        this.f67012a = dVar;
        this.f67013b = viewPager2;
    }

    public static final C7309M a(C5431k c5431k) {
        ViewPager2 viewPager2 = c5431k.f67013b;
        C7309M c7309m = null;
        RecyclerView.Adapter adapter = viewPager2 != null ? viewPager2.getAdapter() : null;
        if (adapter instanceof C7309M) {
            c7309m = (C7309M) adapter;
        }
        return c7309m;
    }

    public static void c(long j7, long j8) {
        C6749b c6749b = new C6749b(j7);
        if (j8 > 0) {
            MediaHistoryHelper.Companion.getInstance().write(c6749b, new MediaHistoryEntry((int) (j8 * ((long) 1000))));
        }
    }

    public final void b(@NotNull MusicPlayVideo musicPlayVideo) {
        Li0.d dVar = this.f67012a;
        Ki0.j jVarG = dVar.g();
        MusicPlayVideo musicPlayVideoG = jVarG != null ? jVarG.g() : null;
        MusicPlayItem musicPlayItemA = jVarG != null ? jVarG.a() : null;
        long lastPart = musicPlayVideo.getLastPart();
        long progress = musicPlayVideo.getProgress();
        if (musicPlayVideoG == null || musicPlayVideoG.getOid() != musicPlayVideo.getOid()) {
            if (jVarG == null || this.f67013b == null) {
                return;
            }
            BuildersKt.launch$default(CoroutineScopeKt.MainScope(), (CoroutineContext) null, (CoroutineStart) null, new MusicInsertHandler$performDataChange$1(jVarG, musicPlayVideo, this, null), 3, (Object) null);
            return;
        }
        if (musicPlayItemA != null && musicPlayItemA.getSid() == lastPart) {
            if (dVar.n()) {
                return;
            }
            dVar.u();
            return;
        }
        List<MusicPlayItem> parts = musicPlayVideoG.getParts();
        Pair<Integer, Integer> pairB = jVarG.b();
        Iterator<MusicPlayItem> it = parts.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (lastPart == it.next().getSid()) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0) {
            BLog.i("MusicInsertHandler", "not find this item of parts");
        } else {
            c(lastPart, progress);
            dVar.r(((Number) pairB.getFirst()).intValue(), i7);
        }
    }
}
