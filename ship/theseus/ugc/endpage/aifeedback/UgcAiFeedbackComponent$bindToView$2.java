package com.bilibili.ship.theseus.ugc.endpage.aifeedback;

import Vu0.C2963b;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/aifeedback/UgcAiFeedbackComponent$bindToView$2.class */
final class UgcAiFeedbackComponent$bindToView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final C2963b $binding;
    final Ref.ObjectRef<ValueAnimator> $dismissAnimator;
    final Ref.ObjectRef<AnimatorSet> $enterAnimator;
    final Ref.BooleanRef $isShowing;
    final Ref.ObjectRef<ValueAnimator> $progressAnimator;
    final ConstraintLayout $root;
    private Object L$0;
    int label;
    final c this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.aifeedback.UgcAiFeedbackComponent$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/aifeedback/UgcAiFeedbackComponent$bindToView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C2963b $binding;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.aifeedback.UgcAiFeedbackComponent$bindToView$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/aifeedback/UgcAiFeedbackComponent$bindToView$2$1$1.class */
        public static final class C08221 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08221(c cVar, Continuation<? super C08221> continuation) {
                super(2, continuation);
                this.this$0 = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08221(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f96596a.setValue(Boxing.boxBoolean(false));
                this.this$0.f96599d.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C2963b c2963b, c cVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$binding = c2963b;
            this.this$0 = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$binding.f25879d);
                C08221 c08221 = new C08221(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, c08221, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.aifeedback.UgcAiFeedbackComponent$bindToView$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/aifeedback/UgcAiFeedbackComponent$bindToView$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C2963b $binding;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.aifeedback.UgcAiFeedbackComponent$bindToView$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/aifeedback/UgcAiFeedbackComponent$bindToView$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(c cVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f96596a.setValue(Boxing.boxBoolean(false));
                this.this$0.f96599d.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C2963b c2963b, c cVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$binding = c2963b;
            this.this$0 = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$binding.f25877b);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.aifeedback.UgcAiFeedbackComponent$bindToView$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/aifeedback/UgcAiFeedbackComponent$bindToView$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C2963b $binding;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.aifeedback.UgcAiFeedbackComponent$bindToView$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/aifeedback/UgcAiFeedbackComponent$bindToView$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(c cVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) this.this$0.f96597b.getValue()).booleanValue()) {
                    this.this$0.f96596a.setValue(Boxing.boxBoolean(false));
                    this.this$0.f96597b.tryEmit(Boxing.boxBoolean(true));
                }
                this.this$0.f96599d.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C2963b c2963b, c cVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$binding = c2963b;
            this.this$0 = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$binding.f25880e);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.aifeedback.UgcAiFeedbackComponent$bindToView$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/aifeedback/UgcAiFeedbackComponent$bindToView$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C2963b $binding;
        final Ref.ObjectRef<ValueAnimator> $dismissAnimator;
        final Ref.ObjectRef<AnimatorSet> $enterAnimator;
        final Ref.BooleanRef $isShowing;
        final Ref.ObjectRef<ValueAnimator> $progressAnimator;
        final ConstraintLayout $root;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.aifeedback.UgcAiFeedbackComponent$bindToView$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/aifeedback/UgcAiFeedbackComponent$bindToView$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final C2963b $binding;
            final Ref.ObjectRef<ValueAnimator> $dismissAnimator;
            final Ref.ObjectRef<AnimatorSet> $enterAnimator;
            final Ref.BooleanRef $isShowing;
            final Ref.ObjectRef<ValueAnimator> $progressAnimator;
            final ConstraintLayout $root;
            Object L$0;
            int label;
            final c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.BooleanRef booleanRef, Ref.ObjectRef<ValueAnimator> objectRef, c cVar, C2963b c2963b, Ref.ObjectRef<AnimatorSet> objectRef2, Ref.ObjectRef<ValueAnimator> objectRef3, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$isShowing = booleanRef;
                this.$progressAnimator = objectRef;
                this.this$0 = cVar;
                this.$binding = c2963b;
                this.$enterAnimator = objectRef2;
                this.$dismissAnimator = objectRef3;
                this.$root = constraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isShowing, this.$progressAnimator, this.this$0, this.$binding, this.$enterAnimator, this.$dismissAnimator, this.$root, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return create(bool, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                AnimatorSet animatorSet;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Boolean bool = (Boolean) this.L$0;
                if (bool == null) {
                    return Unit.INSTANCE;
                }
                if (bool.booleanValue()) {
                    Ref.BooleanRef booleanRef = this.$isShowing;
                    Ref.ObjectRef<ValueAnimator> objectRef = this.$progressAnimator;
                    final c cVar = this.this$0;
                    final C2963b c2963b = this.$binding;
                    Ref.ObjectRef<AnimatorSet> objectRef2 = this.$enterAnimator;
                    int i7 = c.f96595e;
                    booleanRef.element = true;
                    ValueAnimator valueAnimator = (ValueAnimator) objectRef.element;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    c2963b.f25881f.setClockwise(true);
                    ConstraintLayout constraintLayout = c2963b.f25882g;
                    c2963b.f25881f.setRingProgressColor(ThemeUtils.getColorById(constraintLayout.getContext(), 2131100122));
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(100, 0);
                    valueAnimatorOfInt.setDuration(8000L);
                    valueAnimatorOfInt.setStartDelay(400L);
                    valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(c2963b, cVar) { // from class: com.bilibili.ship.theseus.ugc.endpage.aifeedback.a

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final C2963b f96592a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final c f96593b;

                        {
                            this.f96592a = c2963b;
                            this.f96593b = cVar;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            C2963b c2963b2 = this.f96592a;
                            c cVar2 = this.f96593b;
                            Object animatedValue = valueAnimator2.getAnimatedValue();
                            Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                            if (num != null) {
                                int iIntValue = num.intValue();
                                c2963b2.f25881f.setProgress(iIntValue);
                                if (iIntValue <= 0) {
                                    cVar2.f96596a.setValue(Boolean.FALSE);
                                    cVar2.f96599d.invoke();
                                }
                            }
                        }
                    });
                    valueAnimatorOfInt.start();
                    objectRef.element = valueAnimatorOfInt;
                    constraintLayout.setAlpha(0.0f);
                    TintImageView tintImageView = c2963b.f25878c;
                    tintImageView.setAlpha(0.0f);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(constraintLayout, "alpha", 0.0f, 1.0f);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tintImageView, "alpha", 0.0f, 1.0f);
                    objectAnimatorOfFloat.setDuration(200L);
                    objectAnimatorOfFloat2.setDuration(200L);
                    objectAnimatorOfFloat2.setStartDelay(200L);
                    animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                    animatorSet2.start();
                    objectRef2.element = animatorSet2;
                    if (!cVar.f96598c) {
                        FrameLayout frameLayout = c2963b.f25879d;
                        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams.width = DimenUtilsKt.dpToPx(70.0f);
                        frameLayout.setLayoutParams(layoutParams);
                    }
                } else {
                    Ref.BooleanRef booleanRef2 = this.$isShowing;
                    Ref.ObjectRef<ValueAnimator> objectRef3 = this.$progressAnimator;
                    Ref.ObjectRef<ValueAnimator> objectRef4 = this.$dismissAnimator;
                    Ref.ObjectRef<AnimatorSet> objectRef5 = this.$enterAnimator;
                    ConstraintLayout constraintLayout2 = this.$root;
                    int i8 = c.f96595e;
                    if (booleanRef2.element) {
                        booleanRef2.element = false;
                        ValueAnimator valueAnimator2 = (ValueAnimator) objectRef3.element;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator valueAnimator3 = (ValueAnimator) objectRef4.element;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                        }
                        AnimatorSet animatorSet3 = (AnimatorSet) objectRef5.element;
                        if (animatorSet3 != null && animatorSet3.isRunning() && (animatorSet = (AnimatorSet) objectRef5.element) != null) {
                            animatorSet.cancel();
                        }
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(constraintLayout2, "alpha", 1.0f, 0.0f);
                        objectAnimatorOfFloat3.setDuration(350L);
                        objectAnimatorOfFloat3.setStartDelay(0L);
                        objectAnimatorOfFloat3.addListener(new b(constraintLayout2));
                        objectAnimatorOfFloat3.start();
                        objectRef4.element = objectAnimatorOfFloat3;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(c cVar, Ref.BooleanRef booleanRef, Ref.ObjectRef<ValueAnimator> objectRef, C2963b c2963b, Ref.ObjectRef<AnimatorSet> objectRef2, Ref.ObjectRef<ValueAnimator> objectRef3, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$isShowing = booleanRef;
            this.$progressAnimator = objectRef;
            this.$binding = c2963b;
            this.$enterAnimator = objectRef2;
            this.$dismissAnimator = objectRef3;
            this.$root = constraintLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$isShowing, this.$progressAnimator, this.$binding, this.$enterAnimator, this.$dismissAnimator, this.$root, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                c cVar = this.this$0;
                MutableStateFlow<Boolean> mutableStateFlow = cVar.f96596a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isShowing, this.$progressAnimator, cVar, this.$binding, this.$enterAnimator, this.$dismissAnimator, this.$root, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.aifeedback.UgcAiFeedbackComponent$bindToView$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/aifeedback/UgcAiFeedbackComponent$bindToView$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<ValueAnimator> $dismissAnimator;
        final Ref.ObjectRef<AnimatorSet> $enterAnimator;
        final Ref.ObjectRef<ValueAnimator> $progressAnimator;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Ref.ObjectRef<ValueAnimator> objectRef, Ref.ObjectRef<ValueAnimator> objectRef2, Ref.ObjectRef<AnimatorSet> objectRef3, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$progressAnimator = objectRef;
            this.$dismissAnimator = objectRef2;
            this.$enterAnimator = objectRef3;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.$progressAnimator, this.$dismissAnimator, this.$enterAnimator, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
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
                ValueAnimator valueAnimator = (ValueAnimator) this.$progressAnimator.element;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = (ValueAnimator) this.$dismissAnimator.element;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                AnimatorSet animatorSet = (AnimatorSet) this.$enterAnimator.element;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcAiFeedbackComponent$bindToView$2(C2963b c2963b, c cVar, Ref.BooleanRef booleanRef, Ref.ObjectRef<ValueAnimator> objectRef, Ref.ObjectRef<AnimatorSet> objectRef2, Ref.ObjectRef<ValueAnimator> objectRef3, ConstraintLayout constraintLayout, Continuation<? super UgcAiFeedbackComponent$bindToView$2> continuation) {
        super(2, continuation);
        this.$binding = c2963b;
        this.this$0 = cVar;
        this.$isShowing = booleanRef;
        this.$progressAnimator = objectRef;
        this.$enterAnimator = objectRef2;
        this.$dismissAnimator = objectRef3;
        this.$root = constraintLayout;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcAiFeedbackComponent$bindToView$2 ugcAiFeedbackComponent$bindToView$2 = new UgcAiFeedbackComponent$bindToView$2(this.$binding, this.this$0, this.$isShowing, this.$progressAnimator, this.$enterAnimator, this.$dismissAnimator, this.$root, continuation);
        ugcAiFeedbackComponent$bindToView$2.L$0 = obj;
        return ugcAiFeedbackComponent$bindToView$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$isShowing, this.$progressAnimator, this.$binding, this.$enterAnimator, this.$dismissAnimator, this.$root, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.$progressAnimator, this.$dismissAnimator, this.$enterAnimator, null), 3, (Object) null);
    }
}
