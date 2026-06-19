package com.bilibili.ship.theseus.miniplayer.ui;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import com.bilibili.playerbizcommon.utils.BezierInterpolator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/ui/a.class */
public final class a {
    public static void a(View view, long j7, int i7) {
        if ((i7 & 4) != 0) {
            j7 = 100;
        }
        Keyframe keyframeOfFloat = Keyframe.ofFloat(1.0f, 1.0f);
        long j8 = 100 + j7;
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(100 / j8, 0.85f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe(View.SCALE_X, keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3));
        objectAnimatorOfPropertyValuesHolder.setDuration(j8);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new BezierInterpolator(0.25f, 0.1f, 0.25f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.start();
    }
}
