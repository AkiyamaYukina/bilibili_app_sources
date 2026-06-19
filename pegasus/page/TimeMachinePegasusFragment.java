package com.bilibili.pegasus.page;

import HG0.C2078d1;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.material3.internal.C0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4849a;
import aq0.R0;
import com.bilibili.app.comm.list.common.inline.config.pegasus.PegasusInlineConfigKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.inline.biz.card.IListInlineAutoPlayerParams;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.page.InlinePage;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.FragmentContainerConfig;
import com.bilibili.lib.ui.callback.IBackPress;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.moduleservice.list.IPegasusInlineConfig;
import com.bilibili.pegasus.common.inline.PlayerParamsBuilderKt;
import com.bilibili.pegasus.components.graduation.C5624z;
import com.bilibili.pegasus.components.graduation.GraduationSeasonAnalysisDialogType;
import com.bilibili.pegasus.components.graduation.GraduationSeasonYearButtonBackground;
import com.bilibili.pegasus.components.graduation.GraduationSeasonYearSelectDialogFragment;
import com.bilibili.pegasus.components.graduation.Z;
import com.bilibili.pegasus.components.graduation.t0;
import com.bilibili.pegasus.data.config.GraduationSeasonConfig;
import com.bilibili.pegasus.data.config.GraduationSeasonShareConfig;
import com.bilibili.pegasus.data.request.PegasusFlush;
import com.bilibili.pegasus.page.U;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.search2.api.SearchBangumiItem;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import mp0.C8028c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachinePegasusFragment.class */
@FragmentContainerConfig(selfHandleOrientation = true, smallScreen = 1)
@StabilityInferred(parameters = 0)
@AndroidEntryPoint
public final class TimeMachinePegasusFragment extends Hilt_TimeMachinePegasusFragment implements com.bilibili.pegasus.components.graduation.T, IBackPress, InlinePage, IListInlineAutoPlayerParams, IPvTracker {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f78320A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f78321B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f78322C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f78323D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f78324E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f78325F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public Integer f78326G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public Integer f78327H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public Integer f78328I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public Boolean f78329J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public Boolean f78330K;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.common.i f78331g = new Object();

    @Inject
    public com.bilibili.pegasus.vm.o h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f78332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public C4849a f78333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.components.graduation.S f78334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public View f78335l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public C5714c f78336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public x f78337n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public C5724m f78338o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public C5728q f78339p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public U f78340q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public C5721j f78341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public C5624z f78342s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Lazy f78343t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f78344u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f78345v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public GraduationSeasonConfig f78346w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f78347x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public GraduationSeasonYearSelectDialogFragment f78348y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public Integer f78349z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachinePegasusFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f78350a;

