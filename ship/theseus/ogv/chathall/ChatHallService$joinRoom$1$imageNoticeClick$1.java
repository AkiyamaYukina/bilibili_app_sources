package com.bilibili.ship.theseus.ogv.chathall;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$joinRoom$1$imageNoticeClick$1.class */
final class ChatHallService$joinRoom$1$imageNoticeClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $adjustedUrl;
    int label;
    final ChatHallService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHallService$joinRoom$1$imageNoticeClick$1(ChatHallService chatHallService, String str, Continuation<? super ChatHallService$joinRoom$1$imageNoticeClick$1> continuation) {
        super(2, continuation);
        this.this$0 = chatHallService;
        this.$adjustedUrl = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatHallService$joinRoom$1$imageNoticeClick$1(this.this$0, this.$adjustedUrl, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.ogv.web.b bVar = this.this$0.f91710g;
            String str = this.$adjustedUrl;
            this.label = 1;
            if (bVar.b(str, false, this) == coroutine_suspended) {
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
