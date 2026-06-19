package com.bilibili.search2.result;

import android.view.View;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/h.class */
public final class h implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliMainSearchResultFragment f87752a;

    public h(BiliMainSearchResultFragment biliMainSearchResultFragment) {
        this.f87752a = biliMainSearchResultFragment;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        view.removeOnLayoutChangeListener(this);
        this.f87752a.f87075K = view.getHeight();
        this.f87752a.Cf();
    }
}
