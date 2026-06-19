package com.bilibili.live.streaming.push;

import com.bilibili.mediastreaming.data.BiliNetStats;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/push/BiliNetStatsExt.class */
public final class BiliNetStatsExt extends BiliNetStats {

    @NotNull
    private BiliPushProtocolType protocolType = BiliPushProtocolType.UN_DEFINE;

    @NotNull
    public final BiliPushProtocolType getProtocolType() {
        return this.protocolType;
    }

    public final void setProtocolType(@NotNull BiliPushProtocolType biliPushProtocolType) {
        this.protocolType = biliPushProtocolType;
    }
}
