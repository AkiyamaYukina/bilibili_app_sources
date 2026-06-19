package com.bilibili.upper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/AutoSquareFrameLayout.class */
public class AutoSquareFrameLayout extends FrameLayout {
    public AutoSquareFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public AutoSquareFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        if (1073741824 != View.MeasureSpec.getMode(i7)) {
            i7 = i8;
        }
        setMeasuredDimension(i7, i7);
        super.onMeasure(i7, i7);
    }
}
