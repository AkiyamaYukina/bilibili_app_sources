package com.bilibili.lib.ui.swiperefresh;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.mall.data.page.home.bean.HomeTabReadBean;
import com.mall.data.page.home.bean.HomeTabReadVoBean;
import com.mall.ui.page.home.menu.HomeMenuTabService;
import com.mall.ui.widget.bannerv3.FlashBanner;
import com.mall.videodetail.vd.ugc.intro.ugcseason.UGCSeasonClockExpandableLayout;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import sS0.c;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/swiperefresh/BaseSwipeRefreshToolbarFragment.class */
public abstract class BaseSwipeRefreshToolbarFragment extends BaseToolbarFragment implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SwipeRefreshLayout f64923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f64924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c f64925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final d f64926e;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.lib.ui.swiperefresh.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.lib.ui.swiperefresh.d] */
    public BaseSwipeRefreshToolbarFragment() {
        final int i7 = 0;
        this.f64925d = new Runnable(this, i7) { // from class: com.bilibili.lib.ui.swiperefresh.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f64930a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f64931b;

            {
                this.f64930a = i7;
                this.f64931b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f64930a) {
                    case 0:
                        BaseSwipeRefreshToolbarFragment baseSwipeRefreshToolbarFragment = (BaseSwipeRefreshToolbarFragment) this.f64931b;
                        baseSwipeRefreshToolbarFragment.getSwipeRefreshLayout().setRefreshing(true);
                        baseSwipeRefreshToolbarFragment.f64924c = SystemClock.elapsedRealtime();
                        break;
                    default:
                        ((UGCSeasonClockExpandableLayout) this.f64931b).requestLayout();
                        break;
                }
            }
        };
        final int i8 = 0;
        this.f64926e = new Runnable(this, i8) { // from class: com.bilibili.lib.ui.swiperefresh.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f64932a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f64933b;

            {
                this.f64932a = i8;
                this.f64933b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Response responseExecute;
                GeneralResponse generalResponse;
                HomeTabReadBean homeTabReadBean;
                switch (this.f64932a) {
                    case 0:
                        ((BaseSwipeRefreshToolbarFragment) this.f64933b).getSwipeRefreshLayout().setRefreshing(false);
                        break;
                    case 1:
                        sS0.c cVar = (sS0.c) this.f64933b;
                        try {
                            BiliCall biliCallLoadHomeTabRead = ((HomeMenuTabService) cVar.a.getValue()).loadHomeTabRead();
                            responseExecute = null;
                            if (biliCallLoadHomeTabRead != null) {
                                responseExecute = biliCallLoadHomeTabRead.execute();
                            }
                        } catch (Exception e7) {
                            BLog.e(e7.toString());
                            responseExecute = null;
                        }
                        if (responseExecute != null && responseExecute.isSuccessful() && responseExecute.body() != null && (generalResponse = (GeneralResponse) responseExecute.body()) != null && generalResponse.code == 0) {
                            HomeTabReadVoBean homeTabReadVoBean = (HomeTabReadVoBean) generalResponse.data;
                            if ((homeTabReadVoBean == null || (homeTabReadBean = homeTabReadVoBean.vo) == null) ? false : Intrinsics.areEqual(homeTabReadBean.getResult(), Boolean.TRUE)) {
                                Lazy lazy = sS0.c.f;
                                cVar.h(c.a.b());
                                sS0.c.e();
                                sS0.c.a(false);
                            }
                            break;
                        }
                        break;
                    default:
                        FlashBanner flashBanner = (FlashBanner) this.f64933b;
                        if (flashBanner.p && flashBanner.i != 0 && flashBanner.l()) {
                            flashBanner.o(1000L, flashBanner.i, 0, true);
                            break;
                        }
                        break;
                }
            }
        };
    }

    @NotNull
    public final SwipeRefreshLayout getSwipeRefreshLayout() {
        SwipeRefreshLayout swipeRefreshLayout = this.f64923b;
        if (swipeRefreshLayout != null) {
            return swipeRefreshLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131494798, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(2131312767);
        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.setColorSchemeResources(2131103284);
        View viewOnCreateView = onCreateView(layoutInflater, swipeRefreshLayout, bundle);
        if (viewOnCreateView.getParent() == null) {
            swipeRefreshLayout.addView(viewOnCreateView, 0);
        }
        this.f64923b = swipeRefreshLayout;
        return viewInflate;
    }

    @NotNull
    public abstract View onCreateView(@NotNull LayoutInflater layoutInflater, @NotNull SwipeRefreshLayout swipeRefreshLayout, @Nullable Bundle bundle);

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getSwipeRefreshLayout().setRefreshing(false);
        getSwipeRefreshLayout().destroyDrawingCache();
        getSwipeRefreshLayout().clearAnimation();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        this.f64924c = SystemClock.elapsedRealtime();
    }

    public final void setRefreshCompleted() {
        getSwipeRefreshLayout().removeCallbacks(this.f64925d);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f64924c;
        if (0 > jElapsedRealtime || jElapsedRealtime >= 500) {
            getSwipeRefreshLayout().post(this.f64926e);
        } else {
            getSwipeRefreshLayout().postDelayed(this.f64926e, ((long) BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE) - jElapsedRealtime);
        }
    }

    public final void setRefreshStart() {
        getSwipeRefreshLayout().post(this.f64925d);
    }
}
