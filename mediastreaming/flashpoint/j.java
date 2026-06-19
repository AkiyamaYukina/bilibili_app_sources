package com.bilibili.mediastreaming.flashpoint;

import com.bilibili.mediastreaming.data.BiliProtocol;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/j.class */
public interface j {
    void onConnectStats(@NotNull String str, long j7);

    void onConnected(@NotNull BiliProtocol biliProtocol, int i7, @NotNull BiliStatus<ConnectedStatusCode> biliStatus, int i8, long j7);

    void onConnectedFirstPacket(@NotNull BiliProtocol biliProtocol, @NotNull BiliFlashpointPacketType biliFlashpointPacketType, @NotNull BiliStatus<FirstPacketStatusCode> biliStatus, long j7);

    void onConnecting(@NotNull BiliProtocol biliProtocol, @NotNull BiliStatus<ConnectingStatusCode> biliStatus, long j7);

    void onDisconnect(@NotNull BiliProtocol biliProtocol, @NotNull BiliStatus<DisConnectStatusCode> biliStatus, long j7);

    void onError(@NotNull BiliProtocol biliProtocol, @NotNull BiliFlashpointErrorType biliFlashpointErrorType, @NotNull BiliStatus<ErrorCode> biliStatus, long j7);

    void onEvent(@NotNull String str, @NotNull String str2, long j7);

    void onNetStats(@NotNull String str, long j7);

    void onSendPacketFail(@NotNull BiliProtocol biliProtocol, @NotNull BiliFlashpointPacketType biliFlashpointPacketType, @NotNull BiliStatus<SendPacketStatusCode> biliStatus, long j7);

    void onStart(@NotNull BiliProtocol biliProtocol, @NotNull BiliStatus<StartStatusCode> biliStatus, long j7);

    void onStopped(@NotNull BiliProtocol biliProtocol, @NotNull BiliStatus<StoppedStatusCode> biliStatus, long j7);

    void onStopping(@NotNull BiliProtocol biliProtocol, @NotNull BiliStatus<StoppingStatusCode> biliStatus, long j7);
}
