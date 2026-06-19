package com.bilibili.live.streaming.push;

import com.bilibili.bililive.usblivekit.pccon.status.PushStatus;
import com.bilibili.bililive.usblivekit.pccon.status.USBStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/push/IBiliBizUSBListener.class */
public interface IBiliBizUSBListener {
    void onUSBConnectStatusChange(@NotNull USBStatus uSBStatus);

    void onUSBError(@NotNull String str);

    void onUSBPushStatusChange(@NotNull PushStatus pushStatus);

    void onUSBReady(@Nullable byte[] bArr);

    void onUSBStop();
}
