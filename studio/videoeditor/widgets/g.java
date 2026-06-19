package com.bilibili.studio.videoeditor.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bilibili.studio.videoeditor.widgets.MusicCropView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/g.class */
public final class g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MusicCropView f110446a;

    public g(MusicCropView musicCropView) {
        this.f110446a = musicCropView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        MusicCropView musicCropView = this.f110446a;
        musicCropView.f110374z = false;
        musicCropView.invalidate();
        MusicCropView musicCropView2 = this.f110446a;
        MusicCropView.a aVar = musicCropView2.f110349B;
        if (aVar != null) {
            aVar.c(((long) musicCropView2.f110370v) * 10000);
        }
    }
}
