package com.bilibili.upper.module.partitionTag.partitiontopicv2;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import bF0.C5006k2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/i.class */
public final class i implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Fragment> f113931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UpperFenquBiaoqianHuatiActivity f113932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f113933c;

    public i(List<Fragment> list, UpperFenquBiaoqianHuatiActivity upperFenquBiaoqianHuatiActivity, String[] strArr) {
        this.f113931a = list;
        this.f113932b = upperFenquBiaoqianHuatiActivity;
        this.f113933c = strArr;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f7, int i8) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        View view;
        RecyclerView recyclerView;
        int size = this.f113931a.size();
        int i8 = 0;
        while (i8 < size) {
            boolean z6 = i8 == i7;
            if ((this.f113931a.get(i8) instanceof UpperFenquBiaoqianHuatiFragment) && (view = ((UpperFenquBiaoqianHuatiFragment) this.f113931a.get(i8)).getView()) != null && (recyclerView = (RecyclerView) view.findViewById(2131310623)) != null) {
                recyclerView.setNestedScrollingEnabled(z6);
            }
            i8++;
        }
        C5006k2 c5006k2 = this.f113932b.f113893M;
        C5006k2 c5006k22 = c5006k2;
        if (c5006k2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5006k22 = null;
        }
        c5006k22.f55752e.setText(this.f113933c[i7]);
    }
}
