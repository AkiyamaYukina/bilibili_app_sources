package com.bilibili.pegasus.channelv3.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import fl.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/utils/NestedScrollableHost.class */
@StabilityInferred(parameters = 0)
public final class NestedScrollableHost extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f75509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f75510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f75512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f75513e;

    public NestedScrollableHost(@NotNull Context context) {
        super(context);
        this.f75509a = true;
        this.f75511c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public NestedScrollableHost(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75509a = true;
        this.f75511c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b);
        this.f75509a = typedArrayObtainStyledAttributes.getBoolean(1, true);
        this.f75510b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.utils.NestedScrollableHost.getParentViewPager():androidx.viewpager2.widget.ViewPager2");
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r5) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.utils.NestedScrollableHost.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setChildScrollFirst(boolean z6) {
        this.f75510b = z6;
    }
}
