package com.bilibili.moduleservice.fasthybrid.transitioning;

import com.bilibili.lib.blrouter.RouteRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/transitioning/AppletAnimatedService.class */
public interface AppletAnimatedService {
    <T extends AppletContextTransitioning> void openWithTransitioning(@NotNull AppletAnimatedTransitioning<T> appletAnimatedTransitioning, @NotNull RouteRequest routeRequest);
}
