package com.bilibili.playerbizcommon.gesture;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bilibili.playerbizcommon.gesture.GestureService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/b.class */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureService f80059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GestureService.m f80060b;

    public b(GestureService gestureService, GestureService.m mVar) {
        this.f80059a = gestureService;
        this.f80060b = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f80059a.forbiddenResizeGesture(false);
        if (GestureService.m.d(this.f80060b)) {
            GestureService.access$showResetFunctionWidget(this.f80059a);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f80059a.forbiddenResizeGesture(false);
        if (GestureService.m.d(this.f80060b)) {
            GestureService.access$showResetFunctionWidget(this.f80059a);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f80059a.forbiddenResizeGesture(true);
    }
}
