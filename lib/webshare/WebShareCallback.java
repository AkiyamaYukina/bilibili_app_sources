package com.bilibili.lib.webshare;

import kntr.base.jsb.api.common.ShareFlowStep;
import kntr.base.jsb.api.common.ShareResultState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/webshare/WebShareCallback.class */
public interface WebShareCallback {
    void shareClick(@NotNull ShareFlowStep shareFlowStep, @NotNull String str);

    void shareResponse(@NotNull ShareFlowStep shareFlowStep);

    void shareResult(@NotNull ShareFlowStep shareFlowStep, @NotNull ShareResultState shareResultState, @Nullable String str);
}
