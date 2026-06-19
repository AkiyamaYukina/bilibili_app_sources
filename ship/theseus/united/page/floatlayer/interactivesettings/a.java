package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/a.class */
@BaseUrl("https://app.bilibili.com")
public interface a {
    @GET("/x/v2/view/dots")
    @NotNull
    BiliCall<GeneralResponse<InteractiveSettingsData>> getSettings(@Query("aid") long j7);
}
