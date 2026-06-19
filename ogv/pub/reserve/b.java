package com.bilibili.ogv.pub.reserve;

import com.bilibili.okretro.call.NoSchedulers;
import com.bilibili.okretro.call.rxjava.SplitGeneralResponse;
import com.bilibili.okretro.response.BiliApiResponse;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import kotlin.Deprecated;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/b.class */
@BaseUrl("http://api.bilibili.com")
public interface b {
    @GET("/pgc/player/api/cache/reserve/verify")
    @Nullable
    Object reserveVerify(@Query("ep_ids") @NotNull String str, @NotNull Continuation<? super BiliApiResponse<? extends List<ReserveVerify>>> continuation);

    @NoSchedulers
    @GET("/pgc/player/api/cache/reserve/verify")
    @SplitGeneralResponse
    @NotNull
    @Deprecated(message = "please use reserveVerify")
    Single<List<ReserveVerify>> reserveVerifyRx(@Query("ep_ids") @NotNull String str);
}
