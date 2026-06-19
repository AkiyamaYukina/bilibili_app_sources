package com.bilibili.playset.api;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.playset.channel.RspCollectionChannel;
import com.bilibili.playset.topic.RspCollectionTopic;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/PlaySetAppService.class */
@BaseUrl("https://app.bilibili.com")
public interface PlaySetAppService {
    @FormUrlEncoded
    @POST("/x/channel/cancel")
    BiliCall<GeneralResponse<String>> deleteChannel(@Field("channel_id") long j7, @Field("from") int i7, @Field("from_spmid") String str);

    @FormUrlEncoded
    @POST("/x/topic/fav/sub/cancel")
    BiliCall<GeneralResponse<String>> deleteTopic(@Field(CaptureSchema.TOPIC_ID) long j7);

    @GET("/x/v2/favorite/channel")
    BiliCall<GeneralResponse<RspCollectionChannel>> getChannels(@Query("ps") int i7, @Query("offset") String str);

    @GET("/x/topic/fav/sub/list")
    BiliCall<GeneralResponse<RspCollectionTopic>> getTopic(@Query("page_size") int i7, @Query("page_num") int i8, @Query("offset") long j7, @Query("from") String str);
}
