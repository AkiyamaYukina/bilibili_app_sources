package com.bilibili.ship.theseus.ugc.fitnesscollection;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/fitnesscollection/UgcFitnessCollectionService$cancelSeasonPanel$2.class */
final class UgcFitnessCollectionService$cancelSeasonPanel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Long $foldTime;
    private Object L$0;
    int label;
    final UgcFitnessCollectionService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.fitnesscollection.UgcFitnessCollectionService$cancelSeasonPanel$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/fitnesscollection/UgcFitnessCollectionService$cancelSeasonPanel$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Long $foldTime;
        int label;
        final UgcFitnessCollectionService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Long l7, UgcFitnessCollectionService ugcFitnessCollectionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$foldTime = l7;
            this.this$0 = ugcFitnessCollectionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$foldTime, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Long l7 = this.$foldTime;
                if (l7 != null && (l7 == null || l7.longValue() != 0)) {
                    this.label = 1;
                    if (DelayKt.delay(this.$foldTime.longValue() * ((long) 1000), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.f96912c.f101459i.tryEmit(Unit.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcFitnessCollectionService$cancelSeasonPanel$2(UgcFitnessCollectionService ugcFitnessCollectionService, Long l7, Continuation<? super UgcFitnessCollectionService$cancelSeasonPanel$2> continuation) {
        super(2, continuation);
        this.this$0 = ugcFitnessCollectionService;
        this.$foldTime = l7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcFitnessCollectionService$cancelSeasonPanel$2 ugcFitnessCollectionService$cancelSeasonPanel$2 = new UgcFitnessCollectionService$cancelSeasonPanel$2(this.this$0, this.$foldTime, continuation);
        ugcFitnessCollectionService$cancelSeasonPanel$2.L$0 = obj;
        return ugcFitnessCollectionService$cancelSeasonPanel$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Job job = this.this$0.f96915f;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        UgcFitnessCollectionService ugcFitnessCollectionService = this.this$0;
        ugcFitnessCollectionService.f96915f = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$foldTime, ugcFitnessCollectionService, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
