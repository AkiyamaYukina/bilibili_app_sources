package com.bilibili.ship.theseus.detail.route.ugc;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.droid.BVCompat;
import com.bilibili.droid.StringUtil;
import com.bilibili.lib.blrouter.RouteInfo;
import com.bilibili.lib.blrouter.RouteInterceptor;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteResponse;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/route/ugc/g.class */
@StabilityInferred(parameters = 1)
public final class g implements RouteInterceptor {
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @NotNull
    public final RouteResponse intercept(@NotNull RouteInterceptor.Chain chain) {
        String strSubstring;
        RouteResponse next;
        Map pathVariable;
        RouteRequest request = chain.getRequest();
        Uri targetUri = request.getTargetUri();
        if (Intrinsics.areEqual(LogReportStrategy.TAG_DEFAULT, targetUri.getScheme()) && Intrinsics.areEqual("video", targetUri.getAuthority())) {
            return chain.next(request);
        }
        RouteInfo route = chain.getRoute();
        String strValueOf = String.valueOf((route == null || (pathVariable = route.getPathVariable()) == null) ? null : (String) pathVariable.get("id"));
        if (!StringUtil.isNotBlank(strValueOf)) {
            return chain.next(request);
        }
        if (BVCompat.b(strValueOf)) {
            strSubstring = strValueOf;
        } else {
            strSubstring = strValueOf;
            if (StringsKt.n(strValueOf, "av")) {
                strSubstring = strValueOf.substring(2);
            }
        }
        if (StringUtil.isNotBlank(strSubstring)) {
            RouteRequest.Builder builderNewBuilder = request.newBuilder();
            if (StringUtil.isNotBlank(strSubstring)) {
                builderNewBuilder.setTargetUri(targetUri.buildUpon().scheme(LogReportStrategy.TAG_DEFAULT).authority("video").path(strSubstring).build());
                builderNewBuilder.extras((Function1) new Object());
            }
            next = chain.next(builderNewBuilder.build());
        } else {
            next = chain.next(request);
        }
        return next;
    }
}
