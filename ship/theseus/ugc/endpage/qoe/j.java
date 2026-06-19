package com.bilibili.ship.theseus.ugc.endpage.qoe;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.ship.theseus.united.page.screenstate.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/j.class */
public final class j implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f96717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f96718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f96719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f96720d;

    public j(ConstraintLayout constraintLayout, FrameLayout frameLayout, c.a aVar, ConstraintLayout constraintLayout2) {
        this.f96717a = constraintLayout;
        this.f96718b = frameLayout;
        this.f96719c = aVar;
        this.f96720d = constraintLayout2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        view.removeOnLayoutChangeListener(this);
        this.f96717a.setPivotX(r0.getMeasuredWidth() / 2.0f);
        this.f96717a.setPivotY(r0.getMeasuredHeight() / 2.0f);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f96718b.getLayoutParams();
        if (this.f96719c.f102987a) {
            this.f96717a.setScaleX(1.0f);
            this.f96717a.setScaleY(1.0f);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = sh1.c.b(50);
            layoutParams.setMarginEnd(sh1.c.b(24));
        } else {
            this.f96720d.setScaleX(1.3f);
            this.f96720d.setScaleY(1.3f);
            this.f96718b.setScaleX(1.3f);
            this.f96718b.setScaleY(1.3f);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = sh1.c.b(24);
            layoutParams.setMarginEnd(sh1.c.b(68));
        }
        this.f96718b.setLayoutParams(layoutParams);
        this.f96717a.setAlpha(1.0f);
    }
}
