package com.bilibili.tgwt.match.ui;

import com.bilibili.api.BiliApiException;
import com.bilibili.droid.ToastHelper;
import com.bilibili.ogvvega.tunnel.VegaManager;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.chatroom.ChatRoomState;
import com.bilibili.tgwt.match.ui.TogetherWatchMatchFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/TogetherWatchMatchFragment$onFromShareAndJoinClick$1.class */
final class TogetherWatchMatchFragment$onFromShareAndJoinClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final TogetherWatchMatchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchMatchFragment$onFromShareAndJoinClick$1(TogetherWatchMatchFragment togetherWatchMatchFragment, Continuation<? super TogetherWatchMatchFragment$onFromShareAndJoinClick$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchMatchFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchMatchFragment$onFromShareAndJoinClick$1(this.this$0, continuation);
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
            TogetherWatchMatchFragment togetherWatchMatchFragment = this.this$0;
            ChatRoomOperationService chatRoomOperationService = togetherWatchMatchFragment.f111479c;
            long j7 = togetherWatchMatchFragment.f111480d;
            int iVegaABTest = VegaManager.Companion.vegaABTest();
            TogetherWatchMatchFragment togetherWatchMatchFragment2 = this.this$0;
            long j8 = togetherWatchMatchFragment2.f111484i;
            TogetherWatchMatchFragment.Type type = togetherWatchMatchFragment2.h;
            int i8 = type == TogetherWatchMatchFragment.Type.MATCH_FROM_MERGE ? 1 : 0;
            int type2 = type.getType();
            TogetherWatchMatchFragment togetherWatchMatchFragment3 = this.this$0;
            long j9 = togetherWatchMatchFragment3.f111481e;
            String str = togetherWatchMatchFragment3.f111489n;
            long j10 = togetherWatchMatchFragment3.f111482f;
            this.label = 1;
            Object objJoinRoom = chatRoomOperationService.joinRoom(j7, iVegaABTest, j8, i8, type2, j9, j10, str, this);
            obj = objJoinRoom;
            if (objJoinRoom == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        TogetherWatchMatchFragment togetherWatchMatchFragment4 = this.this$0;
        Yk0.a aVar = togetherWatchMatchFragment4.f111497v;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            aVar.invoke(new BiliApiException(businessFailure.getCode(), businessFailure.getMessage()));
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            aVar.invoke(((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ChatRoomState chatRoomState = (ChatRoomState) ((BiliApiResponse.Success) biliApiResponse).getData();
            togetherWatchMatchFragment4.f111480d = chatRoomState.d();
            togetherWatchMatchFragment4.f111481e = chatRoomState.j();
            togetherWatchMatchFragment4.f111482f = chatRoomState.c();
            togetherWatchMatchFragment4.f111483g = chatRoomState.i();
            if (chatRoomState.m() == 1) {
                ToastHelper.showToastShort(togetherWatchMatchFragment4.getContext(), chatRoomState.l());
            }
            togetherWatchMatchFragment4.jf(chatRoomState.f(), chatRoomState.h(), chatRoomState.b(), chatRoomState.e(), false);
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
