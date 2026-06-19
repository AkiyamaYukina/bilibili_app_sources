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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedComponent$NumberRollingAnimation$1$1.class */
final class CheeseStudyCompletedComponent$NumberRollingAnimation$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CheeseStudyCompletedComponent.a.InterfaceC0641a $animationState;
    final int $numTarget;
    final Animatable<Integer, AnimationVector1D> $rollingAnim;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseStudyCompletedComponent$NumberRollingAnimation$1$1(CheeseStudyCompletedComponent.a.InterfaceC0641a interfaceC0641a, Animatable<Integer, AnimationVector1D> animatable, int i7, Continuation<? super CheeseStudyCompletedComponent$NumberRollingAnimation$1$1> continuation) {
        super(2, continuation);
        this.$animationState = interfaceC0641a;
        this.$rollingAnim = animatable;
        this.$numTarget = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseStudyCompletedComponent$NumberRollingAnimation$1$1(this.$animationState, this.$rollingAnim, this.$numTarget, continuation);
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
            if (Intrinsics.areEqual(interfaceC0641a, CheeseStudyCompletedComponent.a.InterfaceC0641a.c.f90155a)) {
                Animatable<Integer, AnimationVector1D> animatable = this.$rollingAnim;
                Integer numBoxInt = Boxing.boxInt(this.$numTarget);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(400, 0, C3348v.f33185c, 2, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, numBoxInt, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (Intrinsics.areEqual(interfaceC0641a, CheeseStudyCompletedComponent.a.InterfaceC0641a.C0642a.f90153a)) {
                    Animatable<Integer, AnimationVector1D> animatable2 = this.$rollingAnim;
                    Integer numBoxInt2 = Boxing.boxInt(this.$numTarget);
                    this.label = 2;
                    if (animatable2.snapTo(numBoxInt2, this) == coroutine_suspended) {
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
