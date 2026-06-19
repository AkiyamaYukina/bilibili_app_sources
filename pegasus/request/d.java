package com.bilibili.pegasus.request;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.okretro.interceptor.DefaultRequestInterceptor;
import com.bilibili.pegasus.data.base.PegasusResponse;
import kp0.C7782e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/d.class */
@BaseUrl("https://app.bilibili.com")
public interface d {
    @GET("/x/v2/feed/index")
    @RequestInterceptor(g.class)
    @NotNull
    BiliCall<GeneralResponse<PegasusResponse>> getIndexList(@Query("idx") long j7, @Query("pull") boolean z6, @Query("login_event") int i7, @Query("open_event") @Nullable String str, @Query("banner_hash") @Nullable String str2, @Query("interest_result") @Nullable String str3, @Query("flush") int i8, @Query("graduation26_action") int i9, @Query("graduation26_year") int i10, @Query("interest_id") long j8, @Query("splash_id") @Nullable String str4, @Query("splash_ids") @Nullable String str5, @Query("splash_creative_id") long j9, @Query("interest_pos_ids") @Nullable String str6, @Query("cny_info") @Nullable String str7, @Query("clipboard_video_id") @Nullable String str8, @Query("clipboard_unique_k") @Nullable String str9, @Query("window_size_type") int i11, @Query("raw_window_size_type") int i12);

    @GET("/x/v2/feed/index/interest")
    @RequestInterceptor(DefaultRequestInterceptor.class)
    @NotNull
    BiliCall<GeneralResponse<C7782e>> getInterestChoose(@Query("oaid") @NotNull String str, @Query("cny_info") @Nullable String str2, @Query("action") int i7);

    @GET("/x/v2/feed/second/interest")
    @NotNull
    BiliCall<GeneralResponse<C7782e>> getSecondInterestChoose(@Query("oaid") @NotNull String str, @Query("interest_id") long j7, @Query("interest_result") @Nullable String str2, @Query("interest_type") @Nullable String str3, @Query("device_type") long j8);
}
