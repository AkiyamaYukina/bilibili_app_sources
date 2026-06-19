package com.bilibili.upper.module.manuscript.activity;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import bF0.C1;
import com.bilibili.upper.module.contribute.picker.widget.UpperPinchImageView;
import com.bilibili.upper.module.manuscript.bean.AuditReason;
import com.bilibili.upper.module.manuscript.fragment.ViolationPicItemFragment;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/F.class */
public final class F implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViolationPicItemActivity f113418a;

    public F(ViolationPicItemActivity violationPicItemActivity) {
        this.f113418a = violationPicItemActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f7, int i8) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        C1 c12;
        UpperPinchImageView upperPinchImageView;
        ViolationPicItemActivity violationPicItemActivity = this.f113418a;
        List<? extends AuditReason.ViolationPic> list = violationPicItemActivity.f113532H;
        violationPicItemActivity.f113533I = list != null ? list.get(i7) : null;
        violationPicItemActivity.Q6(i7);
        Fragment fragmentFindFragmentByTag = violationPicItemActivity.getSupportFragmentManager().findFragmentByTag("android:switcher:2131316342:" + i7);
        ViolationPicItemFragment violationPicItemFragment = null;
        if (fragmentFindFragmentByTag instanceof ViolationPicItemFragment) {
            violationPicItemFragment = (ViolationPicItemFragment) fragmentFindFragmentByTag;
        }
        if (violationPicItemFragment == null || (c12 = violationPicItemFragment.f113653b) == null || (upperPinchImageView = c12.f54658b) == null) {
            return;
        }
        upperPinchImageView.p.reset();
        upperPinchImageView.invalidate();
    }
}
