package com.bilibili.lib.ui;

import android.graphics.Color;
import android.os.Bundle;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteInfo;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteResponse;
import com.bilibili.routeui.launcher.AbstractLauncherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/RouteConstKt.class */
public final class RouteConstKt {

    @NotNull
    public static final String BG_COLOR_DEFAULT = "1";

    @NotNull
    public static final String BG_COLOR_NONE = "0";

    @NotNull
    public static final String BLROUTER_BUNDLE_NAME = "blrouter.bundle.name";

    @NotNull
    public static final String BLROUTER_FORWARD = "blrouter.forward";

    @NotNull
    public static final String BLROUTER_MATCHRULE = "blrouter.matchrule";

    @NotNull
    public static final String BLROUTER_NATIVESTART = "blrouter.native.start";

    @NotNull
    public static final String BLROUTER_PAGENAME = "blrouter.pagename";

    @NotNull
    public static final String BLROUTER_PROPS = "blrouter.props";

    @NotNull
    public static final String BLROUTER_PUREURL = "blrouter.pureurl";

    @NotNull
    public static final String BLROUTER_TARGETURL = "blrouter.targeturl";

    @NotNull
    public static final String CUTOUT_MODE_DEFAULT = "0";

    @NotNull
    public static final String CUTOUT_MODE_NEVER = "2";

    @NotNull
    public static final String CUTOUT_MODE_SHORTEDGE = "1";

    @NotNull
    public static final String EXTRA_KEY_NESTED = "blrouter.nested";

    @NotNull
    public static final String PAGE_TITLE = "page.title";

    @NotNull
    public static final String PROPS_BG_COLOR = "ct.bg.color";

    @NotNull
    public static final String PROPS_BLROUTER_FROM = "blrouter.from";

    @NotNull
    public static final String PROPS_CUTOUT_MODE = "ct.cutout.mode";

    @NotNull
    public static final String PROPS_MWEB_DIRECT_JUMP = "mweb.direct.jump";

    @NotNull
    public static final String PROPS_PAGE_COLOR = "ct.view.bgcolor";

    @NotNull
    public static final String PROPS_PAGE_FROM = "page.from";

    @NotNull
    public static final String PROPS_STATUSBAR_HIDE = "ct.statusbar.hide";

    @NotNull
    public static final String PROPS_STATUSBAR_IMMERSIVE = "ct.statusbar.immersive";

    @NotNull
    public static final String PROPS_STATUSBAR_MODE = "ct.statusbar.mode";

    @NotNull
    public static final String PROPS_TAB_DATA = "ct.tab.pages";

    @NotNull
    public static final String PROPS_TAB_EXPAND = "ct.tab.expand";

    @NotNull
    public static final String PROPS_TOOLBAR_BGCOLOR = "ct.nav.bgcolor";

    @NotNull
    public static final String PROPS_TOOLBAR_HIDE = "ct.nav.hide";

    @NotNull
    public static final String PROPS_TOOLBAR_MENUS = "ct.nav.menus";

    @NotNull
    public static final String PROPS_TOOLBAR_TITLE = "ct.nav.title";

    @NotNull
    public static final String PROPS_TOOLBAR_TITLECOLOR = "ct.nav.titlecolor";

    @NotNull
    public static final String STATUSBAR_HIDE = "1";

    @NotNull
    public static final String STATUSBAR_IMMERSIVE = "1";

    @NotNull
    public static final String STATUSBAR_MODE_DARK = "0";

    @NotNull
    public static final String STATUSBAR_MODE_LIGHT = "1";

    @NotNull
    public static final String STATUSBAR_SHOW = "0";

    @NotNull
    public static final String TAB_PAGES = "tab.pages";

    @NotNull
    public static final String TOOLBAR_HIDE = "1";

    @NotNull
    public static final String TOOLBAR_MENUS = "nav.menus";

    @Nullable
    public static final Target findRoute(@NotNull BLRouter bLRouter, @NotNull RouteRequest routeRequest) {
        try {
            RouteResponse routeResponseFindRouteWithInterceptors = bLRouter.findRouteWithInterceptors(routeRequest);
            Object obj = routeResponseFindRouteWithInterceptors.getObj();
            if (!routeResponseFindRouteWithInterceptors.isSuccess() || !(obj instanceof RouteInfo)) {
                return null;
            }
            Bundle bundleCreateExtrasForFragment = AbstractLauncherKt.createExtrasForFragment(routeResponseFindRouteWithInterceptors.getRequest(), (RouteInfo) obj);
            bundleCreateExtrasForFragment.putString(BLROUTER_TARGETURL, routeRequest.getTargetUri().toString());
            bundleCreateExtrasForFragment.putString(BLROUTER_PAGENAME, ((RouteInfo) obj).getRouteName());
            bundleCreateExtrasForFragment.putString(BLROUTER_MATCHRULE, ((RouteInfo) obj).getMatchRule());
            bundleCreateExtrasForFragment.putBoolean(EXTRA_KEY_NESTED, true);
            return new Target(((RouteInfo) obj).getClazz(), bundleCreateExtrasForFragment);
        } catch (Exception e7) {
            BLog.e("find fragment error", e7);
            return null;
        }
    }

    @Nullable
    public static final Integer parseColor(@NotNull String str) {
        Integer numValueOf;
        try {
            numValueOf = Integer.valueOf(Color.parseColor("#" + str));
        } catch (Exception e7) {
            numValueOf = null;
        }
        return numValueOf;
    }
}
