package com.bilibili.ship.theseus.ogv.chathall;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$event$1$activityPicClickAction$1.class */
final class ChatHallService$event$1$activityPicClickAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $url;
    int label;
    final ChatHallService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHallService$event$1$activityPicClickAction$1(String str, ChatHallService chatHallService, Continuation<? super ChatHallService$event$1$activityPicClickAction$1> continuation) {
        super(2, continuation);
        this.$url = str;
        this.this$0 = chatHallService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatHallService$event$1$activityPicClickAction$1(this.$url, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Uri uri = Uri.parse(this.$url);
            ChatHallService chatHallService = this.this$0;
            String str = this.$url;
            boolean zAreEqual = Intrinsics.areEqual(uri.getQueryParameter("openstyle"), "1");
            com.bilibili.ship.theseus.ogv.web.b bVar = chatHallService.f91710g;
            String strA = com.bilibili.ship.theseus.ogv.web.b.a(bVar, str, !zAreEqual, false, null, 12);
            this.label = 1;
            if (bVar.b(strA, false, this) == coroutine_suspended) {
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
