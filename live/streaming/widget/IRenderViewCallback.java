package com.bilibili.live.streaming.widget;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/widget/IRenderViewCallback.class */
public interface IRenderViewCallback {
    void onSurfaceChanged(@NotNull ISurfaceHolder iSurfaceHolder, int i7, int i8, int i9);

    void onSurfaceCreated(@NotNull ISurfaceHolder iSurfaceHolder, int i7, int i8);

    void onSurfaceDestroyed(@NotNull ISurfaceHolder iSurfaceHolder);
}
