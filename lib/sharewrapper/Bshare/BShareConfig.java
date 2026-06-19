package com.bilibili.lib.sharewrapper.Bshare;

import com.bilibili.lib.config.BLRemoteConfig;
import com.bilibili.lib.sharewrapper.Bshare.GShare;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/BShareConfig.class */
public final class BShareConfig {

    @NotNull
    public static final BShareConfig INSTANCE = new BShareConfig();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static GShare.Config f64402a;

    public final boolean ab(@NotNull String str) {
        GShare.Config config = f64402a;
        return config != null ? config.ab(str) : true;
    }

    public final boolean ab2(@NotNull String str, boolean z6) {
        GShare.Config config = f64402a;
        return config != null ? config.ab2(str, z6) : true;
    }

    @Nullable
    public final String config(@NotNull String str, @Nullable String str2) {
        GShare.Config config = f64402a;
        return config != null ? config.config(str, str2) : null;
    }

    @Nullable
    public final GShare.Config getBShareConfig() {
        return f64402a;
    }

    @Nullable
    public final String remoteGetString(@NotNull String str, @Nullable String str2) {
        return BLRemoteConfig.getInstance().getString(str, str2);
    }

    public final void setBShareConfig(@Nullable GShare.Config config) {
        f64402a = config;
    }

    public final void setConfigDelegate(@NotNull GShare.Config config) {
        f64402a = config;
    }
}
