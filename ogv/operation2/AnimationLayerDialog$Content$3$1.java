package com.bilibili.ogv.operation2;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.geometry.Offset;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/AnimationLayerDialog$Content$3$1.class */
final class AnimationLayerDialog$Content$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final d this$0;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation2.AnimationLayerDialog$Content$3$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/AnimationLayerDialog$Content$3$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        private Object L$0;
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ogv.operation2.AnimationLayerDialog$Content$3$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/AnimationLayerDialog$Content$3$1$1$1.class */
        public static final class C04331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04331(d dVar, Continuation<? super C04331> continuation) {
                super(2, continuation);
                this.this$0 = dVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04331(this.this$0, continuation);
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
                    Float fBoxFloat = Boxing.boxFloat(0.1f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
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
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.operation2.AnimationLayerDialog$Content$3$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/AnimationLayerDialog$Content$3$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(d dVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = dVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable<Float, AnimationVector1D> animatable = this.this$0.h;
                    Float fBoxFloat = Boxing.boxFloat(0.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(240, 0, null, 6, null);
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
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.operation2.AnimationLayerDialog$Content$3$1$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/AnimationLayerDialog$Content$3$1$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(d dVar, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = dVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    d dVar = this.this$0;
                    Animatable<Float, AnimationVector1D> animatable = dVar.f70827i;
                    Float fBoxFloat = Boxing.boxFloat(Float.intBitsToFloat((int) (dVar.f70823d & 4294967295L)) - Float.intBitsToFloat((int) (((Offset) this.this$0.f70828j.getValue()).m2465unboximpl() & 4294967295L)));
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
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
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object invokeSuspend(Object obj) {
            Job jobLaunch$default;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C04331(this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
            d dVar = this.this$0;
            int i7 = d.f70819k;
            if ((((Offset) dVar.f70828j.getValue()).m2465unboximpl() & 9223372034707292159L) != 9205357640488583168L) {
                jobLaunch$default = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
            } else {
                BLog.w("AnimationLayerDialog$Content$3$1$1-invokeSuspend", "[ogv-operation2-AnimationLayerDialog$Content$3$1$1-invokeSuspend] imageCenterPoint not ready, skipping offset animation.", (Throwable) null);
                jobLaunch$default = Unit.INSTANCE;
            }
            return jobLaunch$default;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimationLayerDialog$Content$3$1(d dVar, Continuation<? super AnimationLayerDialog$Content$3$1> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnimationLayerDialog$Content$3$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.dismiss();
        return Unit.INSTANCE;
    }
}
