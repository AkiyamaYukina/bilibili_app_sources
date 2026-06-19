package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/C.class */
@BaseUrl("https://api.bilibili.com")
public interface C {
    @POST("/pugv/view/study/submit_ending")
    @Nullable
    Object getStudyCompleted(@Query("season_id") long j7, @Query("study_time") long j8, @Query("ep_id") long j9, @Query("timestamp") long j10, @NotNull Continuation<? super BiliApiResponse<StudyEndingPageInfo>> continuation);

    @POST("/pugv/view/study/check/share")
    @Nullable
    Object getStudyShareInfo(@Query("season_id") long j7, @Query("study_time") long j8, @Query("ep_id") long j9, @NotNull Continuation<? super BiliApiResponse<StudyShareInfo>> continuation);
}
