package com.bilibili.playerbizcommonv2.widget.subtitle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiWidget$bindToView$2$controlContainerVisibleObserver$1$onControlContainerVisibleChanged$1.class */
public final class SubtitleAndAiWidget$bindToView$2$controlContainerVisibleObserver$1$onControlContainerVisibleChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final SubtitleAndAiWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubtitleAndAiWidget$bindToView$2$controlContainerVisibleObserver$1$onControlContainerVisibleChanged$1(SubtitleAndAiWidget subtitleAndAiWidget, Continuation<? super SubtitleAndAiWidget$bindToView$2$controlContainerVisibleObserver$1$onControlContainerVisibleChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = subtitleAndAiWidget;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubtitleAndAiWidget$bindToView$2$controlContainerVisibleObserver$1$onControlContainerVisibleChanged$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SubtitleAndAiWidget subtitleAndAiWidget = this.this$0;
            this.label = 1;
            if (SubtitleAndAiWidget.j0(subtitleAndAiWidget, this) == coroutine_suspended) {
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
