package com.bilibili.tgwt.player;

import androidx.activity.OnBackPressedDispatcher;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/PlayerContainerModule$providePlayerContainer$1.class */
final class PlayerContainerModule$providePlayerContainer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final OnBackPressedDispatcher $onBackPressedDispatcher;
    final PlayerContainer $playerContainer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerContainerModule$providePlayerContainer$1(PlayerContainer playerContainer, OnBackPressedDispatcher onBackPressedDispatcher, Continuation<? super PlayerContainerModule$providePlayerContainer$1> continuation) {
        super(2, continuation);
        this.$playerContainer = playerContainer;
        this.$onBackPressedDispatcher = onBackPressedDispatcher;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayerContainerModule$providePlayerContainer$1(this.$playerContainer, this.$onBackPressedDispatcher, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AbsFunctionWidgetService functionWidgetService = this.$playerContainer.getFunctionWidgetService();
            OnBackPressedDispatcher onBackPressedDispatcher = this.$onBackPressedDispatcher;
            this.label = 1;
            if (tv.danmaku.biliplayerv2.service.b.a(functionWidgetService, onBackPressedDispatcher, this) == coroutine_suspended) {
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
