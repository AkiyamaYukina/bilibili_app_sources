package com.bilibili.studio.videoeditor.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bilibili.studio.videoeditor.widgets.MusicCropViewV2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/i.class */
public final class i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MusicCropViewV2 f110448a;

    public i(MusicCropViewV2 musicCropViewV2) {
        this.f110448a = musicCropViewV2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        MusicCropViewV2 musicCropViewV2 = this.f110448a;
        musicCropViewV2.f110377B = false;
        musicCropViewV2.invalidate();
        MusicCropViewV2 musicCropViewV22 = this.f110448a;
        MusicCropViewV2.a aVar = musicCropViewV22.f110383H;
        if (aVar != null) {
            aVar.c(((long) musicCropViewV22.f110405w) * MusicCropViewV2.f110375I);
        }
    }
}
