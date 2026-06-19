package com.bilibili.paycoin;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/v.class */
public final class v implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayCoinsView f74822a;

    public v(PayCoinsView payCoinsView) {
        this.f74822a = payCoinsView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        PayCoinsView payCoinsView = this.f74822a;
        payCoinsView.f74749z = true;
        if (payCoinsView.r()) {
            View view = this.f74822a.f74734k;
            View view2 = view;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLayoutTwo");
                view2 = null;
            }
            view2.setVisibility(4);
        } else {
            View view3 = this.f74822a.f74733j;
            View view4 = view3;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLayoutOne");
                view4 = null;
            }
            view4.setVisibility(4);
        }
        ImageView imageView = this.f74822a.f74727c;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLeft");
            imageView2 = null;
        }
        imageView2.setVisibility(4);
        ImageView imageView3 = this.f74822a.f74728d;
        ImageView imageView4 = imageView3;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRight");
            imageView4 = null;
        }
        imageView4.setVisibility(4);
        TextView textView = this.f74822a.f74732i;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrompt");
            textView2 = null;
        }
        textView2.setVisibility(4);
        TextView textView3 = this.f74822a.f74740q;
        TextView textView4 = textView3;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoinCount");
            textView4 = null;
        }
        textView4.setVisibility(4);
        ImageView imageView5 = this.f74822a.h;
        ImageView imageView6 = imageView5;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mClose");
            imageView6 = null;
        }
        imageView6.setVisibility(4);
        TextView textView5 = this.f74822a.f74744u;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoinHelp");
            textView5 = null;
        }
        textView5.setVisibility(4);
    }
}
