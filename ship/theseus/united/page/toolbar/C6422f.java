package com.bilibili.ship.theseus.united.page.toolbar;

import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.toolbar.MenuService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import lv0.C7893a;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/f.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class C6422f implements Factory<MenuService.a> {
    public static MenuService.a a(BusinessType businessType, C7893a c7893a) {
        return (MenuService.a) Preconditions.checkNotNullFromProvides(new C6421e(businessType, c7893a));
    }
}
