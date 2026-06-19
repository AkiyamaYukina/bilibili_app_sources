package com.bilibili.pegasus.channelv2.detail.tab.baike.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import do0.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/widget/c.class */
@StabilityInferred(parameters = 0)
public final class c extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75214a = R$color.Ga2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f75215b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Paint f75216c;

    public c() {
        Paint paint = new Paint();
        this.f75216c = paint;
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        super.onDrawOver(canvas, recyclerView, state);
        if (state.willRunPredictiveAnimations() || state.willRunSimpleAnimations()) {
            return;
        }
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.isRunning()) {
            this.f75216c.setColor(ThemeUtils.getColorById(recyclerView.getContext(), this.f75214a));
            int childCount = recyclerView.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = recyclerView.getChildAt(i7);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int left = recyclerView.getLeft();
                int width = recyclerView.getWidth();
                float bottom = (childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - (this.f75215b / 2.0f);
                if (recyclerView.getChildViewHolder(childAt) instanceof h) {
                    canvas.drawLine(left, bottom, width, bottom, this.f75216c);
                }
            }
        }
    }
}