        static {
            int[] iArr = new int[GraduationSeasonYearButtonBackground.values().length];
            try {
                iArr[GraduationSeasonYearButtonBackground.SELECTED.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[GraduationSeasonYearButtonBackground.NOT_GRADUATED.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[GraduationSeasonYearButtonBackground.UNSELECTED.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f78350a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.pegasus.common.i, java.lang.Object] */
    public TimeMachinePegasusFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.pegasus.page.TimeMachinePegasusFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m8178invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.pegasus.page.TimeMachinePegasusFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m8179invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f78332i = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TimeMachineViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.pegasus.page.TimeMachinePegasusFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8180invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.pegasus.page.TimeMachinePegasusFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m8181invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.page.TimeMachinePegasusFragment$special$$inlined$viewModels$default$4.m8181invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.pegasus.page.TimeMachinePegasusFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m8182invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.page.TimeMachinePegasusFragment$special$$inlined$viewModels$default$5.m8182invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f78343t = LazyKt.lazy(new C2078d1(this, 3));
    }

    public static boolean mf(GraduationSeasonShareConfig graduationSeasonShareConfig) {
        return (graduationSeasonShareConfig == null || graduationSeasonShareConfig.getType() == 0) ? false : true;
    }

    public static int nf(View view, View view2) {
        int left = 0;
        while (view != null && view != view2) {
            left += view.getLeft();
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return left;
    }

    public static int of(View view, View view2) {
        int top = 0;
        while (view != null && view != view2) {
            top += view.getTop();
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return top;
    }

    public final int getBottomClip() {
        return 0;
    }

    @Nullable
    public final IInlineControl getInlineControl() {
        x xVar = this.f78337n;
        return xVar != null ? xVar.h : null;
    }

    @NotNull
    public final com.bilibili.pegasus.vm.o getMAdapter() {
        com.bilibili.pegasus.vm.o oVar = this.h;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        return null;
    }

    public final boolean getPageSwitchState() {
        IPegasusInlineConfig iPegasusInlineConfig = (IPegasusInlineConfig) BLRouter.get$default(BLRouter.INSTANCE, IPegasusInlineConfig.class, (String) null, 2, (Object) null);
        boolean z6 = false;
        if (iPegasusInlineConfig != null) {
            z6 = false;
            if (PegasusInlineConfigKt.isAutoPlayEnable(iPegasusInlineConfig)) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        this.f78331g.getClass();
        return "tm.recommend.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle pvExtra = this.f78331g.getPvExtra();
        pvExtra.putString("is_inverted_scroll", "1");
        return pvExtra;
    }

    @NotNull
    public final Rect getViewVisibleRect() {
        GraduationRecyclerView graduationRecyclerView;
        Rect rect = new Rect();
        C4849a c4849a = this.f78333j;
        if (c4849a != null && (graduationRecyclerView = c4849a.f53973i) != null) {
            graduationRecyclerView.getGlobalVisibleRect(rect);
        }
        return rect;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void kf(int i7) throws NoWhenBranchMatchedException {
        Z z6;
        int i8;
        C4849a c4849a = this.f78333j;
        if (c4849a == null) {
            return;
        }
        if (t0.c(i7)) {
            z6 = new Z(GraduationSeasonYearButtonBackground.NOT_GRADUATED, "", false);
        } else if (t0.d(i7)) {
            z6 = new Z(GraduationSeasonYearButtonBackground.SELECTED, t0.b(i7, null) ? "2009以前" : String.valueOf(i7), true);
        } else {
            z6 = new Z(GraduationSeasonYearButtonBackground.UNSELECTED, "", false);
        }
        FrameLayout frameLayout = c4849a.h;
        int[] iArr = a.f78350a;
        GraduationSeasonYearButtonBackground graduationSeasonYearButtonBackground = z6.f76100a;
        int i9 = iArr[graduationSeasonYearButtonBackground.ordinal()];
        if (i9 == 1) {
            i8 = 2131245522;
        } else if (i9 == 2) {
            i8 = 2131245524;
        } else {
            if (i9 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i8 = 2131245525;
        }
        frameLayout.setBackgroundResource(i8);
        TintTextView tintTextView = c4849a.f53972g;
        tintTextView.setText(z6.f76101b);
        if (graduationSeasonYearButtonBackground == GraduationSeasonYearButtonBackground.SELECTED) {
            tintTextView.setTypeface(ResourcesCompat.getFont(tintTextView.getContext(), 2132213761), 1);
            tintTextView.setTextSize(1, 16.0f);
        } else {
            tintTextView.setTypeface(Typeface.DEFAULT_BOLD);
            tintTextView.setTextSize(15.0f);
        }
        tintTextView.setTextColor(-1);
        tintTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        c4849a.f53969d.setVisibility(z6.f76102c ? 0 : 8);
    }

    public final TimeMachineViewModel lf() {
        return (TimeMachineViewModel) this.f78332i.getValue();
    }

    @Override // com.bilibili.lib.ui.callback.IBackPress
    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e A[PHI: r12
  0x001e: PHI (r12v1 android.content.Context) = (r12v0 android.content.Context), (r12v7 android.content.Context) binds: [B:3:0x0011, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.page.TimeMachinePegasusFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C4849a c4849aInflate = C4849a.inflate(layoutInflater, viewGroup, false);
        this.f78333j = c4849aInflate;
        c4849aInflate.f53974j.setScaleX(-1.0f);
        this.f78333j.f53974j.setScaleY(-1.0f);
        this.f78334k = new com.bilibili.pegasus.components.graduation.S(this.f78333j.f53974j);
        return this.f78333j.f53974j;
    }

    /* JADX WARN: Type inference failed for: r0v114, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.pegasus.holders.oversea.d] */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Window window;
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null && (window = fragmentActivityP3.getWindow()) != null) {
            WindowCompat.getInsetsController(window, window.getDecorView()).show(WindowInsetsCompat.Type.navigationBars());
            WindowCompat.setDecorFitsSystemWindows(window, true);
            Integer num = this.f78328I;
            if (num != null) {
                window.getDecorView().setSystemUiVisibility(num.intValue());
            }
            Integer num2 = this.f78326G;
            if (num2 != null) {
                window.setStatusBarColor(num2.intValue());
            }
            Integer num3 = this.f78327H;
            if (num3 != null) {
                window.setNavigationBarColor(num3.intValue());
            }
            if (Build.VERSION.SDK_INT >= 29) {
                Boolean bool = this.f78329J;
                if (bool != null) {
                    window.setStatusBarContrastEnforced(bool.booleanValue());
                }
                Boolean bool2 = this.f78330K;
                if (bool2 != null) {
                    window.setNavigationBarContrastEnforced(bool2.booleanValue());
                }
            }
        }
        this.f78328I = null;
        this.f78326G = null;
        this.f78327H = null;
        this.f78329J = null;
        this.f78330K = null;
        C5714c c5714c = this.f78336m;
        if (c5714c != null) {
            c5714c.disable();
        }
        this.f78336m = null;
        x xVar = this.f78337n;
        if (xVar != null) {
            xVar.a();
        }
        this.f78337n = null;
        C5724m c5724m = this.f78338o;
        if (c5724m != null && c5724m.f78420g) {
            c5724m.f78420g = false;
            RecyclerView recyclerView = c5724m.f78414a;
            recyclerView.removeOnScrollListener(c5724m.f78416c);
            recyclerView.removeOnChildAttachStateChangeListener(c5724m.f78417d);
            if (recyclerView.getViewTreeObserver().isAlive()) {
                recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(c5724m.f78418e);
            }
            RunnableC5722k runnableC5722k = c5724m.f78421i;
            if (runnableC5722k != null) {
                recyclerView.removeCallbacks(runnableC5722k);
            }
            c5724m.f78421i = null;
            RecyclerView.Adapter<?> adapter = c5724m.h;
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(c5724m.f78419f);
            }
            c5724m.h = null;
            for (?? r02 : (ArrayList) c5724m.a()) {
                r02.itemView.setAlpha(1.0f);
                if (r02.f77994C) {
                    r02.f77994C = false;
                    r02.G0();
                }
                r02.f77995D = false;
            }
        }
        this.f78338o = null;
        C5728q c5728q = this.f78339p;
        if (c5728q != null) {
            bY.c<RecyclerView> cVar = c5728q.f78434c;
            if (cVar != null) {
                cVar.a();
            }
            c5728q.f78434c = null;
        }
        this.f78339p = null;
        com.bilibili.pegasus.components.graduation.S s7 = this.f78334k;
        if (s7 != null) {
            s7.a();
        }
        this.f78334k = null;
        C5624z c5624z = this.f78342s;
        if (c5624z != null) {
            Job job = c5624z.f76262b;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            c5624z.f76262b = null;
            ComposeView composeView = c5624z.f76261a;
            if (composeView != null) {
                ViewParent parent = composeView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(composeView);
                }
            }
            c5624z.f76261a = null;
            c5624z.f76263c = true;
        }
        this.f78342s = null;
        this.f78324E = false;
        this.f78325F = false;
        C5721j c5721j = this.f78341r;
        if (c5721j != null) {
            c5721j.b();
            c5721j.f78401b.animate().cancel();
            c5721j.f78401b.setOnClickListener(null);
            C5720i c5720i = c5721j.h;
            if (c5720i != null) {
                c5721j.f78403d.removeOnScrollListener(c5720i);
            }
            c5721j.h = null;
            ViewCompat.setOnApplyWindowInsetsListener(c5721j.f78400a, null);
        }
        this.f78341r = null;
        C4849a c4849a = this.f78333j;
        if (c4849a != null) {
            c4849a.f53973i.setAdapter(null);
        }
        this.f78340q = null;
        this.f78335l = null;
        this.f78348y = null;
        this.f78349z = null;
        this.f78333j = null;
        super.onDestroyView();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        bY.c<RecyclerView> cVar;
        IInlineControl iInlineControl;
        super.onPause();
        C5714c c5714c = this.f78336m;
        if (c5714c != null) {
            c5714c.disable();
        }
        x xVar = this.f78337n;
        if (xVar != null && (iInlineControl = xVar.h) != null) {
            iInlineControl.stopPlay();
        }
        C5728q c5728q = this.f78339p;
        if (c5728q == null || (cVar = c5728q.f78434c) == null) {
            return;
        }
        cVar.a();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        bY.c<RecyclerView> cVar;
        bY.c<RecyclerView> cVar2;
        Context context;
        super.onResume();
        pf();
        vf();
        if (this.f78336m == null && (context = getContext()) != null) {
            C5714c c5714c = new C5714c(context);
            c5714c.f78390c = new C0(this, 1);
            this.f78336m = c5714c;
        }
        C5714c c5714c2 = this.f78336m;
        if (c5714c2 != null) {
            c5714c2.enable();
        }
        x xVar = this.f78337n;
        if (xVar != null) {
            x.b(xVar);
        }
        C5724m c5724m = this.f78338o;
        if (c5724m != null) {
            c5724m.c();
        }
        C5728q c5728q = this.f78339p;
        if (c5728q != null && (cVar2 = c5728q.f78434c) != null) {
            cVar2.d = true;
            cVar2.h();
        }
        C5728q c5728q2 = this.f78339p;
        if (c5728q2 == null || (cVar = c5728q2.f78434c) == null) {
            return;
        }
        cVar.i();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r0v212, types: [com.bilibili.pegasus.components.graduation.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v51, types: [cY.c, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws NoWhenBranchMatchedException {
        RecyclerView.Adapter adapter;
        Window window;
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null && !this.f78324E && this.f78342s == null) {
            this.f78324E = true;
            ?? obj = new Object();
            this.f78342s = obj;
            obj.a(fragmentActivityP3, LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), new F(this, obj));
        }
        FragmentActivity fragmentActivityP32 = p3();
        if (fragmentActivityP32 != null && (window = fragmentActivityP32.getWindow()) != null) {
            WindowCompat.setDecorFitsSystemWindows(window, false);
            if (this.f78328I == null) {
                this.f78328I = Integer.valueOf(window.getDecorView().getSystemUiVisibility());
                this.f78326G = Integer.valueOf(window.getStatusBarColor());
                this.f78327H = Integer.valueOf(window.getNavigationBarColor());
                if (Build.VERSION.SDK_INT >= 29) {
                    this.f78329J = Boolean.valueOf(window.isStatusBarContrastEnforced());
                    this.f78330K = Boolean.valueOf(window.isNavigationBarContrastEnforced());
                }
            }
            pf();
        }
        C4849a c4849a = this.f78333j;
        if (c4849a != null) {
            float f7 = getResources().getDisplayMetrics().density;
            GraduationRecyclerView graduationRecyclerView = c4849a.f53973i;
            ViewGroup.LayoutParams layoutParams = graduationRecyclerView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = (int) (90 * f7);
                graduationRecyclerView.setLayoutParams(marginLayoutParams);
            }
        }
        C4849a c4849a2 = this.f78333j;
        if (c4849a2 != null) {
            FrameLayout frameLayout = c4849a2.f53974j;
            FrameLayout frameLayout2 = c4849a2.f53967b;
            TextView textView = c4849a2.f53968c;
            int i7 = this.f78321B;
            GraduationSeasonConfig graduationSeasonConfig = this.f78346w;
            boolean zMf = mf(graduationSeasonConfig != null ? graduationSeasonConfig.getShare() : null);
            E11.k kVar = new E11.k(6);
            US0.z zVar = new US0.z(this, 5);
            GraduationRecyclerView graduationRecyclerView2 = c4849a2.f53973i;
            final C5721j c5721j = new C5721j(frameLayout, frameLayout2, textView, graduationRecyclerView2, i7, zMf, kVar, zVar);
            ViewCompat.setOnApplyWindowInsetsListener(frameLayout, new OnApplyWindowInsetsListener(c5721j) { // from class: com.bilibili.pegasus.page.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5721j f78395a;

                {
                    this.f78395a = c5721j;
                }

                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                    int i8 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars()).top;
                    View view3 = this.f78395a.f78401b;
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.bottomMargin = DimenUtilsKt.dpToPx(64) + i8;
                    view3.setLayoutParams(marginLayoutParams2);
                    return windowInsetsCompat;
                }
            });
            ViewCompat.requestApplyInsets(frameLayout);
            frameLayout2.setOnClickListener(new Dw.a(c5721j, 2));
            frameLayout2.post(new K9.a(c5721j, 1));
            if (c5721j.h == null) {
                C5720i c5720i = new C5720i(c5721j);
                c5721j.h = c5720i;
                graduationRecyclerView2.addOnScrollListener(c5720i);
            }
            this.f78341r = c5721j;
            c4849a2.h.setOnClickListener(new E(this, 0));
            c4849a2.f53969d.setOnClickListener(new com.bilibili.bililive.biz.pkv2.ui.w(this, 1));
            C4849a c4849a3 = this.f78333j;
            if (c4849a3 != null) {
                this.f78323D = false;
                c4849a3.h.setVisibility(4);
                c4849a3.f53969d.setVisibility(8);
            }
            kf(this.f78321B);
            if (!this.f78345v) {
                this.f78345v = true;
                Neurons.reportExposure$default(true, "activity.graduation.top-recommend.0.show", MapsKt.mapOf(new Pair[]{TuplesKt.to("from_spmid", "activity.graduation.recommend-page.0"), TuplesKt.to("spmid", "activity.graduation.top-recommend.0")}), (List) null, 8, (Object) null);
            }
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new TimeMachinePegasusFragment$initBackground$3(this, null), 3, (Object) null);
        }
        getMAdapter().f79074c = (C5730t) this.f78343t.getValue();
        getMAdapter().f79075d = this;
        GraduationRecyclerView graduationRecyclerView3 = this.f78333j.f53973i;
        com.bilibili.pegasus.widget.h hVar = new com.bilibili.pegasus.widget.h(new US0.B(this, 3));
        graduationRecyclerView3.addOnScrollListener(hVar);
        graduationRecyclerView3.addOnChildAttachStateChangeListener(hVar);
        graduationRecyclerView3.setHasFixedSize(true);
        graduationRecyclerView3.setItemAnimator(null);
        graduationRecyclerView3.setOverScrollMode(2);
        U u7 = new U((int) (SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY * getResources().getDisplayMetrics().density), CollectionsKt.listOf(new U.b[]{new U.b(new Fk0.h(this, 3), new com.bilibili.bililive.room.ui.topic.slide.o(this, 2)), new U.b(new KF.k(this, 2), new S60.C(this, 3))}));
        this.f78340q = u7;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener(this) { // from class: com.bilibili.pegasus.page.C

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TimeMachinePegasusFragment f78279a;

            {
                this.f78279a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                U u8 = this.f78279a.f78340q;
                if (u8 != null) {
                    u8.notifyItemChanged(0);
                }
            }
        };
        C4849a c4849a4 = this.f78333j;
        if (c4849a4 != null) {
            c4849a4.h.addOnLayoutChangeListener(onLayoutChangeListener);
        }
        C4849a c4849a5 = this.f78333j;
        if (c4849a5 != null) {
            c4849a5.f53969d.addOnLayoutChangeListener(onLayoutChangeListener);
        }
        graduationRecyclerView3.setAdapter(new ConcatAdapter(u7, getMAdapter()));
        graduationRecyclerView3.setLayoutManager(new LinearLayoutManager(graduationRecyclerView3.getContext()));
        graduationRecyclerView3.addItemDecoration(new C5729s(graduationRecyclerView3.getContext()));
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        new DecelerateInterpolator();
        linearSnapHelper.attachToRecyclerView(graduationRecyclerView3);
        if (this.f78337n == null) {
            com.bilibili.pegasus.vm.o mAdapter = getMAdapter();
            final x xVar = new x(this, graduationRecyclerView3, mAdapter, this);
            if (!xVar.f78451i) {
                xVar.f78451i = true;
                IInlineControl.Companion companion = IInlineControl.Companion;
                IInlineControl.Builder builder = new IInlineControl.Builder(this, graduationRecyclerView3);
                builder.setAutoPlayControl((com.bilibili.pegasus.common.inlineplay.c) xVar.f78448e.getValue());
                builder.setFetcher((C5731u) xVar.f78450g.getValue());
                builder.setDelegate((com.bilibili.pegasus.common.inlineplay.a) xVar.f78449f.getValue());
                builder.setIdentity(PlayerParamsBuilderKt.SPMID_RECOMMEND);
                IInlineControl iInlineControlBuild = builder.build();
                xVar.h = iInlineControlBuild;
                mAdapter.f79076e = iInlineControlBuild;
                graduationRecyclerView3.getViewTreeObserver().addOnGlobalLayoutListener(new w(xVar));
                getLifecycle().addObserver(new LifecycleEventObserver(xVar) { // from class: com.bilibili.pegasus.page.v

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final x f78442a;

                    {
                        this.f78442a = xVar;
                    }

                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            this.f78442a.a();
                        }
                    }
                });
            }
            this.f78337n = xVar;
        }
        C5728q c5728q = new C5728q(graduationRecyclerView3);
        if (c5728q.f78434c == null) {
            C5727p c5727p = new C5727p(c5728q);
            bY.d dVar = new bY.d(new eY.c(graduationRecyclerView3));
            dVar.b(0.5f);
            bY.a aVar = dVar.b;
            aVar.b = c5727p;
            aVar.e = true;
            aVar.g = new Object();
            c5728q.f78434c = dVar.a();
        }
        c5728q.a(((C8028c) lf().f78362i.getValue()).f123834d);
        bY.c<RecyclerView> cVar = c5728q.f78434c;
        if (cVar != null) {
            cVar.a();
        }
        this.f78339p = c5728q;
        C5724m c5724m = new C5724m(graduationRecyclerView3, new TimeMachinePegasusFragment$initFeeds$3(this));
        if (!c5724m.f78420g) {
            c5724m.f78420g = true;
            graduationRecyclerView3.addOnScrollListener(c5724m.f78416c);
            graduationRecyclerView3.addOnChildAttachStateChangeListener(c5724m.f78417d);
            graduationRecyclerView3.getViewTreeObserver().addOnGlobalLayoutListener(c5724m.f78418e);
            RecyclerView.Adapter adapter2 = graduationRecyclerView3.getAdapter();
            if (adapter2 != null && (adapter = c5724m.h) != adapter2) {
                RecyclerView.AdapterDataObserver adapterDataObserver = c5724m.f78419f;
                if (adapter != null) {
                    adapter.unregisterAdapterDataObserver(adapterDataObserver);
                }
                c5724m.h = adapter2;
                adapter2.registerAdapterDataObserver(adapterDataObserver);
            }
            C5724m.b(c5724m);
        }
        this.f78338o = c5724m;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new TimeMachinePegasusFragment$initFeeds$5(this, graduationRecyclerView3, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new TimeMachinePegasusFragment$initFeeds$6(this, hVar, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new TimeMachinePegasusFragment$initFeeds$7(this, hVar, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new TimeMachinePegasusFragment$observeErrors$1(this, null), 3, (Object) null);
    }

    public final void pf() {
        Window window;
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null || (window = fragmentActivityP3.getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        StatusBarCompat.tintStatusBar(window, 0);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 5890);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsetsCompat.Type.navigationBars());
        if (Build.VERSION.SDK_INT >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public final void qf() {
        Neurons.reportClick(true, "activity.graduation.top-recommend.0.click", MapsKt.plus(MapsKt.mapOf(new Pair[]{TuplesKt.to("from_spmid", "activity.graduation.recommend-page.0"), TuplesKt.to("spmid", "activity.graduation.top-recommend.0")}), MapsKt.mapOf(TuplesKt.to("click_type", String.valueOf(2)))));
        tf(this.f78321B);
    }

    public final void rf() {
        if (this.f78323D) {
            Neurons.reportClick(true, "activity.graduation.top-recommend.0.click", MapsKt.plus(MapsKt.mapOf(new Pair[]{TuplesKt.to("from_spmid", "activity.graduation.recommend-page.0"), TuplesKt.to("spmid", "activity.graduation.top-recommend.0")}), MapsKt.mapOf(TuplesKt.to("click_type", String.valueOf(1)))));
            uf();
        }
    }

    public final void sf(@DrawableRes int i7, @StringRes int i8) {
        C4849a c4849a;
        FrameLayout frameLayout;
        ViewStub viewStub;
        View viewFindViewById;
        if (this.f78335l == null && (c4849a = this.f78333j) != null && (frameLayout = c4849a.f53974j) != null && (viewStub = (ViewStub) frameLayout.findViewById(2131316325)) != null) {
            this.f78335l = viewStub.inflate();
            Context context = getContext();
            if (context != null && (viewFindViewById = frameLayout.findViewById(2131300726)) != null) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                layoutParams.height = ScreenUtil.getScreenHeight(context);
                viewFindViewById.setLayoutParams(layoutParams);
            }
        }
        final View view = this.f78335l;
        if (view == null) {
            return;
        }
        R0 r0Bind = R0.bind(view);
        r0Bind.f53849b.setImageResource(i7);
        Object parent = r0Bind.f53849b.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.setTranslationY(60 * getResources().getDisplayMetrics().density);
        }
        r0Bind.f53850c.setText(i8);
        r0Bind.f53848a.setVisibility(0);
        r0Bind.f53851d.setOnClickListener(new View.OnClickListener(view, this) { // from class: com.bilibili.pegasus.page.D

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final View f78280a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TimeMachinePegasusFragment f78281b;

            {
                this.f78280a = view;
                this.f78281b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                View view4 = this.f78280a;
                TimeMachinePegasusFragment timeMachinePegasusFragment = this.f78281b;
                view4.setVisibility(8);
                timeMachinePegasusFragment.lf().I0(true, PegasusFlush.GRADUATION_26, 0, timeMachinePegasusFragment.f78321B);
            }
        });
    }

    public final void tf(int i7) {
        GraduationSeasonAnalysisDialogType graduationSeasonAnalysisDialogType;
        if (this.f78320A) {
            return;
        }
        this.f78320A = true;
        C5721j c5721j = this.f78341r;
        if (c5721j != null) {
            c5721j.f78408j = true;
            c5721j.b();
            c5721j.f78401b.setVisibility(8);
        }
        GraduationSeasonConfig graduationSeasonConfig = this.f78346w;
        GraduationSeasonShareConfig share = graduationSeasonConfig != null ? graduationSeasonConfig.getShare() : null;
        if (i7 == 2026) {
            graduationSeasonAnalysisDialogType = GraduationSeasonAnalysisDialogType.THIS_YEAR;
        } else {
            Integer numValueOf = share != null ? Integer.valueOf(share.getType()) : null;
            graduationSeasonAnalysisDialogType = (numValueOf != null && numValueOf.intValue() == 1) ? GraduationSeasonAnalysisDialogType.YEAR_HOT : (numValueOf != null && numValueOf.intValue() == 2) ? GraduationSeasonAnalysisDialogType.ANALYSIS : (numValueOf != null && numValueOf.intValue() == 3) ? GraduationSeasonAnalysisDialogType.THIS_YEAR : GraduationSeasonAnalysisDialogType.DEFAULT;
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new TimeMachinePegasusFragment$showGraduationSeasonAnalysisDialog$1(share, this, graduationSeasonAnalysisDialogType, null), 3, (Object) null);
    }

    public final void uf() {
        Object obj;
        GraduationSeasonConfig graduationSeasonConfig = this.f78346w;
        if (graduationSeasonConfig == null) {
            return;
        }
        C5721j c5721j = this.f78341r;
        if (c5721j != null) {
            c5721j.f78408j = true;
            c5721j.b();
            c5721j.f78401b.setVisibility(8);
        }
        GraduationSeasonYearSelectDialogFragment.a aVar = GraduationSeasonYearSelectDialogFragment.f76030o;
        Af1.w wVar = new Af1.w(this, 3);
        com.bilibili.column.ui.manager.draft.h hVar = new com.bilibili.column.ui.manager.draft.h(1, this);
        aVar.getClass();
        FragmentManager childFragmentManager = getChildFragmentManager();
        if (childFragmentManager.isDestroyed() || childFragmentManager.findFragmentByTag("GraduationSeasonYearSelectDialog") != null) {
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            GraduationSeasonYearSelectDialogFragment graduationSeasonYearSelectDialogFragment = new GraduationSeasonYearSelectDialogFragment();
            graduationSeasonYearSelectDialogFragment.f76031b = graduationSeasonConfig;
            graduationSeasonYearSelectDialogFragment.f76033d = wVar;
            graduationSeasonYearSelectDialogFragment.f76032c = hVar;
            graduationSeasonYearSelectDialogFragment.show(childFragmentManager, "GraduationSeasonYearSelectDialog");
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            R9.v.a("show failed: ", th2.getMessage(), "[GraduationSeason]YearSelectDialog");
        }
    }

    public final void vf() {
        GraduationSeasonConfig graduationSeasonConfig;
        GraduationSeasonShareConfig share;
        if (this.f78344u || (graduationSeasonConfig = this.f78346w) == null || (share = graduationSeasonConfig.getShare()) == null) {
            return;
        }
        int type = share.getType();
        this.f78344u = true;
        Neurons.reportExposure$default(true, "activity.graduation.recommend-page.0.show", MapsKt.plus(MapsKt.mapOf(new Pair[]{TuplesKt.to("from_spmid", "activity.graduation.recommend-page.0"), TuplesKt.to("spmid", "activity.graduation.recommend-page.0")}), MapsKt.mapOf(TuplesKt.to("recommend_type", String.valueOf(type)))), (List) null, 8, (Object) null);
    }

    @Override // com.bilibili.pegasus.components.graduation.T
    public final void zb(@NotNull String str) {
        com.bilibili.pegasus.components.graduation.S s7 = this.f78334k;
        if (s7 != null) {
            s7.c(str);
        }
    }
}
