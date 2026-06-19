package com.bilibili.search2.result.holder.aichat;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/j.class */
public final class j implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayoutManager f87786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87787b;

    public j(LinearLayoutManager linearLayoutManager, int i7) {
        this.f87786a = linearLayoutManager;
        this.f87787b = i7;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        view.removeOnLayoutChangeListener(this);
        int iFindFirstVisibleItemPosition = this.f87786a.findFirstVisibleItemPosition();
        View viewFindViewByPosition = this.f87786a.findViewByPosition(this.f87787b);
        BLog.d("[Search]SearchAIChatHolder", "afterScrollToNext: first=" + iFindFirstVisibleItemPosition + ", targetTop=" + (viewFindViewByPosition != null ? Integer.valueOf(viewFindViewByPosition.getTop()) : null));
    }
}
