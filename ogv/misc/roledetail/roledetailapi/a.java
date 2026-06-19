package com.bilibili.ogv.misc.roledetail.roledetailapi;

import com.bilibili.okretro.call.rxjava.SplitGeneralResponse;
import io.reactivex.rxjava3.core.Single;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/roledetailapi/a.class */
@BaseUrl("https://api.bilibili.com")
public interface a {
    @GET("/pgc/season/character/get")
    @SplitGeneralResponse
    @NotNull
    Single<PersonInfoVo> getRoleInfoDetail(@Query("id") long j7);

    @GET("/pgc/season/character/seasons")
    @SplitGeneralResponse
    @NotNull
    Single<PersonRelateContentVo> getRoleWorksDetail(@Query("character_id") long j7, @Query("order_type") int i7, @Query("pn") int i8, @Query("ps") int i9);
}
