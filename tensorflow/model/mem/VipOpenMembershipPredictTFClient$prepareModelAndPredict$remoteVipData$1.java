package com.bilibili.tensorflow.model.mem;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.tensorflow.data.api.TfRemoteData;
import com.bilibili.tensorflow.data.api.TfRemoteDataService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/VipOpenMembershipPredictTFClient$prepareModelAndPredict$remoteVipData$1.class */
final class VipOpenMembershipPredictTFClient$prepareModelAndPredict$remoteVipData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TfRemoteData>, Object> {
    final CompletableDeferred<String> $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipOpenMembershipPredictTFClient$prepareModelAndPredict$remoteVipData$1(CompletableDeferred<String> completableDeferred, Continuation<? super VipOpenMembershipPredictTFClient$prepareModelAndPredict$remoteVipData$1> continuation) {
        super(2, continuation);
        this.$result = completableDeferred;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipOpenMembershipPredictTFClient$prepareModelAndPredict$remoteVipData$1(this.$result, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TfRemoteData> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.tensorflow.data.api.a aVar = com.bilibili.tensorflow.data.api.a.f110716a;
            TfRemoteDataService tfRemoteDataService = com.bilibili.tensorflow.data.api.a.f110717b;
            long jMid = com.bilibili.ogv.infra.account.a.f67852b.mid();
            this.label = 1;
            Object tfVipInfo = tfRemoteDataService.getTfVipInfo(jMid, this);
            obj = tfVipInfo;
            if (tfVipInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CompletableDeferred<String> completableDeferred = this.$result;
        GeneralResponse generalResponse = (GeneralResponse) obj;
        if (generalResponse.isSuccess()) {
            return (TfRemoteData) generalResponse.data;
        }
        BLog.e("VipOpenMembershipPredictTFClient$prepareModelAndPredict$remoteVipData$1-invokeSuspend", "[tensorflow-VipOpenMembershipPredictTFClient$prepareModelAndPredict$remoteVipData$1-invokeSuspend] remoteVipData request error", (Throwable) null);
        completableDeferred.complete("00");
        return null;
    }
}
