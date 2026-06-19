package com.bilibili.ogv.operation.entrance;

import Dk0.b;
import Ek0.AbstractC1672k;
import Fk0.g;
import Nk0.h;
import Oj0.e;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bilibili.bangumi.logic.page.detail.service.SwitchDubbingService;
import com.bilibili.ogv.infra.legacy.exposure.IExposureReporter;
import com.bilibili.ogv.infra.legacy.exposure.d;
import com.bilibili.ogv.opbase.CommonCard;
import com.bilibili.ogv.opbase.HomeRecommendPage;
import com.bilibili.ogv.opbase.RecommendModule;
import com.bilibili.ogv.operation.entrance.MyFavorListFragment;
import com.bilibili.ogv.operation.modular.modules.homecard.HomeCardViewModel;
import com.bilibili.ogvcommon.deprecated.BangumiSwipeRefreshFragmentV3;
import com.bilibili.okretro.call.rxjava.c;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.upper.module.contribute.up.ui.collections.PublishCollectionSortActivity;
import eJ0.t;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.util.AppBuildConfig;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/MyFavorListFragment.class */
@StabilityInferred(parameters = 0)
public final class MyFavorListFragment extends BangumiSwipeRefreshFragmentV3 implements h, e, IPvTracker {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f69976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Ok0.a f69977g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f69978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f69979j;
    public int h = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f69980k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<Boolean> f69981l = io.reactivex.rxjava3.subjects.a.d(Boolean.FALSE);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/MyFavorListFragment$a.class */
    public static final class a extends Nl0.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MyFavorListFragment f69982b;

        public a(MyFavorListFragment myFavorListFragment) {
            this.f69982b = myFavorListFragment;
        }

