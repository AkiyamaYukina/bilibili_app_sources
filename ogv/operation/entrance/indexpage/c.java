package com.bilibili.ogv.operation.entrance.indexpage;

import android.animation.Animator;
import android.widget.FrameLayout;
import com.bilibili.ogv.operation.entrance.indexpage.BangumFilterLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/c.class */
public final class c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BangumFilterLayout f70170a;

    public c(BangumFilterLayout bangumFilterLayout) {
        this.f70170a = bangumFilterLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f70170a.setFoldTvState(false);
        BangumFilterLayout bangumFilterLayout = this.f70170a;
        bangumFilterLayout.f70105l = false;
        BangumFilterLayout.a aVar = bangumFilterLayout.f70103j;
        if ((aVar != null ? aVar.f70112a.size() : 0) > 5) {
            FrameLayout frameLayout = this.f70170a.f70101g;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FrameLayout frameLayout2 = this.f70170a.f70101g;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
