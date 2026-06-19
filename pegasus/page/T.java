package com.bilibili.pegasus.page;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/T.class */
@StabilityInferred(parameters = 0)
public final class T extends LinearSnapHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Context f78315b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/T$a.class */
    public static final class a extends LinearSmoothScroller {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f78316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RecyclerView.LayoutManager f78317b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, T t7, RecyclerView.LayoutManager layoutManager) {
            super(context);
            this.f78316a = t7;
            this.f78317b = layoutManager;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 8.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public final void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            int iCalculateTimeForDeceleration;
            RecyclerView.LayoutManager layoutManager = this.f78317b;
            T t7 = this.f78316a;
            int[] iArrCalculateDistanceToFinalSnap = t7.calculateDistanceToFinalSnap(layoutManager, view);
            int i7 = iArrCalculateDistanceToFinalSnap[0];
            int i8 = iArrCalculateDistanceToFinalSnap[1];
            if (Math.abs(t7.f78314a) > 0) {
                iCalculateTimeForDeceleration = RangesKt.coerceIn((int) (((Math.max(Math.abs(i7), Math.abs(i8)) * 2.0f) * 1000.0f) / Math.abs(t7.f78314a)), 80, 600);
            } else {
                iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i7), Math.abs(i8)));
            }
            OvershootInterpolator overshootInterpolator = new OvershootInterpolator(0.3f);
            if (iCalculateTimeForDeceleration > 0) {
                action.update(i7, i8, iCalculateTimeForDeceleration, overshootInterpolator);
            }
        }
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        this.f78315b = recyclerView != null ? recyclerView.getContext() : null;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    @NotNull
    public final int[] calculateDistanceToFinalSnap(@NotNull RecyclerView.LayoutManager layoutManager, @NotNull View view) {
        return new int[]{0, layoutManager.canScrollVertically() ? layoutManager.getDecoratedTop(view) - layoutManager.getPaddingTop() : 0};
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public final RecyclerView.SmoothScroller createScroller(@NotNull RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)) {
            return null;
        }
        Context context = this.f78315b;
        return context == null ? super.createScroller(layoutManager) : new a(context, this, layoutManager);
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    @Nullable
    public final View findSnapView(@NotNull RecyclerView.LayoutManager layoutManager) {
        int iFindFirstVisibleItemPosition;
        View viewFindViewByPosition;
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return super.findSnapView(layoutManager);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (!linearLayoutManager.canScrollVertically() || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) == -1 || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
            return null;
        }
        int decoratedBottom = layoutManager.getDecoratedBottom(viewFindViewByPosition);
        int decoratedTop = layoutManager.getDecoratedTop(viewFindViewByPosition);
        int iMax = Math.max(decoratedTop, linearLayoutManager.getPaddingTop());
        int i7 = decoratedBottom - decoratedTop;
        View viewFindViewByPosition2 = viewFindViewByPosition;
        if (i7 != 0) {
            if (decoratedBottom - iMax >= i7 * 0.5f) {
                viewFindViewByPosition2 = viewFindViewByPosition;
            } else {
                viewFindViewByPosition2 = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition + 1);
                if (viewFindViewByPosition2 == null) {
                    viewFindViewByPosition2 = viewFindViewByPosition;
                }
            }
        }
        return viewFindViewByPosition2;
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public final int findTargetSnapPosition(@NotNull RecyclerView.LayoutManager layoutManager, int i7, int i8) {
        int iCoerceIn = -1;
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        }
        this.f78314a = i8;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1) {
            return -1;
        }
        int itemCount = linearLayoutManager.getItemCount();
        if (Math.abs(i8) < 200) {
            View viewFindSnapView = findSnapView(layoutManager);
            if (viewFindSnapView != null) {
                iCoerceIn = layoutManager.getPosition(viewFindSnapView);
            }
        } else {
            int i9 = iFindFirstVisibleItemPosition;
            if ((-i8) < 0) {
                i9 = iFindFirstVisibleItemPosition + 1;
            }
            iCoerceIn = RangesKt.coerceIn(i9, 0, itemCount - 1);
        }
        return iCoerceIn;
    }
}
