package com.bilibili.ship.theseus.united.page.weblayer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playerbizcommonv2.iconfont.PlayerIconFontView;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import dv0.K0;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3.class */
public final class TheseusWebUIComponent$bind$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final K0 $binding;
    final Context $context;
    private Object L$0;
    int label;
    final TheseusWebUIComponent this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$bind$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final K0 $binding;
        int label;
        final TheseusWebUIComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusWebUIComponent theseusWebUIComponent, K0 k02, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusWebUIComponent;
            this.$binding = k02;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener, java.lang.Object] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invokeSuspend(Object obj) {
            Object objCollectLatest;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusWebUIComponent theseusWebUIComponent = this.this$0;
                K0 k02 = this.$binding;
                this.label = 1;
                int i8 = TheseusWebUIComponent.f104181t;
                theseusWebUIComponent.getClass();
                k02.f116808a.setOnClickListener(new Object());
                TheseusWebUIComponent.a aVar = theseusWebUIComponent.f104184c;
                int i9 = aVar.f104200a ? 0 : 8;
                ConstraintLayout constraintLayout = k02.f116818l;
                constraintLayout.setVisibility(i9);
                boolean z6 = aVar.f104206g;
                k02.f116811d.setVisibility(z6 ? 0 : 8);
                int i10 = 8;
                if (!z6) {
                    i10 = 0;
                }
                TintImageView tintImageView = k02.f116810c;
                tintImageView.setVisibility(i10);
                TintTextView tintTextView = k02.f116817k;
                tintTextView.setText(aVar.f104201b);
                int i11 = aVar.f104203d;
                if (i11 != 0) {
                    tintTextView.setTextColor(i11);
                }
                int i12 = aVar.f104202c;
                if (i12 != 0) {
                    constraintLayout.setBackgroundColor(i12);
                }
                int i13 = aVar.f104204e;
                if (i13 != 0) {
                    k02.f116819m.setBackgroundColor(i13);
                }
                int i14 = aVar.f104205f;
                if (i14 != 0) {
                    Drawable drawableWrap = DrawableCompat.wrap(tintImageView.getDrawable().mutate());
                    DrawableCompat.setTint(drawableWrap, i14);
                    DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
                    tintImageView.setImageDrawable(drawableWrap);
                }
                Context context = k02.f116808a.getContext();
                int i15 = aVar.h;
                if (i15 != -1) {
                    k02.f116809b.setBackgroundResource(i15);
                } else {
                    View view = k02.f116809b;
                    int color = aVar.f104207i;
                    if (color == -1) {
                        color = ContextCompat.getColor(context, R$color.f64616Wh0);
                    }
                    view.setBackgroundColor(color);
                }
                View innerView = k02.f116821o.getInnerView();
                if (innerView != null) {
                    int color2 = aVar.f104208j;
                    if (color2 == -1) {
                        color2 = ContextCompat.getColor(context, R$color.f64616Wh0);
                    }
                    innerView.setBackgroundColor(color2);
                }
                LinearLayout linearLayout = k02.f116813f;
                int color3 = aVar.f104209k;
                if (color3 == -1) {
                    color3 = ContextCompat.getColor(context, R$color.f64616Wh0);
                }
                linearLayout.setBackgroundColor(color3);
                LinearLayout linearLayout2 = k02.f116814g;
                int color4 = aVar.f104210l;
                if (color4 == -1) {
                    color4 = ContextCompat.getColor(context, R$color.f64616Wh0);
                }
                linearLayout2.setBackgroundColor(color4);
                if (aVar.f104217s) {
                    objCollectLatest = FlowKt.collectLatest(aVar.f104218t, new TheseusWebUIComponent$initWebUIByConfig$3(theseusWebUIComponent, k02, null), this);
                    if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollectLatest = Unit.INSTANCE;
                    }
                } else {
                    objCollectLatest = Unit.INSTANCE;
                }
                if (objCollectLatest == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$bind$3$10, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$10.class */
    public static final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final K0 $binding;
        int label;
        final TheseusWebUIComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$bind$3$10$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$10$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final K0 $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(K0 k02, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = k02;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
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
                int i7 = this.I$0;
                View view = this.$binding.f116820n;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.matchConstraintMaxWidth = i7;
                view.setLayoutParams(layoutParams2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(TheseusWebUIComponent theseusWebUIComponent, K0 k02, Continuation<? super AnonymousClass10> continuation) {
            super(2, continuation);
            this.this$0 = theseusWebUIComponent;
            this.$binding = k02;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass10(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<Integer> mutableStateFlow = this.this$0.f104190j;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$bind$3$11, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$11.class */
    public static final class AnonymousClass11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final K0 $binding;
        int label;
        final TheseusWebUIComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$bind$3$11$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$11$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final K0 $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(K0 k02, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = k02;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
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
                int i7 = this.I$0;
                View view = this.$binding.f116820n;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = i7;
                view.setLayoutParams(layoutParams);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(TheseusWebUIComponent theseusWebUIComponent, K0 k02, Continuation<? super AnonymousClass11> continuation) {
            super(2, continuation);
            this.this$0 = theseusWebUIComponent;
            this.$binding = k02;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass11(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<Integer> mutableStateFlow = this.this$0.f104191k;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$bind$3$12, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$12.class */
    public static final class AnonymousClass12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final K0 $binding;
        int label;
        final TheseusWebUIComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$bind$3$12$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$12$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final K0 $binding;
            boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(K0 k02, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = k02;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                K0 k02 = this.$binding;
                View view = k02.f116816j;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                if (z6) {
                    layoutParams2.topToBottom = -1;
                    layoutParams2.topToTop = 0;
                } else {
                    layoutParams2.topToBottom = k02.f116820n.getId();
                    layoutParams2.topToTop = -1;
                }
                view.setLayoutParams(layoutParams2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(TheseusWebUIComponent theseusWebUIComponent, K0 k02, Continuation<? super AnonymousClass12> continuation) {
            super(2, continuation);
            this.this$0 = theseusWebUIComponent;
            this.$binding = k02;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass12(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<Boolean> mutableStateFlow = this.this$0.f104192l;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$bind$3$13, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$13.class */
    public static final class AnonymousClass13 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final K0 $binding;
        int label;
        final TheseusWebUIComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$bind$3$13$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$13$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusWebUIComponent f104220a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final K0 f104221b;

            public a(TheseusWebUIComponent theseusWebUIComponent, K0 k02) {
                this.f104220a = theseusWebUIComponent;
                this.f104221b = k02;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                TheseusWebUIComponent.c cVar = (TheseusWebUIComponent.c) obj;
                TheseusWebUIComponent theseusWebUIComponent = this.f104220a;
                boolean z6 = theseusWebUIComponent.f104184c.f104216r;
                K0 k02 = this.f104221b;
                if (z6 && theseusWebUIComponent.f104199s) {
                    for (LinearLayout linearLayout : CollectionsKt.listOf(new LinearLayout[]{k02.f116813f, k02.f116814g})) {
                        linearLayout.setTranslationY(0.0f);
                        linearLayout.setTranslationX(0.0f);
                    }
                }
                if (Intrinsics.areEqual(cVar, TheseusWebUIComponent.c.b.f104224a)) {
                    k02.f116821o.setVisibility(4);
                    k02.f116814g.setVisibility(8);
                    k02.f116813f.setVisibility(0);
                    k02.f116812e.playAnimation();
                } else if (Intrinsics.areEqual(cVar, TheseusWebUIComponent.c.C1158c.f104225a)) {
                    k02.f116821o.setVisibility(0);
                    k02.f116814g.setVisibility(8);
                    k02.f116813f.setVisibility(8);
                    k02.f116812e.cancelAnimation();
                } else {
                    if (!Intrinsics.areEqual(cVar, TheseusWebUIComponent.c.a.f104223a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    k02.f116821o.setVisibility(4);
                    k02.f116814g.setVisibility(0);
                    k02.f116813f.setVisibility(8);
                    k02.f116812e.cancelAnimation();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(TheseusWebUIComponent theseusWebUIComponent, K0 k02, Continuation<? super AnonymousClass13> continuation) {
            super(2, continuation);
            this.this$0 = theseusWebUIComponent;
            this.$binding = k02;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass13(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusWebUIComponent theseusWebUIComponent = this.this$0;
                MutableStateFlow<TheseusWebUIComponent.c> mutableStateFlow = theseusWebUIComponent.f104196p;
                a aVar = new a(theseusWebUIComponent, this.$binding);
                this.label = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$bind$3$14, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$14.class */
    public static final class AnonymousClass14 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final K0 $binding;
        int label;
        final TheseusWebUIComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(TheseusWebUIComponent theseusWebUIComponent, K0 k02, Continuation<? super AnonymousClass14> continuation) {
            super(2, continuation);
            this.this$0 = theseusWebUIComponent;
            this.$binding = k02;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass14(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusWebUIComponent theseusWebUIComponent = this.this$0;
                K0 k02 = this.$binding;
                this.label = 1;
                int i8 = TheseusWebUIComponent.f104181t;
                theseusWebUIComponent.getClass();
                if (CoroutineScopeKt.coroutineScope(new TheseusWebUIComponent$initWebView$2(theseusWebUIComponent, k02, null), this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$bind$3$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$8.class */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final K0 $binding;
        int label;
        final TheseusWebUIComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$bind$3$8$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$8$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final K0 $binding;
            int I$0;
            int label;
            final TheseusWebUIComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(K0 k02, TheseusWebUIComponent theseusWebUIComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = k02;
                this.this$0 = theseusWebUIComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.this$0, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
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
                int i7 = this.I$0;
                final BiliWebView biliWebView = this.$binding.f116821o;
                ViewGroup.LayoutParams layoutParams = biliWebView.getLayoutParams();
                int i8 = this.this$0.h - i7;
                if (i8 <= 0 || i7 <= 0) {
                    layoutParams.height = -1;
                } else {
                    layoutParams.height = i8;
                }
                if (biliWebView.isInLayout() || !biliWebView.isLayoutRequested()) {
                    Boxing.boxBoolean(biliWebView.post(new Runnable(biliWebView) { // from class: com.bilibili.ship.theseus.united.page.weblayer.y

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final BiliWebView f104306a;

                        {
                            this.f104306a = biliWebView;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f104306a.requestLayout();
                        }
                    }));
                } else {
                    biliWebView.requestLayout();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(TheseusWebUIComponent theseusWebUIComponent, K0 k02, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.this$0 = theseusWebUIComponent;
            this.$binding = k02;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass8(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusWebUIComponent theseusWebUIComponent = this.this$0;
                MutableStateFlow<Integer> mutableStateFlow = theseusWebUIComponent.f104189i;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, theseusWebUIComponent, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$bind$3$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$9.class */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final K0 $binding;
        int label;
        final TheseusWebUIComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$bind$3$9$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$9$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final K0 $binding;
            int I$0;
            int label;
            final TheseusWebUIComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(K0 k02, TheseusWebUIComponent theseusWebUIComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = k02;
                this.this$0 = theseusWebUIComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.this$0, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
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
                if (this.I$0 == 0) {
                    return Unit.INSTANCE;
                }
                K0 k02 = this.$binding;
                TheseusWebUIComponent theseusWebUIComponent = this.this$0;
                int i7 = TheseusWebUIComponent.f104181t;
                k02.f116808a.getViewTreeObserver().addOnGlobalLayoutListener(new A(theseusWebUIComponent, k02));
                final BiliWebView biliWebView = this.$binding.f116821o;
                if (biliWebView.isInLayout() || !biliWebView.isLayoutRequested()) {
                    Boxing.boxBoolean(biliWebView.post(new Runnable(biliWebView) { // from class: com.bilibili.ship.theseus.united.page.weblayer.z

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final BiliWebView f104307a;

                        {
                            this.f104307a = biliWebView;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f104307a.requestLayout();
                        }
                    }));
                } else {
                    biliWebView.requestLayout();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(TheseusWebUIComponent theseusWebUIComponent, K0 k02, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = theseusWebUIComponent;
            this.$binding = k02;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass9(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusWebUIComponent theseusWebUIComponent = this.this$0;
                MutableStateFlow<Integer> mutableStateFlow = theseusWebUIComponent.f104193m;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, theseusWebUIComponent, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$bind$3$a.class */
    public static final class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusWebUIComponent f104222a;

        public a(TheseusWebUIComponent theseusWebUIComponent) {
            this.f104222a = theseusWebUIComponent;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f104222a.f104199s = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusWebUIComponent$bind$3(TheseusWebUIComponent theseusWebUIComponent, K0 k02, Context context, Continuation<? super TheseusWebUIComponent$bind$3> continuation) {
        super(2, continuation);
        this.this$0 = theseusWebUIComponent;
        this.$binding = k02;
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(TheseusWebUIComponent theseusWebUIComponent, final K0 k02, final List list) {
        final boolean zBooleanValue = ((Boolean) theseusWebUIComponent.f104184c.f104218t.getValue()).booleanValue();
        float width = zBooleanValue ? k02.f116808a.getWidth() : k02.f116808a.getHeight();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (zBooleanValue) {
                view.setTranslationX(width);
            } else {
                view.setTranslationY(width);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(width, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(list, zBooleanValue) { // from class: com.bilibili.ship.theseus.united.page.weblayer.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f104303a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f104304b;

            {
                this.f104303a = list;
                this.f104304b = zBooleanValue;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TheseusWebUIComponent$bind$3.invokeSuspend$lambda$1$1$0(this.f104303a, this.f104304b, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(k02) { // from class: com.bilibili.ship.theseus.united.page.weblayer.x

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final K0 f104305a;

            {
                this.f104305a = k02;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TheseusWebUIComponent$bind$3.invokeSuspend$lambda$1$2$0(this.f104305a, valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new a(theseusWebUIComponent));
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1$1$0(List list, boolean z6, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (z6) {
                view.setTranslationX(fFloatValue);
            } else {
                view.setTranslationY(fFloatValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1$2$0(K0 k02, ValueAnimator valueAnimator) {
        k02.f116816j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$5(CoroutineScope coroutineScope, TheseusWebUIComponent theseusWebUIComponent, K0 k02, View view) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TheseusWebUIComponent$bind$3$7$1(theseusWebUIComponent, k02, null), 3, (Object) null);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusWebUIComponent$bind$3 theseusWebUIComponent$bind$3 = new TheseusWebUIComponent$bind$3(this.this$0, this.$binding, this.$context, continuation);
        theseusWebUIComponent$bind$3.L$0 = obj;
        return theseusWebUIComponent$bind$3;
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
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this.this$0, this.$binding, null), 1, (Object) null);
        if (this.this$0.f104184c.f104216r) {
            this.$binding.f116808a.clearAnimation();
            this.$binding.f116808a.setAlpha(1.0f);
            this.$binding.f116816j.setAlpha(0.0f);
            K0 k02 = this.$binding;
            final List listListOf = CollectionsKt.listOf(new View[]{k02.f116820n, k02.f116809b, k02.f116818l, k02.f116813f, k02.f116814g, k02.f116811d});
            List<View> list = listListOf;
            TheseusWebUIComponent theseusWebUIComponent = this.this$0;
            for (View view : list) {
                if (((Boolean) theseusWebUIComponent.f104184c.f104218t.getValue()).booleanValue()) {
                    view.setTranslationX(10000.0f);
                } else {
                    view.setTranslationY(10000.0f);
                }
            }
            final K0 k03 = this.$binding;
            ConstraintLayout constraintLayout = k03.f116808a;
            final TheseusWebUIComponent theseusWebUIComponent2 = this.this$0;
            constraintLayout.post(new Runnable(theseusWebUIComponent2, k03, listListOf) { // from class: com.bilibili.ship.theseus.united.page.weblayer.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TheseusWebUIComponent f104294a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final K0 f104295b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final List f104296c;

                {
                    this.f104294a = theseusWebUIComponent2;
                    this.f104295b = k03;
                    this.f104296c = listListOf;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TheseusWebUIComponent$bind$3.invokeSuspend$lambda$1(this.f104294a, this.f104295b, this.f104296c);
                }
            });
        }
        TintImageView tintImageView = this.$binding.f116810c;
        final TheseusWebUIComponent theseusWebUIComponent3 = this.this$0;
        tintImageView.setOnClickListener(new View.OnClickListener(theseusWebUIComponent3) { // from class: com.bilibili.ship.theseus.united.page.weblayer.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusWebUIComponent f104297a;

            {
                this.f104297a = theseusWebUIComponent3;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f104297a.d();
            }
        });
        PlayerIconFontView playerIconFontView = this.$binding.f116811d;
        final TheseusWebUIComponent theseusWebUIComponent4 = this.this$0;
        playerIconFontView.setOnClickListener(new View.OnClickListener(theseusWebUIComponent4) { // from class: com.bilibili.ship.theseus.united.page.weblayer.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusWebUIComponent f104298a;

            {
                this.f104298a = theseusWebUIComponent4;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f104298a.d();
            }
        });
        View view2 = this.$binding.f116816j;
        final TheseusWebUIComponent theseusWebUIComponent5 = this.this$0;
        view2.setOnClickListener(new View.OnClickListener(theseusWebUIComponent5) { // from class: com.bilibili.ship.theseus.united.page.weblayer.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusWebUIComponent f104299a;

            {
                this.f104299a = theseusWebUIComponent5;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f104299a.d();
            }
        });
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.$context.getText(2131851578));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.$context, R$color.Pi5_u)), 5, 9, 17);
        this.$binding.h.setText(spannableStringBuilder);
        final K0 k04 = this.$binding;
        TextView textView = k04.h;
        final TheseusWebUIComponent theseusWebUIComponent6 = this.this$0;
        textView.setOnClickListener(new View.OnClickListener(coroutineScope, theseusWebUIComponent6, k04) { // from class: com.bilibili.ship.theseus.united.page.weblayer.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CoroutineScope f104300a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TheseusWebUIComponent f104301b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final K0 f104302c;

            {
                this.f104300a = coroutineScope;
                this.f104301b = theseusWebUIComponent6;
                this.f104302c = k04;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                TheseusWebUIComponent$bind$3.invokeSuspend$lambda$5(this.f104300a, this.f104301b, this.f104302c, view3);
            }
        });
        K0 k05 = this.$binding;
        k05.f116808a.getViewTreeObserver().addOnGlobalLayoutListener(new A(this.this$0, k05));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass8(this.this$0, this.$binding, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass9(this.this$0, this.$binding, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass10(this.this$0, this.$binding, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass11(this.this$0, this.$binding, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass12(this.this$0, this.$binding, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass13(this.this$0, this.$binding, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass14(this.this$0, this.$binding, null), 3, (Object) null);
    }
}
