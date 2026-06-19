package com.bilibili.tgwt.chatroom;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomManagerService$runHeart$1.class */
public final class ChatRoomManagerService$runHeart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ChatRoomManagerService this$0;

    /* JADX INFO: renamed from: com.bilibili.tgwt.chatroom.ChatRoomManagerService$runHeart$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomManagerService$runHeart$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        int label;
        final ChatRoomManagerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChatRoomManagerService chatRoomManagerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatRoomManagerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(int i7, Continuation<? super Unit> continuation) {
            return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 424
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.chatroom.ChatRoomManagerService$runHeart$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRoomManagerService$runHeart$1(ChatRoomManagerService chatRoomManagerService, Continuation<? super ChatRoomManagerService$runHeart$1> continuation) {
        super(2, continuation);
        this.this$0 = chatRoomManagerService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatRoomManagerService$runHeart$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowOnEach = FlowKt.onEach(FlowKt.asFlow(new IntRange(1, Integer.MAX_VALUE)), new AnonymousClass1(this.this$0, null));
            this.label = 1;
            if (FlowKt.collect(flowOnEach, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
