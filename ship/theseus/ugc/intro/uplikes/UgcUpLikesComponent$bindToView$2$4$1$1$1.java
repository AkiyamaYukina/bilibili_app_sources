package com.bilibili.ship.theseus.ugc.intro.uplikes;

import Vu0.I;
import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesComponent$bindToView$2$4$1$1$1.class */
public final class UgcUpLikesComponent$bindToView$2$4$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final I $binding;
    final Context $context;
    final Ref.IntRef $nameLayoutWidth;
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcUpLikesComponent$bindToView$2$4$1$1$1(Context context, Ref.IntRef intRef, I i7, c cVar, Continuation<? super UgcUpLikesComponent$bindToView$2$4$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$nameLayoutWidth = intRef;
        this.$binding = i7;
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcUpLikesComponent$bindToView$2$4$1$1$1(this.$context, this.$nameLayoutWidth, this.$binding, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.$context;
            Ref.IntRef intRef = this.$nameLayoutWidth;
            I i8 = this.$binding;
            c cVar = this.this$0;
            this.label = 1;
            if (c.a(context, intRef, i8, cVar, this) == coroutine_suspended) {
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
