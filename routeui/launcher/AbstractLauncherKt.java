package com.bilibili.routeui.launcher;

import android.os.Bundle;
import com.bilibili.lib.blrouter.RouteInfo;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.ui.RouteConstKt;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/routeui/launcher/AbstractLauncherKt.class */
public final class AbstractLauncherKt {
    @NotNull
    public static final Bundle createExtras(@NotNull RouteRequest routeRequest, @NotNull RouteInfo routeInfo) {
        Bundle bundle = routeRequest.getExtras().toBundle();
        for (Map.Entry entry : routeInfo.getPathVariable().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!bundle.containsKey(str) && (!StringsKt.Z(str2, ":") || str2.length() <= 1 || !Intrinsics.areEqual(str2.substring(1), str))) {
                bundle.putString(str, str2);
            }
        }
        bundle.putBundle(RouteConstKt.BLROUTER_PROPS, routeRequest.getProps().toBundle());
        RouteRequest forward = routeRequest.getForward();
        if (forward != null) {
            bundle.putParcelable(RouteConstKt.BLROUTER_FORWARD, forward);
        }
        return bundle;
    }

    @NotNull
    public static final Bundle createExtrasForFragment(@NotNull RouteRequest routeRequest, @NotNull RouteInfo routeInfo) {
        Bundle bundleCreateExtras = createExtras(routeRequest, routeInfo);
        bundleCreateExtras.putString(RouteConstKt.BLROUTER_PUREURL, routeRequest.getPureUri().toString());
        return bundleCreateExtras;
    }
}
