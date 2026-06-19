package com.bilibili.lib.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;
import tv.danmaku.bili.widget.LoadingImageView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/BaseRecyclerViewFragment.class */
public abstract class BaseRecyclerViewFragment extends BaseFragment {
    protected LoadingImageView mLoadingView;
    private RecyclerView mRecyclerView;

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

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setId(2131300847);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        layoutInflater.inflate(2131494739, frameLayout);
        this.mLoadingView = LoadingImageView.attachTo(frameLayout);
        return frameLayout;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131306580);
        this.mRecyclerView = recyclerView;
        if (recyclerView == null) {
            throw new NullPointerException("RecyclerView not found");
        }
        onViewCreated(recyclerView, bundle);
    }

    public void onViewCreated(RecyclerView recyclerView, @Nullable Bundle bundle) {
    }

    public void showEmptyTips() {
        LoadingImageView loadingImageView = this.mLoadingView;
        if (loadingImageView != null) {
            if (!loadingImageView.isShown()) {
                this.mLoadingView.setVisibility(0);
            }
            this.mLoadingView.setImageResource(2131235594);
            this.mLoadingView.showEmptyTips();
        }
    }

    public void showEmptyTips(@StringRes int i7, @DrawableRes int i8) {
        LoadingImageView loadingImageView = this.mLoadingView;
        if (loadingImageView != null) {
            if (!loadingImageView.isShown()) {
                this.mLoadingView.setVisibility(0);
            }
            if (i8 != 0) {
                this.mLoadingView.setImageResource(i8);
            } else {
                this.mLoadingView.hideErrorImage();
            }
            if (i7 != 0) {
                this.mLoadingView.showEmptyTips(i7);
            } else {
                this.mLoadingView.hideErrorText();
            }
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
