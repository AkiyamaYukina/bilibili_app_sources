package com.bilibili.ogv.review;

import com.bilibili.api.BiliApiException;
import com.bilibili.droid.ToastHelper;
import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zl0.C9205d;
import zl0.InterfaceC9202a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/ReviewWebViewActivity$clickMenuDelete$1$1.class */
final class ReviewWebViewActivity$clickMenuDelete$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ReviewWebViewActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewWebViewActivity$clickMenuDelete$1$1(ReviewWebViewActivity reviewWebViewActivity, Continuation<? super ReviewWebViewActivity$clickMenuDelete$1$1> continuation) {
        super(2, continuation);
        this.this$0 = reviewWebViewActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReviewWebViewActivity$clickMenuDelete$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        String message;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC9202a interfaceC9202a = C9205d.f130330a;
            ReviewWebViewActivity reviewWebViewActivity = this.this$0;
            long j7 = reviewWebViewActivity.f72193O;
            long j8 = reviewWebViewActivity.f72194P;
            this.label = 1;
            Object objDeleteLong = C9205d.f130330a.deleteLong(j7, j8, this);
            obj = objDeleteLong;
            if (objDeleteLong == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        ReviewWebViewActivity reviewWebViewActivity2 = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BiliApiException biliApiException = new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            if (!Cl0.a.a(reviewWebViewActivity2, biliApiException)) {
                String message2 = biliApiException.getMessage();
                if (message2 != null && message2.length() != 0) {
                    message = biliApiException.getMessage();
                    ToastHelper.showToastShort(reviewWebViewActivity2, message);
                }
                ToastHelper.showToastShort(reviewWebViewActivity2, 2131857123);
            }
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            Exception exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            if (!Cl0.a.a(reviewWebViewActivity2, exception)) {
                String message3 = exception.getMessage();
                if (message3 != null && message3.length() != 0) {
                    message = exception.getMessage();
                    ToastHelper.showToastShort(reviewWebViewActivity2, message);
                }
                ToastHelper.showToastShort(reviewWebViewActivity2, 2131857123);
            }
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ToastHelper.showToastShort(reviewWebViewActivity2, 2131857129);
            reviewWebViewActivity2.setResult(-1);
            reviewWebViewActivity2.finish();
        }
        return Unit.INSTANCE;
    }
}
