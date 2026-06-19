package com.bilibili.ship.theseus.ugc.intro.kingposition;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$onlineNumbersShareGuide$2.class */
final class UgcKingPositionService$onlineNumbersShareGuide$2 extends SuspendLambda implements Function2<Duration, Continuation<? super Boolean>, Object> {
    final int $playTimeThreshold;
    long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcKingPositionService$onlineNumbersShareGuide$2(int i7, Continuation<? super UgcKingPositionService$onlineNumbersShareGuide$2> continuation) {
        super(2, continuation);
        this.$playTimeThreshold = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcKingPositionService$onlineNumbersShareGuide$2 ugcKingPositionService$onlineNumbersShareGuide$2 = new UgcKingPositionService$onlineNumbersShareGuide$2(this.$playTimeThreshold, continuation);
        ugcKingPositionService$onlineNumbersShareGuide$2.J$0 = ((Duration) obj).unbox-impl();
        return ugcKingPositionService$onlineNumbersShareGuide$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m9295invokeVtjQ1oo(((Duration) obj).unbox-impl(), (Continuation) obj2);
    }

    /* JADX INFO: renamed from: invoke-VtjQ1oo, reason: not valid java name */
    public final Object m9295invokeVtjQ1oo(long j7, Continuation<? super Boolean> continuation) {
        return create(Duration.box-impl(j7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        long j7 = this.J$0;
        Duration.Companion companion = Duration.Companion;
        return Boxing.boxBoolean(Duration.compareTo-LRDsOJo(j7, DurationKt.toDuration(this.$playTimeThreshold * 1000, DurationUnit.MILLISECONDS)) >= 0);
    }
}
