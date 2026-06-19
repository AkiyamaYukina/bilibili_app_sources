package com.bilibili.upper.widget.thumb;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/thumb/ThumbLayoutManager.class */
public class ThumbLayoutManager extends LinearLayoutManager {
    public ThumbLayoutManager(Context context) {
        super(context);
    }

    public ThumbLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e7) {
            Log.e("ThumbLayoutManager", "----IndexOutOfBoundsException---");
            e7.printStackTrace();
        }
    }
}
