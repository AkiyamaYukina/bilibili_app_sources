package com.bilibili.ship.theseus.cheese.biz.intro.cooperation;

import com.bapis.bilibili.app.viewunite.common.PugvCooperationApplication;
import com.bilibili.ship.theseus.cheese.biz.intro.cooperation.a;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kntr.app.ad.biz.videodetail.pausedpage.ui.AdPausedPageScreenKt;
import kntr.app.ad.biz.videodetail.pausedpage.ui.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/cooperation/c.class */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f89367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f89368c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f89366a = i7;
        this.f89367b = obj;
        this.f89368c = obj2;
    }

    public final Object invoke(Object obj) {
        Object obj2 = this.f89368c;
        Object obj3 = this.f89367b;
        switch (this.f89366a) {
            case 0:
                a.C0607a.InterfaceC0608a interfaceC0608a = (a.C0607a.InterfaceC0608a) obj;
                boolean zAreEqual = Intrinsics.areEqual(interfaceC0608a, a.C0607a.InterfaceC0608a.C0609a.f89363a);
                d dVar = (d) obj3;
                if (zAreEqual) {
                    if (!dVar.f89372d) {
                        PageReportService.i(dVar.f89370b, "pugv.detail.apply.0.show", null, 6);
                        dVar.f89372d = true;
                    }
                } else {
                    if (!Intrinsics.areEqual(interfaceC0608a, a.C0607a.InterfaceC0608a.b.f89364a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PageReportService.g(dVar.f89370b, "pugv.detail.apply.0.click", null, 6);
                    qV.a.b(dVar.f89369a, ((PugvCooperationApplication) obj2).getLink());
                }
                return Unit.INSTANCE;
            default:
                float f7 = AdPausedPageScreenKt.a;
                t0 t0Var = (t0) obj3;
                t0Var.getClass();
                t0.a("reportMiitPrivacyClick");
                t0.c(t0Var, "paused_page_miit_privacy_click");
                ((Function1) obj2).invoke((String) obj);
                return Unit.INSTANCE;
        }
    }
}
