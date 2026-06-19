package com.bilibili.tgwt.chatroom;

import com.bilibili.api.BiliApiException;
import com.bilibili.chatroom.widget.userDialog.ChatUserInfo;
import com.bilibili.chatroomsdk.RoomTriggerEvent;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomManagerService$handleFreyaEvent$6.class */
final class ChatRoomManagerService$handleFreyaEvent$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Long $chatRoomSettingId;
    final RoomTriggerEvent $roomTrigger;
    int label;
    final ChatRoomManagerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRoomManagerService$handleFreyaEvent$6(ChatRoomManagerService chatRoomManagerService, Long l7, RoomTriggerEvent roomTriggerEvent, Continuation<? super ChatRoomManagerService$handleFreyaEvent$6> continuation) {
        super(2, continuation);
        this.this$0 = chatRoomManagerService;
        this.$chatRoomSettingId = l7;
        this.$roomTrigger = roomTriggerEvent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatRoomManagerService$handleFreyaEvent$6(this.this$0, this.$chatRoomSettingId, this.$roomTrigger, continuation);
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
            long jLongValue = this.$chatRoomSettingId.longValue();
            long mid = this.$roomTrigger.getMid();
            this.label = 1;
            Object objRequestUserInfoWithLabel = chatRoomOperationService.requestUserInfoWithLabel(jLongValue, mid, this);
            obj = objRequestUserInfoWithLabel;
            if (objRequestUserInfoWithLabel == coroutine_suspended) {
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
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BiliApiException biliApiException = new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            BLog.e("ChatRoomManagerService$handleFreyaEvent$6-invokeSuspend", "[together-watch-ChatRoomManagerService$handleFreyaEvent$6-invokeSuspend] " + biliApiException.getMessage(), biliApiException);
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            Exception exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            com.bilibili.biligame.dialogdispatcher.e.a("[together-watch-ChatRoomManagerService$handleFreyaEvent$6-invokeSuspend] ", exception.getMessage(), "ChatRoomManagerService$handleFreyaEvent$6-invokeSuspend", exception);
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ChatUserInfo chatUserInfo = (ChatUserInfo) ((BiliApiResponse.Success) biliApiResponse).getData();
            chatRoomManagerService.f110913e.c.setValue(chatUserInfo.a());
            Job job = chatRoomManagerService.f110901O;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }
}
