package com.bilibili.search2.result.all;

import E80.g0;
import Yt0.C3152f;
import Yt0.C3153g;
import Yt0.C3163q;
import Yt0.C3164s;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.A1;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.y1;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.adcommon.utils.ext.ViewExtKt;
import com.bilibili.app.comm.list.common.inline.config.search.SearchInlineNetStatus;
import com.bilibili.app.comm.list.common.inlineshare.PageObscuredListener;
import com.bilibili.app.comm.list.common.search.BitmapProcessType;
import com.bilibili.app.comm.list.widget.search.SearchNestedCoordinatorLayout;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.bus.Violet;
import com.bilibili.droid.StringUtil;
import com.bilibili.iconfont.IconFont;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.fetcher.DescendingInlineFetcher;
import com.bilibili.inline.page.InlinePage;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintAppBarLayout;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.playerbizcommon.message.VideoStatusMessage;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.relation.FollowStateEvent;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.search2.api.SearchUpperItem;
import com.bilibili.search2.main.BiliMainSearchActivity;
import com.bilibili.search2.main.data.SearchContainerType;
import com.bilibili.search2.main.data.SearchPageStateModel;
import com.bilibili.search2.ogv.SearchDropDownMenuContent;
import com.bilibili.search2.result.BiliMainSearchResultFragment;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import com.bilibili.search2.result.base.BaseSearchResultFragment;
import com.bilibili.search2.result.base.BaseSearchResultViewModel;
import com.bilibili.search2.result.base.SearchState;
import com.bilibili.search2.result.base.q;
import com.bilibili.search2.result.ogv.OgvThemeColorHelper;
import com.bilibili.search2.result.ogv.SearchColorModel;
import com.bilibili.search2.result.ogv.weight.SearchOgvBgConstraintLayout;
import com.bilibili.search2.result.pages.BiliMainSearchResultPage;
import com.bilibili.search2.widget.SearchExtraTabView;
import com.bilibili.search2.widget.SearchViewPager;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.android.material.appbar.AppBarLayout;
import com.mall.common.extension.MallKtExtensionKt;
import com.mall.ui.widget.comment.MallCommentWindow;
import dt0.C6846i;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rG0.e;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment.class */
@StabilityInferred(parameters = 0)
public final class SearchResultAllFragment extends BaseSearchResultFragment<SearchResultAllViewModel> implements It0.a, Et0.c, InlinePage, PageObscuredListener {

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f87170c1 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f87171A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public AnonymousClass6 f87172B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public C6846i f87173C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public com.bilibili.search2.result.j f87174D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public TintAppBarLayout f87175E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public SearchExtraAppBarBehavior f87176F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public View f87177G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public TintImageView f87178H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final Ht0.d f87179I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f87180J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public SearchExtraTabView f87181K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f87182L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f87183M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f87184N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f87185O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f87186P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @Nullable
    public u f87187Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public SearchNestedCoordinatorLayout f87188R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f87189S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @NotNull
    public final d f87190T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @NotNull
    public final eg.a f87191U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @Nullable
    public SwipeRefreshLayout f87192V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @Nullable
    public IInlineControl f87193W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    @NotNull
    public final Dt0.a f87194X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    @NotNull
    public final e f87195X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    @NotNull
    public final Dt0.h f87196Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    @Nullable
    public h f87197Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    @Nullable
    public com.bilibili.search2.result.base.v f87198Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public Bl.j f87199Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f87200a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f87201a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f87202b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f87203c0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f87204p0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f87205r0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public Ts0.a f87206u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public C3153g f87207v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @NotNull
    public final com.bilibili.search2.result.widget.d f87208v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public String f87209w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public SearchResultAll f87210x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final HashMap<Integer, SearchResultAll.NavInfo> f87211y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public p f87212z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f87213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f87214b;

