package com.bilibili.search2.result.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import dt0.AbstractC6843f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/widget/m.class */
@StabilityInferred(parameters = 0)
public final class m extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f88656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f88657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f88658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Paint f88659g;
    public final int h;

    public m(int i7, int i8, int i9, int i10, boolean z6) {
        int i11 = R$color.Ga2;
        int px = ListExtentionsKt.toPx(0.5f);
        i9 = (i10 & 32) != 0 ? 0 : i9;
        this.f88653a = i11;
        this.f88654b = px;
        this.f88655c = i7;
        this.f88656d = i8;
        this.f88657e = z6;
        this.f88658f = i9;
        Paint paint = new Paint();
        paint.setStrokeWidth(px);
        paint.setAntiAlias(true);
        this.f88659g = paint;
        this.h = ListExtentionsKt.toPx(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        if (this.f88657e) {
            Object childViewHolder = recyclerView.getChildViewHolder(view);
            AbstractC6843f abstractC6843f = childViewHolder instanceof AbstractC6843f ? (AbstractC6843f) childViewHolder : null;
            if (abstractC6843f == null) {
                return;
            }
            if (!(abstractC6843f instanceof Et0.d) || ((Et0.d) abstractC6843f).needWideScreenMargin()) {
                int i7 = this.h;
                rect.left = i7;
                rect.right = i7;
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                if (gridLayoutManager == null || gridLayoutManager.getSpanCount() <= 1) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                GridLayoutManager.LayoutParams layoutParams2 = null;
                if (layoutParams instanceof GridLayoutManager.LayoutParams) {
                    layoutParams2 = (GridLayoutManager.LayoutParams) layoutParams;
                }
                int spanIndex = layoutParams2 != null ? layoutParams2.getSpanIndex() : 0;
                boolean z6 = spanIndex == 0;
                boolean z7 = spanIndex == gridLayoutManager.getSpanCount() - 1;
                int i8 = this.f88658f;
                if (i8 > 0) {
                    if (z6) {
                        rect.right = i8;
                    }
                    if (z7) {
                        rect.left = i8;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            this.f88659g.setColor(ThemeUtils.getColorById(recyclerView.getContext(), this.f88653a));
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            boolean z6 = linearLayoutManager.getOrientation() == 1;
            int childCount = recyclerView.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = recyclerView.getChildAt(i7);
                Object childViewHolder = recyclerView.getChildViewHolder(childAt);
                if (!(childViewHolder instanceof Et0.a) || ((Et0.a) childViewHolder).isNeedDrawDivider()) {
                    int left = childAt.getLeft();
                    int i8 = this.h;
                    int i9 = z6 ? this.f88655c - i8 : 0;
                    int right = childAt.getRight();
                    int i10 = z6 ? this.f88656d - i8 : 0;
                    float translationY = childAt.getTranslationY() + ((childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin) - (this.f88654b / 2.0f));
                    this.f88659g.setAlpha((int) (childAt.getAlpha() * 255));
                    canvas.drawLine(left + i9, translationY, right - i10, translationY, this.f88659g);
                }
            }
        }
    }
}
