package com.bilibili.pegasus.common.inline;

import android.animation.Animator;
import com.bilibili.app.comm.list.common.data.LikeButtonItemV2;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/w.class */
public final class w implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f75617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LikeButtonItemV2 f75618b;

    public w(v vVar, LikeButtonItemV2 likeButtonItemV2) {
        this.f75617a = vVar;
        this.f75618b = likeButtonItemV2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f75617a.f75602b.setVisibility(0);
        this.f75617a.f75601a.setVisibility(8);
        this.f75617a.f75609j = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f75617a.f75602b.setVisibility(4);
        this.f75617a.f75603c.setSelected(this.f75618b.isSelected());
        ListExtentionsKt.setText(this.f75617a.f75603c, this.f75618b.getFormatCount());
    }
}
