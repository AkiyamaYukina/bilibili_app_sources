package com.bilibili.ship.theseus.playlist.offline;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintFrameLayout;
import com.bilibili.ship.theseus.playlist.offline.e;
import dv0.C6853a;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputComponent$bind$2.class */
final class OfflineDanmakuInputComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final C6853a $binding;
    private Object L$0;
    int label;
    final e this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C6853a $binding;
        int label;
        final e this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputComponent$bind$2$1$1.class */
        public static final class C07921 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final e this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07921(e eVar, Continuation<? super C07921> continuation) {
                super(2, continuation);
                this.this$0 = eVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07921(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (((e.b) this.this$0.f95815a.getValue()).f95824c) {
                        MutableSharedFlow<e.a> mutableSharedFlow = this.this$0.f95816b;
                        e.a.b bVar = e.a.b.f95821a;
                        this.label = 1;
                        if (mutableSharedFlow.emit(bVar, this) == coroutine_suspended) {
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
        public AnonymousClass1(C6853a c6853a, e eVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$binding = c6853a;
            this.this$0 = eVar;
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
                Flow flowA = UIComponentExtKt.a(this.$binding.f116886c);
                C07921 c07921 = new C07921(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, c07921, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C6853a $binding;
        int label;
        final e this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final e this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(e eVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = eVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    e eVar = this.this$0;
                    int i8 = e.f95812f;
                    if (((e.b) eVar.f95815a.getValue()).f95824c) {
                        MutableSharedFlow<e.a> mutableSharedFlow = this.this$0.f95816b;
                        e.a.C0794a c0794a = new e.a.C0794a(!((e.b) r0.f95815a.getValue()).f95822a);
                        this.label = 1;
                        if (mutableSharedFlow.emit(c0794a, this) == coroutine_suspended) {
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
        public AnonymousClass2(C6853a c6853a, e eVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$binding = c6853a;
            this.this$0 = eVar;
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
                Flow flowA = UIComponentExtKt.a(this.$binding.f116888e);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputComponent$bind$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputComponent$bind$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C6853a $binding;
        int label;
        final e this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputComponent$bind$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputComponent$bind$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<e.b, Continuation<? super Unit>, Object> {
            final C6853a $binding;
            Object L$0;
            int label;
            final e this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C6853a c6853a, e eVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = c6853a;
                this.this$0 = eVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(e.b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                e.b bVar;
                AnimatorSet animatorSet;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    e.b bVar2 = (e.b) this.L$0;
                    this.$binding.f116886c.setHint(bVar2.f95823b);
                    bVar = bVar2;
                    if (bVar2.f95824c) {
                        bVar = bVar2;
                        if (bVar2.f95825d) {
                            final e eVar = this.this$0;
                            final C6853a c6853a = this.$binding;
                            this.L$0 = bVar2;
                            this.label = 1;
                            int i8 = e.f95812f;
                            eVar.getClass();
                            int i9 = e.h;
                            int i10 = e.f95812f;
                            if (bVar2.f95822a) {
                                animatorSet = new AnimatorSet();
                                final TintFrameLayout tintFrameLayout = c6853a.f116887d;
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c6853a.f116886c, "alpha", 0.0f, 1.0f);
                                objectAnimatorOfFloat.setDuration(200L);
                                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i9);
                                final ViewGroup.LayoutParams layoutParams = tintFrameLayout.getLayoutParams();
                                final ViewGroup.LayoutParams layoutParams2 = c6853a.f116884a.getLayoutParams();
                                if (layoutParams2.width != i9) {
                                    valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(layoutParams, tintFrameLayout, layoutParams2, c6853a) { // from class: com.bilibili.ship.theseus.playlist.offline.a

                                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                                        public final ViewGroup.LayoutParams f95801a;

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final TintFrameLayout f95802b;

                                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                                        public final ViewGroup.LayoutParams f95803c;

                                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                                        public final C6853a f95804d;

                                        {
                                            this.f95801a = layoutParams;
                                            this.f95802b = tintFrameLayout;
                                            this.f95803c = layoutParams2;
                                            this.f95804d = c6853a;
                                        }

                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                            ViewGroup.LayoutParams layoutParams3 = this.f95801a;
                                            TintFrameLayout tintFrameLayout2 = this.f95802b;
                                            ViewGroup.LayoutParams layoutParams4 = this.f95803c;
                                            C6853a c6853a2 = this.f95804d;
                                            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            layoutParams3.width = iIntValue;
                                            tintFrameLayout2.setLayoutParams(layoutParams3);
                                            layoutParams4.width = iIntValue;
                                            c6853a2.f116884a.setLayoutParams(layoutParams4);
                                        }
                                    });
                                    valueAnimatorOfInt.setDuration(250L);
                                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, ThemeUtils.getColorById(c6853a.f116884a.getContext(), R$color.f64616Wh0));
                                    valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(eVar, c6853a) { // from class: com.bilibili.ship.theseus.playlist.offline.b

                                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                                        public final e f95805a;

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final C6853a f95806b;

                                        {
                                            this.f95805a = eVar;
                                            this.f95806b = c6853a;
                                        }

                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                            e eVar2 = this.f95805a;
                                            C6853a c6853a2 = this.f95806b;
                                            eVar2.f95818d.setColor(!((e.b) eVar2.f95815a.getValue()).f95822a ? 0 : ContextCompat.getColor(c6853a2.f116884a.getContext(), R$color.f64616Wh0));
                                            if (valueAnimator.getAnimatedFraction() <= 0.6f) {
                                                eVar2.f95818d.setCornerRadius(e.f95813g);
                                            } else {
                                                GradientDrawable gradientDrawable = eVar2.f95818d;
                                                float f7 = e.f95813g;
                                                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, f7, f7, f7, f7, 0.0f, 0.0f});
                                            }
                                            c6853a2.f116888e.setBackground(eVar2.f95818d);
                                        }
                                    });
                                    valueAnimatorOfInt2.setDuration(250L);
                                    valueAnimatorOfInt2.setEvaluator(new ArgbEvaluator());
                                    animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt, valueAnimatorOfInt2);
                                    animatorSet.addListener(new g(c6853a));
                                }
                            } else {
                                animatorSet = new AnimatorSet();
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c6853a.f116886c, "alpha", 1.0f, 0.0f);
                                objectAnimatorOfFloat2.setDuration(200L);
                                ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(i9, i10);
                                final ViewGroup.LayoutParams layoutParams3 = c6853a.f116887d.getLayoutParams();
                                final ViewGroup.LayoutParams layoutParams4 = c6853a.f116884a.getLayoutParams();
                                if (layoutParams4.width != i10) {
                                    valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(layoutParams3, c6853a, layoutParams4) { // from class: com.bilibili.ship.theseus.playlist.offline.c

                                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                                        public final ViewGroup.LayoutParams f95807a;

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final C6853a f95808b;

                                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                                        public final ViewGroup.LayoutParams f95809c;

                                        {
                                            this.f95807a = layoutParams3;
                                            this.f95808b = c6853a;
                                            this.f95809c = layoutParams4;
                                        }

                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                            ViewGroup.LayoutParams layoutParams5 = this.f95807a;
                                            C6853a c6853a2 = this.f95808b;
                                            ViewGroup.LayoutParams layoutParams6 = this.f95809c;
                                            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                            layoutParams5.width = iIntValue;
                                            c6853a2.f116887d.setLayoutParams(layoutParams5);
                                            layoutParams6.width = iIntValue;
                                            c6853a2.f116884a.setLayoutParams(layoutParams6);
                                        }
                                    });
                                    valueAnimatorOfInt3.setDuration(250L);
                                    ValueAnimator valueAnimatorOfInt4 = ValueAnimator.ofInt(ThemeUtils.getColorById(c6853a.f116884a.getContext(), R$color.f64616Wh0), 0);
                                    valueAnimatorOfInt4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(eVar, c6853a) { // from class: com.bilibili.ship.theseus.playlist.offline.d

                                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                                        public final e f95810a;

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final C6853a f95811b;

                                        {
                                            this.f95810a = eVar;
                                            this.f95811b = c6853a;
                                        }

                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                            e eVar2 = this.f95810a;
                                            C6853a c6853a2 = this.f95811b;
                                            eVar2.f95818d.setColor(!((e.b) eVar2.f95815a.getValue()).f95822a ? 0 : ContextCompat.getColor(c6853a2.f116884a.getContext(), R$color.f64616Wh0));
                                            if (valueAnimator.getAnimatedFraction() <= 0.6f) {
                                                eVar2.f95818d.setCornerRadius(e.f95813g);
                                            } else {
                                                GradientDrawable gradientDrawable = eVar2.f95818d;
                                                float f7 = e.f95813g;
                                                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, f7, f7, f7, f7, 0.0f, 0.0f});
                                            }
                                            c6853a2.f116888e.setBackground(eVar2.f95818d);
                                        }
                                    });
                                    valueAnimatorOfInt4.setDuration(250L);
                                    valueAnimatorOfInt4.setEvaluator(new ArgbEvaluator());
                                    animatorSet.playTogether(objectAnimatorOfFloat2, valueAnimatorOfInt3, valueAnimatorOfInt4);
                                    animatorSet.addListener(new f(c6853a));
                                }
                            }
                            Object objA = Bj0.c.a(animatorSet, false, this);
                            if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objA = Unit.INSTANCE;
                            }
                            if (objA == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            bVar = bVar2;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.b bVar3 = (e.b) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    bVar = bVar3;
                }
                this.$binding.f116884a.setClickable(bVar.f95824c);
                this.$binding.f116888e.setImageResource(bVar.f95824c ? bVar.f95822a ? 2131234769 : 2131234761 : 2131234765);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(e eVar, C6853a c6853a, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$binding = c6853a;
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
                StateFlow<e.b> stateFlow = eVar.f95815a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, eVar, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public OfflineDanmakuInputComponent$bind$2(C6853a c6853a, e eVar, Continuation<? super OfflineDanmakuInputComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = c6853a;
        this.this$0 = eVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OfflineDanmakuInputComponent$bind$2 offlineDanmakuInputComponent$bind$2 = new OfflineDanmakuInputComponent$bind$2(this.$binding, this.this$0, continuation);
        offlineDanmakuInputComponent$bind$2.L$0 = obj;
        return offlineDanmakuInputComponent$bind$2;
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
        Context context = this.$binding.f116884a.getContext();
        this.$binding.f116884a.setVisibility(0);
        this.$binding.f116885b.setVisibility(8);
        e eVar = this.this$0;
        eVar.f95818d.setColor(!((e.b) eVar.f95815a.getValue()).f95822a ? 0 : ContextCompat.getColor(context, R$color.f64616Wh0));
        GradientDrawable gradientDrawable = this.this$0.f95818d;
        float f7 = e.f95813g;
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, f7, f7, f7, f7, 0.0f, 0.0f});
        this.$binding.f116888e.setBackground(this.this$0.f95818d);
        this.this$0.f95819e.setColor(ContextCompat.getColor(context, R$color.Ga0_s));
        this.this$0.f95819e.setStroke(NewPlayerUtilsKt.toPx(0.5f), ContextCompat.getColor(context, R$color.Ga2));
        this.this$0.f95819e.setCornerRadius(f7);
        this.$binding.f116887d.setBackground(this.this$0.f95819e);
        this.$binding.f116886c.setHintTextColor(ContextCompat.getColor(context, R$color.Ga3));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$binding, this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$binding, null), 3, (Object) null);
    }
}
