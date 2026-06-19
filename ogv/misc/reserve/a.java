package com.bilibili.ogv.misc.reserve;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/reserve/a.class */
@StabilityInferred(parameters = 0)
public abstract class a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f69179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Paint f69180b;

    public a(@NotNull Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165780);
        this.f69179a = dimensionPixelSize;
        Paint paint = new Paint();
        this.f69180b = paint;
        paint.setStrokeWidth(dimensionPixelSize);
        paint.setAntiAlias(true);
    }

    public int a(@NotNull RecyclerView recyclerView) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        this.f69180b.setColor(ThemeUtils.getColorById(recyclerView.getContext(), R$color.Ga2));
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            float bottom = (childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin) - (this.f69179a / 2.0f);
            canvas.drawLine(a(recyclerView) + recyclerView.getPaddingLeft(), bottom, recyclerView.getWidth() - recyclerView.getPaddingRight(), bottom, this.f69180b);
        }
    }
}
