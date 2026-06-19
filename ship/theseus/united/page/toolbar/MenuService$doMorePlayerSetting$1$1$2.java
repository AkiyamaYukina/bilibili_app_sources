package com.bilibili.ship.theseus.united.page.toolbar;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$doMorePlayerSetting$1$1$2.class */
public final class MenuService$doMorePlayerSetting$1$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final MenuService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuService$doMorePlayerSetting$1$1$2(MenuService menuService, Continuation<? super MenuService$doMorePlayerSetting$1$1$2> continuation) {
        super(1, continuation);
        this.this$0 = menuService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MenuService$doMorePlayerSetting$1$1$2(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            if (CoroutineScopeKt.isActive(this.this$0.f103243a)) {
                j jVar = this.this$0.f103249g;
                jVar.getClass();
                jVar.f103405j.tryEmit(Long.valueOf(System.currentTimeMillis()));
            }
            throw th;
        }
    }
}
