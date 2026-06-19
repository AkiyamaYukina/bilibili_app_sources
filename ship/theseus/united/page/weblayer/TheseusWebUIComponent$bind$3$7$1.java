package com.bilibili.ship.theseus.united.page.weblayer;

import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import dv0.K0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$7$1.class */
public final class TheseusWebUIComponent$bind$3$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final K0 $binding;
    int label;
    final TheseusWebUIComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusWebUIComponent$bind$3$7$1(TheseusWebUIComponent theseusWebUIComponent, K0 k02, Continuation<? super TheseusWebUIComponent$bind$3$7$1> continuation) {
        super(2, continuation);
        this.this$0 = theseusWebUIComponent;
        this.$binding = k02;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusWebUIComponent$bind$3$7$1(this.this$0, this.$binding, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<TheseusWebUIComponent.c> mutableStateFlow = this.this$0.f104196p;
            TheseusWebUIComponent.c.b bVar = TheseusWebUIComponent.c.b.f104224a;
            this.label = 1;
            if (mutableStateFlow.emit(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$binding.f116821o.loadUrl(this.this$0.f104182a);
        return Unit.INSTANCE;
    }
}
