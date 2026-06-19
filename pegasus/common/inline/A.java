package com.bilibili.pegasus.common.inline;

import android.animation.Animator;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/A.class */
public final class A implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f75522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jp0.c f75523b;

    public A(z zVar, jp0.c cVar) {
        this.f75522a = zVar;
        this.f75523b = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f75522a.f75624b.setVisibility(0);
        this.f75522a.f75623a.setVisibility(8);
        this.f75522a.f75631j = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f75522a.f75624b.setVisibility(4);
        this.f75522a.f75625c.setSelected(this.f75523b.h());
        ListExtentionsKt.setText(this.f75522a.f75625c, this.f75523b.d());
    }
}
