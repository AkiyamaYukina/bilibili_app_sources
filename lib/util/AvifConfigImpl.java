package com.bilibili.lib.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/util/AvifConfigImpl.class */
public final class AvifConfigImpl {

    @NotNull
    public static final AvifConfigImpl INSTANCE = new AvifConfigImpl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Config f65025a;

    public final boolean ff(@NotNull String str, boolean z6) {
        Config config = f65025a;
        boolean zFf = z6;
        if (config != null) {
            zFf = config.ff(str, z6);
        }
        return zFf;
    }

    public final void initConfig(@NotNull Config config) {
        f65025a = config;
    }
}
