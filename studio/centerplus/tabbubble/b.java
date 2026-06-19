package com.bilibili.studio.centerplus.tabbubble;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/tabbubble/b.class */
@BaseUrl("https://member.bilibili.com")
public interface b {
    @GET("/x/app/archive/tab/bubble")
    @NotNull
    BiliCall<GeneralResponse<TabBubbleResult>> getTabBubble(@Query("exclusion") @Nullable String str);
}
