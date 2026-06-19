package com.bilibili.upper.widget;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.bilibili.upper.widget.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/c.class */
public final class C6688c extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseSwipeRecyclerViewFragmentWithGradient f114482a;

    public C6688c(BaseSwipeRecyclerViewFragmentWithGradient baseSwipeRecyclerViewFragmentWithGradient) {
        this.f114482a = baseSwipeRecyclerViewFragmentWithGradient;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        TextView textView;
        TextView textView2;
        super.onScrolled(recyclerView, i7, i8);
        int verticalScrollOffset = ((tv.danmaku.bili.widget.RecyclerView) recyclerView).getVerticalScrollOffset();
        BaseSwipeRecyclerViewFragmentWithGradient baseSwipeRecyclerViewFragmentWithGradient = this.f114482a;
        FrameLayout frameLayout = baseSwipeRecyclerViewFragmentWithGradient.f114307f;
        if (frameLayout != null) {
            if (verticalScrollOffset < frameLayout.getMeasuredHeight()) {
                int measuredHeight = (verticalScrollOffset * 255) / frameLayout.getMeasuredHeight();
                Drawable background = frameLayout.getBackground();
                if (background != null) {
                    background.setAlpha(measuredHeight);
                }
                if (!baseSwipeRecyclerViewFragmentWithGradient.f114308g || (textView2 = baseSwipeRecyclerViewFragmentWithGradient.f114310j) == null) {
                    return;
                }
                textView2.setVisibility(4);
                return;
            }
            Drawable background2 = frameLayout.getBackground();
            if (background2 == null || frameLayout.getAlpha() >= 255.0f) {
                return;
            }
            background2.setAlpha(255);
            if (!baseSwipeRecyclerViewFragmentWithGradient.f114308g || (textView = baseSwipeRecyclerViewFragmentWithGradient.f114310j) == null) {
                return;
            }
            textView.setVisibility(0);
        }
    }
}
