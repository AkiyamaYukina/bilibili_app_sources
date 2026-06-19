package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import android.content.Context;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/z.class */
public final class z implements IVideoLikeRouteService.ActionLikeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KingPositionService.e f100490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f100491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f100492c;

    public z(KingPositionService.e eVar, Context context, boolean z6) {
        this.f100490a = eVar;
        this.f100491b = context;
        this.f100492c = z6;
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
    public final boolean isCancel() {
        return this.f100490a.isCancel();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRequestFailed(java.lang.Throwable r7) {
        /*
            r6 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.api.BiliApiException
            if (r0 == 0) goto L58
            r0 = r7
            com.bilibili.api.BiliApiException r0 = (com.bilibili.api.BiliApiException) r0
            r11 = r0
            r0 = r11
            java.lang.String r0 = r0.getMessage()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L24
            r0 = r10
            r7 = r0
            r0 = r10
            int r0 = r0.length()
            if (r0 != 0) goto L2e
        L24:
            r0 = r6
            android.content.Context r0 = r0.f100491b
            r1 = 2131841734(0x7f1152c6, float:1.9316784E38)
            java.lang.String r0 = r0.getString(r1)
            r7 = r0
        L2e:
            r0 = r11
            int r0 = r0.mCode
            r8 = r0
            r0 = r6
            boolean r0 = r0.f100492c
            r9 = r0
            r0 = r8
            r1 = 65007(0xfdef, float:9.1094E-41)
            if (r0 != r1) goto L43
            r0 = r9
            if (r0 == 0) goto L4d
        L43:
            r0 = r8
            r1 = 65005(0xfded, float:9.1091E-41)
            if (r0 != r1) goto L58
            r0 = r9
            if (r0 == 0) goto L58
        L4d:
            r0 = r6
            com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$e r0 = r0.f100490a
            r1 = r7
            r2 = 0
            r3 = 2
            r4 = 0
            com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback.onRequestSuccess$default(r0, r1, r2, r3, r4)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.kingposition.z.onRequestFailed(java.lang.Throwable):void");
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
    public final void onRequestSuccess(String str, String str2) {
        IVideoLikeRouteService.ActionLikeCallback.onRequestSuccess$default(this.f100490a, str, null, 2, null);
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
    public final void onResponseIllegal() {
        this.f100490a.onResponseIllegal();
    }
}
