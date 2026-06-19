package com.bilibili.upper.widget.recycler;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.C3237a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/recycler/BiliUperCenterLayoutManager.class */
public class BiliUperCenterLayoutManager extends LinearLayoutManager {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/recycler/BiliUperCenterLayoutManager$a.class */
    public static final class a extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final int calculateDtToFit(int i7, int i8, int i9, int i10, int i11) {
            return C3237a.a(i10, i9, 2, i9) - (((i8 - i7) / 2) + i7);
        }
    }

    public BiliUperCenterLayoutManager(Context context) {
        super(context);
    }

    public BiliUperCenterLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i7) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i7);
        startSmoothScroll(linearSmoothScroller);
    }
}
