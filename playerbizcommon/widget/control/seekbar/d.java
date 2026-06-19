package com.bilibili.playerbizcommon.widget.control.seekbar;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.animation.DecelerateInterpolator;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.bilibili.bplus.followingcard.widget.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/d.class */
public final class d extends LottieDrawable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public ValueAnimator f80628A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final LottieComposition f80629v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final LottieComposition f80630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f80631x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f80632y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f80633z = 1.0f;

    public d(@Nullable LottieComposition lottieComposition, @Nullable LottieComposition lottieComposition2) {
        this.f80629v = lottieComposition;
        this.f80630w = lottieComposition2;
        setComposition(lottieComposition);
        setProgress(0.5f);
    }

    @Override // com.airbnb.lottie.LottieDrawable, android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        try {
            int iSave = canvas.save();
            try {
                Rect bounds = getBounds();
                float fExactCenterX = bounds.exactCenterX();
                float fExactCenterY = bounds.exactCenterY();
                float f7 = this.f80633z;
                canvas.scale(f7, f7, fExactCenterX, fExactCenterY);
                canvas.translate(bounds.left, bounds.top);
                super.draw(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } catch (Exception e7) {
            BLog.e("SeekWidgetDrawable", e7);
        }
    }

    public final void m(boolean z6) {
        if (!z6) {
            ValueAnimator valueAnimator = this.f80628A;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                return;
            }
            return;
        }
        this.f80633z = 0.3f;
        ValueAnimator valueAnimator2 = this.f80628A;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        float f7 = this.f80633z;
        if (f7 == 1.0f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f7, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new r(this));
        valueAnimatorOfFloat.addListener(new c(this));
        valueAnimatorOfFloat.start();
        this.f80628A = valueAnimatorOfFloat;
    }

    public final void onProgressChanged(int i7) {
        if (this.f80632y) {
            return;
        }
        int i8 = i7 - this.f80631x;
        this.f80631x = i7;
        float fMin = Math.min(Math.max(getProgress(), 0.0f), 1.0f);
        if (i8 > 0) {
            setProgress(fMin + 0.05f);
        } else if (i8 < 0) {
            setProgress(fMin - 0.05f);
        } else {
            setProgress(fMin < 0.5f ? fMin + 0.05f : fMin - 0.05f);
        }
    }

    @Override // com.airbnb.lottie.LottieDrawable
    public final boolean setComposition(@NotNull LottieComposition lottieComposition) {
        Rect rect = new Rect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        boolean composition = super.setComposition(lottieComposition);
        setBounds(rect);
        return composition;
    }
}
