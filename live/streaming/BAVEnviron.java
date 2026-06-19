package com.bilibili.live.streaming;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils;
import com.bilibili.live.streaming.log.LivePusherLog;
import com.bilibili.mediastreaming.BiliPushDevice;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/BAVEnviron.class */
public final class BAVEnviron {
    private static boolean isBt2020PqSupported;
    private static boolean isGLES31Supported;
    private static boolean isHDREncodeSupported;
    private static boolean isSMPTE2086MetadataSupported;

    @Nullable
    private static String packageName;

    @Nullable
    private static String packageTail;

    @Nullable
    private static String packageVer;

    @NotNull
    public static final BAVEnviron INSTANCE = new BAVEnviron();

    @NotNull
    private static String sdkVer = "20260604-004";

    @NotNull
    private static String gl_renderer = "";

    @NotNull
    private static String gl_vendor = "";

    @NotNull
    private static String gl_version = "";

    private BAVEnviron() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (kotlin.text.StringsKt.n(r0, r5) == true) goto L24;
     */
    @kotlin.jvm.JvmStatic
    @com.bilibili.lib.ghost.api.Invocation(category = com.bilibili.lib.ghost.api.InvocationCategory.INVOKE_NONE_STATIC, name = "getPackageInfo", owner = {"android.content.pm.PackageManager"})
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.pm.PackageInfo __Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo(@org.jetbrains.annotations.NotNull android.content.pm.PackageManager r4, @org.jetbrains.annotations.NotNull java.lang.String r5, int r6) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            com.bilibili.lib.blconfig.ConfigManager$Companion r0 = com.bilibili.lib.blconfig.ConfigManager.Companion     // Catch: java.lang.Exception -> L12
            com.bilibili.lib.blconfig.FeatureFlagContract r0 = r0.ab2()     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = "ff.privacy.hook.agree.get_package_info"
            r2 = 1
            boolean r0 = r0.getWithDefault(r1, r2)     // Catch: java.lang.Exception -> L12
            r7 = r0
            goto L16
        L12:
            r9 = move-exception
            r0 = 1
            r7 = r0
        L16:
            com.bilibili.privacy.PrivacyHelper r0 = com.bilibili.privacy.PrivacyHelper.INSTANCE
            java.lang.String r1 = "pm_get_package_info"
            boolean r0 = r0.checkPrivacy$privacy_release(r1)
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L2c
            r0 = r7
            if (r0 != 0) goto L80
        L2c:
            com.bilibili.lib.blconfig.ConfigManager$Companion r0 = com.bilibili.lib.blconfig.ConfigManager.Companion     // Catch: java.lang.Exception -> L92
            com.bilibili.lib.blconfig.Contract r0 = r0.config()     // Catch: java.lang.Exception -> L92
            java.lang.String r1 = "privacy.pkg_info_whitelist"
            r2 = 0
            java.lang.Object r0 = r0.get(r1, r2)     // Catch: java.lang.Exception -> L92
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L92
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L53
            r0 = r10
            r1 = r5
            boolean r0 = kotlin.text.StringsKt.n(r0, r1)     // Catch: java.lang.Exception -> L92
            r7 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L53
            goto L80
        L53:
            r0 = r5
            boolean r0 = V0.f.c(r0)
            if (r0 == 0) goto L77
            r0 = r4
            r1 = 0
            android.content.pm.PackageInfo r0 = V0.e.a(r0, r1)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L75
            android.content.pm.PackageInfo r0 = new android.content.pm.PackageInfo
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = 2233(0x8b9, float:3.129E-42)
            r0.versionCode = r1
        L75:
            r0 = r4
            return r0
        L77:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L80:
            r0 = r4
            r1 = r5
            r2 = r6
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)
            r5 = r0
            r0 = r9
            r4 = r0
            r0 = r5
            if (r0 == 0) goto L90
            r0 = r5
            r4 = r0
        L90:
            r0 = r4
            return r0
        L92:
            r10 = move-exception
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.BAVEnviron.__Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo(android.content.pm.PackageManager, java.lang.String, int):android.content.pm.PackageInfo");
    }

    @NotNull
    public final String getAppIdentity() {
        String str;
        String str2 = packageName;
        if (Intrinsics.areEqual(str2, "tv.danmaku.bili")) {
            str = "Pink";
        } else if (Intrinsics.areEqual(str2, "com.bilibili.bilibililive")) {
            str = "Blink";
        } else {
            String str3 = packageTail;
            str = str3;
            if (str3 == null) {
                str = "UND";
            }
        }
        String str4 = packageVer;
        String str5 = str4;
        if (str4 == null) {
            str5 = "?";
        }
        return B0.a.a(str, ":", str5);
    }

    @NotNull
    public final String getEncoderName() {
        return Intrinsics.areEqual(sdkVer, "null") ? U1.i.a(getPhoneModel(), "/", BiliPushDevice.INSTANCE.getPhoneOSVersion(), "/9374e5042/", getAppIdentity()) : U1.i.a(getPhoneModel(), "/", BiliPushDevice.INSTANCE.getPhoneOSVersion(), "/9374e5042/", getAppIdentity());
    }

    @NotNull
    public final String getGl_renderer() {
        return gl_renderer;
    }

    @NotNull
    public final String getGl_vendor() {
        return gl_vendor;
    }

    @NotNull
    public final String getGl_version() {
        return gl_version;
    }

    @NotNull
    public final String getPhoneModel() {
        return StringsKt.L(BiliPushDevice.INSTANCE.getPhoneModel(), " ", "_");
    }

    public final void init(@NotNull Application application) {
        PackageManager packageManager;
        List groupValues;
        try {
            Context applicationContext = application.getApplicationContext();
            String packageName2 = applicationContext != null ? applicationContext.getPackageName() : null;
            packageName = packageName2;
            if (packageName2 == null) {
                return;
            }
            MatchResult matchResultFind$default = Regex.find$default(new Regex("\\.([^.]+)$"), packageName2, 0, 2, (Object) null);
            packageTail = (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null) ? null : (String) groupValues.get(1);
            Context applicationContext2 = application.getApplicationContext();
            if (applicationContext2 == null || (packageManager = applicationContext2.getPackageManager()) == null) {
                return;
            }
            packageVer = (Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(packageName2, PackageManager.PackageInfoFlags.of(0L)) : __Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo(packageManager, packageName2, 0)).versionName;
            LivePusherLog.i$default("BAVEnviron", "start check current device isSupportHDR encoder...", null, 4, null);
            isHDREncodeSupported = BiliPushAVCodecUtils.INSTANCE.isSupportHDR();
            LivePusherLog.i$default("BAVEnviron", "start check current device isSupportHDR encoder done!", null, 4, null);
        } catch (Exception e7) {
            LivePusherLog.e("BAVEnviron", "init exception, msg:" + e7.getMessage(), e7);
        }
    }

    public final boolean isBt2020PqSupported() {
        return isBt2020PqSupported;
    }

    public final boolean isGLES31Supported() {
        return isGLES31Supported;
    }

    public final boolean isHDREncodeSupported() {
        return isHDREncodeSupported;
    }

    public final boolean isSMPTE2086MetadataSupported() {
        return isSMPTE2086MetadataSupported;
    }

    public final void setBt2020PqSupported(boolean z6) {
        isBt2020PqSupported = z6;
    }

    public final void setGLES31Supported(boolean z6) {
        isGLES31Supported = z6;
    }

    public final void setGl_renderer(@NotNull String str) {
        gl_renderer = str;
    }

    public final void setGl_vendor(@NotNull String str) {
        gl_vendor = str;
    }

    public final void setGl_version(@NotNull String str) {
        gl_version = str;
    }

    public final void setHDREncodeSupported(boolean z6) {
        isHDREncodeSupported = z6;
    }

    public final void setSMPTE2086MetadataSupported(boolean z6) {
        isSMPTE2086MetadataSupported = z6;
    }
}
