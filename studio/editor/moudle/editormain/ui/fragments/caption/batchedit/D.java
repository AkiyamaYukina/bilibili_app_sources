package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit;

import TB0.C2874f;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bilibili.studio.editor.moudle.caption.ui.GestureFrameLayout;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/D.class */
public final class D implements GestureFrameLayout.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorStickerBatchEditFragmentV3 f106377a;

    public D(BiliEditorStickerBatchEditFragmentV3 biliEditorStickerBatchEditFragmentV3) {
        this.f106377a = biliEditorStickerBatchEditFragmentV3;
    }

    @Override // com.bilibili.studio.editor.moudle.caption.ui.GestureFrameLayout.a
    public final void a(boolean z6) {
        Y0.c.c("is up ", "BiliEditorStickerBatchEditFragment", z6);
        final BiliEditorStickerBatchEditFragmentV3 biliEditorStickerBatchEditFragmentV3 = this.f106377a;
        if (!z6) {
            C2874f c2874f = biliEditorStickerBatchEditFragmentV3.f106351g;
            C2874f c2874f2 = c2874f;
            if (c2874f == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2874f2 = null;
            }
            if (c2874f2.f23774a.getLayoutParams().height == biliEditorStickerBatchEditFragmentV3.f106366w) {
                return;
            }
        }
        biliEditorStickerBatchEditFragmentV3.f106361r = true;
        biliEditorStickerBatchEditFragmentV3.lf().f106679d.j();
        if (biliEditorStickerBatchEditFragmentV3.getContext() == null) {
            return;
        }
        int devicesHeightPixels = DensityUtil.getDevicesHeightPixels(biliEditorStickerBatchEditFragmentV3.requireContext());
        View view = biliEditorStickerBatchEditFragmentV3.h;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
            view2 = null;
        }
        int height = view2.getHeight();
        if (!z6) {
            int i7 = biliEditorStickerBatchEditFragmentV3.f106366w;
            C2874f c2874f3 = biliEditorStickerBatchEditFragmentV3.f106351g;
            if (c2874f3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c2874f3 = null;
            }
            devicesHeightPixels = i7 + c2874f3.f23777d.getHeight();
        }
        ValueAnimator valueAnimator = biliEditorStickerBatchEditFragmentV3.f106348D;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
        ValueAnimator valueAnimator2 = biliEditorStickerBatchEditFragmentV3.f106348D;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, devicesHeightPixels);
        biliEditorStickerBatchEditFragmentV3.f106348D = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(biliEditorStickerBatchEditFragmentV3) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorStickerBatchEditFragmentV3 f106455a;

                {
                    this.f106455a = biliEditorStickerBatchEditFragmentV3;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    BiliEditorStickerBatchEditFragmentV3 biliEditorStickerBatchEditFragmentV32 = this.f106455a;
                    int iIntValue = ((Integer) valueAnimator3.getAnimatedValue()).intValue();
                    C2874f c2874f4 = biliEditorStickerBatchEditFragmentV32.f106351g;
                    C2874f c2874f5 = c2874f4;
                    if (c2874f4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c2874f5 = null;
                    }
                    LinearLayout linearLayout = c2874f5.f23774a;
                    C2874f c2874f6 = biliEditorStickerBatchEditFragmentV32.f106351g;
                    if (c2874f6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c2874f6 = null;
                    }
                    ViewGroup.LayoutParams layoutParams = c2874f6.f23774a.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = iIntValue;
                    }
                    linearLayout.setLayoutParams(layoutParams);
                }
            });
        }
        ValueAnimator valueAnimator3 = biliEditorStickerBatchEditFragmentV3.f106348D;
        if (valueAnimator3 != null) {
            valueAnimator3.setDuration(400L);
        }
        ValueAnimator valueAnimator4 = biliEditorStickerBatchEditFragmentV3.f106348D;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
        ValueAnimator valueAnimator5 = biliEditorStickerBatchEditFragmentV3.f106348D;
        if (valueAnimator5 != null) {
            valueAnimator5.addListener(new F(z6));
        }
    }
}
