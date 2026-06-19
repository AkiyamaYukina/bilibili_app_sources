package com.bilibili.live.streaming.push;

import com.bilibili.mediastreaming.data.BiliProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/push/BiliProtocolExt.class */
public final class BiliProtocolExt extends BiliProtocol {

    @NotNull
    private BiliPushProtocolType protocolType;

    public BiliProtocolExt(@NotNull BiliProtocol biliProtocol) {
        this(biliProtocol.getUri(), biliProtocol.getProtocol());
    }

    public BiliProtocolExt(@NotNull String str, @NotNull String str2) {
        super(str, str2);
        this.protocolType = BiliPushProtocolType.UN_DEFINE;
        this.protocolType = BiliPushProtocolType.Companion.fromOrdinal(str2);
    }

    @NotNull
    public final BiliPushProtocolType getProtocolType() {
        return this.protocolType;
    }

    public final void setProtocolType(@NotNull BiliPushProtocolType biliPushProtocolType) {
        this.protocolType = biliPushProtocolType;
    }
}
