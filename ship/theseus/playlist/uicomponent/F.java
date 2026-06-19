package com.bilibili.ship.theseus.playlist.uicomponent;

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/F.class */
public final class F implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f95991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f95992b;

    public F(TextView textView, TextView textView2) {
        this.f95991a = textView;
        this.f95992b = textView2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onGlobalLayout() {
        /*
            r6 = this;
            r0 = r6
            android.widget.TextView r0 = r0.f95991a
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r1 = r6
            r0.removeOnGlobalLayoutListener(r1)
            r0 = r6
            android.widget.TextView r0 = r0.f95991a
            java.lang.CharSequence r0 = r0.getText()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L25
            r0 = r9
            java.lang.String r0 = r0.toString()
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r10
            if (r0 != 0) goto L28
        L25:
            java.lang.String r0 = ""
            r9 = r0
        L28:
            r0 = r6
            android.widget.TextView r0 = r0.f95991a
            int r0 = r0.getMeasuredWidth()
            r8 = r0
            r0 = r6
            android.widget.TextView r0 = r0.f95991a
            android.text.TextPaint r0 = r0.getPaint()
            r1 = r9
            float r0 = r0.measureText(r1)
            r7 = r0
            r0 = r8
            float r0 = (float) r0
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L5d
            r0 = r6
            android.widget.TextView r0 = r0.f95991a
            r1 = 0
            r2 = 0
            r3 = 1105199104(0x41e00000, float:28.0)
            int r3 = com.bilibili.droid.DimenUtilsKt.dpToPx(r3)
            r4 = 0
            r0.setPadding(r1, r2, r3, r4)
            r0 = r6
            android.widget.TextView r0 = r0.f95992b
            r1 = 4
            r0.setVisibility(r1)
            goto L74
        L5d:
            r0 = r6
            android.widget.TextView r0 = r0.f95991a
            r1 = 0
            r2 = 0
            r3 = 1113063424(0x42580000, float:54.0)
            int r3 = com.bilibili.droid.DimenUtilsKt.dpToPx(r3)
            r4 = 0
            r0.setPadding(r1, r2, r3, r4)
            r0 = r6
            android.widget.TextView r0 = r0.f95992b
            r1 = 0
            r0.setVisibility(r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.uicomponent.F.onGlobalLayout():void");
    }
}
