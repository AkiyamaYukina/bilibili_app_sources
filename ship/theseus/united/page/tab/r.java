package com.bilibili.ship.theseus.united.page.tab;

import android.app.Application;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.ship.theseus.united.page.tab.TabPage;
import com.google.android.material.tabs.TabLayout;
import kotlin.collections.CollectionsKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/r.class */
public final class r implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TheseusTabPagerService f103205a;

    public r(TheseusTabPagerService theseusTabPagerService) {
        this.f103205a = theseusTabPagerService;
    }

    public final void onTabReselected(TabLayout.Tab tab) {
        TabPage.LocatableTag locatableTagB;
        if (tab == null) {
            return;
        }
        TheseusTabPagerService theseusTabPagerService = this.f103205a;
        TabPage tabPage = (TabPage) CollectionsKt.getOrNull(theseusTabPagerService.f103137g.f103191a, tab.getPosition());
        if (tabPage == null || (locatableTagB = tabPage.b()) == null) {
            return;
        }
        theseusTabPagerService.f103136f.f103211a.tryEmit(locatableTagB);
    }

    public final void onTabSelected(TabLayout.Tab tab) {
        TabControl tabControl;
        TabControl tabControl2;
        BLog.i("TheseusTabPagerService", "onTabSelected, " + tab.getPosition());
        int position = tab.getPosition();
        TheseusTabPagerService theseusTabPagerService = this.f103205a;
        if (position <= 0 || (tabControl = theseusTabPagerService.f103144o) == null || tabControl.e() || (tabControl2 = theseusTabPagerService.f103144o) == null || !tabControl2.b()) {
            theseusTabPagerService.f103136f.f103213c.setValue(Integer.valueOf(tab.getPosition()));
            return;
        }
        Application fapp = FoundationAlias.getFapp();
        TabControl tabControl3 = theseusTabPagerService.f103144o;
        ToastHelper.showToastShort(fapp, tabControl3 != null ? tabControl3.d() : null);
    }

    public final void onTabUnselected(TabLayout.Tab tab) {
    }
}
