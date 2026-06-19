package com.bilibili.search2.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.mobile.BLMobileHumanActionNative;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/ExactHeightConstraintLayout.class */
@StabilityInferred(parameters = 0)
public final class ExactHeightConstraintLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88892a;

    @JvmOverloads
    public ExactHeightConstraintLayout(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public ExactHeightConstraintLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public ExactHeightConstraintLayout(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f88892a = -1;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9 = this.f88892a;
        if (i9 >= 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(i9, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
        }
        super.onMeasure(i7, i8);
    }

    public final void setExactHeight(int i7) {
        this.f88892a = i7;
        requestLayout();
    }
}
