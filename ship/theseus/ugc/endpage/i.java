package com.bilibili.ship.theseus.ugc.endpage;

import android.view.View;
import android.view.ViewGroup;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/i.class */
public final class i implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UGCVerticalFullScreenEndPageWidget f96608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f96609b;

    public i(UGCVerticalFullScreenEndPageWidget uGCVerticalFullScreenEndPageWidget, ViewGroup viewGroup) {
        this.f96608a = uGCVerticalFullScreenEndPageWidget;
        this.f96609b = viewGroup;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        view.removeOnLayoutChangeListener(this);
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(NewPlayerUtilsKt.toPx(252.0f), NewPlayerUtilsKt.toPx(62.0f));
        layoutParams.setEnterAnim(-1);
        layoutParams.setExitAnim(-1);
        layoutParams.setFunctionType(2);
        layoutParams.setLayoutType(32);
        int[] iArr = new int[2];
        this.f96608a.h.location(this.f96609b, iArr);
        layoutParams.setLeftMargin(iArr[0] - NewPlayerUtilsKt.toPx(19.0f));
        layoutParams.setTopMargin((this.f96609b.getMeasuredHeight() + iArr[1]) - NewPlayerUtilsKt.toPx(17.0f));
        this.f96608a.f96567i.showWidget(com.bilibili.app.gemini.ugc.feature.endpage.h.class, layoutParams);
    }
}
