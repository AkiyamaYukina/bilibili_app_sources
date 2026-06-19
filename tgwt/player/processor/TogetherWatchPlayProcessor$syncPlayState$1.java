package com.bilibili.tgwt.player.processor;

import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchPlayProcessor$syncPlayState$1.class */
public final class TogetherWatchPlayProcessor$syncPlayState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final TogetherWatchPlayProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchPlayProcessor$syncPlayState$1(TogetherWatchPlayProcessor togetherWatchPlayProcessor, Continuation<? super TogetherWatchPlayProcessor$syncPlayState$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchPlayProcessor;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchPlayProcessor$syncPlayState$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ChatRoomInfo chatRoomInfo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BangumiUniformSeason season = this.this$0.f111604d.getSeason();
            if (season != null && (chatRoomInfo = season.E) != null) {
                ChatRoomManagerService chatRoomManagerService = this.this$0.f111603c;
                long jT = chatRoomInfo.t();
                this.L$0 = chatRoomInfo;
                this.label = 1;
                if (chatRoomManagerService.m(jT, this, false) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
