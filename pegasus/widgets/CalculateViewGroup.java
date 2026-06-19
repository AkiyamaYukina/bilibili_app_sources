package com.bilibili.pegasus.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/CalculateViewGroup.class */
@StabilityInferred(parameters = 0)
public final class CalculateViewGroup extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f79164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f79165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public RecyclerView f79166d;

    public CalculateViewGroup(@Nullable Context context) {
        super(context);
    }

    public CalculateViewGroup(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    @NotNull
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    @NotNull
    public final ViewGroup.LayoutParams generateLayoutParams(@Nullable AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    @NotNull
    public final ViewGroup.LayoutParams generateLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        RecyclerView recyclerView = this.f79166d;
        if (recyclerView != null) {
            if (getWidth() - (this.f79165c * 2) > recyclerView.getMeasuredWidth()) {
                int width = (getWidth() - recyclerView.getMeasuredWidth()) / 2;
                recyclerView.layout(width, this.f79164b + i8, recyclerView.getMeasuredWidth() + width, recyclerView.getMeasuredHeight() + i8 + this.f79164b);
            } else if (recyclerView.getMeasuredWidth() > getWidth() - this.f79165c) {
                recyclerView.layout(i7, this.f79164b + i8, (recyclerView.getMeasuredWidth() + i7) - this.f79165c, recyclerView.getMeasuredHeight() + i8 + this.f79164b);
            } else {
                recyclerView.layout(i7, this.f79164b + i8, recyclerView.getMeasuredWidth() + i7, recyclerView.getMeasuredHeight() + i8 + this.f79164b);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - this.f79165c, Integer.MIN_VALUE);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof RecyclerView) {
                this.f79166d = (RecyclerView) childAt;
                childAt.measure(iMakeMeasureSpec, i8);
                this.f79166d.getMeasuredWidth();
            }
        }
        RecyclerView recyclerView = this.f79166d;
        int measuredHeight = size2;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            this.f79164b = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
            this.f79163a = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
            measuredHeight = this.f79163a + recyclerView.getMeasuredHeight() + this.f79164b;
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setIconWidth(int i7) {
        this.f79165c = i7;
        requestLayout();
    }
}
