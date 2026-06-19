package com.bilibili.ogv.review.reviewpublish;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ReviewPublishSuccessPosterContainer.class */
@StabilityInferred(parameters = 0)
public final class ReviewPublishSuccessPosterContainer extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Paint f72455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f72456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f72457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f72458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public View f72459e;

    @JvmOverloads
    public ReviewPublishSuccessPosterContainer(@NotNull Context context) {
        this(context, null);
    }

    @JvmOverloads
    public ReviewPublishSuccessPosterContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f72455a = paint;
        new Path();
        float f7 = 6 * 2.0f;
        this.f72456b = f7;
        this.f72457c = 25.0f;
        this.f72458d = f7;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@NotNull Canvas canvas) {
        setLayerType(2, null);
        View view = this.f72459e;
        super.dispatchDraw(canvas);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (view != null) {
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + view.getY();
            float f7 = this.f72458d;
            float f8 = this.f72457c;
            canvas.drawCircle(f7 - f8, measuredHeight2, f8, this.f72455a);
            float f9 = measuredWidth;
            float f10 = this.f72457c;
            canvas.drawCircle((f9 + f10) - this.f72458d, measuredHeight2, f10, this.f72455a);
        }
        Path path = new Path();
        RectF rectF = new RectF(0.0f, 0.0f, measuredWidth, measuredHeight);
        float f11 = this.f72456b;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        path.toggleInverseFillType();
        canvas.drawPath(path, this.f72455a);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f72459e = findViewById(2131299397);
    }
}
