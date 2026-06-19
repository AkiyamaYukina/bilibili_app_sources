package com.bilibili.search2.result.holder.aichat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import kntr.app.search.aicard.container.CardLayoutMode;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/k.class */
@StabilityInferred(parameters = 0)
public final class k extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f87788a = DimenUtilsKt.dpToPx(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87789b = DimenUtilsKt.dpToPx(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f87790c = DimenUtilsKt.dpToPx(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f87791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f87792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Paint f87793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final RectF f87794g;

    @NotNull
    public final Path h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Path f87795i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/k$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f87796a;

        static {
            int[] iArr = new int[CardLayoutMode.values().length];
            try {
                iArr[CardLayoutMode.CORNER_MASK.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[CardLayoutMode.EXTRA_MARGIN.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[CardLayoutMode.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f87796a = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public k(@NotNull Context context) throws NoWhenBranchMatchedException {
        float f7;
        int iDpToPx;
        int i7 = a.f87796a[(com.bilibili.search2.component.e.h(context) ? CardLayoutMode.CORNER_MASK : com.bilibili.search2.component.e.i(context) ? CardLayoutMode.EXTRA_MARGIN : CardLayoutMode.DEFAULT).ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                iDpToPx = DimenUtilsKt.dpToPx(8);
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iDpToPx = DimenUtilsKt.dpToPx(5);
            }
            f7 = iDpToPx;
        } else {
            f7 = 0.0f;
        }
        this.f87791d = f7;
        this.f87792e = DimenUtilsKt.dpToPx(10);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(ResourcesCompat.getColor(context.getResources(), R$color.Bg1, null));
        paint.setShadowLayer(DimenUtilsKt.dpToPx(12), 0.0f, DimenUtilsKt.dpToPx(4), MultipleThemeUtils.isNightTheme(context) ? Color.parseColor("#CC000000") : Color.parseColor("#14000000"));
        this.f87793f = paint;
        this.f87794g = new RectF();
        this.h = new Path();
        this.f87795i = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        if (childViewHolder != null && (childViewHolder instanceof SearchAIChatHolder)) {
            rect.bottom = this.f87789b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
            if (childViewHolder != null && (childViewHolder instanceof SearchAIChatHolder)) {
                float left = childAt.getLeft();
                float translationX = childAt.getTranslationX();
                float f7 = this.f87791d;
                float f8 = translationX + left + f7;
                float translationY = childAt.getTranslationY() + childAt.getTop() + this.f87792e;
                float translationX2 = (childAt.getTranslationX() + childAt.getRight()) - f7;
                float translationY2 = childAt.getTranslationY() + childAt.getBottom();
                this.f87794g.set(f8, translationY, translationX2, translationY2);
                this.h.reset();
                Path path = this.h;
                RectF rectF = this.f87794g;
                Path.Direction direction = Path.Direction.CW;
                float f9 = this.f87788a;
                path.addRoundRect(rectF, f9, f9, direction);
                this.f87795i.reset();
                Path path2 = this.f87795i;
                float f10 = this.f87790c;
                path2.addRect(f8 - f10, translationY - f10, translationX2 + f10, translationY2 + this.f87789b + f10, direction);
                this.f87795i.addRoundRect(this.f87794g, f9, f9, Path.Direction.CCW);
                this.f87795i.setFillType(Path.FillType.EVEN_ODD);
                Path path3 = this.f87795i;
                int iSave = canvas.save();
                canvas.clipPath(path3);
                try {
                    canvas.drawPath(this.h, this.f87793f);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
    }
}
