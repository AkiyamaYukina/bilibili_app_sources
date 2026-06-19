package com.bilibili.paycoin;

import android.view.animation.Animation;
import android.widget.CheckBox;
import com.bilibili.paycoin.PayCoinsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/t.class */
public final class t implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayCoinsView f74820a;

    public t(PayCoinsView payCoinsView) {
        this.f74820a = payCoinsView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        PayCoinsView payCoinsView = this.f74820a;
        boolean zIsChecked = false;
        payCoinsView.f74749z = false;
        payCoinsView.dismiss();
        CheckBox checkBox = this.f74820a.f74745v;
        CheckBox checkBox2 = checkBox;
        if (checkBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCheckBox");
            checkBox2 = null;
        }
        if (checkBox2.getVisibility() == 0) {
            CheckBox checkBox3 = this.f74820a.f74745v;
            if (checkBox3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCheckBox");
                checkBox3 = null;
            }
            zIsChecked = checkBox3.isChecked();
        }
        PayCoinsView payCoinsView2 = this.f74820a;
        PayCoinsView.a aVar = payCoinsView2.f74716D;
        if (aVar != null) {
            aVar.d(payCoinsView2.f74747x, zIsChecked);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
