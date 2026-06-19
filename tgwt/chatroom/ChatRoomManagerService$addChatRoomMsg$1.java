package com.bilibili.tgwt.chatroom;

import com.bilibili.chatroomsdk.ChatMsg;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomManagerService$addChatRoomMsg$1.class */
public final class ChatRoomManagerService$addChatRoomMsg$1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final long $delay;
    final ChatMsg $msg;
    int label;
    final ChatRoomManagerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRoomManagerService$addChatRoomMsg$1(long j7, ChatRoomManagerService chatRoomManagerService, ChatMsg chatMsg, Continuation<? super ChatRoomManagerService$addChatRoomMsg$1> continuation) {
        super(2, continuation);
        this.$delay = j7;
        this.this$0 = chatRoomManagerService;
        this.$msg = chatMsg;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatRoomManagerService$addChatRoomMsg$1(this.$delay, this.this$0, this.$msg, continuation);
    }

    public final Object invoke(int i7, Continuation<? super Unit> continuation) {
        return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(this.$delay, DurationUnit.SECONDS);
            this.label = 1;
            if (DelayKt.delay-VtjQ1oo(duration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.c(this.$msg);
        return Unit.INSTANCE;
    }
}
