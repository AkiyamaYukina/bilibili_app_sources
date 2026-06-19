package com.bilibili.ogv.infra.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zj0.C9200a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/widget/RatioLayout.class */
@StabilityInferred(parameters = 0)
public final class RatioLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f67975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67976b;

    @JvmOverloads
    public RatioLayout(@NotNull Context context) {
        this(context, null);
    }

    @JvmOverloads
    public RatioLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67975a = Float.NaN;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9200a.f130329b);
        setRatioHeightOverWidth(typedArrayObtainStyledAttributes.getFloat(1, Float.NaN));
        float f7 = typedArrayObtainStyledAttributes.getFloat(0, Float.NaN);
        if (Float.isNaN(this.f67975a) && !Float.isNaN(f7)) {
            setAspectRatio(f7);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final float getAspectRatio() {
        return 1 / this.f67975a;
    }

    public final int getExtendBottom() {
        return this.f67976b;
    }

    public final float getRatioHeightOverWidth() {
        return this.f67975a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            r0 = r4
            float r0 = r0.f67975a
            r7 = r0
            r0 = r7
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L15
            r0 = r5
            r8 = r0
            r0 = r6
            r9 = r0
            goto L90
        L15:
            r0 = r5
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r10 = r0
            r0 = r6
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r11 = r0
            r0 = r10
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L35
            r0 = r5
            r8 = r0
            r0 = r6
            r9 = r0
            r0 = r11
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L90
        L35:
            r0 = r10
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L4c
            r0 = r11
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L4c
            r0 = r5
            r8 = r0
            r0 = r6
            r9 = r0
            goto L90
        L4c:
            r0 = r10
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L6f
            r0 = r5
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            float r0 = (float) r0
            r1 = r7
            float r0 = r0 * r1
            int r0 = kotlin.math.MathKt.roundToInt(r0)
            r1 = r4
            int r1 = r1.f67976b
            int r0 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = r0
            r0 = r5
            r8 = r0
            goto L90
        L6f:
            r0 = r5
            r8 = r0
            r0 = r6
            r9 = r0
            r0 = r11
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L90
            r0 = r6
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            float r0 = (float) r0
            r1 = r7
            float r0 = r0 / r1
            int r0 = kotlin.math.MathKt.roundToInt(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r8 = r0
            r0 = r6
            r9 = r0
        L90:
            r0 = r4
            r1 = r8
            r2 = r9
            super.onMeasure(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.infra.widget.RatioLayout.onMeasure(int, int):void");
    }

    public final void setAspectRatio(float f7) {
        setRatioHeightOverWidth(1 / f7);
    }

    public final void setExtendBottom(int i7) {
        this.f67976b = i7;
        requestLayout();
    }

    public final void setRatioHeightOverWidth(float f7) {
        this.f67975a = f7;
        requestLayout();
    }
}
