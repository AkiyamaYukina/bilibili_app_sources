package com.bilibili.ogv.community;

import java.util.Map;
import java.util.Optional;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/BehaviorRepositoryHelperKt$resetOnLoginStateChange$1.class */
final class BehaviorRepositoryHelperKt$resetOnLoginStateChange$1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    final a<Object, Object> $this_resetOnLoginStateChange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BehaviorRepositoryHelperKt$resetOnLoginStateChange$1(a<Object, Object> aVar, Continuation<? super BehaviorRepositoryHelperKt$resetOnLoginStateChange$1> continuation) {
        super(2, continuation);
        this.$this_resetOnLoginStateChange = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BehaviorRepositoryHelperKt$resetOnLoginStateChange$1(this.$this_resetOnLoginStateChange, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        a<Object, Object> aVar = this.$this_resetOnLoginStateChange;
        for (Map.Entry<Object, io.reactivex.rxjava3.subjects.a<Optional<Object>>> entry : aVar.f67499a.entrySet()) {
            Object key = entry.getKey();
            entry.getValue().onNext(Optional.empty());
            aVar.f67500b.onNext(new Pair(key, Optional.empty()));
        }
        return Unit.INSTANCE;
    }
}
