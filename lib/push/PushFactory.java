package com.bilibili.lib.push;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/PushFactory.class */
public interface PushFactory {
    @NotNull
    IPushRegistry create(@NotNull String str);
}
