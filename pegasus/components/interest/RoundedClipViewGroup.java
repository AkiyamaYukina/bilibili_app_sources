package com.bilibili.pegasus.components.interest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintFrameLayout;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/RoundedClipViewGroup.class */
@StabilityInferred(parameters = 0)
public final class RoundedClipViewGroup extends TintFrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Path f76320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RectF f76321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final float[] f76322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f76323d;

    @JvmOverloads
    public RoundedClipViewGroup(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public RoundedClipViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public RoundedClipViewGroup(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f76320a = new Path();
        this.f76321b = new RectF();
        float[] fArr = new float[8];
        for (int i9 = 0; i9 < 8; i9++) {
            fArr[i9] = 0.0f;
        }
        this.f76322c = fArr;
        setLayerType(2, null);
    }

    private final void set_radius(float f7) {
        this.f76323d = f7;
        int length = this.f76322c.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f76322c[i7] = this.f76323d;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@NotNull Canvas canvas) {
        for (float f7 : this.f76322c) {
            if (f7 > 0.0f) {
                Path path = this.f76320a;
                int iSave = canvas.save();
                canvas.clipPath(path);
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(@NotNull Canvas canvas) {
        for (float f7 : this.f76322c) {
            if (f7 > 0.0f) {
                Path path = this.f76320a;
                int iSave = canvas.save();
                canvas.clipPath(path);
                try {
                    super.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        this.f76320a.reset();
        this.f76321b.set(0.0f, 0.0f, getWidth(), getHeight());
        for (float f7 : this.f76322c) {
            if (f7 != 0.0f) {
                this.f76320a.addRoundRect(this.f76321b, this.f76322c, Path.Direction.CW);
                this.f76320a.close();
                return;
            }
        }
    }

    public final void setRadius(float f7) {
        set_radius(f7);
        invalidate();
    }

    public final void setRadiusDp(float f7) {
        setRadius(f7 * getContext().getResources().getDisplayMetrics().density);
    }
}
