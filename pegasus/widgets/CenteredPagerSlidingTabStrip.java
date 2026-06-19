package com.bilibili.pegasus.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/CenteredPagerSlidingTabStrip.class */
@StabilityInferred(parameters = 0)
public class CenteredPagerSlidingTabStrip extends PagerSlidingTabStrip {
    public CenteredPagerSlidingTabStrip(@NotNull Context context) {
        this(context, null);
    }

    public CenteredPagerSlidingTabStrip(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CenteredPagerSlidingTabStrip(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        ((PagerSlidingTabStrip) this).tabsContainer.setGravity(17);
    }
}
