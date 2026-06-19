package com.bilibili.lib.sharewrapper.online.api;

import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.lib.sharewrapper.Bshare.PVActionManager;
import com.bilibili.lib.sharewrapper.basic.BiliExtraBuilder;
import com.bilibili.lib.sharewrapper.util.SessionManager;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.Timeout;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/ShareAPIService.class */
@BaseUrl("https://api.bilibili.com")
public interface ShareAPIService {
    static /* synthetic */ BiliCall a(ShareAPIService shareAPIService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String sessionId = SessionManager.INSTANCE.getSessionId();
        String actionId = PVActionManager.INSTANCE.getActionId();
        String str11 = actionId;
        if (actionId == null) {
            str11 = "";
        }
        return shareAPIService.getShareChannels(str, str2, str3, str4, str5, str6, str7, str8, str9, Constant.SDK_OS, 1, sessionId, str10, str11);
    }

    @Timeout(conn = 5000, read = 5000, write = 5000)
    @NotNull
    @FormUrlEncoded
    @POST("/x/share/click")
    BiliCall<GeneralResponse<ShareClickResult>> clickShare(@Field(Tm0.a.f24206c) @Nullable String str, @Field("share_id") @Nullable String str2, @Field("oid") @Nullable String str3, @Field("share_mode") int i7, @Field("share_origin") @Nullable String str4, @Field("share_channel") @NotNull String str5, @Field("sid") @Nullable String str6, @Field("tag") @Nullable String str7, @Field(BiliExtraBuilder.SHARE_TITLE) @Nullable String str8, @Field("share_content") @Nullable String str9, @Field("share_pattern") int i8, @Field("buvid") @Nullable String str10, @Field("spm_id") @Nullable String str11, @Field("from_spmid") @Nullable String str12, @Field("from") @Nullable String str13, @Field("tid") @Nullable String str14, @Field("object_extra_fields") @Nullable String str15, @Field("platform") @NotNull String str16, @Field("panel_type") int i9, @Field("share_session_id") @NotNull String str17, @Query("action_id") @Nullable String str18);

    @GET("/x/share/channels")
    @Timeout(conn = 5000, read = 5000, write = 5000)
    @NotNull
    BiliCall<GeneralResponse<ShareChannels>> getShareChannels(@Query(Tm0.a.f24206c) @Nullable String str, @Query("share_id") @Nullable String str2, @Query("oid") @Nullable String str3, @Query("share_origin") @Nullable String str4, @Query("sid") @Nullable String str5, @Query("buvid") @Nullable String str6, @Query("spm_id") @Nullable String str7, @Query("from_spmid") @Nullable String str8, @Query("object_extra_fields") @Nullable String str9, @Query("platform") @NotNull String str10, @Query("panel_type") int i7, @Query("share_session_id") @NotNull String str11, @Query("triggerparameter") @Nullable String str12, @Query("action_id") @Nullable String str13);

    @FormUrlEncoded
    @POST("/x/share/placard")
    @NotNull
    BiliCall<GeneralResponse<PlacardData>> placardShare(@Field("share_id") @Nullable String str, @Field("oid") @Nullable String str2, @Field("buvid") @Nullable String str3, @Field("share_origin") @Nullable String str4, @Field("sid") @Nullable String str5, @Query("action_id") @Nullable String str6);

    @FormUrlEncoded
    @POST("/x/share/quickWord")
    @NotNull
    BiliCall<GeneralResponse<QuickWordData>> quickWord(@Field("share_id") @Nullable String str, @Field("oid") @Nullable String str2, @Field("share_origin") @Nullable String str3, @Field("sid") @Nullable String str4, @Field("buvid") @Nullable String str5, @Field(Tm0.a.f24206c) @Nullable String str6, @Field("platform") @NotNull String str7, @Field("spm_id") @Nullable String str8, @Field("from_spmid") @Nullable String str9, @Field("object_extra_fields") @Nullable String str10, @Field("share_channel") @Nullable String str11, @Field("panel_type") int i7, @Field("share_session_id") @NotNull String str12);

    @FormUrlEncoded
    @POST("/x/share/finish")
    @NotNull
    BiliCall<GeneralResponse<FinishResult>> shareFinish(@Field("link") @Nullable String str, @Field("success") boolean z6, @Field("spm_id") @Nullable String str2, @Field("from_spmid") @Nullable String str3, @Field("object_extra_fields") @Nullable String str4, @Field("panel_type") int i7, @Field("share_session_id") @NotNull String str5);

    @FormUrlEncoded
    @POST("/x/share/finish")
    @NotNull
    BiliCall<GeneralResponse<FinishResult>> shareFinish(@Field("link") @Nullable String str, @Field("success") boolean z6, @Field("spm_id") @Nullable String str2, @Field("from_spmid") @Nullable String str3, @Field("object_extra_fields") @Nullable String str4, @Field("share_id") @Nullable String str5, @Field("oid") @Nullable String str6, @Field("sid") @Nullable String str7, @Field("share_origin") @Nullable String str8, @Field("share_channel") @Nullable String str9, @Field("panel_type") int i7, @Field("share_session_id") @NotNull String str10);

    @FormUrlEncoded
    @POST("/x/share/word")
    @NotNull
    BiliCall<GeneralResponse<WordShareData>> wordShare(@Field("share_id") @Nullable String str, @Field("oid") @Nullable String str2, @Field("share_origin") @Nullable String str3, @Field("sid") @Nullable String str4, @Field("buvid") @Nullable String str5, @Field(Tm0.a.f24206c) @Nullable String str6, @Field("platform") @NotNull String str7, @Field("spm_id") @Nullable String str8, @Field("from_spmid") @Nullable String str9, @Field("object_extra_fields") @Nullable String str10, @Field("panel_type") int i7, @Field("share_session_id") @NotNull String str11);
}
