package com.bilibili.live.card.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bilibili.bililive.listplayer.ListPlayerManager;
import com.bilibili.mobile.BLMobileHumanActionNative;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/card/ui/InlinePlayerContainer.class */
public class InlinePlayerContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f65145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f65146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f65147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f65148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f65149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f65150f;

    public InlinePlayerContainer(Context context) {
        super(context);
        this.f65145a = 0.5625d;
        this.f65146b = 0.5625d;
    }

    public InlinePlayerContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65145a = 0.5625d;
        this.f65146b = 0.5625d;
    }

    public double getCurrentBgRatio() {
        return this.f65145a;
    }

    public double getCurrentCoverRatio() {
        return this.f65146b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f65147c = findViewById(2131316158);
        this.f65148d = findViewWithTag("video_blur_cover_tag");
        this.f65149e = findViewWithTag("video_cover_tag");
        this.f65150f = findViewWithTag(ListPlayerManager.FOLLOWING_AUTO_PLAY_VIEW_TAG);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int size = View.MeasureSpec.getSize(i7);
        double d7 = size;
        int i9 = (int) (this.f65145a * d7);
        int i10 = (int) (d7 * this.f65146b);
        int iMax = Math.max(i9, i10);
        View view = this.f65147c;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iMax, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE));
        }
        View view2 = this.f65148d;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(size, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec(i9, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE));
        }
        View view3 = this.f65149e;
        if (view3 != null) {
            view3.measure(View.MeasureSpec.makeMeasureSpec(size, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec(i10, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE));
        }
        View view4 = this.f65150f;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(size, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec(iMax, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE));
        }
        setMeasuredDimension(size, iMax);
    }

    public void setAspectRatio(double d7) {
        double d8;
        if (d7 > 1.7777777777777777d) {
            d8 = 1.7777777777777777d;
        } else {
            d8 = d7;
            if (d7 == 0.0d) {
                d8 = 0.5625d;
            }
        }
        this.f65146b = d8;
        this.f65145a = 0.5625d;
        requestLayout();
    }
}
