package com.bilibili.ogv.operation3.module.switchit;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.RepeatMode;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/switchit/SwitchItUiKt$SwitchItUi$1$1.class */
final class SwitchItUiKt$SwitchItUi$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Animatable<Float, AnimationVector1D> $rotation;
    final h $switchableModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchItUiKt$SwitchItUi$1$1(h hVar, Animatable<Float, AnimationVector1D> animatable, Continuation<? super SwitchItUiKt$SwitchItUi$1$1> continuation) {
        super(2, continuation);
        this.$switchableModel = hVar;
        this.$rotation = animatable;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwitchItUiKt$SwitchItUi$1$1(this.$switchableModel, this.$rotation, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$switchableModel.a()) {
                Animatable<Float, AnimationVector1D> animatable = this.$rotation;
                Float fBoxFloat = Boxing.boxFloat(360.0f);
                InfiniteRepeatableSpec infiniteRepeatableSpecM1137infiniteRepeatable9IiC70o$default = AnimationSpecKt.m1137infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, infiniteRepeatableSpecM1137infiniteRepeatable9IiC70o$default, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Animatable<Float, AnimationVector1D> animatable2 = this.$rotation;
                Float fBoxFloat2 = Boxing.boxFloat(0.0f);
                this.label = 2;
                if (animatable2.snapTo(fBoxFloat2, this) == coroutine_suspended) {
                    return coroutine_suspended;
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
