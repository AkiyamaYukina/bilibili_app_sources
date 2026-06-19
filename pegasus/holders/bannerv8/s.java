package com.bilibili.pegasus.holders.bannerv8;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.MarginPageTransformer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/s.class */
public final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f77821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BannerV8Holder f77823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V8Banner f77824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f77825e;

    public s(View view, int i7, BannerV8Holder bannerV8Holder, V8Banner v8Banner, int i8) {
        this.f77821a = view;
        this.f77822b = i7;
        this.f77823c = bannerV8Holder;
        this.f77824d = v8Banner;
        this.f77825e = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f77822b == this.f77823c.f77691p && this.f77824d.isAttachedToWindow()) {
            this.f77824d.setPageTransformer(new MarginPageTransformer(this.f77825e));
            this.f77824d.getViewPager2().requestTransform();
            if (this.f77824d.getViewPager2().getScrollState() == 0) {
                RecyclerView recyclerView = this.f77824d.getRecyclerView();
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(this.f77824d.getViewPager2().getCurrentItem());
                }
                RecyclerView recyclerView2 = this.f77824d.getRecyclerView();
                if (recyclerView2 != null) {
                    recyclerView2.post(new t(this.f77824d));
                }
            }
            this.f77823c.getClass();
        }
    }
}
