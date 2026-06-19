package com.bilibili.studio.editor.moudle.caption.setting.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/widget/NoScrollViewPager.class */
public class NoScrollViewPager extends ViewPager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f105966a;

    public NoScrollViewPager(Context context) {
        super(context);
        this.f105966a = false;
    }

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f105966a = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f105966a && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f105966a && super.onTouchEvent(motionEvent);
    }

    public void setScrollble(boolean z6) {
        this.f105966a = z6;
    }
}
