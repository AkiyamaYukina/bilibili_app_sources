package com.bilibili.pegasus.keywordblocker;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/keywordblocker/KeywordBlockerViewModel$handleAction$1.class */
public final class KeywordBlockerViewModel$handleAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.pegasus.kmm.keywordblocker.b $action;
    int label;
    final KeywordBlockerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeywordBlockerViewModel$handleAction$1(KeywordBlockerViewModel keywordBlockerViewModel, com.bilibili.pegasus.kmm.keywordblocker.b bVar, Continuation<? super KeywordBlockerViewModel$handleAction$1> continuation) {
        super(2, continuation);
        this.this$0 = keywordBlockerViewModel;
        this.$action = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KeywordBlockerViewModel$handleAction$1(this.this$0, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.pegasus.kmm.keywordblocker.e eVar = this.this$0.f78204b;
            com.bilibili.pegasus.kmm.keywordblocker.b bVar = this.$action;
            this.label = 1;
            Object objB = eVar.b((com.bilibili.pegasus.kmm.keywordblocker.d) eVar.f78267b.getValue(), bVar, this);
            if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objB = Unit.INSTANCE;
            }
            if (objB == coroutine_suspended) {
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
