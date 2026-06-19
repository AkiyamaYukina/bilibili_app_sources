package com.bilibili.ogv.operation.modular.modules;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ogv.opbase.CommonCard;
import java.util.List;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/H.class */
@StabilityInferred(parameters = 0)
public final class H extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Ak0.c f70363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f70364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f70365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f70366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f70367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f70368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f70369g;

    @NotNull
    public final RectF h = new RectF();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Paint f70370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TextPaint f70371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f70372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f70373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f70374m;

    public H(@NotNull Context context, @NotNull Ak0.c cVar) {
        this.f70363a = cVar;
        this.f70364b = Uj0.c.a(20.0f, context);
        this.f70365c = Uj0.c.a(5.0f, context);
        this.f70366d = context.getResources().getDimension(2131166072);
        this.f70367e = Uj0.c.a(8.0f, context);
        this.f70368f = Uj0.c.a(2.0f, context);
        this.f70369g = Uj0.c.a(4.0f, context);
        Paint paint = new Paint(1);
        this.f70370i = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f70371j = textPaint;
        this.f70372k = cVar.f320b.get();
        this.f70373l = cVar.f321c.get();
        this.f70374m = "敬请期待";
        paint.setColor(ThemeUtils.getColorById(context, 2131100324));
        textPaint.setTextSize(Uj0.c.a(12.0f, context));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : -1;
        float f7 = this.f70366d;
        if (childAdapterPosition == itemCount - 1) {
            rect.right = (int) f7;
            rect.left = (int) f7;
        } else {
            rect.left = (int) f7;
        }
        rect.top = (int) (this.f70364b + this.f70365c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        String strConcat;
        super.onDraw(canvas, recyclerView, state);
        if (recyclerView.getChildCount() > 0) {
            Ak0.c cVar = this.f70363a;
            this.f70372k = cVar.f322d.get();
            this.f70373l = cVar.f321c.get();
            this.f70370i.setColor(cVar.f326i.get());
            if (recyclerView.getAdapter() instanceof F) {
                F f7 = (F) recyclerView.getAdapter();
                int childCount = recyclerView.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = recyclerView.getChildAt(i7);
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                    if (recyclerView.getAdapter() instanceof F) {
                        F f8 = (F) recyclerView.getAdapter();
                        List<CommonCard> list = f8.f70352c;
                        CommonCard commonCard = (list == null || list.isEmpty() || childAdapterPosition < 0 || childAdapterPosition >= f8.f70352c.size()) ? null : f8.f70352c.get(childAdapterPosition);
                        if (commonCard != null) {
                            int left = childAt != null ? childAt.getLeft() : 0;
                            int right = childAt != null ? childAt.getRight() : 0;
                            int top = childAt != null ? childAt.getTop() : 0;
                            String str = commonCard.f69730S;
                            String str2 = this.f70374m;
                            List listR = StringsKt.R((str == null || str.length() == 0) ? str2 : commonCard.f69730S, new String[]{" "}, 0, 6);
                            String str3 = !listR.isEmpty() ? (String) listR.get(0) : null;
                            String str4 = listR.size() > 1 ? (String) listR.get(1) : null;
                            if (str4 == null) {
                                strConcat = str3;
                            } else {
                                strConcat = str2;
                                if (str3 != null) {
                                    String strConcat2 = str3.concat(" ");
                                    strConcat = str2;
                                    if (strConcat2 != null) {
                                        strConcat = strConcat2.concat(str4);
                                        if (strConcat == null) {
                                            strConcat = str2;
                                        }
                                    }
                                }
                            }
                            float fMeasureText = this.f70371j.measureText(strConcat);
                            float f9 = this.f70369g;
                            float f10 = fMeasureText;
                            if (str4 != null) {
                                f10 = fMeasureText + f9;
                            }
                            float f11 = left;
                            float f12 = this.f70367e;
                            float f13 = ((((right - left) / 2.0f) + f11) - (f10 / 2.0f)) - f12;
                            RectF rectF = this.h;
                            rectF.left = f13;
                            float f14 = top - this.f70365c;
                            float f15 = this.f70364b;
                            rectF.top = f14 - f15;
                            float f16 = 2;
                            rectF.right = (f16 * f12) + f10 + f13;
                            rectF.bottom = f14;
                            canvas.drawRoundRect(rectF, f15, f15, this.f70370i);
                            if (str4 == null) {
                                this.f70371j.setColor(this.f70372k);
                                canvas.drawText(strConcat, f13 + f12, (Math.abs(this.f70371j.descent() + this.f70371j.ascent()) / f16) + (f15 / f16), this.f70371j);
                            } else {
                                float fMeasureText2 = this.f70371j.measureText(str3);
                                this.f70371j.setColor(this.f70372k);
                                float f17 = f13 + f12;
                                float f18 = f15 / f16;
                                canvas.drawText(str3, f17, (Math.abs(this.f70371j.descent() + this.f70371j.ascent()) / f16) + f18, this.f70371j);
                                this.f70371j.setColor(this.f70373l);
                                canvas.drawText(str4, f17 + fMeasureText2 + f9, (Math.abs(this.f70371j.descent() + this.f70371j.ascent()) / f16) + f18, this.f70371j);
                            }
                            RectF rectF2 = this.h;
                            float f19 = rectF2.right;
                            float f20 = this.f70366d / f16;
                            float f21 = f20 + right;
                            float f22 = f11 - f20;
                            float f23 = rectF2.left;
                            float f24 = this.f70368f;
                            if (childAdapterPosition == 0) {
                                float f25 = f15 / f16;
                                float f26 = f24 / f16;
                                canvas.drawRect(f19, f25 - f26, f21, f26 + f25, this.f70370i);
                            } else if (childAdapterPosition == f7.getItemCount() - 1) {
                                float f27 = f15 / f16;
                                float f28 = f24 / f16;
                                canvas.drawRect(f22, f27 - f28, f23, f28 + f27, this.f70370i);
                            } else {
                                float f29 = f15 / f16;
                                float f30 = f24 / f16;
                                float f31 = f29 - f30;
                                float f32 = f30 + f29;
                                canvas.drawRect(f22, f31, f23, f32, this.f70370i);
                                canvas.drawRect(f19, f31, f21, f32, this.f70370i);
                            }
                        }
                    }
                }
            }
        }
    }
}
