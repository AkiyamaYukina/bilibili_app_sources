package com.bilibili.ship.theseus.united.di;

import com.bapis.bilibili.app.viewunite.v1.TabModule;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.ship.theseus.united.page.tab.TabPage;
import com.google.common.collect.ImmutableMap;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/z.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class z implements Factory<com.bilibili.ship.theseus.united.page.tab.i> {
    public static com.bilibili.ship.theseus.united.page.tab.i a(ViewReply viewReply, ImmutableMap immutableMap) {
        TabPage tabPageA;
        List<TabModule> tabModuleList = viewReply.getTab().getTabModuleList();
        ArrayList arrayList = new ArrayList();
        for (TabModule tabModule : tabModuleList) {
            com.bilibili.ship.theseus.united.page.tab.n nVar = (com.bilibili.ship.theseus.united.page.tab.n) immutableMap.get(tabModule.getTabCase());
            if (nVar == null) {
                tabPageA = null;
                com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-united-ViewReplyBackedModule-provideDetailTab] ", "Unknown tab " + tabModule + "!", "ViewReplyBackedModule-provideDetailTab", (Throwable) null);
            } else {
                tabPageA = nVar.a(tabModule);
            }
            if (tabPageA != null) {
                arrayList.add(tabPageA);
            }
        }
        return (com.bilibili.ship.theseus.united.page.tab.i) Preconditions.checkNotNullFromProvides(new com.bilibili.ship.theseus.united.page.tab.i(arrayList, viewReply.getTab().getTabBg(), viewReply.getTab().getTabBgWidescreen()));
    }
}
