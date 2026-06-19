package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.response.BiliApiResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpRepository$requestRecommendUp$1.class */
public final class RecommendUpRepository$requestRecommendUp$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final RecommendUpRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendUpRepository$requestRecommendUp$1(RecommendUpRepository recommendUpRepository, Continuation<? super RecommendUpRepository$requestRecommendUp$1> continuation) {
        super(2, continuation);
        this.this$0 = recommendUpRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecommendUpRepository$requestRecommendUp$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        List<RecommendUp> listA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap map = new HashMap(2);
                map.put("vmid", String.valueOf(this.this$0.f97795b.f()));
                map.put("page_num", String.valueOf(this.this$0.f97796c));
                k kVar = (k) ServiceGenerator.createService(k.class);
                this.label = 1;
                Object objRecommendUp = kVar.recommendUp(map, this);
                obj = objRecommendUp;
                if (objRecommendUp == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
            RecommendUpRepository recommendUpRepository = this.this$0;
            if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
                BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
                BLog.e("RecommendUpRepository$requestRecommendUp$1-invokeSuspend", "[theseus-ugc-RecommendUpRepository$requestRecommendUp$1-invokeSuspend] " + ("onBusinessFailure, " + businessFailure.getCode() + " " + businessFailure.getMessage()), (Throwable) null);
                RecommendUpRepository.a(recommendUpRepository, null);
            } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
                BLog.e("RecommendUpRepository$requestRecommendUp$1-invokeSuspend", "[theseus-ugc-RecommendUpRepository$requestRecommendUp$1-invokeSuspend] " + ("onServiceUnavailable, " + ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException().getMessage()), (Throwable) null);
                RecommendUpRepository.a(recommendUpRepository, null);
            } else {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                RecommendUpData recommendUpData = (RecommendUpData) ((BiliApiResponse.Success) biliApiResponse).getData();
                BLog.i("RecommendUpRepository$requestRecommendUp$1-invokeSuspend", "[theseus-ugc-RecommendUpRepository$requestRecommendUp$1-invokeSuspend] " + ("onSuccess, " + ((recommendUpData == null || (listA = recommendUpData.a()) == null) ? null : Boxing.boxInt(listA.size()))));
                RecommendUpRepository.a(recommendUpRepository, recommendUpData);
            }
        } catch (Exception e7) {
            com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-ugc-RecommendUpRepository$requestRecommendUp$1-invokeSuspend] ", N4.a.a("onServiceUnavailable, ", e7), "RecommendUpRepository$requestRecommendUp$1-invokeSuspend", (Throwable) null);
            RecommendUpRepository.a(this.this$0, null);
        }
        return Unit.INSTANCE;
    }
}
