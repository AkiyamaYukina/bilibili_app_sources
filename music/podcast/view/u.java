package com.bilibili.music.podcast.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/u.class */
public final class u extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MusicViewPager2LoadView f67325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f67327c;

    public u(MusicViewPager2LoadView musicViewPager2LoadView, boolean z6, boolean z7) {
        this.f67325a = musicViewPager2LoadView;
        this.f67326b = z6;
        this.f67327c = z7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        MusicViewPager2LoadView musicViewPager2LoadView = this.f67325a;
        musicViewPager2LoadView.f67149n = null;
        if (musicViewPager2LoadView.f67145j == 0) {
            b bVar = musicViewPager2LoadView.f67139c;
            if (bVar != null) {
                bVar.a();
            }
            c cVar = this.f67325a.f67140d;
            if (cVar != null) {
                cVar.setRefreshState(false);
            }
        }
        if (this.f67326b) {
            if (!this.f67327c) {
                i iVar = this.f67325a.f67151p;
                if (iVar != null) {
                    iVar.b();
                    return;
                }
                return;
            }
            c cVar2 = this.f67325a.f67140d;
            if (cVar2 != null) {
                cVar2.setRefreshState(true);
            }
            i iVar2 = this.f67325a.f67151p;
            if (iVar2 != null) {
                iVar2.a();
            }
        }
    }
}
