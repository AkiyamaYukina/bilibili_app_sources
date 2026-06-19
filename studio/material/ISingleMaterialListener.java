package com.bilibili.studio.material;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/ISingleMaterialListener.class */
public interface ISingleMaterialListener extends IDownloadMaterialListener {
    void onFailed(@Nullable String str, @Nullable String str2, @Nullable FailReason failReason);

    void onSuccess(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);
}
