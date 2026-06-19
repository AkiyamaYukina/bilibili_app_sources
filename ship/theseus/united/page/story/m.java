package com.bilibili.ship.theseus.united.page.story;

import android.animation.Animator;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/m.class */
public final class m implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef f103111a;

    public m(Ref.ObjectRef objectRef) {
        this.f103111a = objectRef;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f103111a.element = Integer.valueOf(com.bilibili.playerbizcommon.utils.i.b());
    }
}
