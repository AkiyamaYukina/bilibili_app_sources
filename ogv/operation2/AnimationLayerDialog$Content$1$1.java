package com.bilibili.ogv.operation2;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/AnimationLayerDialog$Content$1$1.class */
final class AnimationLayerDialog$Content$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimationLayerDialog$Content$1$1(d dVar, Continuation<? super AnimationLayerDialog$Content$1$1> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnimationLayerDialog$Content$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Float, AnimationVector1D> animatable = this.this$0.f70826g;
            Float fBoxFloat = Boxing.boxFloat(1.0f);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, null, 6, null);
            this.label = 1;
            if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        d dVar = this.this$0;
        int i8 = d.f70819k;
        dVar.f70824e.setIntValue(1);
        return Unit.INSTANCE;
    }
}
