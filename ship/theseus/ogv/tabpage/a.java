package com.bilibili.ship.theseus.ogv.tabpage;

import Pj0.e;
import com.bapis.bilibili.app.viewunite.v1.TabModule;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.tab.TabPage;
import com.bilibili.ship.theseus.united.page.tab.n;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/a.class */
public final /* synthetic */ class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PageReportService f94570a;

    @Override // com.bilibili.ship.theseus.united.page.tab.n
    public final TabPage a(TabModule tabModule) {
        return new b((ActivityTab) JsonUtilKt.parseJson(e.a(tabModule.getActivityTab()), new c().getType()), this.f94570a);
    }
}
