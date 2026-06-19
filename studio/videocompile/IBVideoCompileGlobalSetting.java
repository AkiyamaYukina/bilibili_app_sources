package com.bilibili.studio.videocompile;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/IBVideoCompileGlobalSetting.class */
public interface IBVideoCompileGlobalSetting {
    @Nullable
    default String dd(@NotNull String str, @NotNull String str2) {
        return "";
    }

    boolean enableDebug();

    @NotNull
    String getBuvid();

    @Nullable
    String getConfig(@NotNull String str, @Nullable String str2);

    @Nullable
    IBVideoCompileDataReport getDataReport();

    int getDeviceType();

    @Nullable
    IBVideoCompileLogger getLogger();

    @NotNull
    String getOutputFileDir();
}
