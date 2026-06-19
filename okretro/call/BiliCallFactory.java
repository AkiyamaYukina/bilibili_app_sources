package com.bilibili.okretro.call;

import com.bilibili.api.BiliConfig;
import com.bilibili.lib.okhttp.track.tag.RpcTag;
import com.bilibili.lib.okhttp.track.tag.RpcTagKt;
import com.bilibili.lib.rpc.track.model.RpcExtra;
import com.bilibili.lib.rpc.track.model.Tunnel;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestTag;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/BiliCallFactory.class */
public final class BiliCallFactory implements Call.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OkHttpClient f73426a;

    public BiliCallFactory(@NotNull OkHttpClient okHttpClient) {
        this.f73426a = okHttpClient;
    }

    @NotNull
    public Call newCall(@NotNull Request request) {
        RequestTag requestTagObtain = RequestTag.obtain();
        RpcTagKt.attachRpcTag(requestTagObtain, new RpcTag(new RpcExtra(Tunnel.OKHTTP, null, false, false, null, null, null, BiliConfig.getXTraceId(), null, 382, null)));
        return this.f73426a.newCall(request.newBuilder().tag(requestTagObtain).build());
    }
}
