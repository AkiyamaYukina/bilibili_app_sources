package com.bilibili.playset.editor.widget;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableFloatState;
import com.bilibili.playset.editor.widget.ImagePickPopupKt$ImagePickPopupContent$3$2$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/ImagePickPopupKt$ImagePickPopupContent$3$2$1.class */
public final class ImagePickPopupKt$ImagePickPopupContent$3$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableTransitionState<Boolean> $animatedState;
    final MutableFloatState $contentAlpha;
    final MutableFloatState $contentScale;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.playset.editor.widget.ImagePickPopupKt$ImagePickPopupContent$3$2$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/ImagePickPopupKt$ImagePickPopupContent$3$2$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableTransitionState<Boolean> $animatedState;
        final MutableFloatState $contentAlpha;
        final MutableFloatState $contentScale;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableTransitionState<Boolean> mutableTransitionState, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$animatedState = mutableTransitionState;
            this.$contentAlpha = mutableFloatState;
            this.$contentScale = mutableFloatState2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, float f7, float f8) {
            mutableFloatState.setFloatValue(f7);
            mutableFloatState2.setFloatValue((f7 * 0.1f) + 0.9f);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$animatedState, this.$contentAlpha, this.$contentScale, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$animatedState.getTargetState().booleanValue()) {
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                    final MutableFloatState mutableFloatState = this.$contentAlpha;
                    final MutableFloatState mutableFloatState2 = this.$contentScale;
                    Function2 function2 = new Function2(mutableFloatState, mutableFloatState2) { // from class: com.bilibili.playset.editor.widget.z

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final MutableFloatState f85058a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final MutableFloatState f85059b;

                        {
                            this.f85058a = mutableFloatState;
                            this.f85059b = mutableFloatState2;
                        }

                        public final Object invoke(Object obj2, Object obj3) {
                            return ImagePickPopupKt$ImagePickPopupContent$3$2$1.AnonymousClass1.invokeSuspend$lambda$0(this.f85058a, this.f85059b, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    this.label = 1;
                    if (SuspendAnimationKt.animate$default(0.0f, 1.0f, 0.0f, tweenSpecTween$default, function2, this, 4, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickPopupKt$ImagePickPopupContent$3$2$1(MutableTransitionState<Boolean> mutableTransitionState, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, Continuation<? super ImagePickPopupKt$ImagePickPopupContent$3$2$1> continuation) {
        super(2, continuation);
        this.$animatedState = mutableTransitionState;
        this.$contentAlpha = mutableFloatState;
        this.$contentScale = mutableFloatState2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ImagePickPopupKt$ImagePickPopupContent$3$2$1 imagePickPopupKt$ImagePickPopupContent$3$2$1 = new ImagePickPopupKt$ImagePickPopupContent$3$2$1(this.$animatedState, this.$contentAlpha, this.$contentScale, continuation);
        imagePickPopupKt$ImagePickPopupContent$3$2$1.L$0 = obj;
        return imagePickPopupKt$ImagePickPopupContent$3$2$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$animatedState, this.$contentAlpha, this.$contentScale, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
