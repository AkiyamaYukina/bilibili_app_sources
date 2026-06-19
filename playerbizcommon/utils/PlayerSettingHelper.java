package com.bilibili.playerbizcommon.utils;

import android.text.TextUtils;
import androidx.media3.exoplayer.analytics.B;
import com.bapis.bilibili.app.distribution.BoolValue;
import com.bapis.bilibili.app.distribution.setting.play.PlayConfig;
import com.bilibili.commons.ArrayUtils;
import com.bilibili.lib.device.settings.generated.api.DistributionSettings;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.videoplayer.core.media.ijk.IjkOptionsHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/PlayerSettingHelper.class */
public final class PlayerSettingHelper {

    @NotNull
    public static final PlayerSettingHelper INSTANCE = new PlayerSettingHelper();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f80270a = LazyKt.lazy(new Ba1.b(9));

    public static DistributionSettings a() {
        return (DistributionSettings) f80270a.getValue();
    }

    @JvmStatic
    public static final boolean enablePlayUrlHTTPS() {
        INSTANCE.getClass();
        DistributionSettings distributionSettingsA = a();
        boolean z6 = false;
        if (distributionSettingsA != null) {
            PlayConfig playConfig = distributionSettingsA.getPlayConfig();
            z6 = false;
            if (playConfig != null) {
                z6 = false;
                if (playConfig.hasEnablePlayurlHTTPS()) {
                    DistributionSettings distributionSettingsA2 = a();
                    z6 = false;
                    if (distributionSettingsA2 != null) {
                        PlayConfig playConfig2 = distributionSettingsA2.getPlayConfig();
                        z6 = false;
                        if (playConfig2 != null) {
                            BoolValue enablePlayurlHTTPS = playConfig2.getEnablePlayurlHTTPS();
                            z6 = false;
                            if (enablePlayurlHTTPS != null) {
                                z6 = false;
                                if (enablePlayurlHTTPS.getValue()) {
                                    z6 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z6;
    }

    @JvmStatic
    public static final int getDefaultQuality() {
        return Oi1.f.a();
    }

    @JvmStatic
    public static final int getForceHost() {
        PlayConfig playConfig;
        BoolValue enablePlayurlHTTPS;
        INSTANCE.getClass();
        DistributionSettings distributionSettingsA = a();
        return (distributionSettingsA == null || (playConfig = distributionSettingsA.getPlayConfig()) == null || (enablePlayurlHTTPS = playConfig.getEnablePlayurlHTTPS()) == null || !enablePlayurlHTTPS.getValue()) ? 0 : 2;
    }

    @JvmStatic
    public static final boolean isQualityAutoSwitch() {
        boolean z6 = true;
        if (!IPlayerSettingService.Companion.getBoolean("pref_player_mediaSource_quality_auto_switch", true)) {
            Oi1.f.b();
            z6 = true;
            if (!Oi1.f.b) {
                Oi1.f.b();
                z6 = Oi1.f.c;
            }
        }
        return z6;
    }

    @JvmStatic
    public static final boolean isSupport4K() {
        boolean zIsSupport4K;
        try {
            zIsSupport4K = IjkOptionsHelper.isSupport4K();
        } catch (Exception e7) {
            B.a("init support 4k error:", e7);
            zIsSupport4K = false;
        }
        return zIsSupport4K;
    }

    public static /* synthetic */ boolean isVipQuality$default(PlayerSettingHelper playerSettingHelper, int i7, String str, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        return playerSettingHelper.isVipQuality(i7, str);
    }

    @JvmStatic
    public static final boolean shouldAutoPlayWhenEnterDetailPage() {
        PlayConfig playConfig;
        BoolValue shouldAutoPlay;
        INSTANCE.getClass();
        DistributionSettings distributionSettingsA = a();
        boolean z6 = true;
        if (distributionSettingsA != null) {
            PlayConfig playConfig2 = distributionSettingsA.getPlayConfig();
            z6 = true;
            if (playConfig2 != null) {
                z6 = true;
                if (playConfig2.hasShouldAutoPlay()) {
                    DistributionSettings distributionSettingsA2 = a();
                    z6 = (distributionSettingsA2 == null || (playConfig = distributionSettingsA2.getPlayConfig()) == null || (shouldAutoPlay = playConfig.getShouldAutoPlay()) == null || !shouldAutoPlay.getValue()) ? false : true;
                }
            }
        }
        return z6;
    }

    public final int getSettingsQuality() {
        return IPlayerSettingService.Companion.getInt("pref_player_mediaSource_quality_wifi_key", 0);
    }

    public final boolean isVipQuality(int i7, @Nullable String str) {
        if (TextUtils.equals(str, "pugv")) {
            return false;
        }
        return Intrinsics.areEqual("bangumi", str) ? ArrayUtils.contains(tb0.c.a("player_pgc_vip_qn", new int[]{112, 120}), i7) : ArrayUtils.contains(tb0.c.b(), i7);
    }

    public final boolean shouldAutoFullscreenWhenEnterDetailPage() {
        DistributionSettings distributionSettingsA = a();
        boolean z6 = false;
        if (distributionSettingsA != null) {
            PlayConfig playConfig = distributionSettingsA.getPlayConfig();
            z6 = false;
            if (playConfig != null) {
                z6 = false;
                if (playConfig.hasShouldAutoPlay()) {
                    DistributionSettings distributionSettingsA2 = a();
                    z6 = false;
                    if (distributionSettingsA2 != null) {
                        PlayConfig playConfig2 = distributionSettingsA2.getPlayConfig();
                        z6 = false;
                        if (playConfig2 != null) {
                            BoolValue shouldAutoFullScreen = playConfig2.getShouldAutoFullScreen();
                            z6 = false;
                            if (shouldAutoFullScreen != null) {
                                z6 = false;
                                if (shouldAutoFullScreen.getValue()) {
                                    z6 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z6;
    }
}
