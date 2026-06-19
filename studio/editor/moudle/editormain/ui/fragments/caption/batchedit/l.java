package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit;

import TB0.C2883o;
import android.animation.ValueAnimator;
import android.view.View;
import com.bilibili.studio.editor.moudle.caption.ui.GestureFrameLayout;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/l.class */
public final class l implements GestureFrameLayout.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorCaptionEditFragmentV3 f106422a;

    public l(BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3) {
        this.f106422a = biliEditorCaptionEditFragmentV3;
    }

    @Override // com.bilibili.studio.editor.moudle.caption.ui.GestureFrameLayout.a
    public final void a(boolean z6) {
        BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3 = this.f106422a;
        biliEditorCaptionEditFragmentV3.f106328q = true;
        biliEditorCaptionEditFragmentV3.of().f106710e.f14981b.j();
        if (biliEditorCaptionEditFragmentV3.getContext() == null) {
            return;
        }
        int devicesHeightPixels = DensityUtil.getDevicesHeightPixels(biliEditorCaptionEditFragmentV3.requireContext());
        View view = biliEditorCaptionEditFragmentV3.h;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
            view2 = null;
        }
        int height = view2.getHeight();
        if (!z6) {
            int i7 = biliEditorCaptionEditFragmentV3.f106335x;
            C2883o c2883o = biliEditorCaptionEditFragmentV3.f106319g;
            if (c2883o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2883o = null;
            }
            devicesHeightPixels = i7 + c2883o.f23892i.getHeight();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, devicesHeightPixels);
        biliEditorCaptionEditFragmentV3.f106316F = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.addUpdateListener(new com.bilibili.music.podcast.utils.C(biliEditorCaptionEditFragmentV3));
        }
        ValueAnimator valueAnimator = biliEditorCaptionEditFragmentV3.f106316F;
        if (valueAnimator != null) {
            valueAnimator.setDuration(400L);
        }
        ValueAnimator valueAnimator2 = biliEditorCaptionEditFragmentV3.f106316F;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
        ValueAnimator valueAnimator3 = biliEditorCaptionEditFragmentV3.f106316F;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new i(z6, biliEditorCaptionEditFragmentV3));
        }
    }
}
