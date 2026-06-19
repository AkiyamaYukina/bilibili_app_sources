package com.bilibili.live;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/ILiveRouterDispatcherService.class */
public interface ILiveRouterDispatcherService {
    void handleUrl(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ILiveRouterDispatcherProvider iLiveRouterDispatcherProvider);
}
