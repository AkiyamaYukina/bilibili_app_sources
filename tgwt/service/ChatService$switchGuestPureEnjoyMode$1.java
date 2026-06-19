package com.bilibili.tgwt.service;

import HD0.B;
import HD0.x;
import HD0.y;
import com.bilibili.api.BiliApiException;
import com.bilibili.chatroomsdk.ChatMsg;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.chatroom.ChatGuestPureEnjoyMsgInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$switchGuestPureEnjoyMode$1.class */
public final class ChatService$switchGuestPureEnjoyMode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ChatService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatService$switchGuestPureEnjoyMode$1(ChatService chatService, Continuation<? super ChatService$switchGuestPureEnjoyMode$1> continuation) {
        super(2, continuation);
        this.this$0 = chatService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatService$switchGuestPureEnjoyMode$1(this.this$0, continuation);
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
            ChatService chatService = this.this$0;
            ChatRoomOperationService chatRoomOperationService = chatService.f111869R;
            Long roomId = chatService.f111886e.getImmutable().getRoomId();
            long jLongValue = roomId != null ? roomId.longValue() : 0L;
            long latestMsgSeqId = this.this$0.f111886e.getImmutable().getLatestMsgSeqId();
            this.label = 1;
            Object guestPureEnjoyMsg = chatRoomOperationService.getGuestPureEnjoyMsg(jLongValue, latestMsgSeqId, true, 300, this);
            obj = guestPureEnjoyMsg;
            if (guestPureEnjoyMsg == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        ChatService chatService2 = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BLog.e("ChatService$switchGuestPureEnjoyMode$1-invokeSuspend", "[together-watch-ChatService$switchGuestPureEnjoyMode$1-invokeSuspend] get guest pure enjoyment msg error", new BiliApiException(businessFailure.getCode(), businessFailure.getMessage()));
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            BLog.e("ChatService$switchGuestPureEnjoyMode$1-invokeSuspend", "[together-watch-ChatService$switchGuestPureEnjoyMode$1-invokeSuspend] get guest pure enjoyment msg error", ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ChatGuestPureEnjoyMsgInfo chatGuestPureEnjoyMsgInfo = (ChatGuestPureEnjoyMsgInfo) ((BiliApiResponse.Success) biliApiResponse).getData();
            chatService2.f111881b0 = true;
            ArrayList arrayList = new ArrayList();
            x xVar = chatService2.f111861J;
            arrayList.addAll(xVar.f8332g);
            xVar.f8332g.clear();
            Iterator<T> it = chatGuestPureEnjoyMsgInfo.f110871c.iterator();
            while (it.hasNext()) {
                xVar.n(chatService2.f111878a, (ChatMsg) it.next(), true);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                y.a(xVar.f8332g, (B) it2.next(), false);
            }
            chatService2.f111885d0.tryEmit(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
