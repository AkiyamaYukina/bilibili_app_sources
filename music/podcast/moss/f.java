package com.bilibili.music.podcast.moss;

import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs;
import com.bapis.bilibili.app.listener.v1.ListenerMoss;
import com.bapis.bilibili.app.listener.v1.RcmdPlaylistReq;
import com.bapis.bilibili.pagination.Pagination;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.playerbizcommon.utils.PlayUrlFlagsManager;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.videoplayer.core.media.ijk.IjkOptionsHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/moss/f.class */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f66883a = new Object();

    public static void d(int i7, long j7, boolean z6, boolean z7, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull a aVar) {
        RcmdPlaylistReq.c cVarNewBuilder = RcmdPlaylistReq.newBuilder();
        cVarNewBuilder.setFrom(RcmdPlaylistReq.RcmdFrom.forNumber(i7));
        if (j7 > 0) {
            cVarNewBuilder.setId(j7);
            String str4 = str2;
            if (str2 == null) {
                str4 = "";
            }
            cVarNewBuilder.putAnnotations("session_id", str4);
            String str5 = str3;
            if (str3 == null) {
                str5 = "";
            }
            cVarNewBuilder.putAnnotations("from_trackid", str5);
        }
        cVarNewBuilder.setNeedHistory(z6);
        cVarNewBuilder.setNeedTopCards(z7);
        PlayerArgs.b forceHost = PlayerArgs.newBuilder().setQn(64L).setFnver(PlayUrlFlagsManager.getFnVer()).setFnval(PlayUrlFlagsManager.getFnVal()).setSoftFnval(PlayUrlFlagsManager.getSoftFnVal()).setForceHost(PlayerSettingHelper.getForceHost());
        long j8 = 0;
        if (IjkOptionsHelper.getVolumeBalance()) {
            j8 = 1;
        }
        cVarNewBuilder.setPlayerArgs((PlayerArgs) forceHost.setVoiceBalance(j8).build());
        if (str != null) {
            cVarNewBuilder.setPage(Pagination.newBuilder().setPageSize(20).setNext(str).build());
        }
        new ListenerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).rcmdPlaylist(cVarNewBuilder.build(), new d(aVar, aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r10, long r11, long r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r9 = this;
            r0 = r15
            boolean r0 = r0 instanceof com.bilibili.music.podcast.moss.MusicMossApiService$favToDefaultCatching$1
            if (r0 == 0) goto L2f
            r0 = r15
            com.bilibili.music.podcast.moss.MusicMossApiService$favToDefaultCatching$1 r0 = (com.bilibili.music.podcast.moss.MusicMossApiService$favToDefaultCatching$1) r0
            r17 = r0
            r0 = r17
            int r0 = r0.label
            r16 = r0
            r0 = r16
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = r17
            r1 = r16
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r17
            r15 = r0
            goto L3b
        L2f:
            com.bilibili.music.podcast.moss.MusicMossApiService$favToDefaultCatching$1 r0 = new com.bilibili.music.podcast.moss.MusicMossApiService$favToDefaultCatching$1
            r1 = r0
            r2 = r9
            r3 = r15
            r1.<init>(r2, r3)
            r15 = r0
        L3b:
            r0 = r15
            java.lang.Object r0 = r0.result
            r17 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r18 = r0
            r0 = r15
            int r0 = r0.label
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L75
            r0 = r16
            r1 = 1
            if (r0 != r1) goto L6b
            r0 = r17
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r17
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.unbox-impl()
            r15 = r0
            goto La5
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L75:
            r0 = r17
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.music.podcast.moss.MusicMossApiService$favToDefaultCatching$2 r0 = new com.bilibili.music.podcast.moss.MusicMossApiService$favToDefaultCatching$2
            r1 = r0
            r2 = r11
            r3 = r13
            r4 = r10
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r17 = r0
            r0 = r15
            r1 = 1
            r0.label = r1
            r0 = r17
            r1 = r15
            java.lang.Object r0 = com.bilibili.playerbizcommonv2.utils.p.l(r0, r1)
            r17 = r0
            r0 = r17
            r15 = r0
            r0 = r17
            r1 = r18
            if (r0 != r1) goto La5
            r0 = r18
            return r0
        La5:
            r0 = r15
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.moss.f.a(int, long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull java.util.List r11, long r12, long r14, int r16, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            r10 = this;
            r0 = r17
            boolean r0 = r0 instanceof com.bilibili.music.podcast.moss.MusicMossApiService$favoriteModifyCatching$1
            if (r0 == 0) goto L2f
            r0 = r17
            com.bilibili.music.podcast.moss.MusicMossApiService$favoriteModifyCatching$1 r0 = (com.bilibili.music.podcast.moss.MusicMossApiService$favoriteModifyCatching$1) r0
            r19 = r0
            r0 = r19
            int r0 = r0.label
            r18 = r0
            r0 = r18
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = r19
            r1 = r18
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r19
            r17 = r0
            goto L3b
        L2f:
            com.bilibili.music.podcast.moss.MusicMossApiService$favoriteModifyCatching$1 r0 = new com.bilibili.music.podcast.moss.MusicMossApiService$favoriteModifyCatching$1
            r1 = r0
            r2 = r10
            r3 = r17
            r1.<init>(r2, r3)
            r17 = r0
        L3b:
            r0 = r17
            java.lang.Object r0 = r0.result
            r20 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r19 = r0
            r0 = r17
            int r0 = r0.label
            r18 = r0
            r0 = r18
            if (r0 == 0) goto L74
            r0 = r18
            r1 = 1
            if (r0 != r1) goto L6a
            r0 = r20
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r20
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.unbox-impl()
            r11 = r0
            goto La3
        L6a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L74:
            r0 = r20
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.music.podcast.moss.MusicMossApiService$favoriteModifyCatching$2 r0 = new com.bilibili.music.podcast.moss.MusicMossApiService$favoriteModifyCatching$2
            r1 = r0
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r11
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r11 = r0
            r0 = r17
            r1 = 1
            r0.label = r1
            r0 = r11
            r1 = r17
            java.lang.Object r0 = com.bilibili.playerbizcommonv2.utils.p.l(r0, r1)
            r17 = r0
            r0 = r17
            r11 = r0
            r0 = r17
            r1 = r19
            if (r0 != r1) goto La3
            r0 = r19
            return r0
        La3:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.moss.f.b(java.util.List, long, long, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull java.util.List r7, @org.jetbrains.annotations.NotNull com.bapis.bilibili.app.listener.v1.PlayItem r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            r0 = r9
            boolean r0 = r0 instanceof com.bilibili.music.podcast.moss.MusicMossApiService$getFavFolderListCatching$1
            if (r0 == 0) goto L2c
            r0 = r9
            com.bilibili.music.podcast.moss.MusicMossApiService$getFavFolderListCatching$1 r0 = (com.bilibili.music.podcast.moss.MusicMossApiService$getFavFolderListCatching$1) r0
            r11 = r0
            r0 = r11
            int r0 = r0.label
            r10 = r0
            r0 = r10
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r11
            r1 = r10
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r11
            r9 = r0
            goto L36
        L2c:
            com.bilibili.music.podcast.moss.MusicMossApiService$getFavFolderListCatching$1 r0 = new com.bilibili.music.podcast.moss.MusicMossApiService$getFavFolderListCatching$1
            r1 = r0
            r2 = r6
            r3 = r9
            r1.<init>(r2, r3)
            r9 = r0
        L36:
            r0 = r9
            java.lang.Object r0 = r0.result
            r12 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r9
            int r0 = r0.label
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L6d
            r0 = r10
            r1 = 1
            if (r0 != r1) goto L63
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r12
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.unbox-impl()
            r7 = r0
            goto L93
        L63:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6d:
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.music.podcast.moss.MusicMossApiService$getFavFolderListCatching$2 r0 = new com.bilibili.music.podcast.moss.MusicMossApiService$getFavFolderListCatching$2
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = 0
            r1.<init>(r2, r3, r4)
            r7 = r0
            r0 = r9
            r1 = 1
            r0.label = r1
            r0 = r7
            r1 = r9
            java.lang.Object r0 = com.bilibili.playerbizcommonv2.utils.p.l(r0, r1)
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            r1 = r11
            if (r0 != r1) goto L93
            r0 = r11
            return r0
        L93:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.moss.f.c(java.util.List, com.bapis.bilibili.app.listener.v1.PlayItem, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(int r10, long r11, long r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r9 = this;
            r0 = r15
            boolean r0 = r0 instanceof com.bilibili.music.podcast.moss.MusicMossApiService$removeAllFavCatching$1
            if (r0 == 0) goto L2f
            r0 = r15
            com.bilibili.music.podcast.moss.MusicMossApiService$removeAllFavCatching$1 r0 = (com.bilibili.music.podcast.moss.MusicMossApiService$removeAllFavCatching$1) r0
            r17 = r0
            r0 = r17
            int r0 = r0.label
            r16 = r0
            r0 = r16
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = r17
            r1 = r16
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r17
            r15 = r0
            goto L3b
        L2f:
            com.bilibili.music.podcast.moss.MusicMossApiService$removeAllFavCatching$1 r0 = new com.bilibili.music.podcast.moss.MusicMossApiService$removeAllFavCatching$1
            r1 = r0
            r2 = r9
            r3 = r15
            r1.<init>(r2, r3)
            r15 = r0
        L3b:
            r0 = r15
            java.lang.Object r0 = r0.result
            r17 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r18 = r0
            r0 = r15
            int r0 = r0.label
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L75
            r0 = r16
            r1 = 1
            if (r0 != r1) goto L6b
            r0 = r17
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r17
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.unbox-impl()
            r15 = r0
            goto La5
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L75:
            r0 = r17
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.music.podcast.moss.MusicMossApiService$removeAllFavCatching$2 r0 = new com.bilibili.music.podcast.moss.MusicMossApiService$removeAllFavCatching$2
            r1 = r0
            r2 = r11
            r3 = r13
            r4 = r10
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r17 = r0
            r0 = r15
            r1 = 1
            r0.label = r1
            r0 = r17
            r1 = r15
            java.lang.Object r0 = com.bilibili.playerbizcommonv2.utils.p.l(r0, r1)
            r17 = r0
            r0 = r17
            r15 = r0
            r0 = r17
            r1 = r18
            if (r0 != r1) goto La5
            r0 = r18
            return r0
        La5:
            r0 = r15
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.moss.f.e(int, long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(int r10, long r11, long r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r9 = this;
            r0 = r15
            boolean r0 = r0 instanceof com.bilibili.music.podcast.moss.MusicMossApiService$tripleLikeCatching$1
            if (r0 == 0) goto L2f
            r0 = r15
            com.bilibili.music.podcast.moss.MusicMossApiService$tripleLikeCatching$1 r0 = (com.bilibili.music.podcast.moss.MusicMossApiService$tripleLikeCatching$1) r0
            r17 = r0
            r0 = r17
            int r0 = r0.label
            r16 = r0
            r0 = r16
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = r17
            r1 = r16
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r17
            r15 = r0
            goto L3b
        L2f:
            com.bilibili.music.podcast.moss.MusicMossApiService$tripleLikeCatching$1 r0 = new com.bilibili.music.podcast.moss.MusicMossApiService$tripleLikeCatching$1
            r1 = r0
            r2 = r9
            r3 = r15
            r1.<init>(r2, r3)
            r15 = r0
        L3b:
            r0 = r15
            java.lang.Object r0 = r0.result
            r17 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r18 = r0
            r0 = r15
            int r0 = r0.label
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L75
            r0 = r16
            r1 = 1
            if (r0 != r1) goto L6b
            r0 = r17
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r17
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.unbox-impl()
            r15 = r0
            goto La5
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L75:
            r0 = r17
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.music.podcast.moss.MusicMossApiService$tripleLikeCatching$2 r0 = new com.bilibili.music.podcast.moss.MusicMossApiService$tripleLikeCatching$2
            r1 = r0
            r2 = r11
            r3 = r13
            r4 = r10
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r17 = r0
            r0 = r15
            r1 = 1
            r0.label = r1
            r0 = r17
            r1 = r15
            java.lang.Object r0 = com.bilibili.playerbizcommonv2.utils.p.l(r0, r1)
            r17 = r0
            r0 = r17
            r15 = r0
            r0 = r17
            r1 = r18
            if (r0 != r1) goto La5
            r0 = r18
            return r0
        La5:
            r0 = r15
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.moss.f.f(int, long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
