package com.bilibili.playerbizcommonv2.api;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark.MarkGoodsList;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/a.class */
@BaseUrl("https://api.bilibili.com")
public interface a {
    @GET("/x/v2/dm/panel")
    @NotNull
    BiliCall<GeneralResponse<DanmakuColorfulPanelInfo>> getColorfulPanel(@Query("pid") long j7, @Query("oid") long j8, @Query("type") int i7);

    @GET("/x/v3/fav/recommend/items")
    @NotNull
    BiliCall<GeneralResponse<MarkGoodsList>> getMarkGoodsList(@Query("content_id") @NotNull String str, @Query("content_type") @NotNull String str2);
}
