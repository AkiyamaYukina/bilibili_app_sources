package com.bilibili.ship.theseus.united.page.story;

import android.animation.Animator;
import com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService;
import kotlin.jvm.internal.Ref;
import tv.danmaku.android.log.BLog;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/k.class */
public final class k implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoryTransitionAnimService f103106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AspectRatio f103107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.ObjectRef f103108c;

    public k(StoryTransitionAnimService storyTransitionAnimService, AspectRatio aspectRatio, Ref.ObjectRef objectRef) {
        this.f103106a = storyTransitionAnimService;
        this.f103107b = aspectRatio;
        this.f103108c = objectRef;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BLog.i("StoryTransitionAnimService$expandPlayingContainerToFullScreenAndKeep$$inlined$doOnEnd$2-onAnimationEnd", "[theseus-united-StoryTransitionAnimService$expandPlayingContainerToFullScreenAndKeep$$inlined$doOnEnd$2-onAnimationEnd] resetValueAnimator: onEnd");
        this.f103106a.f103048i.setAspectRatio(this.f103107b);
        this.f103106a.f103062w.setValue(new StoryTransitionAnimService.a(false, 0, null));
        Integer num = (Integer) this.f103108c.element;
        if (num != null) {
            com.bilibili.playerbizcommon.utils.i.a(num.intValue());
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
