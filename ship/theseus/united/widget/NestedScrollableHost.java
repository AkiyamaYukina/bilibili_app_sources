package com.bilibili.ship.theseus.united.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager2.widget.ViewPager2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/NestedScrollableHost.class */
@StabilityInferred(parameters = 0)
public final class NestedScrollableHost extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f104899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f104900c;

    public NestedScrollableHost(@NotNull Context context) {
        super(context);
        this.f104898a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public NestedScrollableHost(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f104898a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final View getChild() {
        return getChildCount() > 0 ? getChildAt(0) : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001a, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final androidx.viewpager2.widget.ViewPager2 getParentViewPager() {
        /*
            r2 = this;
            r0 = r2
            android.view.ViewParent r0 = r0.getParent()
            r4 = r0
            r0 = r4
            boolean r0 = r0 instanceof android.view.View
            r3 = r0
            r0 = 0
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L18
            r0 = r4
            android.view.View r0 = (android.view.View) r0
            r4 = r0
            goto L1a
        L18:
            r0 = 0
            r4 = r0
        L1a:
            r0 = r4
            if (r0 == 0) goto L39
            r0 = r4
            boolean r0 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r0 != 0) goto L39
            r0 = r4
            android.view.ViewParent r0 = r0.getParent()
            r4 = r0
            r0 = r4
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L18
            r0 = r4
            android.view.View r0 = (android.view.View) r0
            r4 = r0
            goto L1a
        L39:
            r0 = r4
            boolean r0 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r0 == 0) goto L45
            r0 = r4
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            r5 = r0
        L45:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.widget.NestedScrollableHost.getParentViewPager():androidx.viewpager2.widget.ViewPager2");
    }

    public final boolean a(float f7, int i7) {
        int i8 = -((int) Math.signum(f7));
        boolean zCanScrollHorizontally = false;
        if (i7 == 0) {
            View child = getChild();
            if (child != null) {
                zCanScrollHorizontally = child.canScrollHorizontally(i8);
            }
        } else {
            if (i7 != 1) {
                throw new IllegalArgumentException();
            }
            View child2 = getChild();
            if (child2 != null) {
                zCanScrollHorizontally = child2.canScrollVertically(i8);
            }
        }
        return zCanScrollHorizontally;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        ViewPager2 parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            int orientation = parentViewPager.getOrientation();
            if (a(-1.0f, orientation) || a(1.0f, orientation)) {
                if (motionEvent.getAction() == 0) {
                    this.f104899b = motionEvent.getX();
                    this.f104900c = motionEvent.getY();
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (motionEvent.getAction() == 2) {
                    float x6 = motionEvent.getX() - this.f104899b;
                    float y6 = motionEvent.getY() - this.f104900c;
                    boolean z6 = orientation == 0;
                    float fAbs = Math.abs(x6) * (z6 ? 0.5f : 1.0f);
                    float fAbs2 = Math.abs(y6) * (z6 ? 1.0f : 0.5f);
                    float f7 = this.f104898a;
                    if (fAbs > f7 || fAbs2 > f7) {
                        if (z6 == (fAbs2 > fAbs)) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        } else {
                            if (a(z6 ? x6 : y6, orientation)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            } else {
                                getParent().requestDisallowInterceptTouchEvent(false);
                            }
                        }
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
