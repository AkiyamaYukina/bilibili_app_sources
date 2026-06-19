package com.bilibili.ogv.operation3.module.switchit;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/switchit/CreateSwitchableModel$invoke$1$switchIt$1$2.class */
public final class CreateSwitchableModel$invoke$1$switchIt$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<Iterator<List<com.bilibili.ogv.operation3.module.operablecard.a>>> $cyclicCards;
    int label;
    final CreateSwitchableModel$invoke$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSwitchableModel$invoke$1$switchIt$1$2(CreateSwitchableModel$invoke$1 createSwitchableModel$invoke$1, Ref.ObjectRef<Iterator<List<com.bilibili.ogv.operation3.module.operablecard.a>>> objectRef, Continuation<? super CreateSwitchableModel$invoke$1$switchIt$1$2> continuation) {
        super(2, continuation);
        this.this$0 = createSwitchableModel$invoke$1;
        this.$cyclicCards = objectRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateSwitchableModel$invoke$1$switchIt$1$2(this.this$0, this.$cyclicCards, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<List<com.bilibili.ogv.operation3.module.operablecard.a>> mutableSharedFlow = this.this$0.f71419a;
            Object next = ((Iterator) this.$cyclicCards.element).next();
            this.label = 1;
            if (mutableSharedFlow.emit(next, this) == coroutine_suspended) {
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
