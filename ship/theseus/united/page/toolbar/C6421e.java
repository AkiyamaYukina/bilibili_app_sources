package com.bilibili.ship.theseus.united.page.toolbar;

import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.toolbar.MenuService;
import lv0.C7893a;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/e.class */
public final class C6421e implements MenuService.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BusinessType f103385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C7893a f103386b;

    public C6421e(BusinessType businessType, C7893a c7893a) {
        this.f103385a = businessType;
        this.f103386b = c7893a;
    }

    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    public final long getAvid() {
        C7893a.C1318a c1318aC = this.f103386b.c();
        return c1318aC != null ? c1318aC.f123395a.f123397a : 0L;
    }

    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    public final BusinessType getBusinessType() {
        return this.f103385a;
    }

    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    public final long getCid() {
        C7893a.C1318a c1318aC = this.f103386b.c();
        return c1318aC != null ? c1318aC.f123395a.f123398b : 0L;
    }
}
