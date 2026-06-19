package com.bilibili.ship.theseus.united.page.toolbar.actionview.projection;

import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/ToolbarCastScreenRepository$showBubble$1.class */
final class ToolbarCastScreenRepository$showBubble$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ToolbarCastScreenRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarCastScreenRepository$showBubble$1(ToolbarCastScreenRepository toolbarCastScreenRepository, Continuation<? super ToolbarCastScreenRepository$showBubble$1> continuation) {
        super(2, continuation);
        this.this$0 = toolbarCastScreenRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ToolbarCastScreenRepository$showBubble$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ToolbarRepository toolbarRepository = this.this$0.f103347g;
            this.label = 1;
            if (toolbarRepository.i(this) == coroutine_suspended) {
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
