package com.bilibili.pegasus.widgets;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/a.class */
public final class a extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f79216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f79217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f79218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f79219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f79220e;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = r6
            float r0 = r0.getX()
            int r0 = (int) r0
            r8 = r0
            r0 = r6
            float r0 = r0.getY()
            int r0 = (int) r0
            r9 = r0
            r0 = r6
            int r0 = r0.getActionMasked()
            r10 = r0
            r0 = 0
            r13 = r0
            r0 = 1
            r12 = r0
            r0 = 1
            r14 = r0
            r0 = r10
            if (r0 == 0) goto L72
            r0 = r10
            r1 = 1
            if (r0 == r1) goto L54
            r0 = r10
            r1 = 2
            if (r0 == r1) goto L54
            r0 = r10
            r1 = 3
            if (r0 == r1) goto L46
            r0 = r10
            r1 = 5
            if (r0 == r1) goto L54
            r0 = r10
            r1 = 6
            if (r0 == r1) goto L54
            r0 = 0
            r11 = r0
            goto L84
        L46:
            r0 = r5
            boolean r0 = r0.f79219d
            r11 = r0
            r0 = r5
            r1 = 0
            r0.f79219d = r1
            goto L84
        L54:
            r0 = r5
            boolean r0 = r0.f79219d
            r11 = r0
            r0 = r14
            r12 = r0
            r0 = r11
            if (r0 == 0) goto L6f
            r0 = r5
            android.graphics.Rect r0 = r0.f79218c
            r1 = r8
            r2 = r9
            boolean r0 = r0.contains(r1, r2)
            r12 = r0
        L6f:
            goto L84
        L72:
            r0 = r5
            android.graphics.Rect r0 = r0.f79217b
            r1 = r8
            r2 = r9
            boolean r0 = r0.contains(r1, r2)
            r11 = r0
            r0 = r5
            r1 = r11
            r0.f79219d = r1
        L84:
            r0 = r11
            if (r0 == 0) goto Lc2
            r0 = r5
            android.view.View r0 = r0.f79216a
            r15 = r0
            r0 = r12
            if (r0 == 0) goto Lab
            r0 = r6
            r1 = r15
            int r1 = r1.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r2 = r15
            int r2 = r2.getHeight()
            r3 = 2
            int r2 = r2 / r3
            float r2 = (float) r2
            r0.setLocation(r1, r2)
            goto Lba
        Lab:
            r0 = r5
            int r0 = r0.f79220e
            r1 = 2
            int r0 = r0 * r1
            int r0 = -r0
            float r0 = (float) r0
            r7 = r0
            r0 = r6
            r1 = r7
            r2 = r7
            r0.setLocation(r1, r2)
        Lba:
            r0 = r15
            r1 = r6
            boolean r0 = r0.dispatchTouchEvent(r1)
            r13 = r0
        Lc2:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.widgets.a.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
