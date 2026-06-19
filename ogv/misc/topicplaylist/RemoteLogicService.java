package com.bilibili.ogv.misc.topicplaylist;

import com.bilibili.okretro.call.rxjava.SplitGeneralResponse;
import io.reactivex.rxjava3.core.Single;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/topicplaylist/RemoteLogicService.class */
interface RemoteLogicService {
    @SplitGeneralResponse
    @NotNull
    @FormUrlEncoded
    @POST("/pgc/operation/playlist/fav/del")
    aY0.a cancelCollectPlayList(@Field("pid") int i7);

    @GET("/pgc/operation/playlist/list")
    @SplitGeneralResponse
    @NotNull
    Single<TopicPlayListVo> getTopicPlayList(@Query("pn") int i7, @Query("ps") int i8);
}
