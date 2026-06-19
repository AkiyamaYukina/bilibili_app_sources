package com.bilibili.userfeedback;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.BiliConfig;
import com.bilibili.api.base.util.ParamsMap;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.okretro.interceptor.SignOnUrlRequestInterceptor;
import com.bilibili.opd.app.bizcommon.hybridruntime.KFCHybridV2;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.userfeedback.model.UserFeedbackItem;
import com.bilibili.userfeedback.model.UserFeedbackTag;
import java.util.List;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.BaseUrl;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/UserFeedbackService.class */
@BaseUrl("https://api.bilibili.com")
public interface UserFeedbackService {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/UserFeedbackService$FeedbackListParamsMap.class */
    public static class FeedbackListParamsMap extends ParamsMap {
        public FeedbackListParamsMap(Context context, @Nullable String str) {
            this(context, str, 50);
        }

        public FeedbackListParamsMap(Context context, @Nullable String str, int i7) {
            putParams(new String[]{KFCHybridV2.Configuration.SYSTEM_DOMAIN, Build.VERSION.RELEASE});
            putParams(new String[]{"version", Foundation.instance().getApps().getVersionName()});
            if (!TextUtils.isEmpty(str)) {
                putParams(new String[]{EditCustomizeSticker.TAG_MID, str});
            }
            putParams(new String[]{"pn", String.valueOf(1)});
            putParams(new String[]{"ps", String.valueOf(i7)});
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/UserFeedbackService$FeedbackParamsMap.class */
    public static class FeedbackParamsMap extends ParamsMap {
        public FeedbackParamsMap(Context context, String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
            String str9;
            putParams(new String[]{KFCHybridV2.Configuration.SYSTEM_DOMAIN, Build.VERSION.RELEASE});
            putParams(new String[]{"device", Build.BRAND + "|" + Build.MODEL});
            putParams(new String[]{"channel", BiliConfig.getChannel()});
            putParams(new String[]{"net_state", String.valueOf(ConnectivityMonitor.getInstance().getNetwork())});
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager.getSimState() != 5) {
                str9 = "";
            } else {
                String simOperator = telephonyManager.getSimOperator();
                str9 = "";
                if (!TextUtils.isEmpty(simOperator)) {
                    str9 = simOperator.length() < 5 ? "" : simOperator;
                }
            }
            putParams(new String[]{"net_operator", str9});
            putParams(new String[]{"version", Foundation.instance().getApps().getVersionName()});
            if (!TextUtils.isEmpty(str)) {
                putParams(new String[]{"qq", str});
            }
            if (!TextUtils.isEmpty(str2)) {
                putParams(new String[]{NotificationCompat.CATEGORY_EMAIL, str2});
            }
            if (!TextUtils.isEmpty(str3)) {
                putParams(new String[]{TextSource.CFG_CONTENT, str3});
            }
            if (!TextUtils.isEmpty(str4)) {
                putParams(new String[]{"img_url", str4});
            }
            if (!TextUtils.isEmpty(str5)) {
                putParams(new String[]{"log_url", str5});
            }
            if (!TextUtils.isEmpty(str6)) {
                putParams(new String[]{EditCustomizeSticker.TAG_MID, str6});
            }
            if (!TextUtils.isEmpty(str7)) {
                putParams(new String[]{"tag_id", str7});
            }
            if (TextUtils.isEmpty(str8)) {
                return;
            }
            putParams(new String[]{"entrance", str8});
        }
    }

    @POST("/x/feedback/upload")
    @RequestInterceptor(SignOnUrlRequestInterceptor.class)
    @Multipart
    BiliCall<JSONObject> feedUpload(@Part MultipartBody.Part part, @Query(Tm0.a.f24206c) String str);

    @POST("/x/feedback/boss/upload")
    @RequestInterceptor(SignOnUrlRequestInterceptor.class)
    @Multipart
    BiliCall<JSONObject> feedUploadToBoss(@Part("buvid") RequestBody requestBody, @Part MultipartBody.Part part, @Part("filename") RequestBody requestBody2, @Query(Tm0.a.f24206c) String str);

    @FormUrlEncoded
    @POST("/x/feedback/add")
    BiliCall<GeneralResponse<UserFeedbackItem>> feedbackAdd(@FieldMap FeedbackParamsMap feedbackParamsMap);

    @GET("/x/feedback/platform/tag")
    BiliCall<GeneralResponse<List<UserFeedbackTag>>> feedbackPlatformTag(@Query("tag_id") String str, @Query("business") String str2);

    @GET("/x/feedback/reply")
    BiliCall<GeneralResponse<List<UserFeedbackItem>>> feedbackReply(@QueryMap FeedbackListParamsMap feedbackListParamsMap);

    @GET("/x/feedback/tag")
    BiliCall<GeneralResponse<List<UserFeedbackTag>>> feedbackTag(@Query("type") String str);
}
