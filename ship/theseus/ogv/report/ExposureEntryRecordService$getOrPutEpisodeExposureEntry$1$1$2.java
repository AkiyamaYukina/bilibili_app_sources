package com.bilibili.ship.theseus.ogv.report;

import com.bilibili.ship.theseus.ogv.report.ExposureEntryRecordService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/ExposureEntryRecordService$getOrPutEpisodeExposureEntry$1$1$2.class */
public final class ExposureEntryRecordService$getOrPutEpisodeExposureEntry$1$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final ExposureEntryRecordService.a $targetExposureEntry;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposureEntryRecordService$getOrPutEpisodeExposureEntry$1$1$2(ExposureEntryRecordService.a aVar, Continuation<? super ExposureEntryRecordService$getOrPutEpisodeExposureEntry$1$1$2> continuation) {
        super(1, continuation);
        this.$targetExposureEntry = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ExposureEntryRecordService$getOrPutEpisodeExposureEntry$1$1$2(this.$targetExposureEntry, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ExposureEntryRecordService.a aVar = this.$targetExposureEntry;
            this.label = 1;
            if (aVar.a(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
