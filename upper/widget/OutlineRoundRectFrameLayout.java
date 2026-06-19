package com.bilibili.upper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/OutlineRoundRectFrameLayout.class */
@StabilityInferred(parameters = 0)
public class OutlineRoundRectFrameLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f114401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114402b;

    public OutlineRoundRectFrameLayout(@NotNull Context context) {
        super(context);
        j0(context, null);
    }

    public OutlineRoundRectFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        j0(context, attributeSet);
    }

    private final float[] getRoundRectRadii() {
        int i7 = this.f114402b;
        if (i7 == 0) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        if (i7 == 1) {
            float f7 = this.f114401a;
            return new float[]{f7, f7, f7, f7, f7, f7, f7, f7};
        }
        if (i7 == 2) {
            float f8 = this.f114401a;
            return new float[]{f8, f8, 0.0f, 0.0f, f8, f8, 0.0f, 0.0f};
        }
        if (i7 == 3) {
            float f9 = this.f114401a;
            return new float[]{f9, f9, f9, f9, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        if (i7 == 4) {
            float f10 = this.f114401a;
            return new float[]{0.0f, 0.0f, f10, f10, 0.0f, 0.0f, f10, f10};
        }
        if (i7 != 5) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        float f11 = this.f114401a;
        return new float[]{0.0f, 0.0f, 0.0f, 0.0f, f11, f11, f11, f11};
    }

    public final void j0(Context context, AttributeSet attributeSet) {
        int i7 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, IE0.a.f10167g, 0, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        if (dimension > 0.0f) {
            i7 = 1;
        }
        this.f114402b = typedArrayObtainStyledAttributes.getInt(1, i7);
        typedArrayObtainStyledAttributes.recycle();
        setRadius(dimension);
        new Rect();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
    }

    public final void setRadius(float f7) {
        if (this.f114401a == f7) {
            return;
        }
        this.f114401a = f7;
        boolean z6 = f7 > 0.0f;
        setWillNotDraw(!z6);
        if (!z6) {
            setClipToOutline(false);
            return;
        }
        setClipToOutline(true);
        int i7 = this.f114402b;
        setOutlineProvider(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? new B(0) : new x(this) : new z(this) : new w(this) : new y(this) : new A(this));
    }
}
