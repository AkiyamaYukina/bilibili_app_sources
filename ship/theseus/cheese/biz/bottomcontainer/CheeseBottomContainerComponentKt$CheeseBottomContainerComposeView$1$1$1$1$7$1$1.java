package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerComponentKt$CheeseBottomContainerComposeView$1$1$1$1$7$1$1.class */
public final class CheeseBottomContainerComponentKt$CheeseBottomContainerComposeView$1$1$1$1$7$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Animatable<Float, AnimationVector1D> $alpha;
    final MutableState<Painter> $currentPainter$delegate;
    final Painter $painter;
    final Animatable<Float, AnimationVector1D> $scale;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerComponentKt$CheeseBottomContainerComposeView$1$1$1$1$7$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerComponentKt$CheeseBottomContainerComposeView$1$1$1$1$7$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Animatable<Float, AnimationVector1D> $alpha;
        final Animatable<Float, AnimationVector1D> $scale;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$alpha = animatable;
            this.$scale = animatable2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$alpha, this.$scale, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVector1D> animatable = this.$alpha;
                Float fBoxFloat = Boxing.boxFloat(0.0f);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(400, 0, null, 6, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            Animatable<Float, AnimationVector1D> animatable2 = this.$scale;
            Float fBoxFloat2 = Boxing.boxFloat(0.75f);
            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(400, 0, null, 6, null);
            this.label = 2;
            if (Animatable.animateTo$default(animatable2, fBoxFloat2, tweenSpecTween$default2, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerComponentKt$CheeseBottomContainerComposeView$1$1$1$1$7$1$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerComponentKt$CheeseBottomContainerComposeView$1$1$1$1$7$1$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Animatable<Float, AnimationVector1D> $alpha;
        final Animatable<Float, AnimationVector1D> $scale;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$alpha = animatable;
            this.$scale = animatable2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$alpha, this.$scale, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVector1D> animatable = this.$alpha;
                Float fBoxFloat = Boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(400, 0, null, 6, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            Animatable<Float, AnimationVector1D> animatable2 = this.$scale;
            Float fBoxFloat2 = Boxing.boxFloat(1.0f);
            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(400, 0, null, 6, null);
            this.label = 2;
            if (Animatable.animateTo$default(animatable2, fBoxFloat2, tweenSpecTween$default2, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseBottomContainerComponentKt$CheeseBottomContainerComposeView$1$1$1$1$7$1$1(Painter painter, Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, MutableState<Painter> mutableState, Continuation<? super CheeseBottomContainerComponentKt$CheeseBottomContainerComposeView$1$1$1$1$7$1$1> continuation) {
        super(2, continuation);
        this.$painter = painter;
        this.$alpha = animatable;
        this.$scale = animatable2;
        this.$currentPainter$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseBottomContainerComponentKt$CheeseBottomContainerComposeView$1$1$1$1$7$1$1 cheeseBottomContainerComponentKt$CheeseBottomContainerComposeView$1$1$1$1$7$1$1 = new CheeseBottomContainerComponentKt$CheeseBottomContainerComposeView$1$1$1$1$7$1$1(this.$painter, this.$alpha, this.$scale, this.$currentPainter$delegate, continuation);
        cheeseBottomContainerComponentKt$CheeseBottomContainerComposeView$1$1$1$1$7$1$1.L$0 = obj;
        return cheeseBottomContainerComponentKt$CheeseBottomContainerComposeView$1$1$1$1$7$1$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$alpha, this.$scale, null), 3, (Object) null);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.delay(400L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
        }
        this.$currentPainter$delegate.setValue(this.$painter);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$alpha, this.$scale, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
