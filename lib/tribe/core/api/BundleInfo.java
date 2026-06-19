package com.bilibili.lib.tribe.core.api;

import Ef0.InterfaceC1643b;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/api/BundleInfo.class */
public interface BundleInfo {
    @NotNull
    List<InterfaceC1643b> getComponents();

    @NotNull
    List<DependencyInfo> getDependencies();

    @NotNull
    String getName();

    int getPriority();

    long getVersionCode();

    @NotNull
    String getVersionName();
}
