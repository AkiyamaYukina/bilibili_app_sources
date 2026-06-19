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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/TogetherWatchMatchFragment$onMatchAndJoinClick$1.class */
final class TogetherWatchMatchFragment$onMatchAndJoinClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Long $epId;
    final Long $seasonId;
    int label;
    final TogetherWatchMatchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchMatchFragment$onMatchAndJoinClick$1(TogetherWatchMatchFragment togetherWatchMatchFragment, Long l7, Long l8, Continuation<? super TogetherWatchMatchFragment$onMatchAndJoinClick$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchMatchFragment;
        this.$seasonId = l7;
        this.$epId = l8;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchMatchFragment$onMatchAndJoinClick$1(this.this$0, this.$seasonId, this.$epId, continuation);
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
            Long l7 = this.$seasonId;
            Long l8 = this.$epId;
            TogetherWatchMatchFragment.Type type = togetherWatchMatchFragment.h;
            int i8 = type == TogetherWatchMatchFragment.Type.MATCH_FROM_SEARCH ? 0 : 1;
            int type2 = type.getType();
            int i9 = this.this$0.f111485j;
            int iVegaABTest = VegaManager.Companion.vegaABTest();
            String str = this.this$0.f111489n;
            this.label = 1;
            Object objMatchRoom = chatRoomOperationService.matchRoom(l7, l8, i8, type2, i9, iVegaABTest, str, this);
            obj = objMatchRoom;
            if (objMatchRoom == coroutine_suspended) {
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
        Yk0.a aVar = togetherWatchMatchFragment2.f111497v;
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
            togetherWatchMatchFragment2.f111480d = chatRoomState.d();
            togetherWatchMatchFragment2.f111481e = chatRoomState.j();
            togetherWatchMatchFragment2.f111482f = chatRoomState.c();
            togetherWatchMatchFragment2.f111483g = chatRoomState.i();
            if (chatRoomState.m() == 1) {
                ToastHelper.showToastShort(togetherWatchMatchFragment2.getContext(), "暂无可以加入的放映室，已为你创建新的放映室~");
            }
            togetherWatchMatchFragment2.jf(chatRoomState.f(), chatRoomState.h(), chatRoomState.b(), chatRoomState.e(), false);
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
