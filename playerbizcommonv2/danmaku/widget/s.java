package com.bilibili.playerbizcommonv2.danmaku.widget;

import com.bilibili.okretro.BiliApiDataCallback;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/s.class */
public final class s extends BiliApiDataCallback<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f81695b;

    public s(q qVar) {
        this.f81695b = qVar;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final boolean isCancel() {
        return this.f81695b.f81683q == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    @Override // com.bilibili.okretro.BiliApiDataCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDataSuccess(java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.widget.s.onDataSuccess(java.lang.Object):void");
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
    }
}
