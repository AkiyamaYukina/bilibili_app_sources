package com.bilibili.upper.module.cover_v2.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/l.class */
public final class l extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiCoverMenuFragment f112966a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(MultiCoverMenuFragment multiCoverMenuFragment, FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        this.f112966a = multiCoverMenuFragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f112966a.f112901b.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public final Fragment getItem(int i7) {
        return this.f112966a.f112902c.get(i7);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i7) {
        return this.f112966a.f112901b.get(i7);
    }
}
