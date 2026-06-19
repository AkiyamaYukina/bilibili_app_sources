package com.bilibili.ship.theseus.cheese.biz.catalog;

import android.content.res.ColorStateList;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.cheese.biz.catalog.p;
import com.bilibili.ship.theseus.united.page.tab.TabPage;
import com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$_init_$lambda$1$$inlined$map$1;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/o.class */
public final class o implements TabPage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f89191a;

    public o(b bVar) {
        this.f89191a = bVar;
    }

    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final Qj0.d a() {
        return new Qj0.d(CheeseCatalogTabFragment.class, null);
    }

    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final TabPage.LocatableTag b() {
        return TabPage.LocatableTag.Catalog;
    }

    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final RunningUIComponent c(TheseusTabPagerService$_init_$lambda$1$$inlined$map$1 theseusTabPagerService$_init_$lambda$1$$inlined$map$1, ColorStateList colorStateList, boolean z6) {
        p.a aVar = new p.a();
        b bVar = this.f89191a;
        String str = aVar.f89193a;
        String str2 = bVar.f89157a;
        if (!Intrinsics.areEqual(str2, str)) {
            aVar.f89193a = str2;
            aVar.notifyPropertyChanged(640);
        }
        aVar.f89195c = colorStateList;
        return new RunningUIComponent(new p(aVar), 0, new CheeseCatalogTabPageModule$providerCatalog$1$1$newTabUIComponent$1(theseusTabPagerService$_init_$lambda$1$$inlined$map$1, aVar, null), 2);
    }

    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final Map<String, String> e() {
        return MapsKt.mapOf(TuplesKt.to("tab_name", this.f89191a.f89157a));
    }
}
