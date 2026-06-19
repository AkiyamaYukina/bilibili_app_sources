package com.bilibili.ship.theseus.united.page.toolbar;

import com.bilibili.playerbizcommonv2.widget.subtitle.C5892y;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createAiAudio$component$1$1.class */
final class MenuService$createAiAudio$component$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MenuService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuService$createAiAudio$component$1$1(MenuService menuService, Continuation<? super MenuService$createAiAudio$component$1$1> continuation) {
        super(2, continuation);
        this.this$0 = menuService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MenuService$createAiAudio$component$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MenuService menuService = this.this$0;
            com.bilibili.playerbizcommonv2.service.ai.a aVar = menuService.f103265x;
            this.label = 1;
            if (C5892y.c(aVar, menuService.f103244b, this) == coroutine_suspended) {
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
