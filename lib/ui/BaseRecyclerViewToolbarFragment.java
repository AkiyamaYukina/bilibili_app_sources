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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/BaseRecyclerViewToolbarFragment.class */
public abstract class BaseRecyclerViewToolbarFragment extends BaseToolbarFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LoadingImageView f64718b;

    public final void hideLoading() {
        LoadingImageView loadingImageView = this.f64718b;
        if (loadingImageView != null) {
            loadingImageView.setRefreshComplete();
            this.f64718b.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131494797, viewGroup, false);
        this.f64718b = LoadingImageView.attachTo((FrameLayout) viewInflate.findViewById(2131300847));
        return viewInflate;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131306580);
        if (recyclerView == null) {
            throw new NullPointerException("RecyclerView not found");
        }
        onViewCreated(recyclerView, bundle);
    }

    public void onViewCreated(RecyclerView recyclerView, @Nullable Bundle bundle) {
    }

    public final void showEmptyTips() {
        LoadingImageView loadingImageView = this.f64718b;
        if (loadingImageView != null) {
            if (!loadingImageView.isShown()) {
                this.f64718b.setVisibility(0);
            }
            this.f64718b.setImageResource(2131235594);
            this.f64718b.showEmptyTips();
        }
    }

    public final void showEmptyTips(@StringRes int i7, @DrawableRes int i8) {
        LoadingImageView loadingImageView = this.f64718b;
        if (loadingImageView != null) {
            if (!loadingImageView.isShown()) {
                this.f64718b.setVisibility(0);
            }
            if (i8 != 0) {
                this.f64718b.setImageResource(i8);
            } else {
                this.f64718b.hideErrorImage();
            }
            if (i7 != 0) {
                this.f64718b.showEmptyTips(i7);
            } else {
                this.f64718b.hideErrorText();
            }
        }
    }

    public final void showErrorTips() {
        LoadingImageView loadingImageView = this.f64718b;
        if (loadingImageView != null) {
            if (!loadingImageView.isShown()) {
                this.f64718b.setVisibility(0);
            }
            this.f64718b.setRefreshError();
        }
    }

    public final void showLoading() {
        LoadingImageView loadingImageView = this.f64718b;
        if (loadingImageView != null) {
            loadingImageView.setVisibility(0);
            this.f64718b.setRefreshing();
        }
    }
}
