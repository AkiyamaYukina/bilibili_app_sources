package com.bilibili.lib.riskcontrol;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/ParamsDelegate.class */
public interface ParamsDelegate {
    @NotNull
    String config(@NotNull String str, @NotNull String str2);

    @NotNull
    Context fapp();

    boolean isNightTheme(@NotNull Context context);

    long nowTime();
}
