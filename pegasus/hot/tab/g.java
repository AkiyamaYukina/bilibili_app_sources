package com.bilibili.pegasus.hot.tab;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.RouteInterceptor;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.blrouter.RouteResponse;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/tab/g.class */
@StabilityInferred(parameters = 1)
public final class g implements RouteInterceptor {
    @NotNull
    public final RouteResponse intercept(@NotNull RouteInterceptor.Chain chain) {
        RouteResponse next;
        RouteRequest request = chain.getRequest();
        try {
            next = ((Boolean) Sc1.a.a.getValue()).booleanValue() || s71.a.a || s71.a.b ? RouteRequestKt.redirectTo(request, RouteRequestKt.toRouteRequest("bilibili://pegasus/hottopic_v2")) : chain.next(request);
        } catch (Exception e7) {
            next = chain.next(request);
        }
        return next;
    }
}
