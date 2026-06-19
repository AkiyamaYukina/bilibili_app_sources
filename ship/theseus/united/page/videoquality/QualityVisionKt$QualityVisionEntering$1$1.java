package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/QualityVisionKt$QualityVisionEntering$1$1.class */
final class QualityVisionKt$QualityVisionEntering$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Animatable<Float, AnimationVector1D> $alpha;
    final Function0<Unit> $onAnimationEnd;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualityVisionKt$QualityVisionEntering$1$1(Animatable<Float, AnimationVector1D> animatable, Function0<Unit> function0, Continuation<? super QualityVisionKt$QualityVisionEntering$1$1> continuation) {
        super(2, continuation);
        this.$alpha = animatable;
        this.$onAnimationEnd = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QualityVisionKt$QualityVisionEntering$1$1(this.$alpha, this.$onAnimationEnd, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r12 = r0
            r0 = r9
            int r0 = r0.label
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L3b
            r0 = r11
            r1 = 1
            if (r0 == r1) goto L34
            r0 = r11
            r1 = 2
            if (r0 == r1) goto L2d
            r0 = r11
            r1 = 3
            if (r0 != r1) goto L23
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto Lb3
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L2d:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L82
        L34:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L70
        L3b:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r0 = r0.$alpha
            r10 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r0)
            r14 = r0
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 0
            r2 = 0
            r3 = 6
            r4 = 0
            androidx.compose.animation.core.TweenSpec r0 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r0, r1, r2, r3, r4)
            r13 = r0
            r0 = r9
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = r14
            r2 = r13
            r3 = 0
            r4 = 0
            r5 = r9
            r6 = 12
            r7 = 0
            java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, r3, r4, r5, r6, r7)
            r1 = r12
            if (r0 != r1) goto L70
            r0 = r12
            return r0
        L70:
            r0 = r9
            r1 = 2
            r0.label = r1
            r0 = 1600(0x640, double:7.905E-321)
            r1 = r9
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
            r1 = r12
            if (r0 != r1) goto L82
            r0 = r12
            return r0
        L82:
            r0 = r9
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r0 = r0.$alpha
            r13 = r0
            r0 = 0
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r0)
            r14 = r0
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 0
            r2 = 0
            r3 = 6
            r4 = 0
            androidx.compose.animation.core.TweenSpec r0 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r0, r1, r2, r3, r4)
            r10 = r0
            r0 = r9
            r1 = 3
            r0.label = r1
            r0 = r13
            r1 = r14
            r2 = r10
            r3 = 0
            r4 = 0
            r5 = r9
            r6 = 12
            r7 = 0
            java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, r3, r4, r5, r6, r7)
            r1 = r12
            if (r0 != r1) goto Lb3
            r0 = r12
            return r0
        Lb3:
            r0 = r9
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.$onAnimationEnd
            java.lang.Object r0 = r0.invoke()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.QualityVisionKt$QualityVisionEntering$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
