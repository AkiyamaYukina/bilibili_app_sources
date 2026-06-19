package com.bilibili.region;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/region/IRegionManager.class */
public interface IRegionManager {
    @Nullable
    String getIpRegion();

    @Nullable
    String getLegalRegion();

    @Nullable
    String getRecentRegion();

    void setIpRegion(@Nullable String str);

    void setLegalRegion(@Nullable String str);

    void setRecentRegion(@Nullable String str);
}
