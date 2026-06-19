package com.bilibili.studio.editor.frame.net;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/frame/net/FrameUploadApi.class */
@BaseUrl("https://member.bilibili.com")
public interface FrameUploadApi {
    @POST("/x/vupre/app/archive/types/predict")
    BiliCall<GeneralResponse<Predict>> predictTypes(@Query("title") String str, @Query("filename") String str2, @Query("upload_id") String str3);

    @GET("/x/vupre/app/archive/types/upload")
    BiliCall<GeneralResponse<String>> uploadZipInfo(@Query("zip_url") String str, @Query("filename") String str2);

    @GET("/x/vupre/app/archive/types/upload")
    BiliCall<GeneralResponse<String>> uploadZipInfoV2(@Query("zip_url") String str, @Query("filename") String str2, @Query("track_id") String str3);
}
