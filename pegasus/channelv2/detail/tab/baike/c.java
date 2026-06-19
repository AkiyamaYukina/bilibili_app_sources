package com.bilibili.pegasus.channelv2.detail.tab.baike;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.theme.R$color;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/c.class */
@StabilityInferred(parameters = 0)
public final class c extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f75137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Paint f75138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextPaint f75139c;

    public c(@NotNull Context context, @NotNull String str) {
        this.f75137a = str;
        Paint paint = new Paint(1);
        paint.setTextSize(ListExtentionsKt.sp2Px(16.0f, context));
        paint.setColor(context.getResources().getColor(R$color.Ga10));
        this.f75138b = paint;
        this.f75139c = new TextPaint(paint);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        int px;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            px = ListExtentionsKt.toPx(44.0f);
        } else {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            px = (adapter == null || adapter.getItemViewType(childAdapterPosition) != 2) ? 0 : ListExtentionsKt.toPx(10.0f);
        }
        rect.top = px;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        if (recyclerView.getChildAdapterPosition(recyclerView.getChildAt(0)) == 0) {
            canvas.drawText(TextUtils.ellipsize(this.f75137a, this.f75139c, recyclerView.getWidth(), TextUtils.TruncateAt.END).toString(), NewPlayerUtilsKt.toFloatPx(12.0f), r0.getTop() - NewPlayerUtilsKt.toFloatPx(12.0f), this.f75138b);
        }
    }
}
