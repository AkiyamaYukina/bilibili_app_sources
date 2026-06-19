package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.C3348v;
import androidx.compose.animation.core.TweenSpec;
import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedComponent$scaleIn$1$1$1.class */
final class CheeseStudyCompletedComponent$scaleIn$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CheeseStudyCompletedComponent.a.InterfaceC0641a $animationState;
    final Animatable<Float, AnimationVector1D> $scale;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseStudyCompletedComponent$scaleIn$1$1$1(CheeseStudyCompletedComponent.a.InterfaceC0641a interfaceC0641a, Animatable<Float, AnimationVector1D> animatable, Continuation<? super CheeseStudyCompletedComponent$scaleIn$1$1$1> continuation) {
        super(2, continuation);
        this.$animationState = interfaceC0641a;
        this.$scale = animatable;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseStudyCompletedComponent$scaleIn$1$1$1(this.$animationState, this.$scale, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CheeseStudyCompletedComponent.a.InterfaceC0641a interfaceC0641a = this.$animationState;
            if (interfaceC0641a instanceof CheeseStudyCompletedComponent.a.InterfaceC0641a.c) {
                Animatable<Float, AnimationVector1D> animatable = this.$scale;
                Float fBoxFloat = Boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(160, 0, C3348v.f33185c, 2, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (interfaceC0641a instanceof CheeseStudyCompletedComponent.a.InterfaceC0641a.C0642a) {
                    Animatable<Float, AnimationVector1D> animatable2 = this.$scale;
                    Float fBoxFloat2 = Boxing.boxFloat(1.0f);
                    this.label = 2;
                    if (animatable2.snapTo(fBoxFloat2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        } else if (i7 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Unit unit2 = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
