package com.bilibili.ship.theseus.united.page.story;

import android.animation.Animator;
import com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService;
import kotlin.jvm.internal.Ref;
import tv.danmaku.android.log.BLog;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/i.class */
public final class i implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoryTransitionAnimService f103102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AspectRatio f103103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.ObjectRef f103104c;

    public i(StoryTransitionAnimService storyTransitionAnimService, AspectRatio aspectRatio, Ref.ObjectRef objectRef) {
        this.f103102a = storyTransitionAnimService;
        this.f103103b = aspectRatio;
        this.f103104c = objectRef;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        BLog.i("StoryTransitionAnimService$expandPlayingContainerToFullScreenAndKeep$$inlined$doOnCancel$2-onAnimationCancel", "[theseus-united-StoryTransitionAnimService$expandPlayingContainerToFullScreenAndKeep$$inlined$doOnCancel$2-onAnimationCancel] resetValueAnimator: canceled");
        this.f103102a.f103048i.setAspectRatio(this.f103103b);
        this.f103102a.f103062w.setValue(new StoryTransitionAnimService.a(false, 0, null));
        Integer num = (Integer) this.f103104c.element;
        if (num != null) {
            com.bilibili.playerbizcommon.utils.i.a(num.intValue());
        }
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
