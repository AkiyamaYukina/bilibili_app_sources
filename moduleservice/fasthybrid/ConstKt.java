package com.bilibili.moduleservice.fasthybrid;

import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteInfo;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.Runtime;
import java.util.Iterator;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/ConstKt.class */
public final class ConstKt {
    @NotNull
    public static final BWAppleUrlType detectBWAUrlType(@NotNull String str) {
        Object next;
        try {
            Iterator it = BLRouter.findRoutes(new RouteRequest.Builder(str).build()).getInfo().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((RouteInfo) next).getRuntime() == Runtime.MINI) {
                    break;
                }
            }
            RouteInfo routeInfo = (RouteInfo) next;
            return routeInfo == null ? BWAppleUrlType.ERROR : StringsKt.n(routeInfo.getMatchRule(), "game") ? BWAppleUrlType.GAME : BWAppleUrlType.MINIPROGRAM;
        } catch (Exception e7) {
            e7.printStackTrace();
            return BWAppleUrlType.ERROR;
        }
    }
}
