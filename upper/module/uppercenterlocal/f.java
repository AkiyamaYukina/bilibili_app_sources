package com.bilibili.upper.module.uppercenterlocal;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.RouteInterceptor;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.blrouter.RouteResponse;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/f.class */
@StabilityInferred(parameters = 1)
public final class f implements RouteInterceptor {
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public static RouteResponse a(RouteInterceptor.Chain chain, String str) {
        Uri targetUri = chain.getRequest().getTargetUri();
        RouteRequest.Builder builderMergeFrom = chain.getRequest().newBuilder().props((Function1) new Object()).mergeFrom(targetUri.buildUpon().scheme(LogReportStrategy.TAG_DEFAULT).authority("uper").path(str).build());
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg_uri", targetUri);
        builderMergeFrom.getExtras().put("param_control", bundle);
        return RouteRequestKt.redirectTo(chain.getRequest(), builderMergeFrom.build());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.lib.blrouter.RouteResponse intercept(@org.jetbrains.annotations.NotNull com.bilibili.lib.blrouter.RouteInterceptor.Chain r6) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.f.intercept(com.bilibili.lib.blrouter.RouteInterceptor$Chain):com.bilibili.lib.blrouter.RouteResponse");
    }
}
