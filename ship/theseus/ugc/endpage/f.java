package com.bilibili.ship.theseus.ugc.endpage;

import android.view.View;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/f.class */
public final class f implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UGCHorizontalFullScreenEndPageWidget f96604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f96605b;

    public f(UGCHorizontalFullScreenEndPageWidget uGCHorizontalFullScreenEndPageWidget, View view) {
        this.f96604a = uGCHorizontalFullScreenEndPageWidget;
        this.f96605b = view;
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
        this.f96604a.f96533i.location(this.f96605b, iArr);
        layoutParams.setLeftMargin(iArr[0] - NewPlayerUtilsKt.toPx(35.0f));
        layoutParams.setTopMargin(iArr[1] - NewPlayerUtilsKt.toPx(64.0f));
        this.f96604a.f96536l.showWidget(com.bilibili.app.gemini.ugc.feature.endpage.e.class, layoutParams);
    }
}
