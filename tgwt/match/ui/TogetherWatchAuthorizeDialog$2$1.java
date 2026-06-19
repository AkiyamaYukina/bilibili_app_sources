package com.bilibili.tgwt.match.ui;

import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/TogetherWatchAuthorizeDialog$2$1.class */
public final class TogetherWatchAuthorizeDialog$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final TogetherWatchAuthorizeDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchAuthorizeDialog$2$1(TogetherWatchAuthorizeDialog togetherWatchAuthorizeDialog, Continuation<? super TogetherWatchAuthorizeDialog$2$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchAuthorizeDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchAuthorizeDialog$2$1(this.this$0, continuation);
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
            ChatRoomOperationService chatRoomOperationService = this.this$0.f111476a;
            this.label = 1;
            Object objForbiddenTogetherWatchAuthorize = chatRoomOperationService.forbiddenTogetherWatchAuthorize(1, this);
            obj = objForbiddenTogetherWatchAuthorize;
            if (objForbiddenTogetherWatchAuthorize == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        TogetherWatchAuthorizeDialog togetherWatchAuthorizeDialog = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BiliApiException biliApiException = new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            BLog.e("TogetherWatchAuthorizeDialog$2$1-invokeSuspend", "[together-watch-TogetherWatchAuthorizeDialog$2$1-invokeSuspend] " + biliApiException.getMessage(), biliApiException);
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            Exception exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            com.bilibili.biligame.dialogdispatcher.e.a("[together-watch-TogetherWatchAuthorizeDialog$2$1-invokeSuspend] ", exception.getMessage(), "TogetherWatchAuthorizeDialog$2$1-invokeSuspend", exception);
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            togetherWatchAuthorizeDialog.dismiss();
        }
        return Unit.INSTANCE;
    }
}
