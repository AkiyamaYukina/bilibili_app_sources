package com.bilibili.pegasus.channelv2.detail.tab.baike;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/BaikeNavigationBottomSheetBehavior.class */
@StabilityInferred(parameters = 0)
public final class BaikeNavigationBottomSheetBehavior extends BottomSheetBehavior<View> {
    public BaikeNavigationBottomSheetBehavior(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2, @NotNull View view3, int i7, int i8) {
        return false;
    }
}
