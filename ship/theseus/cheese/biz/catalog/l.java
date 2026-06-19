package com.bilibili.ship.theseus.cheese.biz.catalog;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bu0.C5165a;
import eu0.C6979B;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/l.class */
public final class l extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheeseCatalogTabFragment f89181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f89183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextPaint f89184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f89185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f89186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f89187g;

    public l(CheeseCatalogTabFragment cheeseCatalogTabFragment, int i7, float f7, TextPaint textPaint, Rect rect, int i8, Paint paint) {
        this.f89181a = cheeseCatalogTabFragment;
        this.f89182b = i7;
        this.f89183c = f7;
        this.f89184d = textPaint;
        this.f89185e = rect;
        this.f89186f = i8;
        this.f89187g = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if ((childViewHolder instanceof bu0.j) || (childViewHolder instanceof bu0.i)) {
            if (childAdapterPosition == 0) {
                rect.top = Lh1.b.b(8.0f);
            } else {
                rect.top = 0;
            }
            C5165a c5165a = (C5165a) CollectionsKt.getOrNull(this.f89181a.f89141m.f57024e, childAdapterPosition + 1);
            if ((c5165a != null ? c5165a.f57015b : null) instanceof C6979B) {
                rect.bottom = 0;
            } else {
                rect.bottom = Lh1.b.b(8.0f);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int iIntValue;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        String str;
        int iCoerceAtMost;
        float fHeight;
        super.onDrawOver(canvas, recyclerView, state);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        bu0.c cVar = adapter instanceof bu0.c ? (bu0.c) adapter : null;
        if (cVar == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            Integer numValueOf = Integer.valueOf(iFindFirstVisibleItemPosition);
            if (iFindFirstVisibleItemPosition < 0) {
                numValueOf = null;
            }
            if (numValueOf == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition((iIntValue = numValueOf.intValue()))) == null || (view = viewHolderFindViewHolderForAdapterPosition.itemView) == null) {
                return;
            }
            C5165a c5165a = (C5165a) CollectionsKt.getOrNull(cVar.f57024e, iIntValue + 1);
            Object obj = null;
            if (c5165a != null) {
                obj = c5165a.f57015b;
            }
            boolean z6 = obj instanceof C6979B;
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth();
            int paddingRight = recyclerView.getPaddingRight();
            int paddingTop = recyclerView.getPaddingTop();
            C6979B c6979bP = cVar.P(iIntValue);
            if (c6979bP == null || (str = c6979bP.f117493b) == null) {
                return;
            }
            int measuredWidth = recyclerView.getMeasuredWidth();
            int i7 = this.f89182b;
            int iBreakText = this.f89184d.breakText(str, 0, str.length(), true, (((measuredWidth - (i7 * 2)) - this.f89183c) - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight(), new float[1]);
            String strA = str;
            if (iBreakText >= 0) {
                strA = str;
                if (iBreakText < str.length()) {
                    strA = G.p.a(str.substring(0, iBreakText), "...");
                }
            }
            this.f89184d.getTextBounds(strA, 0, strA.length(), this.f89185e);
            int i8 = this.f89186f;
            if (z6) {
                iCoerceAtMost = RangesKt.coerceAtMost(i8, view.getBottom() - paddingTop) + paddingTop;
                int i9 = i8 + paddingTop;
                fHeight = ((this.f89185e.height() + i9) / 2.0f) - (i9 - iCoerceAtMost);
            } else {
                iCoerceAtMost = paddingTop + i8;
                fHeight = (this.f89185e.height() + iCoerceAtMost) / 2.0f;
            }
            canvas.drawRect(paddingLeft, paddingTop, width - paddingRight, iCoerceAtMost, this.f89187g);
            canvas.drawText(strA, paddingLeft + i7, fHeight, this.f89184d);
        }
    }
}
