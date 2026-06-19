package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/x.class */
public final /* synthetic */ class C6102x implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheesePrimaryService f89788a;

    public /* synthetic */ C6102x(CheesePrimaryService cheesePrimaryService) {
        this.f89788a = cheesePrimaryService;
    }

    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Long) obj).longValue();
        CheesePrimaryService cheesePrimaryService = this.f89788a;
        PageReportService.g(cheesePrimaryService.f89596i, "pugv.detail.set.season.click", (Map) obj2, 4);
        if (cheesePrimaryService.f89597j.f117531a != jLongValue) {
            cheesePrimaryService.f89598k.b(jLongValue);
        }
        return Unit.INSTANCE;
    }
}
