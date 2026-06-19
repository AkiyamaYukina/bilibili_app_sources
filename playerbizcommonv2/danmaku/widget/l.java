package com.bilibili.playerbizcommonv2.danmaku.widget;

import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.playerbizcommonv2.danmaku.widget.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/l.class */
public final class l implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f81667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e.a f81668b;

    public l(e eVar, e.a aVar) {
        this.f81667a = eVar;
        this.f81668b = aVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f7, int i8) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        e eVar = this.f81667a;
        TextView textView = eVar.h;
        if (textView != null) {
            CharSequence title = this.f81668b.f81652a.get(i7).getTitle();
            j jVar = eVar.f81641m;
            textView.setVisibility(Intrinsics.areEqual(title, jVar != null ? jVar.getTitle() : null) ? 0 : 8);
        }
    }
}
