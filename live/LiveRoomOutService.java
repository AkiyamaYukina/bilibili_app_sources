package com.bilibili.live;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/LiveRoomOutService.class */
public interface LiveRoomOutService {
    void closeRoom();

    @NotNull
    Class<?> getLiveRoomActivityClazz();
}
