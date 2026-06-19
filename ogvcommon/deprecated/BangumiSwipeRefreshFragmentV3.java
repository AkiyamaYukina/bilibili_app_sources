package com.bilibili.ogvcommon.deprecated;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/deprecated/BangumiSwipeRefreshFragmentV3.class */
@Deprecated
public abstract class BangumiSwipeRefreshFragmentV3 extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SwipeRefreshLayout f73151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f73152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f73153d = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f73154e = new b(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/deprecated/BangumiSwipeRefreshFragmentV3$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiSwipeRefreshFragmentV3 f73155a;

        public a(BangumiSwipeRefreshFragmentV3 bangumiSwipeRefreshFragmentV3) {
            this.f73155a = bangumiSwipeRefreshFragmentV3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SwipeRefreshLayout swipeRefreshLayout = this.f73155a.f73151b;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(true);
            }
            this.f73155a.f73152c = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/deprecated/BangumiSwipeRefreshFragmentV3$b.class */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiSwipeRefreshFragmentV3 f73156a;

        public b(BangumiSwipeRefreshFragmentV3 bangumiSwipeRefreshFragmentV3) {
            this.f73156a = bangumiSwipeRefreshFragmentV3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SwipeRefreshLayout swipeRefreshLayout = this.f73156a.f73151b;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
        }
    }

    @NonNull
    public abstract View jf(LayoutInflater layoutInflater, SwipeRefreshLayout swipeRefreshLayout);

    @NonNull
    public abstract View kf(LayoutInflater layoutInflater, ViewGroup viewGroup, SwipeRefreshLayout swipeRefreshLayout);

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(layoutInflater.getContext());
        this.f73151b = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        this.f73151b.setId(2131303590);
        View viewJf = jf(layoutInflater, this.f73151b);
        if (viewJf.getParent() == null) {
            this.f73151b.addView(viewJf, 0);
        }
        this.f73151b.setColorSchemeResources(new int[]{R$color.Pi5});
        return kf(layoutInflater, viewGroup, this.f73151b);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SwipeRefreshLayout swipeRefreshLayout = this.f73151b;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
            this.f73151b.destroyDrawingCache();
            this.f73151b.clearAnimation();
        }
    }

    public void onRefresh() {
        this.f73152c = SystemClock.elapsedRealtime();
    }

    public final void setRefreshCompleted() {
        SwipeRefreshLayout swipeRefreshLayout = this.f73151b;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.removeCallbacks(this.f73153d);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f73152c;
        if (0 > jElapsedRealtime || jElapsedRealtime >= 500) {
            this.f73151b.post(this.f73154e);
        } else {
            this.f73151b.postDelayed(this.f73154e, 500 - jElapsedRealtime);
        }
    }
}
