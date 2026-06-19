package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.playerbizcommonv2.widget.quality.QualityHdrInfoComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/QualityHdrInfoFunctionWidget$updateWidget$1.class */
final class QualityHdrInfoFunctionWidget$updateWidget$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final C6438l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualityHdrInfoFunctionWidget$updateWidget$1(C6438l c6438l, Continuation<? super QualityHdrInfoFunctionWidget$updateWidget$1> continuation) {
        super(2, continuation);
        this.this$0 = c6438l;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QualityHdrInfoFunctionWidget$updateWidget$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            C6438l c6438l = this.this$0;
            QualityHdrInfoComponent qualityHdrInfoComponent = c6438l.f103897g;
            UIComponent.b<ComposeView> bVar = c6438l.h;
            this.label = 1;
            if (qualityHdrInfoComponent.bindToView(bVar, this) == coroutine_suspended) {
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
