package com.bilibili.music.podcast.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/l.class */
public abstract class l extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67278a;

    public abstract void onLastItemVisible(int i7);

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(@NotNull RecyclerView recyclerView, int i7, int i8) {
        int i9;
        super.onScrolled(recyclerView, i7, i8);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            linearLayoutManager.findFirstVisibleItemPosition();
            this.f67278a = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] iArrFindLastCompletelyVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findLastCompletelyVisibleItemPositions(null);
            int iMax = iArrFindLastCompletelyVisibleItemPositions[0];
            for (int i10 : iArrFindLastCompletelyVisibleItemPositions) {
                iMax = Math.max(i10, iMax);
            }
            this.f67278a = iMax;
        }
        int childCount = layoutManager.getChildCount();
        int itemCount = layoutManager.getItemCount();
        if (childCount <= 0 || (i9 = this.f67278a) < itemCount - 1) {
            return;
        }
        onLastItemVisible(i9);
    }
}
