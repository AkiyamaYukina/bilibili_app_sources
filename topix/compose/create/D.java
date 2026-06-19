package com.bilibili.topix.compose.create;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blrouter.RouteInterceptor;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.blrouter.RouteResponse;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/D.class */
@StabilityInferred(parameters = 1)
public final class D implements RouteInterceptor {
    @NotNull
    public final RouteResponse intercept(@NotNull RouteInterceptor.Chain chain) {
        if (ConfigManager.Companion.isHitFF("ff_topic_publish_in_compose")) {
            return chain.next(chain.getRequest());
        }
        Uri uri = Uri.parse("bilibili://topic/create-old");
        RouteRequest request = chain.getRequest();
        RouteRequest.Builder builderNewBuilder = chain.getRequest().newBuilder();
        builderNewBuilder.setTargetUri(uri);
        return RouteRequestKt.redirectTo(request, builderNewBuilder.build());
    }
}
