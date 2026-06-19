package com.bilibili.upper.module.cover.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/m.class */
public final class m extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<String> f112773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UpperCoverPreviewActivity f112774b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ArrayList<String> arrayList, UpperCoverPreviewActivity upperCoverPreviewActivity, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f112773a = arrayList;
        this.f112774b = upperCoverPreviewActivity;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f112773a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public final Fragment getItem(int i7) {
        Fragment fragment;
        UpperCoverPreviewActivity upperCoverPreviewActivity = this.f112774b;
        if (i7 == 0) {
            UpperCoverHomePreviewFragment upperCoverHomePreviewFragment = new UpperCoverHomePreviewFragment();
            upperCoverHomePreviewFragment.f112718c = upperCoverPreviewActivity.f112728F;
            fragment = upperCoverHomePreviewFragment;
        } else if (i7 != 1) {
            fragment = new Fragment();
        } else {
            UpperCoverSpacePreviewFragment upperCoverSpacePreviewFragment = new UpperCoverSpacePreviewFragment();
            upperCoverSpacePreviewFragment.f112748c = upperCoverPreviewActivity.f112729G;
            fragment = upperCoverSpacePreviewFragment;
        }
        return fragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i7) {
        return this.f112773a.get(i7);
    }
}
