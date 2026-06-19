package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayable$playerAvailabilityFlow$1$1.class */
public final class SequentialPCSPlayable$playerAvailabilityFlow$1$1 extends SuspendLambda implements Function3<Boolean, PlayerAvailability, Continuation<? super PlayerAvailability>, Object> {
    Object L$0;
    boolean Z$0;
    int label;

    public SequentialPCSPlayable$playerAvailabilityFlow$1$1(Continuation<? super SequentialPCSPlayable$playerAvailabilityFlow$1$1> continuation) {
        super(3, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Boolean) obj).booleanValue(), (PlayerAvailability) obj2, (Continuation<? super PlayerAvailability>) obj3);
    }

    public final Object invoke(boolean z6, PlayerAvailability playerAvailability, Continuation<? super PlayerAvailability> continuation) {
        SequentialPCSPlayable$playerAvailabilityFlow$1$1 sequentialPCSPlayable$playerAvailabilityFlow$1$1 = new SequentialPCSPlayable$playerAvailabilityFlow$1$1(continuation);
        sequentialPCSPlayable$playerAvailabilityFlow$1$1.Z$0 = z6;
        sequentialPCSPlayable$playerAvailabilityFlow$1$1.L$0 = playerAvailability;
        return sequentialPCSPlayable$playerAvailabilityFlow$1$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z6 = this.Z$0;
        PlayerAvailability playerAvailability = (PlayerAvailability) this.L$0;
        PlayerAvailability playerAvailability2 = playerAvailability;
        if (z6) {
            playerAvailability2 = playerAvailability;
            if (playerAvailability == PlayerAvailability.COMPLETED) {
                playerAvailability2 = PlayerAvailability.READY;
            }
        }
        return playerAvailability2;
    }
}
