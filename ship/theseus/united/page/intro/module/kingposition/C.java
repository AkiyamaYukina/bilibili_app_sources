package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.lib.riskcontrol.IActionValidateResult;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.A;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/C.class */
public final class C implements IActionValidateResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f100211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IVideoLikeRouteService.ActionLikePolymer f100212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D f100213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A.a f100214d;

    public C(G g7, IVideoLikeRouteService.ActionLikePolymer actionLikePolymer, D d7, A.a aVar) {
        this.f100211a = g7;
        this.f100212b = actionLikePolymer;
        this.f100213c = d7;
        this.f100214d = aVar;
    }

    @Override // com.bilibili.lib.riskcontrol.IActionValidateResult
    public final void onBlock(String str) {
        this.f100214d.a(new Throwable(str));
    }

    @Override // com.bilibili.lib.riskcontrol.IActionValidateResult
    public final void onPass(String str) {
        IVideoLikeRouteService iVideoLikeRouteService = this.f100211a.f100221a;
        if (iVideoLikeRouteService != null) {
            iVideoLikeRouteService.reportActionLike(IVideoLikeRouteService.ActionLikePolymer.copy$default(this.f100212b, 0L, 0, null, null, null, null, null, null, null, str, null, 1535, null), this.f100213c);
        }
    }
}
