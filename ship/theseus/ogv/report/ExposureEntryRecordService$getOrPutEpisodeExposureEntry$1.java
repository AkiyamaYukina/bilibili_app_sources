package com.bilibili.ship.theseus.ogv.report;

import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.ogv.report.ExposureEntryRecordService;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/ExposureEntryRecordService$getOrPutEpisodeExposureEntry$1.class */
final class ExposureEntryRecordService$getOrPutEpisodeExposureEntry$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ExposureEntryRecordService.a $resultExposureEntry;
    final ExposureEntryRecordService.a $targetExposureEntry;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposureEntryRecordService$getOrPutEpisodeExposureEntry$1(ExposureEntryRecordService.a aVar, ExposureEntryRecordService.a aVar2, Continuation<? super ExposureEntryRecordService$getOrPutEpisodeExposureEntry$1> continuation) {
        super(2, continuation);
        this.$resultExposureEntry = aVar;
        this.$targetExposureEntry = aVar2;
    }

    private static final Unit invokeSuspend$lambda$0(ExposureEntryRecordService.a aVar, ExposureEntryRecordService.a aVar2, com.bilibili.ogv.infra.coroutine.c cVar) {
        cVar.b(new ExposureEntryRecordService$getOrPutEpisodeExposureEntry$1$1$1(aVar, null));
        cVar.b(new ExposureEntryRecordService$getOrPutEpisodeExposureEntry$1$1$2(aVar2, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExposureEntryRecordService$getOrPutEpisodeExposureEntry$1(this.$resultExposureEntry, this.$targetExposureEntry, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ExposureEntryRecordService.a aVar = this.$resultExposureEntry;
            ExposureEntryRecordService.a aVar2 = this.$targetExposureEntry;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(aVar, aVar2, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
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
