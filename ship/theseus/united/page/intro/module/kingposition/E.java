package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.lib.riskcontrol.IActionValidateResult;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.B;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/E.class */
public final class E implements IActionValidateResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f100216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IVideoLikeRouteService.ActionLikeNologinPolymer f100217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f100218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B.a f100219d;

    public E(G g7, IVideoLikeRouteService.ActionLikeNologinPolymer actionLikeNologinPolymer, F f7, B.a aVar) {
        this.f100216a = g7;
        this.f100217b = actionLikeNologinPolymer;
        this.f100218c = f7;
        this.f100219d = aVar;
    }

    @Override // com.bilibili.lib.riskcontrol.IActionValidateResult
    public final void onBlock(String str) {
        this.f100219d.a(new Throwable(str));
    }

    @Override // com.bilibili.lib.riskcontrol.IActionValidateResult
    public final void onPass(String str) {
        IVideoLikeRouteService iVideoLikeRouteService = this.f100216a.f100221a;
        if (iVideoLikeRouteService != null) {
            iVideoLikeRouteService.reportActionLikeNologin(IVideoLikeRouteService.ActionLikeNologinPolymer.copy$default(this.f100217b, 0L, 0, null, null, null, null, null, null, null, str, null, 1535, null), this.f100218c);
        }
    }
}
