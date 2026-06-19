package com.bilibili.ship.theseus.ogv.intro.paybar;

import com.bilibili.ship.theseus.ogv.playviewextra.BadgeButtonVo;
import com.bilibili.ship.theseus.ogv.playviewextra.PayTip;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/paybar/c.class */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvPayBarUIComponentService f93376a;

    public /* synthetic */ c(OgvPayBarUIComponentService ogvPayBarUIComponentService) {
        this.f93376a = ogvPayBarUIComponentService;
    }

    public final Object invoke(Object obj) {
        BadgeButtonVo badgeButtonVo;
        PayTip payTip = (PayTip) obj;
        if (Intrinsics.areEqual((payTip == null || (badgeButtonVo = payTip.f94367n) == null) ? null : badgeButtonVo.a(), "appointment")) {
            OgvPayBarUIComponentService ogvPayBarUIComponentService = this.f93376a;
            BuildersKt.launch$default(ogvPayBarUIComponentService.f93333a, (CoroutineContext) null, (CoroutineStart) null, new OgvPayBarUIComponentService$createPayBarVm$2$1(ogvPayBarUIComponentService, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
