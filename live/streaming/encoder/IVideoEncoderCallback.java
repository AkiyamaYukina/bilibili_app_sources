package com.bilibili.live.streaming.encoder;

import com.bilibili.mediastreaming.packet.BiliVideoEncoderPacket;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/IVideoEncoderCallback.class */
public interface IVideoEncoderCallback {
    void onSendVideoConfig(int i7, int i8, int i9, int i10, int i11, @NotNull String str, @NotNull String str2, boolean z6);

    void onVideoConfigPacket(@NotNull byte[] bArr, @NotNull String str);

    void onVideoEncoderState(@NotNull VideoEncodeState videoEncodeState, @NotNull String str);

    void onVideoPacket(@NotNull BiliVideoEncoderPacket biliVideoEncoderPacket, boolean z6, @NotNull String str);
}
