package com.bilibili.ship.theseus.ugc.recommend;

import android.animation.Animator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/recommend/d.class */
public final class d implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f98423a;

    public d(b bVar) {
        this.f98423a = bVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        RecyclerView recyclerViewI = this.f98423a.i();
        if (recyclerViewI != null) {
            recyclerViewI.setVisibility(0);
        }
        RecyclerView recyclerViewI2 = this.f98423a.i();
        float y6 = recyclerViewI2 != null ? recyclerViewI2.getY() : 0.0f;
        FrameLayout frameLayoutH = this.f98423a.h();
        if (frameLayoutH != null) {
            frameLayoutH.setY(y6 - this.f98423a.f98409l);
        }
        FrameLayout frameLayoutH2 = this.f98423a.h();
        if (frameLayoutH2 != null) {
            frameLayoutH2.setVisibility(0);
        }
        BLog.i("bottom recommend card show:anim cancel");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RecyclerView recyclerViewI = this.f98423a.i();
        if (recyclerViewI != null) {
            recyclerViewI.setVisibility(0);
        }
        RecyclerView recyclerViewI2 = this.f98423a.i();
        float y6 = recyclerViewI2 != null ? recyclerViewI2.getY() : 0.0f;
        FrameLayout frameLayoutH = this.f98423a.h();
        if (frameLayoutH != null) {
            frameLayoutH.setY(y6 - this.f98423a.f98409l);
        }
        FrameLayout frameLayoutH2 = this.f98423a.h();
        if (frameLayoutH2 != null) {
            frameLayoutH2.setVisibility(0);
        }
        BLog.i("bottom recommend card show:anim end");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView recyclerViewI = this.f98423a.i();
        if (recyclerViewI != null) {
            recyclerViewI.setVisibility(0);
        }
        FrameLayout frameLayoutH = this.f98423a.h();
        if (frameLayoutH != null) {
            frameLayoutH.setVisibility(4);
        }
    }
}
