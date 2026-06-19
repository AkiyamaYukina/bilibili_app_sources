package com.bilibili.music.podcast.utils.favorite;

import Qi0.C2836f;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.bus.Violet;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.music.podcast.collection.data.FavFolderItem;
import com.bilibili.music.podcast.data.MusicPagerReportData;
import com.bilibili.music.podcast.data.MusicPlayItem;
import com.bilibili.music.podcast.data.MusicPlayVideo;
import com.bilibili.music.podcast.data.p;
import com.bilibili.playset.widget.favorite.FavFrom;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/favorite/MusicFavoriteHelper.class */
public final class MusicFavoriteHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f66992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final a f66993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final c f66994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public MusicFavoriteBoxDialog f66995d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/favorite/MusicFavoriteHelper$a.class */
    public interface a {
        default void a(@NotNull String str, int i7, boolean z6, boolean z7, @NotNull FavFrom favFrom) {
        }

        void b(@NotNull List<FavFolderItem> list);

        @Nullable
        MusicPagerReportData getReportData();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/favorite/MusicFavoriteHelper$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicFavoriteHelper f66996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MusicPlayVideo f66997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.BooleanRef f66998c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Function0<Unit> f66999d;

        public b(MusicFavoriteHelper musicFavoriteHelper, MusicPlayVideo musicPlayVideo, Ref.BooleanRef booleanRef, Function0<Unit> function0) {
            this.f66996a = musicFavoriteHelper;
            this.f66997b = musicPlayVideo;
            this.f66998c = booleanRef;
            this.f66999d = function0;
        }

        public final MusicPagerReportData a() {
            a aVar = this.f66996a.f66993b;
            return aVar != null ? aVar.getReportData() : null;
        }

        public final void b(int i7, String str, boolean z6, boolean z7) {
            a aVar = this.f66996a.f66993b;
            if (aVar != null) {
                aVar.a(str, i7, z6, z7, FavFrom.Dialog);
            }
        }
    }

    public MusicFavoriteHelper(@NotNull Context context, @Nullable a aVar, @Nullable c cVar) {
        this.f66992a = context;
        this.f66993b = aVar;
        this.f66994c = cVar;
    }

    public static void c(MusicPlayVideo musicPlayVideo, boolean z6) {
        if (p.a(musicPlayVideo.getState()) == z6) {
            return;
        }
        p.b(musicPlayVideo.getState(), z6);
        boolean zA = p.a(musicPlayVideo.getState());
        long oid = musicPlayVideo.getOid();
        MusicPlayItem.State state = musicPlayVideo.getState();
        Violet.INSTANCE.setValue(new d(zA, oid, state != null ? state.getFavourite() : 0));
    }

    public final void a(@Nullable MusicPlayVideo musicPlayVideo, long j7, @Nullable Function1<? super Boolean, Unit> function1) {
        Context context = this.f66992a;
        String string = context.getString(2131845673);
        if (!BiliAccounts.get(context).isLogin()) {
            C2836f.b(context, string, "");
            return;
        }
        if (musicPlayVideo.getOid() <= 0) {
            ToastHelper.showToastShort(this.f66992a, 2131848239);
            return;
        }
        FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(this.f66992a);
        LifecycleCoroutineScope lifecycleScope = fragmentActivityFindFragmentActivityOrNull != null ? LifecycleOwnerKt.getLifecycleScope(fragmentActivityFindFragmentActivityOrNull) : null;
        if (lifecycleScope != null) {
            BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new MusicFavoriteHelper$favorite$1(musicPlayVideo, j7, this, function1, null), 3, (Object) null);
        }
    }

    public final void b(@NotNull MusicPlayVideo musicPlayVideo, long j7, boolean z6, @Nullable Function0<Unit> function0) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        MusicFavoriteBoxDialog musicFavoriteBoxDialog = new MusicFavoriteBoxDialog(this.f66992a);
        this.f66995d = musicFavoriteBoxDialog;
        musicFavoriteBoxDialog.show();
        MusicFavoriteBoxDialog musicFavoriteBoxDialog2 = this.f66995d;
        if (musicFavoriteBoxDialog2 != null) {
            boolean zA = p.a(musicPlayVideo.getState());
            b bVar = new b(this, musicPlayVideo, booleanRef, function0);
            musicFavoriteBoxDialog2.f66972b = musicPlayVideo;
            musicFavoriteBoxDialog2.f66973c = j7;
            musicFavoriteBoxDialog2.f66974d = zA;
            musicFavoriteBoxDialog2.f66975e = bVar;
            musicFavoriteBoxDialog2.f66977g = this.f66994c;
            musicFavoriteBoxDialog2.h = 209;
            musicFavoriteBoxDialog2.l();
            musicFavoriteBoxDialog2.f66976f.f66991e = z6;
        }
    }
}
