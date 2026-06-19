package com.bilibili.pegasus.fakepegasus;

import D60.A;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.aphro.mediaselect.compose.z;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.pegasus.PegasusDDConfigKt;
import java.util.Set;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PinnedBottomScrollingBehavior;
import u00.s;
import u00.y;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/FakePegasusFragment.class */
@StabilityInferred(parameters = 0)
public final class FakePegasusFragment extends BaseFragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final KProperty<Object>[] f77436g = {new PropertyReference1Impl(FakePegasusFragment.class, "binding", "getBinding()Lcom/bilibili/app/pegasus/databinding/BiliAppFakePegasusLayoutBinding;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f77437b = ReflectionFragmentViewBindings.viewBindingFragment(this, gl.b.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f77438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public n f77439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.fakepegasus.a f77440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f77441f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/FakePegasusFragment$a.class */
    public static final class a extends s {
        public final void b() {
            y yVar = (y) BLRouter.get$default(BLRouter.INSTANCE, y.class, (String) null, 2, (Object) null);
            if (yVar != null) {
                yVar.d(this);
            }
            e.a();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/FakePegasusFragment$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f77442a;

        public b(Function1 function1) {
            this.f77442a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f77442a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f77442a.invoke(obj);
        }
    }

    public FakePegasusFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.pegasus.fakepegasus.FakePegasusFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m8096invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.pegasus.fakepegasus.FakePegasusFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m8097invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f77438c = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(h.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.pegasus.fakepegasus.FakePegasusFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8098invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.pegasus.fakepegasus.FakePegasusFragment$special$$inlined$viewModels$default$4
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m8099invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
                    r3 = r0
                    r0 = r3
                    if (r0 == 0) goto L19
                    r0 = r3
                    java.lang.Object r0 = r0.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L44
                L19:
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L30
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L32
                L30:
                    r0 = 0
                    r3 = r0
                L32:
                    r0 = r3
                    if (r0 == 0) goto L40
                    r0 = r3
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                    goto L44
                L40:
                    androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                    r3 = r0
                L44:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.fakepegasus.FakePegasusFragment$special$$inlined$viewModels$default$4.m8099invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.pegasus.fakepegasus.FakePegasusFragment$special$$inlined$viewModels$default$5
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m8100invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L17
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L19
                L17:
                    r0 = 0
                    r3 = r0
                L19:
                    r0 = r3
                    if (r0 == 0) goto L2a
                    r0 = r3
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L32
                L2a:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_viewModels
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r3 = r0
                L32:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.fakepegasus.FakePegasusFragment$special$$inlined$viewModels$default$5.m8100invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f77441f = 1;
    }

    public final gl.b jf() {
        return (gl.b) this.f77437b.getValue(this, f77436g[0]);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return jf().a;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [androidx.recyclerview.widget.RecyclerView$ItemDecoration, com.bilibili.pegasus.fakepegasus.a] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehavior;
        WindowSizeClass windowSizeClassWindowSize;
        WindowSizeClass windowSizeClassWindowSize2;
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Lifecycle lifecycle = requireActivity().getLifecycle();
        ((Set) e.f77448a.getValue()).add(fragmentActivityRequireActivity);
        if (lifecycle != null) {
            lifecycle.addObserver(new d(fragmentActivityRequireActivity));
        }
        FragmentActivity fragmentActivityP3 = p3();
        this.f77441f = (fragmentActivityP3 == null || (windowSizeClassWindowSize2 = ScreenAdjustUtilsKt.windowSize(fragmentActivityP3)) == null) ? 1 : PegasusDDConfigKt.getWindowSizeType(windowSizeClassWindowSize2);
        FragmentActivity fragmentActivityP32 = p3();
        ((h) this.f77438c.getValue()).I0(this.f77441f, (fragmentActivityP32 == null || (windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(fragmentActivityP32)) == null) ? 1 : KScreenAdjustUtilsKt.getRawWindowSizeType(windowSizeClassWindowSize));
        jf().c.setLayoutManager(new GridLayoutManager(getContext(), 2));
        ?? itemDecoration = new RecyclerView.ItemDecoration();
        itemDecoration.f77446a = 5;
        this.f77440e = itemDecoration;
        jf().c.addItemDecoration(this.f77440e);
        FragmentActivity fragmentActivityP33 = p3();
        if (fragmentActivityP33 != null) {
            ScreenAdjustUtilsKt.collectWindowSize$default(fragmentActivityP33, false, new z(this, 2), 1, (Object) null);
        }
        ((h) this.f77438c.getValue()).f77455b.observe(getViewLifecycleOwner(), new b(new com.bilibili.biligame.ui.gamelist.b(this, 1)));
        jf().f.setOnClickListener(new g(this, 0));
        jf().g.setEnabled(false);
        jf().g.setColorSchemeResources(new int[]{2131103284});
        ((h) this.f77438c.getValue()).f77457d.observe(getViewLifecycleOwner(), new b(new A(this, 2)));
        jf().d.setOnClickListener(new Iq.h(this, 2));
        View view2 = view;
        if (view != null) {
            while (true) {
                pinnedBottomScrollingBehavior = null;
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
                ViewGroup.LayoutParams layoutParams = ((View) view2.getParent()).getLayoutParams();
                CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
                CoordinatorLayout.Behavior behavior = layoutParams2 != null ? layoutParams2.getBehavior() : null;
                if (behavior instanceof PinnedBottomScrollingBehavior) {
                    pinnedBottomScrollingBehavior = (PinnedBottomScrollingBehavior) behavior;
                    break;
                }
                view2 = (View) view2.getParent();
            }
        } else {
            pinnedBottomScrollingBehavior = null;
        }
        if (pinnedBottomScrollingBehavior != null) {
            pinnedBottomScrollingBehavior.addPinnedView(jf().e);
            pinnedBottomScrollingBehavior.addPinnedView(jf().h);
        }
    }
}
