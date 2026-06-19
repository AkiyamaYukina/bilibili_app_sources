package com.bilibili.ogv.operation2.viptask;

import com.bilibili.api.BiliApiException;
import com.bilibili.ogv.operation2.viptask.b;
import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/viptask/BangumiTabVipPendantViewHelper$completeVipTask$2.class */
final class BangumiTabVipPendantViewHelper$completeVipTask$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $winId;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BangumiTabVipPendantViewHelper$completeVipTask$2(a aVar, String str, Continuation<? super BangumiTabVipPendantViewHelper$completeVipTask$2> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$winId = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BangumiTabVipPendantViewHelper$completeVipTask$2(this.this$0, this.$winId, continuation);
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
            b.f71025a.getClass();
            b bVar = b.a.f71027b;
            String str = Intrinsics.areEqual(this.this$0.f71013b, "bangumi-tab") ? "jp_channel" : "tv_channel";
            String str2 = this.$winId;
            this.label = 1;
            Object objCompleteTask = bVar.completeTask(str, null, null, null, null, str2, this);
            obj = objCompleteTask;
            if (objCompleteTask == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        a aVar = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            a.a(aVar, new BiliApiException(businessFailure.getCode(), businessFailure.getMessage()));
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            a.a(aVar, ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
