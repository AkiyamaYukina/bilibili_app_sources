package com.bilibili.tgwt.ui;

import androidx.appcompat.widget.T;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteInterceptor;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteResponse;
import com.tencent.connect.common.Constants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/d.class */
@StabilityInferred(parameters = 1)
public final class d implements RouteInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ArrayDeque<Boolean> f112293a = new ArrayDeque<>();

    @NotNull
    public final RouteResponse intercept(@NotNull RouteInterceptor.Chain chain) {
        BLog.i("TogetherWatchDetailInterceptor-intercept", "[together-watch-TogetherWatchDetailInterceptor-intercept] " + T.a(chain.getRequest().getTargetUri(), "router url: originUrl:"));
        f112293a.addLast(Boolean.valueOf(Intrinsics.areEqual(chain.getRequest().getExtras().get("chatRoomMode"), "6")));
        final RouteRequest request = chain.getRequest();
        return chain.next(request.newBuilder().extras(new Function1(request, this) { // from class: com.bilibili.tgwt.ui.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RouteRequest f112291a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f112292b;

            {
                this.f112291a = request;
                this.f112292b = this;
            }

            public final Object invoke(Object obj) {
                String fragment;
                String fragment2;
                MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                RouteRequest routeRequest = this.f112291a;
                List<String> pathSegments = routeRequest.getTargetUri().getPathSegments();
                if (pathSegments.size() == 3) {
                    if (Intrinsics.areEqual(pathSegments.get(0), "anime") && Intrinsics.areEqual(pathSegments.get(2), "play") && (fragment2 = routeRequest.getTargetUri().getFragment()) != null) {
                        mutableBundleLike.put("epid", fragment2);
                    }
                } else if (pathSegments.size() == 2 && Intrinsics.areEqual(pathSegments.get(0), "anime") && (fragment = routeRequest.getTargetUri().getFragment()) != null && StringsKt.Z(fragment, "!epid=")) {
                    mutableBundleLike.put("epid", fragment.substring(6, fragment.length()));
                }
                boolean Z4 = StringsKt.Z(routeRequest.getTargetUri().getPath(), "mobile/bangumi/i/");
                String strValueOf = Constants.VIA_REPORT_TYPE_SET_AVATAR;
                if ((Z4 || StringsKt.Z(routeRequest.getTargetUri().getPath(), "bangumi/i/")) && Intrinsics.areEqual(routeRequest.getExtras().get("url_from_h5"), "1")) {
                    mutableBundleLike.put("intentFrom", Constants.VIA_REPORT_TYPE_SET_AVATAR);
                    mutableBundleLike.put("from_spmid", "activity.h5.0.0");
                } else {
                    this.f112292b.getClass();
                    if (!Intrinsics.areEqual(routeRequest.getExtras().get("url_from_h5"), "1")) {
                        String str = routeRequest.getExtras().get("intentFrom");
                        int iIntValue = 0;
                        if (str != null) {
                            Integer intOrNull = StringsKt.toIntOrNull(str);
                            iIntValue = 0;
                            if (intOrNull != null) {
                                iIntValue = intOrNull.intValue();
                            }
                        }
                        strValueOf = String.valueOf(iIntValue);
                    }
                    mutableBundleLike.put("intentFrom", strValueOf);
                    String str2 = routeRequest.getExtras().get("from_spmid");
                    if (str2 == null || str2.length() == 0) {
                        str2 = Intrinsics.areEqual(routeRequest.getExtras().get("url_from_h5"), "1") ? "activity.h5.0.0" : "0.0.0.0";
                    }
                    mutableBundleLike.put("from_spmid", str2);
                }
                return Unit.INSTANCE;
            }
        }).build());
    }
}
