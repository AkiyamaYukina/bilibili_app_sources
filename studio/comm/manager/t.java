package com.bilibili.studio.comm.manager;

import com.bilibili.lib.foundation.util.Objects;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.studio.centerplus.network.entity.UpperProfiles;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/t.class */
public final class t extends BiliApiCallback<GeneralResponse<UpperProfiles>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f105425b;

    public t(long j7) {
        this.f105425b = j7;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        BLog.i("UpperProfilesManager", "getUseProfiles failed " + th);
        String message = th != null ? th.getMessage() : null;
        String str = message;
        if (message == null) {
            str = "";
        }
        BLog.wfmt("~0bitian~", "\n------------------------   \n \n%s\n\n------------------------\n  ", new Object[]{"拉 x/app/v1/user/profiles接口失败 ".concat(str)});
        String str2 = CenterPlusStatisticsHelper.f105195a;
        CenterPlusStatisticsHelper.e(0, "UpperProfiles", null, System.currentTimeMillis() - this.f105425b, "");
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onSuccess(GeneralResponse<UpperProfiles> generalResponse) {
        GeneralResponse<UpperProfiles> generalResponse2 = generalResponse;
        u.f105426a = generalResponse2 != null ? generalResponse2.data : null;
        UpperProfiles upperProfiles = u.f105426a;
        String jsonString = null;
        if (upperProfiles != null) {
            jsonString = Objects.toJsonString(upperProfiles);
        }
        BLog.i("UpperProfilesManager", "getUseProfiles success " + jsonString);
        BLog.wfmt("~0bitian~", "\n------------------------   \n \n%s\n\n------------------------\n  ", new Object[]{"拉 x/app/v1/user/profiles接口成功 后端返回的用户激励结果为 " + jsonString});
        String str = CenterPlusStatisticsHelper.f105195a;
        CenterPlusStatisticsHelper.e(1, "UpperProfiles", null, System.currentTimeMillis() - this.f105425b, jsonString);
    }
}
