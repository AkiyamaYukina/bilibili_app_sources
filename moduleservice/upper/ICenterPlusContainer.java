package com.bilibili.moduleservice.upper;

import android.os.Bundle;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/upper/ICenterPlusContainer.class */
public interface ICenterPlusContainer {
    void clearOtherTabCache();

    @NotNull
    HashMap<String, Object> getCameraHolder();

    int getTabBarHeight();

    boolean isCurrentShow(@NotNull ICenterPlusTab iCenterPlusTab);

    void setTabBarVisible(boolean z6, boolean z7);

    void switchTab(int i7, @Nullable Bundle bundle);
}
