package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/N.class */
public final class N {
    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Map<java.lang.String, java.lang.String> a(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.playlist.api.MultiTypeMedia r7, @org.jetbrains.annotations.Nullable Ou0.c r8) {
        /*
            r0 = r8
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = r0.f18089b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L15
        L12:
            java.lang.String r0 = ""
            r8 = r0
        L15:
            r0 = r7
            java.lang.String r0 = r0.q()
            r9 = r0
            r0 = 4
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "goto_avid"
            r4 = r7
            long r4 = r4.d()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "goto_cid"
            r4 = r8
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "goto_av_type"
            r4 = r9
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = r7
            int r3 = r3.f95226N
            r4 = 1
            java.lang.String r5 = "playlist_video_sort"
            kotlin.Pair r3 = com.bilibili.app.authorspace.ui.pages.p.a(r3, r4, r5)
            r1[r2] = r3
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.N.a(com.bilibili.ship.theseus.playlist.api.MultiTypeMedia, Ou0.c):java.util.Map");
    }

    public static Map b(MultiTypeMedia multiTypeMedia) {
        return a(multiTypeMedia, (Ou0.c) CollectionsKt.firstOrNull(multiTypeMedia.f95225M));
    }
}
