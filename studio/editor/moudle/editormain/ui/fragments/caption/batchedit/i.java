package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/i.class */
public final class i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f106419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliEditorCaptionEditFragmentV3 f106420b;

    public i(boolean z6, BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3) {
        this.f106419a = z6;
        this.f106420b = biliEditorCaptionEditFragmentV3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.f106419a) {
            return;
        }
        this.f106420b.of().L0();
    }
}
