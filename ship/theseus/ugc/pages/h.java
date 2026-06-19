package com.bilibili.ship.theseus.ugc.pages;

import android.text.Layout;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.ugc.pages.k;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/h.class */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.b f98021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f98023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LottieAnimationView f98024d;

    public /* synthetic */ h(k.b bVar, int i7, TextView textView, LottieAnimationView lottieAnimationView) {
        this.f98021a = bVar;
        this.f98022b = i7;
        this.f98023c = textView;
        this.f98024d = lottieAnimationView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Layout layout;
        k.b bVar = this.f98021a;
        int i7 = this.f98022b;
        TextView textView = this.f98023c;
        LottieAnimationView lottieAnimationView = this.f98024d;
        if (bVar.f98036b != i7 || (layout = textView.getLayout()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (layout.getLineCount() <= 1) {
                marginLayoutParams.topMargin = DimenUtilsKt.dpToPx(26);
            } else {
                marginLayoutParams.topMargin = DimenUtilsKt.dpToPx(18);
            }
            lottieAnimationView.setLayoutParams(marginLayoutParams);
        }
    }
}
