package com.bilibili.ogv.operation.legacy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/legacy/HorizontalLoopLayoutManager.class */
@StabilityInferred(parameters = 0)
public final class HorizontalLoopLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f70292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f70294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f70295d;

    public HorizontalLoopLayoutManager(@NotNull Context context, float f7, int i7, boolean z6, int i8) {
        super(context, 0, false);
        this.f70292a = f7;
        this.f70293b = i7;
        this.f70294c = z6;
        this.f70295d = i8;
    }

    public final int c() {
        float f7 = this.f70292a;
        if (f7 <= 0.0f || getOrientation() != 0 || getWidth() <= 0) {
            return 0;
        }
        int i7 = this.f70293b;
        int paddingEnd = i7;
        if (i7 == 0) {
            paddingEnd = getPaddingEnd();
        }
        return (int) (((getWidth() - getPaddingStart()) - paddingEnd) / f7);
    }

    public final void d(RecyclerView.Recycler recycler, boolean z6) {
        if (z6) {
            int i7 = 0;
            while (true) {
                View childAt = getChildAt(i7);
                if (childAt == null) {
                    return;
                }
                if (getOrientation() == 0) {
                    if (childAt.getRight() >= getPaddingLeft()) {
                        return;
                    }
                } else if (childAt.getBottom() >= getPaddingTop()) {
                    return;
                }
                removeAndRecycleView(childAt, recycler);
                i7++;
            }
        } else {
            int childCount = getChildCount() - 1;
            while (true) {
                View childAt2 = getChildAt(childCount);
                if (childAt2 == null) {
                    return;
                }
                if (getOrientation() == 0) {
                    if (childAt2.getLeft() <= getWidth() - getPaddingRight()) {
                        return;
                    }
                } else if (childAt2.getTop() <= getHeight() - getPaddingBottom()) {
                    return;
                }
                removeAndRecycleView(childAt2, recycler);
                childCount--;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChild(@NotNull View view, int i7, int i8) {
        int iC = c();
        if (iC > 0) {
            ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).width = iC;
        }
        super.measureChild(view, i7, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(@NotNull View view, int i7, int i8) {
        int iC = c();
        if (iC > 0) {
            ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).width = iC;
        }
        super.measureChildWithMargins(view, i7, i8);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(@NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state) {
        if (!this.f70294c) {
            super.onLayoutChildren(recycler, state);
            return;
        }
        if (getItemCount() > 0 && !state.isPreLayout()) {
            detachAndScrapAttachedViews(recycler);
            if (getOrientation() == 0) {
                int iC = c();
                int itemCount = getItemCount();
                int i7 = this.f70295d;
                int paddingLeft = getPaddingLeft() + (i7 - (i7 % (itemCount * iC)));
                int i8 = 0;
                while (paddingLeft <= (getWidth() + i7) - getPaddingRight()) {
                    View viewForPosition = recycler.getViewForPosition(i8 % getItemCount());
                    addView(viewForPosition);
                    measureChildWithMargins(viewForPosition, 0, 0);
                    int paddingTop = getPaddingTop();
                    int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition) + paddingLeft;
                    layoutDecorated(viewForPosition, paddingLeft, paddingTop, decoratedMeasuredWidth, getDecoratedMeasuredHeight(viewForPosition) + paddingTop);
                    i8++;
                    paddingLeft = decoratedMeasuredWidth;
                }
                d(recycler, true);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i7, @NotNull RecyclerView.Recycler recycler, @Nullable RecyclerView.State state) {
        if (!this.f70294c) {
            return super.scrollHorizontallyBy(i7, recycler, state);
        }
        boolean z6 = false;
        boolean z7 = i7 > 0;
        if (getChildCount() != 0) {
            if (z7) {
                View childAt = getChildAt(getChildCount() - 1);
                if (childAt != null) {
                    int position = getPosition(childAt);
                    while (childAt.getRight() < getWidth() - getPaddingRight()) {
                        int itemCount = (position + 1) % getItemCount();
                        int itemCount2 = itemCount;
                        if (itemCount < 0) {
                            itemCount2 = itemCount + getItemCount();
                        }
                        View viewForPosition = recycler.getViewForPosition(itemCount2);
                        addView(viewForPosition);
                        measureChildWithMargins(viewForPosition, 0, 0);
                        int right = childAt.getRight();
                        int paddingTop = getPaddingTop();
                        layoutDecorated(viewForPosition, right, paddingTop, getDecoratedMeasuredWidth(viewForPosition) + right, getDecoratedMeasuredHeight(viewForPosition) + paddingTop);
                        childAt = viewForPosition;
                    }
                }
            } else {
                View childAt2 = getChildAt(0);
                if (childAt2 != null) {
                    int position2 = getPosition(childAt2);
                    while (childAt2.getLeft() > getPaddingLeft()) {
                        int itemCount3 = (position2 - 1) % getItemCount();
                        int itemCount4 = itemCount3;
                        if (itemCount3 < 0) {
                            itemCount4 = itemCount3 + getItemCount();
                        }
                        View viewForPosition2 = recycler.getViewForPosition(itemCount4);
                        addView(viewForPosition2, 0);
                        measureChildWithMargins(viewForPosition2, 0, 0);
                        int left = childAt2.getLeft();
                        int paddingTop2 = getPaddingTop();
                        layoutDecorated(viewForPosition2, left - getDecoratedMeasuredWidth(viewForPosition2), paddingTop2, left, getDecoratedMeasuredHeight(viewForPosition2) + paddingTop2);
                        childAt2 = viewForPosition2;
                    }
                }
            }
        }
        offsetChildrenHorizontal(-i7);
        if (i7 > 0) {
            z6 = true;
        }
        d(recycler, z6);
        return i7;
    }
}
