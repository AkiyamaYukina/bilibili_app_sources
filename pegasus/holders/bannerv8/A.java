package com.bilibili.pegasus.holders.bannerv8;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bilibili.inline.card.InlineParent;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/A.class */
@StabilityInferred(parameters = 0)
public final class A extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final InlineParent.ScrollStateChangeListener f77673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final RecyclerView.OnScrollListener f77674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final RecyclerView f77675c;

    public A(@Nullable InlineParent.ScrollStateChangeListener scrollStateChangeListener, @Nullable RecyclerView.OnScrollListener onScrollListener, @Nullable RecyclerView recyclerView) {
        this.f77673a = scrollStateChangeListener;
        this.f77674b = onScrollListener;
        this.f77675c = recyclerView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i7) {
        RecyclerView.OnScrollListener onScrollListener;
        super.onPageScrollStateChanged(i7);
        bilibili.live.app.service.resolver.c.a(i7, "new state ", "PageChangeCallbackWrapper");
        InlineParent.ScrollStateChangeListener scrollStateChangeListener = this.f77673a;
        if (scrollStateChangeListener != null) {
            scrollStateChangeListener.onScrollStateChanged(i7);
        }
        RecyclerView recyclerView = this.f77675c;
        if (recyclerView == null || (onScrollListener = this.f77674b) == null) {
            return;
        }
        onScrollListener.onScrollStateChanged(recyclerView, i7);
    }
}
