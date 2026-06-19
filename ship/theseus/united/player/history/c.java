package com.bilibili.ship.theseus.united.player.history;

import c6.O;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/history/c.class */
public final class c extends BiliApiCallback<GeneralResponse<Object>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f104484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f104485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f104486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f104487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f104488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f104489g;

    public c(long j7, b bVar, long j8, long j9, String str, long j10) {
        this.f104484b = j7;
        this.f104485c = bVar;
        this.f104486d = j8;
        this.f104487e = j9;
        this.f104488f = str;
        this.f104489g = j10;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        defpackage.a.b("[theseus-united-TheseusHistoryService$reportVideoProgress$1-onError] ", O.a(this.f104484b, ",  report play position failed: ", th.getMessage(), new StringBuilder(": cid ")), "TheseusHistoryService$reportVideoProgress$1-onError");
        this.f104485c.f104481k = null;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onSuccess(GeneralResponse<Object> generalResponse) {
        defpackage.a.b("[theseus-united-TheseusHistoryService$reportVideoProgress$1-onSuccess] ", "reported play position. cid: " + this.f104484b + ", aid: " + this.f104486d + ", progress: " + this.f104487e + ", source: " + this.f104488f + ", duration: " + this.f104489g, "TheseusHistoryService$reportVideoProgress$1-onSuccess");
    }
}
