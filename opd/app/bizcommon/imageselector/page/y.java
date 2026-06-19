package com.bilibili.opd.app.bizcommon.imageselector.page;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/y.class */
public final class y implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MallMediaPreviewFragment f73942a;

    public y(MallMediaPreviewFragment mallMediaPreviewFragment) {
        this.f73942a = mallMediaPreviewFragment;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f7, int i8) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        this.f73942a.qf(i7);
    }
}
