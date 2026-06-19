package com.bilibili.ogv.operation.modular.modules.banner;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.bilibili.banner.Banner;
import com.bilibili.ogv.infra.legacy.exposure.d;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/banner/o.class */
public final class o extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f70498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FragmentActivity f70500c;

    public o(s sVar, String str, FragmentActivity fragmentActivity) {
        this.f70498a = sVar;
        this.f70499b = str;
        this.f70500c = fragmentActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i7) {
        s sVar = this.f70498a;
        if (i7 != sVar.f70520q) {
            sVar.f70520q = i7;
            sVar.notifyPropertyChanged(429);
        }
        if (i7 == 0) {
            s.m(sVar, this.f70500c);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        super.onPageSelected(i7);
        s sVar = this.f70498a;
        a aVar = (a) CollectionsKt.getOrNull(sVar.f70508d, i7);
        if (aVar != null) {
            if (i7 != sVar.f70522s) {
                sVar.f70522s = i7;
                sVar.notifyPropertyChanged(138);
            }
            Banner banner = sVar.f70518o;
            if (banner != null) {
                HashMap<String, d.b> map = com.bilibili.ogv.infra.legacy.exposure.d.f67889a;
                com.bilibili.ogv.infra.legacy.exposure.d.f(this.f70499b, banner, sVar.f70523t, sVar.f70524u, sVar.f70522s);
            }
            s.n(sVar, aVar);
        }
    }
}
