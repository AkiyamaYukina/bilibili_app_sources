package com.bilibili.tgwt.chatroom;

import com.bilibili.api.BiliApiException;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.chatroomsdk.ChatMsg;
import com.bilibili.chatroomsdk.ChatMsgList;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomManagerService$chatRoomListener$1$onJoin$2.class */
public final class ChatRoomManagerService$chatRoomListener$1$onJoin$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ChatRoomInfo $connectRoomInfo;
    final List<ChatMsg> $tipMsgs;
    int label;
    final ChatRoomManagerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRoomManagerService$chatRoomListener$1$onJoin$2(ChatRoomManagerService chatRoomManagerService, ChatRoomInfo chatRoomInfo, List<ChatMsg> list, Continuation<? super ChatRoomManagerService$chatRoomListener$1$onJoin$2> continuation) {
        super(2, continuation);
        this.this$0 = chatRoomManagerService;
        this.$connectRoomInfo = chatRoomInfo;
        this.$tipMsgs = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatRoomManagerService$chatRoomListener$1$onJoin$2(this.this$0, this.$connectRoomInfo, this.$tipMsgs, continuation);
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
            ChatRoomOperationService chatRoomOperationService = this.this$0.f110920m;
            long jT = this.$connectRoomInfo.t();
            long msgSeqId = this.this$0.f110909a.getImmutable().getMsgSeqId();
            this.label = 1;
            Object objRetrieveImMsgs = chatRoomOperationService.retrieveImMsgs(jT, msgSeqId, this);
            obj = objRetrieveImMsgs;
            if (objRetrieveImMsgs == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        ChatRoomManagerService chatRoomManagerService = this.this$0;
        ChatRoomInfo chatRoomInfo = this.$connectRoomInfo;
        List<ChatMsg> list = this.$tipMsgs;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            chatRoomManagerService.f110902P = false;
            List mutableList = CollectionsKt.toMutableList(list);
            mutableList.addAll(chatRoomManagerService.f110903Q);
            Iterator it = mutableList.iterator();
            while (it.hasNext()) {
                chatRoomManagerService.c((ChatMsg) it.next());
            }
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChatMsgList chatMsgList = (ChatMsgList) ((BiliApiResponse.Success) biliApiResponse).getData();
                chatRoomManagerService.f110902P = false;
                ArrayList arrayList = new ArrayList();
                if (chatRoomInfo.u() == 1) {
                    Boxing.boxBoolean(arrayList.addAll(list));
                } else {
                    arrayList.addAll(list);
                    List msgList = chatMsgList.getMsgList();
                    if (msgList != null) {
                        Boxing.boxBoolean(arrayList.addAll(msgList));
                    }
                }
                arrayList.addAll(chatRoomManagerService.f110903Q);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    chatRoomManagerService.c((ChatMsg) it2.next());
                }
                chatRoomManagerService.b(chatRoomInfo.g(), chatRoomInfo.h());
                return Unit.INSTANCE;
            }
            ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            chatRoomManagerService.f110902P = false;
            List mutableList2 = CollectionsKt.toMutableList(list);
            mutableList2.addAll(chatRoomManagerService.f110903Q);
            Iterator it3 = mutableList2.iterator();
            while (it3.hasNext()) {
                chatRoomManagerService.c((ChatMsg) it3.next());
            }
        }
        chatRoomManagerService.b(chatRoomInfo.g(), chatRoomInfo.h());
        return Unit.INSTANCE;
    }
}
