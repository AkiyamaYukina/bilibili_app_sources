package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/F.class */
public final class F extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f106379a;

    public F(boolean z6) {
        this.f106379a = z6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        Y0.c.c("startAnimUpdateFragmentHeight onAnimationEnd isUp=", "BiliEditorStickerBatchEditFragment", this.f106379a);
    }
}
