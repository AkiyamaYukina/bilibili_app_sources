package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/j.class */
public final class C6373j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6374k f101872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f101873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StaffsNewComponent.a f101874c;

    public C6373j(C6374k c6374k, long j7, StaffsNewComponent.a aVar) {
        this.f101872a = c6374k;
        this.f101873b = j7;
        this.f101874c = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet = this.f101874c.f101817f;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f101872a.invoke(Long.valueOf(this.f101873b));
        AnimatorSet animatorSet = this.f101874c.f101817f;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
    }
}
