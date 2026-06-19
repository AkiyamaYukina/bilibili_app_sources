package com.bilibili.lib.tribe.core.api;

import Ef0.InterfaceC1645d;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/api/DynamicBundleInfo.class */
public interface DynamicBundleInfo extends BundleInfo {
    @NotNull
    File getApk();

    @NotNull
    File getLibDir();

    @NotNull
    InterfaceC1645d getLoader();
}
