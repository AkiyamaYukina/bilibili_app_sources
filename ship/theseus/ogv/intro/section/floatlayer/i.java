package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.theme.R$color;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/i.class */
public final class i extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f93677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f93678b;

    public i(Context context) {
        this.f93678b = context;
        Paint paint = new Paint();
        paint.setColor(ContextCompat.getColor(context, R$color.Ga3_u));
        this.f93677a = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            rect.left = (int) Uj0.c.a(0.5f, view.getContext());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        for (int i7 = 1; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            float top = childAt.getTop();
            float fA = Uj0.c.a(18, this.f93678b);
            float bottom = childAt.getBottom();
            float fA2 = Uj0.c.a(16, this.f93678b);
            float left = childAt.getLeft();
            canvas.drawRect(left, fA + top, Uj0.c.a(0.5f, this.f93678b) + left, bottom - fA2, this.f93677a);
        }
    }
}
