package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createAIComponent$1.class */
final class DetailRelateService$createAIComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<RelateAvComponent.a.InterfaceC1039a> $bindView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRelateService$createAIComponent$1(Ref.ObjectRef<RelateAvComponent.a.InterfaceC1039a> objectRef, Continuation<? super DetailRelateService$createAIComponent$1> continuation) {
        super(1, continuation);
        this.$bindView = objectRef;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DetailRelateService$createAIComponent$1(this.$bindView, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            this.$bindView.element = null;
            throw th;
        }
    }
}
