package com.bilibili.lib.ui.swiperefresh;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.DrawableRes;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.mall.data.page.home.bean.HomeTabCountBean;
import com.mall.data.page.home.bean.HomeTabCountVoBean;
import com.mall.ui.page.home.menu.HomeMenuTabService;
import gQ0.f;
import gQ0.i;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import sS0.c;
import sS0.h;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.LoadingImageView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/swiperefresh/BaseSwipeRecyclerToolbarFragment.class */
public abstract class BaseSwipeRecyclerToolbarFragment extends BaseToolbarFragment implements SwipeRefreshLayout.OnRefreshListener {
    private long lastRefreshStartTime;
    protected LoadingImageView loadingView;
    protected RecyclerView recyclerView;

    @NotNull
    private Runnable refreshCompleted;

    @NotNull
    private Runnable refreshStart = new Runnable(this) { // from class: com.bilibili.lib.ui.swiperefresh.a

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseSwipeRecyclerToolbarFragment f64927a;

        {
            this.f64927a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSwipeRecyclerToolbarFragment.refreshStart$lambda$0(this.f64927a);
        }
    };
    protected SwipeRefreshLayout swipeRefreshLayout;

    public BaseSwipeRecyclerToolbarFragment() {
        final int i7 = 0;
        this.refreshCompleted = new Runnable(this, i7) { // from class: com.bilibili.lib.ui.swiperefresh.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f64928a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f64929b;

            {
                this.f64928a = i7;
                this.f64929b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                HomeTabCountBean homeTabCountBean;
                HomeTabCountBean homeTabCountBean2;
                BiliCall biliCallLoadHomeTabCount;
                switch (this.f64928a) {
                    case 0:
                        BaseSwipeRecyclerToolbarFragment.refreshCompleted$lambda$0((BaseSwipeRecyclerToolbarFragment) this.f64929b);
                        break;
                    default:
                        sS0.c cVar = (sS0.c) this.f64929b;
                        cVar.getClass();
                        if (f.d("MALL_HOME_TAB_INTERNAL_MID_KEY", 0L) != com.bilibili.adcommon.utils.a.a()) {
                            f.i("MALL_HOME_TAB_INTERNAL_MID_KEY", BiliAccounts.get(BiliContext.application()).mid());
                            sS0.c.a(true);
                        }
                        cVar.c();
                        boolean zB = cVar.b();
                        Lazy lazy = sS0.c.f;
                        if (!zB) {
                            cVar.d = true;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("notifyReadTime", Long.valueOf(f.d("mall_menu_notify_read_timestamp", 0L)));
                            try {
                                biliCallLoadHomeTabCount = ((HomeMenuTabService) cVar.a.getValue()).loadHomeTabCount(i.a(jSONObject));
                            } catch (Exception e7) {
                                BLog.e(e7.toString());
                            }
                            Response responseExecute = biliCallLoadHomeTabCount != null ? biliCallLoadHomeTabCount.execute() : null;
                            h hVarB = c.a.b();
                            h hVar = hVarB;
                            if (responseExecute != null) {
                                hVar = hVarB;
                                if (responseExecute.isSuccessful()) {
                                    hVar = hVarB;
                                    if (responseExecute.body() != null) {
                                        GeneralResponse generalResponse = (GeneralResponse) responseExecute.body();
                                        hVar = hVarB;
                                        if (generalResponse != null) {
                                            hVar = hVarB;
                                            if (generalResponse.code == 0) {
                                                HomeTabCountVoBean homeTabCountVoBean = (HomeTabCountVoBean) generalResponse.data;
                                                hVar = hVarB;
                                                if ((homeTabCountVoBean != null ? homeTabCountVoBean.vo : null) != null) {
                                                    Integer numValueOf = (homeTabCountVoBean == null || (homeTabCountBean2 = homeTabCountVoBean.vo) == null) ? null : Integer.valueOf(homeTabCountBean2.getCount());
                                                    t10.a aVarC = t10.a.c(numValueOf != null ? RangesKt.coerceAtLeast(numValueOf.intValue(), 0) : 0);
                                                    HomeTabCountVoBean homeTabCountVoBean2 = (HomeTabCountVoBean) generalResponse.data;
                                                    Boolean boolValueOf = null;
                                                    if (homeTabCountVoBean2 != null) {
                                                        HomeTabCountBean homeTabCountBean3 = homeTabCountVoBean2.vo;
                                                        boolValueOf = null;
                                                        if (homeTabCountBean3 != null) {
                                                            boolValueOf = Boolean.valueOf(homeTabCountBean3.isRedPoint());
                                                        }
                                                    }
                                                    h hVar2 = new h(aVarC, boolValueOf != null ? boolValueOf.booleanValue() : false);
                                                    HomeTabCountVoBean homeTabCountVoBean3 = (HomeTabCountVoBean) generalResponse.data;
                                                    long internal = (homeTabCountVoBean3 == null || (homeTabCountBean = homeTabCountVoBean3.vo) == null) ? 0L : homeTabCountBean.getInternal();
                                                    cVar.b = internal;
                                                    f.i("MALL_HOME_TAB_QUERY_INTERNAL_KEY", internal);
                                                    f.i("MALL_HOME_TAB_UN_READ_COUNT_KEY", numValueOf != null ? numValueOf.intValue() : 0L);
                                                    f.g("MALL_HOME_MENU_NOTICE_RED_DOT_KEY", boolValueOf != null ? boolValueOf.booleanValue() : false);
                                                    hVar = hVar2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            cVar.d = false;
                            cVar.e = hVar;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            cVar.c = jElapsedRealtime;
                            f.i("MALL_HOME_TAB_LAST_REQUEST_TIME", jElapsedRealtime);
                        } else if (cVar.e == null) {
                            cVar.e = c.a.b();
                        }
                        cVar.g();
                        break;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshCompleted$lambda$0(BaseSwipeRecyclerToolbarFragment baseSwipeRecyclerToolbarFragment) {
        baseSwipeRecyclerToolbarFragment.getSwipeRefreshLayout().setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshStart$lambda$0(BaseSwipeRecyclerToolbarFragment baseSwipeRecyclerToolbarFragment) {
        baseSwipeRecyclerToolbarFragment.getSwipeRefreshLayout().setRefreshing(true);
        baseSwipeRecyclerToolbarFragment.lastRefreshStartTime = SystemClock.elapsedRealtime();
    }

    @NotNull
    public final LoadingImageView addLoadingView(@NotNull FrameLayout frameLayout) {
        LoadingImageView loadingImageView = new LoadingImageView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        loadingImageView.setLayoutParams(layoutParams);
        loadingImageView.setVisibility(8);
        frameLayout.addView(loadingImageView);
        return loadingImageView;
    }

    @NotNull
    public final LoadingImageView getLoadingView() {
        LoadingImageView loadingImageView = this.loadingView;
        if (loadingImageView != null) {
            return loadingImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loadingView");
        return null;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        return null;
    }

    @NotNull
    public final SwipeRefreshLayout getSwipeRefreshLayout() {
        SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            return swipeRefreshLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
        return null;
    }

    public final void hideErrorTips() {
        getLoadingView().setVisibility(8);
        getLoadingView().hideRefreshError();
    }

    public final void hideLoading() {
        getLoadingView().setRefreshComplete();
        getLoadingView().setVisibility(8);
    }

    public final void hideSwipeRefreshLayout() {
        getSwipeRefreshLayout().setEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131494799, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(2131312767);
        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.setColorSchemeResources(2131103284);
        setSwipeRefreshLayout(swipeRefreshLayout);
        setRecyclerView((RecyclerView) viewInflate.findViewById(2131306580));
        setLoadingView(addLoadingView((FrameLayout) viewInflate.findViewById(2131301985)));
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getSwipeRefreshLayout().setRefreshing(false);
        getSwipeRefreshLayout().destroyDrawingCache();
        getSwipeRefreshLayout().clearAnimation();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        this.lastRefreshStartTime = SystemClock.elapsedRealtime();
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        onViewCreated(getRecyclerView(), bundle);
    }

    public void onViewCreated(@NotNull RecyclerView recyclerView, @Nullable Bundle bundle) {
    }

    public final void setLoadingView(@NotNull LoadingImageView loadingImageView) {
        this.loadingView = loadingImageView;
    }

    public final void setRecyclerView(@NotNull RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public final void setRefreshCompleted() {
        getSwipeRefreshLayout().removeCallbacks(this.refreshStart);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.lastRefreshStartTime;
        if (0 > jElapsedRealtime || jElapsedRealtime >= 500) {
            getSwipeRefreshLayout().post(this.refreshCompleted);
        } else {
            getSwipeRefreshLayout().postDelayed(this.refreshCompleted, ((long) BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE) - jElapsedRealtime);
        }
    }

    public final void setRefreshStart() {
        getSwipeRefreshLayout().post(this.refreshStart);
    }

    public final void setSwipeRefreshLayout(@NotNull SwipeRefreshLayout swipeRefreshLayout) {
        this.swipeRefreshLayout = swipeRefreshLayout;
    }

    public void showEmptyTips() {
        showEmptyTips(2131235594);
    }

    public final void showEmptyTips(@DrawableRes int i7) {
        getLoadingView().setVisibility(0);
        getLoadingView().setImageResource(i7);
        getLoadingView().showEmptyTips();
    }

    public final void showErrorTips() {
        getLoadingView().setVisibility(0);
        getLoadingView().setRefreshError();
    }

    public void showLoading() {
        getLoadingView().setVisibility(0);
        getLoadingView().setRefreshing();
    }

    public final void showSwipeRefreshLayout() {
        getSwipeRefreshLayout().setEnabled(true);
    }
}
