package com.bilibili.pegasus.page;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/s.class */
@StabilityInferred(parameters = 0)
public final class C5729s extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f78436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final r f78437b = new r(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Paint f78438c;

    public C5729s(@NotNull Context context) {
        this.f78436a = context;
        Paint paintA = qe.i.a(false);
        paintA.setStyle(Paint.Style.FILL);
        this.f78438c = paintA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            return;
        }
        rect.left = 0;
        rect.right = 0;
        rect.bottom = 0;
        ViewOutlineProvider outlineProvider = view.getOutlineProvider();
        r rVar = this.f78437b;
        if (outlineProvider != rVar) {
            view.setOutlineProvider(rVar);
            view.setClipToOutline(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        int iCoerceAtLeast;
        super.onDraw(canvas, recyclerView, state);
        this.f78438c.setColor(ThemeUtils.getColorById(this.f78436a, R$color.f64616Wh0));
        int paddingTop = recyclerView.getPaddingTop();
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            if (childAt != null && recyclerView.getChildAdapterPosition(childAt) >= 1 && (iCoerceAtLeast = RangesKt.coerceAtLeast(childAt.getTop(), paddingTop)) < childAt.getBottom()) {
                canvas.drawRect(childAt.getLeft(), iCoerceAtLeast, childAt.getRight(), childAt.getBottom(), this.f78438c);
            }
        }
    }
}
