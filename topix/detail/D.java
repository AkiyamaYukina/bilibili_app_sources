package com.bilibili.topix.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bplus.followinglist.home.synthesis.vm.c;
import com.bilibili.lib.blrouter.RouteInterceptor;
import com.bilibili.lib.blrouter.RouteResponse;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/D.class */
@StabilityInferred(parameters = 1)
public final class D implements RouteInterceptor {
    @NotNull
    public final RouteResponse intercept(@NotNull RouteInterceptor.Chain chain) {
        return chain.next(chain.getRequest().newBuilder().props(new c(1)).build());
    }
}
