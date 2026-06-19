package com.bilibili.pegasus.components.interest.ui.v31.vm;

import Do0.a;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/vm/InterestChooseV31PageViewModel$onSkip$1.class */
public final class InterestChooseV31PageViewModel$onSkip$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV31PageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV31PageViewModel$onSkip$1(InterestChooseV31PageViewModel interestChooseV31PageViewModel, Continuation<? super InterestChooseV31PageViewModel$onSkip$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV31PageViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV31PageViewModel$onSkip$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<Do0.a> mutableSharedFlow = this.this$0.f76630c;
            a.C0021a c0021a = new a.C0021a(2, Boxing.boxBoolean(true), null, InterestPageCloseReason.THREE_POINT.getReason());
            this.label = 1;
            if (mutableSharedFlow.emit(c0021a, this) == coroutine_suspended) {
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
