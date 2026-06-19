package com.bilibili.lib.webshare;

import kntr.base.jsb.api.common.LaunchMiniProgramState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/webshare/MiniProgramCallback.class */
public interface MiniProgramCallback {
    void extMsg(@NotNull LaunchMiniProgramState launchMiniProgramState, @Nullable String str);

    void shareResult(@NotNull LaunchMiniProgramState launchMiniProgramState);
}