        @Override // Nl0.e
        public final void onLastItemVisible() {
            this.f69982b.mf(true);
        }
    }

    @Override // Nk0.h
    public final void E6(@Nullable String str, @NotNull Pair<String, String>... pairArr) {
    }

    @Override // Nk0.h
    public final void R3(int i7, @Nullable String str, boolean z6, boolean z7, boolean z8) {
    }

    @Override // com.bilibili.ogv.infra.legacy.exposure.IExposureReporter
    public final void Xa(int i7, @NotNull IExposureReporter.ReporterCheckerType reporterCheckerType, @Nullable View view) {
    }

    @Override // Oj0.e
    @NotNull
    public final String getPageId() {
        return this.f69980k == 2 ? "cinema-guess-follow" : "bangumi-guess-follow";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return android.support.v4.media.a.a("pgc.", getPageId(), ".0.0.pv");
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        return new Bundle();
    }

    @Override // Nk0.h
    public final void j() {
    }

    @Override // com.bilibili.ogvcommon.deprecated.BangumiSwipeRefreshFragmentV3
    @NotNull
    public final View jf(@NotNull LayoutInflater layoutInflater, @NotNull SwipeRefreshLayout swipeRefreshLayout) {
        AbstractC1672k abstractC1672kInflate = AbstractC1672k.inflate(layoutInflater, swipeRefreshLayout, false);
        abstractC1672kInflate.q(lf());
        return abstractC1672kInflate.getRoot();
    }

    @Override // com.bilibili.ogvcommon.deprecated.BangumiSwipeRefreshFragmentV3
    @NotNull
    public final View kf(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @NotNull SwipeRefreshLayout swipeRefreshLayout) {
        d.b(this, p3(), null, null);
        View viewInflate = layoutInflater.inflate(2131499601, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(2131310508);
        final int i7 = 0;
        ((Toolbar) viewInflate.findViewById(2131304944)).setNavigationOnClickListener(new View.OnClickListener(this, i7) { // from class: Fk0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f6217a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f6218b;

            {
                this.f6217a = i7;
                this.f6218b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f6217a) {
                    case 0:
                        FragmentActivity fragmentActivityP3 = ((MyFavorListFragment) this.f6218b).p3();
                        if (fragmentActivityP3 != null) {
                            fragmentActivityP3.onBackPressed();
                        }
                        break;
                    default:
                        PublishCollectionSortActivity publishCollectionSortActivity = (PublishCollectionSortActivity) this.f6218b;
                        int i8 = PublishCollectionSortActivity.F;
                        t.a(1, "activity://uper/collection/sort/custom/", publishCollectionSortActivity);
                        break;
                }
            }
        });
        swipeRefreshLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(swipeRefreshLayout);
        return viewInflate;
    }

    @NotNull
    public final g lf() {
        g gVar = this.f69976f;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void mf(final boolean z6) {
        if (this.f69978i) {
            return;
        }
        if (this.f69979j && z6) {
            return;
        }
        if (z6) {
            this.h++;
        } else {
            this.h = 1;
        }
        int i7 = AppBuildConfig.Companion.isHDApp(requireContext()) ? 40 : 20;
        Single<HomeRecommendPage> singleGuessCinema = this.f69980k == 2 ? b.f2961a.guessCinema(this.h, i7) : b.f2961a.guessBangumi(this.h, i7);
        Functions.v vVar = Functions.a;
        final int i8 = 0;
        c.a(singleGuessCinema.subscribe(new Consumer(this, z6) { // from class: Fk0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MyFavorListFragment f6219a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f6220b;

            {
                this.f6219a = this;
                this.f6220b = z6;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final void accept(Object obj) throws NoWhenBranchMatchedException {
                List<CommonCard> listB;
                HomeRecommendPage homeRecommendPage = (HomeRecommendPage) obj;
                MyFavorListFragment myFavorListFragment = this.f6219a;
                myFavorListFragment.setRefreshCompleted();
                myFavorListFragment.f69979j = !(homeRecommendPage.f69836c != null ? r0.f69889d : true);
                myFavorListFragment.f69978i = false;
                RecommendModule recommendModule = (RecommendModule) CollectionsKt.firstOrNull(homeRecommendPage.f69834a);
                if (recommendModule == null || (listB = recommendModule.b()) == null) {
                    return;
                }
                List<CommonCard> list = listB;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (true) {
                    Ok0.a aVar = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    CommonCard commonCard = (CommonCard) it.next();
                    Ok0.a aVar2 = myFavorListFragment.f69977g;
                    if (aVar2 != null) {
                        aVar = aVar2;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("pageContext");
                    }
                    c cVar = new c(commonCard, myFavorListFragment.f69980k);
                    HomeCardViewModel homeCardViewModelB = HomeCardViewModel.a.b(HomeCardViewModel.f70642i1, commonCard, aVar, HomeCardViewModel.HomeCardType.FAVOR, null, 24);
                    cVar.f6214d = aVar.f17875d;
                    if (!Intrinsics.areEqual(homeCardViewModelB, cVar.f6213c)) {
                        cVar.f6213c = homeCardViewModelB;
                        cVar.notifyPropertyChanged(325);
                    }
                    arrayList.add(cVar);
                }
                if (this.f6220b) {
                    ((ArrayList) myFavorListFragment.lf().f6223a).addAll(arrayList);
                } else {
                    Ok0.a aVar3 = myFavorListFragment.f69977g;
                    if (aVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pageContext");
                        aVar3 = null;
                    }
                    aVar3.f17877f.clear();
                    ((ArrayList) myFavorListFragment.lf().f6223a).clear();
                    ((ArrayList) myFavorListFragment.lf().f6223a).addAll(arrayList);
                }
                myFavorListFragment.lf().notifyPropertyChanged(356);
            }
        }, new Consumer(this, i8) { // from class: Fk0.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f6221a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f6222b;

            {
                this.f6221a = i8;
                this.f6222b = this;
            }

            public final void accept(Object obj) {
                switch (this.f6221a) {
                    case 0:
                        MyFavorListFragment myFavorListFragment = (MyFavorListFragment) this.f6222b;
                        myFavorListFragment.setRefreshCompleted();
                        myFavorListFragment.f69978i = false;
                        break;
                    default:
                        SwitchDubbingService.b((SwitchDubbingService) this.f6222b, (Video.PlayableParams) obj);
                        break;
                }
            }
        }), getLifecycle());
        this.f69978i = true;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onAttach(@NotNull Context context) {
        Bundle arguments = getArguments();
        int i7 = 2;
        if (arguments != null) {
            String string = arguments.getString("uri_key");
            String str = string;
            if (string == null) {
                str = "";
            }
            if (StringsKt.Z(str, "bilibili://pgc/guess-follow/cinema")) {
                this.f69980k = 2;
            }
        }
        this.f69977g = new Ok0.a(this, getPageId(), getPageId(), new Ak0.c(context), context);
        g gVar = new g();
        String pageId = getPageId();
        if (!Intrinsics.areEqual(pageId, gVar.f6224b)) {
            gVar.f6224b = pageId;
            gVar.notifyPropertyChanged(427);
        }
        if (AppBuildConfig.Companion.isHDApp(context)) {
            i7 = 4;
        }
        gVar.f6226d = new GridLayoutManager(context, i7, 1, false);
        a aVar = new a(this);
        if (!Intrinsics.areEqual(aVar, gVar.f6225c)) {
            gVar.f6225c = aVar;
            gVar.notifyPropertyChanged(527);
        }
        this.f69976f = gVar;
        mf(false);
        super.onAttach(context);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        d.g(this, p3());
        Ok0.a aVar = this.f69977g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageContext");
            aVar = null;
        }
        aVar.f17877f.dispose();
        this.f69981l.onComplete();
    }

    @Override // com.bilibili.ogvcommon.deprecated.BangumiSwipeRefreshFragmentV3, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f69981l.onNext(Boolean.FALSE);
    }

    @Override // com.bilibili.ogvcommon.deprecated.BangumiSwipeRefreshFragmentV3
    public final void onRefresh() {
        super.onRefresh();
        SwipeRefreshLayout swipeRefreshLayout = this.f73151b;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.post(this.f73153d);
        }
        mf(false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f69981l.onNext(Boolean.TRUE);
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        PageViewTracker.getInstance().setFragmentVisibility(this, z6);
    }

    @Override // com.bilibili.ogv.infra.legacy.exposure.IExposureReporter
    public final boolean ve(int i7, @NotNull IExposureReporter.ReporterCheckerType reporterCheckerType) {
        return false;
    }

    @Override // Oj0.e
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<Boolean> x8() {
        return this.f69981l;
    }
}
