package com.bilibili.pegasus.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager.widget.ViewPager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/E.class */
@StabilityInferred(parameters = 0)
public final class E implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f78854b;

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
        Function0<Unit> function0;
        this.f78853a = i7;
        if (i7 != 0 || (function0 = this.f78854b) == null) {
            return;
        }
        BLog.i("StatefulViewPagerChangeListener", "mNextIdleCallback invoke");
        function0.invoke();
        this.f78854b = null;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f7, int i8) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
    }
}