        static {
            int[] iArr = new int[SearchInlineNetStatus.values().length];
            try {
                iArr[SearchInlineNetStatus.WIFI_4G.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SearchInlineNetStatus.WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[SearchInlineNetStatus.CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f87213a = iArr;
            int[] iArr2 = new int[SearchColorModel.StateSource.values().length];
            try {
                iArr2[SearchColorModel.StateSource.SLIDE.ordinal()] = 1;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[SearchColorModel.StateSource.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr2[SearchColorModel.StateSource.DRAW.ordinal()] = 3;
            } catch (NoSuchFieldError e12) {
            }
            f87214b = iArr2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$b.class */
    public static final class b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchResultAllFragment f87215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f87216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TintAppBarLayout f87217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f87218d;

        public b(SearchResultAllFragment searchResultAllFragment, boolean z6, TintAppBarLayout tintAppBarLayout, boolean z7) {
            this.f87215a = searchResultAllFragment;
            this.f87216b = z6;
            this.f87217c = tintAppBarLayout;
            this.f87218d = z7;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [android.widget.LinearLayout, com.bilibili.magicasakura.widgets.TintAppBarLayout] */
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            view.removeOnLayoutChangeListener(this);
            if (this.f87215a.isAdded()) {
                if (!this.f87216b) {
                    this.f87217c.setExpanded(this.f87218d, false);
                } else {
                    ?? r02 = this.f87217c;
                    r02.post(new c(r02, this.f87218d));
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$c.class */
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TintAppBarLayout f87219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f87220b;

        public c(TintAppBarLayout tintAppBarLayout, boolean z6) {
            this.f87219a = tintAppBarLayout;
            this.f87220b = z6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f87219a.setExpanded(this.f87220b, true);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$d.class */
    public static final class d extends com.bilibili.search2.utils.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchResultAllFragment f87221a;

        public d(SearchResultAllFragment searchResultAllFragment) {
            this.f87221a = searchResultAllFragment;
        }

        public final void b(Map<Long, gg.b> map) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$e.class */
    public static final class e implements ConnectivityMonitor.OnNetworkChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchResultAllFragment f87222a;

        public e(SearchResultAllFragment searchResultAllFragment) {
            this.f87222a = searchResultAllFragment;
        }

        public final void onChanged(int i7) {
            IInlineControl iInlineControl;
            SearchResultAllFragment searchResultAllFragment = this.f87222a;
            if (i7 != 3) {
                int i8 = SearchResultAllFragment.f87170c1;
                searchResultAllFragment.ag(false);
            }
            if (i7 == 2) {
                Rh.a aVar = Rh.a.a;
                if (Rh.a.e(Rh.a.b()) == SearchInlineNetStatus.WIFI_4G || (iInlineControl = searchResultAllFragment.f87193W) == null) {
                    return;
                }
                iInlineControl.stopPlay();
            }
        }

        public final void onChanged(int i7, int i8, NetworkInfo networkInfo) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$f.class */
    public static final class f extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchResultAllFragment f87223a;

        public f(SearchResultAllFragment searchResultAllFragment) {
            this.f87223a = searchResultAllFragment;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public final int getSpanSize(int i7) {
            List<BaseSearchItem> allResultList = ((SearchState) this.f87223a.rf().f87499f.getValue()).getAllResultList();
            return (allResultList != null ? (BaseSearchItem) CollectionsKt.getOrNull(allResultList, i7) : null) instanceof com.bilibili.search2.api.d ? 1 : 2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$g.class */
    public static final class g extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchResultAllFragment f87224a;

        public g(SearchResultAllFragment searchResultAllFragment) {
            this.f87224a = searchResultAllFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            super.onScrollStateChanged(recyclerView, i7);
            if (i7 == 0) {
                BLog.d("SearchResultAllFragment", "RecyclerView.SCROLL_STATE_IDLE");
                if (recyclerView.canScrollVertically(-1)) {
                    return;
                }
                BLog.d("SearchResultAllFragment", "!canScrollVertically");
                SearchResultAllFragment searchResultAllFragment = this.f87224a;
                if (searchResultAllFragment.f87201a1) {
                    searchResultAllFragment.f87201a1 = false;
                    OgvThemeColorHelper ogvThemeColorHelperK2 = searchResultAllFragment.K2();
                    if (ogvThemeColorHelperK2 != null) {
                        ogvThemeColorHelperK2.b().f88295e = 0;
                        searchResultAllFragment.bg(0);
                        ogvThemeColorHelperK2.b().f88305p.setValue(Boolean.TRUE);
                        BLog.d("SearchResultAllFragment", "ResetScrollDistance");
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            super.onScrolled(recyclerView, i7, i8);
            int i9 = SearchResultAllFragment.f87170c1;
            SearchResultAllFragment searchResultAllFragment = this.f87224a;
            Context context = searchResultAllFragment.getContext();
            if (context != null && com.bilibili.search2.component.e.g(context) && com.bilibili.search2.component.e.h(context)) {
                SearchOgvBgConstraintLayout searchOgvBgConstraintLayout = searchResultAllFragment.Sf().b;
                if (searchOgvBgConstraintLayout.f88488l != null) {
                    int i10 = ((int) OgvThemeColorHelper.f88261s) + OgvThemeColorHelper.f88263u + searchOgvBgConstraintLayout.f88492p;
                    int i11 = searchOgvBgConstraintLayout.f88493q + i8;
                    if (i11 > i10) {
                        searchOgvBgConstraintLayout.f88494r = (i11 - i10) + searchOgvBgConstraintLayout.f88494r;
                        searchOgvBgConstraintLayout.f88493q = i10;
                    } else if (i11 < 0) {
                        searchOgvBgConstraintLayout.f88494r = 0;
                        searchOgvBgConstraintLayout.f88493q = 0;
                    } else {
                        int i12 = searchOgvBgConstraintLayout.f88494r;
                        if (i12 <= 0 || i8 >= 0) {
                            searchOgvBgConstraintLayout.f88493q = i11;
                        } else {
                            int i13 = i12 + i8;
                            searchOgvBgConstraintLayout.f88494r = i13;
                            if (i13 < 0) {
                                searchOgvBgConstraintLayout.f88493q = i10 + i13;
                                searchOgvBgConstraintLayout.f88494r = 0;
                            }
                        }
                    }
                    searchOgvBgConstraintLayout.j0();
                    searchOgvBgConstraintLayout.invalidate();
                }
            }
            searchResultAllFragment.bg(i8);
            BLog.d("SEARCH_SCROLL", "list " + i8);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$h.class */
    public static final class h extends C3163q {

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public final SearchResultAllFragment f87225I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SearchResultAllFragment searchResultAllFragment, int i7, int i8, int i9, OgvThemeColorHelper ogvThemeColorHelper, boolean z6, boolean z7) {
            super(i7, i8, i9, 0, true, ogvThemeColorHelper, z6, z7, 160);
            this.f87225I = searchResultAllFragment;
        }

        @Override // Yt0.C3163q
        public final int a() {
            return ((SearchState) this.f87225I.rf().f87499f.getValue()).getAlienationCardCount();
        }

        @Override // Yt0.C3163q
        public final int f() {
            List<BaseSearchItem> foldedItems = ((SearchState) this.f87225I.rf().f87499f.getValue()).getFoldedItems();
            return foldedItems != null ? foldedItems.size() : 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Yt0.C3163q
        public final boolean needDrawDivider(RecyclerView.ViewHolder viewHolder) {
            return !(viewHolder instanceof Et0.a) || ((Et0.a) viewHolder).isNeedDrawDivider();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$i.class */
    public static final /* synthetic */ class i implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f87226a;

        public i(Function1 function1) {
            this.f87226a = function1;
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
            return this.f87226a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f87226a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.result.all.SearchResultAllFragment$onCreateView$15, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$onCreateView$15.class */
    public static final class AnonymousClass15 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SearchResultAllFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.search2.result.all.SearchResultAllFragment$onCreateView$15$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$onCreateView$15$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final SearchResultAllFragment this$0;

            /* JADX INFO: renamed from: com.bilibili.search2.result.all.SearchResultAllFragment$onCreateView$15$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$onCreateView$15$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchResultAllFragment f87227a;

                public a(SearchResultAllFragment searchResultAllFragment) {
                    this.f87227a = searchResultAllFragment;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    int i7 = SearchResultAllFragment.f87170c1;
                    C3153g c3153g = this.f87227a.f87207v;
                    if (c3153g != null) {
                        c3153g.e();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SearchResultAllFragment searchResultAllFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = searchResultAllFragment;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
                MutableSharedFlow<Unit> mutableSharedFlow;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SearchResultAllFragment searchResultAllFragment = this.this$0;
                    int i8 = SearchResultAllFragment.f87170c1;
                    SearchPageStateModel searchPageStateModel = searchResultAllFragment.f87488s;
                    if (searchPageStateModel == null || (mutableSharedFlow = searchPageStateModel.f86765m) == null) {
                        return Unit.INSTANCE;
                    }
                    a aVar = new a(searchResultAllFragment);
                    this.label = 1;
                    if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(SearchResultAllFragment searchResultAllFragment, Continuation<? super AnonymousClass15> continuation) {
            super(2, continuation);
            this.this$0 = searchResultAllFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass15(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) anonymousClass1, (Continuation<? super Unit>) this) == coroutine_suspended) {
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

    /* JADX WARN: Type inference failed for: r0v3, types: [Ht0.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [Dt0.a, com.bilibili.inline.fetcher.DescendingInlineFetcher] */
    public SearchResultAllFragment() {
        super(false);
        this.f87211y = new HashMap<>();
        this.f87171A = true;
        ?? obj = new Object();
        obj.f8789o = Color.parseColor("#00000000");
        obj.f8790p = new ColorDrawable(Color.parseColor("#00000000"));
        this.f87179I = obj;
        this.f87184N = true;
        this.f87185O = true;
        this.f87189S = -1;
        this.f87190T = new d(this);
        this.f87191U = new eg.a(31, (String) null);
        this.f87194X = new DescendingInlineFetcher(this, new com.bilibili.inline.fetcher.a(0, ((Number) Dt0.c.f3185a.getValue()).floatValue(), 27));
        this.f87196Y = new Dt0.h(this);
        this.f87208v0 = new com.bilibili.search2.result.widget.d(new g0(this, 2));
        this.f87195X0 = new e(this);
    }

    public static boolean Wf(SearchResultAllFragment searchResultAllFragment) {
        boolean z6;
        if (((SearchState) searchResultAllFragment.rf().f87499f.getValue()).getHasImmerseCard()) {
            if (searchResultAllFragment.f87183M == 0) {
                z6 = true;
            }
            return z6;
        }
        searchResultAllFragment.getClass();
        z6 = false;
        return z6;
    }

    @Override // It0.a
    public final void Aa() {
    }

    @Override // It0.a
    public final void Ce(int i7, @Nullable Bitmap bitmap) {
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void Df(@Nullable com.bilibili.search2.result.base.k kVar) {
        SwipeRefreshLayout swipeRefreshLayout;
        if (kVar == null || (swipeRefreshLayout = this.f87192V) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void Gf(@Nullable com.bilibili.search2.result.base.i iVar) {
        SwipeRefreshLayout swipeRefreshLayout;
        if (iVar == null || (swipeRefreshLayout = this.f87192V) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void Jf() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putString("page_num", String.valueOf(rf().N0()));
        Bundle arguments = getArguments();
        bundle2.putString("query", (arguments == null || (bundle = arguments.getBundle("default_extra_bundle")) == null) ? "" : bundle.getString("keyword"));
        String trackId = rf().getTrackId();
        if (trackId == null) {
            trackId = "";
        }
        bundle2.putString("trackid", trackId);
        PageViewTracker.getInstance().setExtra(this, "search.search-result.0.0.pv", bundle2);
    }

    @Override // Et0.c
    @Nullable
    public final OgvThemeColorHelper K2() {
        Et0.c cVarC = com.bilibili.search2.main.z.c(this);
        return cVarC != null ? cVarC.K2() : null;
    }

    @Override // It0.a
    public final void K5(int i7) {
        Yt0.F f7;
        View view;
        Zf(true, true);
        fg(i7);
        dg(this.f87179I.f8785k);
        Ht0.d dVar = this.f87179I;
        int i8 = dVar.f8781f;
        int i9 = dVar.f8779d;
        dVar.f8780e = i8;
        dVar.f8778c = i9;
        SearchExtraTabView searchExtraTabView = this.f87181K;
        if (searchExtraTabView != null && (view = searchExtraTabView.f88934e) != null) {
            searchExtraTabView.removeView(view);
        }
        C3153g c3153g = this.f87207v;
        if (c3153g != null && (f7 = c3153g.f29222j) != null) {
            ListExtentionsKt.gone(f7.f29113g.g);
            ListExtentionsKt.gone(f7.f29113g.b);
        }
        C3153g c3153g2 = this.f87207v;
        if (c3153g2 != null) {
            c3153g2.a(null, true);
        }
        C3153g c3153g3 = this.f87207v;
        if (c3153g3 != null) {
            c3153g3.d(Integer.valueOf(i7));
        }
        Drawable colorDrawable = new ColorDrawable(i7);
        this.f87179I.f8787m = colorDrawable;
        AppBarLayout appBarLayout = this.f87175E;
        if (appBarLayout != null) {
            appBarLayout.setBackground(colorDrawable);
        }
        eg(i7);
    }

    @Override // It0.a
    public final void Ke() {
        SearchDropDownMenuContent searchDropDownMenuContent;
        View bottomLine;
        SearchExtraTabView searchExtraTabView = this.f87181K;
        if (searchExtraTabView != null) {
            searchExtraTabView.setBackgroundColor(this.f87179I.f8776a);
        }
        Zf(true, false);
        SearchExtraTabView searchExtraTabView2 = this.f87181K;
        if (searchExtraTabView2 != null && (bottomLine = searchExtraTabView2.getBottomLine()) != null) {
            bottomLine.setBackgroundColor(this.f87179I.f8783i);
        }
        AppBarLayout appBarLayout = this.f87175E;
        if (appBarLayout != null) {
            appBarLayout.setBackground(this.f87179I.f8786l);
        }
        Ts0.a aVar = this.f87206u;
        if (aVar != null && (searchDropDownMenuContent = aVar.f24297a) != null) {
            searchDropDownMenuContent.setContentBgColor(this.f87179I.f8782g);
        }
        SearchOgvBgConstraintLayout searchOgvBgConstraintLayout = Sf().b;
        searchOgvBgConstraintLayout.f88487k = false;
        searchOgvBgConstraintLayout.f88493q = 0;
        searchOgvBgConstraintLayout.f88494r = 0;
        searchOgvBgConstraintLayout.invalidate();
        SearchOgvBgConstraintLayout searchOgvBgConstraintLayout2 = Sf().b;
        searchOgvBgConstraintLayout2.f88488l = null;
        searchOgvBgConstraintLayout2.f88493q = 0;
        searchOgvBgConstraintLayout2.f88494r = 0;
        searchOgvBgConstraintLayout2.f88492p = 0;
        searchOgvBgConstraintLayout2.k0();
        searchOgvBgConstraintLayout2.j0();
        SearchOgvBgConstraintLayout searchOgvBgConstraintLayout3 = Sf().b;
        if (searchOgvBgConstraintLayout3.f88495s) {
            searchOgvBgConstraintLayout3.f88495s = false;
            searchOgvBgConstraintLayout3.invalidate();
        }
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final BaseSearchResultViewModel Kf() {
        Fragment parentFragment = getParentFragment();
        SearchResultAllFragment searchResultAllFragment = parentFragment;
        if (parentFragment == null) {
            searchResultAllFragment = this;
        }
        return (SearchResultAllViewModel) new ViewModelProvider(searchResultAllFragment).get(SearchResultAllViewModel.class);
    }

    @Override // It0.a
    public final void Le(@NotNull com.bilibili.search2.main.ogv.a aVar) {
        SearchExtraTabView searchExtraTabView = this.f87181K;
        if (searchExtraTabView != null) {
            searchExtraTabView.setBrand155GradientOverlay(aVar);
        }
        Sf().b.setBrand155GradientOverlay(aVar);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void Lf(BaseSearchResultViewModel baseSearchResultViewModel) {
        MutableLiveData<Boolean> mutableLiveData;
        final SearchResultAllViewModel searchResultAllViewModel = (SearchResultAllViewModel) baseSearchResultViewModel;
        super.Lf(searchResultAllViewModel);
        BLog.d("SearchResultAllFragment", "viewModelsObserve");
        SearchResultAllFragment$viewModelsObserve$1 searchResultAllFragment$viewModelsObserve$1 = new MutablePropertyReference1Impl() { // from class: com.bilibili.search2.result.all.SearchResultAllFragment$viewModelsObserve$1
            public Object get(Object obj) {
                return ((SearchState) obj).getExtraWords();
            }

            public void set(Object obj, Object obj2) {
                ((SearchState) obj).setExtraWords((List) obj2);
            }
        };
        final int i7 = 0;
        Function1 function1 = new Function1(i7, this, searchResultAllViewModel) { // from class: com.bilibili.search2.result.all.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f87318a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f87319b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f87320c;

            {
                this.f87318a = i7;
                this.f87319b = this;
                this.f87320c = searchResultAllViewModel;
            }

            public final Object invoke(Object obj) {
                MutableLiveData<Boolean> mutableLiveData2;
                Object obj2 = this.f87320c;
                Object obj3 = this.f87319b;
                switch (this.f87318a) {
                    case 0:
                        List list = (List) obj;
                        int i8 = SearchResultAllFragment.f87170c1;
                        BLog.d("SearchResultAllFragment", "extraWords changed:" + list);
                        boolean zIsFilter = ((SearchState) ((SearchResultAllViewModel) obj2).f87499f.getValue()).isFilter();
                        SearchResultAllFragment searchResultAllFragment = (SearchResultAllFragment) obj3;
                        SearchResultAll data = ((SearchState) searchResultAllFragment.rf().f87499f.getValue()).getData();
                        SearchExtraTabView searchExtraTabView = searchResultAllFragment.f87181K;
                        if (searchExtraTabView != null && data != null) {
                            if (zIsFilter) {
                                searchExtraTabView.a(SearchResultAllFragment.Wf(searchResultAllFragment));
                            } else {
                                searchResultAllFragment.f87183M = 0;
                                if (list.isEmpty() || ((SearchState) searchResultAllFragment.rf().f87499f.getValue()).isTeenagersMode()) {
                                    searchResultAllFragment.f87182L = false;
                                    SearchExtraTabView searchExtraTabView2 = searchResultAllFragment.f87181K;
                                    if (searchExtraTabView2 != null) {
                                        searchExtraTabView2.setVisibility(8);
                                    }
                                } else {
                                    searchResultAllFragment.f87182L = true;
                                    SearchExtraTabView searchExtraTabView3 = searchResultAllFragment.f87181K;
                                    if (searchExtraTabView3 != null) {
                                        searchExtraTabView3.setVisibility(0);
                                    }
                                    SearchExtraTabView searchExtraTabView4 = searchResultAllFragment.f87181K;
                                    if (searchExtraTabView4 != null) {
                                        Context context = searchResultAllFragment.getContext();
                                        searchExtraTabView4.setHorizontalPadding((context != null && com.bilibili.search2.component.e.g(context)) ? 20 : null);
                                    }
                                    SearchExtraTabView searchExtraTabView5 = searchResultAllFragment.f87181K;
                                    if (searchExtraTabView5 != null) {
                                        boolean zWf = SearchResultAllFragment.Wf(searchResultAllFragment);
                                        C3164s c3164s = searchExtraTabView5.f88939k;
                                        c3164s.f29294d = data;
                                        int i9 = c3164s.f29295e;
                                        if (i9 != 0) {
                                            c3164s.f29295e = 0;
                                            if (c3164s.f29292b.size() > 0 && i9 >= 0 && i9 <= CollectionsKt.getLastIndex(c3164s.f29292b)) {
                                                c3164s.notifyItemChanged(i9);
                                            }
                                            int i10 = c3164s.f29295e;
                                            if (c3164s.f29292b.size() > 0 && i10 >= 0 && i10 <= CollectionsKt.getLastIndex(c3164s.f29292b)) {
                                                c3164s.notifyItemChanged(i10);
                                            }
                                        }
                                        List listFilterNotNull = CollectionsKt.filterNotNull(list);
                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterNotNull, 10));
                                        Iterator it = listFilterNotNull.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(new C3152f((String) it.next()));
                                        }
                                        c3164s.f29292b = arrayList;
                                        c3164s.f29293c = zWf;
                                        int i11 = !arrayList.isEmpty() ? 0 : -1;
                                        int i12 = c3164s.f29295e;
                                        if (i12 != i11) {
                                            c3164s.f29295e = i11;
                                            if (c3164s.f29292b.size() > 0 && i12 >= 0 && i12 <= CollectionsKt.getLastIndex(c3164s.f29292b)) {
                                                c3164s.notifyItemChanged(i12);
                                            }
                                            int i13 = c3164s.f29295e;
                                            if (c3164s.f29292b.size() > 0 && i13 >= 0 && i13 <= CollectionsKt.getLastIndex(c3164s.f29292b)) {
                                                c3164s.notifyItemChanged(i13);
                                            }
                                        }
                                        c3164s.notifyDataSetChanged();
                                        searchExtraTabView5.f88936g = Boolean.valueOf(zWf);
                                        if (zWf) {
                                            searchExtraTabView5.f88935f.setBackground(null);
                                        } else {
                                            searchExtraTabView5.setBackgroundColor(ContextCompat.getColor(searchExtraTabView5.getContext(), R$color.f64616Wh0));
                                        }
                                    }
                                    SearchPageStateModel searchPageStateModel = searchResultAllFragment.f87488s;
                                    if ((searchPageStateModel == null || (mutableLiveData2 = searchPageStateModel.f86771s) == null) ? false : Intrinsics.areEqual(mutableLiveData2.getValue(), Boolean.TRUE)) {
                                        searchResultAllFragment.Of();
                                        searchResultAllFragment.Mf(false, false);
                                    }
                                }
                            }
                            searchResultAllFragment.Zf(searchResultAllFragment.f87184N, false);
                        }
                        break;
                    default:
                        List list2 = (List) obj3;
                        ((LazyListScope) obj).items(list2.size(), null, new kntr.common.share.common.ui.v1.internal.l(list2), ComposableLambdaKt.composableLambdaInstance(802480018, true, new kntr.common.share.common.ui.v1.internal.m((ComposableLambda) obj2, list2)));
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        StateFlow<SearchState> stateFlow = searchResultAllViewModel.f87499f;
        com.bilibili.search2.utils.extension.b.c(stateFlow, this, searchResultAllFragment$viewModelsObserve$1, function1);
        com.bilibili.search2.utils.extension.b.c(stateFlow, this, new PropertyReference1Impl() { // from class: com.bilibili.search2.result.all.SearchResultAllFragment$viewModelsObserve$3
            public Object get(Object obj) {
                return Boolean.valueOf(((SearchState) obj).getHasImmerseCard());
            }
        }, new Function1(searchResultAllViewModel, this) { // from class: com.bilibili.search2.result.all.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchResultAllViewModel f87321a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SearchResultAllFragment f87322b;

            {
                this.f87321a = searchResultAllViewModel;
                this.f87322b = this;
            }

            public final Object invoke(Object obj) {
                boolean z6;
                AppBarLayout appBarLayout;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i8 = SearchResultAllFragment.f87170c1;
                SearchResultAllViewModel searchResultAllViewModel2 = this.f87321a;
                BLog.d("SearchResultAllFragment", "hasImmerseCard changed:" + zBooleanValue + " ; viewModel.page = " + searchResultAllViewModel2.N0());
                if (searchResultAllViewModel2.N0() <= 1) {
                    SearchResultAll searchResultAllH1 = searchResultAllViewModel2.h1();
                    SearchResultAllFragment searchResultAllFragment = this.f87322b;
                    if (zBooleanValue) {
                        if (searchResultAllFragment.f87183M == 0) {
                            z6 = true;
                        }
                        searchResultAllFragment.Xf(searchResultAllH1, z6);
                        if (searchResultAllViewModel2.N0() <= 1 && ((SearchState) searchResultAllViewModel2.f87499f.getValue()).isFilter() && (appBarLayout = searchResultAllFragment.f87175E) != null) {
                            appBarLayout.post(new HJ0.f(searchResultAllFragment, 2));
                        }
                    } else {
                        searchResultAllFragment.getClass();
                    }
                    z6 = false;
                    searchResultAllFragment.Xf(searchResultAllH1, z6);
                    if (searchResultAllViewModel2.N0() <= 1) {
                        appBarLayout.post(new HJ0.f(searchResultAllFragment, 2));
                    }
                }
                return Unit.INSTANCE;
            }
        });
        SearchPageStateModel searchPageStateModel = this.f87488s;
        boolean zAreEqual = (searchPageStateModel == null || (mutableLiveData = searchPageStateModel.f86771s) == null) ? false : Intrinsics.areEqual(mutableLiveData.getValue(), Boolean.TRUE);
        this.f87185O = zAreEqual;
        SearchExtraAppBarBehavior searchExtraAppBarBehavior = this.f87176F;
        if (searchExtraAppBarBehavior != null) {
            searchExtraAppBarBehavior.setExpandBlocked(zAreEqual);
        }
        SearchPageStateModel searchPageStateModel2 = this.f87488s;
        if (searchPageStateModel2 == null) {
            return;
        }
        MutableLiveData<Boolean> mutableLiveData2 = searchPageStateModel2.f86771s;
        if (Intrinsics.areEqual(mutableLiveData2.getValue(), Boolean.TRUE)) {
            mutableLiveData2.observe(getViewLifecycleOwner(), new i(new com.bilibili.bililive.biz.rank.online.l(this, 1)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, android.widget.LinearLayout, com.bilibili.magicasakura.widgets.TintAppBarLayout, com.google.android.material.appbar.AppBarLayout] */
    public final void Mf(boolean z6, boolean z7) {
        ?? r02 = this.f87175E;
        if (r02 == 0) {
            return;
        }
        if (r02.isLaidOut() && r02.getHeight() > 0) {
            r02.setExpanded(z6, z7);
            return;
        }
        if (!r02.isLaidOut() || r02.isLayoutRequested()) {
            r02.addOnLayoutChangeListener(new b(this, z7, r02, z6));
        } else if (isAdded()) {
            if (z7) {
                r02.post(new c(r02, z6));
            } else {
                r02.setExpanded(z6, false);
            }
        }
    }

    @Override // It0.a
    public final void Nc(@Nullable Bitmap bitmap) {
        Zf(false, false);
        fg(this.f87179I.f8777b);
        Ht0.d dVar = this.f87179I;
        int i7 = dVar.f8780e;
        int i8 = dVar.f8778c;
        dVar.f8780e = i7;
        dVar.f8778c = i8;
        dg(dVar.f8784j);
        Ht0.d dVar2 = this.f87179I;
        Drawable drawable = dVar2.f8787m;
        dVar2.f8787m = drawable;
        AppBarLayout appBarLayout = this.f87175E;
        if (appBarLayout != null) {
            appBarLayout.setBackground(drawable);
        }
        eg(this.f87179I.h);
        Context context = getContext();
        if (context == null || !com.bilibili.search2.component.e.h(context)) {
            return;
        }
        SearchOgvBgConstraintLayout searchOgvBgConstraintLayout = Sf().b;
        searchOgvBgConstraintLayout.f88488l = bitmap;
        searchOgvBgConstraintLayout.f88487k = true;
        searchOgvBgConstraintLayout.k0();
        searchOgvBgConstraintLayout.j0();
        searchOgvBgConstraintLayout.invalidate();
    }

    public final void Nf() {
        this.f87180J = 0;
        OgvThemeColorHelper ogvThemeColorHelperK2 = K2();
        if (ogvThemeColorHelperK2 != null) {
            ogvThemeColorHelperK2.b().getClass();
            ogvThemeColorHelperK2.b().f88295e = 0;
        }
        h hVar = this.f87197Y0;
        if (hVar != null) {
            hVar.f29274m = hVar.f29273l;
            hVar.f29275n = 0;
        }
    }

    public final void Of() {
        MutableLiveData<Boolean> mutableLiveData;
        SearchExtraTabView searchExtraTabView = this.f87181K;
        ViewGroup.LayoutParams layoutParams = searchExtraTabView != null ? searchExtraTabView.getLayoutParams() : null;
        if (!(layoutParams instanceof AppBarLayout.LayoutParams)) {
            BLog.e("SearchResultAllFragment", "configureExtraScrollFlags: lp error");
            return;
        }
        SearchPageStateModel searchPageStateModel = this.f87488s;
        int i7 = 0;
        if ((searchPageStateModel == null || (mutableLiveData = searchPageStateModel.f86771s) == null) ? false : Intrinsics.areEqual(mutableLiveData.getValue(), Boolean.TRUE)) {
            i7 = 1;
        } else if (this.f87185O) {
            i7 = 5;
        }
        ((AppBarLayout.LayoutParams) layoutParams).setScrollFlags(i7);
        SearchExtraTabView searchExtraTabView2 = this.f87181K;
        if (searchExtraTabView2 != null) {
            searchExtraTabView2.setLayoutParams(layoutParams);
        }
    }

    public final void Pf(boolean z6, boolean z7) {
        boolean z8;
        MutableLiveData<Boolean> mutableLiveData;
        int refreshTimes = 0;
        if (z6) {
            com.bilibili.search2.result.j jVar = this.f87174D;
            if (jVar != null && (mutableLiveData = jVar.f88254a) != null) {
                mutableLiveData.setValue(Boolean.TRUE);
            }
            z8 = true;
        } else {
            z8 = false;
        }
        String str = this.f87209w;
        int iN0 = z6 ? 0 : rf().N0();
        String str2 = rf().f87249m;
        String str3 = rf().f87256t;
        List<Integer> list = rf().f87259w;
        List<Integer> list2 = rf().f87261y;
        int iIncrementAndGet = rf().f87498e.incrementAndGet();
        int i7 = rf().f87235C;
        boolean z9 = rf().f87236D;
        if (!z6) {
            refreshTimes = ((SearchState) rf().f87499f.getValue()).getRefreshTimes();
        }
        String str4 = rf().f87262z;
        long jVf = Vf();
        long jUf = Uf();
        Xs0.a aVar = qf().f87252p;
        Integer num = rf().f87237E;
        String str5 = rf().f87238F;
        Long l7 = rf().f87239G;
        Long l8 = rf().f87240H;
        int iG1 = rf().g1();
        rf().getClass();
        com.bilibili.search2.result.base.v vVar = new com.bilibili.search2.result.base.v(str, iN0, z6, z7, str2, str3, list, list2, z8, iIncrementAndGet, i7, z9, false, refreshTimes, str4, jVf, jUf, aVar, num, str5, l7, l8, iG1, rf().f87241I, rf().f87242J, rf().f87250n, rf().L0(), 8192);
        this.f87198Z = vVar;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new SearchResultAllFragment$doSearch$1$1(this, vVar, null), 3, (Object) null);
    }

    public final boolean Qf() {
        return ((SearchState) rf().f87499f.getValue()).getEnableRefresh() && rf().f87244L != SearchContainerType.HALF_SCREEN;
    }

    public final void Rf(boolean z6) {
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new SearchResultAllFragment$filterStateChange$1(this, z6, null), 3, (Object) null);
    }

    @NotNull
    public final Bl.j Sf() {
        Bl.j jVar = this.f87199Z0;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final int Tf() {
        int px = ListExtentionsKt.toPx(40);
        View view = getView();
        int i7 = px;
        if (view != null) {
            View rootView = view.getRootView();
            i7 = px;
            if (rootView != null) {
                View viewFindViewById = rootView.findViewById(2131310921);
                int height = 0;
                int height2 = viewFindViewById != null ? viewFindViewById.getHeight() : 0;
                View viewFindViewById2 = rootView.findViewById(2131313584);
                int height3 = viewFindViewById2 != null ? viewFindViewById2.getHeight() : 0;
                View viewFindViewById3 = rootView.findViewById(2131310881);
                if (viewFindViewById3 != null) {
                    height = viewFindViewById3.getHeight();
                }
                i7 = px + height2 + height3 + height;
            }
        }
        return i7;
    }

    public final long Uf() {
        long timeInMillis;
        if (Intrinsics.areEqual(rf().f87262z, "custom") || rf().f87243K) {
            Calendar calendarJ1 = rf().j1();
            calendarJ1.set(11, 23);
            calendarJ1.set(12, 59);
            calendarJ1.set(13, 59);
            timeInMillis = calendarJ1.getTimeInMillis() / ((long) 1000);
        } else {
            timeInMillis = 0;
        }
        return timeInMillis;
    }

    public final long Vf() {
        long timeInMillis;
        if (Intrinsics.areEqual(rf().f87262z, "custom") || rf().f87243K) {
            Calendar calendarK1 = rf().k1();
            calendarK1.set(11, 0);
            calendarK1.set(12, 0);
            calendarK1.set(13, 0);
            timeInMillis = calendarK1.getTimeInMillis() / ((long) 1000);
        } else {
            timeInMillis = 0;
        }
        return timeInMillis;
    }

    @Override // It0.a
    public final void W6(@Nullable Bitmap bitmap) {
    }

    public final void Xf(SearchResultAll searchResultAll, boolean z6) {
        OgvThemeColorHelper ogvThemeColorHelperK2;
        int i7;
        int i8;
        int color;
        List<BaseSearchItem> list;
        OgvThemeColorHelper ogvThemeColorHelperK22 = K2();
        if (ogvThemeColorHelperK22 == null) {
            return;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || !parentFragment.isHidden()) {
            if (!z6) {
                MutableLiveData<Boolean> mutableLiveData = ogvThemeColorHelperK22.b().f88303n;
                Boolean bool = Boolean.FALSE;
                mutableLiveData.setValue(bool);
                ogvThemeColorHelperK22.b().f88298i.setValue(bool);
                ogvThemeColorHelperK22.f88272g = 0;
                ogvThemeColorHelperK22.h = 0;
                return;
            }
            BaseSearchItem baseSearchItem = (searchResultAll == null || (list = searchResultAll.items) == null) ? null : list.get(0);
            Ps0.G g7 = null;
            if (baseSearchItem instanceof Ps0.G) {
                g7 = (Ps0.G) baseSearchItem;
            }
            ogvThemeColorHelperK22.b().f88303n.setValue(Boolean.TRUE);
            if (g7 == null) {
                return;
            }
            String bgColor = g7.getBgColor();
            String bgCoverUrl = g7.getBgCoverUrl();
            if (!StringUtil.isBlank(bgColor)) {
                if (g7.getBgTopColor() == null) {
                    boolean zWhenSuggestShowResetColor = g7.whenSuggestShowResetColor();
                    int iS = com.bilibili.search2.utils.B.s(ogvThemeColorHelperK22.f88267b, "#363E53");
                    ogvThemeColorHelperK22.c(ListExtentionsKt.getColorWithMask(iS, 0, 0.18f), ListExtentionsKt.getColorWithMask(iS, 0, 0.3f), bgColor, zWhenSuggestShowResetColor);
                } else {
                    try {
                        color = Color.parseColor(g7.getBgTopColor());
                    } catch (Exception e7) {
                        color = Color.parseColor("#2D3242");
                    }
                    Integer blackCoverColor = g7.getBlackCoverColor();
                    ogvThemeColorHelperK22.c(color, blackCoverColor != null ? blackCoverColor.intValue() : OgvThemeColorHelper.f88262t, bgColor, g7.whenSuggestShowResetColor());
                }
            }
            ogvThemeColorHelperK22.b().f88291a = g7.needCover();
            ogvThemeColorHelperK22.b().f88302m = g7.isBlackOver();
            ogvThemeColorHelperK22.b().f88298i.setValue(Boolean.TRUE);
            if (StringUtil.isBlank(bgCoverUrl) || (ogvThemeColorHelperK2 = K2()) == null || (i7 = ogvThemeColorHelperK2.f88272g) == 0 || (i8 = ogvThemeColorHelperK2.h) == 0) {
                return;
            }
            float f7 = OgvThemeColorHelper.f88258p;
            int iA = OgvThemeColorHelper.a.a();
            BitmapProcessType bitmapProcessType = ogvThemeColorHelperK2.f88274j;
            StringBuilder sbB = Vn.A.b(i7, i8, " downOgvThemeImage width:", " height:", " ");
            sbB.append(iA);
            sbB.append(" type:");
            sbB.append(bitmapProcessType);
            BLog.i("SearchResultAllFragment", sbB.toString());
            Context context = getContext();
            int i9 = ogvThemeColorHelperK2.f88272g;
            int i10 = ogvThemeColorHelperK2.h;
            int iA2 = 0;
            if (ogvThemeColorHelperK2.f88274j == BitmapProcessType.FIT_HEIGHT_BOTH_SHADOW) {
                iA2 = OgvThemeColorHelper.a.a();
            }
            ogvThemeColorHelperK2.downLoadOgvBackGroundImage(context, bgCoverUrl, i9, i10 - iA2, ogvThemeColorHelperK2.f88273i, ogvThemeColorHelperK2.f88274j);
        }
    }

    public final void Yf() {
        Context context;
        Resources resources;
        Context context2;
        Resources resources2;
        SearchResultAll searchResultAllH1 = rf().h1();
        if (searchResultAllH1 != null && searchResultAllH1.refreshFunctionOneEnable() && Qf()) {
            SearchResultAll searchResultAllH12 = rf().h1();
            int height = 0;
            int dimension = (searchResultAllH12 == null || !searchResultAllH12.refreshFunctionTwoEnable() || (context2 = getContext()) == null || (resources2 = context2.getResources()) == null) ? 0 : (int) resources2.getDimension(2131166961);
            int dimension2 = (!this.f87182L || (context = getContext()) == null || (resources = context.getResources()) == null) ? 0 : (int) resources.getDimension(2131166961);
            View view = this.f87177G;
            if (view != null) {
                RecyclerView recyclerView = this.h;
                if (recyclerView != null) {
                    height = recyclerView.getHeight();
                }
                com.bilibili.search2.utils.B.y(view, (((height - ListExtentionsKt.toPx(SearchBangumiItem.TYPE_FULLNET_VARIETY)) - this.f87484o) - rf().f87500g) + dimension + dimension2);
            }
        }
    }

    @Override // It0.a
    public final void Z4() {
        SearchDropDownMenuContent searchDropDownMenuContent;
        View bottomLine;
        SearchExtraTabView searchExtraTabView = this.f87181K;
        if (searchExtraTabView != null) {
            searchExtraTabView.setBackgroundColor(this.f87179I.f8776a);
        }
        Zf(true, false);
        SearchExtraTabView searchExtraTabView2 = this.f87181K;
        if (searchExtraTabView2 != null && (bottomLine = searchExtraTabView2.getBottomLine()) != null) {
            bottomLine.setBackgroundColor(this.f87179I.f8783i);
        }
        AppBarLayout appBarLayout = this.f87175E;
        if (appBarLayout != null) {
            appBarLayout.setBackground(this.f87179I.f8786l);
        }
        Ts0.a aVar = this.f87206u;
        if (aVar == null || (searchDropDownMenuContent = aVar.f24297a) == null) {
            return;
        }
        searchDropDownMenuContent.setContentBgColor(this.f87179I.f8782g);
    }

    public final void Zf(boolean z6, boolean z7) {
        View bottomLine;
        View bottomLine2;
        View bottomLine3;
        this.f87184N = z6;
        if (!z6) {
            if (this.f87207v != null) {
                C3153g.c(false);
            }
            SearchExtraTabView searchExtraTabView = this.f87181K;
            if (searchExtraTabView == null || (bottomLine = searchExtraTabView.getBottomLine()) == null) {
                return;
            }
            bottomLine.setVisibility(8);
            return;
        }
        if (this.f87182L) {
            if (this.f87207v != null) {
                C3153g.c(z7);
            }
            SearchExtraTabView searchExtraTabView2 = this.f87181K;
            if (searchExtraTabView2 == null || (bottomLine3 = searchExtraTabView2.getBottomLine()) == null) {
                return;
            }
            bottomLine3.setVisibility(0);
            return;
        }
        if (this.f87207v != null) {
            C3153g.c(true);
        }
        SearchExtraTabView searchExtraTabView3 = this.f87181K;
        if (searchExtraTabView3 == null || (bottomLine2 = searchExtraTabView3.getBottomLine()) == null) {
            return;
        }
        bottomLine2.setVisibility(8);
    }

    public final void ag(boolean z6) {
        View view = getView();
        if (view != null) {
            view.postDelayed(new com.bilibili.bplus.baseplus.activity.d(this, 1), z6 ? 500L : 0L);
        }
    }

    public final void bg(int i7) {
        OgvThemeColorHelper ogvThemeColorHelperK2;
        if (Wf(this) && (ogvThemeColorHelperK2 = K2()) != null) {
            SearchColorModel searchColorModelB = ogvThemeColorHelperK2.b();
            float f7 = searchColorModelB.f88296f;
            int i8 = searchColorModelB.f88295e;
            StringBuilder sb = new StringBuilder("allHeight ");
            sb.append(f7);
            sb.append(" ogvThemeModel.totalDistance=");
            sb.append(i8);
            sb.append(" distance=");
            com.bilibili.ad.adview.videodetail.pausedpage.brand.base.b.b(i7, "SEARCH_SCROLL", sb);
            int i9 = searchColorModelB.f88295e + i7;
            searchColorModelB.f88295e = i9;
            float f8 = 0.0f;
            if (f7 > 0.0f || i7 != 0) {
                float f9 = i9;
                if (f9 >= f7) {
                    f8 = 1.0f;
                } else if (i9 != 0) {
                    f8 = f9 / f7;
                }
                BLog.d("SEARCH_SCROLL", "alpha " + f8);
                ogvThemeColorHelperK2.b().f88293c.setValue(new SearchColorModel.a(f8, i7));
                SearchResultAll searchResultAllH1 = rf().h1();
                if (searchResultAllH1 == null || !searchResultAllH1.refreshFunctionOneEnable() || !Qf()) {
                    ViewExtKt.gone(this.f87177G);
                    return;
                }
                int i10 = searchColorModelB.f88295e;
                int i11 = this.f87186P;
                if (i10 < i11 / 2 || i11 <= 0) {
                    ViewExtKt.gone(this.f87177G);
                } else {
                    ListExtentionsKt.visible(this.f87177G);
                }
            }
        }
    }

    public final void cg() {
        SwipeRefreshLayout swipeRefreshLayout = this.f87192V;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        String str = this.f87209w;
        String str2 = rf().f87249m;
        String str3 = rf().f87256t;
        List<Integer> list = rf().f87259w;
        List<Integer> list2 = rf().f87261y;
        int iIncrementAndGet = rf().f87498e.incrementAndGet();
        int i7 = rf().f87235C;
        boolean z6 = rf().f87236D;
        int refreshTimes = ((SearchState) rf().f87499f.getValue()).getRefreshTimes();
        String str4 = rf().f87262z;
        long jVf = Vf();
        long jUf = Uf();
        Xs0.a aVar = qf().f87252p;
        Integer num = rf().f87237E;
        String str5 = rf().f87238F;
        Long l7 = rf().f87239G;
        Long l8 = rf().f87240H;
        int iG1 = rf().g1();
        rf().getClass();
        com.bilibili.search2.result.base.v vVar = new com.bilibili.search2.result.base.v(str, 0, true, false, str2, str3, false, list, list2, false, iIncrementAndGet, i7, z6, true, refreshTimes + 1, str4, jVf, jUf, aVar, num, str5, l7, l8, iG1, null, rf().f87241I, rf().f87242J, rf().f87250n, rf().L0());
        this.f87198Z = vVar;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new SearchResultAllFragment$tryPullDown$1$1(this, vVar, null), 3, (Object) null);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void d() {
        this.f87201a1 = true;
        super.d();
    }

    public final void dg(@ColorInt int i7) {
        View bottomLine;
        this.f87179I.f8784j = i7;
        SearchExtraTabView searchExtraTabView = this.f87181K;
        if (searchExtraTabView == null || (bottomLine = searchExtraTabView.getBottomLine()) == null) {
            return;
        }
        bottomLine.setBackgroundColor(i7);
    }

    public final void eg(@ColorInt int i7) {
        SearchDropDownMenuContent searchDropDownMenuContent;
        this.f87179I.h = i7;
        Ts0.a aVar = this.f87206u;
        if (aVar == null || (searchDropDownMenuContent = aVar.f24297a) == null) {
            return;
        }
        searchDropDownMenuContent.setContentBgColor(i7);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // It0.a
    public final void f9(float f7, int i7, @NotNull SearchColorModel.StateSource stateSource) throws NoWhenBranchMatchedException {
        int i8 = a.f87214b[stateSource.ordinal()];
        if (i8 == 1) {
            this.f87179I.f8777b = com.bilibili.search2.utils.m.a(f7, i7);
            return;
        }
        if (i8 != 2) {
            if (i8 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Ht0.d dVar = this.f87179I;
            dVar.f8777b = dVar.f8789o;
            dVar.f8787m = dVar.f8790p;
            dVar.f8780e = dVar.f8781f;
            dVar.f8778c = dVar.f8779d;
            dVar.f8784j = dVar.f8785k;
            return;
        }
        Ht0.d dVar2 = this.f87179I;
        dVar2.f8777b = i7;
        dVar2.f8780e = dVar2.f8781f;
        dVar2.f8778c = dVar2.f8779d;
        dVar2.f8788n = new ColorDrawable(i7);
        this.f87179I.f8787m = new ColorDrawable(i7);
        this.f87179I.h = i7;
    }

    public final void fg(@ColorInt int i7) {
        SearchColorModel searchColorModelB;
        MutableLiveData<Boolean> mutableLiveData;
        OgvThemeColorHelper ogvThemeColorHelperK2 = K2();
        if (((ogvThemeColorHelperK2 == null || (searchColorModelB = ogvThemeColorHelperK2.b()) == null || (mutableLiveData = searchColorModelB.h) == null) ? false : Intrinsics.areEqual(mutableLiveData.getValue(), Boolean.TRUE)) && i7 == 0) {
            return;
        }
        this.f87179I.f8777b = i7;
        SearchExtraTabView searchExtraTabView = this.f87181K;
        if (searchExtraTabView != null) {
            searchExtraTabView.setBackgroundColor(i7);
        }
    }

    @Override // It0.a
    public final void g1() {
        gg(null);
    }

    @Nullable
    public final IInlineControl getInlineControl() {
        return this.f87193W;
    }

    public final boolean getPageSwitchState() {
        MutableLiveData<com.bilibili.search2.main.data.e> mutableLiveData;
        com.bilibili.search2.main.data.e value;
        MutableLiveData<Boolean> mutableLiveData2;
        boolean zC = false;
        if (getContext() != null) {
            SearchPageStateModel searchPageStateModel = this.f87488s;
            zC = false;
            if (!((searchPageStateModel == null || (mutableLiveData2 = searchPageStateModel.f86768p) == null) ? false : Intrinsics.areEqual(Boolean.TRUE, mutableLiveData2.getValue()))) {
                SearchPageStateModel searchPageStateModel2 = this.f87488s;
                if (((searchPageStateModel2 == null || (mutableLiveData = searchPageStateModel2.f86772t) == null || (value = mutableLiveData.getValue()) == null) ? null : value.f86807a) != SearchContainerType.FULLSCREEN_ACTIVITY) {
                    zC = false;
                } else {
                    Rh.a aVar = Rh.a.a;
                    zC = Rh.a.c(getContext());
                }
            }
        }
        return zC;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "search.search-result.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        try {
            bundle.putString("page_num", String.valueOf(rf().N0()));
            String trackId = rf().getTrackId();
            String str = trackId;
            if (trackId == null) {
                str = "";
            }
            bundle.putString("trackid", str);
        } catch (IllegalStateException e7) {
            bundle.putString("page_num", "0");
            bundle.putString("trackid", "");
        }
        bundle.putString("searchpage", "search-result");
        Bundle arguments = getArguments();
        String string = "";
        if (arguments != null) {
            Bundle bundle2 = arguments.getBundle("default_extra_bundle");
            string = "";
            if (bundle2 != null) {
                string = bundle2.getString("keyword");
            }
        }
        bundle.putString("query", string);
        return bundle;
    }

    public final void gg(Bitmap bitmap) {
        if (bitmap == null) {
            SearchOgvBgConstraintLayout searchOgvBgConstraintLayout = Sf().b;
            searchOgvBgConstraintLayout.f88487k = false;
            searchOgvBgConstraintLayout.f88493q = 0;
            searchOgvBgConstraintLayout.f88494r = 0;
            searchOgvBgConstraintLayout.invalidate();
            return;
        }
        Context context = getContext();
        if (context != null && com.bilibili.search2.component.e.g(context) && com.bilibili.search2.component.e.h(context)) {
            SearchOgvBgConstraintLayout searchOgvBgConstraintLayout2 = Sf().b;
            if (searchOgvBgConstraintLayout2.f88487k && searchOgvBgConstraintLayout2.f88488l != null) {
                searchOgvBgConstraintLayout2.f88488l = bitmap;
                searchOgvBgConstraintLayout2.k0();
                searchOgvBgConstraintLayout2.invalidate();
                return;
            }
            searchOgvBgConstraintLayout2.f88488l = bitmap;
            searchOgvBgConstraintLayout2.f88487k = true;
            searchOgvBgConstraintLayout2.f88493q = 0;
            searchOgvBgConstraintLayout2.f88494r = 0;
            searchOgvBgConstraintLayout2.k0();
            searchOgvBgConstraintLayout2.j0();
            searchOgvBgConstraintLayout2.invalidate();
        }
    }

    @Override // It0.a
    public final void ha(float f7, int i7) {
        fg(com.bilibili.search2.utils.m.a(f7, i7));
    }

    public final void hg(boolean z6) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        C3153g c3153g;
        Yt0.F f7;
        this.f87179I.f8781f = 2131103553;
        final OgvThemeColorHelper ogvThemeColorHelperK2 = K2();
        if (ogvThemeColorHelperK2 != null && (c3153g = this.f87207v) != null && (f7 = c3153g.f29222j) != null && f7.c()) {
            ogvThemeColorHelperK2.b().h.setValue(Boolean.TRUE);
            View view = getView();
            if (view != null) {
                final int i7 = 0;
                view.post(new Runnable(i7, this, ogvThemeColorHelperK2) { // from class: com.bilibili.search2.result.all.A

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f87122a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f87123b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Object f87124c;

                    {
                        this.f87122a = i7;
                        this.f87123b = this;
                        this.f87124c = ogvThemeColorHelperK2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Yt0.F f8;
                        switch (this.f87122a) {
                            case 0:
                                SearchResultAllFragment searchResultAllFragment = (SearchResultAllFragment) this.f87123b;
                                OgvThemeColorHelper ogvThemeColorHelper = (OgvThemeColorHelper) this.f87124c;
                                C3153g c3153g2 = searchResultAllFragment.f87207v;
                                if (c3153g2 != null && (f8 = c3153g2.f29222j) != null && f8.c()) {
                                    ogvThemeColorHelper.b().h.setValue(Boolean.TRUE);
                                    break;
                                }
                                break;
                            default:
                                e.a aVar = (e.a) this.f87123b;
                                rG0.e eVar = (rG0.e) this.f87124c;
                                Xz0.d dVar = Xz0.d.f28458a;
                                View view2 = aVar.itemView;
                                SK.g gVar = new SK.g(1, eVar, aVar);
                                dVar.getClass();
                                Xz0.d.b(view2, gVar);
                                break;
                        }
                    }
                });
            }
        }
        if (!z6) {
            SearchResultAll searchResultAllH1 = rf().h1();
            if (searchResultAllH1 != null) {
                searchResultAllH1.refreshFunctionTwoEnable();
            }
            SearchPageStateModel searchPageStateModel = this.f87488s;
            if (!((searchPageStateModel == null || (mutableLiveData2 = searchPageStateModel.f86771s) == null) ? false : Intrinsics.areEqual(mutableLiveData2.getValue(), Boolean.TRUE))) {
                this.f87185O = false;
            }
            SearchResultAll searchResultAllH12 = rf().h1();
            boolean z7 = true;
            if (searchResultAllH12 != null ? searchResultAllH12.refreshFunctionTwoEnable() : false) {
                z7 = ((SearchState) rf().f87499f.getValue()).getHasImmerseCard();
            }
            j4.t.a("applyScrollMode canFilterScroll=", "SearchResultAllFragment", z7);
            SearchPageStateModel searchPageStateModel2 = this.f87488s;
            boolean zAreEqual = (searchPageStateModel2 == null || (mutableLiveData = searchPageStateModel2.f86771s) == null) ? false : Intrinsics.areEqual(mutableLiveData.getValue(), Boolean.TRUE);
            if (!zAreEqual) {
                kf();
            }
            Nf();
            Of();
            if (zAreEqual) {
                Mf(false, false);
            }
        }
        AppBarLayout appBarLayout = this.f87175E;
        if (appBarLayout != null) {
            appBarLayout.post(new Runnable(this) { // from class: com.bilibili.search2.result.all.B

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchResultAllFragment f87125a;

                {
                    this.f87125a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    OgvThemeColorHelper ogvThemeColorHelperK22;
                    SearchResultAllFragment searchResultAllFragment = this.f87125a;
                    int i8 = SearchResultAllFragment.f87170c1;
                    if (searchResultAllFragment.getView() == null || (ogvThemeColorHelperK22 = searchResultAllFragment.K2()) == null) {
                        return;
                    }
                    SearchColorModel searchColorModelB = ogvThemeColorHelperK22.f88266a != null ? ogvThemeColorHelperK22.b() : null;
                    Boolean value = null;
                    if (searchColorModelB != null) {
                        MutableLiveData<Boolean> mutableLiveData3 = searchColorModelB.f88294d;
                        value = null;
                        if (mutableLiveData3 != null) {
                            value = mutableLiveData3.getValue();
                        }
                    }
                    int px = ListExtentionsKt.toPx(10);
                    AppBarLayout appBarLayout2 = searchResultAllFragment.f87175E;
                    if (appBarLayout2 != null) {
                        px = appBarLayout2.getHeight();
                    }
                    float f8 = px;
                    float px2 = f8;
                    if (value != null) {
                        px2 = f8;
                        if (value.booleanValue()) {
                            px2 = f8 + ListExtentionsKt.toPx(40);
                        }
                    }
                    float px3 = px2;
                    if (searchResultAllFragment.f87182L) {
                        px3 = px2;
                        if (searchResultAllFragment.f87185O) {
                            px3 = px2 + ListExtentionsKt.toPx(40);
                        }
                    }
                    BLog.i("SEARCH_SCROLL", "allHeight " + px3);
                    if (searchColorModelB != null) {
                        searchColorModelB.f88296f = px3;
                    }
                }
            });
        }
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void hideLoading() {
        super.hideLoading();
        SwipeRefreshLayout swipeRefreshLayout = this.f87192V;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final boolean kf() {
        TintAppBarLayout tintAppBarLayout;
        MutableLiveData<Boolean> mutableLiveData;
        SearchPageStateModel searchPageStateModel = this.f87488s;
        if (!((searchPageStateModel == null || (mutableLiveData = searchPageStateModel.f86771s) == null) ? false : Intrinsics.areEqual(mutableLiveData.getValue(), Boolean.TRUE)) && (tintAppBarLayout = this.f87175E) != null) {
            tintAppBarLayout.setExpanded(true, false);
        }
        return super.kf();
    }

    @Override // It0.a
    public final void l8(@Nullable Bitmap bitmap) {
        Ht0.d dVar = this.f87179I;
        Drawable drawable = dVar.f8790p;
        dVar.f8787m = drawable;
        AppBarLayout appBarLayout = this.f87175E;
        if (appBarLayout != null) {
            appBarLayout.setBackground(drawable);
        }
        fg(this.f87179I.f8789o);
        Ht0.d dVar2 = this.f87179I;
        int i7 = dVar2.f8781f;
        int i8 = dVar2.f8779d;
        dVar2.f8780e = i7;
        dVar2.f8778c = i8;
        dVar2.f8784j = dVar2.f8785k;
        eg(dVar2.f8789o);
        gg(bitmap);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void loadData(boolean z6) {
        MutableLiveData<Boolean> mutableLiveData;
        if (!z6) {
            if (!rf().Q0() || z6) {
                Pf(false, false);
                return;
            }
            return;
        }
        com.bilibili.search2.result.base.v vVar = this.f87198Z;
        if (vVar != null) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new SearchResultAllFragment$loadData$1$1(this, vVar, null), 3, (Object) null);
        }
        com.bilibili.search2.result.j jVar = this.f87174D;
        if (jVar == null || (mutableLiveData = jVar.f88254a) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.TRUE);
    }

    @Override // It0.a
    public final void m2(int i7) {
        C3153g c3153g;
        Zf(false, false);
        fg(this.f87179I.f8789o);
        Ht0.d dVar = this.f87179I;
        int i8 = dVar.f8781f;
        int i9 = dVar.f8779d;
        dVar.f8780e = i8;
        dVar.f8778c = i9;
        dg(dVar.f8785k);
        this.f87179I.f8788n = new ColorDrawable(i7);
        Drawable colorDrawable = new ColorDrawable(i7);
        this.f87179I.f8787m = colorDrawable;
        AppBarLayout appBarLayout = this.f87175E;
        if (appBarLayout != null) {
            appBarLayout.setBackground(colorDrawable);
        }
        eg(i7);
        OgvThemeColorHelper ogvThemeColorHelperK2 = K2();
        if (ogvThemeColorHelperK2 == null || (c3153g = this.f87207v) == null) {
            return;
        }
        c3153g.d(ogvThemeColorHelperK2.d() ? Integer.valueOf(Color.parseColor(ogvThemeColorHelperK2.f88267b)) : null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        p pVar;
        if (i8 == -1 && i7 == 100 && intent != null) {
            long jI = zO.a.i(intent, EditCustomizeSticker.TAG_MID);
            boolean zE = zO.a.e(intent, "followed", false);
            if (jI == -1 || (pVar = this.f87212z) == null) {
                return;
            }
            pVar.f87309g.getClass();
            BaseSearchItem baseSearchItemQ = pVar.Q(0);
            if (baseSearchItemQ instanceof SearchUpperItem) {
                SearchUpperItem searchUpperItem = (SearchUpperItem) baseSearchItemQ;
                if (searchUpperItem.getParam() == null || !Intrinsics.areEqual(searchUpperItem.getParam(), String.valueOf(jI)) || searchUpperItem.getRelation() == null || searchUpperItem.getRelation().isUserFollowUp() == zE) {
                    return;
                }
                searchUpperItem.getRelation().setStatusWithFollow(zE);
                pVar.notifyItemChanged(0);
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        MutableLiveData mutableLiveData;
        BLog.d("SearchResultAllFragment", "searchOnCreate: " + this + " ,viewModel: " + rf());
        super.onCreate(bundle);
        rf().f87253q.getClass();
        C6058l c6058l = C6059m.f87304b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c6058l.getClass();
        KProperty<Object> kProperty = C6058l.f87297f[3];
        c6058l.f87301d.b(jCurrentTimeMillis);
        this.f87173C = (C6846i) new ViewModelProvider(this).get(C6846i.class);
        this.f87174D = (com.bilibili.search2.result.j) new ViewModelProvider(this).get(com.bilibili.search2.result.j.class);
        SearchPageStateModel searchPageStateModelD = com.bilibili.search2.main.z.d(this);
        this.f87488s = searchPageStateModelD;
        if (searchPageStateModelD != null) {
            searchPageStateModelD.f86772t.observe(this, new i(new KS0.e(this, 3)));
            searchPageStateModelD.f86768p.observe(this, new i(new Aw.k(this, 2)));
            searchPageStateModelD.h.observe(this, new i(new androidx.compose.runtime.snapshots.t(this, 1)));
            searchPageStateModelD.f86755b.observe(this, new Observer(this) { // from class: com.bilibili.search2.result.all.D

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchResultAllFragment f87128a;

                {
                    this.f87128a = this;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    C3153g c3153g;
                    SearchPageStateModel.c cVar = (SearchPageStateModel.c) obj;
                    int i7 = SearchResultAllFragment.f87170c1;
                    if (cVar == null || !cVar.f86791a || (c3153g = this.f87128a.f87207v) == null) {
                        return;
                    }
                    c3153g.e();
                }
            });
        }
        C6846i c6846i = this.f87173C;
        if (c6846i != null && (mutableLiveData = (MutableLiveData) c6846i.f116707a.getValue()) != null) {
            mutableLiveData.observe(this, new Observer(this) { // from class: com.bilibili.search2.result.all.E

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchResultAllFragment f87129a;

                {
                    this.f87129a = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v31, types: [androidx.viewpager.widget.ViewPager] */
                /* JADX WARN: Type inference failed for: r0v39, types: [androidx.viewpager.widget.ViewPager] */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    BiliMainSearchResultFragment biliMainSearchResultFragmentD;
                    Integer num = (Integer) obj;
                    int i7 = SearchResultAllFragment.f87170c1;
                    if (num == null) {
                        return;
                    }
                    int iIntValue = num.intValue();
                    SearchResultAllFragment searchResultAllFragment = this.f87129a;
                    Fragment parentFragment = searchResultAllFragment.getParentFragment();
                    BiliMainSearchResultFragment biliMainSearchResultFragment = parentFragment instanceof BiliMainSearchResultFragment ? (BiliMainSearchResultFragment) parentFragment : null;
                    if (biliMainSearchResultFragment != null) {
                        SearchViewPager searchViewPager = biliMainSearchResultFragment.f87086j;
                        if (searchViewPager == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPager");
                            searchViewPager = null;
                        }
                        searchViewPager.setCurrentItem(iIntValue);
                        return;
                    }
                    FragmentActivity fragmentActivityP3 = searchResultAllFragment.p3();
                    BiliMainSearchActivity biliMainSearchActivity = fragmentActivityP3 instanceof BiliMainSearchActivity ? (BiliMainSearchActivity) fragmentActivityP3 : null;
                    if (biliMainSearchActivity == null || (biliMainSearchResultFragmentD = biliMainSearchActivity.T6().f86729b.d()) == null) {
                        return;
                    }
                    SearchViewPager searchViewPager2 = biliMainSearchResultFragmentD.f87086j;
                    if (searchViewPager2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPager");
                        searchViewPager2 = null;
                    }
                    searchViewPager2.setCurrentItem(iIntValue);
                }
            });
        }
        rf().f87234B = null;
        ConnectivityMonitor.getInstance().register(this.f87195X0);
        Violet violet = Violet.INSTANCE;
        violet.ofChannel(SearchInlineNetStatus.class).observeUnSticky(this, new Observer(this) { // from class: com.bilibili.search2.result.all.F

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchResultAllFragment f87130a;

            {
                this.f87130a = this;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) throws NoWhenBranchMatchedException {
                int i7 = SearchResultAllFragment.f87170c1;
                int network = ConnectivityMonitor.getInstance().getNetwork();
                int i8 = SearchResultAllFragment.a.f87213a[((SearchInlineNetStatus) obj).ordinal()];
                SearchResultAllFragment searchResultAllFragment = this.f87130a;
                if (i8 == 1) {
                    searchResultAllFragment.ag(false);
                    return;
                }
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IInlineControl iInlineControl = searchResultAllFragment.f87193W;
                    if (iInlineControl != null) {
                        iInlineControl.stopPlay();
                        return;
                    }
                    return;
                }
                if (network != 2) {
                    searchResultAllFragment.ag(false);
                    return;
                }
                IInlineControl iInlineControl2 = searchResultAllFragment.f87193W;
                if (iInlineControl2 != null) {
                    iInlineControl2.stopPlay();
                }
            }
        });
        this.f87191U.c(this, this.f87190T);
        com.bilibili.search2.main.z.d(this).f86767o.observe(this, new i(new androidx.compose.runtime.snapshots.y(this, 2)));
        violet.ofChannel(Mq0.e.class).observeCachedInactive(this, new SK.a(1, this));
        violet.ofChannel(FollowStateEvent.class).observeCachedInactive(this, new Observer(this) { // from class: com.bilibili.search2.result.all.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchResultAllFragment f87324a;

            {
                this.f87324a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                List<FollowStateEvent> list = (List) obj;
                SearchResultAllFragment searchResultAllFragment = this.f87324a;
                p pVar = searchResultAllFragment.f87212z;
                if (pVar == null) {
                    return;
                }
                int size = pVar.f87275a.size();
                for (int i7 = 0; i7 < size; i7++) {
                    K90.c cVarQ = searchResultAllFragment.f87212z.Q(i7);
                    if (cVarQ instanceof com.bilibili.search2.result.k) {
                        FollowStateEvent followStateEvent = null;
                        for (FollowStateEvent followStateEvent2 : list) {
                            if (followStateEvent2.getUid() == ((com.bilibili.search2.result.k) cVarQ).getUpMid()) {
                                followStateEvent = followStateEvent2;
                            }
                        }
                        if (followStateEvent != null) {
                            ((com.bilibili.search2.result.k) cVarQ).setIsFollow(followStateEvent.isFollow());
                            searchResultAllFragment.f87212z.notifyItemChanged(i7, followStateEvent);
                        }
                    }
                }
            }
        });
        violet.ofChannel(VideoStatusMessage.class).observeCachedInactive(this, new Observer(this) { // from class: com.bilibili.search2.result.all.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchResultAllFragment f87325a;

            {
                this.f87325a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                List<VideoStatusMessage> list = (List) obj;
                SearchResultAllFragment searchResultAllFragment = this.f87325a;
                p pVar = searchResultAllFragment.f87212z;
                if (pVar == null) {
                    return;
                }
                int size = pVar.f87275a.size();
                for (int i7 = 0; i7 < size; i7++) {
                    K90.c cVarQ = searchResultAllFragment.f87212z.Q(i7);
                    if (cVarQ instanceof com.bilibili.search2.result.n) {
                        VideoStatusMessage videoStatusMessage = null;
                        for (VideoStatusMessage videoStatusMessage2 : list) {
                            if (videoStatusMessage2.getAid() == ((com.bilibili.search2.result.n) cVarQ).getAvId()) {
                                videoStatusMessage = videoStatusMessage2;
                            }
                        }
                        if (videoStatusMessage != null) {
                            com.bilibili.search2.result.n nVar = (com.bilibili.search2.result.n) cVarQ;
                            nVar.setIsFav(videoStatusMessage.getFavState());
                            nVar.setIsLike(videoStatusMessage.getLikeState());
                            nVar.setLikeCount(videoStatusMessage.getLikeCount());
                            nVar.setCoined(videoStatusMessage.getCoinState());
                            searchResultAllFragment.f87212z.notifyItemChanged(i7, videoStatusMessage);
                        }
                    }
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [android.view.ViewTreeObserver] */
    /* JADX WARN: Type inference failed for: r0v170, types: [androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior, com.bilibili.search2.result.all.SearchExtraAppBarBehavior] */
    /* JADX WARN: Type inference failed for: r0v178, types: [androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v23, types: [android.widget.LinearLayout, com.bilibili.magicasakura.widgets.TintAppBarLayout] */
    /* JADX WARN: Type inference failed for: r0v29, types: [androidx.recyclerview.widget.GridLayoutManager, com.bilibili.search2.result.all.SearchResultAllFragment$onCreateView$6] */
    /* JADX WARN: Type inference failed for: r0v53, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r0v99, types: [android.view.ViewTreeObserver$OnDrawListener, com.bilibili.search2.result.all.u] */
    /* JADX WARN: Type inference failed for: r1v67, types: [androidx.recyclerview.widget.RecyclerView$ItemAnimator] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        MutableLiveData<Boolean> mutableLiveData;
        SearchColorModel searchColorModelB;
        MutableLiveData<Boolean> mutableLiveData2;
        SearchColorModel searchColorModelB2;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<com.bilibili.search2.main.data.e> mutableLiveData4;
        com.bilibili.search2.main.data.e value;
        com.bilibili.search2.main.data.d dVar;
        View viewInflate = layoutInflater.inflate(2131494166, viewGroup, false);
        this.f87199Z0 = Bl.j.bind(viewInflate);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(2131306595);
        this.h = recyclerView;
        if (recyclerView != null) {
            final SearchOgvBgConstraintLayout searchOgvBgConstraintLayout = Sf().b;
            searchOgvBgConstraintLayout.f88481d = recyclerView;
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener(searchOgvBgConstraintLayout) { // from class: Jt0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchOgvBgConstraintLayout f11691a;

                {
                    this.f11691a = searchOgvBgConstraintLayout;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                    final SearchOgvBgConstraintLayout searchOgvBgConstraintLayout2 = this.f11691a;
                    RecyclerView recyclerView2 = searchOgvBgConstraintLayout2.f88481d;
                    if (recyclerView2 != null) {
                        final int i15 = 0;
                        recyclerView2.post(new Runnable(searchOgvBgConstraintLayout2, i15) { // from class: Jt0.b

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final int f11692a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final Object f11693b;

                            {
                                this.f11692a = i15;
                                this.f11693b = searchOgvBgConstraintLayout2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (this.f11692a) {
                                    case 0:
                                        SearchOgvBgConstraintLayout searchOgvBgConstraintLayout3 = (SearchOgvBgConstraintLayout) this.f11693b;
                                        RecyclerView recyclerView3 = searchOgvBgConstraintLayout3.f88481d;
                                        if (recyclerView3 != null) {
                                            int width = searchOgvBgConstraintLayout3.getWidth();
                                            int measuredWidth = recyclerView3.getMeasuredWidth();
                                            float f7 = (width - measuredWidth) / 2.0f;
                                            searchOgvBgConstraintLayout3.f88482e = f7;
                                            searchOgvBgConstraintLayout3.f88483f = f7 + measuredWidth;
                                            break;
                                        }
                                        break;
                                    default:
                                        MallCommentWindow mallCommentWindow = (MallCommentWindow) this.f11693b;
                                        TextView textView = (TextView) mallCommentWindow.A.getValue();
                                        int measuredWidth2 = textView != null ? textView.getMeasuredWidth() : 0;
                                        TextView textView2 = (TextView) mallCommentWindow.A.getValue();
                                        if (textView2 != null) {
                                            MallKtExtensionKt.setTextWithCompletelyTruncated(textView2, mallCommentWindow.h1, measuredWidth2);
                                        }
                                        break;
                                }
                            }
                        });
                    }
                }
            });
        }
        this.f87177G = viewInflate.findViewById(2131310077);
        this.f87178H = (TintImageView) viewInflate.findViewById(2131310080);
        View view = this.f87177G;
        if (view != null) {
            view.setOnClickListener(new OR0.b(this, 2));
        }
        SearchExtraTabView searchExtraTabView = (SearchExtraTabView) viewInflate.findViewById(2131310908);
        this.f87181K = searchExtraTabView;
        if (searchExtraTabView != null) {
            searchExtraTabView.setIndexedClickListener(new Function2(this) { // from class: com.bilibili.search2.result.all.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchResultAllFragment f87313a;

                {
                    this.f87313a = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    List<String> list;
                    String str = (String) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    SearchResultAllFragment searchResultAllFragment = this.f87313a;
                    searchResultAllFragment.f87183M = iIntValue;
                    searchResultAllFragment.Xf(searchResultAllFragment.rf().h1(), SearchResultAllFragment.Wf(searchResultAllFragment));
                    searchResultAllFragment.qf().f87252p.f28315c = str;
                    searchResultAllFragment.rf().f87249m = "filter_content_search";
                    searchResultAllFragment.rf().f87250n = null;
                    searchResultAllFragment.rf().f87252p.f28314b = "filter_content_search";
                    SearchResultAll searchResultAll = searchResultAllFragment.f87210x;
                    boolean z6 = Xs0.b.f28321a;
                    Pair pair = TuplesKt.to("content_name", str);
                    Pair pair2 = TuplesKt.to("query", searchResultAll != null ? searchResultAll.query : null);
                    Pair pair3 = TuplesKt.to("trackid", searchResultAll != null ? searchResultAll.trackId : null);
                    String str2 = null;
                    if (searchResultAll != null) {
                        str2 = searchResultAll.expStr;
                    }
                    Neurons.reportClick(false, "search.search-result.content-filter.0.click", MapsKt.mapOf(new Pair[]{pair, pair2, pair3, TuplesKt.to("abtestid", str2), com.bilibili.app.authorspace.ui.pages.p.a((searchResultAll == null || (list = searchResultAll.extraWords) == null) ? -1 : list.indexOf(str), 1, "module_pos")}));
                    searchResultAllFragment.kf();
                    searchResultAllFragment.Pf(true, true);
                    return Unit.INSTANCE;
                }
            });
        }
        this.f87477g = (TextView) viewInflate.findViewById(2131310274);
        this.f87475e = viewInflate.findViewById(2131303590);
        this.f87206u = new Ts0.a(requireContext());
        ?? r02 = (TintAppBarLayout) viewInflate.findViewById(2131310881);
        this.f87175E = r02;
        if (r02 != 0) {
            ?? searchExtraAppBarBehavior = new SearchExtraAppBarBehavior();
            ViewGroup.LayoutParams layoutParams = r02.getLayoutParams();
            CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setBehavior(searchExtraAppBarBehavior);
            }
            this.f87176F = searchExtraAppBarBehavior;
        }
        TintAppBarLayout tintAppBarLayout = this.f87175E;
        if (tintAppBarLayout != null) {
            tintAppBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener(this) { // from class: com.bilibili.search2.result.all.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchResultAllFragment f87314a;

                {
                    this.f87314a = this;
                }

                public final void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
                    Resources resources;
                    SearchResultAllFragment searchResultAllFragment = this.f87314a;
                    if (searchResultAllFragment.f87189S != i7) {
                        searchResultAllFragment.f87189S = i7;
                        searchResultAllFragment.rf().f87500g = appBarLayout.getHeight() + i7;
                        bY.c<RecyclerView> cVarNf = searchResultAllFragment.nf();
                        if (cVarNf != null) {
                            cVarNf.h();
                        }
                        int iAbs = Math.abs(i7) - Math.abs(searchResultAllFragment.f87180J);
                        searchResultAllFragment.f87180J = Math.abs(i7);
                        searchResultAllFragment.bg(iAbs);
                        if (searchResultAllFragment.K2() != null) {
                            Float fValueOf = searchResultAllFragment.f87175E != null ? Float.valueOf(r0.getHeight()) : null;
                            Float fValueOf2 = fValueOf;
                            if (searchResultAllFragment.f87182L) {
                                fValueOf2 = fValueOf;
                                if (!searchResultAllFragment.f87185O) {
                                    fValueOf2 = fValueOf;
                                    if (Intrinsics.areEqual(fValueOf, 0.0f)) {
                                        Context context = searchResultAllFragment.getContext();
                                        fValueOf2 = (context == null || (resources = context.getResources()) == null) ? Float.valueOf(0.0f) : Float.valueOf(resources.getDimension(2131166960));
                                    }
                                }
                            }
                            if (Intrinsics.areEqual(Math.abs(i7), fValueOf2) && !searchResultAllFragment.f87202b1) {
                                searchResultAllFragment.f87202b1 = true;
                                SearchResultAll searchResultAll = searchResultAllFragment.f87210x;
                                boolean z6 = Xs0.b.f28321a;
                                Pair pair = TuplesKt.to("query", searchResultAll != null ? searchResultAll.query : null);
                                String str = null;
                                if (searchResultAll != null) {
                                    str = searchResultAll.trackId;
                                }
                                Neurons.reportClick(false, "search.search-result.ceiling.0.click", MapsKt.mapOf(new Pair[]{pair, TuplesKt.to("trackid", str)}));
                            } else if (!Intrinsics.areEqual(Math.abs(i7), fValueOf2) && searchResultAllFragment.f87202b1) {
                                searchResultAllFragment.f87202b1 = false;
                            }
                        }
                        searchResultAllFragment.Yf();
                        BLog.d("SEARCH_SCROLL", "all tintBar " + iAbs + " " + i7);
                    }
                }
            });
        }
        ?? r03 = new GridLayoutManager(this, p3()) { // from class: com.bilibili.search2.result.all.SearchResultAllFragment.onCreateView.6

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchResultAllFragment f87228a;

            {
                this.f87228a = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final int getHeight() {
                SearchResultAllFragment searchResultAllFragment = this.f87228a;
                int height = searchResultAllFragment.f87175E.getHeight() - searchResultAllFragment.f87180J;
                int height2 = height;
                if (searchResultAllFragment.f87182L) {
                    height2 = height;
                    if (!searchResultAllFragment.f87185O) {
                        SearchExtraTabView searchExtraTabView2 = searchResultAllFragment.f87181K;
                        height2 = height - (searchExtraTabView2 != null ? searchExtraTabView2.getHeight() : 0);
                    }
                }
                return super.getHeight() - Math.max(height2, 0);
            }
        };
        this.f87172B = r03;
        r03.setSpanSizeLookup(new f(this));
        RecyclerView recyclerView2 = this.h;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(this.f87172B);
        }
        p pVar = new p(this, new SearchResultAllFragment$onCreateView$adapter$1(this), 4);
        this.f87478i = pVar;
        this.f87212z = pVar;
        SearchPageStateModel searchPageStateModel = this.f87488s;
        int i7 = (searchPageStateModel == null || (mutableLiveData4 = searchPageStateModel.f86772t) == null || (value = mutableLiveData4.getValue()) == null || (dVar = value.f86809c) == null) ? 0 : dVar.f86805a;
        if (pVar.f87310i != i7) {
            pVar.f87310i = i7;
            pVar.notifyDataSetChanged();
        }
        RecyclerView recyclerView3 = this.h;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(pVar);
        }
        RecyclerView recyclerView4 = this.h;
        if (recyclerView4 != null) {
            recyclerView4.addOnScrollListener(new g(this));
        }
        boolean z6 = DeviceDecision.INSTANCE.getBoolean("search.use_parallel_recycler_view_animator", true);
        ?? r04 = this.h;
        if (r04 != 0) {
            r04.setItemAnimator(z6 ? new com.bilibili.search2.result.widget.h(new E80.H(this, 2)) : new com.bilibili.search2.result.widget.b(new E80.J(this, 1)));
        }
        RecyclerView recyclerView5 = this.h;
        if (recyclerView5 != null) {
            this.f87208v0.a(this, recyclerView5);
        }
        this.f87179I.f8785k = getResources().getColor(2131103712);
        this.f87179I.f8776a = getResources().getColor(R$color.f64616Wh0);
        this.f87179I.getClass();
        Ht0.d dVar2 = this.f87179I;
        dVar2.f8779d = 2131239293;
        dVar2.f8781f = 2131103606;
        AppBarLayout appBarLayout = this.f87175E;
        dVar2.f8786l = appBarLayout != null ? appBarLayout.getBackground() : null;
        Ht0.d dVar3 = this.f87179I;
        Context context = getContext();
        dVar3.f8783i = context != null ? ContextCompat.getColor(context, R$color.Ga2) : 0;
        this.f87179I.f8782g = this.f87206u.f24297a.getLayoutColor();
        OgvThemeColorHelper ogvThemeColorHelperK2 = K2();
        new It0.p(this, ogvThemeColorHelperK2);
        if (ogvThemeColorHelperK2 != null && (searchColorModelB2 = ogvThemeColorHelperK2.b()) != null && (mutableLiveData3 = searchColorModelB2.f88303n) != null) {
            mutableLiveData3.observe(getViewLifecycleOwner(), new i(new SI.f(this, 4)));
        }
        if (ogvThemeColorHelperK2 != null && (searchColorModelB = ogvThemeColorHelperK2.b()) != null && (mutableLiveData2 = searchColorModelB.f88298i) != null) {
            mutableLiveData2.observe(getViewLifecycleOwner(), new i(new y1(this, 2)));
        }
        SearchPageStateModel searchPageStateModel2 = this.f87488s;
        if (searchPageStateModel2 != null && (mutableLiveData = searchPageStateModel2.f86764l) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new i(new A1(this, 2)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass15(this, null), 3, (Object) null);
        final SearchNestedCoordinatorLayout searchNestedCoordinatorLayoutFindViewById = viewInflate.findViewById(2131310933);
        searchNestedCoordinatorLayoutFindViewById.setShouldParentScrollUp(new Function2(this) { // from class: com.bilibili.search2.result.all.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchResultAllFragment f87315a;

            {
                this.f87315a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                int i8 = SearchResultAllFragment.f87170c1;
                boolean zHa = false;
                if (iIntValue > 0) {
                    Ii.a parentFragment = this.f87315a.getParentFragment();
                    if (parentFragment instanceof Ii.a) {
                        zHa = parentFragment.Ha();
                    }
                }
                return Boolean.valueOf(zHa);
            }
        });
        ?? r05 = new ViewTreeObserver.OnDrawListener(this, searchNestedCoordinatorLayoutFindViewById) { // from class: com.bilibili.search2.result.all.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchResultAllFragment f87316a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SearchNestedCoordinatorLayout f87317b;

            {
                this.f87316a = this;
                this.f87317b = searchNestedCoordinatorLayoutFindViewById;
            }

            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                SearchResultAllFragment searchResultAllFragment = this.f87316a;
                SearchNestedCoordinatorLayout searchNestedCoordinatorLayout = this.f87317b;
                int i8 = SearchResultAllFragment.f87170c1;
                searchResultAllFragment.f87186P = searchNestedCoordinatorLayout.getHeight();
            }
        };
        searchNestedCoordinatorLayoutFindViewById.getViewTreeObserver().addOnDrawListener(r05);
        if (EntryPointKt.getMemleakOptEnable()) {
            this.f87188R = searchNestedCoordinatorLayoutFindViewById;
            this.f87187Q = r05;
        }
        SwipeRefreshLayout swipeRefreshLayoutFindViewById = viewInflate.findViewById(2131310081);
        this.f87192V = swipeRefreshLayoutFindViewById;
        if (swipeRefreshLayoutFindViewById != null) {
            swipeRefreshLayoutFindViewById.setEnabled(false);
        }
        SwipeRefreshLayout swipeRefreshLayout = this.f87192V;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setStyle(1);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.f87192V;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setColorSchemeColors(new int[]{ThemeUtils.getColorById(getContext(), 2131103284)});
        }
        SwipeRefreshLayout swipeRefreshLayout3 = this.f87192V;
        if (swipeRefreshLayout3 != null) {
            swipeRefreshLayout3.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener(this) { // from class: com.bilibili.search2.result.all.x

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchResultAllFragment f87323a;

                {
                    this.f87323a = this;
                }

                public final void onRefresh() {
                    int i8 = SearchResultAllFragment.f87170c1;
                    SearchResultAllFragment searchResultAllFragment = this.f87323a;
                    if (!searchResultAllFragment.Qf()) {
                        SwipeRefreshLayout swipeRefreshLayout4 = searchResultAllFragment.f87192V;
                        if (swipeRefreshLayout4 != null) {
                            swipeRefreshLayout4.setRefreshing(false);
                            return;
                        }
                        return;
                    }
                    SwipeRefreshLayout swipeRefreshLayout5 = searchResultAllFragment.f87192V;
                    if (swipeRefreshLayout5 != null) {
                        swipeRefreshLayout5.setRefreshing(true);
                    }
                    String str = searchResultAllFragment.f87209w;
                    String str2 = searchResultAllFragment.rf().f87249m;
                    String str3 = searchResultAllFragment.rf().f87256t;
                    List<Integer> list = searchResultAllFragment.rf().f87259w;
                    List<Integer> list2 = searchResultAllFragment.rf().f87261y;
                    int iIncrementAndGet = searchResultAllFragment.rf().f87498e.incrementAndGet();
                    int i9 = searchResultAllFragment.rf().f87235C;
                    boolean z7 = searchResultAllFragment.rf().f87236D;
                    int refreshTimes = ((SearchState) searchResultAllFragment.rf().f87499f.getValue()).getRefreshTimes();
                    String str4 = searchResultAllFragment.rf().f87262z;
                    long jVf = searchResultAllFragment.Vf();
                    long jUf = searchResultAllFragment.Uf();
                    Xs0.a aVar = searchResultAllFragment.qf().f87252p;
                    Integer num = searchResultAllFragment.rf().f87237E;
                    String str5 = searchResultAllFragment.rf().f87238F;
                    Long l7 = searchResultAllFragment.rf().f87239G;
                    Long l8 = searchResultAllFragment.rf().f87240H;
                    searchResultAllFragment.rf().getClass();
                    com.bilibili.search2.result.base.v vVar = new com.bilibili.search2.result.base.v(str, 0, true, false, str2, str3, list, list2, false, iIncrementAndGet, i9, z7, true, refreshTimes + 1, str4, jVf, jUf, aVar, num, str5, l7, l8, 0, searchResultAllFragment.rf().f87241I, searchResultAllFragment.rf().f87242J, searchResultAllFragment.rf().f87250n, searchResultAllFragment.rf().L0(), GravityCompat.RELATIVE_LAYOUT_DIRECTION);
                    searchResultAllFragment.f87198Z = vVar;
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(searchResultAllFragment.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new SearchResultAllFragment$initSwipeRefresh$1$1$1(searchResultAllFragment, vVar, null), 3, (Object) null);
                }
            });
        }
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        SearchResultAllViewModel searchResultAllViewModelRf = rf();
        searchResultAllViewModelRf.f87256t = null;
        searchResultAllViewModelRf.f87257u = 0;
        searchResultAllViewModelRf.f87258v = 0;
        ((ArrayList) searchResultAllViewModelRf.f87259w).clear();
        ((ArrayList) searchResultAllViewModelRf.f87260x).clear();
        ((ArrayList) searchResultAllViewModelRf.f87261y).clear();
        searchResultAllViewModelRf.f87262z = "";
        searchResultAllViewModelRf.f87233A = false;
        searchResultAllViewModelRf.m1();
        super.onDestroy();
        ConnectivityMonitor.getInstance().unregister(this.f87195X0);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        SearchNestedCoordinatorLayout searchNestedCoordinatorLayout;
        ViewTreeObserver viewTreeObserver;
        super.onDestroyView();
        if (EntryPointKt.getMemleakOptEnable()) {
            u uVar = this.f87187Q;
            if (uVar != null && (searchNestedCoordinatorLayout = this.f87188R) != null && (viewTreeObserver = searchNestedCoordinatorLayout.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnDrawListener(uVar);
            }
            this.f87187Q = null;
            this.f87188R = null;
        }
        this.f87193W = null;
        C3153g c3153g = this.f87207v;
        if (c3153g != null) {
            c3153g.e();
        }
        SwipeRefreshLayout swipeRefreshLayout = this.f87192V;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.f87192V;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.destroyDrawingCache();
        }
        SwipeRefreshLayout swipeRefreshLayout3 = this.f87192V;
        if (swipeRefreshLayout3 != null) {
            swipeRefreshLayout3.clearAnimation();
        }
    }

    public final void onObscureStateChanged(boolean z6) {
        this.f87204p0 = z6;
        if (getUserVisibleHint()) {
            if (!z6) {
                if (this.f87193W != null) {
                    ag(false);
                }
            } else {
                IInlineControl iInlineControl = this.f87193W;
                if (iInlineControl != null) {
                    iInlineControl.stopPlay();
                }
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f87205r0 = true;
        p pVar = this.f87212z;
        if (pVar != null) {
            pVar.a0(true);
        }
        ag(false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.clear();
        rf().f87234B = new com.bilibili.search2.result.p(rf().N0(), rf().f87257u, rf().f87258v, rf().f87256t);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f87205r0 = false;
        p pVar = this.f87212z;
        if (pVar != null) {
            pVar.a0(false);
        }
        IInlineControl iInlineControl = this.f87193W;
        if (iInlineControl != null) {
            iInlineControl.stopPlay();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r11, @org.jetbrains.annotations.Nullable android.os.Bundle r12) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.all.SearchResultAllFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment, com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        if (z6) {
            xf(this);
        }
        Bundle arguments = getArguments();
        this.f87203c0 = z6;
        if (arguments != null) {
            Bundle bundle = arguments.getBundle("default_extra_bundle");
            if (bundle != null) {
                this.f87209w = bundle.getString("keyword");
                rf().f87249m = bundle.getString("bundle_source_type");
                this.f87171A = zO.a.h(bundle, "targetIndex", 0) == BiliMainSearchResultPage.PageTypes.PAGE_ALL.getPageType();
            }
            com.bilibili.search2.result.p pVar = rf().f87234B;
            if (pVar != null) {
                rf().f87256t = pVar.f88504d;
                rf().f87257u = pVar.f88502b;
                rf().f87258v = pVar.f88503c;
            }
            SearchResultAll searchResultAllH1 = rf().h1();
            this.f87210x = searchResultAllH1;
            if (searchResultAllH1 != null && !searchResultAllH1.isEmpty()) {
                Jf();
                SearchResultAll searchResultAll = this.f87210x;
                if ((searchResultAll != null ? searchResultAll.nav : null) != null) {
                    ArrayList<SearchResultAll.NavInfo> arrayList = searchResultAll != null ? searchResultAll.nav : null;
                    for (SearchResultAll.NavInfo navInfo : arrayList) {
                        this.f87211y.put(Integer.valueOf(navInfo.getType()), navInfo);
                    }
                }
            }
        }
        p pVar2 = this.f87212z;
        if (pVar2 != null) {
            pVar2.a0(z6);
        }
        if (z6) {
            ag(true);
        } else {
            C3153g c3153g = this.f87207v;
            if (c3153g != null) {
                c3153g.e();
            }
            IInlineControl iInlineControl = this.f87193W;
            if (iInlineControl != null) {
                iInlineControl.stopPlay();
            }
        }
        j4.t.a("isVisibleToUser:", "SearchAllVisible", z6);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final boolean sf(@NotNull q.a aVar) {
        SearchColorModel searchColorModelB;
        MutableLiveData<Integer> mutableLiveData;
        BLog.v("SearchResultAllFragment", "showEvent " + aVar.getClass());
        boolean z6 = false;
        if (aVar instanceof q.a.e) {
            AnonymousClass6 anonymousClass6 = this.f87172B;
            if (anonymousClass6 != null) {
                anonymousClass6.scrollToPositionWithOffset(0, 0);
            }
        } else if (aVar instanceof q.a.f) {
            hg(false);
        } else if (aVar instanceof q.a.b) {
            OgvThemeColorHelper ogvThemeColorHelperK2 = K2();
            if (ogvThemeColorHelperK2 != null) {
                ogvThemeColorHelperK2.a();
            }
            Nf();
            OgvThemeColorHelper ogvThemeColorHelperK22 = K2();
            if (ogvThemeColorHelperK22 != null && (searchColorModelB = ogvThemeColorHelperK22.b()) != null && (mutableLiveData = searchColorModelB.f88292b) != null) {
                mutableLiveData.setValue(0);
            }
        } else {
            if (!(aVar instanceof q.a.c)) {
                if (aVar instanceof q.a.d) {
                    if (((q.a.d) aVar).f87578b < 0) {
                        return true;
                    }
                    this.f87208v0.f88602b = true;
                }
                return z6;
            }
            final RecyclerView recyclerView = this.h;
            if (recyclerView != null) {
                com.bilibili.search2.result.base.n nVar = ((q.a.c) aVar).f87576a;
                boolean z7 = nVar.f87565d;
                int i7 = nVar.f87562a;
                if (z7) {
                    p pVar = this.f87212z;
                    if (pVar != null) {
                        pVar.notifyItemRangeChanged(i7, nVar.f87564c);
                    }
                } else {
                    final RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
                    recyclerView.setItemAnimator(null);
                    p pVar2 = this.f87212z;
                    if (pVar2 != null) {
                        pVar2.notifyItemChanged(i7, nVar.f87563b);
                    }
                    recyclerView.post(new Runnable(recyclerView, itemAnimator) { // from class: com.bilibili.search2.result.all.C

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final RecyclerView f87126a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final RecyclerView.ItemAnimator f87127b;

                        {
                            this.f87126a = recyclerView;
                            this.f87127b = itemAnimator;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            RecyclerView recyclerView2 = this.f87126a;
                            RecyclerView.ItemAnimator itemAnimator2 = this.f87127b;
                            int i8 = SearchResultAllFragment.f87170c1;
                            recyclerView2.setItemAnimator(itemAnimator2);
                        }
                    });
                }
            }
        }
        z6 = true;
        return z6;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final boolean shouldReport() {
        SearchPageStateModel searchPageStateModelV4;
        com.bilibili.search2.main.data.l<SearchPageStateModel.b> lVar;
        com.bilibili.search2.main.x xVarA = com.bilibili.search2.main.z.a(this);
        SearchPageStateModel.b value = (xVarA == null || (searchPageStateModelV4 = xVarA.V4()) == null || (lVar = searchPageStateModelV4.f86756c) == null) ? null : lVar.getValue();
        return value == null ? this.f87171A : !value.f86789a && this.f87171A;
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final int tf() {
        Context context = getContext();
        return context != null ? ((int) context.obtainStyledAttributes(new int[]{2130969563}).getDimension(0, 0.0f)) + ((int) context.getResources().getDimension(2131166961)) : ListExtentionsKt.toPx(80);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void vf() {
        Yf();
    }

    @Override // It0.a
    public final void x1() {
        View view;
        Yt0.F f7;
        C3153g c3153g = this.f87207v;
        if (c3153g != null && (f7 = c3153g.f29222j) != null) {
            ListExtentionsKt.gone(f7.f29113g.g);
            ListExtentionsKt.gone(f7.f29113g.b);
        }
        SearchExtraTabView searchExtraTabView = this.f87181K;
        if (searchExtraTabView != null && (view = searchExtraTabView.f88934e) != null) {
            searchExtraTabView.removeView(view);
        }
        SearchOgvBgConstraintLayout searchOgvBgConstraintLayout = Sf().b;
        if (searchOgvBgConstraintLayout.f88495s) {
            searchOgvBgConstraintLayout.f88495s = false;
            searchOgvBgConstraintLayout.invalidate();
        }
    }

    @Override // It0.a
    public final void xa(@ColorInt int i7, boolean z6) {
        SearchExtraTabView searchExtraTabView = this.f87181K;
        if (searchExtraTabView != null) {
            View view = searchExtraTabView.f88934e;
            if (view == null) {
                searchExtraTabView.f88934e = new View(searchExtraTabView.getContext());
            } else {
                searchExtraTabView.removeView(view);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            View view2 = searchExtraTabView.f88934e;
            if (view2 != null) {
                view2.setBackgroundColor(i7);
            }
            if (z6) {
                searchExtraTabView.addView(searchExtraTabView.f88934e, layoutParams);
            } else {
                searchExtraTabView.addView(searchExtraTabView.f88934e, 0, layoutParams);
            }
            ListExtentionsKt.gone(searchExtraTabView.f88938j);
        }
        SearchOgvBgConstraintLayout searchOgvBgConstraintLayout = Sf().b;
        searchOgvBgConstraintLayout.f88495s = true;
        searchOgvBgConstraintLayout.f88496t = z6;
        searchOgvBgConstraintLayout.f88497u.setColor(i7);
        searchOgvBgConstraintLayout.invalidate();
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void zf(List list, BaseSearchResultViewModel baseSearchResultViewModel) {
        RecyclerView recyclerView;
        View view;
        SearchResultAll searchResultAllH1;
        Integer num;
        Integer num2;
        Integer num3;
        SwipeRefreshLayout swipeRefreshLayout;
        SearchResultAllViewModel searchResultAllViewModel = (SearchResultAllViewModel) baseSearchResultViewModel;
        boolean z6 = true;
        if (list == null) {
            com.bilibili.search2.result.base.w<?> wVarMf = mf();
            wVarMf.f87275a.clear();
            wVarMf.notifyDataSetChanged();
            wVarMf.f87670d = false;
            if (searchResultAllViewModel.N0() > 0 || ((SearchState) searchResultAllViewModel.f87499f.getValue()).isTeenagersMode()) {
                return;
            }
            hg(true);
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.f87192V;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        if (((SearchState) searchResultAllViewModel.f87499f.getValue()).getRefreshTimes() == 1) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new SearchResultAllFragment$setResult$1$1(this, null), 3, (Object) null);
        }
        boolean zQf = Qf();
        SwipeRefreshLayout swipeRefreshLayout3 = this.f87192V;
        if (swipeRefreshLayout3 != null) {
            swipeRefreshLayout3.setEnabled(zQf);
        }
        if (!zQf && (swipeRefreshLayout = this.f87192V) != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        SearchResultAll searchResultAllH12 = searchResultAllViewModel.h1();
        if (searchResultAllH12 != null && searchResultAllH12.refreshFunctionOneEnable()) {
            SearchResultAll searchResultAllH13 = searchResultAllViewModel.h1();
            if ((searchResultAllH13 != null && (num3 = searchResultAllH13.refreshExp) != null && num3.intValue() == 1) || ((searchResultAllH1 = searchResultAllViewModel.h1()) != null && (num = searchResultAllH1.refreshExp) != null && num.intValue() == 2)) {
                Drawable iconDrawable = IconFont.getIconDrawable("arrow-to-top-up-line@500", getResources().getColor(R$color.Graph_bold));
                TintImageView tintImageView = this.f87178H;
                if (tintImageView != null) {
                    tintImageView.setImageDrawable(iconDrawable);
                }
            }
            SearchResultAll searchResultAllH14 = searchResultAllViewModel.h1();
            if (searchResultAllH14 != null && (num2 = searchResultAllH14.refreshExp) != null && num2.intValue() == 3) {
                Drawable iconDrawable2 = IconFont.getIconDrawable("arrow-refresh-line@500", getResources().getColor(R$color.Graph_bold));
                TintImageView tintImageView2 = this.f87178H;
                if (tintImageView2 != null) {
                    tintImageView2.setImageDrawable(iconDrawable2);
                }
            }
        }
        if (!Qf() && (view = this.f87177G) != null) {
            ViewExtKt.gone(view);
        }
        RecyclerView recyclerView2 = this.h;
        RecyclerView.ItemAnimator itemAnimator = recyclerView2 != null ? recyclerView2.getItemAnimator() : null;
        if (!((SearchState) searchResultAllViewModel.f87499f.getValue()).getEnableUpdateAnimation() && (recyclerView = this.h) != null) {
            recyclerView.setItemAnimator(null);
        }
        com.bilibili.search2.result.base.w<?> wVarMf2 = mf();
        List<BaseSearchItem> mutableList = CollectionsKt.toMutableList(list);
        boolean zQ0 = searchResultAllViewModel.Q0();
        if (searchResultAllViewModel.N0() != 1) {
            z6 = false;
        }
        wVarMf2.Y(mutableList, zQ0, z6);
        searchResultAllViewModel.f87253q.getClass();
        C6058l c6058l = C6059m.f87304b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c6058l.getClass();
        KProperty<Object> kProperty = C6058l.f87297f[4];
        c6058l.f87302e.b(jCurrentTimeMillis);
        Hf(searchResultAllViewModel);
        ag(false);
        RecyclerView recyclerView3 = this.h;
        if ((recyclerView3 != null ? recyclerView3.getItemAnimator() : null) == null) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new SearchResultAllFragment$setResult$1$2(this, itemAnimator, null), 3, (Object) null);
        }
    }
}
