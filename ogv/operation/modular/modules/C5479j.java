package com.bilibili.ogv.operation.modular.modules;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/j.class */
public final class C5479j extends ViewPager.SimpleOnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5477h f70723a;

    public C5479j(C5477h c5477h) {
        this.f70723a = c5477h;
    }

    @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
        C5477h c5477h = this.f70723a;
        c5477h.f70635t = i7;
        if (i7 == 0) {
            c5477h.E0();
        }
    }
}
