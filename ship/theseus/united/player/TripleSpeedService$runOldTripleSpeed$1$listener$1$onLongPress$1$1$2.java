package com.bilibili.ship.theseus.united.player;

import com.bilibili.playerbizcommonv2.widget.speed.l;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IFunctionWidgetServiceKt;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1$1$2.class */
public final class TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final IFunctionContainer.LayoutParams $layoutParams;
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1$1$2(e eVar, IFunctionContainer.LayoutParams layoutParams, Continuation<? super TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1$1$2> continuation) {
        super(1, continuation);
        this.this$0 = eVar;
        this.$layoutParams = layoutParams;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1$1$2(this.this$0, this.$layoutParams, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            e eVar = this.this$0;
            AbsFunctionWidgetService absFunctionWidgetService = eVar.f104449a;
            l lVar = new l(eVar.f104453e);
            IFunctionContainer.LayoutParams layoutParams = this.$layoutParams;
            this.label = 1;
            if (IFunctionWidgetServiceKt.retainFunctionWidget$default(absFunctionWidgetService, lVar, layoutParams, (Function1) null, this, 4, (Object) null) == coroutine_suspended) {
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
