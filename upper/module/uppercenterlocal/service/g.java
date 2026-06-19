package com.bilibili.upper.module.uppercenterlocal.service;

import com.bilibili.upper.module.uppercenterlocal.service.e;
import kntr.base.jsb.api.upper.MuxStatus;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/service/g.class */
public final class g implements CC0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e.a f114297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114298c;

    public g(String str, e.a aVar, String str2) {
        this.f114296a = str;
        this.f114297b = aVar;
        this.f114298c = str2;
    }

    @Override // CC0.g
    public final void d() {
        Xi1.b.a(new StringBuilder("onMediaStart: taskId="), this.f114296a, "UpperCenterService");
        this.f114297b.f114281b = MuxStatus.MUX_STATUS_PROCESSING.ordinal();
    }

    @Override // CC0.g
    public final void g(String str) {
        BLog.d("UpperCenterService", "onMediaDone: taskId=" + this.f114296a + ", dstFilePath=" + str);
        int iOrdinal = MuxStatus.MUX_STATUS_SUCCESS.ordinal();
        e.a aVar = this.f114297b;
        aVar.f114281b = iOrdinal;
        aVar.f114282c = 100;
        String str2 = str;
        if (str == null) {
            str2 = this.f114298c;
        }
        aVar.f114283d = str2;
    }

    @Override // CC0.g
    public final void k() {
        Xi1.b.a(new StringBuilder("onMediaCancel: taskId="), this.f114296a, "UpperCenterService");
        this.f114297b.f114281b = MuxStatus.MUX_STATUS_CANCELED.ordinal();
    }

    @Override // CC0.g
    public final void m(int i7) {
        this.f114297b.f114282c = i7;
    }

    @Override // CC0.g
    public final void onError(int i7, String str) {
        StringBuilder sb = new StringBuilder("onError: taskId=");
        H0.e.b(i7, this.f114296a, ", errorCode=", ", exe=", sb);
        S9.b.a(sb, str, "UpperCenterService");
        int iOrdinal = MuxStatus.MUX_STATUS_FAILED.ordinal();
        e.a aVar = this.f114297b;
        aVar.f114281b = iOrdinal;
        aVar.f114284e = i7;
        String str2 = str;
        if (str == null) {
            str2 = "mux failed";
        }
        aVar.f114285f = str2;
    }
}
