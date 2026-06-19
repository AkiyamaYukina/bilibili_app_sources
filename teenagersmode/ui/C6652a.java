package com.bilibili.teenagersmode.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.RouteInterceptor;

/* JADX INFO: renamed from: com.bilibili.teenagersmode.ui.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/a.class */
@StabilityInferred(parameters = 1)
public final class C6652a implements RouteInterceptor {
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.lib.blrouter.RouteResponse intercept(@org.jetbrains.annotations.NotNull com.bilibili.lib.blrouter.RouteInterceptor.Chain r5) {
        /*
            r4 = this;
            com.bilibili.app.comm.restrict.utils.TeenagersModeSource r0 = com.bilibili.app.comm.restrict.utils.TeenagersModeKt.c()
            com.bilibili.app.comm.restrict.utils.TeenagersModeSource r1 = com.bilibili.app.comm.restrict.utils.TeenagersModeSource.OS
            if (r0 != r1) goto L9c
            com.bilibili.app.comm.restrict.g r0 = com.bilibili.app.comm.restrict.utils.TeenagersModeKt.h
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L8c
            com.bilibili.app.comm.restrict.OSTeensTransPageType$a r0 = com.bilibili.app.comm.restrict.OSTeensTransPageType.Companion
            r8 = r0
            r0 = r5
            com.bilibili.lib.blrouter.RouteRequest r0 = r0.getRequest()
            com.bilibili.lib.blrouter.BundleLike r0 = r0.getExtras()
            java.lang.String r1 = "page_type"
            java.lang.String r0 = r0.get(r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L42
            r0 = r9
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r0)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L42
            r0 = r9
            int r0 = r0.intValue()
            r6 = r0
            goto L44
        L42:
            r0 = 0
            r6 = r0
        L44:
            r0 = r8
            java.lang.Class r0 = r0.getClass()
            r0 = r7
            r1 = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.bilibili.app.comm.restrict.OSTeensTransPageType r1 = com.bilibili.app.comm.restrict.OSTeensTransPageType.a.a(r1)
            android.net.Uri r0 = r0.c(r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L8c
            com.bilibili.lib.blrouter.RouteRequest$Builder r0 = new com.bilibili.lib.blrouter.RouteRequest$Builder
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r1 = r5
            com.bilibili.lib.blrouter.RouteRequest r1 = r1.getRequest()
            int r1 = r1.getRequestCode()
            com.bilibili.lib.blrouter.RouteRequest$Builder r0 = r0.requestCode(r1)
            com.bilibili.lib.blrouter.RouteRequest r0 = r0.build()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L8c
            r0 = r5
            com.bilibili.lib.blrouter.RouteRequest r0 = r0.getRequest()
            r1 = r7
            com.bilibili.lib.blrouter.RouteResponse r0 = com.bilibili.lib.blrouter.RouteRequestKt.redirectTo(r0, r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L8c
            r0 = r7
            r5 = r0
            goto La9
        L8c:
            r0 = r5
            r1 = r5
            com.bilibili.lib.blrouter.RouteRequest r1 = r1.getRequest()
            com.bilibili.lib.blrouter.RouteResponse r0 = r0.next(r1)
            r5 = r0
            goto La9
        L9c:
            r0 = r5
            r1 = r5
            com.bilibili.lib.blrouter.RouteRequest r1 = r1.getRequest()
            com.bilibili.lib.blrouter.RouteResponse r0 = r0.next(r1)
            r5 = r0
        La9:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.teenagersmode.ui.C6652a.intercept(com.bilibili.lib.blrouter.RouteInterceptor$Chain):com.bilibili.lib.blrouter.RouteResponse");
    }
}
