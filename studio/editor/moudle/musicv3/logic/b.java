package com.bilibili.studio.editor.moudle.musicv3.logic;

import J3.E;
import UD.n2;
import androidx.compose.foundation.text.C0;
import androidx.compose.runtime.snapshots.z;
import androidx.fragment.app.B;
import androidx.recyclerview.widget.v;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.bgm.BgmPointEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/logic/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f107939a = LazyKt.lazy(new E(7));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f107940b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ConcurrentHashMap<Long, Long> f107941c = new ConcurrentHashMap<>();

    public static void a(@Nullable BMusic bMusic, long j7) {
        long jB;
        Bgm bgm = bMusic.bgm;
        if (bgm == null || !bgm.formMusicLibrary) {
            Long l7 = f107941c.get(Long.valueOf(bMusic.bgmSid));
            if (l7 != null) {
                jB = l7.longValue();
                C0.c(jB, "已播放过, trimIn=", "BiliEditorMusicCacheLogicV2");
            } else {
                int i7 = f107940b;
                if (i7 >= 0) {
                    jB = b(bMusic.bgm, i7);
                    BLog.i("BiliEditorMusicCacheLogicV2", B.b(f107940b, jB, "使用上一首音乐recommend, lastRecommend=", ", trimIn="));
                } else {
                    Bgm bgm2 = bMusic.bgm;
                    long jB2 = j7 <= 60000000 ? b(bgm2, 1) : j7 <= 180000000 ? b(bgm2, 0) : 0L;
                    v.a(z.a(j7, "素材时长推荐, videoDuration=", ", , trimIn="), jB2, "BiliEditorMusicCacheLogicV2");
                    jB = jB2;
                }
            }
            long j8 = bMusic.trimOut;
            long j9 = bMusic.trimIn;
            bMusic.trimIn = jB;
            bMusic.trimOut = Math.min(jB + (j8 - j9), bMusic.totalTime);
        }
    }

    public static long b(Bgm bgm, int i7) {
        Object next;
        ArrayList<BgmPointEntry> arrayList = bgm != null ? bgm.timeline : null;
        List listEmptyList = arrayList;
        if (arrayList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Iterator it = SequencesKt.filter(CollectionsKt.asSequence(listEmptyList), new n2(i7, 1)).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long j7 = ((BgmPointEntry) next).point;
                Object obj = next;
                do {
                    Object next2 = it.next();
                    long j8 = ((BgmPointEntry) next2).point;
                    next = obj;
                    long j9 = j7;
                    if (j7 > j8) {
                        next = next2;
                        j9 = j8;
                    }
                    obj = next;
                    j7 = j9;
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        BgmPointEntry bgmPointEntry = (BgmPointEntry) next;
        return (bgmPointEntry != null ? bgmPointEntry.point : 0L) * ((long) 1000);
    }

    public static boolean c() {
        return ((Boolean) f107939a.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.bean.BMusic r7) {
        /*
            boolean r0 = c()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = r7
            if (r0 != 0) goto Lc
            return
        Lc:
            r0 = r7
            long r0 = r0.trimIn
            r11 = r0
            r0 = r7
            com.bilibili.studio.videoeditor.bgm.Bgm r0 = r0.bgm
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L2c
            r0 = r15
            java.util.ArrayList<com.bilibili.studio.videoeditor.bgm.BgmPointEntry> r0 = r0.timeline
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L2c
            goto L31
        L2c:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r15 = r0
        L31:
            r0 = r15
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
            r0 = -1
            r8 = r0
            r0 = r11
            r9 = r0
        L3f:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L7e
            r0 = r16
            java.lang.Object r0 = r0.next()
            com.bilibili.studio.videoeditor.bgm.BgmPointEntry r0 = (com.bilibili.studio.videoeditor.bgm.BgmPointEntry) r0
            r15 = r0
            r0 = r11
            r1 = r15
            long r1 = r1.point
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 - r1
            r13 = r0
            r0 = 0
            r1 = r13
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L3f
            r0 = r13
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L3f
            r0 = r15
            int r0 = r0.recommend
            r8 = r0
            r0 = r13
            r9 = r0
            goto L3f
        L7e:
            r0 = r8
            com.bilibili.studio.editor.moudle.musicv3.logic.b.f107940b = r0
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Long> r0 = com.bilibili.studio.editor.moudle.musicv3.logic.b.f107941c
            r1 = r7
            long r1 = r1.bgmSid
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = r7
            long r2 = r2.trimIn
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r0 = r0.musicName
            r15 = r0
            r0 = r7
            long r0 = r0.trimIn
            java.lang.String r1 = "记录使用音乐，name="
            r2 = r15
            java.lang.String r3 = "，trimIn="
            java.lang.StringBuilder r0 = com.bilibili.playerbizcommon.features.background.b.a(r0, r1, r2, r3)
            r7 = r0
            r0 = r7
            java.lang.String r1 = ", recommend="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "BiliEditorMusicCacheLogicV2"
            r1 = r7
            java.lang.String r1 = r1.toString()
            tv.danmaku.android.log.BLog.i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.logic.b.d(com.bilibili.studio.videoeditor.bean.BMusic):void");
    }
}
