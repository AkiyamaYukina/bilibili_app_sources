package com.bilibili.topix.center;

import android.text.TextWatcher;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/t.class */
public final class t implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopixCenterSearchFragment f112439a;

    public t(TopixCenterSearchFragment topixCenterSearchFragment) {
        this.f112439a = topixCenterSearchFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void afterTextChanged(android.text.Editable r5) {
        /*
            r4 = this;
            r0 = r4
            com.bilibili.topix.center.TopixCenterSearchFragment r0 = r0.f112439a
            com.bilibili.topix.center.TopixCenterSearchViewModel r0 = r0.kf()
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L17
            r0 = r5
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L1a
        L17:
            java.lang.String r0 = ""
            r5 = r0
        L1a:
            r0 = r7
            r1 = r5
            r2 = 1
            r0.I0(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.center.t.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }
}
