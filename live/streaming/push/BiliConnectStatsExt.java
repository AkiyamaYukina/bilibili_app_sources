package com.bilibili.live.streaming.push;

import com.bilibili.mediastreaming.data.BiliConnectStats;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/push/BiliConnectStatsExt.class */
public final class BiliConnectStatsExt extends BiliConnectStats {

    @NotNull
    private BiliPushProtocolType protocolType = BiliPushProtocolType.UN_DEFINE;

    @Nullable
    private Long videoInNum;

    @Nullable
    private Long videoOutNum;

    @NotNull
    public final BiliPushProtocolType getProtocolType() {
        return this.protocolType;
    }

    @Nullable
    public final Long getVideoInNum() {
        return this.videoInNum;
    }

    @Nullable
    public final Long getVideoOutNum() {
        return this.videoOutNum;
    }

    public final void setProtocolType(@NotNull BiliPushProtocolType biliPushProtocolType) {
        this.protocolType = biliPushProtocolType;
    }

    public final void setVideoInNum(@Nullable Long l7) {
        this.videoInNum = l7;
    }

    public final void setVideoOutNum(@Nullable Long l7) {
        this.videoOutNum = l7;
    }
}
