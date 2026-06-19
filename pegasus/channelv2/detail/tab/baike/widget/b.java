package com.bilibili.pegasus.channelv2.detail.tab.baike.widget;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bilibili.pegasus.channelv2.detail.tab.baike.widget.BaikeNavigationLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/widget/b.class */
public final class b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaikeNavigationLayout f75213a;

    public b(BaikeNavigationLayout baikeNavigationLayout) {
        this.f75213a = baikeNavigationLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f75213a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f75213a.f75186c.requestLayout();
        BaikeNavigationLayout baikeNavigationLayout = this.f75213a;
        View childAt = baikeNavigationLayout.f75186c.getChildAt(baikeNavigationLayout.f75187d);
        if (childAt != null) {
            BaikeNavigationLayout.a aVar = BaikeNavigationLayout.f75177G;
            TextView textView = (TextView) childAt.findViewById(2131308533);
            textView.setSelected(true);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            BaikeNavigationLayout baikeNavigationLayout2 = this.f75213a;
            baikeNavigationLayout2.c(baikeNavigationLayout2.f75187d, 0);
        }
    }
}
