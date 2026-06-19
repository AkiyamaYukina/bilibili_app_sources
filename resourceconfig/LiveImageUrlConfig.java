package com.bilibili.resourceconfig;

import ID.a;
import android.app.Application;
import com.bilibili.base.BiliContext;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.util.AppResUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/resourceconfig/LiveImageUrlConfig.class */
public final class LiveImageUrlConfig {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/resourceconfig/LiveImageUrlConfig$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String getGiftDynamicUrl() {
            return "https://i0.hdslb.com/bfs/live/bb86c580db6712b381f51ba73e1408781fa07c4c.webp";
        }

        @JvmStatic
        @NotNull
        public final String getImageUrl(@NotNull String str) {
            return AppResUtil.getImageUrl(str);
        }

        @JvmStatic
        @NotNull
        public final String resourceToUri(int i7) {
            Application application = BiliContext.application();
            return a.a(i7, "res://", application != null ? application.getPackageName() : null, "/");
        }
    }

    @JvmStatic
    @NotNull
    public static final String getGiftDynamicUrl() {
        return Companion.getGiftDynamicUrl();
    }

    @JvmStatic
    @NotNull
    public static final String getImageUrl(@NotNull String str) {
        return Companion.getImageUrl(str);
    }

    @JvmStatic
    @NotNull
    public static final String resourceToUri(int i7) {
        return Companion.resourceToUri(i7);
    }
}
