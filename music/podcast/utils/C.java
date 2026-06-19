package com.bilibili.music.podcast.utils;

import TB0.C2883o;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bilibili.music.podcast.view.MusicTopCarLayout;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorCaptionEditFragmentV3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/C.class */
public final /* synthetic */ class C implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66900a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f66901b;

    public /* synthetic */ C(MusicTopCarLayout musicTopCarLayout) {
        this.f66901b = musicTopCarLayout;
    }

    public /* synthetic */ C(BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3) {
        this.f66901b = biliEditorCaptionEditFragmentV3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f66900a) {
            case 0:
                ((MusicTopCarLayout) this.f66901b).a(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
                break;
            default:
                BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3 = (BiliEditorCaptionEditFragmentV3) this.f66901b;
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C2883o c2883o = biliEditorCaptionEditFragmentV3.f106319g;
                C2883o c2883o2 = c2883o;
                if (c2883o == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c2883o2 = null;
                }
                LinearLayout linearLayout = c2883o2.f23885a;
                C2883o c2883o3 = biliEditorCaptionEditFragmentV3.f106319g;
                if (c2883o3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c2883o3 = null;
                }
                ViewGroup.LayoutParams layoutParams = c2883o3.f23885a.getLayoutParams();
                layoutParams.height = iIntValue;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
