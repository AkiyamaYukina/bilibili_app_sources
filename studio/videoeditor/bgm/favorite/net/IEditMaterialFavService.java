package com.bilibili.studio.videoeditor.bgm.favorite.net;

import androidx.annotation.Keep;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import jB0.a;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/favorite/net/IEditMaterialFavService.class */
@Keep
@BaseUrl("https://member.bilibili.com")
public interface IEditMaterialFavService {
    public static final int FAV_CODE_SUCCESS = 0;

    @GET("/x/app/bgm/v2/fav")
    BiliCall<GeneralResponse<a>> queryFavBgmMaterials(@Query(Tm0.a.f24206c) String str);

    @FormUrlEncoded
    @POST("/x/app/material/fav")
    BiliCall<GeneralResponse<Void>> switchMaterialFavStatus(@Field(Tm0.a.f24206c) String str, @Field("type") int i7, @Field("state") int i8, @Field("oid") long j7);
}
