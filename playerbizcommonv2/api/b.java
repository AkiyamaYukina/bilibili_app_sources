package com.bilibili.playerbizcommonv2.api;

import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/b.class */
public final class b extends BiliApiCallback<GeneralResponse<Object>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f80818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f80819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f80820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f80821e;

    public b(long j7, long j8, String str, String str2) {
        this.f80818b = j7;
        this.f80819c = j8;
        this.f80820d = str;
        this.f80821e = str2;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        BLog.i(": avid:" + this.f80818b + " " + this.f80819c + " " + this.f80820d + " " + this.f80821e + ",  report playlist failed: " + th.getMessage());
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onSuccess(GeneralResponse<Object> generalResponse) {
        BLog.i("report playlist. avid:" + this.f80818b + " " + this.f80819c + " " + this.f80820d + " " + this.f80821e);
    }
}
