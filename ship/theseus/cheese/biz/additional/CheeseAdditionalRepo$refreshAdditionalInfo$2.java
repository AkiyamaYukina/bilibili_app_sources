package com.bilibili.ship.theseus.cheese.biz.additional;

import com.bilibili.api.BiliApiException;
import com.bilibili.bangumi.logic.page.detail.service.e;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.StudyRecord;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/additional/CheeseAdditionalRepo$refreshAdditionalInfo$2.class */
final class CheeseAdditionalRepo$refreshAdditionalInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final CheeseAdditionalRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseAdditionalRepo$refreshAdditionalInfo$2(CheeseAdditionalRepo cheeseAdditionalRepo, Continuation<? super CheeseAdditionalRepo$refreshAdditionalInfo$2> continuation) {
        super(2, continuation);
        this.this$0 = cheeseAdditionalRepo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseAdditionalRepo$refreshAdditionalInfo$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        String strA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = (a) this.this$0.f88997d.getValue();
            long j7 = this.this$0.f88995b.f54237a;
            this.label = 1;
            Object additionalInfo = aVar.getAdditionalInfo(j7, this);
            obj = additionalInfo;
            if (additionalInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        CheeseAdditionalRepo cheeseAdditionalRepo = this.this$0;
        StudyRecord studyRecordB = null;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            strA = "failed to refreshAdditionalInfo: " + new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                CheeseAdditionalInfo cheeseAdditionalInfo = (CheeseAdditionalInfo) ((BiliApiResponse.Success) biliApiResponse).getData();
                defpackage.a.b("[theseus-cheese-CheeseAdditionalRepo$refreshAdditionalInfo$2-invokeSuspend] ", "refreshAdditionalInfo: " + cheeseAdditionalInfo, "CheeseAdditionalRepo$refreshAdditionalInfo$2-invokeSuspend");
                cheeseAdditionalRepo.f88998e.setValue(cheeseAdditionalInfo);
                if (cheeseAdditionalInfo != null) {
                    studyRecordB = cheeseAdditionalInfo.b();
                }
                cheeseAdditionalRepo.f88996c.f90289a.setValue(studyRecordB);
                return Unit.INSTANCE;
            }
            strA = N4.a.a("failed to refreshAdditionalInfo: ", ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        }
        e.a("[theseus-cheese-CheeseAdditionalRepo$refreshAdditionalInfo$2-invokeSuspend] ", strA, "CheeseAdditionalRepo$refreshAdditionalInfo$2-invokeSuspend", (Throwable) null);
        return Unit.INSTANCE;
    }
}
