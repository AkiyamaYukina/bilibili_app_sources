package com.bilibili.tgwt.chatroom;

import androidx.compose.runtime.snapshots.z;
import com.bilibili.api.BiliApiException;
import com.bilibili.chatroomsdk.ChatMsgList;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/MsgRetrieval$updateLatestSeqId$1.class */
final class MsgRetrieval$updateLatestSeqId$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgRetrieval$updateLatestSeqId$1(h hVar, Continuation<? super MsgRetrieval$updateLatestSeqId$1> continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MsgRetrieval$updateLatestSeqId$1(this.this$0, continuation);
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
            h hVar = this.this$0;
            ChatRoomOperationService chatRoomOperationService = hVar.f110989c;
            this.label = 1;
            Object objRetrieveMsgs = chatRoomOperationService.retrieveMsgs(hVar.f110987a, Long.MAX_VALUE, Long.MAX_VALUE, this);
            obj = objRetrieveMsgs;
            if (objRetrieveMsgs == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        h hVar2 = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BLog.e("MsgRetrieval$updateLatestSeqId$1-invokeSuspend", "[together-watch-MsgRetrieval$updateLatestSeqId$1-invokeSuspend] updateLatestSeqId onError", new BiliApiException(businessFailure.getCode(), businessFailure.getMessage()));
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            BLog.e("MsgRetrieval$updateLatestSeqId$1-invokeSuspend", "[together-watch-MsgRetrieval$updateLatestSeqId$1-invokeSuspend] updateLatestSeqId onError", ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ChatMsgList chatMsgList = (ChatMsgList) ((BiliApiResponse.Success) biliApiResponse).getData();
            long j7 = hVar2.f110987a;
            long latestSeqId = chatMsgList.getLatestSeqId();
            StringBuilder sbA = z.a(j7, "updateLatestSeqId onSuccess, roomId = ", ", latestSeqId = ");
            sbA.append(latestSeqId);
            BLog.i("MsgRetrieval$updateLatestSeqId$1-invokeSuspend", "[together-watch-MsgRetrieval$updateLatestSeqId$1-invokeSuspend] " + sbA.toString());
            hVar2.b(chatMsgList.getLatestSeqId(), hVar2.f110987a);
        }
        return Unit.INSTANCE;
    }
}
