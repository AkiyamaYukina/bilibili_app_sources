package com.bilibili.upper.module.uppercenterlocal.vm;

import Yv0.c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/vm/UpperCenterLocalViewModel$initModelData$1.class */
public final class UpperCenterLocalViewModel$initModelData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UpperCenterLocalViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperCenterLocalViewModel$initModelData$1(UpperCenterLocalViewModel upperCenterLocalViewModel, Continuation<? super UpperCenterLocalViewModel$initModelData$1> continuation) {
        super(2, continuation);
        this.this$0 = upperCenterLocalViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpperCenterLocalViewModel$initModelData$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UpperCenterLocalViewModel upperCenterLocalViewModel = this.this$0;
            com.bilibili.upper.module.uppercenterlocal.repository.a aVar = upperCenterLocalViewModel.f114299c;
            this.label = 1;
            if (aVar.b(((c) upperCenterLocalViewModel).b, false, this) == coroutine_suspended) {
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
