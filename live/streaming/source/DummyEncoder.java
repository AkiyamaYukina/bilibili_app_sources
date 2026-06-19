package com.bilibili.live.streaming.source;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/DummyEncoder.class */
public final class DummyEncoder implements AutoCloseable {

    @NotNull
    private final MediaCodec mCodec;

    @NotNull
    private final Surface mSurface;

    public DummyEncoder(int i7, int i8) throws IOException {
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(BiliPushAVCodecUtils.HEVC_MIME);
        this.mCodec = mediaCodecCreateEncoderByType;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(BiliPushAVCodecUtils.HEVC_MIME, i7, i8);
        mediaFormatCreateVideoFormat.setInteger("profile", 4096);
        mediaFormatCreateVideoFormat.setInteger("bitrate", PlaybackException.CUSTOM_ERROR_CODE_BASE);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 3);
        mediaFormatCreateVideoFormat.setInteger("color-standard", 6);
        mediaFormatCreateVideoFormat.setInteger("color-range", 2);
        mediaFormatCreateVideoFormat.setInteger("color-transfer", 6);
        mediaFormatCreateVideoFormat.setFeatureEnabled("hdr-editing", true);
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.mSurface = mediaCodecCreateEncoderByType.createInputSurface();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.mSurface.release();
        this.mCodec.release();
    }

    @NotNull
    public final MediaCodec getMCodec() {
        return this.mCodec;
    }

    @NotNull
    public final Surface getMSurface() {
        return this.mSurface;
    }

    @NotNull
    public final Surface surface() {
        return this.mSurface;
    }
}
