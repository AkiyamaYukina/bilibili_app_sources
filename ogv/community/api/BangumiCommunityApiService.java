package com.bilibili.ogv.community.api;

import aY0.a;
import com.bilibili.ogv.community.bean.BangumiPraiseTriple;
import com.bilibili.ogv.community.bean.UserCommunityBean;
import com.bilibili.okretro.call.rxjava.SplitGeneralResponse;
import io.reactivex.rxjava3.core.Single;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/api/BangumiCommunityApiService.class */
@BaseUrl("https://api.bilibili.com")
public interface BangumiCommunityApiService {
    @SplitGeneralResponse
    @NotNull
    @FormUrlEncoded
    @POST("/x/relation/modify")
    a changeRelation(@Field("fid") long j7, @Field("act") int i7, @Field("re_src") int i8, @Field("spmid") @Nullable String str);

    @SplitGeneralResponse
    @NotNull
    @FormUrlEncoded
    @POST("/pgc/season/episode/like/triple")
    Single<BangumiPraiseTriple> likeTriple(@Field("ep_id") long j7, @Field("is_follow") int i7, @Field(Tm0.a.f24206c) @Nullable String str, @Field("track_id") @Nullable String str2);

    @GET("/pgc/season/episode/community")
    @SplitGeneralResponse
    @NotNull
    Single<UserCommunityBean> loadUserCommunity(@Query("ep_id") long j7);
}
