package com.bilibili.upper.module.partitionTag.partitionTopic.activity;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bilibili.upper.module.partitionTag.partitionTopic.activity.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/activity/b.class */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f113749a;

    public b(a aVar) {
        this.f113749a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        FrameLayout frameLayout = this.f113749a.f113739C;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.height = iIntValue;
            this.f113749a.f113739C.setLayoutParams(layoutParams);
            a aVar = this.f113749a;
            a.d dVar = aVar.f113745I;
            if (dVar != null) {
                if (iIntValue == aVar.f113743G) {
                    dVar.c(true);
                }
                a aVar2 = this.f113749a;
                if (iIntValue == aVar2.f113744H) {
                    aVar2.f113745I.b(true);
                }
            }
        }
    }
}
