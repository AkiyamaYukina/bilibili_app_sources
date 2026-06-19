package com.bilibili.studio.comm.manager;

import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.gson.GsonKt;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.comm.api.bean.ABData;
import java.util.HashMap;
import java.util.Map;
import yw0.C9103a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/e.class */
public final class e extends BiliApiCallback<GeneralResponse<ABData>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f105392b;

    public e(long j7) {
        this.f105392b = j7;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = this.f105392b;
        String str = CenterPlusStatisticsHelper.f105195a;
        String str2 = C9103a.f129912a;
        CenterPlusStatisticsHelper.e(0, "IGVEntranceManager", C9103a.C1393a.a(), jCurrentTimeMillis - j7, "");
        IGVEntranceManager.a();
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onSuccess(GeneralResponse<ABData> generalResponse) {
        ABData aBData;
        HashMap<String, String> map;
        Application application;
        ABData aBData2;
        HashMap<String, String> map2;
        ABData aBData3;
        HashMap<String, String> map3;
        GeneralResponse<ABData> generalResponse2 = generalResponse;
        if (generalResponse2 != null && (aBData3 = generalResponse2.data) != null && (map3 = aBData3.map) != null) {
            IGVEntranceManager.f105376c.putAll(map3);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = this.f105392b;
        String str = CenterPlusStatisticsHelper.f105195a;
        String str2 = C9103a.f129912a;
        CenterPlusStatisticsHelper.e(1, "IGVEntranceManager", C9103a.C1393a.a(), jCurrentTimeMillis - j7, (generalResponse2 == null || (aBData2 = generalResponse2.data) == null || (map2 = aBData2.map) == null) ? null : GsonKt.toJsonString(map2));
        IGVEntranceManager.a();
        if (generalResponse2 == null || (aBData = generalResponse2.data) == null || (map = aBData.map) == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            IGVEntranceManager iGVEntranceManager = IGVEntranceManager.f105374a;
            if (value != null && (application = BiliContext.application()) != null) {
                BiliGlobalPreferenceHelper.getInstance(application).edit().putString(key, value).apply();
            }
        }
    }
}
