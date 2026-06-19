package com.bilibili.lib.ui.swiperefresh;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.mobile.BLHumanActionParamsType;
import tv.danmaku.bili.widget.swiperefresh.TintSwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/swiperefresh/BaseSwipeRefreshFragment.class */
public abstract class BaseSwipeRefreshFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener {
    private long mLastRefreshStartTime;
    Runnable mRefreshAction = new a(this);
    Runnable mRefreshCompletedAction = new b(this);
    protected SwipeRefreshLayout mSwipeRefreshLayout;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/swiperefresh/BaseSwipeRefreshFragment$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseSwipeRefreshFragment f64921a;

        public a(BaseSwipeRefreshFragment baseSwipeRefreshFragment) {
            this.f64921a = baseSwipeRefreshFragment;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SwipeRefreshLayout swipeRefreshLayout = this.f64921a.mSwipeRefreshLayout;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(true);
            }
            this.f64921a.mLastRefreshStartTime = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/swiperefresh/BaseSwipeRefreshFragment$b.class */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseSwipeRefreshFragment f64922a;

        public b(BaseSwipeRefreshFragment baseSwipeRefreshFragment) {
            this.f64922a = baseSwipeRefreshFragment;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SwipeRefreshLayout swipeRefreshLayout = this.f64922a.mSwipeRefreshLayout;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
        }
    }

    public SwipeRefreshLayout getSwipeRefreshLayout() {
        return this.mSwipeRefreshLayout;
    }

    public void hideSwipeRefreshLayout() {
        SwipeRefreshLayout swipeRefreshLayout = this.mSwipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setEnabled(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TintSwipeRefreshLayout tintSwipeRefreshLayout = new TintSwipeRefreshLayout(layoutInflater.getContext());
        this.mSwipeRefreshLayout = tintSwipeRefreshLayout;
        tintSwipeRefreshLayout.setOnRefreshListener(this);
        this.mSwipeRefreshLayout.setId(2131303590);
        View viewOnCreateView = onCreateView(layoutInflater, this.mSwipeRefreshLayout, bundle);
        if (viewOnCreateView.getParent() == null) {
            this.mSwipeRefreshLayout.addView(viewOnCreateView, 0);
        }
        this.mSwipeRefreshLayout.setColorSchemeResources(2131103284);
        return this.mSwipeRefreshLayout;
    }

    public abstract View onCreateView(LayoutInflater layoutInflater, SwipeRefreshLayout swipeRefreshLayout, Bundle bundle);

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (EntryPointKt.getMemleakOptEnable()) {
            this.mSwipeRefreshLayout = null;
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SwipeRefreshLayout swipeRefreshLayout = this.mSwipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
            this.mSwipeRefreshLayout.destroyDrawingCache();
            this.mSwipeRefreshLayout.clearAnimation();
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        this.mLastRefreshStartTime = SystemClock.elapsedRealtime();
    }

    public void onTabRefresh() {
        onRefresh();
    }

    public final void setRefreshCompleted() {
        SwipeRefreshLayout swipeRefreshLayout = this.mSwipeRefreshLayout;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.removeCallbacks(this.mRefreshAction);
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.mLastRefreshStartTime);
        if (iElapsedRealtime < 0 || iElapsedRealtime >= 500) {
            this.mSwipeRefreshLayout.post(this.mRefreshCompletedAction);
        } else {
            this.mSwipeRefreshLayout.postDelayed(this.mRefreshCompletedAction, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE - iElapsedRealtime);
        }
    }

    public final void setRefreshStart() {
        SwipeRefreshLayout swipeRefreshLayout = this.mSwipeRefreshLayout;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.post(this.mRefreshAction);
    }

    public void showSwipeRefreshLayout() {
        SwipeRefreshLayout swipeRefreshLayout = this.mSwipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setEnabled(true);
        }
    }
}
