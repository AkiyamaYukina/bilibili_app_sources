package com.bilibili.pegasus.hot.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.swiperefresh.TintSwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/utils/ViewPagerCompatSwipeRefreshLayout.class */
@StabilityInferred(parameters = 0)
public final class ViewPagerCompatSwipeRefreshLayout extends TintSwipeRefreshLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f78188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f78189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f78191e;

    public ViewPagerCompatSwipeRefreshLayout(@NotNull Context context) {
        this(context, null);
    }

    public ViewPagerCompatSwipeRefreshLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f78191e = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r4) {
        /*
            r3 = this;
            r0 = r4
            int r0 = r0.getAction()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L64
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L5c
            r0 = r7
            r1 = 2
            if (r0 == r1) goto L20
            r0 = r7
            r1 = 3
            if (r0 == r1) goto L5c
            goto L79
        L20:
            r0 = r3
            boolean r0 = r0.f78190d
            if (r0 == 0) goto L29
            r0 = 0
            return r0
        L29:
            r0 = r4
            float r0 = r0.getY()
            r6 = r0
            r0 = r4
            float r0 = r0.getX()
            r1 = r3
            float r1 = r1.f78189c
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r5 = r0
            r0 = r6
            r1 = r3
            float r1 = r1.f78188b
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r6 = r0
            r0 = r5
            r1 = r3
            int r1 = r1.f78191e
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L79
            r0 = r5
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L79
            r0 = r3
            r1 = 1
            r0.f78190d = r1
            r0 = 0
            return r0
        L5c:
            r0 = r3
            r1 = 0
            r0.f78190d = r1
            goto L79
        L64:
            r0 = r3
            r1 = r4
            float r1 = r1.getY()
            r0.f78188b = r1
            r0 = r3
            r1 = r4
            float r1 = r1.getX()
            r0.f78189c = r1
            r0 = r3
            r1 = 0
            r0.f78190d = r1
        L79:
            r0 = r3
            r1 = r4
            boolean r0 = super/*androidx.swiperefreshlayout.widget.SwipeRefreshLayout*/.onInterceptTouchEvent(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.hot.utils.ViewPagerCompatSwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }
}
