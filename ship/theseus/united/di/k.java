package com.bilibili.ship.theseus.united.di;

import com.bapis.bilibili.app.viewunite.v1.ActivityResource;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/k.class */
public final class k implements com.bilibili.ship.theseus.united.page.danmaku.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f98775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f98776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f98777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f98778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f98779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f98780f;

    public k(ActivityResource activityResource) {
        this.f98775a = m.a(activityResource.getLightTextColor());
        this.f98776b = m.a(activityResource.getTextColor());
        this.f98777c = m.a(activityResource.getBgColor());
        this.f98778d = m.a(activityResource.getDividerColor());
        this.f98779e = m.a(activityResource.getSelectedBgColor());
        this.f98780f = m.a(activityResource.getSelectedBgColor());
    }

    @Override // com.bilibili.ship.theseus.united.page.danmaku.n
    public final long a() {
        return this.f98775a;
    }

    @Override // com.bilibili.ship.theseus.united.page.danmaku.n
    public final long b() {
        return this.f98778d;
    }

    @Override // com.bilibili.ship.theseus.united.page.danmaku.n
    public final long c() {
        return this.f98779e;
    }

    @Override // com.bilibili.ship.theseus.united.page.danmaku.n
    public final long d() {
        return this.f98776b;
    }

    @Override // com.bilibili.ship.theseus.united.page.danmaku.n
    public final long e() {
        return this.f98780f;
    }

    @Override // com.bilibili.ship.theseus.united.page.danmaku.n
    public final long f() {
        return this.f98777c;
    }
}
