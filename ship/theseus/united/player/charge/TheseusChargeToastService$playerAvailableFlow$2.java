package com.bilibili.ship.theseus.united.player.charge;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$playerAvailableFlow$2.class */
public final class TheseusChargeToastService$playerAvailableFlow$2 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;

    public TheseusChargeToastService$playerAvailableFlow$2(Continuation<? super TheseusChargeToastService$playerAvailableFlow$2> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusChargeToastService$playerAvailableFlow$2 theseusChargeToastService$playerAvailableFlow$2 = new TheseusChargeToastService$playerAvailableFlow$2(continuation);
        theseusChargeToastService$playerAvailableFlow$2.L$0 = obj;
        return theseusChargeToastService$playerAvailableFlow$2;
    }

    public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Boolean> continuation) {
        return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PlayerAvailability playerAvailability = (PlayerAvailability) this.L$0;
        return Boxing.boxBoolean((playerAvailability == PlayerAvailability.FORBIDDEN || playerAvailability == PlayerAvailability.ERROR || playerAvailability == PlayerAvailability.COMPLETED) ? false : true);
    }
}
