package com.bilibili.search2.result.base;

import HS0.I;
import OS0.V;
import OS0.W;
import Vn.A;
import Yt0.C3163q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.widget.SearchLoadingImageView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.bililive.room.ui.roomv3.gift.G;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.search2.main.data.SearchPageStateModel;
import com.bilibili.search2.main.z;
import com.bilibili.search2.result.BiliMainSearchResultFragment;
import com.bilibili.search2.result.all.SearchResultAllViewModel;
import com.bilibili.search2.result.base.BaseSearchResultViewModel;
import com.bilibili.search2.result.base.q;
import com.bilibili.search2.result.base.u;
import com.bilibili.search2.utils.B;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultFragment.class */
@StabilityInferred(parameters = 0)
public abstract class BaseSearchResultFragment<T extends BaseSearchResultViewModel> extends BaseFragment implements IPvTracker {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final KProperty<Object>[] f87471t = {new MutablePropertyReference1Impl(BaseSearchResultFragment.class, "mExposeClient", "getMExposeClient()Lcom/bilibili/exposer/ExposeClient;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f87472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f87473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<u> f87474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public SearchLoadingImageView f87475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ConstraintLayout f87476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f87477g;

    @Nullable
    public RecyclerView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w<?> f87478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f87479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f87480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comm.list.common.widget.a f87481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f87482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f87483n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f87484o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.search2.result.base.c f87485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f87486q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final a f87487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public SearchPageStateModel f87488s;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultFragment$a.class */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseSearchResultFragment<T> f87489a;

        public a(BaseSearchResultFragment<T> baseSearchResultFragment) {
            this.f87489a = baseSearchResultFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            BaseSearchResultFragment<T> baseSearchResultFragment = this.f87489a;
            if (baseSearchResultFragment.f87486q == baseSearchResultFragment.of().getHeight() || this.f87489a.of().getHeight() <= 0) {
                return;
            }
            BaseSearchResultFragment<T> baseSearchResultFragment2 = this.f87489a;
            baseSearchResultFragment2.f87486q = baseSearchResultFragment2.of().getHeight();
            this.f87489a.yf();
            defpackage.a.a(this.f87489a.of().getHeight(), "loadingViewListener ,mLoadingView ", a.class.getSimpleName());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultFragment$b.class */
    public static final class b extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f87490a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BaseSearchResultFragment<T> f87491b;

        public b(BaseSearchResultFragment<T> baseSearchResultFragment) {
            this.f87491b = baseSearchResultFragment;
        }

        public final void a(RecyclerView recyclerView) {
            Function1<Boolean, Unit> function1;
            int childCount = recyclerView.getChildCount();
            if (childCount > 0) {
                BaseSearchResultFragment<T> baseSearchResultFragment = this.f87491b;
                if (baseSearchResultFragment.rf().Q0() || baseSearchResultFragment.rf().N0() <= 0 || this.f87490a) {
                    return;
                }
                View childAt = recyclerView.getChildAt(childCount - 1);
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition == adapter.getItemCount() - 1) {
                    Boolean boolR0 = baseSearchResultFragment.rf().R0();
                    Boolean bool = Boolean.FALSE;
                    if (Intrinsics.areEqual(boolR0, bool)) {
                        int itemCount = adapter.getItemCount();
                        Boolean boolR02 = baseSearchResultFragment.rf().R0();
                        StringBuilder sbB = A.b(childAdapterPosition, itemCount, "onScrolled loadMore lastVisible:", ", itemCount:", ",isLoading:");
                        sbB.append(boolR02);
                        baseSearchResultFragment.uf(sbB.toString());
                        w<?> wVarMf = baseSearchResultFragment.f87478i != null ? baseSearchResultFragment.mf() : null;
                        if (wVarMf != null && (function1 = wVarMf.f87668b) != null) {
                            function1.invoke(bool);
                        }
                        this.f87490a = true;
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            super.onScrollStateChanged(recyclerView, i7);
            this.f87491b.uf("onScrollStateChanged newState:" + i7);
            if (i7 != 1) {
                return;
            }
            this.f87490a = false;
            a(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            a(recyclerView);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultFragment$c.class */
    public static final class c extends C3163q {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Yt0.C3163q
        public final boolean needDrawDivider(RecyclerView.ViewHolder viewHolder) {
            return !(viewHolder instanceof Et0.a) || ((Et0.a) viewHolder).isNeedDrawDivider();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultFragment$d.class */
    public static final class d implements eY.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclerView f87492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BaseSearchResultFragment<T> f87493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f87494c;

        public d(RecyclerView recyclerView, BaseSearchResultFragment<T> baseSearchResultFragment, int i7) {
            this.f87492a = recyclerView;
            this.f87493b = baseSearchResultFragment;
            this.f87494c = i7;
        }

        public final Rect a() {
            RecyclerView recyclerView = this.f87492a;
            return new Rect(0, 0, recyclerView.getWidth(), (recyclerView.getHeight() - this.f87493b.rf().f87500g) - this.f87494c);
        }
    }

    public BaseSearchResultFragment() {
        this(true);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [com.bilibili.search2.result.base.c] */
    public BaseSearchResultFragment(boolean z6) {
        this.f87472b = z6;
        this.f87473c = "BaseSearchResultFragment";
        this.f87474d = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f87479j = LazyKt.lazy(new I(this, 3));
        Lazy lazy = LazyKt.lazy(new V(this, 1));
        this.f87480k = lazy;
        this.f87481l = new com.bilibili.app.comm.list.common.widget.a((com.bilibili.app.comm.list.common.widget.l) lazy.getValue());
        this.f87483n = LazyKt.lazy(new W(this, 3));
        this.f87484o = -1;
        this.f87485p = new Function2(this) { // from class: com.bilibili.search2.result.base.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BaseSearchResultFragment f87538a;

            {
                this.f87538a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                bY.c<RecyclerView> cVarNf;
                int iIntValue = ((Integer) obj2).intValue();
                KProperty<Object>[] kPropertyArr = BaseSearchResultFragment.f87471t;
                int height = ((AppBarLayout) obj).getHeight();
                BaseSearchResultFragment baseSearchResultFragment = this.f87538a;
                baseSearchResultFragment.f87484o = height + iIntValue;
                if (baseSearchResultFragment.f87482m && (cVarNf = baseSearchResultFragment.nf()) != null) {
                    cVarNf.h();
                }
                baseSearchResultFragment.vf();
                return Unit.INSTANCE;
            }
        };
        this.f87487r = new a(this);
    }

    public static void Af(BaseSearchResultFragment baseSearchResultFragment, int i7) {
        RecyclerView recyclerView = baseSearchResultFragment.h;
        GridLayoutManager gridLayoutManager = null;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager instanceof GridLayoutManager) {
            gridLayoutManager = (GridLayoutManager) layoutManager;
        }
        if (gridLayoutManager == null) {
            return;
        }
        gridLayoutManager.setSpanSizeLookup(new f(baseSearchResultFragment, i7, 1));
    }

    public static int Bf(BaseSearchResultFragment baseSearchResultFragment) {
        Context context;
        RecyclerView recyclerView = baseSearchResultFragment.h;
        int i7 = 1;
        int i8 = 1;
        if (recyclerView != null && (context = recyclerView.getContext()) != null) {
            if (com.bilibili.search2.component.e.g(context) && com.bilibili.search2.component.e.b(context).f86403d > ListExtentionsKt.toPx(WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND)) {
                i8 = 2;
            }
            RecyclerView recyclerView2 = baseSearchResultFragment.h;
            i7 = i8;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new GridLayoutManager(context, i8));
                i7 = i8;
            }
        }
        return i7;
    }

    public void C1() {
        ListExtentionsKt.gone(this.h);
        SearchLoadingImageView searchLoadingImageView = this.f87475e;
        if (searchLoadingImageView != null) {
            SearchLoadingImageView.P(searchLoadingImageView, false, (Integer) null, (Integer) null, 7);
        }
        ListExtentionsKt.visible(pf());
    }

    public void Cf() {
        w<?> wVarMf = mf();
        s sVar = wVarMf.f87669c;
        sVar.f87607a = 1;
        sVar.f87608b = null;
        sVar.f87609c = null;
        wVarMf.V();
    }

    public void Df(@Nullable k kVar) {
    }

    public void Ef() {
        SearchLoadingImageView searchLoadingImageView = this.f87475e;
        if (searchLoadingImageView != null) {
            int i7 = SearchLoadingImageView.m;
            SearchLoadingImageView.P(searchLoadingImageView, false, 2131236939, 2131841407, 1);
        }
        ListExtentionsKt.gone(this.h);
        ListExtentionsKt.visible(pf());
        yf();
    }

    public void Ff() {
        ListExtentionsKt.gone(this.h);
        SearchLoadingImageView searchLoadingImageView = this.f87475e;
        if (searchLoadingImageView != null) {
            int i7 = SearchLoadingImageView.m;
            searchLoadingImageView.M(false, (Integer) null, (Integer) null);
        }
        ListExtentionsKt.gone(pf());
    }

    public void Gf(@Nullable i iVar) {
    }

    public final void Hf(@NotNull final T t7) {
        if (t7.Q0()) {
            if (t7.N0() != 1) {
                t7.V0(new u.j(new k()));
                return;
            }
            t7.V0(new u.j(new k()));
            final RecyclerView recyclerView = this.h;
            if (recyclerView == null || OneShotPreDrawListener.add(recyclerView, new Runnable(this, recyclerView, t7) { // from class: com.bilibili.search2.result.base.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BaseSearchResultFragment f87535a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final RecyclerView f87536b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final BaseSearchResultViewModel f87537c;

                {
                    this.f87535a = this;
                    this.f87536b = recyclerView;
                    this.f87537c = t7;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseSearchResultFragment baseSearchResultFragment = this.f87535a;
                    RecyclerView recyclerView2 = this.f87536b;
                    BaseSearchResultViewModel baseSearchResultViewModel = this.f87537c;
                    KProperty<Object>[] kPropertyArr = BaseSearchResultFragment.f87471t;
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(baseSearchResultFragment.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new BaseSearchResultFragment$computeFirstScreen$1$1$1(recyclerView2, baseSearchResultViewModel, null), 3, (Object) null);
                }
            }) == null) {
                BLog.e(this.f87473c, "dispatchEvent mRecyclerView is null");
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void If(@Nullable View view) {
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams instanceof AppBarLayout.LayoutParams) {
            SearchResultAll searchResultAllH1 = qf().h1();
            if (searchResultAllH1 == null || !searchResultAllH1.refreshFunctionTwoEnable()) {
                ((AppBarLayout.LayoutParams) layoutParams).setScrollFlags(5);
            } else {
                ((AppBarLayout.LayoutParams) layoutParams).setScrollFlags(0);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public abstract void Jf();

    @NotNull
    public abstract T Kf();

    public void Lf(@NotNull final T t7) {
        uf("viewModelsObserve " + t7);
        FlowKt.launchIn(FlowKt.onEach(this.f87474d, new BaseSearchResultFragment$viewModelsObserve$1(t7)), LifecycleOwnerKt.getLifecycleScope(this));
        com.bilibili.search2.utils.extension.b.c(t7.f87499f, this, new PropertyReference1Impl() { // from class: com.bilibili.search2.result.base.BaseSearchResultFragment$viewModelsObserve$2
            public Object get(Object obj) {
                return ((SearchState) obj).isLoading();
            }
        }, new com.bilibili.lib.homepage.widget.t(1, this, t7));
        BaseSearchResultFragment$viewModelsObserve$4 baseSearchResultFragment$viewModelsObserve$4 = new PropertyReference1Impl() { // from class: com.bilibili.search2.result.base.BaseSearchResultFragment$viewModelsObserve$4
            public Object get(Object obj) {
                return ((SearchState) obj).getAllResultList();
            }
        };
        final int i7 = 0;
        Function1 function1 = new Function1(i7, this, t7) { // from class: com.bilibili.search2.result.base.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f87541a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f87542b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f87543c;

            {
                this.f87541a = i7;
                this.f87542b = this;
                this.f87543c = t7;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x011f  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x013c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r6) {
                /*
                    Method dump skipped, instruction units count: 425
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.e.invoke(java.lang.Object):java.lang.Object");
            }
        };
        StateFlow<SearchState> stateFlow = t7.f87499f;
        com.bilibili.search2.utils.extension.b.c(stateFlow, this, baseSearchResultFragment$viewModelsObserve$4, function1);
        com.bilibili.search2.utils.extension.b.a(t7.f87497d, this, new Sa.f(this, 2));
        com.bilibili.search2.utils.extension.b.c(stateFlow, this, new PropertyReference1Impl() { // from class: com.bilibili.search2.result.base.BaseSearchResultFragment$viewModelsObserve$7
            public Object get(Object obj) {
                return ((SearchState) obj).getErrorState();
            }
        }, new com.bilibili.pegasus.verticaltab.f(this, 1));
        com.bilibili.search2.utils.extension.b.c(stateFlow, this, new PropertyReference1Impl() { // from class: com.bilibili.search2.result.base.BaseSearchResultFragment$viewModelsObserve$9
            public Object get(Object obj) {
                return ((SearchState) obj).getFooterState();
            }
        }, new G(1, this));
        com.bilibili.search2.utils.extension.b.b(stateFlow, this, new PropertyReference1Impl() { // from class: com.bilibili.search2.result.base.BaseSearchResultFragment$viewModelsObserve$11
            public Object get(Object obj) {
                return ((SearchState) obj).getHasNoResultCard();
            }
        }, new B11.h(this, 1));
    }

    public void d() {
        ListExtentionsKt.smoothScrollToTop(this.h);
        kf();
    }

    public void hideLoading() {
        SearchLoadingImageView searchLoadingImageView = this.f87475e;
        if (searchLoadingImageView != null) {
            searchLoadingImageView.K(false);
        }
        ListExtentionsKt.visible(this.h);
        ListExtentionsKt.gone(pf());
    }

    public void jf(@Nullable Boolean bool) {
        Jf();
    }

    public boolean kf() {
        Ii.a parentFragment = getParentFragment();
        if (!(parentFragment instanceof Ii.a)) {
            return true;
        }
        Ii.a aVar = parentFragment;
        aVar.C();
        return aVar.isExpanded();
    }

    public final void lf(@NotNull BaseSearchResultFragment<?> baseSearchResultFragment) {
        PageViewTracker.getInstance().onPageVisibleChange(baseSearchResultFragment.getPvEventId(), String.valueOf(baseSearchResultFragment.hashCode()), 0, getPvExtra(), false);
    }

    public abstract void loadData(boolean z6);

    @NotNull
    public final w<?> mf() {
        w<?> wVar = this.f87478i;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        return null;
    }

    @Nullable
    public final bY.c<RecyclerView> nf() {
        com.bilibili.app.comm.list.common.widget.a aVar = this.f87481l;
        KProperty<Object> kProperty = f87471t[0];
        return (bY.c) aVar.b;
    }

    @NotNull
    public final ConstraintLayout of() {
        ConstraintLayout constraintLayout = this.f87476f;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
        return null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (EntryPointKt.getMemleakOptEnable()) {
            of().getViewTreeObserver().removeOnGlobalLayoutListener(this.f87487r);
        }
        super.onDestroyView();
        Fragment parentFragment = getParentFragment();
        BiliMainSearchResultFragment biliMainSearchResultFragment = parentFragment instanceof BiliMainSearchResultFragment ? (BiliMainSearchResultFragment) parentFragment : null;
        if (biliMainSearchResultFragment == null) {
            return;
        }
        ((ArrayList) biliMainSearchResultFragment.f87084T).remove(this.f87485p);
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [cY.c, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int height;
        super.onViewCreated(view, bundle);
        this.f87476f = (ConstraintLayout) view.findViewById(2131303626);
        of().getViewTreeObserver().addOnGlobalLayoutListener(this.f87487r);
        yf();
        Lf(rf());
        if (this.f87477g != null) {
            pf().setOnClickListener(new com.bilibili.search2.result.base.d(0, this));
        }
        this.f87488s = z.d(this);
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new b(this));
            if (this.f87472b) {
                recyclerView.addItemDecoration(new C3163q(R$color.Ga2, ListExtentionsKt.toPx(0.5f), ListExtentionsKt.toPx(com.bilibili.search2.component.e.b(recyclerView.getContext()).f86404e), ListExtentionsKt.toPx(com.bilibili.search2.component.e.g(recyclerView.getContext()) ? 8 : 0), true, null, com.bilibili.search2.component.e.j(recyclerView.getContext()), false, 736));
            }
            Fragment parentFragment = getParentFragment();
            BiliMainSearchResultFragment biliMainSearchResultFragment = parentFragment instanceof BiliMainSearchResultFragment ? (BiliMainSearchResultFragment) parentFragment : null;
            if (biliMainSearchResultFragment != null) {
                ((ArrayList) biliMainSearchResultFragment.f87084T).add(this.f87485p);
                AppBarLayout appBarLayout = biliMainSearchResultFragment.f87088l;
                if (appBarLayout == null || appBarLayout.getHeight() <= 0) {
                    height = biliMainSearchResultFragment.f87071G;
                } else {
                    LinearLayout linearLayout = biliMainSearchResultFragment.f87088l;
                    if (linearLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
                        linearLayout = null;
                    }
                    height = linearLayout.getHeight();
                }
            } else {
                height = 0;
            }
            d dVar = new d(recyclerView, this, height);
            bY.d dVar2 = new bY.d(new eY.c(recyclerView));
            dVar2.b(0.8f);
            bY.a aVar = dVar2.b;
            aVar.e = true;
            aVar.b = dVar;
            aVar.g = new Object();
            this.f87481l.a(dVar2.a(), f87471t[0]);
        }
    }

    @NotNull
    public final TextView pf() {
        TextView textView = this.f87477g;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRetry");
        return null;
    }

    public final SearchResultAllViewModel qf() {
        return (SearchResultAllViewModel) this.f87483n.getValue();
    }

    @NotNull
    public final T rf() {
        return (T) this.f87479j.getValue();
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    public void setUserVisibleCompat(boolean z6) {
        this.f87482m = z6;
        if (z6) {
            bY.c<RecyclerView> cVarNf = nf();
            if (cVarNf != null) {
                cVarNf.d = true;
                cVarNf.h();
            }
        } else {
            bY.c<RecyclerView> cVarNf2 = nf();
            if (cVarNf2 != null) {
                cVarNf2.a();
            }
        }
        super.setUserVisibleCompat(z6);
    }

    public boolean sf(@NotNull q.a aVar) {
        return false;
    }

    public void showLoading() {
        ListExtentionsKt.gone(this.h);
        ListExtentionsKt.gone(pf());
        SearchLoadingImageView searchLoadingImageView = this.f87475e;
        if (searchLoadingImageView != null) {
            SearchLoadingImageView.R(searchLoadingImageView, getViewLifecycleOwner());
        }
    }

    public int tf() {
        TypedArray typedArrayObtainStyledAttributes;
        Context context = getContext();
        return (context == null || (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130969563})) == null) ? ListExtentionsKt.toPx(40) : (int) typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
    }

    public final void uf(@NotNull String str) {
        BLog.d(this.f87473c, this + ":: " + str);
    }

    public void vf() {
    }

    public void wf() {
    }

    public final void xf(@NotNull BaseSearchResultFragment baseSearchResultFragment) {
        PageViewTracker.getInstance().onPageVisibleChange(getPvEventId(), String.valueOf(baseSearchResultFragment.hashCode()), 0, getPvExtra(), true);
    }

    public final void yf() {
        int px;
        Fragment parentFragment = getParentFragment();
        BiliMainSearchResultFragment biliMainSearchResultFragment = parentFragment instanceof BiliMainSearchResultFragment ? (BiliMainSearchResultFragment) parentFragment : null;
        if (biliMainSearchResultFragment != null) {
            int i7 = biliMainSearchResultFragment.f87075K;
            if (of().getHeight() > 0) {
                px = of().getHeight();
            } else {
                px = this.f87486q;
                if (px <= 0) {
                    px = ListExtentionsKt.toPx(85);
                }
            }
            B.y(of(), (int) (((i7 * 0.4f) - (px * 0.5f)) - tf()));
            of().requestLayout();
            String str = this.f87473c;
            int iTf = tf();
            StringBuilder sbB = A.b(i7, px, "parentViewHeight ", ", loadingHeight ", " loadingOffset() ");
            sbB.append(iTf);
            sbB.append(" instance ");
            sbB.append(this);
            BLog.d(str, sbB.toString());
        }
    }

    public void zf(@Nullable List<? extends BaseSearchItem> list, @NotNull T t7) {
        boolean z6 = false;
        if (list == null) {
            w<?> wVarMf = mf();
            wVarMf.f87275a.clear();
            wVarMf.notifyDataSetChanged();
            wVarMf.f87670d = false;
            return;
        }
        w<?> wVarMf2 = mf();
        List<BaseSearchItem> mutableList = CollectionsKt.toMutableList(list);
        boolean zQ0 = t7.Q0();
        if (t7.N0() == 1) {
            z6 = true;
        }
        wVarMf2.Y(mutableList, zQ0, z6);
        Hf(t7);
    }
}
