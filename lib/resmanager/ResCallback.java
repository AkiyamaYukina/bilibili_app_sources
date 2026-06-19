package com.bilibili.lib.resmanager;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/ResCallback.class */
public interface ResCallback {
    void onFailure(int i7, @Nullable String str);

    void onSuccess(@NotNull ResResponse resResponse);
}
