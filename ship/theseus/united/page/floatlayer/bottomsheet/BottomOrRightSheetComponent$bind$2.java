package com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet;

import android.content.Context;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.bilibili.droid.DimenUtilsKt;
import dv0.C6857c;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/BottomOrRightSheetComponent$bind$2.class */
final class BottomOrRightSheetComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final C6857c $binding;
    private Object L$0;
    int label;
    final c<ViewBinding> this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/BottomOrRightSheetComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final c<ViewBinding> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c<ViewBinding> cVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                c<ViewBinding> cVar = this.this$0;
                Object obj2 = cVar.f99717a;
                Object obj3 = obj2;
                if (obj2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
                    obj3 = null;
                }
                this.label = 1;
                if (cVar.d(obj3, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/BottomOrRightSheetComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C6857c $binding;
        int label;
        final c<ViewBinding> this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetComponent$bind$2$2$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/BottomOrRightSheetComponent$bind$2$2$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<Float, Boolean, Continuation<? super Pair<? extends Float, ? extends Boolean>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(float f7, boolean z6, Continuation<? super Pair<Float, Boolean>> continuation) {
                return AnonymousClass2.invokeSuspend$lambda$0(f7, z6, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).floatValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Pair<Float, Boolean>>) obj3);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetComponent$bind$2$2$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/BottomOrRightSheetComponent$bind$2$2$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Float, ? extends Boolean>, Continuation<? super Unit>, Object> {
            final View $topView;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(View view, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$topView = view;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$topView, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<Float, Boolean> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                float fFloatValue = ((Number) pair.component1()).floatValue();
                boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
                View view = this.$topView;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                if (!zBooleanValue) {
                    fFloatValue = 0.0f;
                }
                layoutParams2.matchConstraintPercentHeight = fFloatValue;
                view.setLayoutParams(layoutParams2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C6857c c6857c, c<ViewBinding> cVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$binding = c6857c;
            this.this$0 = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(float f7, boolean z6, Continuation continuation) {
            return new Pair(Boxing.boxFloat(f7), Boxing.boxBoolean(z6));
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
                View view = this.$binding.f116922g;
                c<ViewBinding> cVar = this.this$0;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(cVar.f99721e, cVar.f99719c, AnonymousClass3.INSTANCE));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(view, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetComponent$bind$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/BottomOrRightSheetComponent$bind$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C6857c $binding;
        int label;
        final c<ViewBinding> this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetComponent$bind$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/BottomOrRightSheetComponent$bind$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final C6857c $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C6857c c6857c, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = c6857c;
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
                CoordinatorLayout coordinatorLayout = this.$binding.f116921f;
                ViewGroup.LayoutParams layoutParams = coordinatorLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.matchConstraintMaxWidth = i7;
                coordinatorLayout.setLayoutParams(layoutParams2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(c<ViewBinding> cVar, C6857c c6857c, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$binding = c6857c;
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
                MutableStateFlow<Integer> mutableStateFlow = this.this$0.f99722f;
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetComponent$bind$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/BottomOrRightSheetComponent$bind$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C6857c $binding;
        final Context $context;
        int label;
        final c<ViewBinding> this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetComponent$bind$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/BottomOrRightSheetComponent$bind$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final Context $context;
            final ImageView $gestureBar;
            final LinearLayout $sheet;
            boolean Z$0;
            int label;
            final c<ViewBinding> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LinearLayout linearLayout, c<ViewBinding> cVar, Context context, ImageView imageView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$sheet = linearLayout;
                this.this$0 = cVar;
                this.$context = context;
                this.$gestureBar = imageView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sheet, this.this$0, this.$context, this.$gestureBar, continuation);
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
                this.$sheet.setBackground(this.this$0.k(this.$context));
                int i7 = -1;
                if (z6) {
                    this.$gestureBar.setImageResource(2131242102);
                    ImageView imageView = this.$gestureBar;
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = DimenUtilsKt.dpToPx(8);
                    marginLayoutParams.bottomMargin = DimenUtilsKt.dpToPx(8);
                    imageView.setLayoutParams(marginLayoutParams);
                    LinearLayout linearLayout = this.$sheet;
                    c<ViewBinding> cVar = this.this$0;
                    ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    if (!cVar.i()) {
                        i7 = -2;
                    }
                    layoutParams2.height = i7;
                    linearLayout.setLayoutParams(layoutParams2);
                } else {
                    this.$gestureBar.setImageDrawable(null);
                    ImageView imageView2 = this.$gestureBar;
                    ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams2.topMargin = DimenUtilsKt.dpToPx(4.5f);
                    marginLayoutParams2.bottomMargin = DimenUtilsKt.dpToPx(4.5f);
                    imageView2.setLayoutParams(marginLayoutParams2);
                    LinearLayout linearLayout2 = this.$sheet;
                    ViewGroup.LayoutParams layoutParams4 = linearLayout2.getLayoutParams();
                    if (layoutParams4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams4.height = -1;
                    linearLayout2.setLayoutParams(layoutParams4);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C6857c c6857c, c<ViewBinding> cVar, Context context, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$binding = c6857c;
            this.this$0 = cVar;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$binding, this.this$0, this.$context, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                C6857c c6857c = this.$binding;
                LinearLayout linearLayout = c6857c.f116920e;
                ImageView imageView = c6857c.f116918c;
                c<ViewBinding> cVar = this.this$0;
                MutableStateFlow<Boolean> mutableStateFlow = cVar.f99719c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(linearLayout, cVar, this.$context, imageView, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetComponent$bind$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/BottomOrRightSheetComponent$bind$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C6857c $binding;
        int label;
        final c<ViewBinding> this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetComponent$bind$2$5$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/BottomOrRightSheetComponent$bind$2$5$a.class */
        public static final class a implements Choreographer.FrameCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c<ViewBinding> f99710a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final View f99711b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final C6857c f99712c;

            public a(c<ViewBinding> cVar, View view, C6857c c6857c) {
                this.f99710a = cVar;
                this.f99711b = view;
                this.f99712c = c6857c;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j7) {
                TranslateAnimation translateAnimation = this.f99710a.f99718b;
                TranslateAnimation translateAnimation2 = translateAnimation;
                if (translateAnimation == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sheetAnimation");
                    translateAnimation2 = null;
                }
                if (translateAnimation2.hasEnded()) {
                    BLog.i("BottomOrRightSheetComponent$bind$2$5$1-doFrame", "[theseus-united-BottomOrRightSheetComponent$bind$2$5$1-doFrame] sheetAnimation hasEnded");
                    this.f99711b.setAlpha(1.0f);
                    return;
                }
                TranslateAnimation translateAnimation3 = this.f99710a.f99718b;
                if (translateAnimation3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sheetAnimation");
                    translateAnimation3 = null;
                }
                long startTime = translateAnimation3.getStartTime();
                if (startTime < 0) {
                    BLog.i("BottomOrRightSheetComponent$bind$2$5$1-doFrame", "[theseus-united-BottomOrRightSheetComponent$bind$2$5$1-doFrame] sheetAnimation startTime < 0");
                    Choreographer.getInstance().postFrameCallback(this);
                    return;
                }
                long drawingTime = this.f99712c.f116920e.getDrawingTime() - startTime;
                if (0 > drawingTime || drawingTime >= 301) {
                    this.f99711b.setAlpha(1.0f);
                } else {
                    this.f99711b.setAlpha(RangesKt.coerceAtLeast(drawingTime / 300.0f, 0.0f));
                }
                Choreographer.getInstance().postFrameCallback(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(C6857c c6857c, c<ViewBinding> cVar, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$binding = c6857c;
            this.this$0 = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.$binding, this.this$0, continuation);
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
            C6857c c6857c = this.$binding;
            View view = c6857c.f116919d;
            LinearLayout linearLayout = c6857c.f116920e;
            TranslateAnimation translateAnimation = this.this$0.f99718b;
            TranslateAnimation translateAnimation2 = translateAnimation;
            if (translateAnimation == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sheetAnimation");
                translateAnimation2 = null;
            }
            linearLayout.startAnimation(translateAnimation2);
            Choreographer.getInstance().postFrameCallback(new a(this.this$0, view, this.$binding));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomOrRightSheetComponent$bind$2(C6857c c6857c, c<ViewBinding> cVar, Continuation<? super BottomOrRightSheetComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = c6857c;
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BottomOrRightSheetComponent$bind$2 bottomOrRightSheetComponent$bind$2 = new BottomOrRightSheetComponent$bind$2(this.$binding, this.this$0, continuation);
        bottomOrRightSheetComponent$bind$2.L$0 = obj;
        return bottomOrRightSheetComponent$bind$2;
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
        Context context = this.$binding.f116916a.getContext();
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$binding, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.$binding, this.this$0, context, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.$binding, this.this$0, null), 3, (Object) null);
    }
}
