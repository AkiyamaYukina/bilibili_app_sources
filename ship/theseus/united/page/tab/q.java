package com.bilibili.ship.theseus.united.page.tab;

import androidx.viewpager.widget.ViewPager;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/q.class */
public final class q extends ViewPager.SimpleOnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TheseusTabPagerService f103204a;

    public q(TheseusTabPagerService theseusTabPagerService) {
        this.f103204a = theseusTabPagerService;
    }

    @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        TheseusTabPagerService theseusTabPagerService = this.f103204a;
        theseusTabPagerService.f103136f.f103213c.setValue(Integer.valueOf(i7));
        PageReportService.g(theseusTabPagerService.f103138i, "united.player-video-detail.tab.switch.click", ((TabPage) ((ArrayList) theseusTabPagerService.f103137g.f103191a).get(i7)).e(), 4);
    }
}
