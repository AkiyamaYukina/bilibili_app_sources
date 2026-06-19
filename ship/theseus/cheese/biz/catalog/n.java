package com.bilibili.ship.theseus.cheese.biz.catalog;

import com.bapis.bilibili.app.viewunite.v1.TabModule;
import com.bilibili.ship.theseus.united.page.tab.TabPage;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/n.class */
public final /* synthetic */ class n implements com.bilibili.ship.theseus.united.page.tab.n {
    @Override // com.bilibili.ship.theseus.united.page.tab.n
    public final TabPage a(TabModule tabModule) {
        return new o(new b(tabModule.getCatalog().getTitle()));
    }
}
