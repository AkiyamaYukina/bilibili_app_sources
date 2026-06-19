package com.bilibili.playerbizcommonv2.api;

import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.playerbizcommonv2.api.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;
import vk.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/VipTrialApiServiceKt$requestDecrementTrialTimes$1.class */
public final class VipTrialApiServiceKt$requestDecrementTrialTimes$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Long $avid;
    final vk.e $trialInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipTrialApiServiceKt$requestDecrementTrialTimes$1(vk.e eVar, Long l7, Continuation<? super VipTrialApiServiceKt$requestDecrementTrialTimes$1> continuation) {
        super(2, continuation);
        this.$trialInfo = eVar;
        this.$avid = l7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipTrialApiServiceKt$requestDecrementTrialTimes$1(this.$trialInfo, this.$avid, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            e.a aVar = e.f80822a;
            int i8 = this.$trialInfo.i;
            boolean zA = f.a(i8, 2);
            String str = this.$trialInfo.j;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            Long l7 = this.$avid;
            String strValueOf = "";
            if (l7 != null) {
                strValueOf = String.valueOf(l7.longValue());
                if (strValueOf == null) {
                    strValueOf = "";
                }
            }
            this.label = 1;
            Object objA = aVar.a((zA ? 1 : 0) + i8, str2, strValueOf, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        vk.e eVar = this.$trialInfo;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BLog.e("VipTrialApiService", "modify trial times failed!!", new BiliApiException(businessFailure.getCode(), businessFailure.getMessage()));
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            BLog.e("VipTrialApiService", "modify trial times failed!!", ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            TrialBenefit trialBenefit = (TrialBenefit) ((BiliApiResponse.Success) biliApiResponse).getData();
            if (!f.a(eVar.i, 2)) {
                eVar.b = Math.min(eVar.b, trialBenefit.a());
            }
            com.bilibili.bplus.im.protobuf.a.b(eVar.b, trialBenefit.a(), "trial success remain time:", " service-time:", "VipTrialApiService");
        }
        return Unit.INSTANCE;
    }
}
