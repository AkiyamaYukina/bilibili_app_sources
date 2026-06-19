package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/G.class */
@StabilityInferred(parameters = 0)
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final IVideoLikeRouteService f100221a = (IVideoLikeRouteService) BLRouter.INSTANCE.get(IVideoLikeRouteService.class, "video_like");

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.bilibili.ship.theseus.united.page.intro.module.kingposition.G r6, android.content.Context r7, java.lang.Throwable r8, com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikePolymer r9, com.bilibili.ship.theseus.united.page.intro.module.kingposition.v r10) {
        /*
            r0 = r9
            int r0 = r0.getLike()
            r12 = r0
            r0 = 1
            r11 = r0
            r0 = r12
            r1 = 1
            if (r0 != r1) goto L12
            goto L15
        L12:
            r0 = 0
            r11 = r0
        L15:
            r0 = r11
            if (r0 != 0) goto L36
            r0 = r8
            boolean r0 = r0 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L36
            r0 = r10
            java.lang.Throwable r1 = new java.lang.Throwable
            r2 = r1
            r3 = r7
            r4 = 2131847050(0x7f11678a, float:1.9327566E38)
            java.lang.String r3 = r3.getString(r4)
            r2.<init>(r3)
            r0.onRequestFailed(r1)
            goto La1
        L36:
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.api.BiliApiException
            if (r0 == 0) goto La1
            r0 = r8
            com.bilibili.api.BiliApiException r0 = (com.bilibili.api.BiliApiException) r0
            r9 = r0
            r0 = r9
            java.lang.String r0 = r0.getMessage()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L54
            r0 = r8
            r6 = r0
            r0 = r8
            int r0 = r0.length()
            if (r0 != 0) goto L6a
        L54:
            r0 = r11
            if (r0 == 0) goto L63
            r0 = r7
            r1 = 2131846938(0x7f11671a, float:1.932734E38)
            java.lang.String r0 = r0.getString(r1)
            r6 = r0
            goto L6a
        L63:
            r0 = r7
            r1 = 2131841697(0x7f1152a1, float:1.931671E38)
            java.lang.String r0 = r0.getString(r1)
            r6 = r0
        L6a:
            r0 = r9
            int r0 = r0.mCode
            r12 = r0
            r0 = r12
            r1 = 65004(0xfdec, float:9.109E-41)
            if (r0 != r1) goto L7c
            r0 = r11
            if (r0 != 0) goto L88
        L7c:
            r0 = r12
            r1 = 65006(0xfdee, float:9.1093E-41)
            if (r0 != r1) goto L94
            r0 = r11
            if (r0 != 0) goto L94
        L88:
            r0 = r10
            r1 = r6
            r2 = 0
            r3 = 2
            r4 = 0
            com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback.onRequestSuccess$default(r0, r1, r2, r3, r4)
            goto La1
        L94:
            r0 = r10
            java.lang.Throwable r1 = new java.lang.Throwable
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.onRequestFailed(r1)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.kingposition.G.a(com.bilibili.ship.theseus.united.page.intro.module.kingposition.G, android.content.Context, java.lang.Throwable, com.bilibili.playerbizcommon.IVideoLikeRouteService$ActionLikePolymer, com.bilibili.ship.theseus.united.page.intro.module.kingposition.v):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.bilibili.ship.theseus.united.page.intro.module.kingposition.G r7, android.content.Context r8, boolean r9, boolean r10, java.lang.Throwable r11, com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService.f r12) {
        /*
            r0 = r9
            if (r0 != 0) goto L21
            r0 = r11
            boolean r0 = r0 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L21
            r0 = r12
            java.lang.Throwable r1 = new java.lang.Throwable
            r2 = r1
            r3 = r8
            r4 = 2131847050(0x7f11678a, float:1.9327566E38)
            java.lang.String r3 = r3.getString(r4)
            r2.<init>(r3)
            r0.onRequestFailed(r1)
            goto L9c
        L21:
            r0 = r11
            boolean r0 = r0 instanceof com.bilibili.api.BiliApiException
            if (r0 == 0) goto L9c
            r0 = r11
            com.bilibili.api.BiliApiException r0 = (com.bilibili.api.BiliApiException) r0
            r14 = r0
            r0 = r14
            java.lang.String r0 = r0.getMessage()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L4d
            r0 = r11
            r7 = r0
            r0 = r11
            int r0 = r0.length()
            if (r0 != 0) goto L4a
            goto L4d
        L4a:
            goto L65
        L4d:
            r0 = r9
            if (r0 == 0) goto L5b
            r0 = r8
            r1 = 2131846938(0x7f11671a, float:1.932734E38)
            java.lang.String r0 = r0.getString(r1)
            r7 = r0
            goto L4a
        L5b:
            r0 = r8
            r1 = 2131841697(0x7f1152a1, float:1.931671E38)
            java.lang.String r0 = r0.getString(r1)
            r7 = r0
            goto L4a
        L65:
            r0 = r14
            int r0 = r0.mCode
            r13 = r0
            r0 = r13
            r1 = 65004(0xfdec, float:9.109E-41)
            if (r0 != r1) goto L77
            r0 = r9
            if (r0 != 0) goto L82
        L77:
            r0 = r13
            r1 = 65006(0xfdee, float:9.1093E-41)
            if (r0 != r1) goto L8f
            r0 = r9
            if (r0 != 0) goto L8f
        L82:
            r0 = r12
            r1 = r7
            r2 = r10
            r3 = 0
            r4 = 4
            r5 = 0
            com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeNologinCallback.onRequestSuccess$default(r0, r1, r2, r3, r4, r5)
            goto L9c
        L8f:
            r0 = r12
            java.lang.Throwable r1 = new java.lang.Throwable
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.onRequestFailed(r1)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.kingposition.G.b(com.bilibili.ship.theseus.united.page.intro.module.kingposition.G, android.content.Context, boolean, boolean, java.lang.Throwable, com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$f):void");
    }
}
