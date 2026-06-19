package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import com.bilibili.ship.theseus.united.page.report.PageReportService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import mv0.C8043a;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/e.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class C6368e implements Factory<InterfaceC6364a> {
    public static InterfaceC6364a a(C6367d c6367d, C8043a c8043a, com.bilibili.ship.theseus.united.page.view.a aVar, PageReportService pageReportService) {
        c6367d.getClass();
        return (InterfaceC6364a) Preconditions.checkNotNullFromProvides(new C6366c(c8043a, aVar, pageReportService));
    }
}
