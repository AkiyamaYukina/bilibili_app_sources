package com.bilibili.tensorflow.data.api;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/api/TfRemoteDataService.class */
@BaseUrl("https://api.bilibili.com")
public interface TfRemoteDataService {
    @GET("/pgc/vipinfo/get")
    @Nullable
    Object getTfVipInfo(@Query(EditCustomizeSticker.TAG_MID) long j7, @NotNull Continuation<? super GeneralResponse<TfRemoteData>> continuation);

    @FormUrlEncoded
    @POST("x/vip/user/unsign_probability/hand")
    @Nullable
    Object updateVipLossProbability(@Field("probs") @NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
