package com.bilibili.moduleservice.list;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/list/IPegasusInlineConfig.class */
public interface IPegasusInlineConfig {
    boolean currentIsUser();

    @NotNull
    PegasusInlineSwitchState getCurrentState();

    void setInlineSwitchState(@NotNull PegasusInlineSwitchState pegasusInlineSwitchState, boolean z6, boolean z7);
}
