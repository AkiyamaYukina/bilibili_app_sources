package com.bilibili.pegasus.verticaltab.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/widget/MaxHeightNoNestedScrollView.class */
@StabilityInferred(parameters = 0)
public final class MaxHeightNoNestedScrollView extends ScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public int[] f78987b;

    @JvmOverloads
    public MaxHeightNoNestedScrollView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public MaxHeightNoNestedScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaxHeightNoNestedScrollView(Context context, AttributeSet attributeSet, int i7) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.f78986a = -1;
        int[] iArr = {R.attr.maxHeight};
        this.f78987b = iArr;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        this.f78986a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @NotNull
    public final int[] getSAttrs() {
        return this.f78987b;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9 = this.f78986a;
        if (i9 >= 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i8);
    }

    public final void setSAttrs(@NotNull int[] iArr) {
        this.f78987b = iArr;
    }
}
