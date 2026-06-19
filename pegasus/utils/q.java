package com.bilibili.pegasus.utils;

import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.pegasus.api.modelv2.BasePlayerItem;
import com.bilibili.pegasus.utils.o;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/q.class */
public final class q implements IVideoLikeRouteService.ActionLikeTripleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<BasePlayerItem> f78885a;

    public q(o<BasePlayerItem> oVar) {
        this.f78885a = oVar;
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeTripleCallback
    public final boolean isCancel() {
        return x.a(this.f78885a.f78880e);
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeTripleCallback
    public final void onRequestFailed(Throwable th) {
        PromoToast.showBottomToast(this.f78885a.f78880e, 2131845189);
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeTripleCallback
    public final void onRequestSuccess(boolean z6, boolean z7, boolean z8, boolean z9, int i7, String str, String str2) {
        o<BasePlayerItem> oVar = this.f78885a;
        if (z6) {
            oVar.f78876a.updateLikeState(z6, -1L);
        }
        oVar.f78876a.setTripleLikeCoin(z7);
        oVar.f78876a.setTripleLikeFav(z8);
        o.a<T> aVar = oVar.f78879d;
        if (aVar != 0) {
            aVar.d(oVar.f78876a);
        }
        if (z6 && z7 && z8) {
            return;
        }
        if (!z6 && !z7 && !z8) {
            PromoToast.showBottomToast(oVar.f78880e, 2131845120);
            return;
        }
        if (!z6 && z7 && z8) {
            PromoToast.showBottomToast(oVar.f78880e, 2131845356);
            return;
        }
        if (z6 && !z7 && z8) {
            PromoToast.showBottomToast(oVar.f78880e, 2131845199);
            return;
        }
        if (z6 && z7) {
            PromoToast.showBottomToast(oVar.f78880e, 2131845350);
            return;
        }
        if (z6) {
            PromoToast.showBottomToast(oVar.f78880e, 2131845133);
        } else if (z7) {
            PromoToast.showBottomToast(oVar.f78880e, 2131845079);
        } else {
            PromoToast.showBottomToast(oVar.f78880e, 2131845111);
        }
    }
}
