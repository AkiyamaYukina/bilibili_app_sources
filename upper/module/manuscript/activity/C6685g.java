package com.bilibili.upper.module.manuscript.activity;

import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.infoeyes.InfoEyesManager;

/* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/g.class */
public final class C6685g implements ViewPager.OnPageChangeListener {
    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f7, int i8) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        InfoEyesManager.getInstance().report2(false, "000377", new String[]{"ugc_center_contribution_manage_view", "show", String.valueOf(i7 + 1)});
    }
}
