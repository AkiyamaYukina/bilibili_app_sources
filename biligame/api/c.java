package com.bilibili.biligame.api;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/c.class */
@BaseUrl("http://api.bilibili.com/x/")
public interface c {
    @GET("activity/like/check")
    @NotNull
    BiliCall<BiligameApiResponse<JSONObject>> checkQuestionnaire(@Query("sid") @NotNull String str);
}
