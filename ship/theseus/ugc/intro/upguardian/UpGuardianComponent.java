package com.bilibili.ship.theseus.ugc.intro.upguardian;

import HG0.C2081f;
import I.E;
import Vu0.N;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.upguardian.UpGuardianSectionView;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianComponent.class */
@StabilityInferred(parameters = 0)
public final class UpGuardianComponent implements UIComponent<n<N>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f97565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f97566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f97567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final g f97568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final h f97569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final i f97570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C2081f f97571g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ValueAnimator f97572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ValueAnimator f97573j;
    public final int h = NewPlayerUtilsKt.toPx(70.0f);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f97574k = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianComponent$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f97575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f97576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final UpGuardianSectionView.a f97577c;

        public a(@NotNull String str, @NotNull String str2, @NotNull UpGuardianSectionView.a aVar) {
            this.f97575a = str;
            this.f97576b = str2;
            this.f97577c = aVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f97575a, aVar.f97575a) && Intrinsics.areEqual(this.f97576b, aVar.f97576b) && Intrinsics.areEqual(this.f97577c, aVar.f97577c);
        }

        public final int hashCode() {
            return this.f97577c.hashCode() + E.a(this.f97575a.hashCode() * 31, 31, this.f97576b);
        }

        @NotNull
        public final String toString() {
            return "UpGuardianUIState(title=" + this.f97575a + ", subtitle=" + this.f97576b + ", contractSectionData=" + this.f97577c + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianComponent$b.class */
    public static final class b implements UpGuardianSectionView.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpGuardianComponent f97578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final N f97579b;

        public b(UpGuardianComponent upGuardianComponent, N n7) {
            this.f97578a = upGuardianComponent;
            this.f97579b = n7;
        }

        public final void a() {
            N n7 = this.f97579b;
            final UpGuardianSectionView upGuardianSectionView = n7.f25863a;
            UpGuardianComponent upGuardianComponent = this.f97578a;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(upGuardianComponent.h, 0);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(upGuardianSectionView) { // from class: com.bilibili.ship.theseus.ugc.intro.upguardian.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final View f97611a;

                {
                    this.f97611a = upGuardianSectionView;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    View view = this.f97611a;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.setLayoutParams(layoutParams);
                }
            });
            valueAnimatorOfInt.addListener(new d(upGuardianComponent));
            upGuardianComponent.f97573j = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
            upGuardianComponent.f97569e.invoke();
            n7.f25864b.j0(1L);
        }

        public final void b() {
            this.f97578a.f97568d.invoke();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianComponent$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianComponent$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        Object result;
        final UpGuardianComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UpGuardianComponent upGuardianComponent, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = upGuardianComponent;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianComponent$bindToView$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianComponent$bindToView$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
        final N $binding;
        final UpGuardianSectionView $root;
        private Object L$0;
        int label;
        final UpGuardianComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianComponent$bindToView$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianComponent$bindToView$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final UpGuardianSectionView $root;
            int label;
            final UpGuardianComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianComponent$bindToView$3$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianComponent$bindToView$3$1$1.class */
            public static final class C08801 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
                final UpGuardianSectionView $root;
                int I$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08801(UpGuardianSectionView upGuardianSectionView, Continuation<? super C08801> continuation) {
                    super(2, continuation);
                    this.$root = upGuardianSectionView;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08801 c08801 = new C08801(this.$root, continuation);
                    c08801.I$0 = ((Number) obj).intValue();
                    return c08801;
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
                    int iDpToPx = DimenUtilsKt.dpToPx(RangesKt.coerceAtLeast(this.I$0 - 12, 0));
                    UpGuardianSectionView upGuardianSectionView = this.$root;
                    upGuardianSectionView.setPadding(iDpToPx, upGuardianSectionView.getPaddingTop(), iDpToPx, this.$root.getPaddingBottom());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UpGuardianComponent upGuardianComponent, UpGuardianSectionView upGuardianSectionView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = upGuardianComponent;
                this.$root = upGuardianSectionView;
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
                    StateFlow<Integer> stateFlow = this.this$0.f97566b;
                    C08801 c08801 = new C08801(this.$root, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c08801, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianComponent$bindToView$3$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianComponent$bindToView$3$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final N $binding;
            int label;
            final UpGuardianComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianComponent$bindToView$3$2$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianComponent$bindToView$3$2$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final N $binding;
                boolean Z$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(N n7, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$binding = n7;
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
                    this.$binding.f25864b.setArrowNearContent(this.Z$0);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(UpGuardianComponent upGuardianComponent, N n7, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = upGuardianComponent;
                this.$binding = n7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$binding, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Boolean> stateFlow = this.this$0.f97567c;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, null);
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
        public AnonymousClass3(UpGuardianComponent upGuardianComponent, UpGuardianSectionView upGuardianSectionView, N n7, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = upGuardianComponent;
            this.$root = upGuardianSectionView;
            this.$binding = n7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$root, this.$binding, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$root, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$binding, null), 3, (Object) null);
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
                UpGuardianComponent upGuardianComponent = this.this$0;
                ValueAnimator valueAnimator = upGuardianComponent.f97572i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    valueAnimator.removeAllListeners();
                    valueAnimator.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator2 = upGuardianComponent.f97573j;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    valueAnimator2.removeAllListeners();
                    valueAnimator2.removeAllUpdateListeners();
                }
                throw th;
            }
        }
    }

    public UpGuardianComponent(@NotNull a aVar, @NotNull StateFlow stateFlow, @NotNull StateFlow stateFlow2, @NotNull g gVar, @NotNull h hVar, @NotNull i iVar, @NotNull C2081f c2081f) {
        this.f97565a = aVar;
        this.f97566b = stateFlow;
        this.f97567c = stateFlow2;
        this.f97568d = gVar;
        this.f97569e = hVar;
        this.f97570f = iVar;
        this.f97571g = c2081f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.app.gemini.ui.n<Vu0.N> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianComponent.bindToView(com.bilibili.app.gemini.ui.n, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new n(N.inflate(LayoutInflater.from(context), viewGroup, false));
    }
}
