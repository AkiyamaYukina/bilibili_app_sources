package com.bilibili.pegasus.utils;

import android.animation.Animator;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.pegasus.api.modelv2.BasePlayerItem;
import com.bilibili.pegasus.common.inline.PlayerParamsBuilderKt;
import com.bilibili.pegasus.utils.o;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.pvtracker.PageViewTracker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/p.class */
public final class p implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<BasePlayerItem> f78884a;

    public p(o<BasePlayerItem> oVar) {
        this.f78884a = oVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o<BasePlayerItem> oVar = this.f78884a;
        if (oVar.f78881f) {
            if (BiliAccounts.get(oVar.f78880e).isLogin()) {
                q qVar = new q(oVar);
                IVideoLikeRouteService.ActionLikeTriplePolymer.Companion companion = IVideoLikeRouteService.ActionLikeTriplePolymer.Companion;
                IVideoLikeRouteService.ActionLikeTriplePolymer.Builder builder = new IVideoLikeRouteService.ActionLikeTriplePolymer.Builder();
                builder.setAid(Long.valueOf(oVar.f78876a.getAid()));
                builder.setFrom("76");
                builder.setSpmid(PlayerParamsBuilderKt.SPMID_RECOMMEND);
                builder.setFromSpmid(PlayerParamsBuilderKt.SPMID_RECOMMEND);
                builder.setActionId(PageViewTracker.getInstance().currentPolarisActionId());
                IVideoLikeRouteService.ActionLikeTriplePolymer actionLikeTriplePolymerBuild = builder.build();
                IVideoLikeRouteService iVideoLikeRouteService = (IVideoLikeRouteService) BLRouter.INSTANCE.get(IVideoLikeRouteService.class, "video_like");
                if (iVideoLikeRouteService != null) {
                    iVideoLikeRouteService.reportActionLikeTriple(actionLikeTriplePolymerBuild, qVar);
                }
            } else {
                o.a<T> aVar = oVar.f78879d;
                if (aVar != 0) {
                    aVar.a();
                }
                Qp0.c.b(oVar.f78880e);
            }
            o<BasePlayerItem> oVar2 = this.f78884a;
            o.a<T> aVar2 = oVar2.f78879d;
            if (aVar2 != 0) {
                aVar2.c(oVar2.f78876a);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
