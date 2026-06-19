package com.bilibili.ship.theseus.united.player.toast;

import android.animation.Animator;
import android.graphics.Rect;
import com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService;
import tv.danmaku.biliplayerv2.service.IToastService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/toast/b.class */
public final class b implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TheseusToastContainerService f104812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TheseusToastContainerService.b f104813b;

    public b(TheseusToastContainerService theseusToastContainerService, TheseusToastContainerService.b bVar) {
        this.f104812a = theseusToastContainerService;
        this.f104813b = bVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        IToastService iToastService = this.f104812a.f104795b;
        TheseusToastContainerService.b bVar = this.f104813b;
        iToastService.setPadding(new Rect(bVar.f104805a, bVar.f104806b, bVar.f104807c, bVar.f104808d));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
