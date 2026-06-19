package com.bilibili.topix.api;

import Tm0.a;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.topix.center.TopixCenterData;
import com.bilibili.topix.detail.timeline.TopicTimelineFloatRsp;
import com.bilibili.topix.model.TopicCreateLimit;
import com.bilibili.topix.model.TopicCreationResult;
import com.bilibili.topix.model.TopicSearchResult;
import com.bilibili.topix.model.TopicTitleCheckResult;
import com.bilibili.topix.model.TopixDynamicOnline;
import com.bilibili.topix.model.TopixDynamicPubEvent;
import java.util.List;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/api/TopicService.class */
@BaseUrl("https://app.bilibili.com")
public interface TopicService {
    @GET("/x/topic/pub/is_existed")
    BiliCall<GeneralResponse<TopicTitleCheckResult>> checkTitleDuplicated(@Query("topic") String str);

    @GET("/x/topic/pub/endpoint")
    BiliCall<GeneralResponse<TopicCreateLimit>> createTopicLimit(@Query("scene") String str);

    @POST("/x/v2/relation/esport/cancel")
    BiliCall<GeneralResponse<Void>> eSportCancel(@Query(a.f24206c) String str, @Query("match_id") long j7);

    @POST("/x/v2/relation/esport/add")
    BiliCall<GeneralResponse<Void>> eSportsAdd(@Query(a.f24206c) String str, @Query("match_id") long j7);

    @FormUrlEncoded
    @POST("/x/topic/create/submit")
    BiliCall<GeneralResponse<TopicCreationResult>> postTopicCreate(@Field(CaptureSchema.TOPIC_NAME) String str, @Field("description") String str2, @Field("scene") String str3, @Field("submit_topic_type") int i7);

    @GET("/x/topic/pub/search?page_size=20")
    BiliCall<GeneralResponse<TopicSearchResult>> searchTopic(@Query("keywords") String str, @Query("offset") long j7, @Query("upload_id") String str2, @Query("from_topic_id") long j8, @Query("from_topic_name") String str3, @Query("from") String str4, @Query(TextSource.CFG_CONTENT) String str5);

    @GET("/x/topic/pub/search?page_size=20&from=center")
    BiliCall<GeneralResponse<TopicSearchResult>> searchTopicInTopicCenter(@Query("keywords") String str, @Query("offset") long j7);

    @GET("/x/topic/vert/center?source=app&page_size=20")
    BiliCall<GeneralResponse<TopixCenterData>> topixCenter(@Query("offset") String str, @Query("scene") String str2);

    @FormUrlEncoded
    @POST("/x/topic/dislike")
    BiliCall<GeneralResponse<String>> topixDislike(@Field(CaptureSchema.TOPIC_ID) long j7);

    @GET("/x/topic/vert/online")
    BiliCall<GeneralResponse<TopixDynamicOnline>> topixDynamicOnline(@Query(CaptureSchema.TOPIC_ID) long j7);

    @GET("/x/topic/pub/events")
    BiliCall<GeneralResponse<TopixDynamicPubEvent>> topixDynamicPubEvents(@Query("show_mids") List<Long> list, @Query("new_pub_num") int i7);

    @FormUrlEncoded
    @POST("/x/topic/fav/sub/add")
    BiliCall<GeneralResponse<String>> topixFavor(@Field(CaptureSchema.TOPIC_ID) long j7);

    @FormUrlEncoded
    @POST("/x/topic/fav/sub/cancel")
    BiliCall<GeneralResponse<String>> topixFavorCancel(@Field(CaptureSchema.TOPIC_ID) long j7);

    @FormUrlEncoded
    @POST("/x/topic/like")
    BiliCall<GeneralResponse<String>> topixLike(@Field("up_mid") long j7, @Field(CaptureSchema.TOPIC_ID) long j8, @Field("action") String str);

    @FormUrlEncoded
    @POST("/x/topic/fav/sub/add")
    BiliCall<GeneralResponse<String>> topixSetFavor(@Field("topic_set_id") long j7);

    @FormUrlEncoded
    @POST("/x/topic/fav/sub/cancel")
    BiliCall<GeneralResponse<String>> topixSetFavorCancel(@Field("topic_set_id") long j7);

    @GET("/x/topic/timeline")
    BiliCall<GeneralResponse<TopicTimelineFloatRsp>> topixTimeline(@Query(CaptureSchema.TOPIC_ID) long j7, @Query("offset") long j8);
}
