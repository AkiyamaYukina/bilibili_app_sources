package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.theme.R$color;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/f.class */
public final class f extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f93654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f93655b;

    public f(Context context) {
        this.f93655b = context;
        Paint paintA = qe.i.a(true);
        paintA.setColor(ContextCompat.getColor(context, R$color.Line_regular));
        this.f93654a = paintA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            rect.left = Uj0.c.b(12, this.f93655b);
        }
        rect.right = Uj0.c.b(13, this.f93655b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        float f7 = 12;
        int iB = Uj0.c.b(f7, this.f93655b);
        for (View view : ViewGroupKt.getChildren(recyclerView)) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition != recyclerView.getChildCount() - 1 && childAdapterPosition != -1) {
                int height = view.getHeight();
                int paddingTop = recyclerView.getPaddingTop();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                float top = ((height - iB) / 2.0f) + view.getTop() + paddingTop + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r10.topMargin : 0);
                float f8 = iB;
                int right = view.getRight();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                canvas.drawRect(Uj0.c.b(f7, this.f93655b) + right + (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0), top, Uj0.c.b(1, this.f93655b) + r0, top + f8, this.f93654a);
            }
        }
    }
}
