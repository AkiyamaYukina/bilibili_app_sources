package com.bilibili.live.streaming.push;

import com.bilibili.mediastreaming.data.BiliPushReportMessage;
import com.bilibili.mediastreaming.data.BiliStatus;
import com.bilibili.mediastreaming.enums.BiliFlashpointErrorType;
import com.bilibili.mediastreaming.enums.BiliFlashpointPacketType;
import com.bilibili.mediastreaming.enums.ConnectedStatusCode;
import com.bilibili.mediastreaming.enums.ConnectingStatusCode;
import com.bilibili.mediastreaming.enums.DisConnectStatusCode;
import com.bilibili.mediastreaming.enums.ErrorCode;
import com.bilibili.mediastreaming.enums.FirstPacketStatusCode;
import com.bilibili.mediastreaming.enums.SendPacketStatusCode;
import com.bilibili.mediastreaming.enums.StartStatusCode;
import com.bilibili.mediastreaming.enums.StoppedStatusCode;
import com.bilibili.mediastreaming.enums.StoppingStatusCode;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/push/IBiliBizDefaultListener.class */
public interface IBiliBizDefaultListener {
    void onConnectStats(@NotNull List<BiliConnectStatsExt> list, long j7);

    void onConnected(@NotNull BiliProtocolExt biliProtocolExt, int i7, @NotNull BiliStatus<ConnectedStatusCode> biliStatus, int i8, long j7);

    void onConnectedFirstPacket(@NotNull BiliProtocolExt biliProtocolExt, @NotNull BiliFlashpointPacketType biliFlashpointPacketType, @NotNull BiliStatus<FirstPacketStatusCode> biliStatus, long j7);

    void onConnecting(@NotNull BiliProtocolExt biliProtocolExt, @NotNull BiliStatus<ConnectingStatusCode> biliStatus, long j7);

    void onDisconnect(@NotNull BiliProtocolExt biliProtocolExt, @NotNull BiliStatus<DisConnectStatusCode> biliStatus, long j7);

    void onError(@NotNull BiliProtocolExt biliProtocolExt, @NotNull BiliFlashpointErrorType biliFlashpointErrorType, @NotNull BiliStatus<ErrorCode> biliStatus, long j7);

    void onEvent(@NotNull String str, @NotNull BiliPushReportMessage biliPushReportMessage, long j7);

    void onNetStats(@NotNull List<BiliNetStatsExt> list, long j7);

    void onSendPacketFail(@NotNull BiliProtocolExt biliProtocolExt, @NotNull BiliFlashpointPacketType biliFlashpointPacketType, @NotNull BiliStatus<SendPacketStatusCode> biliStatus, long j7);

    void onStart(@NotNull BiliProtocolExt biliProtocolExt, @NotNull BiliStatus<StartStatusCode> biliStatus, long j7);

    void onStopped(@NotNull BiliProtocolExt biliProtocolExt, @NotNull BiliStatus<StoppedStatusCode> biliStatus, long j7);

    void onStopping(@NotNull BiliProtocolExt biliProtocolExt, @NotNull BiliStatus<StoppingStatusCode> biliStatus, long j7);
}
