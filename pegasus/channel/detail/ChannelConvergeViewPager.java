package com.bilibili.pegasus.channel.detail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/detail/ChannelConvergeViewPager.class */
@StabilityInferred(parameters = 0)
public final class ChannelConvergeViewPager extends ViewPager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f74841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f74843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f74844d;

    public ChannelConvergeViewPager(@NotNull Context context) {
        this(context, null);
    }

    public ChannelConvergeViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74843c = -1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean canScroll(@Nullable View view, boolean z6, int i7, int i8, int i9) {
        if (!Intrinsics.areEqual(view, this) || this.f74844d) {
            return super.canScroll(view, z6, i7, i8, i9);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return this.f74844d;
    }

    public final boolean getPagingEnable() {
        return this.f74844d;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        if (!this.f74844d) {
            if (motionEvent == null || motionEvent.getAction() != 2) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    this.f74843c = motionEvent.getPointerId(0);
                    this.f74841a = (int) motionEvent.getX();
                    this.f74842b = (int) motionEvent.getY();
                    return false;
                }
            } else {
                if (this.f74843c == -1) {
                    return false;
                }
                int iFindPointerIndex = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
                float x6 = motionEvent.getX(iFindPointerIndex);
                float y6 = motionEvent.getY(iFindPointerIndex);
                float f7 = this.f74841a;
                float f8 = this.f74842b;
                float fAbs = Math.abs(x6 - f7);
                float fAbs2 = Math.abs(y6 - f8);
                this.f74841a = (int) x6;
                this.f74842b = (int) y6;
                if (((double) fAbs) * 0.5d > fAbs2) {
                    return false;
                }
            }
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e7) {
            BLog.w(e7.getMessage(), e7);
            return false;
        }
    }

    public final void setPagingEnable(boolean z6) {
        this.f74844d = z6;
    }
}
