package com.bilibili.studio.centerplus.ui;

import F3.O1;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.moduleservice.upper.ICenterPlusTab;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.centerplus.ui.CenterPlusMainActivity;
import java.util.HashMap;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.ui.main2.W;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/b.class */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICenterPlusTab f105230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CenterPlusMainActivity f105231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f105232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f105233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f105234e;

    public /* synthetic */ b(ICenterPlusTab iCenterPlusTab, CenterPlusMainActivity centerPlusMainActivity, long j7, int i7, int i8) {
        this.f105230a = iCenterPlusTab;
        this.f105231b = centerPlusMainActivity;
        this.f105232c = j7;
        this.f105233d = i7;
        this.f105234e = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ICenterPlusTab iCenterPlusTab = this.f105230a;
        CenterPlusMainActivity centerPlusMainActivity = this.f105231b;
        long j7 = this.f105232c;
        int i7 = this.f105233d;
        int i8 = this.f105234e;
        if (iCenterPlusTab == null) {
            CenterPlusMainActivity.a aVar = CenterPlusMainActivity.Companion;
            return;
        }
        BLog.i("CenterPlusMainActivity", "end: nextTab{" + iCenterPlusTab + "}.onShow...mCameraHolder = " + centerPlusMainActivity.f105205E);
        iCenterPlusTab.onShow();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = CenterPlusStatisticsHelper.f105195a;
        int engineType = centerPlusMainActivity.V6().getEngineType();
        HashMap mapA = W.a("from_tab", CenterPlusStatisticsHelper.b(i7), "to_tab", CenterPlusStatisticsHelper.b(i8));
        mapA.put("engine_type", pf.h.a(engineType, jCurrentTimeMillis - j7, "time", mapA));
        BLog.dfmt("CenterPlusStatisticsHelper", "reportTabSwitchTime...params = " + mapA, new Object[0]);
        Neurons.trackT(false, "creation.center-plus.tab-switch.time.track", mapA, 1, new O1(9));
    }
}
