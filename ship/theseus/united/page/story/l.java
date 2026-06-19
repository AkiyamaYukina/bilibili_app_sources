package com.bilibili.ship.theseus.united.page.story;

import android.animation.Animator;
import kotlin.jvm.internal.Ref;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/l.class */
public final class l implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef f103109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoryTransitionAnimService f103110b;

    public l(Ref.ObjectRef objectRef, StoryTransitionAnimService storyTransitionAnimService) {
        this.f103109a = objectRef;
        this.f103110b = storyTransitionAnimService;
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
        AspectRatio aspectRatio = (AspectRatio) this.f103109a.element;
        if (aspectRatio != null) {
            this.f103110b.f103048i.setAspectRatio(aspectRatio);
        }
    }
}
