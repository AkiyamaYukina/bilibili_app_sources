package com.bilibili.pegasus.components;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.recommend.RecommendModeGuidanceDialog;
import com.bilibili.app.comm.list.widget.recommend.RecommendStrategyId;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusVisibleState;
import com.bilibili.pegasus.common.inline.PlayerParamsBuilderKt;
import com.bilibili.pegasus.compat.RecommendModeKt;
import com.bilibili.pegasus.data.request.LoadMoreCompleteAction;
import com.bilibili.pegasus.data.request.RefreshCompleteAction;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.recommendmode.RecommendMode;
import dp0.C6828a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/RecommendGuidanceComponent.class */
@StabilityInferred(parameters = 0)
public final class RecommendGuidanceComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75859k = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f75860l = "recommend_guidance_component";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public j0 f75861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f75862n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/RecommendGuidanceComponent$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecommendGuidanceComponent f75863a;

        public a(RecommendGuidanceComponent recommendGuidanceComponent) {
            this.f75863a = recommendGuidanceComponent;
        }

        public final Object invoke() {
            return this.f75863a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/RecommendGuidanceComponent$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecommendGuidanceComponent f75864a;

        public b(RecommendGuidanceComponent recommendGuidanceComponent) {
            this.f75864a = recommendGuidanceComponent;
        }

        public final Object invoke() {
            return this.f75864a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/RecommendGuidanceComponent$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecommendGuidanceComponent f75865a;

        public c(RecommendGuidanceComponent recommendGuidanceComponent) {
            this.f75865a = recommendGuidanceComponent;
        }

        public final Object invoke() {
            return this.f75865a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.RecommendGuidanceComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/RecommendGuidanceComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RecyclerView $recyclerView;
        int label;
        final RecommendGuidanceComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.RecommendGuidanceComponent$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/RecommendGuidanceComponent$onViewCreated$1$1.class */
        public static final class C04841 extends SuspendLambda implements Function2<C6828a, Continuation<? super Unit>, Object> {
            final RecyclerView $recyclerView;
            Object L$0;
            int label;
            final RecommendGuidanceComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04841(RecommendGuidanceComponent recommendGuidanceComponent, RecyclerView recyclerView, Continuation<? super C04841> continuation) {
                super(2, continuation);
                this.this$0 = recommendGuidanceComponent;
                this.$recyclerView = recyclerView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04841 c04841 = new C04841(this.this$0, this.$recyclerView, continuation);
                c04841.L$0 = obj;
                return c04841;
            }

            public final Object invoke(C6828a c6828a, Continuation<? super Unit> continuation) {
                return create(c6828a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                RecommendModeKt.setRcmdGuidanceEnable(((C6828a) this.L$0).l());
                RecommendGuidanceComponent recommendGuidanceComponent = this.this$0;
                RecyclerView recyclerView = this.$recyclerView;
                recommendGuidanceComponent.getClass();
                if (RecommendModeKt.isRcmdGuidanceEnable() && !RecommendMode.isRecommendModeEnable() && com.bilibili.pegasus.request.b.f78805b) {
                    j0 j0Var = new j0(recommendGuidanceComponent.getRequireFragment(), recommendGuidanceComponent);
                    recommendGuidanceComponent.f75861m = j0Var;
                    j0Var.f77068c = new LA.c(recommendGuidanceComponent, 2);
                    h0 h0Var = new h0(recyclerView, recommendGuidanceComponent);
                    if (PegasusVisibleState.isVisible-impl(recommendGuidanceComponent.getVisibleState-XRWi58s())) {
                        h0Var.invoke();
                    } else {
                        recommendGuidanceComponent.f75862n = h0Var;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RecommendGuidanceComponent recommendGuidanceComponent, RecyclerView recyclerView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = recommendGuidanceComponent;
            this.$recyclerView = recyclerView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$recyclerView, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(((PegasusViewModel) this.this$0.f75859k.getValue()).f79027t);
                C04841 c04841 = new C04841(this.this$0, this.$recyclerView, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, c04841, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.RecommendGuidanceComponent$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/RecommendGuidanceComponent$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final RecommendGuidanceComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.RecommendGuidanceComponent$onViewCreated$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/RecommendGuidanceComponent$onViewCreated$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Action, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final RecommendGuidanceComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RecommendGuidanceComponent recommendGuidanceComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = recommendGuidanceComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Action action, Continuation<? super Unit> continuation) {
                return create(action, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Action action = (Action) this.L$0;
                if ((action instanceof RefreshCompleteAction) || (action instanceof LoadMoreCompleteAction)) {
                    RecommendGuidanceComponent recommendGuidanceComponent = this.this$0;
                    recommendGuidanceComponent.getClass();
                    if (RecommendModeKt.isRcmdGuidanceEnable() && !RecommendMode.isRecommendModeEnable() && !com.bilibili.pegasus.request.b.f78805b && PegasusVisibleState.isVisible-impl(recommendGuidanceComponent.getVisibleState-XRWi58s()) && ((PegasusViewModel) recommendGuidanceComponent.f75859k.getValue()).f79016i.f123311c.isUserRequest()) {
                        Ei.h.c++;
                        RecyclerView recyclerView = recommendGuidanceComponent.getRecyclerView();
                        if (recyclerView == null || recyclerView.getScrollState() != 0) {
                            RecyclerView recyclerView2 = recommendGuidanceComponent.getRecyclerView();
                            if (recyclerView2 != null) {
                                recyclerView2.addOnScrollListener(new i0(recommendGuidanceComponent));
                            }
                        } else {
                            RecommendGuidanceComponent.b(recommendGuidanceComponent.getFragment());
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RecommendGuidanceComponent recommendGuidanceComponent, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = recommendGuidanceComponent;
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
                SharedFlow<Action> sharedFlow = ((PegasusViewModel) this.this$0.f75859k.getValue()).f79014f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    public static void b(Fragment fragment) {
        if (fragment == null || true != ListExtentionsKt.isViewAlive(fragment)) {
            return;
        }
        RecommendModeGuidanceDialog.showRecommend$default(RecommendModeGuidanceDialog.Companion.newInstance$default(RecommendModeGuidanceDialog.Companion, PlayerParamsBuilderKt.SPMID_RECOMMEND, RecommendStrategyId.NO_CLICK, 0, false, 12, (Object) null), fragment.getChildFragmentManager(), false, 2, (Object) null);
    }

    @NotNull
    public final String getComponentName() {
        return this.f75860l;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, recyclerView, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    public final void onVisibleStateChangedSimplified(boolean z6) {
        Function0<Unit> function0;
        super.onVisibleStateChangedSimplified(z6);
        if (!z6 || (function0 = this.f75862n) == null) {
            return;
        }
        function0.invoke();
    }
}
