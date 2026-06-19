package com.bilibili.lib.riskcontrol;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/IActionValidateResult.class */
public interface IActionValidateResult {
    void onBlock(@NotNull String str);

    void onPass(@NotNull String str);
}
