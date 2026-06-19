package com.bilibili.ogv.review.data;

import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.ogv.pub.review.bean.ReviewPublishInfo;
import com.bilibili.ogv.review.detailpage.ReviewResult;
import com.bilibili.okretro.call.rxjava.SplitGeneralResponse;
import io.reactivex.rxjava3.core.Single;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/data/BangumiReviewApiService.class */
@BaseUrl("https://api.bilibili.com")
public interface BangumiReviewApiService {
    @POST("/pgc/review/short/modify")
    @SplitGeneralResponse
    @NotNull
    Single<ReviewResult> editShortReview(@Query("review_id") long j7, @Query("media_id") long j8, @Query("score") int i7, @Query("share_feed") int i8, @Query(TextSource.CFG_CONTENT) @NotNull String str, @Query("code") @Nullable String str2);

    @GET("/pgc/review/app/user")
    @SplitGeneralResponse
    @NotNull
    Single<ReviewPublishInfo> getUserReview(@Query("media_id") @Nullable String str);

    @POST("/pgc/review/short/post")
    @SplitGeneralResponse
    @NotNull
    Single<ReviewResult> postShortReview(@Query("media_id") long j7, @Query("score") int i7, @Query("share_feed") int i8, @Query(TextSource.CFG_CONTENT) @NotNull String str, @Query("code") @Nullable String str2);
}
