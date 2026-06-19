package com.bilibili.ship.theseus.ogv;

import androidx.compose.ui.graphics.Color;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/m.class */
public final class C6209m implements com.bilibili.ship.theseus.united.page.danmaku.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f93968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f93969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f93970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f93971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f93972f;

    public C6209m(com.bilibili.ship.theseus.united.page.danmaku.n nVar, long j7, long j8, long j9, long j10, long j11) {
        this.f93967a = j7 == 16 ? nVar.c() : j7;
        this.f93968b = j8 == 16 ? nVar.e() : j8;
        this.f93969c = j9 == 16 ? nVar.f() : j9;
        this.f93970d = j10 == 16 ? nVar.d() : j10;
        this.f93971e = j11 == 16 ? nVar.a() : j11;
        this.f93972f = j7 != 16 ? Color.Companion.m2664getTransparent0d7_KjU() : nVar.b();
    }

    @Override // com.bilibili.ship.theseus.united.page.danmaku.n
    public final long a() {
        return this.f93971e;
    }

    @Override // com.bilibili.ship.theseus.united.page.danmaku.n
    public final long b() {
        return this.f93972f;
    }

    @Override // com.bilibili.ship.theseus.united.page.danmaku.n
    public final long c() {
        return this.f93967a;
    }

    @Override // com.bilibili.ship.theseus.united.page.danmaku.n
    public final long d() {
        return this.f93970d;
    }

    @Override // com.bilibili.ship.theseus.united.page.danmaku.n
    public final long e() {
        return this.f93968b;
    }

    @Override // com.bilibili.ship.theseus.united.page.danmaku.n
    public final long f() {
        return this.f93969c;
    }
}
