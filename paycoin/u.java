package com.bilibili.paycoin;

import android.animation.Animator;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/u.class */
public final class u implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayCoinsView f74821a;

    public u(PayCoinsView payCoinsView) {
        this.f74821a = payCoinsView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f74821a.f74749z = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f74821a.r()) {
            ImageView imageView = this.f74821a.f74727c;
            ImageView imageView2 = imageView;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLeft");
                imageView2 = null;
            }
            imageView2.setImageResource(2131235202);
            ImageView imageView3 = this.f74821a.f74728d;
            ImageView imageView4 = imageView3;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRight");
                imageView4 = null;
            }
            imageView4.setImageResource(2131236087);
            PayCoinsView.j(this.f74821a);
            PayCoinsView payCoinsView = this.f74821a;
            if (payCoinsView.f74715C >= 1.0f) {
                payCoinsView.t(1);
                View view = this.f74821a.f74742s;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMaskOne");
                    view = null;
                }
                view.setVisibility(8);
            } else {
                payCoinsView.t(0);
                View view2 = this.f74821a.f74742s;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMaskOne");
                    view2 = null;
                }
                view2.setVisibility(0);
            }
        } else {
            ImageView imageView5 = this.f74821a.f74727c;
            ImageView imageView6 = imageView5;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLeft");
                imageView6 = null;
            }
            imageView6.setImageResource(2131235200);
            ImageView imageView7 = this.f74821a.f74728d;
            ImageView imageView8 = imageView7;
            if (imageView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRight");
                imageView8 = null;
            }
            imageView8.setImageResource(2131236088);
            PayCoinsView.j(this.f74821a);
            PayCoinsView payCoinsView2 = this.f74821a;
            if (payCoinsView2.f74715C >= 2.0f) {
                payCoinsView2.t(2);
                View view3 = this.f74821a.f74743t;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMaskTwo");
                    view3 = null;
                }
                view3.setVisibility(8);
            } else {
                payCoinsView2.t(0);
                View view4 = this.f74821a.f74743t;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMaskTwo");
                    view4 = null;
                }
                view4.setVisibility(0);
            }
        }
        this.f74821a.f74749z = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f74821a.f74749z = true;
    }
}
