package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.toolbar.MenuService;
import eu0.C6985d;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/q.class */
public final class C6132q implements MenuService.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.page.view.a f90412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheesePlayRepository f90413b;

    public C6132q(com.bilibili.ship.theseus.united.page.view.a aVar, CheesePlayRepository cheesePlayRepository) {
        this.f90412a = aVar;
        this.f90413b = cheesePlayRepository;
    }

    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    public final int b() {
        return 21;
    }

    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    public final String d() {
        return "united.player-video-detail.0.0";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String g() {
        /*
            r4 = this;
            com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r4
            com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository r0 = r0.f90413b
            r6 = r0
            r0 = r6
            eu0.d r0 = r0.a()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L21
            r0 = r5
            long r0 = r0.f117521q
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5 = r0
            goto L23
        L21:
            r0 = 0
            r5 = r0
        L23:
            r0 = r7
            java.lang.String r1 = "epid"
            r2 = r5
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.addProperty(r1, r2)
            r0 = r6
            eu0.d r0 = r0.a()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L44
            r0 = r5
            long r0 = r0.f117511f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L47
        L44:
            java.lang.String r0 = "0"
            r5 = r0
        L47:
            r0 = r7
            java.lang.String r1 = "cid"
            r2 = r5
            r0.addProperty(r1, r2)
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.modules.C6132q.g():java.lang.String");
    }

    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    public final long getAvid() {
        return this.f90412a.a();
    }

    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    public final BusinessType getBusinessType() {
        return BusinessType.CHEESE;
    }

    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    public final long getCid() {
        return this.f90412a.c();
    }

    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    public final boolean h() {
        C6985d c6985dA = this.f90413b.a();
        boolean z6 = false;
        if (c6985dA != null) {
            z6 = false;
            if (c6985dA.f117516l) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    public final String i() {
        C6985d c6985dA = this.f90413b.a();
        return com.bilibili.app.comment3.ui.i.a(c6985dA != null ? Long.valueOf(c6985dA.f117526v) : null, "https://www.bilibili.com/cheese/play/ss");
    }

    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    public final Map<String, String> j() {
        C6985d c6985dA = this.f90413b.a();
        return MapsKt.mapOf(TuplesKt.to("season_id", String.valueOf(c6985dA != null ? Long.valueOf(c6985dA.f117526v) : null)));
    }

    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    public final void k() {
    }
}
