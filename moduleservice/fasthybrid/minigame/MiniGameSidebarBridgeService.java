package com.bilibili.moduleservice.fasthybrid.minigame;

import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/minigame/MiniGameSidebarBridgeService.class */
public interface MiniGameSidebarBridgeService {
    @NotNull
    SharedFlow<MiniGameLaunchOpt> getMiniGameEnterBackgroundFlow();
}
