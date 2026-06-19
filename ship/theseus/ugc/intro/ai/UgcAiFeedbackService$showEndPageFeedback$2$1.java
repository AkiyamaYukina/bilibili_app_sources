package com.bilibili.ship.theseus.ugc.intro.ai;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$showEndPageFeedback$2$1.class */
final class UgcAiFeedbackService$showEndPageFeedback$2$1 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
    int label;
    final UgcAiFeedbackService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcAiFeedbackService$showEndPageFeedback$2$1(UgcAiFeedbackService ugcAiFeedbackService, Continuation<? super UgcAiFeedbackService$showEndPageFeedback$2$1> continuation) {
        super(1, continuation);
        this.this$0 = ugcAiFeedbackService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(UgcAiFeedbackService ugcAiFeedbackService) {
        ugcAiFeedbackService.f96959w = true;
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcAiFeedbackService$showEndPageFeedback$2$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<Object> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z6 = this.this$0.f96943f.h().f102988b;
            UgcAiFeedbackService ugcAiFeedbackService = this.this$0;
            MutableStateFlow<Boolean> mutableStateFlow = ugcAiFeedbackService.f96951o;
            com.bilibili.ship.theseus.ugc.endpage.aifeedback.c cVar = new com.bilibili.ship.theseus.ugc.endpage.aifeedback.c(mutableStateFlow, ugcAiFeedbackService.f96949m, !z6, new g(ugcAiFeedbackService));
            ugcAiFeedbackService.f96959w = false;
            mutableStateFlow.tryEmit(Boxing.boxBoolean(true));
            TheseusFloatLayerService theseusFloatLayerService = this.this$0.f96940c;
            this.label = 1;
            if (theseusFloatLayerService.i(cVar, null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(this.this$0.f96951o.tryEmit(Boxing.boxBoolean(false)));
    }
}
