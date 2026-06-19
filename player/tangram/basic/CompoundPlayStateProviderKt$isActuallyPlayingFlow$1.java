package com.bilibili.player.tangram.basic;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/CompoundPlayStateProviderKt$isActuallyPlayingFlow$1.class */
public final class CompoundPlayStateProviderKt$isActuallyPlayingFlow$1 extends SuspendLambda implements Function4<Boolean, PlayerAvailability, Boolean, Continuation<? super Boolean>, Object> {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;

    public CompoundPlayStateProviderKt$isActuallyPlayingFlow$1(Continuation<? super CompoundPlayStateProviderKt$isActuallyPlayingFlow$1> continuation) {
        super(4, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke(((Boolean) obj).booleanValue(), (PlayerAvailability) obj2, ((Boolean) obj3).booleanValue(), (Continuation<? super Boolean>) obj4);
    }

    public final Object invoke(boolean z6, PlayerAvailability playerAvailability, boolean z7, Continuation<? super Boolean> continuation) {
        CompoundPlayStateProviderKt$isActuallyPlayingFlow$1 compoundPlayStateProviderKt$isActuallyPlayingFlow$1 = new CompoundPlayStateProviderKt$isActuallyPlayingFlow$1(continuation);
        compoundPlayStateProviderKt$isActuallyPlayingFlow$1.Z$0 = z6;
        compoundPlayStateProviderKt$isActuallyPlayingFlow$1.L$0 = playerAvailability;
        compoundPlayStateProviderKt$isActuallyPlayingFlow$1.Z$1 = z7;
        return compoundPlayStateProviderKt$isActuallyPlayingFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(this.Z$0 && ((PlayerAvailability) this.L$0) == PlayerAvailability.READY && !this.Z$1);
    }
}
