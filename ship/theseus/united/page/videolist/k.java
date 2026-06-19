package com.bilibili.ship.theseus.united.page.videolist;

import android.text.SpannableStringBuilder;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/k.class */
public final class k implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f103622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f103623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f103624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SpannableStringBuilder f103625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LottieAnimationView f103626e;

    public k(TextView textView, long j7, d dVar, SpannableStringBuilder spannableStringBuilder, LottieAnimationView lottieAnimationView) {
        this.f103622a = textView;
        this.f103623b = j7;
        this.f103624c = dVar;
        this.f103625d = spannableStringBuilder;
        this.f103626e = lottieAnimationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f103622a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.f103623b == ((Number) this.f103624c.f103610c.getValue()).longValue()) {
            d.d(this.f103626e, this.f103622a, this.f103625d.toString());
        } else {
            d.d(this.f103626e, this.f103622a, null);
        }
    }
}
