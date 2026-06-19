package com.bilibili.ship.theseus.ugc.intro.uplikes;

import Vu0.I;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bilibili.app.comm.list.common.widget.BubbleBackgroundConstraintLayout;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.playerbizcommonv2.view.CustomMarqueeTextView;
import com.bilibili.ship.theseus.ugc.intro.uplikes.c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesComponent$bindToView$2.class */
final class UgcUpLikesComponent$bindToView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final I $binding;
    final Context $context;
    final Ref.IntRef $nameLayoutWidth;
    final BubbleBackgroundConstraintLayout $root;
    final n<I> $viewEntry;
    private Object L$0;
    int label;
    final c this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesComponent$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesComponent$bindToView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final BubbleBackgroundConstraintLayout $root;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesComponent$bindToView$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesComponent$bindToView$2$1$1.class */
        public static final class C08831 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final BubbleBackgroundConstraintLayout $root;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08831(BubbleBackgroundConstraintLayout bubbleBackgroundConstraintLayout, Continuation<? super C08831> continuation) {
                super(2, continuation);
                this.$root = bubbleBackgroundConstraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08831 c08831 = new C08831(this.$root, continuation);
                c08831.I$0 = ((Number) obj).intValue();
                return c08831;
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
                BubbleBackgroundConstraintLayout bubbleBackgroundConstraintLayout = this.$root;
                ViewGroup.LayoutParams layoutParams = bubbleBackgroundConstraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.rightMargin = iDpToPx;
                marginLayoutParams.leftMargin = iDpToPx;
                bubbleBackgroundConstraintLayout.setLayoutParams(marginLayoutParams);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, BubbleBackgroundConstraintLayout bubbleBackgroundConstraintLayout, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$root = bubbleBackgroundConstraintLayout;
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
                StateFlow<Integer> stateFlow = this.this$0.f97705c;
                C08831 c08831 = new C08831(this.$root, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c08831, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesComponent$bindToView$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesComponent$bindToView$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final I $binding;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesComponent$bindToView$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesComponent$bindToView$2$2$1.class */
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
                this.this$0.f97706d.tryEmit(c.a.C0888a.f97709a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(I i7, c cVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$binding = i7;
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
                Flow flowA = UIComponentExtKt.a(this.$binding.f25830a);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesComponent$bindToView$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesComponent$bindToView$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final I $binding;
        final Context $context;
        final n<I> $viewEntry;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesComponent$bindToView$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesComponent$bindToView$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<c.b, Continuation<? super Unit>, Object> {
            final I $binding;
            final Context $context;
            final n<I> $viewEntry;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(n<I> nVar, I i7, Context context, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$viewEntry = nVar;
                this.$binding = i7;
                this.$context = context;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewEntry, this.$binding, this.$context, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(c.b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c.b bVar = (c.b) this.L$0;
                if (Intrinsics.areEqual(bVar, c.b.C0890b.f97719a)) {
                    this.$viewEntry.a.getRoot().getLayoutParams().height = 0;
                } else {
                    c.b.a aVar = (c.b.a) bVar;
                    CustomMarqueeTextView customMarqueeTextView = this.$binding.f25841m;
                    customMarqueeTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                    customMarqueeTextView.setSingleLine(true);
                    customMarqueeTextView.setFocusable(true);
                    customMarqueeTextView.setFocusableInTouchMode(true);
                    customMarqueeTextView.setMarqueeRepeatLimit(-1);
                    customMarqueeTextView.setHorizontallyScrolling(true);
                    this.$binding.f25841m.setCustomMarqueeEnable(true);
                    this.$binding.f25841m.setText(aVar.f97712a);
                    this.$binding.f25840l.setText(aVar.f97718g);
                    c.b(this.$binding.f25831b, this.$context, aVar.f97713b);
                    Context context = this.$context;
                    BiliImageView biliImageView = this.$binding.f25832c;
                    String str = aVar.f97714c;
                    c.b(biliImageView, context, str);
                    Context context2 = this.$context;
                    BiliImageView biliImageView2 = this.$binding.f25834e;
                    String str2 = aVar.f97715d;
                    c.b(biliImageView2, context2, str2);
                    Context context3 = this.$context;
                    BiliImageView biliImageView3 = this.$binding.f25836g;
                    String str3 = aVar.f97716e;
                    c.b(biliImageView3, context3, str3);
                    this.$binding.f25833d.setVisibility(str.length() > 0 ? 0 : 8);
                    this.$binding.f25835f.setVisibility(str2.length() > 0 ? 0 : 8);
                    this.$binding.h.setVisibility(str3.length() > 0 ? 0 : 8);
                    BiliImageView biliImageView4 = this.$binding.f25837i;
                    boolean z6 = aVar.f97717f;
                    biliImageView4.setVisibility(z6 ? 0 : 8);
                    this.$binding.f25838j.setVisibility(z6 ? 0 : 8);
                    this.$binding.f25839k.setVisibility(aVar.h ? 0 : 8);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(c cVar, n<I> nVar, I i7, Context context, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$viewEntry = nVar;
            this.$binding = i7;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$viewEntry, this.$binding, this.$context, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<c.b> stateFlow = this.this$0.f97703a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewEntry, this.$binding, this.$context, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesComponent$bindToView$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesComponent$bindToView$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final I $binding;
        final Context $context;
        final Ref.IntRef $nameLayoutWidth;
        private Object L$0;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesComponent$bindToView$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesComponent$bindToView$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final CoroutineScope $$this$launch;
            final I $binding;
            final Context $context;
            final Ref.IntRef $nameLayoutWidth;
            boolean Z$0;
            int label;
            final c this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesComponent$bindToView$2$4$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesComponent$bindToView$2$4$1$a.class */
            public static final class a implements View.OnLayoutChangeListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Ref.IntRef f97635a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final I f97636b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final CoroutineScope f97637c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Context f97638d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final c f97639e;

                public a(Ref.IntRef intRef, I i7, CoroutineScope coroutineScope, Context context, c cVar) {
                    this.f97635a = intRef;
                    this.f97636b = i7;
                    this.f97637c = coroutineScope;
                    this.f97638d = context;
                    this.f97639e = cVar;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                    view.removeOnLayoutChangeListener(this);
                    this.f97635a.element = this.f97636b.f25842n.getMeasuredWidth();
                    BuildersKt.launch$default(this.f97637c, (CoroutineContext) null, (CoroutineStart) null, new UgcUpLikesComponent$bindToView$2$4$1$1$1(this.f97638d, this.f97635a, this.f97636b, this.f97639e, null), 3, (Object) null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(I i7, Ref.IntRef intRef, CoroutineScope coroutineScope, Context context, c cVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = i7;
                this.$nameLayoutWidth = intRef;
                this.$$this$launch = coroutineScope;
                this.$context = context;
                this.this$0 = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.$nameLayoutWidth, this.$$this$launch, this.$context, this.this$0, continuation);
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
                if (!this.Z$0) {
                    return Unit.INSTANCE;
                }
                c.c(this.$binding, 0);
                this.$binding.f25841m.setAlpha(1.0f);
                I i7 = this.$binding;
                FrameLayout frameLayout = i7.f25842n;
                Ref.IntRef intRef = this.$nameLayoutWidth;
                CoroutineScope coroutineScope = this.$$this$launch;
                Context context = this.$context;
                c cVar = this.this$0;
                if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
                    frameLayout.addOnLayoutChangeListener(new a(intRef, i7, coroutineScope, context, cVar));
                } else {
                    intRef.element = i7.f25842n.getMeasuredWidth();
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UgcUpLikesComponent$bindToView$2$4$1$1$1(context, intRef, i7, cVar, null), 3, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(c cVar, I i7, Ref.IntRef intRef, Context context, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$binding = i7;
            this.$nameLayoutWidth = intRef;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$binding, this.$nameLayoutWidth, this.$context, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                c cVar = this.this$0;
                StateFlow<Boolean> stateFlow = cVar.f97704b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.$nameLayoutWidth, coroutineScope, this.$context, cVar, null);
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
    public UgcUpLikesComponent$bindToView$2(I i7, c cVar, BubbleBackgroundConstraintLayout bubbleBackgroundConstraintLayout, n<I> nVar, Context context, Ref.IntRef intRef, Continuation<? super UgcUpLikesComponent$bindToView$2> continuation) {
        super(2, continuation);
        this.$binding = i7;
        this.this$0 = cVar;
        this.$root = bubbleBackgroundConstraintLayout;
        this.$viewEntry = nVar;
        this.$context = context;
        this.$nameLayoutWidth = intRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcUpLikesComponent$bindToView$2 ugcUpLikesComponent$bindToView$2 = new UgcUpLikesComponent$bindToView$2(this.$binding, this.this$0, this.$root, this.$viewEntry, this.$context, this.$nameLayoutWidth, continuation);
        ugcUpLikesComponent$bindToView$2.L$0 = obj;
        return ugcUpLikesComponent$bindToView$2;
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
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$root, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$viewEntry, this.$binding, this.$context, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$binding, this.$nameLayoutWidth, this.$context, null), 3, (Object) null);
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.$binding.f25830a, this.this$0.f97708f);
        return Unit.INSTANCE;
    }
}
