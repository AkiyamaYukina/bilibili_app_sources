package com.bilibili.ship.theseus.ogv.intro.coupon;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/coupon/MaxHeightRecyclerView.class */
@Deprecated(message = "Rubbish.")
@StabilityInferred(parameters = 0)
public final class MaxHeightRecyclerView extends RecyclerView {
    public MaxHeightRecyclerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i8) {
        int size = View.MeasureSpec.getSize(i8);
        int iB = Uj0.c.b(224, getContext());
        if (size > iB) {
            i8 = View.MeasureSpec.makeMeasureSpec(iB, Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i8);
    }
}
