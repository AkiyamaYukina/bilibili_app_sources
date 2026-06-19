package com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/filter/h.class */
public final class h extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorChildFilterFragment f106812a;

    public h(BiliEditorChildFilterFragment biliEditorChildFilterFragment) {
        this.f106812a = biliEditorChildFilterFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        super.onScrolled(recyclerView, i7, i8);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            CollectionsKt.addAll(this.f106812a.lf().s, new IntRange(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition()));
        }
    }
}
