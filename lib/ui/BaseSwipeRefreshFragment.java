package com.bilibili.lib.ui;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.bilibili.mobile.BLHumanActionParamsType;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/BaseSwipeRefreshFragment.class */
public abstract class BaseSwipeRefreshFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SwipeRefreshLayout f64721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f64722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f64723d = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f64724e = new b(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/BaseSwipeRefreshFragment$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseSwipeRefreshFragment f64725a;

        public a(BaseSwipeRefreshFragment baseSwipeRefreshFragment) {
            this.f64725a = baseSwipeRefreshFragment;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SwipeRefreshLayout swipeRefreshLayout = this.f64725a.f64721b;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(true);
            }
            this.f64725a.f64722c = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/BaseSwipeRefreshFragment$b.class */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseSwipeRefreshFragment f64726a;

        public b(BaseSwipeRefreshFragment baseSwipeRefreshFragment) {
            this.f64726a = baseSwipeRefreshFragment;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SwipeRefreshLayout swipeRefreshLayout = this.f64726a.f64721b;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(layoutInflater.getContext());
        this.f64721b = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        this.f64721b.setId(2131303590);
        View viewOnCreateView = onCreateView(layoutInflater, this.f64721b, bundle);
        if (viewOnCreateView.getParent() == null) {
            this.f64721b.addView(viewOnCreateView, 0);
        }
        this.f64721b.setColorSchemeResources(new int[]{2131103284});
        return this.f64721b;
    }

    public abstract View onCreateView(LayoutInflater layoutInflater, SwipeRefreshLayout swipeRefreshLayout, Bundle bundle);

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SwipeRefreshLayout swipeRefreshLayout = this.f64721b;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
            this.f64721b.destroyDrawingCache();
            this.f64721b.clearAnimation();
        }
    }

    public void onRefresh() {
        this.f64722c = SystemClock.elapsedRealtime();
    }

    public final void setRefreshCompleted() {
        SwipeRefreshLayout swipeRefreshLayout = this.f64721b;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.removeCallbacks(this.f64723d);
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f64722c);
        if (iElapsedRealtime < 0 || iElapsedRealtime >= 500) {
            this.f64721b.post(this.f64724e);
        } else {
            this.f64721b.postDelayed(this.f64724e, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE - iElapsedRealtime);
        }
    }

    public final void setRefreshStart() {
        SwipeRefreshLayout swipeRefreshLayout = this.f64721b;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.post(this.f64723d);
    }
}
