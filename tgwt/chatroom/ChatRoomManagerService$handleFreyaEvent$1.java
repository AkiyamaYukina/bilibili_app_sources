package com.bilibili.tgwt.chatroom;

import com.bilibili.api.BiliApiException;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.chatroomsdk.RoomMemberChangeEvent;
import com.bilibili.okretro.response.BiliApiResponse;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomManagerService$handleFreyaEvent$1.class */
final class ChatRoomManagerService$handleFreyaEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final RoomMemberChangeEvent $event;
    int label;
    final ChatRoomManagerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRoomManagerService$handleFreyaEvent$1(ChatRoomManagerService chatRoomManagerService, RoomMemberChangeEvent roomMemberChangeEvent, Continuation<? super ChatRoomManagerService$handleFreyaEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = chatRoomManagerService;
        this.$event = roomMemberChangeEvent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatRoomManagerService$handleFreyaEvent$1(this.this$0, this.$event, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object next;
        String str;
        c cVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatRoomManagerService chatRoomManagerService = this.this$0;
            long roomId = this.$event.getRoomId();
            this.label = 1;
            Object objM = chatRoomManagerService.m(roomId, this, false);
            obj = objM;
            if (objM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        ChatRoomManagerService chatRoomManagerService2 = this.this$0;
        RoomMemberChangeEvent roomMemberChangeEvent = this.$event;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            if (new BiliApiException(businessFailure.getCode(), businessFailure.getMessage()).mCode == 6006039) {
                String contentStr = roomMemberChangeEvent.getMessage().getContentStr();
                String contentStr2 = contentStr != null ? contentStr.length() == 0 ? "你已被移出放映室" : roomMemberChangeEvent.getMessage().getContentStr() : "你已被移出放映室";
                c cVar2 = (c) chatRoomManagerService2.f110924q.getValue();
                if (contentStr2 == null) {
                    str = "";
                    cVar = cVar2;
                } else {
                    str = contentStr2;
                    cVar = cVar2;
                }
                chatRoomManagerService2.f110924q.setValue(c.a(cVar, 0L, 0, 0L, str, true, null, 0, null, null, null, 2, 2023));
            }
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            BiliApiException exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            if ((exception instanceof BiliApiException) && exception.mCode == 6006039) {
                String contentStr3 = roomMemberChangeEvent.getMessage().getContentStr();
                String contentStr4 = contentStr3 != null ? contentStr3.length() == 0 ? "你已被移出放映室" : roomMemberChangeEvent.getMessage().getContentStr() : "你已被移出放映室";
                c cVar3 = (c) chatRoomManagerService2.f110924q.getValue();
                if (contentStr4 == null) {
                    str = "";
                    cVar = cVar3;
                } else {
                    str = contentStr4;
                    cVar = cVar3;
                }
                chatRoomManagerService2.f110924q.setValue(c.a(cVar, 0L, 0, 0L, str, true, null, 0, null, null, null, 2, 2023));
            }
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ChatRoomFullInfo chatRoomFullInfo = (ChatRoomFullInfo) ((BiliApiResponse.Success) biliApiResponse).getData();
            chatRoomManagerService2.f110925r.setValue(chatRoomFullInfo.i());
            Iterator<T> it = chatRoomFullInfo.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ChatRoomMember) next).getMid() == chatRoomManagerService2.f110915g.mid()) {
                    break;
                }
            }
            if (next == null) {
                String contentStr5 = roomMemberChangeEvent.getMessage().getContentStr();
                String contentStr6 = contentStr5 != null ? contentStr5.length() == 0 ? "你已被移出放映室" : roomMemberChangeEvent.getMessage().getContentStr() : "你已被移出放映室";
                MutableStateFlow<c> mutableStateFlow = chatRoomManagerService2.f110924q;
                mutableStateFlow.setValue(c.a((c) mutableStateFlow.getValue(), 0L, 0, 0L, contentStr6 == null ? "" : contentStr6, true, null, 0, null, null, null, 2, 2023));
            }
        }
        return Unit.INSTANCE;
    }
}
