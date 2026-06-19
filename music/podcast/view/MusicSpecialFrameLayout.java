package com.bilibili.music.podcast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicSpecialFrameLayout.class */
public final class MusicSpecialFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f67121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f67122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f67123d;

    public MusicSpecialFrameLayout(@NotNull Context context) {
        this(context, null);
    }

    public MusicSpecialFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f67120a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r4) {
        /*
            r3 = this;
            r0 = r4
            float r0 = r0.getX()
            r6 = r0
            r0 = r4
            float r0 = r0.getY()
            r5 = r0
            r0 = r4
            int r0 = r0.getAction()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L82
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L7a
            r0 = r7
            r1 = 2
            if (r0 == r1) goto L2a
            r0 = r7
            r1 = 3
            if (r0 == r1) goto L7a
            goto La4
        L2a:
            r0 = r3
            boolean r0 = r0.f67123d
            if (r0 != 0) goto La4
            r0 = r3
            float r0 = r0.f67121b
            r1 = r6
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r1 = r3
            int r1 = r1.f67120a
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L55
            r0 = r3
            float r0 = r0.f67122c
            r1 = r5
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r1 = r3
            int r1 = r1.f67120a
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto La4
        L55:
            r0 = r3
            r1 = 1
            r0.f67123d = r1
            r0 = r3
            android.view.ViewParent r0 = r0.getParent()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L6d
            r0 = r8
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
        L6d:
            r0 = r3
            r1 = r6
            r0.f67121b = r1
            r0 = r3
            r1 = r5
            r0.f67122c = r1
            goto La4
        L7a:
            r0 = r3
            r1 = 0
            r0.f67123d = r1
            goto La4
        L82:
            r0 = r3
            r1 = 0
            r0.f67123d = r1
            r0 = r3
            r1 = r6
            r0.f67121b = r1
            r0 = r3
            r1 = r5
            r0.f67122c = r1
            r0 = r3
            android.view.ViewParent r0 = r0.getParent()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto La4
            r0 = r8
            r1 = 1
            r0.requestDisallowInterceptTouchEvent(r1)
        La4:
            r0 = r3
            r1 = r4
            boolean r0 = super.dispatchTouchEvent(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.view.MusicSpecialFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
