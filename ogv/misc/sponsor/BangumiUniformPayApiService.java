package com.bilibili.ogv.misc.sponsor;

import android.text.TextUtils;
import com.bilibili.api.base.util.ParamsMap;
import com.bilibili.okretro.call.rxjava.SplitGeneralResponse;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiUniformPayApiService.class */
public interface BangumiUniformPayApiService {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiUniformPayApiService$SponsorResultParamsMap.class */
    public static class SponsorResultParamsMap extends ParamsMap {
        public SponsorResultParamsMap(String str, int i7, String str2, String str3, String str4) {
            super(5);
            putParams(new String[]{"season_type", String.valueOf(i7)});
            putParams(new String[]{"season_id", str});
            putParams(new String[]{"comment", str3});
            putParams(new String[]{"order_id", str2});
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            putParams(new String[]{"pendant_id", str4});
        }
    }

    @FormUrlEncoded
    @POST("/sponsor/api/v2/pay/comment")
    @SplitGeneralResponse
    aY0.a sponsorComment(@FieldMap SponsorResultParamsMap sponsorResultParamsMap);
}
