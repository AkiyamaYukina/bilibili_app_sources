package com.bilibili.ogv.operation.modular.base;

import Oj0.e;
import Pk0.g;
import Pk0.h;
import Pk0.i;
import Pk0.j;
import Pk0.k;
import Pk0.o;
import Pk0.u;
import Pk0.w;
import Pk0.z;
import Rj0.c;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.app.NotificationCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.api.BiliApiException;
import com.bilibili.api.BiliConfig;
import com.bilibili.bangumi.logic.page.detail.service.ChronosBizService;
import com.bilibili.cheese.pay.result.CheesePayGuideErrorFragment;
import com.bilibili.cheese.pay.result.CheesePayResultActivityV2;
import com.bilibili.cheese.pay.result.CheesePayShareAndJoinInfo;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.lib.fasthybrid.uimodule.widget.more.MoreView;
import com.bilibili.lib.fasthybrid.uimodule.widget.more.MoreViewAdapter;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ogv.infra.legacy.exposure.d;
import com.bilibili.ogv.opbase.CommonCard;
import com.bilibili.ogv.opbase.HomeRecommendPage;
import com.bilibili.ogv.opbase.InComing;
import com.bilibili.ogv.opbase.Intervene;
import com.bilibili.ogv.opbase.RecommendFeed;
import com.bilibili.ogv.opbase.RecommendModule;
import com.bilibili.ogv.operation.modular.HomeFlowPerformanceReporter;
import com.bilibili.ogv.operation.modular.base.BangumiBaseModularFragmentV4;
import com.google.common.base.Optional;
import com.mall.ui.page.ip.view.IPFragment;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kntr.app.mall.mall.search.viewmodel.f;
import kntr.app.tribee.invite.page.a;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tI.C;
import tv.danmaku.android.util.AppBuildConfig;
import tv.danmaku.bili.widget.PinnedBottomScrollingBehavior;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/base/BangumiBaseModularFragmentV4.class */
@StabilityInferred(parameters = 0)
public abstract class BangumiBaseModularFragmentV4 extends BaseFragment implements ThemeWatcher.Observer, e, d.g, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public RecyclerView f70306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BiliImageView f70307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public PinnedBottomScrollingBehavior f70308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f70309g;
    public View h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f70311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public w f70312k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public u f70313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f70314m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public HomeRecommendPage f70316o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<Boolean> f70304b = io.reactivex.rxjava3.subjects.a.d(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final o f70305c = new o();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f70310i = new CompositeDisposable();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f70315n = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final HomeFlowPerformanceReporter f70317p = new HomeFlowPerformanceReporter();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Mj0.b f70318q = new Mj0.b(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/base/BangumiBaseModularFragmentV4$a.class */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f70319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BangumiBaseModularFragmentV4 f70320b;

        public a(View view, BangumiBaseModularFragmentV4 bangumiBaseModularFragmentV4) {
            this.f70319a = view;
            this.f70320b = bangumiBaseModularFragmentV4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f70320b.f70317p.onEvent(HomeFlowPerformanceReporter.Event.LAYOUT_FINISH, SystemClock.elapsedRealtime());
            BangumiBaseModularFragmentV4 bangumiBaseModularFragmentV4 = this.f70320b;
            bangumiBaseModularFragmentV4.f70317p.a(HomeFlowPerformanceReporter.ResultEnum.SUCCESS, bangumiBaseModularFragmentV4.of());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/base/BangumiBaseModularFragmentV4$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f70321a;

        public b(Function1 function1) {
            this.f70321a = function1;
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
            return this.f70321a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f70321a.invoke(obj);
        }
    }

    public BangumiBaseModularFragmentV4() {
        final int i7 = 0;
        this.f70314m = LazyKt.lazy(new Function0(this, i7) { // from class: Pk0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f18952a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f18953b;

            {
                this.f18952a = i7;
                this.f18953b = this;
            }

            public final Object invoke() {
                Object obj = this.f18953b;
                switch (this.f18952a) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setColor(ThemeUtils.getColorById(((BangumiBaseModularFragmentV4) obj).getContext(), R$color.Ga2));
                        break;
                    case 1:
                        break;
                    case 2:
                        View view = ((US0.s) obj).a;
                        break;
                    case 3:
                        break;
                    case 4:
                        int i8 = MoreView.$stable;
                        break;
                    case 5:
                        ((Function0) obj).invoke();
                        break;
                    default:
                        ((kntr.app.mall.mall.search.viewmodel.j) obj).c(f.b.a);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }

    public final void g2() {
        final u uVar;
        Long l7;
        if (kf().f19023j[0].intValue() == 2 || (uVar = this.f70313l) == null) {
            return;
        }
        Single<HomeRecommendPage> singleLf = lf();
        final Context contextRequireContext = requireContext();
        MutableLiveData<Integer> mutableLiveData = uVar.f19008r;
        if (!uVar.f19001k && StringsKt.isBlank(uVar.f18994c)) {
            mutableLiveData.setValue(2);
            return;
        }
        if (uVar.f19002l) {
            return;
        }
        String str = uVar.f18994c;
        boolean zAreEqual = Intrinsics.areEqual(str, "");
        com.bilibili.okretro.call.rxjava.b bVar = uVar.f19009s;
        if (zAreEqual) {
            if (singleLf != null) {
                Functions.v vVar = Functions.a;
                final int i7 = 0;
                Disposable disposableSubscribe = singleLf.subscribe(new Consumer(uVar, i7) { // from class: Pk0.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f18983a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f18984b;

                    {
                        this.f18983a = i7;
                        this.f18984b = uVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:72:0x0262  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void accept(java.lang.Object r6) {
                        /*
                            Method dump skipped, instruction units count: 719
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: Pk0.q.accept(java.lang.Object):void");
                    }
                }, new Consumer(uVar, contextRequireContext) { // from class: Pk0.r

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final u f18985a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Context f18986b;

                    {
                        this.f18985a = uVar;
                        this.f18986b = contextRequireContext;
                    }

                    public final void accept(Object obj) {
                        Context context = this.f18986b;
                        u uVar2 = this.f18985a;
                        uVar2.f19008r.setValue(1);
                        Ul0.d.a(2131832163, context);
                        uVar2.f19002l = false;
                    }
                });
                if (disposableSubscribe != null) {
                    bVar.a(disposableSubscribe);
                }
            }
            uVar.f19002l = true;
            return;
        }
        if (!Intrinsics.areEqual(str, "fall_region")) {
            mutableLiveData.setValue(2);
            return;
        }
        if (uVar.f18998g == null) {
            mutableLiveData.setValue(2);
            return;
        }
        mutableLiveData.setValue(0);
        List<Long> list = uVar.f18998g;
        Single map = Dk0.b.f2962b.getDynamicList((list == null || (l7 = (Long) CollectionsKt.getOrNull(list, 0)) == null) ? -1L : l7.longValue(), BiliConfig.getChannel(), uVar.h, uVar.f18997f).map(Dk0.a.f2960a);
        Functions.v vVar2 = Functions.a;
        final int i8 = 0;
        bVar.a(map.subscribe(new Dx0.a(uVar), new Consumer(uVar, i8) { // from class: Pk0.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f18981a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f18982b;

            {
                this.f18981a = i8;
                this.f18982b = uVar;
            }

            public final void accept(Object obj) {
                switch (this.f18981a) {
                    case 0:
                        u uVar2 = (u) this.f18982b;
                        uVar2.f19008r.setValue(1);
                        uVar2.f19002l = false;
                        break;
                    default:
                        ChronosBizService.a((ChronosBizService) this.f18982b, (Pair) obj);
                        break;
                }
            }
        }));
        uVar.f19002l = true;
        uVar.h = false;
    }

    @NotNull
    public abstract String getPageName();

    public boolean jf() {
        return false;
    }

    @NotNull
    public final w kf() {
        w wVar = this.f70312k;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @Nullable
    public Single<HomeRecommendPage> lf() {
        return null;
    }

    @NotNull
    public abstract Single<HomeRecommendPage> mf();

    @NotNull
    public Map<String, String> nf() {
        return MapsKt.emptyMap();
    }

    @NotNull
    public abstract String of();

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        u uVar = (u) new ViewModelProvider(this).get(u.class);
        this.f70313l = uVar;
        io.reactivex.rxjava3.subjects.a<Optional<List<Pair<Object, Integer>>>> aVar = uVar.f19004n;
        Lifecycle lifecycle = getLifecycle();
        Lifecycle.State state = c.f20909a;
        Rj0.b bVar = new Rj0.b(aVar, lifecycle, state);
        Functions.D d7 = Functions.f;
        Functions.o oVar = Functions.c;
        bVar.subscribe(new Consumer(this) { // from class: Pk0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiBaseModularFragmentV4 f18954a;

            {
                this.f18954a = this;
            }

            public final void accept(Object obj) {
                List list = (List) ((Optional) obj).orNull();
                BangumiBaseModularFragmentV4 bangumiBaseModularFragmentV4 = this.f18954a;
                o oVar2 = bangumiBaseModularFragmentV4.f70305c;
                SwipeRefreshLayout swipeRefreshLayout = oVar2.f18976b;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.removeCallbacks(oVar2.f18979e);
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - oVar2.f18977c;
                    n nVar = oVar2.f18980f;
                    if (0 > jElapsedRealtime || jElapsedRealtime >= 500) {
                        SwipeRefreshLayout swipeRefreshLayout2 = oVar2.f18976b;
                        if (swipeRefreshLayout2 != null) {
                            swipeRefreshLayout2.post(nVar);
                        }
                    } else {
                        SwipeRefreshLayout swipeRefreshLayout3 = oVar2.f18976b;
                        if (swipeRefreshLayout3 != null) {
                            swipeRefreshLayout3.postDelayed(nVar, 500 - jElapsedRealtime);
                        }
                    }
                }
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    ComposeView composeView = bangumiBaseModularFragmentV4.f70305c.f18975a;
                    if (composeView != null) {
                        composeView.setVisibility(8);
                    }
                    bangumiBaseModularFragmentV4.kf().O(Boolean.FALSE, list);
                    RecyclerView recyclerView = bangumiBaseModularFragmentV4.f70306d;
                    if (recyclerView != null) {
                        OneShotPreDrawListener.add(recyclerView, new BangumiBaseModularFragmentV4.a(recyclerView, bangumiBaseModularFragmentV4));
                    }
                    bangumiBaseModularFragmentV4.rf();
                    return;
                }
                if (bangumiBaseModularFragmentV4.kf().getItemCount() <= 0) {
                    if (list == null) {
                        o oVar3 = bangumiBaseModularFragmentV4.f70305c;
                        ComposeView composeView2 = oVar3.f18975a;
                        if (composeView2 != null) {
                            Tl0.f.b(composeView2, new K9.d(oVar3, 1));
                        }
                    } else {
                        final o oVar4 = bangumiBaseModularFragmentV4.f70305c;
                        ComposeView composeView3 = oVar4.f18975a;
                        if (composeView3 != null) {
                            final int i7 = 0;
                            Function0 function0 = new Function0(oVar4, i7) { // from class: Pk0.l

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final int f18971a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Object f18972b;

                                {
                                    this.f18971a = i7;
                                    this.f18972b = oVar4;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
                                /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object invoke() {
                                    /*
                                        Method dump skipped, instruction units count: 602
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: Pk0.l.invoke():java.lang.Object");
                                }
                            };
                            composeView3.setVisibility(0);
                            composeView3.setContent(ComposableLambdaKt.composableLambdaInstance(-89638534, true, new Tl0.e(function0, 0)));
                        }
                    }
                }
                bangumiBaseModularFragmentV4.f70317p.a(HomeFlowPerformanceReporter.ResultEnum.FAIL, bangumiBaseModularFragmentV4.of());
            }
        }, d7, oVar);
        new Rj0.b(this.f70313l.f19005o, getLifecycle(), state).subscribe(new Consumer(this) { // from class: Pk0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiBaseModularFragmentV4 f18955a;

            {
                this.f18955a = this;
            }

            public final void accept(Object obj) {
                o oVar2;
                ComposeView composeView;
                List list = (List) ((Optional) obj).orNull();
                BangumiBaseModularFragmentV4 bangumiBaseModularFragmentV4 = this.f18955a;
                if (list != null) {
                    bangumiBaseModularFragmentV4.kf().O(Boolean.TRUE, list);
                } else {
                    if (bangumiBaseModularFragmentV4.kf().getItemCount() > 0 || (composeView = (oVar2 = bangumiBaseModularFragmentV4.f70305c).f18975a) == null) {
                        return;
                    }
                    Tl0.f.b(composeView, new K9.d(oVar2, 1));
                }
            }
        }, d7, oVar);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499608, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f70304b.onComplete();
        super.onDestroy();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView recyclerView = this.f70306d;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehavior = this.f70308f;
        if (pinnedBottomScrollingBehavior != null) {
            View view = this.f70307e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityPendantView");
                view = null;
            }
            pinnedBottomScrollingBehavior.removePinnedView(view);
        }
        this.f70310i.clear();
        d.g(this, p3());
        if (EntryPointKt.getMemleakOptEnable()) {
            this.f70306d = null;
            this.f70316o = null;
            if (this.f70312k != null) {
                kf().f19016b = null;
            }
        }
        super.onDestroyView();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        o oVar = this.f70305c;
        SwipeRefreshLayout swipeRefreshLayout = oVar.f18976b;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = oVar.f18976b;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.destroyDrawingCache();
        }
        SwipeRefreshLayout swipeRefreshLayout3 = oVar.f18976b;
        if (swipeRefreshLayout3 != null) {
            swipeRefreshLayout3.clearAnimation();
        }
        if (this.f70312k != null) {
            z zVar = kf().f19021g;
            zVar.f19034e = false;
            zVar.a();
        }
    }

    public final void onRefresh() {
        if (!StringsKt.isBlank(of())) {
            Neurons.reportClick(false, android.support.v4.media.a.a("pgc.", of(), ".refresh-pull.0.click"), nf());
        }
        o oVar = this.f70305c;
        oVar.getClass();
        oVar.f18977c = SystemClock.elapsedRealtime();
        refresh();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f70312k != null) {
            z zVar = kf().f19021g;
            zVar.f19034e = true;
            zVar.a();
        }
    }

    @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
    public final void onThemeChanged() {
        kf().notifyDataSetChanged();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<HomeRecommendPage> mutableLiveData2;
        MutableLiveData<String> mutableLiveData3;
        super.onViewCreated(view, bundle);
        this.f70306d = (RecyclerView) view.findViewById(2131306580);
        this.f70307e = view.findViewById(2131296431);
        this.f70309g = view.findViewById(2131316345);
        this.h = view.findViewById(2131315638);
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehaviorA = Ll0.a.a(view);
        this.f70308f = pinnedBottomScrollingBehaviorA;
        if (pinnedBottomScrollingBehaviorA != null) {
            View view2 = this.f70307e;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityPendantView");
                view2 = null;
            }
            pinnedBottomScrollingBehaviorA.addPinnedView(view2);
        }
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehavior = this.f70308f;
        if (pinnedBottomScrollingBehavior != null) {
            View view3 = this.f70309g;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vipPendantView");
                view3 = null;
            }
            pinnedBottomScrollingBehavior.addPinnedView(view3);
        }
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehavior2 = this.f70308f;
        if (pinnedBottomScrollingBehavior2 != null) {
            View view4 = this.h;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ugcGuideView");
                view4 = null;
            }
            pinnedBottomScrollingBehavior2.addPinnedView(view4);
        }
        o oVar = this.f70305c;
        ComposeView composeView = (ComposeView) view.findViewById(2131305144);
        SwipeRefreshLayout swipeRefreshLayoutFindViewById = view.findViewById(2131303590);
        oVar.f18975a = composeView;
        if (composeView != null) {
            ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            FrameLayout.LayoutParams layoutParams3 = null;
            if (layoutParams2 != null) {
                layoutParams2.topMargin = 0;
                layoutParams3 = layoutParams2;
            }
            composeView.setLayoutParams(layoutParams3);
        }
        oVar.f18976b = swipeRefreshLayoutFindViewById;
        if (swipeRefreshLayoutFindViewById != null) {
            swipeRefreshLayoutFindViewById.setEnabled(true);
        }
        if (swipeRefreshLayoutFindViewById != null) {
            swipeRefreshLayoutFindViewById.setLegacyRequestDisallowInterceptTouchEventEnabled(false);
        }
        if (swipeRefreshLayoutFindViewById != null) {
            swipeRefreshLayoutFindViewById.setColorSchemeResources(new int[]{R$color.Pi5});
        }
        if (swipeRefreshLayoutFindViewById != null) {
            swipeRefreshLayoutFindViewById.setOnRefreshListener(this);
        }
        oVar.f18978d = this;
        u uVar = this.f70313l;
        if (uVar != null) {
            String pageName = getPageName();
            String strOf = of();
            uVar.f18999i = pageName;
            uVar.f19000j = strOf;
        }
        u uVar2 = this.f70313l;
        if (uVar2 != null && (mutableLiveData3 = uVar2.f19007q) != null) {
            mutableLiveData3.observe(getViewLifecycleOwner(), new b(new Pk0.d(this, 0)));
        }
        u uVar3 = this.f70313l;
        if (uVar3 != null && (mutableLiveData2 = uVar3.f19006p) != null) {
            final int i7 = 0;
            mutableLiveData2.observe(getViewLifecycleOwner(), new b(new Function1(this, i7) { // from class: Pk0.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f18958a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f18959b;

                {
                    this.f18958a = i7;
                    this.f18959b = this;
                }

                public final Object invoke(Object obj) {
                    boolean z6 = true;
                    Object obj2 = this.f18959b;
                    switch (this.f18958a) {
                        case 0:
                            ((BangumiBaseModularFragmentV4) obj2).f70316o = (HomeRecommendPage) obj;
                            return Unit.INSTANCE;
                        case 1:
                            com.bilibili.bililive.room.ui.official.h hVar = (com.bilibili.bililive.room.ui.official.h) obj2;
                            if (((com.bilibili.bililive.room.ui.roomv3.base.viewmodel.f) hVar).a.a()) {
                                hVar.J9(new C());
                            }
                            return Unit.INSTANCE;
                        case 2:
                            CheesePayShareAndJoinInfo cheesePayShareAndJoinInfo = (CheesePayShareAndJoinInfo) obj;
                            int i8 = CheesePayResultActivityV2.V;
                            CheesePayResultActivityV2 cheesePayResultActivityV2 = (CheesePayResultActivityV2) obj2;
                            cheesePayResultActivityV2.getClass();
                            if (cheesePayShareAndJoinInfo == null) {
                                String strConcat = "cheese:".concat(CheesePayGuideErrorFragment.class.getName());
                                Fragment fragmentFindFragmentByTag = cheesePayResultActivityV2.P6().findFragmentByTag(strConcat);
                                cheesePayResultActivityV2.N = fragmentFindFragmentByTag;
                                if (fragmentFindFragmentByTag == null) {
                                    cheesePayResultActivityV2.N = cheesePayResultActivityV2.P6().getFragmentFactory().instantiate(cheesePayResultActivityV2.getClassLoader(), CheesePayGuideErrorFragment.class.getName());
                                }
                                Fragment fragment = cheesePayResultActivityV2.N;
                                if (fragment != null) {
                                    cheesePayResultActivityV2.R6(fragment, strConcat);
                                }
                                TextView textView = cheesePayResultActivityV2.B;
                                if (textView == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("tvAction");
                                    textView = null;
                                }
                                textView.setVisibility(8);
                            } else {
                                Integer seasonTag = cheesePayShareAndJoinInfo.getSeasonTag();
                                if (seasonTag != null && seasonTag.intValue() == 5) {
                                    TextView textView2 = cheesePayResultActivityV2.G;
                                    TextView textView3 = textView2;
                                    if (textView2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mTitle");
                                        textView3 = null;
                                    }
                                    textView3.setText(cheesePayResultActivityV2.getString(2131848781));
                                    TextView textView4 = cheesePayResultActivityV2.H;
                                    TextView textView5 = textView4;
                                    if (textView4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mSubtitle");
                                        textView5 = null;
                                    }
                                    textView5.setText(cheesePayResultActivityV2.getString(2131848781));
                                } else {
                                    TextView textView6 = cheesePayResultActivityV2.G;
                                    TextView textView7 = textView6;
                                    if (textView6 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mTitle");
                                        textView7 = null;
                                    }
                                    textView7.setText(cheesePayResultActivityV2.getString(2131848739));
                                    TextView textView8 = cheesePayResultActivityV2.H;
                                    TextView textView9 = textView8;
                                    if (textView8 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mSubtitle");
                                        textView9 = null;
                                    }
                                    textView9.setText(cheesePayResultActivityV2.getString(2131838608));
                                }
                                TextView textView10 = cheesePayResultActivityV2.D;
                                TextView textView11 = textView10;
                                if (textView10 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mClassTitleName");
                                    textView11 = null;
                                }
                                textView11.setText(cheesePayShareAndJoinInfo.getTitle());
                                if (cheesePayShareAndJoinInfo.isAutoFollow()) {
                                    View view5 = cheesePayResultActivityV2.J;
                                    if (view5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mFollowTips");
                                        view5 = null;
                                    }
                                    view5.setVisibility(0);
                                    Neurons.reportExposure$default(false, "pugv.buy-success.auto-follow.cancel.show", MapsKt.mapOf(TuplesKt.to("ssid", cheesePayShareAndJoinInfo.getSeasonId())), (List) null, 8, (Object) null);
                                    cheesePayResultActivityV2.R = true;
                                }
                                CheesePayShareAndJoinInfo.CommunityInfo communityInfo = cheesePayShareAndJoinInfo.getCommunityInfo();
                                if (communityInfo == null || !communityInfo.getContains()) {
                                    cheesePayResultActivityV2.T6();
                                } else {
                                    cheesePayResultActivityV2.S6();
                                }
                            }
                            return Unit.INSTANCE;
                        case 3:
                            ((Integer) obj).intValue();
                            A80.k kVar = ((MoreViewAdapter) obj2).c;
                            if (kVar != null) {
                                kVar.d(V7.e.b("type", "gameFollow", NotificationCompat.CATEGORY_EVENT, "followedFromMenu"), "");
                            }
                            return Unit.INSTANCE;
                        case 4:
                            ((IPFragment) obj2).Af((String) null, (String) obj, false);
                            return Unit.INSTANCE;
                        default:
                            a.c cVar = (kntr.app.tribee.invite.page.a) obj;
                            if (!(cVar instanceof a.c) || cVar.b != ((a.c) obj2).b) {
                                z6 = false;
                            }
                            return Boolean.valueOf(z6);
                    }
                }
            }));
        }
        u uVar4 = this.f70313l;
        if (uVar4 != null && (mutableLiveData = uVar4.f19008r) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new b(new Pk0.f(this, 0)));
        }
        qf();
    }

    @NotNull
    public abstract w pf();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView$LayoutManager, com.bilibili.ogv.operation.legacy.OverScrollGridLayoutManager] */
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
    public void qf() {
        if (this.f70306d == null) {
            return;
        }
        if (this.f70312k == null) {
            this.f70312k = pf();
        } else {
            kf().getClass();
        }
        w wVarKf = kf();
        boolean zAreEqual = Intrinsics.areEqual(this.f70304b.e(), Boolean.TRUE);
        z zVar = wVarKf.f19021g;
        zVar.f19033d = zAreEqual;
        zVar.a();
        w wVarKf2 = kf();
        boolean z6 = getLifecycle().getCurrentState().compareTo(Lifecycle.State.RESUMED) >= 0;
        z zVar2 = wVarKf2.f19021g;
        zVar2.f19034e = z6;
        zVar2.a();
        d.b(this, p3(), this.f70306d, this);
        RecyclerView recyclerView = this.f70306d;
        if (recyclerView != null) {
            recyclerView.setBackgroundColor(ThemeUtils.getColorById(getContext(), R$color.f64616Wh0));
        }
        RecyclerView recyclerView2 = this.f70306d;
        if (recyclerView2 != 0) {
            int i7 = AppBuildConfig.Companion.isHDApp(recyclerView2.getContext()) ? 12 : 6;
            ?? gridLayoutManager = new GridLayoutManager(recyclerView2.getContext(), i7);
            recyclerView2.setLayoutManager(gridLayoutManager);
            gridLayoutManager.setSpanSizeLookup(new h(i7, recyclerView2));
            Context context = recyclerView2.getContext();
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = getResources().getDimensionPixelSize(2131166072);
            recyclerView2.addItemDecoration(new k(gridLayoutManager, context, intRef));
            kf().setHasStableIds(true);
            recyclerView2.setAdapter(kf());
            int i8 = this.f70311j;
            if (i8 <= 0) {
                recyclerView2.addOnScrollListener(new i(this));
                return;
            }
            j jVar = new j(this, i8);
            recyclerView2.addOnScrollListener(jVar);
            gridLayoutManager.f70296a = jVar;
        }
    }

    @CallSuper
    public final void refresh() {
        if (getContext() == null) {
            return;
        }
        o oVar = this.f70305c;
        boolean z6 = kf().getItemCount() <= 0;
        SwipeRefreshLayout swipeRefreshLayout = oVar.f18976b;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.post(oVar.f18979e);
            if (z6) {
                ComposeView composeView = oVar.f18975a;
                if (composeView != null) {
                    Tl0.f.a(composeView);
                }
            } else {
                ComposeView composeView2 = oVar.f18975a;
                if (composeView2 != null) {
                    composeView2.setVisibility(8);
                }
            }
        }
        kf().P(0);
        Disposable disposable = kf().f19021g.f19030a;
        if (disposable != null) {
            disposable.dispose();
        }
        HomeFlowPerformanceReporter homeFlowPerformanceReporter = this.f70317p;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (homeFlowPerformanceReporter.f70297a) {
            homeFlowPerformanceReporter.f70301e = jElapsedRealtime;
            homeFlowPerformanceReporter.f70299c = true;
            homeFlowPerformanceReporter.f70298b.clear();
            Unit unit = Unit.INSTANCE;
        }
        this.f70317p.onEvent(HomeFlowPerformanceReporter.Event.DATA_REQUEST, SystemClock.elapsedRealtime());
        final u uVar = this.f70313l;
        if (uVar != null) {
            Single<HomeRecommendPage> singleMf = mf();
            final Context contextRequireContext = requireContext();
            final HomeFlowPerformanceReporter homeFlowPerformanceReporter2 = this.f70317p;
            final g gVar = new g(this, 0);
            com.bilibili.okretro.call.rxjava.b bVar = uVar.f19009s;
            bVar.b();
            bVar.f73432b = true;
            uVar.f19001k = false;
            uVar.f19002l = false;
            Functions.v vVar = Functions.a;
            bVar.a(singleMf.subscribe(new Consumer(uVar, homeFlowPerformanceReporter2, gVar) { // from class: Pk0.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final u f18987a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final HomeFlowPerformanceReporter f18988b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final g f18989c;

                {
                    this.f18987a = uVar;
                    this.f18988b = homeFlowPerformanceReporter2;
                    this.f18989c = gVar;
                }

                public final void accept(Object obj) {
                    List<CommonCard> listB;
                    HomeRecommendPage homeRecommendPage = (HomeRecommendPage) obj;
                    u uVar2 = this.f18987a;
                    uVar2.h = true;
                    uVar2.f18996e = 1;
                    uVar2.f18993b = "";
                    uVar2.f18994c = "";
                    uVar2.f18998g = null;
                    uVar2.f18997f = 0L;
                    HomeFlowPerformanceReporter homeFlowPerformanceReporter3 = this.f18988b;
                    if (homeFlowPerformanceReporter3 != null) {
                        homeFlowPerformanceReporter3.onEvent(HomeFlowPerformanceReporter.Event.DATA_LOADED, SystemClock.elapsedRealtime());
                    }
                    MutableLiveData<HomeRecommendPage> mutableLiveData = uVar2.f19006p;
                    mutableLiveData.setValue(homeRecommendPage);
                    for (RecommendModule recommendModule : homeRecommendPage.f69834a) {
                        if (Intrinsics.areEqual(recommendModule.f69903d, "banner_v3")) {
                            for (Intervene intervene : recommendModule.f69896F) {
                                for (CommonCard commonCard : recommendModule.b()) {
                                    if (Intrinsics.areEqual(commonCard.g().getValue(), intervene.f69855c)) {
                                        commonCard.f69731S0 = intervene.f69853a;
                                    }
                                }
                            }
                        }
                    }
                    InComing inComingB = homeRecommendPage.b();
                    if (inComingB != null && inComingB.f69848d == 2) {
                        Iterator<T> it = homeRecommendPage.f69834a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            RecommendModule recommendModule2 = (RecommendModule) it.next();
                            if (Intrinsics.areEqual(recommendModule2.f69915q, inComingB.f69850f)) {
                                loop4: for (CommonCard commonCard2 : recommendModule2.b()) {
                                    if (((Boolean) this.f18989c.invoke()).booleanValue()) {
                                        long j7 = commonCard2.f69702E;
                                        long j8 = inComingB.f69851g;
                                        if (j7 != j8) {
                                            RecommendModule recommendModule3 = commonCard2.f69731S0;
                                            if (recommendModule3 != null && (listB = recommendModule3.b()) != null) {
                                                List<CommonCard> list = listB;
                                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                                    Iterator<T> it2 = list.iterator();
                                                    while (it2.hasNext()) {
                                                        if (((CommonCard) it2.next()).f69702E == j8) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        commonCard2.f69719M0 = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    boolean z7 = homeRecommendPage.f69839f;
                    uVar2.f19001k = z7;
                    uVar2.f19007q.setValue(z7 ? homeRecommendPage.f69840g : "");
                    mutableLiveData.setValue(homeRecommendPage);
                    uVar2.f19004n.onNext(Optional.fromNullable(uVar2.L0(homeRecommendPage, false)));
                    RecommendFeed recommendFeed = homeRecommendPage.f69836c;
                    if (recommendFeed != null) {
                        uVar2.f18996e = 0;
                        uVar2.f18993b = "";
                        String str = recommendFeed.f69886a;
                        String str2 = str;
                        if (str == null) {
                            str2 = "";
                        }
                        uVar2.f18994c = str2;
                        uVar2.f18995d = "";
                        uVar2.f18998g = recommendFeed.a();
                        HashMap<String, Long> map = Ak0.e.f328a;
                        Ak0.e.f328a.put(B0.a.a(uVar2.f18999i, "_", uVar2.f19000j), Long.valueOf(recommendFeed.f69887b));
                    }
                }
            }, new Consumer(uVar, contextRequireContext) { // from class: Pk0.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final u f18990a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Context f18991b;

                {
                    this.f18990a = uVar;
                    this.f18991b = contextRequireContext;
                }

                public final void accept(Object obj) {
                    Context context = this.f18991b;
                    Throwable th = (Throwable) obj;
                    u uVar2 = this.f18990a;
                    uVar2.f19001k = false;
                    uVar2.f19006p.setValue(null);
                    boolean z7 = th instanceof BiliApiException;
                    io.reactivex.rxjava3.subjects.a<Optional<List<Pair<Object, Integer>>>> aVar = uVar2.f19004n;
                    if (z7) {
                        aVar.onNext(Optional.of(CollectionsKt.emptyList()));
                        Ul0.d.a(2131832164, context);
                    } else {
                        aVar.onNext(Optional.absent());
                        Ul0.d.a(2131824092, context);
                        th.printStackTrace();
                    }
                }
            }));
        }
    }

    public void rf() {
    }

    @Override // com.bilibili.ogv.infra.legacy.exposure.d.g
    public final void scrolling() {
        GAdCoreKt.getGAdReport().scrolling();
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    public void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        if (this.f70312k != null) {
            z zVar = kf().f19021g;
            zVar.f19033d = z6;
            zVar.a();
        }
        this.f70304b.onNext(Boolean.valueOf(z6));
        Mj0.b bVar = this.f70318q;
        bVar.getClass();
        Lifecycle.State state = z6 ? Lifecycle.State.RESUMED : Lifecycle.State.STARTED;
        bVar.f16200c = state;
        bVar.f16198a.setCurrentState((Lifecycle.State) ComparisonsKt.minOf(bVar.f16199b, state));
    }

    @Override // Oj0.e
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<Boolean> x8() {
        return this.f70304b;
    }
}
