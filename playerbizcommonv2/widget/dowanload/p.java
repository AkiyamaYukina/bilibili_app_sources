package com.bilibili.playerbizcommonv2.widget.dowanload;

import android.text.SpannableStringBuilder;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/p.class */
public final class p implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f82578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f82579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f82580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SpannableStringBuilder f82581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LottieAnimationView f82582e;

    public p(TextView textView, long j7, m mVar, SpannableStringBuilder spannableStringBuilder, LottieAnimationView lottieAnimationView) {
        this.f82578a = textView;
        this.f82579b = j7;
        this.f82580c = mVar;
        this.f82581d = spannableStringBuilder;
        this.f82582e = lottieAnimationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f82578a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.f82579b == ((Number) this.f82580c.f82572b.getValue()).longValue()) {
            m.c(this.f82582e, this.f82578a, this.f82581d.toString());
        } else {
            m.c(this.f82582e, this.f82578a, null);
        }
    }
}
