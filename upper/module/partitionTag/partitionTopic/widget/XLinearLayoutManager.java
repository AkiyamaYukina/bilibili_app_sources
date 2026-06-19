package com.bilibili.upper.module.partitionTag.partitionTopic.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/XLinearLayoutManager.class */
public class XLinearLayoutManager extends LinearLayoutManager {
    public XLinearLayoutManager(Context context) {
        super(context);
    }

    public XLinearLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }
}
