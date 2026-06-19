package com.bilibili.ogv.operation2;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.RouteInterceptor;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteResponse;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/q.class */
@StabilityInferred(parameters = 1)
public final class q implements RouteInterceptor {
    @NotNull
    public final RouteResponse intercept(@NotNull RouteInterceptor.Chain chain) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        RouteRequest request = chain.getRequest();
        objectRef.element = request;
        RouteRequest routeRequestBuild = request.newBuilder().extras(new Df1.k(objectRef, 2)).build();
        objectRef.element = routeRequestBuild;
        return chain.next(routeRequestBuild);
    }
}
