package com.bilibili.tgwt.match.ui;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.chatroom.ChatRoomState;
import com.bilibili.tgwt.chatroom.FateMatchVo;
import com.bilibili.tgwt.match.ui.TogetherWatchMatchFragment;
import kotlin.NoWhenBranchMatchedException;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/TogetherWatchMatchFragment$onPollingFateResult$1.class */
final class TogetherWatchMatchFragment$onPollingFateResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FateMatchVo $fateMatchVo;
    int label;
    final TogetherWatchMatchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchMatchFragment$onPollingFateResult$1(TogetherWatchMatchFragment togetherWatchMatchFragment, FateMatchVo fateMatchVo, Continuation<? super TogetherWatchMatchFragment$onPollingFateResult$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchMatchFragment;
        this.$fateMatchVo = fateMatchVo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchMatchFragment$onPollingFateResult$1(this.this$0, this.$fateMatchVo, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x00b9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x013b. Please report as an issue. */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        LifecycleCoroutineScope lifecycleScope;
        TogetherWatchMatchFragment$onPollingFateResult$1$2$1 togetherWatchMatchFragment$onPollingFateResult$1$2$1;
        TogetherWatchMatchFragment.ErrorType errorType;
        TogetherWatchMatchFragment.ErrorType errorType2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (System.currentTimeMillis() - this.this$0.f111491p > this.$fateMatchVo.c() * ((long) 1000)) {
                TogetherWatchMatchFragment togetherWatchMatchFragment = this.this$0;
                togetherWatchMatchFragment.f111493r = TogetherWatchMatchFragment.ErrorType.ERROR_FATE_MATCH_TIME;
                togetherWatchMatchFragment.lf();
                return Unit.INSTANCE;
            }
            ChatRoomOperationService chatRoomOperationService = this.this$0.f111479c;
            String strB = this.$fateMatchVo.b();
            this.label = 1;
            Object fateMatchResult = chatRoomOperationService.getFateMatchResult(strB, this);
            obj = fateMatchResult;
            if (fateMatchResult == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        TogetherWatchMatchFragment togetherWatchMatchFragment2 = this.this$0;
        FateMatchVo fateMatchVo = this.$fateMatchVo;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            switch (new BiliApiException(businessFailure.getCode(), businessFailure.getMessage()).mCode) {
                case 6006051:
                    lifecycleScope = LifecycleOwnerKt.getLifecycleScope(togetherWatchMatchFragment2);
                    togetherWatchMatchFragment$onPollingFateResult$1$2$1 = new TogetherWatchMatchFragment$onPollingFateResult$1$2$1(fateMatchVo, togetherWatchMatchFragment2, null);
                    togetherWatchMatchFragment2.f111495t = BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, togetherWatchMatchFragment$onPollingFateResult$1$2$1, 3, (Object) null);
                    break;
                case 6006052:
                    errorType = TogetherWatchMatchFragment.ErrorType.ERROR_FATE_MATCH_TIME;
                    togetherWatchMatchFragment2.f111493r = errorType;
                    togetherWatchMatchFragment2.lf();
                    break;
                default:
                    errorType2 = TogetherWatchMatchFragment.ErrorType.ERROR_FATE_MATCH_SERVER;
                    togetherWatchMatchFragment2.f111493r = errorType2;
                    togetherWatchMatchFragment2.lf();
                    break;
            }
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            BiliApiException exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            if (exception instanceof BiliApiException) {
                switch (exception.mCode) {
                    case 6006051:
                        lifecycleScope = LifecycleOwnerKt.getLifecycleScope(togetherWatchMatchFragment2);
                        togetherWatchMatchFragment$onPollingFateResult$1$2$1 = new TogetherWatchMatchFragment$onPollingFateResult$1$2$1(fateMatchVo, togetherWatchMatchFragment2, null);
                        togetherWatchMatchFragment2.f111495t = BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, togetherWatchMatchFragment$onPollingFateResult$1$2$1, 3, (Object) null);
                        break;
                    case 6006052:
                        errorType = TogetherWatchMatchFragment.ErrorType.ERROR_FATE_MATCH_TIME;
                        togetherWatchMatchFragment2.f111493r = errorType;
                        togetherWatchMatchFragment2.lf();
                        break;
                    default:
                        errorType2 = TogetherWatchMatchFragment.ErrorType.ERROR_FATE_MATCH_SERVER;
                        togetherWatchMatchFragment2.f111493r = errorType2;
                        togetherWatchMatchFragment2.lf();
                        break;
                }
            } else {
                togetherWatchMatchFragment2.f111493r = TogetherWatchMatchFragment.ErrorType.ERROR_FATE_MATCH_SERVER;
                togetherWatchMatchFragment2.lf();
            }
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ChatRoomState chatRoomState = (ChatRoomState) ((BiliApiResponse.Success) biliApiResponse).getData();
            togetherWatchMatchFragment2.f111481e = chatRoomState.j();
            togetherWatchMatchFragment2.f111482f = chatRoomState.c();
            togetherWatchMatchFragment2.f111480d = chatRoomState.d();
            togetherWatchMatchFragment2.jf(chatRoomState.f(), chatRoomState.h(), chatRoomState.b(), chatRoomState.e(), true);
        }
        return Unit.INSTANCE;
    }
}
