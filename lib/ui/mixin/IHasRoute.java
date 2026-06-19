package com.bilibili.lib.ui.mixin;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/mixin/IHasRoute.class */
public interface IHasRoute {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/mixin/IHasRoute$Info.class */
    public interface Info {

        @NotNull
        public static final a Companion = a.f64892a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/mixin/IHasRoute$Info$a.class */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f64892a = new Object();
        }

        @NotNull
        String getParentRouteName();

        @NotNull
        String getRouteName();

        @NotNull
        String getRouteRule();

        @NotNull
        String getTargetUrl();
    }

    @NotNull
    Info getCurShownFragmentInfo();

    @NotNull
    Info getInfo();

    void setCurShownFragmentInfo(@NotNull Info info);
}
