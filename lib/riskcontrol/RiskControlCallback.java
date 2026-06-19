package com.bilibili.lib.riskcontrol;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/RiskControlCallback.class */
public interface RiskControlCallback {
    void onFailed(@NotNull BiliRiskException biliRiskException);

    void onSuccess(@NotNull String str);
}
