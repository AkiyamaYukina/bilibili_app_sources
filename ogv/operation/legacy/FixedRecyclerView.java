package com.bilibili.ogv.operation.legacy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/legacy/FixedRecyclerView.class */
@StabilityInferred(parameters = 0)
public final class FixedRecyclerView extends RecyclerView {
    public FixedRecyclerView(@NotNull Context context) {
        this(context, null);
    }

    public FixedRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        ViewParent parent;
        ViewParent viewParent = this;
        do {
            parent = viewParent;
            if (viewParent.getParent() instanceof ViewPager) {
                break;
            }
            parent = viewParent.getParent();
            viewParent = parent;
        } while (parent != null);
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
