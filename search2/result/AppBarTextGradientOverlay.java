package com.bilibili.search2.result;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/AppBarTextGradientOverlay.class */
@StabilityInferred(parameters = 0)
public final class AppBarTextGradientOverlay extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f87043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Paint f87044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f87045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bitmap f87046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Canvas f87047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f87048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f87049g;

    @JvmOverloads
    public AppBarTextGradientOverlay(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public AppBarTextGradientOverlay(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public AppBarTextGradientOverlay(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f87043a = "AppBarTextGradientOverlay";
        setWillNotDraw(false);
        this.f87045c = TypedValue.applyDimension(1, 18.0f, getResources().getDisplayMetrics());
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f87044b = paint;
    }

    public final void a(boolean z6) {
        T9.e.a("needDrawGradientText ", this.f87043a, z6);
        this.f87049g = z6;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@NotNull Canvas canvas) {
        T9.e.a("dispatchDraw ", this.f87043a, this.f87049g);
        if (!this.f87049g) {
            super.dispatchDraw(canvas);
            return;
        }
        Bitmap bitmap = this.f87046d;
        Bitmap bitmap2 = bitmap;
        if (bitmap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tempBitmap");
            bitmap2 = null;
        }
        bitmap2.eraseColor(0);
        Canvas canvas2 = this.f87047e;
        Canvas canvas3 = canvas2;
        if (canvas2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tempCanvas");
            canvas3 = null;
        }
        super.dispatchDraw(canvas3);
        int[] iArr = {-1, 0};
        this.f87044b.setShader(new LinearGradient((getWidth() - this.f87045c) - this.f87048f, 0.0f, getWidth() - this.f87048f, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP));
        Canvas canvas4 = this.f87047e;
        if (canvas4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tempCanvas");
            canvas4 = null;
        }
        canvas4.drawRect((getWidth() - this.f87045c) - this.f87048f, 0.0f, getWidth() - this.f87048f, getHeight(), this.f87044b);
        Bitmap bitmap3 = this.f87046d;
        Bitmap bitmap4 = bitmap3;
        if (bitmap3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tempBitmap");
            bitmap4 = null;
        }
        canvas.drawBitmap(bitmap4, 0.0f, 0.0f, (Paint) null);
    }

    public final int getGradientMarginRight() {
        return this.f87048f;
    }

    @NotNull
    public final String getTAG() {
        return this.f87043a;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        com.bilibili.bplus.im.protobuf.a.b(i7, i8, "onSizeChanged ", " ", this.f87043a);
        if (i7 <= 0 || i8 <= 0) {
            return;
        }
        this.f87046d = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
        Bitmap bitmap = this.f87046d;
        Bitmap bitmap2 = bitmap;
        if (bitmap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tempBitmap");
            bitmap2 = null;
        }
        this.f87047e = new Canvas(bitmap2);
    }

    public final void setGradientMarginRight(int i7) {
        this.f87048f = i7;
    }
}
