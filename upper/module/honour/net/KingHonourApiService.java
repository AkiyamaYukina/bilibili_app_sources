package com.bilibili.upper.module.honour.net;

import Tm0.a;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.upper.module.honour.bean.KingHonourAccountBean;
import com.bilibili.upper.module.honour.bean.KingHonourBattleInfoBean;
import com.bilibili.upper.module.honour.bean.KingHonourPreviewBean;
import com.bilibili.upper.module.honour.bean.KingHonourResponseBean;
import com.bilibili.upper.module.tempalte.bean.TemplateEntrance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/net/KingHonourApiService.class */
@BaseUrl("https://member.bilibili.com")
public interface KingHonourApiService {
    @FormUrlEncoded
    @POST("x/creative-tool/valor/report/gen")
    @NotNull
    BiliCall<GeneralResponse<Object>> createBattleReport(@Field("hero_id") @NotNull String str, @Field("hero_icon") @NotNull String str2, @Field("kill_cnt") int i7, @Field("dead_cnt") int i8, @Field("assist_cnt") int i9, @Field("game_result") @NotNull String str3, @Field("mvp_cnt") @NotNull String str4, @Field("lose_mvp") @NotNull String str5, @Field("branch_evaluate") int i10, @Field("game_time") @NotNull String str6, @Field("hero_triple_kill_cnt") int i11, @Field("hero_quadra_kill_cnt") int i12, @Field("hero_penta_kill_cnt") int i13, @Field("used_time") int i14, @Field("desk_id") long j7, @Field("desk_seq") long j8, @Field("relay_entity") long j9, @Field("version") long j10, @Field("hero_name") @NotNull String str7, @Field("valor_type") int i15, @Field("game_year") int i16);

    @GET("x/creative-tool/valor/query/bind")
    @Nullable
    BiliCall<GeneralResponse<KingHonourResponseBean<KingHonourAccountBean>>> getBindingContent();

    @GET("x/creative-tool/valor/actual/list")
    @Nullable
    BiliCall<GeneralResponse<KingHonourResponseBean<KingHonourBattleInfoBean>>> getKingHonourBattleInfo(@Query(a.f24206c) @NotNull String str);

    @GET("x/creative-tool/valor/report/list")
    @Nullable
    BiliCall<GeneralResponse<KingHonourResponseBean<KingHonourBattleInfoBean>>> getKingHonourReportInfo(@Query(a.f24206c) @NotNull String str);

    @GET("x/creative-tool/valor/report/view")
    @NotNull
    BiliCall<GeneralResponse<KingHonourResponseBean<KingHonourPreviewBean>>> getPreviewInfo(@Query("desk_id") long j7, @Query("desk_seq") long j8, @Query("relay_entity") long j9, @Query("version") long j10, @Query("sdk_type") @NotNull String str, @Query("aurora_version") @NotNull String str2, @Query("montage_version") @NotNull String str3);

    @GET("x/creative-tool/material/entrance")
    @Nullable
    BiliCall<GeneralResponse<TemplateEntrance>> getTemplateEntrance();

    @GET("x/creative-tool/valor/click/record")
    @NotNull
    BiliCall<GeneralResponse<Object>> reportBannerCardClickEvent();

    @GET("x/creative-tool/valor/click/contribute")
    @NotNull
    BiliCall<GeneralResponse<Object>> reportPublishInfo(@Query(a.f24206c) @NotNull String str);
}
