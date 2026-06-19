package com.bilibili.ship.theseus.detail.route.ugc;

import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.commons.StringUtils;
import com.bilibili.droid.BVCompat;
import com.bilibili.droid.StringUtil;
import com.bilibili.lib.blrouter.RouteInfo;
import com.bilibili.lib.blrouter.RouteInterceptor;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.blrouter.RouteResponse;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/route/ugc/e.class */
@StabilityInferred(parameters = 1)
public final class e implements RouteInterceptor {
    @NotNull
    public final RouteResponse intercept(@NotNull RouteInterceptor.Chain chain) {
        String strGroup;
        Map pathVariable;
        RouteRequest request = chain.getRequest();
        Uri targetUri = request.getTargetUri();
        RouteInfo route = chain.getRoute();
        String strValueOf = String.valueOf((route == null || (pathVariable = route.getPathVariable()) == null) ? null : (String) pathVariable.get("id"));
        if (BVCompat.b(strValueOf)) {
            return chain.next(request);
        }
        if (!a.a(strValueOf)) {
            return new RouteResponse(RouteResponse.Code.ERROR, request, "invalid args", (Object) null, (RouteRequest) null, (RouteResponse) null, (RouteResponse) null, 0, 248, (DefaultConstructorMarker) null);
        }
        String path = targetUri.getPath();
        if (path == null) {
            strGroup = null;
        } else {
            Matcher matcher = a.f91070a.matcher(path);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                Matcher matcher2 = a.f91071b.matcher(path);
                strGroup = null;
                if (matcher2.find()) {
                    strGroup = matcher2.group(1);
                }
            }
        }
        if (StringUtil.isBlank(strGroup)) {
            return chain.next(request);
        }
        if (TextUtils.isDigitsOnly(strGroup)) {
            String fragment = targetUri.getFragment();
            if (!TextUtils.isEmpty(fragment) && StringsKt.Z(fragment, "reply")) {
                String strSubstringAfter = StringUtils.substringAfter(fragment, "reply");
                if (!TextUtils.isEmpty(strSubstringAfter) && TextUtils.isDigitsOnly(strSubstringAfter)) {
                    return RouteRequestKt.redirectTo(request, RouteRequestKt.toRouteRequest(new Uri.Builder().scheme(LogReportStrategy.TAG_DEFAULT).authority("comment").appendPath("detail").appendPath("1").appendPath(String.valueOf(strGroup)).appendPath(strSubstringAfter.toString()).appendQueryParameter("subType", "0").appendQueryParameter("anchor", strSubstringAfter.toString()).appendQueryParameter("showEnter", "1").appendQueryParameter("syncFollowing", "1").appendQueryParameter("from", "2").build()));
                }
            }
        }
        return chain.next(request);
    }
}
