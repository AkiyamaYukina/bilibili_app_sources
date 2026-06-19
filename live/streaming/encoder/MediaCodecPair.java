package com.bilibili.live.streaming.encoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/MediaCodecPair.class */
public final class MediaCodecPair {

    @NotNull
    private final AsyncEncoderUtil async;

    @NotNull
    private final MediaCodec encoder;

    @NotNull
    private MediaFormat mediaFormat;

    public MediaCodecPair(@NotNull MediaCodec mediaCodec, @NotNull AsyncEncoderUtil asyncEncoderUtil, @NotNull MediaFormat mediaFormat) {
        this.encoder = mediaCodec;
        this.async = asyncEncoderUtil;
        this.mediaFormat = mediaFormat;
    }

    @NotNull
    public final AsyncEncoderUtil getAsync() {
        return this.async;
    }

    @NotNull
    public final MediaCodec getEncoder() {
        return this.encoder;
    }

    @NotNull
    public final MediaFormat getMediaFormat() {
        return this.mediaFormat;
    }

    public final void setMediaFormat(@NotNull MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat;
    }
}
