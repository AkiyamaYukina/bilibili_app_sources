package com.bilibili.ship.theseus.ogv.intro;

import android.content.Context;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.ogv.pay.OgvPayService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.C6376a;
import xl0.C8986a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/E.class */
public final class E implements com.bilibili.ship.theseus.united.page.restrictionlayer.t<C6376a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.page.screenstate.c f92205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bilibili.ship.theseus.keel.player.h f92206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiliAccounts f92207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f92208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OgvPayService f92209e;

    public E(com.bilibili.ship.theseus.united.page.screenstate.c cVar, com.bilibili.ship.theseus.keel.player.h hVar, BiliAccounts biliAccounts, Context context, OgvPayService ogvPayService) {
        this.f92205a = cVar;
        this.f92206b = hVar;
        this.f92207c = biliAccounts;
        this.f92208d = context;
        this.f92209e = ogvPayService;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final void a(C6376a c6376a) {
        this.f92205a.g();
        this.f92206b.pause();
        if (this.f92207c.isLogin()) {
            this.f92209e.d();
        } else {
            Qj0.g.e(this.f92208d, C8986a.a());
        }
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final Class<C6376a> b() {
        return C6376a.class;
    }
}
