package com.bilibili.pegasus.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import java.util.Iterator;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/AverageTabPagerSlidingTabStrip.class */
@StabilityInferred(parameters = 0)
public final class AverageTabPagerSlidingTabStrip extends CenteredPagerSlidingTabStrip {
    @JvmOverloads
    public AverageTabPagerSlidingTabStrip(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public AverageTabPagerSlidingTabStrip(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public AverageTabPagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i7, int i8) {
        int i9;
        super/*android.widget.HorizontalScrollView*/.onMeasure(i7, i8);
        if (((PagerSlidingTabStrip) this).tabsContainer.getChildCount() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        Iterator it = ViewGroupKt.getChildren(((PagerSlidingTabStrip) this).tabsContainer).iterator();
        int measuredWidth = 0;
        while (true) {
            i9 = measuredWidth;
            if (!it.hasNext()) {
                break;
            } else {
                measuredWidth = i9 + ((View) it.next()).getMeasuredWidth();
            }
        }
        if (i9 == 0 || getMeasuredWidth() < i9) {
            return;
        }
        int measuredWidth2 = (getMeasuredWidth() - i9) / ((((PagerSlidingTabStrip) this).tabsContainer.getChildCount() * 2) + 2);
        Iterator it2 = ViewGroupKt.getChildren(((PagerSlidingTabStrip) this).tabsContainer).iterator();
        while (true) {
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (!it2.hasNext()) {
                break;
            }
            View view = (View) it2.next();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.setMarginStart(measuredWidth2);
                marginLayoutParams2.setMarginEnd(measuredWidth2);
                marginLayoutParams = marginLayoutParams2;
            }
            view.setLayoutParams(marginLayoutParams);
        }
        LinearLayout linearLayout = ((PagerSlidingTabStrip) this).tabsContainer;
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        ViewGroup.MarginLayoutParams marginLayoutParams4 = null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.setMarginStart(measuredWidth2);
            marginLayoutParams3.setMarginEnd(measuredWidth2);
            marginLayoutParams4 = marginLayoutParams3;
        }
        linearLayout.setLayoutParams(marginLayoutParams4);
    }
}
