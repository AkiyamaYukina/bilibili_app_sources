package com.bilibili.moduleservice.player;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/player/ShareMediaPlayerProcessor.class */
public interface ShareMediaPlayerProcessor {
    @Nullable
    PlayerShareBundle<?> finishSharePlayer();

    void startSharePlayer(@NotNull PlayerShareBundle<?> playerShareBundle);
}
