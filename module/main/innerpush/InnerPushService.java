package com.bilibili.module.main.innerpush;

import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/main/innerpush/InnerPushService.class */
public interface InnerPushService {
    @NotNull
    StateFlow<InnerPush> getLastClickPush();
}
