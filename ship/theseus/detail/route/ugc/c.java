package com.bilibili.ship.theseus.detail.route.ugc;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.RouteInterceptor;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteResponse;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/route/ugc/c.class */
@StabilityInferred(parameters = 1)
public final class c implements RouteInterceptor {
    @NotNull
    public final RouteResponse intercept(@NotNull RouteInterceptor.Chain chain) {
        int i7;
        RouteRequest request = chain.getRequest();
        Uri targetUri = request.getTargetUri();
        String scheme = targetUri.getScheme();
        RouteRequest routeRequestBuild = request;
        if (request.getExtras().get("p") != null) {
            routeRequestBuild = request;
            if (targetUri.getScheme() != null) {
                RouteRequest.Builder builderNewBuilder = request.newBuilder();
                String scheme2 = targetUri.getScheme();
                if (Intrinsics.areEqual(scheme2, "abiliav") || Intrinsics.areEqual(scheme2, LogReportStrategy.TAG_DEFAULT)) {
                    if (builderNewBuilder.getExtras().containsKey(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE)) {
                        builderNewBuilder.getExtras().remove("p");
                    }
                } else if (Intrinsics.areEqual("http", scheme) || Intrinsics.areEqual("https", scheme)) {
                    try {
                        i7 = Integer.parseInt(String.valueOf(builderNewBuilder.getExtras().get("p")));
                    } catch (Exception e7) {
                        i7 = 0;
                    }
                    builderNewBuilder.getExtras().put(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, String.valueOf(RangesKt.coerceAtLeast(0, i7 - 1)));
                    builderNewBuilder.getExtras().remove("p");
                }
                routeRequestBuild = builderNewBuilder.build();
            }
        }
        return chain.next(routeRequestBuild);
    }
}
