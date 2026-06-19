package com.bilibili.search2.result.column;

import OS0.f0;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import z.L;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/e.class */
@StabilityInferred(parameters = 0)
public final class e extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f87738c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f87740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f87741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f87742g;
    public int h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f87739d = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f87743i = -1;

    @JvmOverloads
    public e(int i7, int i8, int i9, int i10, int i11) {
        this.f87736a = i7;
        this.f87737b = i8;
        this.f87738c = i9;
        this.f87740e = i10;
        this.f87741f = i11;
        this.f87742g = i7 / 4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        int i7;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        int itemCount = state.getItemCount();
        int viewLayoutPosition = layoutParams.getViewLayoutPosition();
        boolean z6 = layoutParams instanceof GridLayoutManager.LayoutParams;
        int spanIndex = 0;
        int i8 = 0;
        int i9 = this.f87739d;
        if (z6) {
            GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) layoutParams;
            int spanSize = layoutParams2.getSpanSize();
            int spanIndex2 = layoutParams2.getSpanIndex();
            if ((viewLayoutPosition == 0 || this.f87743i != itemCount) && i9 > 1) {
                for (int i10 = itemCount - i9; i10 < itemCount; i10++) {
                    i8 = ((GridLayoutManager) recyclerView.getLayoutManager()).getSpanSizeLookup().getSpanIndex(i10, i9) == 0 ? 1 : i8 + 1;
                }
                this.h = i8;
                if (this.f87743i != itemCount) {
                    this.f87743i = itemCount;
                    if (viewLayoutPosition != 0) {
                        recyclerView.post(new f0(recyclerView, 2));
                    }
                }
            }
            spanIndex = spanIndex2;
            i7 = spanSize;
        } else if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            StaggeredGridLayoutManager.LayoutParams layoutParams3 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            i7 = layoutParams3.isFullSpan() ? i9 : 1;
            spanIndex = layoutParams3.getSpanIndex();
        } else {
            i7 = 1;
        }
        if (i7 < 1 || spanIndex < 0 || i7 > i9) {
            return;
        }
        int i11 = this.f87742g;
        int iA = this.f87740e;
        rect.left = spanIndex == 0 ? iA : this.f87736a - (i11 * spanIndex);
        int i12 = spanIndex + i7;
        if (i12 < i9) {
            iA = L.a(i12, 1, i11, i11);
        }
        rect.right = iA;
        int i13 = this.f87738c;
        if (i9 == 1 && viewLayoutPosition == itemCount - 1) {
            rect.bottom = i13;
        } else if (viewLayoutPosition >= itemCount - this.h && viewLayoutPosition < itemCount) {
            rect.bottom = i13;
        }
        if (viewLayoutPosition < 0 || viewLayoutPosition >= i9) {
            rect.top = this.f87741f;
        } else {
            rect.top = this.f87737b;
        }
    }
}
