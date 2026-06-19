package com.bilibili.pegasus.components;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import aq0.R0;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.lib.homepage.splash.SplashViewModel;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusDDConfigKt;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.data.request.PegasusFlush;
import com.bilibili.pegasus.vm.PegasusViewModel;
import dp0.C6828a;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import mp0.C8028c;
import mp0.InterfaceC8027b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/EmptyViewHandleComponent.class */
@StabilityInferred(parameters = 0)
public final class EmptyViewHandleComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75738k = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75739l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SplashViewModel.class), new d(this), new e(this), new f(this));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f75740m = "PegasusEmptyViewHandlePlugin";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public View f75741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public View f75742o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/EmptyViewHandleComponent$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EmptyViewHandleComponent f75743a;

        public a(EmptyViewHandleComponent emptyViewHandleComponent) {
            this.f75743a = emptyViewHandleComponent;
        }

        public final Object invoke() {
            return this.f75743a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/EmptyViewHandleComponent$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EmptyViewHandleComponent f75744a;

        public b(EmptyViewHandleComponent emptyViewHandleComponent) {
            this.f75744a = emptyViewHandleComponent;
        }

        public final Object invoke() {
            return this.f75744a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/EmptyViewHandleComponent$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EmptyViewHandleComponent f75745a;

        public c(EmptyViewHandleComponent emptyViewHandleComponent) {
            this.f75745a = emptyViewHandleComponent;
        }

        public final Object invoke() {
            return this.f75745a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/EmptyViewHandleComponent$d.class */
    public static final class d implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EmptyViewHandleComponent f75746a;

        public d(EmptyViewHandleComponent emptyViewHandleComponent) {
            this.f75746a = emptyViewHandleComponent;
        }

        public final Object invoke() {
            return this.f75746a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/EmptyViewHandleComponent$e.class */
    public static final class e implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EmptyViewHandleComponent f75747a;

        public e(EmptyViewHandleComponent emptyViewHandleComponent) {
            this.f75747a = emptyViewHandleComponent;
        }

        public final Object invoke() {
            return this.f75747a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/EmptyViewHandleComponent$f.class */
    public static final class f implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EmptyViewHandleComponent f75748a;

        public f(EmptyViewHandleComponent emptyViewHandleComponent) {
            this.f75748a = emptyViewHandleComponent;
        }

        public final Object invoke() {
            return this.f75748a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.EmptyViewHandleComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/EmptyViewHandleComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final EmptyViewHandleComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.EmptyViewHandleComponent$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/EmptyViewHandleComponent$onViewCreated$1$1.class */
        public static final class C04781 extends SuspendLambda implements Function2<InterfaceC8027b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final EmptyViewHandleComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04781(EmptyViewHandleComponent emptyViewHandleComponent, Continuation<? super C04781> continuation) {
                super(2, continuation);
                this.this$0 = emptyViewHandleComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04781 c04781 = new C04781(this.this$0, continuation);
                c04781.L$0 = obj;
                return c04781;
            }

            public final Object invoke(InterfaceC8027b interfaceC8027b, Continuation<? super Unit> continuation) {
                return create(interfaceC8027b, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                dp0.c cVarR;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                InterfaceC8027b interfaceC8027b = (InterfaceC8027b) this.L$0;
                BLog.i("PegasusEmptyViewHandlePlugin", "errorState change " + interfaceC8027b);
                if (interfaceC8027b instanceof InterfaceC8027b.C1328b) {
                    EmptyViewHandleComponent emptyViewHandleComponent = this.this$0;
                    Context requireContext = emptyViewHandleComponent.getRequireContext();
                    if (emptyViewHandleComponent.c().f79016i.f123310b) {
                        if (((C8028c) emptyViewHandleComponent.c().f79020m.getValue()).f123831a.f123826a.isEmpty()) {
                            emptyViewHandleComponent.d(2131236306, 2131841412);
                        } else if (ConnectivityMonitor.getInstance().isNetworkActive()) {
                            PromoToast.showTopToast(requireContext, 2131841569);
                        } else {
                            PromoToast.showTopToast(requireContext, 2131841662);
                        }
                    } else if (ConnectivityMonitor.getInstance().isNetworkActive()) {
                        PromoToast.showBottomToast(requireContext, 2131841569);
                    } else {
                        PromoToast.showBottomToast(requireContext, 2131841662);
                    }
                } else if (interfaceC8027b instanceof InterfaceC8027b.a) {
                    final EmptyViewHandleComponent emptyViewHandleComponent2 = this.this$0;
                    C6828a c6828a = (C6828a) emptyViewHandleComponent2.c().f79027t.getValue();
                    String strC = (c6828a == null || (cVarR = c6828a.r()) == null) ? null : cVarR.c();
                    if (!emptyViewHandleComponent2.c().f79016i.f123310b) {
                        PromoToast.showBottomToast(emptyViewHandleComponent2.getActivity(), 2131845224);
                    } else if (!((C8028c) emptyViewHandleComponent2.c().f79020m.getValue()).f123831a.f123826a.isEmpty()) {
                        PromoToast.showTopToast(emptyViewHandleComponent2.getActivity(), 2131845224);
                    } else if (!Lh.n.f() || strC == null || StringsKt.isBlank(strC)) {
                        emptyViewHandleComponent2.d(2131236937, 2131841350);
                    } else {
                        emptyViewHandleComponent2.b();
                        View view = emptyViewHandleComponent2.f75741n;
                        if (view != null) {
                            R0 r0Bind = R0.bind(view);
                            r0Bind.f53849b.setImageResource(2131236937);
                            r0Bind.f53850c.setText(strC);
                            r0Bind.f53848a.setVisibility(0);
                            final int i7 = 0;
                            r0Bind.f53851d.setOnClickListener(new View.OnClickListener(emptyViewHandleComponent2, i7) { // from class: com.bilibili.pegasus.components.n

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final int f77091a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Object f77092b;

                                {
                                    this.f77091a = i7;
                                    this.f77092b = emptyViewHandleComponent2;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
                                /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
                                @Override // android.view.View.OnClickListener
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final void onClick(android.view.View r15) {
                                    /*
                                        Method dump skipped, instruction units count: 523
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.ViewOnClickListenerC5633n.onClick(android.view.View):void");
                                }
                            });
                        }
                    }
                } else {
                    if (!(interfaceC8027b instanceof InterfaceC8027b.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    View view2 = this.this$0.f75741n;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EmptyViewHandleComponent emptyViewHandleComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = emptyViewHandleComponent;
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
                Flow<InterfaceC8027b> flow = this.this$0.c().f79023p;
                C04781 c04781 = new C04781(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c04781, this) == coroutine_suspended) {
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

    public final void b() {
        Resources resources;
        Resources resources2;
        ViewStub viewStub;
        if (this.f75741n == null) {
            View view = getView();
            this.f75741n = (view == null || (viewStub = (ViewStub) view.findViewById(2131316325)) == null) ? null : viewStub.inflate();
            View view2 = getView();
            View viewFindViewById = null;
            if (view2 != null) {
                viewFindViewById = view2.findViewById(2131300726);
            }
            this.f75742o = viewFindViewById;
            if (viewFindViewById != null) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                Context context = getContext();
                int dimensionPixelSize = (context == null || (resources2 = context.getResources()) == null) ? 0 : resources2.getDimensionPixelSize(2131167204);
                Context context2 = getContext();
                int dimensionPixelSize2 = (context2 == null || (resources = context2.getResources()) == null) ? 0 : resources.getDimensionPixelSize(2131167205);
                Context context3 = getContext();
                int dimensionPixelSize3 = 0;
                if (context3 != null) {
                    Resources resources3 = context3.getResources();
                    dimensionPixelSize3 = 0;
                    if (resources3 != null) {
                        dimensionPixelSize3 = resources3.getDimensionPixelSize(2131165579);
                    }
                }
                layoutParams.height = ScreenUtil.getScreenHeight(getContext()) - ((dimensionPixelSize + dimensionPixelSize2) + dimensionPixelSize3);
                viewFindViewById.setLayoutParams(layoutParams);
            }
        }
    }

    public final PegasusViewModel c() {
        return (PegasusViewModel) this.f75738k.getValue();
    }

    public final void d(@DrawableRes int i7, @StringRes int i8) {
        BLog.i("PegasusEmptyViewHandlePlugin", "showEmptyView");
        b();
        View view = this.f75741n;
        if (view != null) {
            R0 r0Bind = R0.bind(view);
            r0Bind.f53849b.setImageResource(i7);
            r0Bind.f53850c.setText(i8);
            r0Bind.f53848a.setVisibility(0);
            r0Bind.f53851d.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.pegasus.components.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final EmptyViewHandleComponent f77105a;

                {
                    this.f77105a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    WindowSizeClass windowSizeClassWindowSize;
                    WindowSizeClass windowSizeClassWindowSize2;
                    EmptyViewHandleComponent emptyViewHandleComponent = this.f77105a;
                    PegasusViewModel pegasusViewModelC = emptyViewHandleComponent.c();
                    PegasusFlush pegasusFlush = PegasusFlush.NORMAL;
                    FragmentActivity activity = emptyViewHandleComponent.getActivity();
                    int windowSizeType = (activity == null || (windowSizeClassWindowSize2 = ScreenAdjustUtilsKt.windowSize(activity)) == null) ? 1 : PegasusDDConfigKt.getWindowSizeType(windowSizeClassWindowSize2);
                    FragmentActivity activity2 = emptyViewHandleComponent.getActivity();
                    PegasusViewModel.K0(pegasusViewModelC, true, pegasusFlush, null, null, null, null, windowSizeType, (activity2 == null || (windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(activity2)) == null) ? 1 : KScreenAdjustUtilsKt.getRawWindowSizeType(windowSizeClassWindowSize), new com.bilibili.ad.adview.pegasus.holders.inline.card133.h(emptyViewHandleComponent, 3), 1596);
                }
            });
        }
    }

    @NotNull
    public final String getComponentName() {
        return this.f75740m;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f75741n = null;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
