package com.bilibili.live.streaming.encoder;

import com.bilibili.mediastreaming.packet.BiliAudioEncoderPacket;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/IAudioEncoderCallback.class */
public interface IAudioEncoderCallback {
    void onAudioConfigPacket(@NotNull byte[] bArr, @NotNull String str);

    void onAudioEncoderState(@NotNull String str);

    void onAudioPacket(@NotNull BiliAudioEncoderPacket biliAudioEncoderPacket, @NotNull String str);

    void onSendAudioConfig(int i7, int i8, int i9, int i10, @NotNull String str);
}
