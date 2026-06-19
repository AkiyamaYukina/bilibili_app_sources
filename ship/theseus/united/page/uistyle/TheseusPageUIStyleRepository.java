package com.bilibili.ship.theseus.united.page.uistyle;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.i;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ogv.infra.android.view.ViewTraversalKt;
import com.bilibili.playerbizcommonv2.utils.f;
import com.bilibili.ship.theseus.united.page.behavior.CollapsablePinnedBottomScrollingBehavior;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PlayerHiddenScrollingViewBehavior;
import com.bilibili.ship.theseus.united.widget.TouchAwareConstraintLayout;
import com.bilibili.ship.theseus.united.widget.UnitedTabLayout;
import com.google.android.material.tabs.TabLayout;
import gv0.C7382c;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IControlContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository.class */
@StabilityInferred(parameters = 0)
public final class TheseusPageUIStyleRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f103493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f103494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Flow<b> f103495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f103496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Context f103497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final c f103498g = new yv0.a();

    @NotNull
    public final d h = new yv0.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<PlayerHiddenScrollingViewBehavior.State> f103499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final StateFlow<PlayerHiddenScrollingViewBehavior.State> f103500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f103501k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f103502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f103503m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f103504n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f103505o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f103506p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f103507q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f103508r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f103509s;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPageUIStyleRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1$1.class */
        public static final class C11401 extends SuspendLambda implements Function2<b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusPageUIStyleRepository this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1$1$1.class */
            public static final class C11411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final PlayerHiddenScrollingViewBehavior $behavior;
                final b $views;
                private Object L$0;
                int label;
                final TheseusPageUIStyleRepository this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1$1$1$1.class */
                public static final class C11421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final PlayerHiddenScrollingViewBehavior $behavior;
                    int label;
                    final TheseusPageUIStyleRepository this$0;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1$1$1$1$1.class */
                    public static final class C11431 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                        final PlayerHiddenScrollingViewBehavior $behavior;
                        boolean Z$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C11431(PlayerHiddenScrollingViewBehavior playerHiddenScrollingViewBehavior, Continuation<? super C11431> continuation) {
                            super(2, continuation);
                            this.$behavior = playerHiddenScrollingViewBehavior;
                        }

                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C11431 c11431 = new C11431(this.$behavior, continuation);
                            c11431.Z$0 = ((Boolean) obj).booleanValue();
                            return c11431;
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
                            this.$behavior.setHideByDrag(!this.Z$0);
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11421(TheseusPageUIStyleRepository theseusPageUIStyleRepository, PlayerHiddenScrollingViewBehavior playerHiddenScrollingViewBehavior, Continuation<? super C11421> continuation) {
                        super(2, continuation);
                        this.this$0 = theseusPageUIStyleRepository;
                        this.$behavior = playerHiddenScrollingViewBehavior;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C11421(this.this$0, this.$behavior, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            StateFlow<Boolean> stateFlow = this.this$0.f103498g.f129911c;
                            C11431 c11431 = new C11431(this.$behavior, null);
                            this.label = 1;
                            if (FlowKt.collectLatest(stateFlow, c11431, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1$1$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1$1$1$2.class */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final PlayerHiddenScrollingViewBehavior $behavior;
                    int label;
                    final TheseusPageUIStyleRepository this$0;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1$1$1$2$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1$1$1$2$1.class */
                    public static final class C11441 extends SuspendLambda implements Function2<PlayerHiddenScrollingViewBehavior.State, Continuation<? super Unit>, Object> {
                        Object L$0;
                        int label;
                        final TheseusPageUIStyleRepository this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C11441(TheseusPageUIStyleRepository theseusPageUIStyleRepository, Continuation<? super C11441> continuation) {
                            super(2, continuation);
                            this.this$0 = theseusPageUIStyleRepository;
                        }

                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C11441 c11441 = new C11441(this.this$0, continuation);
                            c11441.L$0 = obj;
                            return c11441;
                        }

                        public final Object invoke(PlayerHiddenScrollingViewBehavior.State state, Continuation<? super Unit> continuation) {
                            return create(state, continuation).invokeSuspend(Unit.INSTANCE);
                        }

                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            PlayerHiddenScrollingViewBehavior.State state = (PlayerHiddenScrollingViewBehavior.State) this.L$0;
                            defpackage.a.b("[theseus-united-TheseusPageUIStyleRepository$1$1$1$2$1-invokeSuspend] ", "Behavior state changed: " + state, "TheseusPageUIStyleRepository$1$1$1$2$1-invokeSuspend");
                            this.this$0.f103499i.setValue(state);
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(PlayerHiddenScrollingViewBehavior playerHiddenScrollingViewBehavior, TheseusPageUIStyleRepository theseusPageUIStyleRepository, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.$behavior = playerHiddenScrollingViewBehavior;
                        this.this$0 = theseusPageUIStyleRepository;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(this.$behavior, this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            StateFlow<PlayerHiddenScrollingViewBehavior.State> stateFlow = this.$behavior.getStateFlow();
                            C11441 c11441 = new C11441(this.this$0, null);
                            this.label = 1;
                            if (FlowKt.collectLatest(stateFlow, c11441, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1$1$1$3, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1$1$1$3.class */
                public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final PlayerHiddenScrollingViewBehavior $behavior;
                    int label;
                    final TheseusPageUIStyleRepository this$0;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1$1$1$3$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1$1$1$3$1.class */
                    public static final class C11451 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
                        final PlayerHiddenScrollingViewBehavior $behavior;
                        int label;
                        final TheseusPageUIStyleRepository this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C11451(TheseusPageUIStyleRepository theseusPageUIStyleRepository, PlayerHiddenScrollingViewBehavior playerHiddenScrollingViewBehavior, Continuation<? super C11451> continuation) {
                            super(2, continuation);
                            this.this$0 = theseusPageUIStyleRepository;
                            this.$behavior = playerHiddenScrollingViewBehavior;
                        }

                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C11451(this.this$0, this.$behavior, continuation);
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
                            this.this$0.f103494c.setControlAlpha(1.0f - RangesKt.coerceAtMost(this.$behavior.hideOffsetRatio(), 1.0f));
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass3(PlayerHiddenScrollingViewBehavior playerHiddenScrollingViewBehavior, TheseusPageUIStyleRepository theseusPageUIStyleRepository, Continuation<? super AnonymousClass3> continuation) {
                        super(2, continuation);
                        this.$behavior = playerHiddenScrollingViewBehavior;
                        this.this$0 = theseusPageUIStyleRepository;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass3(this.$behavior, this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            StateFlow<Integer> offsetFlow = this.$behavior.getOffsetFlow();
                            C11451 c11451 = new C11451(this.this$0, this.$behavior, null);
                            this.label = 1;
                            if (FlowKt.collectLatest(offsetFlow, c11451, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1$1$1$4, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1$1$1$4.class */
                public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final PlayerHiddenScrollingViewBehavior $behavior;
                    int label;
                    final TheseusPageUIStyleRepository this$0;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1$1$1$4$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1$1$1$4$1.class */
                    public static final class C11461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final PlayerHiddenScrollingViewBehavior $behavior;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C11461(PlayerHiddenScrollingViewBehavior playerHiddenScrollingViewBehavior, Continuation<? super C11461> continuation) {
                            super(2, continuation);
                            this.$behavior = playerHiddenScrollingViewBehavior;
                        }

                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C11461(this.$behavior, continuation);
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
                            this.$behavior.moveToExpanded();
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass4(TheseusPageUIStyleRepository theseusPageUIStyleRepository, PlayerHiddenScrollingViewBehavior playerHiddenScrollingViewBehavior, Continuation<? super AnonymousClass4> continuation) {
                        super(2, continuation);
                        this.this$0 = theseusPageUIStyleRepository;
                        this.$behavior = playerHiddenScrollingViewBehavior;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass4(this.this$0, this.$behavior, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            Lifecycle lifecycle = this.this$0.f103493b.getLifecycle();
                            Lifecycle.State state = Lifecycle.State.STARTED;
                            C11461 c11461 = new C11461(this.$behavior, null);
                            this.label = 1;
                            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) c11461, (Continuation<? super Unit>) this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1$1$1$5, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1$1$1$5.class */
                public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final b $views;
                    int label;
                    final TheseusPageUIStyleRepository this$0;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1$1$1$5$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1$1$1$5$1.class */
                    public static final class C11471 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                        final b $views;
                        boolean Z$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C11471(b bVar, Continuation<? super C11471> continuation) {
                            super(2, continuation);
                            this.$views = bVar;
                        }

                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C11471 c11471 = new C11471(this.$views, continuation);
                            c11471.Z$0 = ((Boolean) obj).booleanValue();
                            return c11471;
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
                            TabLayout tabLayout = this.$views.f103515b;
                            ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            }
                            layoutParams.height = DimenUtilsKt.dpToPx(z6 ? 40.0f : 46.0f);
                            tabLayout.setLayoutParams(layoutParams);
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass5(TheseusPageUIStyleRepository theseusPageUIStyleRepository, b bVar, Continuation<? super AnonymousClass5> continuation) {
                        super(2, continuation);
                        this.this$0 = theseusPageUIStyleRepository;
                        this.$views = bVar;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass5(this.this$0, this.$views, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            StateFlow<Boolean> stateFlow = this.this$0.h.f129911c;
                            C11471 c11471 = new C11471(this.$views, null);
                            this.label = 1;
                            if (FlowKt.collectLatest(stateFlow, c11471, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1$1$1$6, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1$1$1$6.class */
                public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final b $views;
                    int label;
                    final TheseusPageUIStyleRepository this$0;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1$1$1$6$3, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1$1$1$6$3.class */
                    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<ActivityColorRepository.a, ActivityColorRepository.a, Continuation<? super Pair<? extends ActivityColorRepository.a, ? extends ActivityColorRepository.a>>, Object>, SuspendFunction {
                        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

                        public AnonymousClass3() {
                            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
                        }

                        public final Object invoke(ActivityColorRepository.a aVar, ActivityColorRepository.a aVar2, Continuation<? super Pair<ActivityColorRepository.a, ActivityColorRepository.a>> continuation) {
                            return AnonymousClass6.invokeSuspend$lambda$0(aVar, aVar2, continuation);
                        }
                    }

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$1$1$1$6$4, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$1$1$1$6$4.class */
                    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends ActivityColorRepository.a, ? extends ActivityColorRepository.a>, Continuation<? super Unit>, Object> {
                        final b $views;
                        Object L$0;
                        int label;
                        final TheseusPageUIStyleRepository this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass4(TheseusPageUIStyleRepository theseusPageUIStyleRepository, b bVar, Continuation<? super AnonymousClass4> continuation) {
                            super(2, continuation);
                            this.this$0 = theseusPageUIStyleRepository;
                            this.$views = bVar;
                        }

                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$views, continuation);
                            anonymousClass4.L$0 = obj;
                            return anonymousClass4;
                        }

                        public final Object invoke(Pair<ActivityColorRepository.a, ActivityColorRepository.a> pair, Continuation<? super Unit> continuation) {
                            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
                        }

                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            Pair pair = (Pair) this.L$0;
                            ActivityColorRepository.a aVar = (ActivityColorRepository.a) pair.component1();
                            ActivityColorRepository.a aVar2 = (ActivityColorRepository.a) pair.component2();
                            TheseusPageUIStyleRepository theseusPageUIStyleRepository = this.this$0;
                            View view = this.$views.f103517d;
                            Drawable drawableMutate = null;
                            Integer numBoxInt = aVar != null ? Boxing.boxInt(aVar.f99194a) : null;
                            if (view == null) {
                                theseusPageUIStyleRepository.getClass();
                            } else if (!theseusPageUIStyleRepository.f103496e.f99182c || numBoxInt == null) {
                                view.setVisibility(8);
                            } else {
                                view.setVisibility(0);
                                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{numBoxInt.intValue(), ColorKt.m2683toArgb8_81llA(Color.Companion.m2664getTransparent0d7_KjU())}));
                            }
                            TheseusPageUIStyleRepository theseusPageUIStyleRepository2 = this.this$0;
                            ImageView imageView = this.$views.f103516c;
                            Integer numBoxInt2 = aVar2 != null ? Boxing.boxInt(aVar2.f99194a) : null;
                            theseusPageUIStyleRepository2.getClass();
                            if (imageView != null) {
                                Drawable drawable = imageView.getDrawable();
                                if (drawable != null) {
                                    drawableMutate = drawable.mutate();
                                }
                                if (drawableMutate != null) {
                                    drawableMutate.setTint(numBoxInt2 != null ? numBoxInt2.intValue() : theseusPageUIStyleRepository2.f103497f.getColor(R$color.Ga5));
                                    imageView.setImageDrawable(drawableMutate);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass6(b bVar, TheseusPageUIStyleRepository theseusPageUIStyleRepository, Continuation<? super AnonymousClass6> continuation) {
                        super(2, continuation);
                        this.$views = bVar;
                        this.this$0 = theseusPageUIStyleRepository;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final /* synthetic */ Object invokeSuspend$lambda$0(ActivityColorRepository.a aVar, ActivityColorRepository.a aVar2, Continuation continuation) {
                        return new Pair(aVar, aVar2);
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass6(this.$views, this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            ImageView imageView = this.$views.f103516c;
                            if (imageView != null) {
                                imageView.setVisibility(f.f81927p ? 0 : 8);
                            }
                            View view = this.$views.f103518e;
                            if (view != null) {
                                int i8 = 8;
                                if (f.f81927p) {
                                    i8 = 0;
                                }
                                view.setVisibility(i8);
                            }
                            if (f.f81927p) {
                                ActivityColorRepository activityColorRepository = this.this$0.f103496e;
                                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(activityColorRepository.f99184e, activityColorRepository.f99189k, AnonymousClass3.INSTANCE));
                                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$views, null);
                                this.label = 1;
                                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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
                public C11411(TheseusPageUIStyleRepository theseusPageUIStyleRepository, PlayerHiddenScrollingViewBehavior playerHiddenScrollingViewBehavior, b bVar, Continuation<? super C11411> continuation) {
                    super(2, continuation);
                    this.this$0 = theseusPageUIStyleRepository;
                    this.$behavior = playerHiddenScrollingViewBehavior;
                    this.$views = bVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C11411 c11411 = new C11411(this.this$0, this.$behavior, this.$views, continuation);
                    c11411.L$0 = obj;
                    return c11411;
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
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C11421(this.this$0, this.$behavior, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$behavior, this.this$0, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$behavior, this.this$0, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$behavior, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, this.$views, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.$views, this.this$0, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11401(TheseusPageUIStyleRepository theseusPageUIStyleRepository, Continuation<? super C11401> continuation) {
                super(2, continuation);
                this.this$0 = theseusPageUIStyleRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11401 c11401 = new C11401(this.this$0, continuation);
                c11401.L$0 = obj;
                return c11401;
            }

            public final Object invoke(b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                PlayerHiddenScrollingViewBehavior playerHiddenScrollingViewBehavior;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    b bVar = (b) this.L$0;
                    if (bVar == null) {
                        return Unit.INSTANCE;
                    }
                    Iterator it = ViewTraversalKt.a(bVar.f103514a).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            playerHiddenScrollingViewBehavior = null;
                            break;
                        }
                        ViewGroup.LayoutParams layoutParams = ((View) it.next()).getLayoutParams();
                        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                            Object behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                            if (behavior instanceof PlayerHiddenScrollingViewBehavior) {
                                playerHiddenScrollingViewBehavior = (PlayerHiddenScrollingViewBehavior) behavior;
                                break;
                            }
                        }
                    }
                    if (playerHiddenScrollingViewBehavior == null) {
                        return Unit.INSTANCE;
                    }
                    C11411 c11411 = new C11411(this.this$0, playerHiddenScrollingViewBehavior, bVar, null);
                    this.label = 1;
                    if (CoroutineScopeKt.coroutineScope(c11411, this) == coroutine_suspended) {
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
        public AnonymousClass1(TheseusPageUIStyleRepository theseusPageUIStyleRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusPageUIStyleRepository;
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
                TheseusPageUIStyleRepository theseusPageUIStyleRepository = this.this$0;
                Flow<b> flow = theseusPageUIStyleRepository.f103495d;
                C11401 c11401 = new C11401(theseusPageUIStyleRepository, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c11401, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPageUIStyleRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$2$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$2$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<b, Integer, Continuation<? super Pair<? extends b, ? extends Integer>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(b bVar, int i7, Continuation<? super Pair<b, Integer>> continuation) {
                return AnonymousClass2.invokeSuspend$lambda$0(bVar, i7, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((b) obj, ((Number) obj2).intValue(), (Continuation<? super Pair<b, Integer>>) obj3);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$2$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$2$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends b, ? extends Integer>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;

            public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<b, Integer> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                CollapsablePinnedBottomScrollingBehavior collapsablePinnedBottomScrollingBehaviorA;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                b bVar = (b) pair.component1();
                int iIntValue = ((Number) pair.component2()).intValue();
                if (bVar != null && (collapsablePinnedBottomScrollingBehaviorA = com.bilibili.ship.theseus.united.utils.b.a(bVar.f103514a)) != null) {
                    collapsablePinnedBottomScrollingBehaviorA.setScrollCollapseEnable(true);
                    collapsablePinnedBottomScrollingBehaviorA.setMinVisibleHeight(iIntValue);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusPageUIStyleRepository theseusPageUIStyleRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusPageUIStyleRepository;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(b bVar, int i7, Continuation continuation) {
            return new Pair(bVar, Boxing.boxInt(i7));
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
                TheseusPageUIStyleRepository theseusPageUIStyleRepository = this.this$0;
                Flow flowCombine = FlowKt.combine(theseusPageUIStyleRepository.f103495d, theseusPageUIStyleRepository.f103501k, AnonymousClass3.INSTANCE);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPageUIStyleRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$3$3, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$3$3.class */
        public static final /* synthetic */ class C11483 extends AdaptedFunctionReference implements Function4<b, Integer, Integer, Continuation<? super Triple<? extends b, ? extends Integer, ? extends Integer>>, Object>, SuspendFunction {
            public static final C11483 INSTANCE = new C11483();

            public C11483() {
                super(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(b bVar, int i7, int i8, Continuation<? super Triple<b, Integer, Integer>> continuation) {
                return AnonymousClass3.invokeSuspend$lambda$0(bVar, i7, i8, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return invoke((b) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), (Continuation<? super Triple<b, Integer, Integer>>) obj4);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$3$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$3$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Triple<? extends b, ? extends Integer, ? extends Integer>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusPageUIStyleRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(TheseusPageUIStyleRepository theseusPageUIStyleRepository, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = theseusPageUIStyleRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Triple<b, Integer, Integer> triple, Continuation<? super Unit> continuation) {
                return create(triple, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Triple triple = (Triple) this.L$0;
                b bVar = (b) triple.component1();
                int iIntValue = ((Number) triple.component2()).intValue();
                int iIntValue2 = ((Number) triple.component3()).intValue();
                defpackage.a.b("[theseus-united-TheseusPageUIStyleRepository$3$4-invokeSuspend] ", G.f.a(iIntValue, iIntValue2, "underPlayerContainerOffsetFlow scrollableHeight：", ", offset: "), "TheseusPageUIStyleRepository$3$4-invokeSuspend");
                TheseusPageUIStyleRepository theseusPageUIStyleRepository = this.this$0;
                View view = bVar != null ? bVar.f103519f : null;
                int iAbs = Math.abs(iIntValue2);
                int iAbs2 = Math.abs(iIntValue2);
                theseusPageUIStyleRepository.getClass();
                TheseusPageUIStyleRepository.a(iAbs, iIntValue - iAbs2, view);
                TheseusPageUIStyleRepository theseusPageUIStyleRepository2 = this.this$0;
                View view2 = null;
                if (bVar != null) {
                    view2 = bVar.f103520g;
                }
                int iAbs3 = Math.abs(iIntValue2);
                theseusPageUIStyleRepository2.getClass();
                TheseusPageUIStyleRepository.a(0, iIntValue - iAbs3, view2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TheseusPageUIStyleRepository theseusPageUIStyleRepository, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = theseusPageUIStyleRepository;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(b bVar, int i7, int i8, Continuation continuation) {
            return new Triple(bVar, Boxing.boxInt(i7), Boxing.boxInt(i8));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusPageUIStyleRepository theseusPageUIStyleRepository = this.this$0;
                Flow<b> flow = theseusPageUIStyleRepository.f103495d;
                theseusPageUIStyleRepository.getClass();
                Flow flow2 = FlowKt.flow(new TheseusPageUIStyleRepository$scrollableHeightFlow$1(theseusPageUIStyleRepository, null));
                SharingStarted.Companion companion = SharingStarted.Companion;
                StateFlow stateFlowStateIn = FlowKt.stateIn(flow2, theseusPageUIStyleRepository.f103492a, companion.getLazily(), 0);
                TheseusPageUIStyleRepository theseusPageUIStyleRepository2 = this.this$0;
                theseusPageUIStyleRepository2.getClass();
                Flow flowCombine = FlowKt.combine(flow, stateFlowStateIn, FlowKt.stateIn(FlowKt.flow(new TheseusPageUIStyleRepository$underPlayerContainerOffsetFlow$1(theseusPageUIStyleRepository2, null)), theseusPageUIStyleRepository2.f103492a, companion.getLazily(), 0), C11483.INSTANCE);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f103510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f103511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f103512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f103513d;

        public a(boolean z6, boolean z7, boolean z8, boolean z9) {
            this.f103510a = z6;
            this.f103511b = z7;
            this.f103512c = z8;
            this.f103513d = z9;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f103510a == aVar.f103510a && this.f103511b == aVar.f103511b && this.f103512c == aVar.f103512c && this.f103513d == aVar.f103513d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f103513d) + z.a(z.a(Boolean.hashCode(this.f103510a) * 31, 31, this.f103511b), 31, this.f103512c);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Initial(pageUIStyle=");
            sb.append(this.f103510a);
            sb.append(", pageUIStyleExtend=");
            sb.append(this.f103511b);
            sb.append(", pageUIStyleSpeed=");
            sb.append(this.f103512c);
            sb.append(", pageUIStyleUnderPlayerScrollCollapse=");
            return i.a(sb, this.f103513d, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TouchAwareConstraintLayout f103514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final UnitedTabLayout f103515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final ImageView f103516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final View f103517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final View f103518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final View f103519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final View f103520g;

        public b(@NotNull TouchAwareConstraintLayout touchAwareConstraintLayout, @NotNull UnitedTabLayout unitedTabLayout, @Nullable ImageView imageView, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4) {
            this.f103514a = touchAwareConstraintLayout;
            this.f103515b = unitedTabLayout;
            this.f103516c = imageView;
            this.f103517d = view;
            this.f103518e = view2;
            this.f103519f = view3;
            this.f103520g = view4;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$c.class */
    public static final class c extends yv0.a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$d.class */
    public static final class d extends yv0.a {
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$c, yv0.a] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$d, yv0.a] */
    @Inject
    public TheseusPageUIStyleRepository(@NotNull CoroutineScope coroutineScope, @NotNull a aVar, @NotNull FragmentActivity fragmentActivity, @NotNull IControlContainerService iControlContainerService, @NotNull Flow<b> flow, @NotNull ActivityColorRepository activityColorRepository, @NotNull Context context) {
        this.f103492a = coroutineScope;
        this.f103493b = fragmentActivity;
        this.f103494c = iControlContainerService;
        this.f103495d = flow;
        this.f103496e = activityColorRepository;
        this.f103497f = context;
        MutableStateFlow<PlayerHiddenScrollingViewBehavior.State> MutableStateFlow = StateFlowKt.MutableStateFlow(PlayerHiddenScrollingViewBehavior.State.STATE_EXPANDED);
        this.f103499i = MutableStateFlow;
        this.f103500j = FlowKt.asStateFlow(MutableStateFlow);
        int i7 = 0;
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.f103501k = MutableStateFlow2;
        this.f103502l = FlowKt.asStateFlow(MutableStateFlow2);
        boolean z6 = aVar.f103510a;
        this.f103503m = z6;
        boolean z7 = aVar.f103511b;
        this.f103504n = z7;
        this.f103505o = aVar.f103512c;
        boolean z8 = aVar.f103513d;
        this.f103506p = z8;
        this.f103507q = z7 ? f.f81933v : i7;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f103508r = MutableStateFlow3;
        this.f103509s = FlowKt.asStateFlow(MutableStateFlow3);
        if (z6) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        }
        if (z8) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
            if (C7382c.a()) {
                return;
            }
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        }
    }

    public static void a(int i7, int i8, View view) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.topMargin != i7) {
            marginLayoutParams.topMargin = i7;
        }
        if (marginLayoutParams.bottomMargin != i8) {
            marginLayoutParams.bottomMargin = i8;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    @NotNull
    public final StateFlow<Float> b() {
        return FlowKt.stateIn(FlowKt.flow(new TheseusPageUIStyleRepository$collapseRatioFlow$1(this, null)), this.f103492a, SharingStarted.Companion.getLazily(), Float.valueOf(0.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$storyEntranceEnable$1
            if (r0 == 0) goto L2b
            r0 = r7
            com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$storyEntranceEnable$1 r0 = (com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$storyEntranceEnable$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2b
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L35
        L2b:
            com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$storyEntranceEnable$1 r0 = new com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$storyEntranceEnable$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L35:
            r0 = r7
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r5
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r0.f103508r
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L6b
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L5f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5f:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L67
            goto L8c
        L67:
            r7 = move-exception
            goto L96
        L6b:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            r1 = r6
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)     // Catch: java.lang.Throwable -> L67
            r0.setValue(r1)     // Catch: java.lang.Throwable -> L67
            r0 = r7
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L67
            r0 = r7
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L67
            r1 = r10
            if (r0 != r1) goto L8c
            r0 = r10
            return r0
        L8c:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L67
            r7 = r0
            r0 = r7
            r0.<init>()     // Catch: java.lang.Throwable -> L67
            r0 = r7
            throw r0     // Catch: java.lang.Throwable -> L67
        L96:
            r0 = r9
            r1 = 0
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            r0.setValue(r1)
            r0 = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository.c(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
