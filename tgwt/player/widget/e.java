package com.bilibili.tgwt.player.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/e.class */
public final class e implements ControlContainerVisibleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f111802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f111803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f111804c;

    public e(f fVar, View view, Context context) {
        this.f111802a = fVar;
        this.f111803b = view;
        this.f111804c = context;
    }

    public final void onControlContainerVisibleChanged(boolean z6) {
        ValueAnimator duration;
        ValueAnimator valueAnimator;
        f fVar = this.f111802a;
        ValueAnimator valueAnimator2 = fVar.h;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = fVar.h) != null) {
            valueAnimator.cancel();
        }
        fVar.h = null;
        ValueAnimator valueAnimatorOfInt = z6 ? ValueAnimator.ofInt(((ViewGroup.MarginLayoutParams) this.f111803b.getLayoutParams()).bottomMargin, fVar.f111812i) : ValueAnimator.ofInt(((ViewGroup.MarginLayoutParams) this.f111803b.getLayoutParams()).bottomMargin, Uj0.c.b(33, this.f111804c));
        fVar.h = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            final View view = this.f111803b;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view) { // from class: com.bilibili.tgwt.player.widget.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final View f111801a;

                {
                    this.f111801a = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    View view2 = this.f111801a;
                    ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).bottomMargin = ((Integer) valueAnimator3.getAnimatedValue()).intValue();
                    view2.requestLayout();
                }
            });
        }
        ValueAnimator valueAnimator3 = fVar.h;
        if (valueAnimator3 == null || (duration = valueAnimator3.setDuration(150L)) == null) {
            return;
        }
        duration.start();
    }
}
