package com.bilibili.playerbizcommon.utils;

import M3.C2570c1;
import com.bapis.bilibili.app.distribution.BoolValue;
import com.bapis.bilibili.app.distribution.setting.play.CloudPlayConfig;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.device.settings.generated.api.DistributionSettings;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/e.class */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f80284a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f80285b = LazyKt.lazy(new C2570c1(6));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy f80286c = LazyKt.lazy(new Ba0.b(10));

    public static void b(boolean z6) {
        CloudPlayConfig cloudPlayConfig;
        DistributionSettings distributionSettings = (DistributionSettings) f80285b.getValue();
        if (distributionSettings == null || (cloudPlayConfig = distributionSettings.getCloudPlayConfig()) == null) {
            return;
        }
        distributionSettings.setCloudPlayConfig((CloudPlayConfig) ((CloudPlayConfig.b) cloudPlayConfig.toBuilder()).setPriorityUseDolbyHDR(BoolValue.newBuilder(cloudPlayConfig.getPriorityUseDolbyHDR()).setValue(z6)).build());
    }

    public final long a() {
        DistributionSettings distributionSettings = (DistributionSettings) f80285b.getValue();
        boolean value = false;
        if (distributionSettings != null) {
            CloudPlayConfig cloudPlayConfig = distributionSettings.getCloudPlayConfig();
            if (cloudPlayConfig.hasPriorityUseDolbyHDR()) {
                value = cloudPlayConfig.getPriorityUseDolbyHDR().getValue();
            }
        }
        return (value && BiliAccountInfo.Companion.get().isEffectiveVip()) ? 1L : 0L;
    }
}
