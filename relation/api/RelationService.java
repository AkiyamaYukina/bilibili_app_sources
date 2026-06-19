package com.bilibili.relation.api;

import Tm0.a;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import java.util.List;
import java.util.Map;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/api/RelationService.class */
@BaseUrl("https://api.bilibili.com")
public interface RelationService {
    @FormUrlEncoded
    @POST("/x/relation/tag/special/add")
    BiliCall<GeneralResponse<Void>> addSpecial(@Field(a.f24206c) String str, @Field("fid") String str2);

    @FormUrlEncoded
    @POST("/x/relation/tags/addUsers")
    BiliCall<GeneralResponse<Void>> addToGroup(@Field(a.f24206c) String str, @Field("fids") String str2, @Field("tagids") String str3);

    @POST("/x/relation/modify")
    BiliCall<GeneralResponse<Void>> changeRelation(@Query(a.f24206c) String str, @Query("fid") long j7, @Query("act") int i7, @Query("re_src") int i8);

    @POST("/x/relation/modify")
    BiliCall<GeneralResponse<Void>> changeRelation(@Query(a.f24206c) String str, @Query("fid") long j7, @Query("act") int i7, @Query("re_src") int i8, @Query("spmid") String str2);

    @POST("/x/relation/modify")
    BiliCall<GeneralResponse<Void>> changeRelationV2(@Query(a.f24206c) String str, @Query("fid") long j7, @Query("act") int i7, @Query("re_src") int i8, @Query("spmid") String str2, @Query("from_spmid") String str3, @Query("from_scmid") String str4, @Query("extend_content") String str5, @Query("action_id") String str6);

    @FormUrlEncoded
    @POST("/x/relation/tag/create")
    BiliCall<GeneralResponse<AttentionGroup>> createGroup(@Field(a.f24206c) String str, @Field("tag") String str2);

    @FormUrlEncoded
    @POST("/x/relation/tag/del")
    BiliCall<GeneralResponse<Void>> deleteGroup(@Field(a.f24206c) String str, @Field("tagid") String str2);

    @FormUrlEncoded
    @POST("/x/relation/tag/special/del")
    BiliCall<GeneralResponse<Void>> deleteSpecial(@Field(a.f24206c) String str, @Field("fid") String str2);

    @GET("/x/relation/blacks")
    BiliCall<GeneralResponse<AttentionList>> getBlackList(@Query(a.f24206c) String str);

    @GET("/x/relation/followers")
    BiliCall<GeneralResponse<AttentionList>> getFans(@Query(a.f24206c) String str, @Query("vmid") long j7, @Query("pn") int i7, @Query("ps") int i8, @Query("re_version") String str2);

    @GET("/x/relation/followings")
    BiliCall<GeneralResponse<AttentionList>> getFollowings(@Query(a.f24206c) String str, @Query("vmid") long j7, @Query("pn") int i7, @Query("ps") int i8, @Query("re_version") String str2);

    @GET("/x/relation/followings")
    BiliCall<GeneralResponse<AttentionList>> getFollowingsWithOrder(@Query(a.f24206c) String str, @Query("vmid") long j7, @Query("pn") int i7, @Query("ps") int i8, @Query("order_type") String str2);

    @GET("/x/relation/tag/user")
    BiliCall<GeneralResponse<Map<String, String>>> getGroupsOfMid(@Query(a.f24206c) String str, @Query("fid") long j7);

    @GET("/x/relation")
    BiliCall<GeneralResponse<Attention>> getRelation(@Query(a.f24206c) String str, @Query("fid") String str2);

    @GET("/x/relation/tag/m/tags")
    BiliCall<GeneralResponse<AllGroup>> getUserGroup(@Query(a.f24206c) String str);

    @GET("/x/relation/tag")
    BiliCall<GeneralResponse<List<Attention>>> getUserInGroup(@Query(a.f24206c) String str, @Query("tagid") String str2, @Query("pn") int i7, @Query("ps") int i8);

    @FormUrlEncoded
    @POST("/x/relation/tag/update")
    BiliCall<GeneralResponse<Void>> renameGroup(@Field(a.f24206c) String str, @Field("tagid") String str2, @Field("name") String str3);
}
