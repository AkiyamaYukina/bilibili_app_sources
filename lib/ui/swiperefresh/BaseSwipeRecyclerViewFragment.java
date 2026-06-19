package com.bilibili.lib.ui.swiperefresh;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import tv.danmaku.bili.widget.LoadingImageView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/swiperefresh/BaseSwipeRecyclerViewFragment.class */
public abstract class BaseSwipeRecyclerViewFragment extends BaseSwipeRefreshFragment {
    protected LoadingImageView mLoadingView;
    private RecyclerView mRecyclerView;

    public void addLoadingView(ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            this.mLoadingView = new LoadingImageView(viewGroup.getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.mLoadingView.setLayoutParams(layoutParams);
            this.mLoadingView.setVisibility(8);
            viewGroup.addView(this.mLoadingView);
        }
    }

    public View getLoadingView(Context context) {
        this.mLoadingView = new LoadingImageView(context);
        for (int i7 = 0; i7 < this.mLoadingView.getChildCount(); i7++) {
            this.mLoadingView.getChildAt(i7).setPadding(0, 100, 0, 0);
        }
        this.mLoadingView.setVisibility(8);
        return this.mLoadingView;
    }

    @Nullable
    public final RecyclerView getRecyclerView() {
        return this.mRecyclerView;
    }

    public void hideErrorTips() {
        LoadingImageView loadingImageView = this.mLoadingView;
        if (loadingImageView != null) {
            loadingImageView.setVisibility(8);
            this.mLoadingView.hideRefreshError();
        }
    }

    public void hideLoading() {
        LoadingImageView loadingImageView = this.mLoadingView;
        if (loadingImageView != null) {
            loadingImageView.setRefreshComplete();
            this.mLoadingView.setVisibility(8);
        }
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable SwipeRefreshLayout swipeRefreshLayout, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494738, (ViewGroup) swipeRefreshLayout, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.mRecyclerView = null;
        super.onDestroy();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131306580);
        this.mRecyclerView = recyclerView;
        if (recyclerView == null) {
            throw new NullPointerException("RecyclerView not found");
        }
        addLoadingView((ViewGroup) recyclerView.getParent());
        onViewCreated(this.mRecyclerView, bundle);
    }

    public void onViewCreated(RecyclerView recyclerView, @Nullable Bundle bundle) {
    }

    public void showEmptyTips() {
        showEmptyTips(2131235594);
    }

    public void showEmptyTips(@DrawableRes int i7) {
        LoadingImageView loadingImageView = this.mLoadingView;
        if (loadingImageView != null) {
            if (!loadingImageView.isShown()) {
                this.mLoadingView.setVisibility(0);
            }
            this.mLoadingView.setImageResource(i7);
            this.mLoadingView.showEmptyTips();
        }
    }

    public void showEmptyTips(@DrawableRes int i7, @StringRes int i8) {
        LoadingImageView loadingImageView = this.mLoadingView;
        if (loadingImageView != null) {
            if (!loadingImageView.isShown()) {
                this.mLoadingView.setVisibility(0);
            }
            this.mLoadingView.setImageResource(i7, i8);
            this.mLoadingView.showEmptyTips();
        }
    }

    public void showEmptyTips(String str) {
        LoadingImageView loadingImageView = this.mLoadingView;
        if (loadingImageView != null) {
            if (!loadingImageView.isShown()) {
                this.mLoadingView.setVisibility(0);
            }
            this.mLoadingView.setImageResource(str);
            this.mLoadingView.showEmptyTips();
        }
    }

    public void showErrorTips() {
        LoadingImageView loadingImageView = this.mLoadingView;
        if (loadingImageView != null) {
            if (!loadingImageView.isShown()) {
                this.mLoadingView.setVisibility(0);
            }
            this.mLoadingView.setRefreshError();
        }
    }

    public void showLoading() {
        LoadingImageView loadingImageView = this.mLoadingView;
        if (loadingImageView != null) {
            loadingImageView.setVisibility(0);
            this.mLoadingView.setRefreshing();
        }
    }
}
