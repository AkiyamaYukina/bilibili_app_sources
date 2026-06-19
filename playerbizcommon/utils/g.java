package com.bilibili.playerbizcommon.utils;

import com.bilibili.lib.device.settings.generated.api.DistributionSettings;
import dq0.InterfaceC6832c;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/g.class */
@Singleton
@Named("player_remote_setting")
public final class g implements InterfaceC6832c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f80287a = LazyKt.lazy(new Ba1.a(5));

    @Override // dq0.InterfaceC6832c
    public final long a() {
        Lazy lazy = this.f80287a;
        if (((DistributionSettings) lazy.getValue()).getPlayConfig().hasVolumeBalanceMode()) {
            return ((DistributionSettings) lazy.getValue()).getPlayConfig().getVolumeBalanceMode().getValue();
        }
        return 0L;
    }

    @Override // dq0.InterfaceC6832c
    public final boolean b() {
        Lazy lazy = this.f80287a;
        if (((DistributionSettings) lazy.getValue()).getPlayConfig().hasVolumeBalance()) {
            return ((DistributionSettings) lazy.getValue()).getPlayConfig().getVolumeBalance().getValue();
        }
        return false;
    }
}
