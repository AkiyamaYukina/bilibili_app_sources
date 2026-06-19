package com.bilibili.lib.webshare;

import android.app.Activity;
import kntr.base.jsb.api.common.LaunchMiniProgramReq;
import kntr.base.jsb.api.common.PlacardReq;
import kntr.base.jsb.api.common.QuickWordReq;
import kntr.base.jsb.api.common.ShareToChannelReq;
import kntr.base.jsb.api.common.SupportChannelsResp;
import kntr.base.jsb.api.common.WebShareContent;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/webshare/WebShareV2.class */
public interface WebShareV2 {

    @NotNull
    public static final Companion Companion = Companion.f65134a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/webshare/WebShareV2$Companion.class */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Companion f65134a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public static WebShareV2 f65135b;

        @JvmStatic
        public static /* synthetic */ void getINSTANCE$annotations() {
        }

        @Nullable
        public final WebShareV2 getINSTANCE() {
            return f65135b;
        }

        @Nullable
        public final WebShareV2 getINSTANCE1() {
            return f65135b;
        }

        public final void setINSTANCE(@Nullable WebShareV2 webShareV2) {
            f65135b = webShareV2;
        }

        public final void setWebShareV2Impl(@NotNull WebShareV2 webShareV2) {
            f65135b = webShareV2;
        }
    }

    @Nullable
    static WebShareV2 getINSTANCE() {
        return Companion.getINSTANCE();
    }

    static void setINSTANCE(@Nullable WebShareV2 webShareV2) {
        Companion.setINSTANCE(webShareV2);
    }

    static /* synthetic */ void showShareMenus$default(WebShareV2 webShareV2, Activity activity, String str, String str2, String str3, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showShareMenus");
        }
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        webShareV2.showShareMenus(activity, str, str2, str3);
    }

    @Nullable
    SupportChannelsResp getSupportChannels(@NotNull Activity activity);

    void launchMiniProgram(@NotNull Activity activity, @Nullable LaunchMiniProgramReq launchMiniProgramReq, @Nullable MiniProgramCallback miniProgramCallback);

    void onReset(@Nullable Activity activity);

    void setShareContent(@NotNull Activity activity, @Nullable WebShareContent webShareContent, @Nullable WebShareCallback webShareCallback);

    void sharePlacard(@NotNull Activity activity, @Nullable PlacardReq placardReq, @Nullable WebShareCallback webShareCallback);

    void shareQuickWord(@NotNull Activity activity, @Nullable QuickWordReq quickWordReq, @Nullable WebShareCallback webShareCallback);

    void shareToTarget(@NotNull Activity activity, @Nullable ShareToChannelReq shareToChannelReq, @Nullable WebShareCallback webShareCallback);

    void showShareMenus(@NotNull Activity activity, @NotNull String str, @Nullable String str2, @Nullable String str3);

    void showShareWindow(@NotNull Activity activity, @Nullable WebShareContent webShareContent, @Nullable WebShareCallback webShareCallback);
}
