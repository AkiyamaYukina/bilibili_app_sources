package com.bilibili.lib.riskcontrol;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/BiliRiskControlCallback.class */
public interface BiliRiskControlCallback {
    default void onRiskComplete(@Nullable String str, @Nullable BiliRiskException biliRiskException) {
    }

    default void onRiskComplete(@Nullable String str, @Nullable String str2) {
    }
}
