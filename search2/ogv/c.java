package com.bilibili.search2.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.RouteInterceptor;
import com.bilibili.lib.blrouter.RouteResponse;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/ogv/c.class */
@StabilityInferred(parameters = 1)
public final class c implements RouteInterceptor {
    @NotNull
    public final RouteResponse intercept(@NotNull RouteInterceptor.Chain chain) {
        return chain.next(chain.getRequest().newBuilder().extras(new HH.a(chain.getRequest().getTargetUri().toString(), 2)).build());
    }
}
