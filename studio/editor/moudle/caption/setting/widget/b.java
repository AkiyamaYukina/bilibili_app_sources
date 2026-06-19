package com.bilibili.studio.editor.moudle.caption.setting.widget;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/widget/b.class */
public final class b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpperPagerSlidingTabStrip f106010a;

    public b(UpperPagerSlidingTabStrip upperPagerSlidingTabStrip) {
        this.f106010a = upperPagerSlidingTabStrip;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f106010a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        UpperPagerSlidingTabStrip upperPagerSlidingTabStrip = this.f106010a;
        int currentItem = upperPagerSlidingTabStrip.h.getCurrentItem();
        upperPagerSlidingTabStrip.f105983j = currentItem;
        View childAt = upperPagerSlidingTabStrip.f105981g.getChildAt(currentItem);
        if (childAt != null) {
            childAt.setSelected(true);
            upperPagerSlidingTabStrip.c(upperPagerSlidingTabStrip.f105983j, 0);
        }
    }
}
