package com.bilibili.pegasus.holders;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/m1.class */
public final class m1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f77898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f77899b;

    public m1(View view, k1 k1Var) {
        this.f77898a = view;
        this.f77899b = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f77899b.f77887f.f53840c.getLayoutParams();
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        this.f77899b.f77887f.f53840c.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f77899b.f77887f.f53844g.getLayoutParams();
        layoutParams2.gravity = 17;
        this.f77899b.f77887f.f53844g.setLayoutParams(layoutParams2);
        this.f77899b.A0();
    }
}
