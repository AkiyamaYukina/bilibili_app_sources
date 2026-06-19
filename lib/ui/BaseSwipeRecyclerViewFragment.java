package com.bilibili.lib.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import tv.danmaku.bili.widget.LoadingImageView;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/BaseSwipeRecyclerViewFragment.class */
@Deprecated
public abstract class BaseSwipeRecyclerViewFragment extends BaseSwipeRefreshFragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f64719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LoadingImageView f64720g;

    public void addLoadingView(ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            this.f64720g = new LoadingImageView(viewGroup.getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f64720g.setLayoutParams(layoutParams);
            this.f64720g.setVisibility(8);
            viewGroup.addView(this.f64720g);
        }
    }

    @Override // com.bilibili.lib.ui.BaseSwipeRefreshFragment
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable SwipeRefreshLayout swipeRefreshLayout, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494739, (ViewGroup) swipeRefreshLayout, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f64719f = null;
        super.onDestroy();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131306580);
        this.f64719f = recyclerView;
        if (recyclerView == null) {
            throw new NullPointerException("RecyclerView not found");
        }
        addLoadingView((ViewGroup) recyclerView.getParent());
        onViewCreated(this.f64719f, bundle);
    }

    public void onViewCreated(RecyclerView recyclerView, @Nullable Bundle bundle) {
    }

    public void showErrorTips() {
        LoadingImageView loadingImageView = this.f64720g;
        if (loadingImageView != null) {
            if (!loadingImageView.isShown()) {
                this.f64720g.setVisibility(0);
            }
            this.f64720g.setRefreshError();
        }
    }
}
