package com.bilibili.search2.main;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.blrouter.RouteInterceptor;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.blrouter.RouteResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/H.class */
@StabilityInferred(parameters = 1)
public final class H implements RouteInterceptor {
    @NotNull
    public final RouteResponse intercept(@NotNull RouteInterceptor.Chain chain) {
        RouteResponse next;
        RouteRequest request = chain.getRequest();
        Uri targetUri = chain.getRequest().getTargetUri();
        if (Intrinsics.areEqual(ListExtentionsKt.toStringMap(request.getExtras().toBundle()).get("jump_type"), "inner")) {
            Uri uriBuild = new Uri.Builder().scheme(targetUri.getScheme()).authority(targetUri.getAuthority() + "3").path(targetUri.getPath()).query(targetUri.getQuery()).build();
            RouteRequest.Builder builderNewBuilder = request.newBuilder();
            builderNewBuilder.setTargetUri(uriBuild);
            next = RouteRequestKt.redirectTo(request, builderNewBuilder.build());
        } else {
            next = chain.next(request);
        }
        return next;
    }
}
