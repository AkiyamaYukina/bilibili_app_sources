package com.bilibili.ship.theseus.ogv.vip.rights;

import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/rights/OgvVipRightsReminderService$2$toast$1.class */
public final class OgvVipRightsReminderService$2$toast$1 extends SuspendLambda implements Function3<ExtraInfo, c.a, Continuation<? super PlayerToastVo>, Object> {
    Object L$0;
    Object L$1;
    int label;

    public OgvVipRightsReminderService$2$toast$1(Continuation<? super OgvVipRightsReminderService$2$toast$1> continuation) {
        super(3, continuation);
    }

    public final Object invoke(ExtraInfo extraInfo, c.a aVar, Continuation<? super PlayerToastVo> continuation) {
        OgvVipRightsReminderService$2$toast$1 ogvVipRightsReminderService$2$toast$1 = new OgvVipRightsReminderService$2$toast$1(continuation);
        ogvVipRightsReminderService$2$toast$1.L$0 = extraInfo;
        ogvVipRightsReminderService$2$toast$1.L$1 = aVar;
        return ogvVipRightsReminderService$2$toast$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ExtraInfo extraInfo = (ExtraInfo) this.L$0;
        PlayerToastVo playerToastVo = null;
        if (((c.a) this.L$1).f102988b && extraInfo != null) {
            playerToastVo = (PlayerToastVo) Ju0.a.f11705m.a(extraInfo);
        }
        return playerToastVo;
    }
}
