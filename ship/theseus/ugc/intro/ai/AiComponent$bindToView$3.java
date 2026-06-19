package com.bilibili.ship.theseus.ugc.intro.ai;

import Vu0.C2970i;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ship.theseus.ugc.intro.ai.AiComponent$bindToView$3;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/AiComponent$bindToView$3.class */
final class AiComponent$bindToView$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final C2970i $binding;
    final ConstraintLayout $root;
    private Object L$0;
    int label;
    final e this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ai.AiComponent$bindToView$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/AiComponent$bindToView$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ConstraintLayout $root;
        int label;
        final e this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ai.AiComponent$bindToView$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/AiComponent$bindToView$3$1$1.class */
        public static final class C08301 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final ConstraintLayout $root;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08301(ConstraintLayout constraintLayout, Continuation<? super C08301> continuation) {
                super(2, continuation);
                this.$root = constraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08301 c08301 = new C08301(this.$root, continuation);
                c08301.I$0 = ((Number) obj).intValue();
                return c08301;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int iDpToPx = DimenUtilsKt.dpToPx(this.I$0);
                ConstraintLayout constraintLayout = this.$root;
                constraintLayout.setPadding(iDpToPx, constraintLayout.getPaddingTop(), iDpToPx, this.$root.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$root = constraintLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$root, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f96970c;
                C08301 c08301 = new C08301(this.$root, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c08301, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ai.AiComponent$bindToView$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/AiComponent$bindToView$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C2970i $binding;
        int label;
        final e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C2970i c2970i, e eVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$binding = c2970i;
            this.this$0 = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(e eVar, View view) {
            eVar.f96968a.setValue(Boolean.FALSE);
            eVar.f96971d.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(e eVar, View view) {
            if (((Boolean) eVar.f96969b.getValue()).booleanValue()) {
                return;
            }
            eVar.f96969b.tryEmit(Boolean.TRUE);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$binding, this.this$0, continuation);
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
            TintImageView tintImageView = this.$binding.f25913c;
            final e eVar = this.this$0;
            tintImageView.setOnClickListener(new View.OnClickListener(eVar) { // from class: com.bilibili.ship.theseus.ugc.intro.ai.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final e f96966a;

                {
                    this.f96966a = eVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AiComponent$bindToView$3.AnonymousClass2.invokeSuspend$lambda$0(this.f96966a, view);
                }
            });
            TintTextView tintTextView = this.$binding.f25914d;
            final e eVar2 = this.this$0;
            tintTextView.setOnClickListener(new View.OnClickListener(eVar2) { // from class: com.bilibili.ship.theseus.ugc.intro.ai.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final e f96967a;

                {
                    this.f96967a = eVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AiComponent$bindToView$3.AnonymousClass2.invokeSuspend$lambda$1(this.f96967a, view);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ai.AiComponent$bindToView$3$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/AiComponent$bindToView$3$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C2970i $binding;
        int label;
        final e this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ai.AiComponent$bindToView$3$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/AiComponent$bindToView$3$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final C2970i $binding;
            Object L$0;
            int label;
            final e this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(e eVar, C2970i c2970i, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = eVar;
                this.$binding = c2970i;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$binding, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return create(bool, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
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
                    e eVar = this.this$0;
                    final C2970i c2970i = this.$binding;
                    if (!eVar.h) {
                        eVar.h = true;
                        c2970i.f25911a.setVisibility(0);
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, eVar.f96972e);
                        valueAnimatorOfInt.setDuration(300L);
                        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(c2970i) { // from class: com.bilibili.ship.theseus.ugc.intro.ai.b

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final C2970i f96965a;

                            {
                                this.f96965a = c2970i;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ConstraintLayout constraintLayout = this.f96965a.f25911a;
                                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                                if (layoutParams == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                }
                                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                constraintLayout.setLayoutParams(layoutParams);
                            }
                        });
                        valueAnimatorOfInt.start();
                        eVar.f96974g = valueAnimatorOfInt;
                    }
                } else {
                    e eVar2 = this.this$0;
                    final C2970i c2970i2 = this.$binding;
                    if (eVar2.h) {
                        eVar2.h = false;
                        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(eVar2.f96972e, 0);
                        valueAnimatorOfInt2.setDuration(300L);
                        final int i7 = 0;
                        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(c2970i2, i7) { // from class: com.bilibili.ship.theseus.ugc.intro.ai.a

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final int f96963a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final Object f96964b;

                            {
                                this.f96963a = i7;
                                this.f96964b = c2970i2;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (this.f96963a) {
                                    case 0:
                                        ConstraintLayout constraintLayout = ((C2970i) this.f96964b).f25911a;
                                        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                                        if (layoutParams == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                        }
                                        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                        constraintLayout.setLayoutParams(layoutParams);
                                        return;
                                    default:
                                        ((tm.d) this.f96964b).o(((Integer) valueAnimator.getAnimatedValue()).intValue());
                                        return;
                                }
                            }
                        });
                        valueAnimatorOfInt2.start();
                        eVar2.f96973f = valueAnimatorOfInt2;
                    } else {
                        BLog.i("AiComponent-fold", "[theseus-ugc-AiComponent-fold] unfold first");
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(e eVar, C2970i c2970i, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$binding = c2970i;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                e eVar = this.this$0;
                MutableStateFlow<Boolean> mutableStateFlow = eVar.f96968a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(eVar, this.$binding, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ai.AiComponent$bindToView$3$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/AiComponent$bindToView$3$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(e eVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = eVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ValueAnimator valueAnimator;
            ValueAnimator valueAnimator2;
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
                ValueAnimator valueAnimator3 = this.this$0.f96973f;
                if (valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator2 = this.this$0.f96973f) != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator4 = this.this$0.f96974g;
                if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = this.this$0.f96974g) != null) {
                    valueAnimator.cancel();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiComponent$bindToView$3(e eVar, ConstraintLayout constraintLayout, C2970i c2970i, Continuation<? super AiComponent$bindToView$3> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$root = constraintLayout;
        this.$binding = c2970i;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AiComponent$bindToView$3 aiComponent$bindToView$3 = new AiComponent$bindToView$3(this.this$0, this.$root, this.$binding, continuation);
        aiComponent$bindToView$3.L$0 = obj;
        return aiComponent$bindToView$3;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$root, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$binding, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
    }
}
