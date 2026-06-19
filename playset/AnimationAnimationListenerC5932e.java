package com.bilibili.playset;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.bilibili.playset.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/e.class */
public final class AnimationAnimationListenerC5932e implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.ViewHolder f84733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f84734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimationSet f84735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5898c f84736d;

    public AnimationAnimationListenerC5932e(View view, AnimationSet animationSet, RecyclerView.ViewHolder viewHolder, C5898c c5898c) {
        this.f84736d = c5898c;
        this.f84733a = viewHolder;
        this.f84734b = view;
        this.f84735c = animationSet;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        final View view = this.f84734b;
        final AnimationSet animationSet = this.f84735c;
        final RecyclerView.ViewHolder viewHolder = this.f84733a;
        view.post(new Runnable(this, animationSet, view, viewHolder) { // from class: com.bilibili.playset.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AnimationAnimationListenerC5932e f84225a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AnimationSet f84226b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final View f84227c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final RecyclerView.ViewHolder f84228d;

            {
                this.f84225a = this;
                this.f84226b = animationSet;
                this.f84227c = view;
                this.f84228d = viewHolder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnimationAnimationListenerC5932e animationAnimationListenerC5932e = this.f84225a;
                AnimationSet animationSet2 = this.f84226b;
                View view2 = this.f84227c;
                RecyclerView.ViewHolder viewHolder2 = this.f84228d;
                animationAnimationListenerC5932e.getClass();
                animationSet2.setAnimationListener(null);
                view2.setAlpha(1.0f);
                animationAnimationListenerC5932e.f84736d.dispatchRemoveFinished(viewHolder2);
                animationAnimationListenerC5932e.f84736d.f84121j.remove(viewHolder2);
                animationAnimationListenerC5932e.f84736d.dispatchFinishedWhenDone();
            }
        });
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.f84736d.dispatchRemoveStarting(this.f84733a);
    }
}
