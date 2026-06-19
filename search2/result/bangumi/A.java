package com.bilibili.search2.result.bangumi;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/A.class */
public final class A extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchBangumiEpisodeHorizontalFragment f87329a;

    public A(SearchBangumiEpisodeHorizontalFragment searchBangumiEpisodeHorizontalFragment) {
        this.f87329a = searchBangumiEpisodeHorizontalFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        int childCount = recyclerView.getChildCount();
        if (childCount > 1) {
            SearchBangumiEpisodeHorizontalFragment searchBangumiEpisodeHorizontalFragment = this.f87329a;
            if (searchBangumiEpisodeHorizontalFragment.f87380l) {
                if (recyclerView.getChildAdapterPosition(recyclerView.getChildAt(childCount - 1)) == recyclerView.getAdapter().getItemCount() - 1) {
                    searchBangumiEpisodeHorizontalFragment.nf();
                }
            }
        }
    }
}
