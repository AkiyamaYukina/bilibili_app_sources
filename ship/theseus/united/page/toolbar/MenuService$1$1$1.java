package com.bilibili.ship.theseus.united.page.toolbar;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$1$1$1.class */
public final class MenuService$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MenuService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuService$1$1$1(MenuService menuService, Continuation<? super MenuService$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = menuService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MenuService$1$1$1(this.this$0, continuation);
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
            this.label = 1;
            menuService.getClass();
            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new MenuService$showNewMenu$2(menuService, null), this);
            if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCoroutineScope = Unit.INSTANCE;
            }
            if (objCoroutineScope == coroutine_suspended) {
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
