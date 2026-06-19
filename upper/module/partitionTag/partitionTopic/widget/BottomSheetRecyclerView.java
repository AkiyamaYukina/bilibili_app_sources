package com.bilibili.upper.module.partitionTag.partitionTopic.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import bilibili.live.app.service.resolver.c;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/BottomSheetRecyclerView.class */
public class BottomSheetRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f113876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BottomSheetBehavior f113877b;

    public BottomSheetRecyclerView(Context context) {
        this(context, null);
        g();
    }

    public BottomSheetRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f113876a = "BottomSheetRecyclerView";
        g();
        g();
    }

    public final void g() {
        this.f113876a = "BottomSheetRecyclerView_" + getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        c.a(action, "recycleView onInterceptTouchEvent action = ", this.f113876a);
        if (action == 0 || action == 2 || action == 11) {
            if (this.f113877b != null) {
                BLog.i(this.f113876a, "[enableNestedScrolling]  enable recycleView");
                this.f113877b.setNestedScrollingChildRef(this);
            } else {
                BLog.i(this.f113876a, "[enableNestedScrolling] mBottomSheetBehavior == null");
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        c.a(action, "recycleView onTouchEvent action = ", this.f113876a);
        if (action == 0 || action == 2 || action == 11) {
            if (this.f113877b != null) {
                BLog.i(this.f113876a, "[enableNestedScrolling]  enable recycleView");
                this.f113877b.setNestedScrollingChildRef(this);
            } else {
                BLog.i(this.f113876a, "[enableNestedScrolling] mBottomSheetBehavior == null");
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        super.setAdapter(adapter);
    }

    public void setBottomSheetBehavior(BottomSheetBehavior bottomSheetBehavior) {
        this.f113877b = bottomSheetBehavior;
    }
}
