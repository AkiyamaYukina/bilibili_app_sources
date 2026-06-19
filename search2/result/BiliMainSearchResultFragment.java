package com.bilibili.search2.result;

import Aq0.C1421i;
import Aq0.C1422j;
import J81.L;
import M3.K;
import Vn.A;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import c6.Q;
import com.bilibili.app.comm.list.common.utils.CommonExtensionKt;
import com.bilibili.app.comm.list.widget.SearchLoadingImageView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.dialogmanager2.PageDialogManager;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.search2.component.SearchResultCompatibleComponent;
import com.bilibili.search2.main.data.SearchPageStateModel;
import com.bilibili.search2.main.z;
import com.bilibili.search2.result.all.SearchExtraAppBarBehavior;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import com.bilibili.search2.result.all.SearchResultAllViewModel;
import com.bilibili.search2.result.base.BaseSearchResultFragment;
import com.bilibili.search2.result.base.SearchState;
import com.bilibili.search2.result.ogv.OgvThemeColorHelper;
import com.bilibili.search2.result.ogv.SearchColorModel;
import com.bilibili.search2.result.pages.BiliMainSearchResultPage;
import com.bilibili.search2.utils.B;
import com.bilibili.search2.widget.AlignLeftAndRightPagerSlidingTabStrip;
import com.bilibili.search2.widget.SearchViewPager;
import com.google.android.material.appbar.AppBarLayout;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.D;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/BiliMainSearchResultFragment.class */
@StabilityInferred(parameters = 0)
@AndroidEntryPoint
public final class BiliMainSearchResultFragment extends Hilt_BiliMainSearchResultFragment implements It0.a, Ii.a, l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f87065A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Bl.e f87068D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public w f87069E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f87071G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Inject
    public SearchResultCompatibleComponent f87072H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f87074J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f87075K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public View f87076L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f87078N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f87080P;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @Nullable
    public com.bilibili.search2.result.base.t f87083S;
    public SearchLoadingImageView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f87085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SearchViewPager f87086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f87087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AppBarLayout f87088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public SearchExtraAppBarBehavior f87089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AlignLeftAndRightPagerSlidingTabStrip f87090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public SearchPageStateModel f87091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Kt0.a f87092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Ht0.a f87093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Ht0.a f87094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Ht0.a f87095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public View f87096t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public FrameLayout f87097u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public Integer f87101y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f87102z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f87098v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Lazy f87099w = LazyKt.lazy(new K(6));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f87100x = true;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final Lazy f87066B = LazyKt.lazy(new L(this, 6));

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<com.bilibili.search2.result.base.u> f87067C = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f87070F = -1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final c f87073I = new c(this);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public com.bilibili.search2.main.data.e f87077M = new com.bilibili.search2.main.data.e(0);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public final h f87079O = new h(this);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public final d f87081Q = new d(this);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @NotNull
    public final com.bilibili.search2.result.g f87082R = new View.OnLayoutChangeListener(this) { // from class: com.bilibili.search2.result.g

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliMainSearchResultFragment f87751a;

        {
            this.f87751a = this;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            BiliMainSearchResultFragment biliMainSearchResultFragment = this.f87751a;
            int i15 = i10 - i8;
            if (i15 <= 0 || i15 == i14 - i12) {
                return;
            }
            biliMainSearchResultFragment.f87075K = i15;
            biliMainSearchResultFragment.Cf();
        }
    };

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @NotNull
    public final List<Function2<AppBarLayout, Integer, Unit>> f87084T = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/BiliMainSearchResultFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f87103a;

        static {
            int[] iArr = new int[SearchColorModel.StateSource.values().length];
            try {
                iArr[SearchColorModel.StateSource.SLIDE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SearchColorModel.StateSource.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[SearchColorModel.StateSource.DRAW.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f87103a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/BiliMainSearchResultFragment$b.class */
    public static final class b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliMainSearchResultFragment f87104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f87105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f87106c;

        public b(BiliMainSearchResultFragment biliMainSearchResultFragment, boolean z6, boolean z7) {
            this.f87104a = biliMainSearchResultFragment;
            this.f87105b = z6;
            this.f87106c = z7;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            view.removeOnLayoutChangeListener(this);
            if (this.f87104a.isAdded()) {
                boolean z6 = this.f87105b;
                LinearLayout linearLayout = this.f87104a.f87088l;
                LinearLayout linearLayout2 = linearLayout;
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
                    linearLayout2 = null;
                }
                BLog.d("BiliMainSearchResultFragment", "applyStripExpandState doOnLayout: expanded=" + z6 + ", height=" + linearLayout2.getHeight());
                AppBarLayout appBarLayout = this.f87104a.f87088l;
                if (appBarLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
                    appBarLayout = null;
                }
                appBarLayout.setExpanded(this.f87105b, this.f87106c);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/BiliMainSearchResultFragment$c.class */
    public static final class c implements com.bilibili.search2.eastereggs.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliMainSearchResultFragment f87107a;

        public c(BiliMainSearchResultFragment biliMainSearchResultFragment) {
            this.f87107a = biliMainSearchResultFragment;
        }

        @Override // com.bilibili.search2.eastereggs.j
        public final void dismiss() {
            MutableLiveData<Boolean> mutableLiveData;
            PageDialogManager.Companion companion = PageDialogManager.Companion;
            BiliMainSearchResultFragment biliMainSearchResultFragment = this.f87107a;
            PageDialogManager pageDialogManagerFind = companion.find(biliMainSearchResultFragment);
            if (pageDialogManagerFind != null) {
                pageDialogManagerFind.unlock("search_egg_showing");
            }
            SearchPageStateModel searchPageStateModel = biliMainSearchResultFragment.f87091o;
            if (searchPageStateModel == null || (mutableLiveData = searchPageStateModel.f86768p) == null) {
                return;
            }
            mutableLiveData.setValue(Boolean.FALSE);
        }

        @Override // com.bilibili.search2.eastereggs.j
        public final void isShowing() {
            MutableLiveData<Boolean> mutableLiveData;
            PageDialogManager.Companion companion = PageDialogManager.Companion;
            BiliMainSearchResultFragment biliMainSearchResultFragment = this.f87107a;
            PageDialogManager pageDialogManagerFind = companion.find(biliMainSearchResultFragment);
            if (pageDialogManagerFind != null) {
                pageDialogManagerFind.block("search_egg_showing");
            }
            SearchPageStateModel searchPageStateModel = biliMainSearchResultFragment.f87091o;
            if (searchPageStateModel == null || (mutableLiveData = searchPageStateModel.f86768p) == null) {
                return;
            }
            mutableLiveData.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/BiliMainSearchResultFragment$d.class */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliMainSearchResultFragment f87108a;

        public d(BiliMainSearchResultFragment biliMainSearchResultFragment) {
            this.f87108a = biliMainSearchResultFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            BiliMainSearchResultFragment biliMainSearchResultFragment = this.f87108a;
            if (biliMainSearchResultFragment.f87080P == biliMainSearchResultFragment.uf().getHeight() || this.f87108a.uf().getHeight() <= 0) {
                return;
            }
            BiliMainSearchResultFragment biliMainSearchResultFragment2 = this.f87108a;
            biliMainSearchResultFragment2.f87080P = biliMainSearchResultFragment2.uf().getHeight();
            this.f87108a.Cf();
            BiliMainSearchResultFragment biliMainSearchResultFragment3 = this.f87108a;
            D.a(biliMainSearchResultFragment3.f87075K, biliMainSearchResultFragment3.uf().getHeight(), "loadingViewListener parentViewHeight ", " ,mLoadingView ", "BiliMainSearchResultFragment");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/BiliMainSearchResultFragment$e.class */
    public static final class e implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliMainSearchResultFragment f87109a;

        public e(BiliMainSearchResultFragment biliMainSearchResultFragment) {
            this.f87109a = biliMainSearchResultFragment;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            view.removeOnLayoutChangeListener(this);
            this.f87109a.f87071G = view.getHeight();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/BiliMainSearchResultFragment$f.class */
    public static final class f implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliMainSearchResultFragment f87110a;

        public f(BiliMainSearchResultFragment biliMainSearchResultFragment) {
            this.f87110a = biliMainSearchResultFragment;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i7) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i7, float f7, int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i7) {
            SearchColorModel searchColorModelB;
            MutableLiveData<Integer> mutableLiveData;
            MutableLiveData<Boolean> mutableLiveData2;
            MutableLiveData<Boolean> mutableLiveData3;
            List<BiliMainSearchResultPage> list;
            BiliMainSearchResultPage biliMainSearchResultPage;
            BiliMainSearchResultFragment biliMainSearchResultFragment = this.f87110a;
            Kt0.a aVar = biliMainSearchResultFragment.f87092p;
            Integer num = (aVar == null || (list = aVar.f13006c) == null || (biliMainSearchResultPage = (BiliMainSearchResultPage) CollectionsKt.getOrNull(list, i7)) == null) ? null : biliMainSearchResultPage.f88511g;
            biliMainSearchResultFragment.f87101y = num;
            biliMainSearchResultFragment.f87100x = num != null && num.intValue() == BiliMainSearchResultPage.PageTypes.PAGE_ALL.getPageType();
            biliMainSearchResultFragment.xf().f87251o = Integer.valueOf(i7);
            SearchPageStateModel searchPageStateModel = biliMainSearchResultFragment.f87091o;
            if (searchPageStateModel != null && (mutableLiveData3 = searchPageStateModel.h) != null) {
                mutableLiveData3.setValue(Boolean.TRUE);
            }
            SearchPageStateModel searchPageStateModel2 = biliMainSearchResultFragment.f87091o;
            if (searchPageStateModel2 != null && (mutableLiveData2 = searchPageStateModel2.h) != null) {
                mutableLiveData2.setValue(null);
            }
            OgvThemeColorHelper ogvThemeColorHelperVf = biliMainSearchResultFragment.vf();
            if (ogvThemeColorHelperVf != null && (searchColorModelB = ogvThemeColorHelperVf.b()) != null && (mutableLiveData = searchColorModelB.f88292b) != null) {
                mutableLiveData.setValue(Integer.valueOf(i7));
            }
            if (biliMainSearchResultFragment.f87070F != i7) {
                biliMainSearchResultFragment.f87070F = i7;
                Kt0.a aVar2 = biliMainSearchResultFragment.f87092p;
                String str = "";
                if (aVar2 != null) {
                    List<BiliMainSearchResultPage> list2 = aVar2.f13006c;
                    str = "";
                    if (list2 != null) {
                        BiliMainSearchResultPage biliMainSearchResultPage2 = list2.get(i7);
                        str = "";
                        if (biliMainSearchResultPage2 != null) {
                            str = biliMainSearchResultPage2.f88510f;
                            if (str == null) {
                                str = "";
                            }
                        }
                    }
                }
                Xs0.b.t(str, true);
            }
            w wVar = biliMainSearchResultFragment.f87069E;
            if (wVar != null) {
                Integer num2 = biliMainSearchResultFragment.f87101y;
                if (!Intrinsics.areEqual(wVar.f88595d, num2)) {
                    wVar.f88595d = num2;
                    wVar.a();
                }
            }
            biliMainSearchResultFragment.Bf((SearchState) biliMainSearchResultFragment.xf().f87499f.getValue());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/BiliMainSearchResultFragment$g.class */
    public static final class g implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliMainSearchResultFragment f87111a;

        public g(BiliMainSearchResultFragment biliMainSearchResultFragment) {
            this.f87111a = biliMainSearchResultFragment;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            view.removeOnLayoutChangeListener(this);
            this.f87111a.f87075K = view.getHeight();
            this.f87111a.Cf();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/BiliMainSearchResultFragment$h.class */
    public static final class h implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliMainSearchResultFragment f87112a;

        public h(BiliMainSearchResultFragment biliMainSearchResultFragment) {
            this.f87112a = biliMainSearchResultFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            FrameLayout frameLayout = this.f87112a.f87097u;
            FrameLayout frameLayout2 = frameLayout;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mParentLayout");
                frameLayout2 = null;
            }
            Integer numValueOf = Integer.valueOf(frameLayout2.getHeight());
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                BiliMainSearchResultFragment biliMainSearchResultFragment = this.f87112a;
                biliMainSearchResultFragment.f87075K = numValueOf.intValue();
                biliMainSearchResultFragment.Cf();
            }
            FrameLayout frameLayout3 = this.f87112a.f87097u;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mParentLayout");
                frameLayout3 = null;
            }
            frameLayout3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BiliMainSearchResultFragment biliMainSearchResultFragment2 = this.f87112a;
            D.a(biliMainSearchResultFragment2.f87075K, biliMainSearchResultFragment2.f87080P, "parentListener parentViewHeight ", " ,mLoadingView ", "BiliMainSearchResultFragment");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/BiliMainSearchResultFragment$i.class */
    public static final /* synthetic */ class i implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f87113a;

        public i(Function1 function1) {
            this.f87113a = function1;
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
            return this.f87113a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f87113a.invoke(obj);
        }
    }

    public static int zf(int i7, List list) {
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (((SearchResultAll.NavInfo) it.next()).getType() == i7) {
                return i8;
            }
            i8++;
        }
        return 0;
    }

    public final void Af() {
        Bl.e eVar = this.f87068D;
        Bl.e eVar2 = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar2 = null;
        }
        CommonExtensionKt.setMarginRight(eVar2.g, 0);
        Bl.e eVar3 = this.f87068D;
        Bl.e eVar4 = eVar3;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar4 = null;
        }
        eVar4.h.setGradientMarginRight(0);
        Bl.e eVar5 = this.f87068D;
        Bl.e eVar6 = eVar5;
        if (eVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar6 = null;
        }
        eVar6.h.a(false);
        Bl.e eVar7 = this.f87068D;
        Bl.e eVar8 = eVar7;
        if (eVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar8 = null;
        }
        eVar8.g.setNeedRefreshParent(false);
        Bl.e eVar9 = this.f87068D;
        if (eVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar9 = null;
        }
        ListExtentionsKt.gone(eVar9.d);
    }

    public final void Bf(SearchState searchState) {
        if (searchState.getNav() == null) {
            Af();
            w wVar = this.f87069E;
            if (wVar != null) {
                ListExtentionsKt.gone(wVar.f88592a);
                return;
            }
            return;
        }
        if (this.f87100x) {
            Bl.e eVar = this.f87068D;
            Bl.e eVar2 = eVar;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eVar2 = null;
            }
            CommonExtensionKt.setMarginRight(eVar2.g, ListExtentionsKt.toPx(46));
            Bl.e eVar3 = this.f87068D;
            Bl.e eVar4 = eVar3;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eVar4 = null;
            }
            eVar4.h.setGradientMarginRight(ListExtentionsKt.toPx(46));
            if (((SearchState) xf().f87499f.getValue()).getHasImmerseCard()) {
                Bl.e eVar5 = this.f87068D;
                Bl.e eVar6 = eVar5;
                if (eVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    eVar6 = null;
                }
                eVar6.h.a(true);
                Bl.e eVar7 = this.f87068D;
                Bl.e eVar8 = eVar7;
                if (eVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    eVar8 = null;
                }
                eVar8.g.setNeedRefreshParent(true);
            } else {
                Bl.e eVar9 = this.f87068D;
                Bl.e eVar10 = eVar9;
                if (eVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    eVar10 = null;
                }
                eVar10.h.a(false);
                Bl.e eVar11 = this.f87068D;
                Bl.e eVar12 = eVar11;
                if (eVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    eVar12 = null;
                }
                eVar12.g.setNeedRefreshParent(false);
            }
            Bl.e eVar13 = this.f87068D;
            if (eVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eVar13 = null;
            }
            ListExtentionsKt.visible(eVar13.d);
        } else {
            Af();
        }
        w wVar2 = this.f87069E;
        if (wVar2 != null) {
            wVar2.a();
        }
    }

    public final void C() {
        if (this.f87102z) {
            qf(true, false);
        }
    }

    @Override // It0.a
    public final void Ce(int i7, @Nullable Bitmap bitmap) {
    }

    public final void Cf() {
        Integer numValueOf;
        int iIntValue;
        FrameLayout frameLayout = this.f87097u;
        if (frameLayout == null || frameLayout.getHeight() <= 0) {
            int i7 = this.f87075K;
            numValueOf = Integer.valueOf(i7);
            if (i7 <= 0) {
                numValueOf = null;
            }
        } else {
            FrameLayout frameLayout2 = this.f87097u;
            FrameLayout frameLayout3 = frameLayout2;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mParentLayout");
                frameLayout3 = null;
            }
            int height = frameLayout3.getHeight();
            numValueOf = Integer.valueOf(height);
            this.f87075K = height;
        }
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            View viewUf = uf();
            float f7 = iIntValue2;
            int height2 = uf().getHeight();
            Integer numValueOf2 = Integer.valueOf(height2);
            if (height2 <= 0) {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                iIntValue = numValueOf2.intValue();
            } else {
                int i8 = this.f87080P;
                Integer numValueOf3 = null;
                if (i8 > 0) {
                    numValueOf3 = Integer.valueOf(i8);
                }
                iIntValue = numValueOf3 != null ? numValueOf3.intValue() : ListExtentionsKt.toPx(85);
            }
            B.y(viewUf, RangesKt.coerceAtLeast((int) ((f7 * 0.4f) - (iIntValue * 0.5f)), 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.viewpager.widget.ViewPager] */
    public final void Df() {
        View view = this.f87087k;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerLayout");
            view2 = null;
        }
        view2.setVisibility(8);
        Context context = getContext();
        if (context != null) {
            this.f87092p = new Kt0.a(context, getChildFragmentManager());
            SearchViewPager searchViewPager = this.f87086j;
            SearchViewPager searchViewPager2 = searchViewPager;
            if (searchViewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPager");
                searchViewPager2 = null;
            }
            searchViewPager2.setAdapter(this.f87092p);
            AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip = this.f87090n;
            if (alignLeftAndRightPagerSlidingTabStrip == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
                alignLeftAndRightPagerSlidingTabStrip = null;
            }
            alignLeftAndRightPagerSlidingTabStrip.notifyDataSetChanged();
        }
    }

    public final void Ef(Map<String, String> map) {
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new BiliMainSearchResultFragment$sendSearchIntent$1(this, map, null), 3, (Object) null);
    }

    public final void Ff(@ColorInt int i7) {
        Bl.e eVar = this.f87068D;
        Bl.e eVar2 = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar2 = null;
        }
        eVar2.h.setBackgroundColor(i7);
        Bl.e eVar3 = this.f87068D;
        Bl.e eVar4 = eVar3;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar4 = null;
        }
        eVar4.d.setBackgroundColor(i7);
        Bl.e eVar5 = this.f87068D;
        if (eVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar5 = null;
        }
        eVar5.c.setBackgroundColor(i7);
    }

    public final void Gf(@ColorInt int i7, @ColorInt int i8, int i9) {
        Ht0.a aVar = this.f87093q;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
            aVar2 = null;
        }
        aVar2.f8771d = i7;
        Ht0.a aVar3 = this.f87095s;
        Ht0.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarSelectColor");
            aVar4 = null;
        }
        aVar4.f8771d = i8;
        Ht0.a aVar5 = this.f87094r;
        Ht0.a aVar6 = aVar5;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabTitleColor");
            aVar6 = null;
        }
        aVar6.f8771d = i9;
        Ht0.a aVar7 = this.f87093q;
        Ht0.a aVar8 = aVar7;
        if (aVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
            aVar8 = null;
        }
        Ff(aVar8.f8771d);
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip2 = alignLeftAndRightPagerSlidingTabStrip;
        if (alignLeftAndRightPagerSlidingTabStrip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip2 = null;
        }
        Ht0.a aVar9 = this.f87095s;
        Ht0.a aVar10 = aVar9;
        if (aVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarSelectColor");
            aVar10 = null;
        }
        alignLeftAndRightPagerSlidingTabStrip2.setIndicatorColor(aVar10.f8771d);
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip3 = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip4 = alignLeftAndRightPagerSlidingTabStrip3;
        if (alignLeftAndRightPagerSlidingTabStrip3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip4 = null;
        }
        Ht0.a aVar11 = this.f87094r;
        if (aVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabTitleColor");
            aVar11 = null;
        }
        alignLeftAndRightPagerSlidingTabStrip4.setTabTextAppearance(aVar11.f8771d);
    }

    public final boolean Ha() {
        boolean z6 = false;
        if (!this.f87102z) {
            return false;
        }
        LinearLayout linearLayout = this.f87088l;
        LinearLayout linearLayout2 = linearLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
            linearLayout2 = null;
        }
        BLog.d("SEARCH_SCROLL", "canParentScrollUp" + linearLayout2.getY());
        LinearLayout linearLayout3 = this.f87088l;
        LinearLayout linearLayout4 = linearLayout3;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
            linearLayout4 = null;
        }
        float y6 = linearLayout4.getY();
        LinearLayout linearLayout5 = this.f87088l;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
            linearLayout5 = null;
        }
        if (y6 > linearLayout5.getHeight() * (-1)) {
            z6 = true;
        }
        return z6;
    }

    @Override // It0.a
    public final void K5(@ColorInt int i7) {
        Ff(i7);
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip2 = alignLeftAndRightPagerSlidingTabStrip;
        if (alignLeftAndRightPagerSlidingTabStrip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip2 = null;
        }
        Ht0.a aVar = this.f87095s;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarSelectColor");
            aVar2 = null;
        }
        alignLeftAndRightPagerSlidingTabStrip2.setIndicatorColor(aVar2.f8769b);
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip3 = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip4 = alignLeftAndRightPagerSlidingTabStrip3;
        if (alignLeftAndRightPagerSlidingTabStrip3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip4 = null;
        }
        Ht0.a aVar3 = this.f87094r;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabTitleColor");
            aVar3 = null;
        }
        alignLeftAndRightPagerSlidingTabStrip4.setTabTextAppearance(aVar3.f8769b);
    }

    @Override // It0.a
    public final void Ke() {
        Ht0.a aVar = this.f87093q;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
            aVar2 = null;
        }
        Ff(aVar2.f8768a);
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip2 = alignLeftAndRightPagerSlidingTabStrip;
        if (alignLeftAndRightPagerSlidingTabStrip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip2 = null;
        }
        Ht0.a aVar3 = this.f87095s;
        Ht0.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarSelectColor");
            aVar4 = null;
        }
        alignLeftAndRightPagerSlidingTabStrip2.setIndicatorColor(aVar4.f8768a);
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip3 = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip4 = alignLeftAndRightPagerSlidingTabStrip3;
        if (alignLeftAndRightPagerSlidingTabStrip3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip4 = null;
        }
        Ht0.a aVar5 = this.f87094r;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabTitleColor");
            aVar5 = null;
        }
        alignLeftAndRightPagerSlidingTabStrip4.setTabTextAppearance(aVar5.f8768a);
    }

    @Override // It0.a
    public final void Nc(@Nullable Bitmap bitmap) {
        Ht0.a aVar = this.f87093q;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
            aVar2 = null;
        }
        Ff(aVar2.f8771d);
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip2 = alignLeftAndRightPagerSlidingTabStrip;
        if (alignLeftAndRightPagerSlidingTabStrip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip2 = null;
        }
        Ht0.a aVar3 = this.f87095s;
        Ht0.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarSelectColor");
            aVar4 = null;
        }
        alignLeftAndRightPagerSlidingTabStrip2.setIndicatorColor(aVar4.f8769b);
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip3 = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip4 = alignLeftAndRightPagerSlidingTabStrip3;
        if (alignLeftAndRightPagerSlidingTabStrip3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip4 = null;
        }
        Ht0.a aVar5 = this.f87094r;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabTitleColor");
            aVar5 = null;
        }
        alignLeftAndRightPagerSlidingTabStrip4.setTabTextAppearance(aVar5.f8769b);
    }

    @Override // It0.a
    public final void W6(@Nullable Bitmap bitmap) {
    }

    @Override // It0.a
    public final void Z4() {
        pf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.viewpager.widget.ViewPager] */
    @Override // com.bilibili.search2.result.l
    public final void Ze(@NotNull Map map, int i7, boolean z6) {
        int iZf;
        Kt0.a aVar;
        ActivityResultCaller activityResultCaller;
        List<SearchResultAll.NavInfo> nav = ((SearchState) xf().f87499f.getValue()).getNav();
        if (nav == null || (iZf = zf(i7, nav)) == this.f87070F) {
            return;
        }
        if (z6 && (aVar = this.f87092p) != null && (activityResultCaller = (Fragment) aVar.f13005b.get(Integer.valueOf(iZf))) != null) {
            bilibili.live.app.service.resolver.c.a(iZf, "resetTabState by cache ", "BiliSearchMainResultPagerAdapter");
            m mVar = activityResultCaller instanceof m ? (m) activityResultCaller : null;
            if (mVar != null) {
                mVar.J6(map);
            }
        }
        SearchViewPager searchViewPager = this.f87086j;
        if (searchViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
            searchViewPager = null;
        }
        searchViewPager.setCurrentItem(iZf, !z6);
        qf(true, false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // It0.a
    public final void f9(float f7, int i7, @NotNull SearchColorModel.StateSource stateSource) throws NoWhenBranchMatchedException {
        int i8 = a.f87103a[stateSource.ordinal()];
        Ht0.a aVar = null;
        Ht0.a aVar2 = null;
        if (i8 == 1) {
            int iA = com.bilibili.search2.utils.m.a(f7, i7);
            Ht0.a aVar3 = this.f87093q;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
                aVar3 = null;
            }
            aVar3.f8771d = iA;
            return;
        }
        if (i8 == 2) {
            Ht0.a aVar4 = this.f87093q;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
            } else {
                aVar = aVar4;
            }
            aVar.f8771d = i7;
            return;
        }
        if (i8 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Ht0.a aVar5 = this.f87093q;
        Ht0.a aVar6 = aVar5;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
            aVar6 = null;
        }
        Ht0.a aVar7 = this.f87093q;
        if (aVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
        } else {
            aVar2 = aVar7;
        }
        aVar6.f8771d = aVar2.f8770c;
    }

    @Override // It0.a
    public final void g1() {
    }

    @Override // It0.a
    public final void ha(float f7, @ColorInt int i7) {
        int iA = com.bilibili.search2.utils.m.a(f7, i7);
        Ht0.a aVar = this.f87093q;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
            aVar2 = null;
        }
        aVar2.f8771d = iA;
        Ht0.a aVar3 = this.f87093q;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
            aVar3 = null;
        }
        Ff(aVar3.f8771d);
    }

    public final boolean isExpanded() {
        return !this.f87102z || this.f87065A == 0;
    }

    @Override // com.bilibili.search2.main.BaseMainSearchChildFragment
    @NotNull
    public final String jf() {
        return "search-result";
    }

    @Override // com.bilibili.search2.main.BaseMainSearchChildFragment
    @NotNull
    public final String kf() {
        return "search-result";
    }

    @Override // It0.a
    public final void l8(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        Ht0.a aVar = this.f87093q;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
            aVar2 = null;
        }
        int i7 = aVar2.f8770c;
        Ht0.a aVar3 = this.f87095s;
        Ht0.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarSelectColor");
            aVar4 = null;
        }
        int i8 = aVar4.f8769b;
        Ht0.a aVar5 = this.f87094r;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabTitleColor");
            aVar5 = null;
        }
        Gf(i7, i8, aVar5.f8769b);
    }

    @Override // com.bilibili.search2.main.BaseMainSearchChildFragment
    public final void lf(boolean z6) {
        MutableLiveData<Integer> mutableLiveData;
        if (z6) {
            com.bilibili.search2.eastereggs.a aVar = ((com.bilibili.search2.eastereggs.h) this.f87099w.getValue()).f86517a;
            if (aVar != null) {
                aVar.b();
                return;
            }
            return;
        }
        SearchPageStateModel searchPageStateModel = this.f87091o;
        if (searchPageStateModel == null || (mutableLiveData = searchPageStateModel.f86757d) == null) {
            return;
        }
        mutableLiveData.setValue(Integer.valueOf(SearchPageStateModel.ElevationValue.RESULT_ELEVATION.getValue()));
    }

    @Override // It0.a
    public final void m2(@ColorInt int i7) {
        Ht0.a aVar = this.f87093q;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
            aVar2 = null;
        }
        int i8 = aVar2.f8770c;
        Ht0.a aVar3 = this.f87095s;
        Ht0.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarSelectColor");
            aVar4 = null;
        }
        int i9 = aVar4.f8769b;
        Ht0.a aVar5 = this.f87094r;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabTitleColor");
            aVar5 = null;
        }
        Gf(i8, i9, aVar5.f8769b);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void nf(com.bilibili.search2.main.data.e r4) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.BiliMainSearchResultFragment.nf(com.bilibili.search2.main.data.e):void");
    }

    public final void of(boolean z6) {
        MutableLiveData<Boolean> mutableLiveData;
        SearchColorModel searchColorModelB;
        MutableLiveData<Boolean> mutableLiveData2;
        this.f87074J = 0;
        this.f87102z = z6;
        OgvThemeColorHelper ogvThemeColorHelperVf = vf();
        if (ogvThemeColorHelperVf != null && (searchColorModelB = ogvThemeColorHelperVf.b()) != null && (mutableLiveData2 = searchColorModelB.f88294d) != null) {
            mutableLiveData2.setValue(Boolean.valueOf(z6));
        }
        tf();
        SearchPageStateModel searchPageStateModel = this.f87091o;
        qf(!((searchPageStateModel == null || (mutableLiveData = searchPageStateModel.f86771s) == null) ? false : Intrinsics.areEqual(mutableLiveData.getValue(), Boolean.TRUE)), false);
    }

    @Override // com.bilibili.search2.result.Hilt_BiliMainSearchResultFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onAttach(@NotNull Context context) {
        super.onAttach(context);
        SearchResultCompatibleComponent searchResultCompatibleComponent = this.f87072H;
        if (searchResultCompatibleComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchResultComponent");
            searchResultCompatibleComponent = null;
        }
        searchResultCompatibleComponent.f86391a = this;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) throws NoWhenBranchMatchedException {
        super.onCreate(bundle);
        SearchPageStateModel searchPageStateModelD = z.d(this);
        this.f87091o = searchPageStateModelD;
        if (searchPageStateModelD != null) {
            MutableLiveData<com.bilibili.search2.main.data.e> mutableLiveData = searchPageStateModelD.f86772t;
            com.bilibili.search2.main.data.e value = mutableLiveData.getValue();
            if (value != null) {
                this.f87077M = value;
                xf().n1(value.f86807a);
                nf(value);
            }
            mutableLiveData.observe(this, new i(new E80.k(this, 3)));
        }
        SearchResultCompatibleComponent searchResultCompatibleComponent = this.f87072H;
        if (searchResultCompatibleComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchResultComponent");
            searchResultCompatibleComponent = null;
        }
        searchResultCompatibleComponent.a();
        getLifecycle().addObserver((t) t.f88516c.getValue());
        getLifecycle().addObserver((com.bilibili.search2.result.holder.aichat.b) com.bilibili.search2.result.holder.aichat.b.f87770c.getValue());
        BLog.d("BiliMainSearchResultFragment", "searchOnCreate: " + this + " ,viewModel: " + xf());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131494106, viewGroup, false);
        this.f87068D = Bl.e.bind(viewInflate);
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        FrameLayout frameLayout = this.f87097u;
        if (frameLayout != null) {
            frameLayout.removeOnLayoutChangeListener(this.f87082R);
            FrameLayout frameLayout2 = this.f87097u;
            FrameLayout frameLayout3 = frameLayout2;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mParentLayout");
                frameLayout3 = null;
            }
            frameLayout3.getViewTreeObserver().removeOnGlobalLayoutListener(this.f87079O);
        }
        if (this.f87076L != null) {
            uf().getViewTreeObserver().removeOnGlobalLayoutListener(this.f87081Q);
        }
        super.onDestroyView();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        SearchResultCompatibleComponent searchResultCompatibleComponent = this.f87072H;
        if (searchResultCompatibleComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchResultComponent");
            searchResultCompatibleComponent = null;
        }
        searchResultCompatibleComponent.f86391a = null;
    }

    @Override // com.bilibili.search2.main.BaseMainSearchChildFragment, com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z6) {
        MutableLiveData<Boolean> mutableLiveData;
        OgvThemeColorHelper ogvThemeColorHelperVf;
        super.onHiddenChanged(z6);
        if (z6 && (ogvThemeColorHelperVf = vf()) != null) {
            ogvThemeColorHelperVf.a();
        }
        SearchPageStateModel searchPageStateModel = this.f87091o;
        if (searchPageStateModel == null || (mutableLiveData = searchPageStateModel.f86767o) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.valueOf(z6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.viewpager.widget.ViewPager] */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (xf().f87254r > 0) {
            PageViewTracker pageViewTracker = PageViewTracker.getInstance();
            Kt0.a aVar = this.f87092p;
            Fragment fragment = null;
            if (aVar != null) {
                SearchViewPager searchViewPager = this.f87086j;
                if (searchViewPager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPager");
                    searchViewPager = null;
                }
                fragment = aVar.f13005b.get(Integer.valueOf(searchViewPager.getCurrentItem()));
            }
            pageViewTracker.setFragmentVisibility(fragment, false);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        BLog.d("BiliMainSearchResultFragment", "onResume " + isVisible());
        if (isVisible()) {
            FrameLayout frameLayout = this.f87097u;
            FrameLayout frameLayout2 = frameLayout;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mParentLayout");
                frameLayout2 = null;
            }
            frameLayout2.getViewTreeObserver().addOnGlobalLayoutListener(this.f87079O);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        BLog.i("BiliMainSearchResultFragment", "onSaveInstanceState " + xf().f87251o);
        Integer num = xf().f87251o;
        if (num != null) {
            bundle.putInt("TAG_LOCATE_TO_INDEX", num.intValue());
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        com.bilibili.search2.eastereggs.a aVar = ((com.bilibili.search2.eastereggs.h) this.f87099w.getValue()).f86517a;
        if (aVar != null) {
            aVar.b();
        }
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v69, types: [androidx.viewpager.widget.ViewPager] */
    /* JADX WARN: Type inference failed for: r0v92, types: [com.bilibili.pvtracker.PageViewTracker] */
    /* JADX WARN: Type inference failed for: r1v32, types: [androidx.viewpager.widget.ViewPager] */
    /* JADX WARN: Type inference failed for: r1v40, types: [androidx.viewpager.widget.ViewPager] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        MutableLiveData<com.bilibili.search2.main.data.e> mutableLiveData;
        super.onViewCreated(view, bundle);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(2131310942);
        this.f87097u = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mParentLayout");
            frameLayout2 = null;
        }
        frameLayout2.addOnLayoutChangeListener(this.f87082R);
        this.h = view.findViewById(2131303590);
        this.f87076L = view.findViewById(2131303626);
        uf().getViewTreeObserver().addOnGlobalLayoutListener(this.f87081Q);
        TextView textView = (TextView) view.findViewById(2131310274);
        this.f87085i = textView;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRetry");
            textView2 = null;
        }
        textView2.setOnClickListener(new com.bilibili.search2.result.c(this, 0));
        this.f87086j = (SearchViewPager) view.findViewById(2131305458);
        this.f87087k = view.findViewById(2131308627);
        this.f87070F = -1;
        Bl.e eVar = this.f87068D;
        Bl.e eVar2 = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar2 = null;
        }
        this.f87069E = new w(eVar2.e, xf());
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip = (AlignLeftAndRightPagerSlidingTabStrip) view.findViewById(2131308542);
        this.f87090n = alignLeftAndRightPagerSlidingTabStrip;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip2 = alignLeftAndRightPagerSlidingTabStrip;
        if (alignLeftAndRightPagerSlidingTabStrip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip2 = null;
        }
        alignLeftAndRightPagerSlidingTabStrip2.setOnPageChangeListener(new f(this));
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip3 = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip4 = alignLeftAndRightPagerSlidingTabStrip3;
        if (alignLeftAndRightPagerSlidingTabStrip3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip4 = null;
        }
        alignLeftAndRightPagerSlidingTabStrip4.setOnTabClickListener(new com.bilibili.search2.result.d(this));
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip5 = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip6 = alignLeftAndRightPagerSlidingTabStrip5;
        if (alignLeftAndRightPagerSlidingTabStrip5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip6 = null;
        }
        alignLeftAndRightPagerSlidingTabStrip6.setOnPageReselectedListener(new com.bilibili.search2.result.e(this));
        if (this.f87092p == null) {
            this.f87092p = new Kt0.a(requireContext(), getChildFragmentManager());
        }
        AppBarLayout appBarLayoutFindViewById = view.findViewById(2131313584);
        this.f87088l = appBarLayoutFindViewById;
        LinearLayout linearLayout = appBarLayoutFindViewById;
        if (appBarLayoutFindViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
            linearLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        CoordinatorLayout.Behavior behavior = layoutParams2 != null ? layoutParams2.getBehavior() : null;
        this.f87089m = behavior instanceof SearchExtraAppBarBehavior ? (SearchExtraAppBarBehavior) behavior : null;
        SearchViewPager searchViewPager = this.f87086j;
        SearchViewPager searchViewPager2 = searchViewPager;
        if (searchViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
            searchViewPager2 = null;
        }
        searchViewPager2.setAdapter(this.f87092p);
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip7 = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip8 = alignLeftAndRightPagerSlidingTabStrip7;
        if (alignLeftAndRightPagerSlidingTabStrip7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip8 = null;
        }
        SearchViewPager searchViewPager3 = this.f87086j;
        SearchViewPager searchViewPager4 = searchViewPager3;
        if (searchViewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
            searchViewPager4 = null;
        }
        alignLeftAndRightPagerSlidingTabStrip8.setViewPager(searchViewPager4);
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip9 = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip10 = alignLeftAndRightPagerSlidingTabStrip9;
        if (alignLeftAndRightPagerSlidingTabStrip9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip10 = null;
        }
        alignLeftAndRightPagerSlidingTabStrip10.setTabLayoutPaddingLeftAndRight(ListExtentionsKt.toPx(com.bilibili.search2.component.e.c(getContext())));
        int themeAttrColor = ThemeUtils.getThemeAttrColor(getContext(), 2130968986);
        Ff(themeAttrColor);
        Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("TAG_LOCATE_TO_INDEX")) : null;
        androidx.compose.animation.z.c(numValueOf, "prepareCacheHolder ", "BiliMainSearchResultFragment");
        if (numValueOf != null && numValueOf.intValue() > 0) {
            xf().f87251o = numValueOf;
        }
        ?? pageViewTracker = PageViewTracker.getInstance();
        SearchViewPager searchViewPager5 = this.f87086j;
        SearchViewPager searchViewPager6 = searchViewPager5;
        if (searchViewPager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
            searchViewPager6 = null;
        }
        pageViewTracker.observePageChange(searchViewPager6);
        Ht0.a aVar = new Ht0.a();
        this.f87093q = aVar;
        aVar.f8768a = themeAttrColor;
        Ht0.a aVar2 = new Ht0.a();
        this.f87094r = aVar2;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip11 = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip12 = alignLeftAndRightPagerSlidingTabStrip11;
        if (alignLeftAndRightPagerSlidingTabStrip11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip12 = null;
        }
        aVar2.f8768a = alignLeftAndRightPagerSlidingTabStrip12.getTabTextAppearance();
        Ht0.a aVar3 = this.f87094r;
        Ht0.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabTitleColor");
            aVar4 = null;
        }
        aVar4.f8769b = 2131887186;
        Ht0.a aVar5 = new Ht0.a();
        this.f87095s = aVar5;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip13 = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip14 = alignLeftAndRightPagerSlidingTabStrip13;
        if (alignLeftAndRightPagerSlidingTabStrip13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip14 = null;
        }
        aVar5.f8768a = alignLeftAndRightPagerSlidingTabStrip14.getIndicatorColor();
        Ht0.a aVar6 = this.f87095s;
        Ht0.a aVar7 = aVar6;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarSelectColor");
            aVar7 = null;
        }
        aVar7.f8769b = getResources().getColor(R$color.Wh0_u);
        new It0.z(this, vf());
        of(this.f87102z);
        View view2 = this.f87088l;
        View view3 = view2;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
            view3 = null;
        }
        if (!view3.isLaidOut() || view3.isLayoutRequested()) {
            view3.addOnLayoutChangeListener(new e(this));
        } else {
            this.f87071G = view3.getHeight();
        }
        SearchPageStateModel searchPageStateModel = this.f87091o;
        if (searchPageStateModel != null && (mutableLiveData = searchPageStateModel.f86772t) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new i(new E80.j(this, 5)));
        }
        AppBarLayout appBarLayout = this.f87088l;
        if (appBarLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
            appBarLayout = null;
        }
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener(this) { // from class: com.bilibili.search2.result.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliMainSearchResultFragment f87750a;

            {
                this.f87750a = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v27, types: [androidx.viewpager.widget.ViewPager] */
            public final void onOffsetChanged(AppBarLayout appBarLayout2, int i7) {
                OgvThemeColorHelper ogvThemeColorHelperVf;
                SearchColorModel searchColorModelB;
                OgvThemeColorHelper ogvThemeColorHelperVf2;
                SearchColorModel searchColorModelB2;
                MutableLiveData<SearchColorModel.a> mutableLiveData2;
                SearchColorModel searchColorModelB3;
                MutableLiveData<Boolean> mutableLiveData3;
                BiliMainSearchResultFragment biliMainSearchResultFragment = this.f87750a;
                if (biliMainSearchResultFragment.f87065A != i7) {
                    biliMainSearchResultFragment.f87065A = i7;
                    Iterator it = ((ArrayList) biliMainSearchResultFragment.f87084T).iterator();
                    while (it.hasNext()) {
                        ((Function2) it.next()).invoke(appBarLayout2, Integer.valueOf(i7));
                    }
                    if (!biliMainSearchResultFragment.f87102z) {
                        OgvThemeColorHelper ogvThemeColorHelperVf3 = biliMainSearchResultFragment.vf();
                        if (ogvThemeColorHelperVf3 != null) {
                            ogvThemeColorHelperVf3.b();
                            return;
                        }
                        return;
                    }
                    int iAbs = Math.abs(i7) - Math.abs(biliMainSearchResultFragment.f87074J);
                    biliMainSearchResultFragment.f87074J = Math.abs(i7);
                    SearchViewPager searchViewPager7 = biliMainSearchResultFragment.f87086j;
                    SearchViewPager searchViewPager8 = searchViewPager7;
                    if (searchViewPager7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPager");
                        searchViewPager8 = null;
                    }
                    if (searchViewPager8.getCurrentItem() == 0 && (ogvThemeColorHelperVf = biliMainSearchResultFragment.vf()) != null && (searchColorModelB = ogvThemeColorHelperVf.b()) != null) {
                        float f7 = searchColorModelB.f88296f;
                        int i8 = searchColorModelB.f88295e + iAbs;
                        searchColorModelB.f88295e = i8;
                        float f8 = i8;
                        float f9 = f8 >= f7 ? 1.0f : i8 == 0 ? 0.0f : f8 / f7;
                        OgvThemeColorHelper ogvThemeColorHelperVf4 = biliMainSearchResultFragment.vf();
                        if (((ogvThemeColorHelperVf4 == null || (searchColorModelB3 = ogvThemeColorHelperVf4.b()) == null || (mutableLiveData3 = searchColorModelB3.f88303n) == null) ? false : Intrinsics.areEqual(mutableLiveData3.getValue(), Boolean.TRUE)) && (ogvThemeColorHelperVf2 = biliMainSearchResultFragment.vf()) != null && (searchColorModelB2 = ogvThemeColorHelperVf2.b()) != null && (mutableLiveData2 = searchColorModelB2.f88293c) != null) {
                            mutableLiveData2.setValue(new SearchColorModel.a(f9, iAbs));
                        }
                    }
                    LinearLayout linearLayout2 = biliMainSearchResultFragment.f87088l;
                    if (linearLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
                        linearLayout2 = null;
                    }
                    int height = linearLayout2.getHeight();
                    StringBuilder sbB = A.b(iAbs, i7, "parent tintBar ", " ", " ");
                    sbB.append(height);
                    BLog.d("SEARCH_SCROLL", sbB.toString());
                    OgvThemeColorHelper ogvThemeColorHelperVf5 = biliMainSearchResultFragment.vf();
                    if (ogvThemeColorHelperVf5 == null || ogvThemeColorHelperVf5.b() == null) {
                        return;
                    }
                    Math.abs(i7);
                }
            }
        });
        com.bilibili.search2.utils.extension.b.c(xf().f87499f, this, new MutablePropertyReference1Impl() { // from class: com.bilibili.search2.result.BiliMainSearchResultFragment$viewModelsObserve$1
            public Object get(Object obj) {
                return ((SearchState) obj).getNav();
            }

            public void set(Object obj, Object obj2) {
                ((SearchState) obj).setNav((List) obj2);
            }
        }, new HH.p(this, 2));
        com.bilibili.search2.utils.extension.b.c(xf().f87499f, this, new PropertyReference1Impl() { // from class: com.bilibili.search2.result.BiliMainSearchResultFragment$viewModelsObserve$3
            public Object get(Object obj) {
                return Boolean.valueOf(((SearchState) obj).getFirstLoading());
            }
        }, new HH.j(this, 3));
        com.bilibili.search2.utils.extension.b.c(xf().f87499f, this, new PropertyReference1Impl() { // from class: com.bilibili.search2.result.BiliMainSearchResultFragment$viewModelsObserve$5
            public Object get(Object obj) {
                return ((SearchState) obj).getFatherErrorState();
            }
        }, new C1421i(this, 2));
        com.bilibili.search2.utils.extension.b.a(xf().f87497d, this, new C1422j(this, 3));
        FlowKt.launchIn(FlowKt.onEach(this.f87067C, new BiliMainSearchResultFragment$viewModelsObserve$8(xf())), LifecycleOwnerKt.getLifecycleScope(this));
        SearchPageStateModel searchPageStateModel2 = this.f87091o;
        if (searchPageStateModel2 == null) {
            return;
        }
        searchPageStateModel2.f86771s.observe(getViewLifecycleOwner(), new i(new HH.l(1, this)));
    }

    public final void pf() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        int color = ContextCompat.getColor(context, R$color.main_Wh0);
        int colorById = ThemeUtils.getColorById(context, 2131103284);
        Ff(color);
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip2 = alignLeftAndRightPagerSlidingTabStrip;
        if (alignLeftAndRightPagerSlidingTabStrip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip2 = null;
        }
        alignLeftAndRightPagerSlidingTabStrip2.setTabTextAppearance(2131887656);
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip3 = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip4 = alignLeftAndRightPagerSlidingTabStrip3;
        if (alignLeftAndRightPagerSlidingTabStrip3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip4 = null;
        }
        alignLeftAndRightPagerSlidingTabStrip4.setIndicatorColor(colorById);
        Ht0.a aVar = this.f87093q;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
            aVar2 = null;
        }
        aVar2.f8768a = color;
        Ht0.a aVar3 = this.f87094r;
        Ht0.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabTitleColor");
            aVar4 = null;
        }
        aVar4.f8768a = 2131887656;
        Ht0.a aVar5 = this.f87095s;
        Ht0.a aVar6 = aVar5;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarSelectColor");
            aVar6 = null;
        }
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip5 = this.f87090n;
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip6 = alignLeftAndRightPagerSlidingTabStrip5;
        if (alignLeftAndRightPagerSlidingTabStrip5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip6 = null;
        }
        aVar6.f8768a = alignLeftAndRightPagerSlidingTabStrip6.getIndicatorColor();
        Ht0.a aVar7 = this.f87093q;
        Ht0.a aVar8 = aVar7;
        if (aVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
            aVar8 = null;
        }
        aVar8.f8771d = color;
        Ht0.a aVar9 = this.f87094r;
        Ht0.a aVar10 = aVar9;
        if (aVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabTitleColor");
            aVar10 = null;
        }
        aVar10.f8771d = 2131887656;
        Ht0.a aVar11 = this.f87095s;
        Ht0.a aVar12 = aVar11;
        if (aVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarSelectColor");
            aVar12 = null;
        }
        AlignLeftAndRightPagerSlidingTabStrip alignLeftAndRightPagerSlidingTabStrip7 = this.f87090n;
        if (alignLeftAndRightPagerSlidingTabStrip7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabs");
            alignLeftAndRightPagerSlidingTabStrip7 = null;
        }
        aVar12.f8771d = alignLeftAndRightPagerSlidingTabStrip7.getIndicatorColor();
    }

    public final void qf(boolean z6, boolean z7) {
        LinearLayout linearLayout = this.f87088l;
        LinearLayout linearLayout2 = linearLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
            linearLayout2 = null;
        }
        if (linearLayout2.isLaidOut()) {
            LinearLayout linearLayout3 = this.f87088l;
            LinearLayout linearLayout4 = linearLayout3;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
                linearLayout4 = null;
            }
            if (linearLayout4.getHeight() > 0) {
                BLog.d("BiliMainSearchResultFragment", O4.b.b("applyStripExpandState: expanded=", ", animate=", " (immediate)", z6, z7));
                AppBarLayout appBarLayout = this.f87088l;
                if (appBarLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
                    appBarLayout = null;
                }
                appBarLayout.setExpanded(z6, z7);
                return;
            }
        }
        BLog.d("BiliMainSearchResultFragment", O4.b.b("applyStripExpandState: expanded=", ", animate=", " (deferred to doOnLayout)", z6, z7));
        View view = this.f87088l;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
            view2 = null;
        }
        if (!view2.isLaidOut() || view2.isLayoutRequested()) {
            view2.addOnLayoutChangeListener(new b(this, z6, z7));
            return;
        }
        if (isAdded()) {
            LinearLayout linearLayout5 = this.f87088l;
            LinearLayout linearLayout6 = linearLayout5;
            if (linearLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
                linearLayout6 = null;
            }
            BLog.d("BiliMainSearchResultFragment", "applyStripExpandState doOnLayout: expanded=" + z6 + ", height=" + linearLayout6.getHeight());
            AppBarLayout appBarLayout2 = this.f87088l;
            if (appBarLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPagerTabContainer");
                appBarLayout2 = null;
            }
            appBarLayout2.setExpanded(z6, z7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.viewpager.widget.ViewPager] */
    public final void rf(@NotNull String str, @NotNull String str2, int i7, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z6, @Nullable Integer num, @Nullable String str6, @Nullable Integer num2, @Nullable String str7, @Nullable Long l7, @Nullable Long l8) {
        xf().f87235C = Intrinsics.areEqual(str2, "query_correct_keyword") ? 1 : 0;
        SearchViewPager searchViewPager = this.f87086j;
        SearchViewPager searchViewPager2 = searchViewPager;
        if (searchViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPager");
            searchViewPager2 = null;
        }
        if (searchViewPager2.getCurrentItem() != 0) {
            str2 = "app_count";
        }
        Df();
        sf(false);
        xf().f87254r = i7;
        this.f87083S = new com.bilibili.search2.result.base.t(str, str2, str3, str4, str5, true, xf().f87498e.incrementAndGet(), xf().f87235C, z6, num, str6, xf().f87252p, num2, str7, l7, l8, null);
        Ef(null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void sf(boolean z6) throws NoWhenBranchMatchedException {
        MutableLiveData<com.bilibili.search2.main.data.e> mutableLiveData;
        com.bilibili.search2.main.data.e value;
        xf().f87234B = null;
        xf().getClass();
        xf().f87249m = null;
        if (!z6) {
            xf().h = new ArrayList();
        }
        xf().f87252p = new Xs0.a(xf().h);
        SearchPageStateModel searchPageStateModel = this.f87091o;
        if (searchPageStateModel == null || (mutableLiveData = searchPageStateModel.f86772t) == null || (value = mutableLiveData.getValue()) == null) {
            return;
        }
        xf().n1(value.f86807a);
    }

    public final void tf() {
        MutableLiveData<Boolean> mutableLiveData;
        Bl.e eVar = this.f87068D;
        Bl.e eVar2 = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar2 = null;
        }
        ViewGroup.LayoutParams layoutParams = eVar2.b.getLayoutParams();
        if (layoutParams instanceof AppBarLayout.LayoutParams) {
            SearchPageStateModel searchPageStateModel = this.f87091o;
            int i7 = 0;
            boolean zAreEqual = (searchPageStateModel == null || (mutableLiveData = searchPageStateModel.f86771s) == null) ? false : Intrinsics.areEqual(mutableLiveData.getValue(), Boolean.TRUE);
            if (zAreEqual) {
                i7 = 1;
            } else if (this.f87102z) {
                i7 = 5;
            }
            com.bilibili.ad.adview.videodetail.pausedpage.brand.base.b.b(i7, "BiliMainSearchResultFragment", Q.a("configureStripScrollFlags: isHeaderHidden=", ", canStripScroll=", ", flags=", zAreEqual, this.f87102z));
            ((AppBarLayout.LayoutParams) layoutParams).setScrollFlags(i7);
            Bl.e eVar3 = this.f87068D;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eVar3 = null;
            }
            eVar3.b.setLayoutParams(layoutParams);
        }
    }

    @NotNull
    public final View uf() {
        View view = this.f87076L;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
        return null;
    }

    public final OgvThemeColorHelper vf() {
        Et0.c cVarC = z.c(this);
        return cVarC != null ? cVarC.K2() : null;
    }

    @Nullable
    public final SearchResultAllFragment wf() {
        Kt0.a aVar = this.f87092p;
        SearchResultAllFragment searchResultAllFragment = null;
        Fragment fragment = aVar != null ? aVar.f13005b.get(0) : null;
        if (fragment instanceof SearchResultAllFragment) {
            searchResultAllFragment = (SearchResultAllFragment) fragment;
        }
        return searchResultAllFragment;
    }

    @Override // It0.a
    public final void x1() {
        if (this.f87096t != null) {
            Bl.e eVar = this.f87068D;
            Bl.e eVar2 = eVar;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eVar2 = null;
            }
            eVar2.b.removeView(this.f87096t);
        }
        Ht0.a aVar = this.f87093q;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
            aVar = null;
        }
        Ff(aVar.f8771d);
    }

    @Override // It0.a
    public final void xa(@ColorInt int i7, boolean z6) {
        if (this.f87096t == null) {
            this.f87096t = new View(getContext());
        } else {
            Bl.e eVar = this.f87068D;
            Bl.e eVar2 = eVar;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eVar2 = null;
            }
            eVar2.b.removeView(this.f87096t);
        }
        if (this.f87098v == -1) {
            TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(new int[]{2130969563});
            this.f87098v = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f87098v);
        View view = this.f87096t;
        if (view != null) {
            view.setBackgroundColor(i7);
        }
        if (z6) {
            Bl.e eVar3 = this.f87068D;
            Bl.e eVar4 = eVar3;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eVar4 = null;
            }
            eVar4.b.addView(this.f87096t, layoutParams);
        } else {
            Bl.e eVar5 = this.f87068D;
            Bl.e eVar6 = eVar5;
            if (eVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eVar6 = null;
            }
            eVar6.b.addView(this.f87096t, 0, layoutParams);
        }
        Ht0.a aVar = this.f87093q;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabBarColor");
            aVar = null;
        }
        Ff(aVar.f8771d);
    }

    public final SearchResultAllViewModel xf() {
        return (SearchResultAllViewModel) this.f87066B.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.viewpager.widget.ViewPager] */
    @Nullable
    public final BaseSearchResultFragment<?> yf() {
        Fragment fragment;
        Kt0.a aVar = this.f87092p;
        BaseSearchResultFragment<?> baseSearchResultFragment = null;
        if (aVar != null) {
            SearchViewPager searchViewPager = this.f87086j;
            SearchViewPager searchViewPager2 = searchViewPager;
            if (searchViewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPager");
                searchViewPager2 = null;
            }
            fragment = aVar.f13005b.get(Integer.valueOf(searchViewPager2.getCurrentItem()));
        } else {
            fragment = null;
        }
        if (fragment instanceof BaseSearchResultFragment) {
            baseSearchResultFragment = (BaseSearchResultFragment) fragment;
        }
        return baseSearchResultFragment;
    }
}
