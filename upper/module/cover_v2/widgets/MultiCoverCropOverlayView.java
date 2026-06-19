package com.bilibili.upper.module.cover_v2.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import com.yalantis.ucrop.util.RectUtils;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/MultiCoverCropOverlayView.class */
@StabilityInferred(parameters = 0)
public class MultiCoverCropOverlayView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public LH0.a f113026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public float[] f113027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final float[] f113028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Paint f113029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Paint f113030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f113031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f113032g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f113033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f113034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f113035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Paint f113036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f113037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f113038n;

    @JvmOverloads
    public MultiCoverCropOverlayView(@Nullable Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public MultiCoverCropOverlayView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public MultiCoverCropOverlayView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f113028c = new float[32];
        Paint paint = new Paint(1);
        this.f113029d = paint;
        this.f113032g = 2;
        this.h = 2;
        this.f113035k = true;
        this.f113036l = new Paint();
        this.f113037m = true;
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131167054);
        this.f113031f = getResources().getColor(2131104045);
        paint.setStrokeWidth(dimensionPixelSize);
        paint.setColor(getResources().getColor(2131104280));
        paint.setStyle(Paint.Style.STROKE);
        this.f113033i = getResources().getDisplayMetrics().density * 16;
        this.f113034j = getResources().getDisplayMetrics().density * 14;
        Paint paint2 = new Paint(1);
        this.f113030e = paint2;
        paint2.setStrokeWidth(getResources().getDisplayMetrics().density * 2);
        paint2.setColor(getResources().getColor(2131103591));
    }

    private final void setOverlayColor(@ColorRes int i7) {
        this.f113031f = getResources().getColor(i7);
    }

    public final void a() {
        setOverlayColor(2131104045);
        this.f113035k = true;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        int i7;
        int i8;
        int i9;
        super.onDraw(canvas);
        if (this.f113026a == null) {
            return;
        }
        canvas.save();
        canvas.clipRect(this.f113026a.f14537b, Region.Op.DIFFERENCE);
        canvas.drawColor(this.f113031f);
        canvas.restore();
        if (this.f113037m) {
            RectF rectF = this.f113026a.f14537b;
            canvas.save();
            this.f113036l.setColor(ViewCompat.MEASURED_STATE_MASK);
            this.f113036l.setStyle(Paint.Style.FILL);
            canvas.drawRect(0.0f, 0.0f, getWidth(), rectF.top, this.f113036l);
            canvas.drawRect(0.0f, rectF.bottom, getWidth(), getHeight(), this.f113036l);
            canvas.restore();
        }
        if (this.f113038n) {
            RectF rectF2 = this.f113026a.f14537b;
            canvas.save();
            this.f113036l.setColor(ViewCompat.MEASURED_STATE_MASK);
            this.f113036l.setStyle(Paint.Style.FILL);
            canvas.drawRect(0.0f, 0.0f, rectF2.left, getHeight(), this.f113036l);
            canvas.drawRect(rectF2.right, 0.0f, getWidth(), getHeight(), this.f113036l);
            canvas.restore();
        }
        LH0.a aVar = this.f113026a;
        if (aVar != null) {
            if (this.f113027b == null && !aVar.f14537b.isEmpty()) {
                int i10 = this.f113032g;
                this.f113027b = new float[(this.h * 4) + (i10 * 4)];
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    i9 = i12;
                    if (i11 >= i10) {
                        break;
                    }
                    float[] fArr = this.f113027b;
                    RectF rectF3 = this.f113026a.f14537b;
                    fArr[i9] = rectF3.left;
                    float fHeight = rectF3.height();
                    float f7 = i11 + 1.0f;
                    float f8 = f7 / (this.f113032g + 1);
                    RectF rectF4 = this.f113026a.f14537b;
                    fArr[i9 + 1] = (f8 * fHeight) + rectF4.top;
                    float[] fArr2 = this.f113027b;
                    fArr2[i9 + 2] = rectF4.right;
                    fArr2[i9 + 3] = ((f7 / (this.f113032g + 1)) * rectF4.height()) + this.f113026a.f14537b.top;
                    i11++;
                    i12 = i9 + 4;
                }
                int i13 = this.h;
                int i14 = 0;
                while (true) {
                    int i15 = i9;
                    if (i14 >= i13) {
                        break;
                    }
                    float[] fArr3 = this.f113027b;
                    float fWidth = this.f113026a.f14537b.width();
                    float f9 = i14 + 1.0f;
                    float f10 = f9 / (this.h + 1);
                    RectF rectF5 = this.f113026a.f14537b;
                    fArr3[i15] = (f10 * fWidth) + rectF5.left;
                    float[] fArr4 = this.f113027b;
                    fArr4[i15 + 1] = rectF5.top;
                    float fWidth2 = rectF5.width();
                    float f11 = f9 / (this.h + 1);
                    RectF rectF6 = this.f113026a.f14537b;
                    fArr4[i15 + 2] = (f11 * fWidth2) + rectF6.left;
                    i9 = i15 + 4;
                    this.f113027b[i15 + 3] = rectF6.bottom;
                    i14++;
                }
            }
            canvas.drawRect(this.f113026a.f14537b, this.f113029d);
        }
        if (!this.f113035k || this.f113026a == null) {
            return;
        }
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = i17;
            i7 = 0;
            i8 = i18;
            if (i16 >= 2) {
                break;
            }
            float f12 = 1;
            this.f113028c[i18] = this.f113026a.f14537b.left - (getResources().getDisplayMetrics().density * f12);
            float[] fArr5 = this.f113028c;
            float fHeight2 = this.f113026a.f14537b.height();
            float f13 = i16;
            RectF rectF7 = this.f113026a.f14537b;
            fArr5[i18 + 1] = (fHeight2 * f13) + rectF7.top;
            float[] fArr6 = this.f113028c;
            fArr6[i18 + 2] = rectF7.left + this.f113033i;
            float fHeight3 = rectF7.height();
            RectF rectF8 = this.f113026a.f14537b;
            fArr6[i18 + 3] = (fHeight3 * f13) + rectF8.top;
            float[] fArr7 = this.f113028c;
            fArr7[i18 + 4] = rectF8.right - this.f113033i;
            float fHeight4 = rectF8.height();
            RectF rectF9 = this.f113026a.f14537b;
            fArr7[i18 + 5] = (fHeight4 * f13) + rectF9.top;
            this.f113028c[i18 + 6] = (getResources().getDisplayMetrics().density * f12) + rectF9.right;
            i17 = i18 + 8;
            this.f113028c[i18 + 7] = (this.f113026a.f14537b.height() * f13) + this.f113026a.f14537b.top;
            i16++;
        }
        while (true) {
            int i19 = i8;
            if (i7 >= 2) {
                canvas.drawLines(this.f113028c, this.f113030e);
                return;
            }
            float[] fArr8 = this.f113028c;
            float fWidth3 = this.f113026a.f14537b.width();
            float f14 = i7;
            RectF rectF10 = this.f113026a.f14537b;
            fArr8[i19] = (fWidth3 * f14) + rectF10.left;
            float f15 = 1;
            this.f113028c[i19 + 1] = rectF10.top - (getResources().getDisplayMetrics().density * f15);
            float[] fArr9 = this.f113028c;
            float fWidth4 = this.f113026a.f14537b.width();
            RectF rectF11 = this.f113026a.f14537b;
            fArr9[i19 + 2] = (fWidth4 * f14) + rectF11.left;
            float[] fArr10 = this.f113028c;
            fArr10[i19 + 3] = rectF11.top + this.f113034j;
            float fWidth5 = rectF11.width();
            RectF rectF12 = this.f113026a.f14537b;
            fArr10[i19 + 4] = (fWidth5 * f14) + rectF12.left;
            float[] fArr11 = this.f113028c;
            fArr11[i19 + 5] = rectF12.bottom - this.f113034j;
            float fWidth6 = rectF12.width();
            RectF rectF13 = this.f113026a.f14537b;
            fArr11[i19 + 6] = (fWidth6 * f14) + rectF13.left;
            i8 = i19 + 8;
            this.f113028c[i19 + 7] = (getResources().getDisplayMetrics().density * f15) + rectF13.bottom;
            i7++;
        }
    }

    public final void setLeftRightBlackEnable(boolean z6) {
        this.f113038n = z6;
        invalidate();
    }

    public final void setMultiRect(@Nullable LH0.a aVar) {
        this.f113026a = aVar;
        if (aVar != null) {
            RectUtils.getCornersFromRect(aVar.f14537b);
            RectUtils.getCenterFromRect(this.f113026a.f14537b);
        }
        invalidate();
    }

    public final void setShowSideAngle(boolean z6) {
        this.f113035k = z6;
    }

    public final void setUpDownBlackEnable(boolean z6) {
        this.f113037m = z6;
        invalidate();
    }
}
