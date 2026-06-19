package com.bilibili.ship.theseus.cheese.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/widget/MaxHeightRecyclerView.class */
@StabilityInferred(parameters = 0)
public final class MaxHeightRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90806a;

    @JvmOverloads
    public MaxHeightRecyclerView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public MaxHeightRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaxHeightRecyclerView(Context context, AttributeSet attributeSet, int i7, int i8) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Zt0.a.f29775c, 0, 0);
        this.f90806a = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9 = this.f90806a;
        if (i9 > 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i8);
    }
}
