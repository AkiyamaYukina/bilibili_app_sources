package com.bilibili.studio.comm.ab;

import Qh1.V;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.comm.api.bean.ABData;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/ab/b.class */
public final class b extends BiliApiCallback<GeneralResponse<ABData>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f105346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f105347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f105348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CancellableContinuationImpl f105349e;

    public b(long j7, List list, String str, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f105346b = j7;
        this.f105347c = list;
        this.f105348d = str;
        this.f105349e = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        BLog.i("GetABData", "error:" + (th != null ? th.getMessage() : null));
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = this.f105346b;
        for (String str : this.f105347c) {
            String str2 = CenterPlusStatisticsHelper.f105195a;
            CenterPlusStatisticsHelper.e(0, str, this.f105348d, jCurrentTimeMillis - j7, "");
        }
        Result.Companion companion = Result.Companion;
        this.f105349e.resumeWith(V.a("request error"));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onSuccess(GeneralResponse<ABData> generalResponse) {
        ABData aBData;
        GeneralResponse<ABData> generalResponse2 = generalResponse;
        BLog.i("GetABData", "success");
        HashMap<String, String> map = (generalResponse2 == null || (aBData = generalResponse2.data) == null) ? null : aBData.map;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f105346b;
        CancellableContinuationImpl cancellableContinuationImpl = this.f105349e;
        if (map == null) {
            for (String str : this.f105347c) {
                String str2 = CenterPlusStatisticsHelper.f105195a;
                CenterPlusStatisticsHelper.e(0, str, this.f105348d, jCurrentTimeMillis, "");
            }
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(ResultKt.createFailure(new Exception("result data is empty"))));
            return;
        }
        for (String str3 : this.f105347c) {
            BLog.i("GetABData", str3 + " is " + ((Object) map.get(str3)));
            String str4 = CenterPlusStatisticsHelper.f105195a;
            CenterPlusStatisticsHelper.e(1, str3, this.f105348d, jCurrentTimeMillis, map.get(str3));
        }
        cancellableContinuationImpl.resumeWith(Result.constructor-impl(map));
    }
}
