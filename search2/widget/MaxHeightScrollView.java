package com.bilibili.search2.widget;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/MaxHeightScrollView.class */
@StabilityInferred(parameters = 0)
public final class MaxHeightScrollView extends ScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88893a;

    @JvmOverloads
    public MaxHeightScrollView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public MaxHeightScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i7) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.maxHeight});
            this.f88893a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9 = this.f88893a;
        if (i9 > 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i8);
    }

    public final void setMaxHeight(int i7) {
        this.f88893a = i7;
        requestLayout();
    }
}
