package com.bilibili.ship.theseus.ugc.intro.upguardian;

import android.animation.Animator;
import android.view.ViewGroup;
import com.bilibili.upguardian.UpGuardianSectionView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/c.class */
public final class c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpGuardianSectionView f97612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UpGuardianComponent f97613b;

    public c(UpGuardianSectionView upGuardianSectionView, UpGuardianComponent upGuardianComponent) {
        this.f97612a = upGuardianSectionView;
        this.f97613b = upGuardianComponent;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        UpGuardianSectionView upGuardianSectionView = this.f97612a;
        ViewGroup.LayoutParams layoutParams = upGuardianSectionView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = this.f97613b.h;
        upGuardianSectionView.setLayoutParams(layoutParams);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
