package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.theme.R$color;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/C.class */
public final class C extends DividerItemDecoration {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f101761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A f101762f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Context context, A a7) {
        super(context, 1);
        this.f101762f = a7;
        Paint paintA = qe.i.a(true);
        paintA.setColor(ContextCompat.getColor(context, R$color.Line_regular));
        this.f101761e = paintA;
    }

    @Override // androidx.recyclerview.widget.DividerItemDecoration, androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (childAdapterPosition != (layoutManager != null ? layoutManager.getItemCount() : 0) - 1) {
            rect.bottom = this.f101762f.f101747o;
        } else {
            rect.bottom = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            A a7 = this.f101762f;
            int i8 = a7.f101747o;
            canvas.drawRect(childAt.getLeft() + a7.f101748p, bottom, (childAt.getWidth() + r0) - a7.f101748p, i8 + bottom, this.f101761e);
        }
    }
}
