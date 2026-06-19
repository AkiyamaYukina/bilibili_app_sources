package com.bilibili.ship.theseus.united.page.story;

import android.animation.Animator;
import com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/h.class */
public final class h implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoryTransitionAnimService f103101a;

    public h(StoryTransitionAnimService storyTransitionAnimService) {
        this.f103101a = storyTransitionAnimService;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f103101a.f103062w.setValue(new StoryTransitionAnimService.a(true, 100, null));
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
