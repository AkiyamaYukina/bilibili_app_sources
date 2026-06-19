package com.bilibili.ogv.pub.payment.pay;

import android.app.Dialog;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/b.class */
public final class b extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f71563a;

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Drawable drawable = this.f71563a.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).start();
        }
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        Drawable drawable = this.f71563a.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
    }
}
