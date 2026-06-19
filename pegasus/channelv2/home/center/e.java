package com.bilibili.pegasus.channelv2.home.center;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import kotlin.collections.IntIterator;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/e.class */
public final class e extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Paint f75275a = new Paint();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75276b = ListExtentionsKt.toPx(10.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75277c = ListExtentionsKt.toPx(0.5d);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f75278d = ListExtentionsKt.toPx(12.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f75279e = R$color.Ga1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f75280f = R$color.Ga2;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(androidx.recyclerview.widget.RecyclerView.ViewHolder r4, int r5, androidx.recyclerview.widget.RecyclerView r6) {
        /*
            r0 = r6
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            r11 = r0
            r0 = 0
            r7 = r0
            r0 = r11
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = 1
            r8 = r0
            r0 = r11
            r1 = r5
            r2 = 1
            int r1 = r1 - r2
            android.view.View r0 = r0.getChildAt(r1)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = r11
            r1 = r6
            int r0 = r0.getItemViewType(r1)
            r9 = r0
            r0 = r4
            int r0 = r0.getItemViewType()
            r10 = r0
            r0 = r10
            r1 = 100
            int r0 = r0 / r1
            r1 = r9
            r2 = 100
            int r1 = r1 / r2
            if (r0 == r1) goto L41
            r0 = 1
            r5 = r0
            goto L80
        L41:
            r0 = r9
            r1 = 100
            int r0 = r0 % r1
            if (r0 != 0) goto L4f
            r0 = r8
            r5 = r0
            goto L51
        L4f:
            r0 = 0
            r5 = r0
        L51:
            r0 = r5
            if (r0 != 0) goto L6a
            r0 = r10
            r1 = 301(0x12d, float:4.22E-43)
            if (r0 == r1) goto L65
            r0 = r10
            r1 = 503(0x1f7, float:7.05E-43)
            if (r0 != r1) goto L6a
        L65:
            r0 = 2
            r5 = r0
            goto L80
        L6a:
            r0 = r7
            r5 = r0
            r0 = r10
            r1 = r9
            if (r0 != r1) goto L80
            r0 = r7
            r5 = r0
            r0 = r10
            r1 = 601(0x259, float:8.42E-43)
            if (r0 != r1) goto L80
            goto L65
        L80:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.home.center.e.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, androidx.recyclerview.widget.RecyclerView):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        boolean z6 = childViewHolder.getItemViewType() % 100 == 0;
        int i7 = this.f75277c;
        if (z6 && childLayoutPosition > 0) {
            rect.top = this.f75276b + i7;
        }
        if (a(childViewHolder, childLayoutPosition, recyclerView) == 2) {
            rect.bottom = i7;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        super.onDrawOver(canvas, recyclerView, state);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        IntIterator it = RangesKt.until(0, layoutManager.getChildCount()).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            View childAt = layoutManager.getChildAt(iNextInt);
            if (childAt != null) {
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                getItemOffsets(new Rect(), childAt, recyclerView, state);
                float translationY = childAt.getTranslationY() + ((childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - r0.top);
                int iA = a(childViewHolder, iNextInt, recyclerView);
                if (iA == 1) {
                    this.f75275a.setColor(ColorUtils.setAlphaComponent(ThemeUtils.getColorById(recyclerView.getContext(), this.f75279e), (int) (childAt.getAlpha() * 255)));
                    canvas.drawRect(0.0f, translationY, recyclerView.getWidth(), translationY + this.f75276b, this.f75275a);
                } else if (iA == 2) {
                    this.f75275a.setColor(ColorUtils.setAlphaComponent(ThemeUtils.getColorById(recyclerView.getContext(), this.f75280f), (int) (childAt.getAlpha() * 255)));
                    canvas.drawRect(this.f75278d, translationY, recyclerView.getWidth(), translationY + this.f75277c, this.f75275a);
                }
            }
        }
    }
}
