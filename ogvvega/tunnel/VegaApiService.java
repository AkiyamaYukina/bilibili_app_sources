package com.bilibili.ogvvega.tunnel;

import com.bilibili.okretro.call.rxjava.SplitGeneralResponse;
import io.reactivex.rxjava3.core.Single;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/VegaApiService.class */
@BaseUrl("http://api.bilibili.com")
public interface VegaApiService {
    @GET("/pgc/vega/deneb/nodes/get")
    @SplitGeneralResponse
    @NotNull
    Single<VegaDenebNode> requestVegaNodesUrl();
}
