package com.bilibili.tgwt.player.processor;

import com.bilibili.tgwt.chatroom.ChatRoomState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchPlayProcessor$changeToGuest$1.class */
final class TogetherWatchPlayProcessor$changeToGuest$1 extends SuspendLambda implements Function2<ChatRoomState, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final TogetherWatchPlayProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchPlayProcessor$changeToGuest$1(TogetherWatchPlayProcessor togetherWatchPlayProcessor, Continuation<? super TogetherWatchPlayProcessor$changeToGuest$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchPlayProcessor;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TogetherWatchPlayProcessor$changeToGuest$1 togetherWatchPlayProcessor$changeToGuest$1 = new TogetherWatchPlayProcessor$changeToGuest$1(this.this$0, continuation);
        togetherWatchPlayProcessor$changeToGuest$1.L$0 = obj;
        return togetherWatchPlayProcessor$changeToGuest$1;
    }

    public final Object invoke(ChatRoomState chatRoomState, Continuation<? super Unit> continuation) {
        return create(chatRoomState, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ChatRoomState chatRoomState = (ChatRoomState) this.L$0;
        BLog.i("TogetherWatchPlayProcessor$changeToGuest$1-invokeSuspend", "[together-watch-TogetherWatchPlayProcessor$changeToGuest$1-invokeSuspend] 收到房主播放改变");
        TogetherWatchPlayProcessor togetherWatchPlayProcessor = this.this$0;
        int i7 = TogetherWatchPlayProcessor.f111589M;
        togetherWatchPlayProcessor.b(chatRoomState, false);
        return Unit.INSTANCE;
    }
}
