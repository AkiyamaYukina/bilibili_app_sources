package com.bilibili.upper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/NoScrollViewPager.class */
public class NoScrollViewPager extends ViewPager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f114399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f114400b;

    public NoScrollViewPager(Context context) {
        super(context);
        this.f114399a = false;
        this.f114400b = false;
    }

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114399a = false;
        this.f114400b = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean canScrollHorizontally(int i7) {
        if (this.f114400b) {
            return super.canScrollHorizontally(i7);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.f114399a) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        } catch (Exception e7) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.f114399a) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        } catch (Exception e7) {
            return false;
        }
    }

    public void setScrollble(boolean z6) {
        this.f114399a = z6;
    }
}
