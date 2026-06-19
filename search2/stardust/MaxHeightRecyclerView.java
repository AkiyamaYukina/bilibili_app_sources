package com.bilibili.search2.stardust;

import Al.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/MaxHeightRecyclerView.class */
@StabilityInferred(parameters = 0)
public class MaxHeightRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88729a;

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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.c, 0, 0);
        this.f88729a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i7, int i8) {
        int i9 = this.f88729a;
        if (i9 > 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
        }
        super/*androidx.recyclerview.widget.RecyclerView*/.onMeasure(i7, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setMaxHeight(int i7) {
        this.f88729a = i7;
        invalidate();
    }
}
