package com.bilibili.search2.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.search2.component.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.FlowLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchFilterFlowLayout.class */
@StabilityInferred(parameters = 0)
public final class SearchFilterFlowLayout extends FlowLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88942f;

    @JvmOverloads
    public SearchFilterFlowLayout(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public SearchFilterFlowLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public SearchFilterFlowLayout(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        setOrientation(0);
        setSpacing(e.g(context) ? ListExtentionsKt.toPx(8) : ListExtentionsKt.toPx(6));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i7, int i8) throws NoWhenBranchMatchedException {
        int size = View.MeasureSpec.getSize(i7);
        e.a aVarB = e.b(getContext());
        int i9 = 4;
        if (aVarB.a()) {
            if (aVarB.f86403d > ListExtentionsKt.toPx(WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND)) {
                i9 = 6;
            }
        }
        this.f88942f = (((size - getPaddingLeft()) - getPaddingRight()) - ((i9 - 1) * getSpacing())) / i9;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            FlowLayout.a layoutParams = childAt.getLayoutParams();
            FlowLayout.a aVar = layoutParams instanceof FlowLayout.a ? layoutParams : null;
            if (aVar != null && !aVar.a) {
                childAt.setMinimumWidth(Intrinsics.areEqual(childAt.getTag(), "double_width") ? getSpacing() + (this.f88942f * 2) : this.f88942f);
            }
        }
        super.onMeasure(i7, i8);
    }
}
