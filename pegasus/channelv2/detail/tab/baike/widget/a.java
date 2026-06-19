package com.bilibili.pegasus.channelv2.detail.tab.baike.widget;

import android.animation.ValueAnimator;
import com.bilibili.pegasus.channelv2.detail.tab.baike.widget.BaikeNavigationLayout;
import com.bilibili.video.story.action.widget.StoryChargeBarWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/widget/a.class */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75211a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f75212b;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f75211a) {
            case 0:
                BaikeNavigationLayout baikeNavigationLayout = (BaikeNavigationLayout) this.f75212b;
                BaikeNavigationLayout.a aVar = BaikeNavigationLayout.f75177G;
                baikeNavigationLayout.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baikeNavigationLayout.f75189f = fFloatValue;
                int i7 = baikeNavigationLayout.f75187d;
                float left = baikeNavigationLayout.f75190g - (i7 > 0 ? baikeNavigationLayout.f75186c.getChildAt(i7).getLeft() - baikeNavigationLayout.f75182E : 0);
                int i8 = baikeNavigationLayout.f75188e;
                baikeNavigationLayout.c(baikeNavigationLayout.f75187d, (int) ((left * fFloatValue) / (i8 - r0)));
                baikeNavigationLayout.invalidate();
                break;
            default:
                StoryChargeBarWidget storyChargeBarWidget = (StoryChargeBarWidget) this.f75212b;
                int i9 = StoryChargeBarWidget.D;
                storyChargeBarWidget.a.g.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
