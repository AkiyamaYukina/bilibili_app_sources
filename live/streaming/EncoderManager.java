package com.bilibili.live.streaming;

import com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils;
import com.bilibili.live.streaming.encoder.EncoderConfig;
import com.bilibili.live.streaming.gl.BEGLSurface;
import com.bilibili.live.streaming.log.LivePusherLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/EncoderManager.class */
public final class EncoderManager {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "EncoderManager";
    private int audioBitRate;
    private int audioDepth;

    @NotNull
    private EncoderConfig.AudioEncoderInfo audioEncoderInfo;
    private int channelCount;

    @NotNull
    private final EncoderConfig encoderConfig;
    private int encoderHeight;
    private int encoderWidth;
    private int frameRate;
    private int iFrameInterval;
    private int sampleRateInHz;
    private int videoBitRate;

    @NotNull
    private String videoCodecType;

    @NotNull
    private EncoderConfig.VideoEncoderInfo videoEncoderInfo;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/EncoderManager$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EncoderManager() {
        EncoderConfig encoderConfig = new EncoderConfig();
        this.encoderConfig = encoderConfig;
        this.videoCodecType = LiveConstants.NORMAL_VIDEO_CODEC;
        encoderConfig.setMimeType(BiliPushAVCodecUtils.AVC_MIME);
        encoderConfig.setSampleRateInHz(48000);
        encoderConfig.setChannelCount(2);
        encoderConfig.setAudioDepth(16);
        encoderConfig.setFrameRate(25);
        encoderConfig.setIFrameInterval(3);
        encoderConfig.setAudioBitRate(LiveConstants.AUDIO_BITRATE_96);
        encoderConfig.setWidth(720);
        encoderConfig.setHeight(1280);
        encoderConfig.setVideoBitRate(LiveConstants.VIDEO_BITRATE_800);
        this.encoderWidth = encoderConfig.getWidth();
        this.encoderHeight = encoderConfig.getHeight();
        this.sampleRateInHz = encoderConfig.getSampleRateInHz();
        this.channelCount = encoderConfig.getChannelCount();
        this.audioDepth = encoderConfig.getAudioDepth();
        this.frameRate = encoderConfig.getFrameRate();
        this.iFrameInterval = encoderConfig.getIFrameInterval();
        this.videoBitRate = encoderConfig.getVideoBitRate();
        this.audioBitRate = encoderConfig.getAudioBitRate();
        this.videoEncoderInfo = encoderConfig.getVideoEncoderInfo();
        this.audioEncoderInfo = encoderConfig.getAudioEncoderInfo();
    }

    public static /* synthetic */ boolean useDolbyEncoder$default(EncoderManager encoderManager, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = true;
        }
        return encoderManager.useDolbyEncoder(z6);
    }

    public static /* synthetic */ boolean useHEVCEncoder$default(EncoderManager encoderManager, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = true;
        }
        return encoderManager.useHEVCEncoder(z6);
    }

    public final int getAudioBitRate() {
        return this.encoderConfig.getAudioBitRate();
    }

    public final int getAudioDepth() {
        return this.encoderConfig.getAudioDepth();
    }

    @NotNull
    public final EncoderConfig.AudioEncoderInfo getAudioEncoderInfo() {
        return this.encoderConfig.getAudioEncoderInfo();
    }

    public final int getChannelCount() {
        return this.encoderConfig.getChannelCount();
    }

    @NotNull
    public final EncoderConfig getEncoderConfig$BiliLivePushStreaming_release() {
        return this.encoderConfig;
    }

    public final int getEncoderHeight() {
        return this.encoderConfig.getHeight();
    }

    public final int getEncoderWidth() {
        return this.encoderConfig.getWidth();
    }

    public final int getFrameRate() {
        return this.encoderConfig.getFrameRate();
    }

    public final int getIFrameInterval() {
        return this.encoderConfig.getIFrameInterval();
    }

    public final int getSampleRateInHz() {
        return this.encoderConfig.getSampleRateInHz();
    }

    public final int getVideoBitRate() {
        return this.encoderConfig.getVideoBitRate();
    }

    @NotNull
    public final String getVideoCodecType$BiliLivePushStreaming_release() {
        return this.videoCodecType;
    }

    @NotNull
    public final EncoderConfig.VideoEncoderInfo getVideoEncoderInfo() {
        return this.encoderConfig.getVideoEncoderInfo();
    }

    public final void setAudioBitrate(int i7) {
        this.encoderConfig.setAudioBitRate(i7);
        if (this.encoderConfig.getAudioBitRate() <= 0) {
            LivePusherLog.e$default(TAG, "audio bit rate set illegal param and set default param : 96000", null, 4, null);
            this.encoderConfig.setAudioBitRate(LiveConstants.AUDIO_BITRATE_96);
        }
    }

    public final void setRenderMode(@NotNull BEGLSurface.RenderMode renderMode) {
        this.encoderConfig.setRenderMode(renderMode);
    }

    public final void setVideoBitRate(int i7) {
        this.encoderConfig.setVideoBitRate(i7);
        if (this.encoderConfig.getVideoBitRate() <= 0) {
            LivePusherLog.e$default(TAG, "video bit rate set illegal param and set default param : 800000", null, 4, null);
            this.encoderConfig.setVideoBitRate(LiveConstants.VIDEO_BITRATE_800);
        }
    }

    public final void setVideoCodecType$BiliLivePushStreaming_release(@NotNull String str) {
        this.videoCodecType = str;
    }

    public final void setVideoFrameRate(int i7) {
        this.encoderConfig.setFrameRate(i7);
        if (this.encoderConfig.getFrameRate() <= 0) {
            LivePusherLog.e$default(TAG, "video frame rate set illegal param and set default param : 25", null, 4, null);
            this.encoderConfig.setFrameRate(25);
        }
    }

    public final void setVideoIFrameInterval(int i7) {
        this.encoderConfig.setIFrameInterval(i7);
        if (this.encoderConfig.getIFrameInterval() <= 0) {
            LivePusherLog.e$default(TAG, "video IFrame interval set illegal param and set default param : 3", null, 4, null);
            this.encoderConfig.setIFrameInterval(3);
        }
    }

    public final void setVideoResolution(int i7) {
        switch (i7) {
            case 0:
                this.encoderConfig.setWidth(360);
                this.encoderConfig.setHeight(640);
                break;
            case 1:
                this.encoderConfig.setWidth(540);
                this.encoderConfig.setHeight(960);
                break;
            case 2:
                this.encoderConfig.setWidth(720);
                this.encoderConfig.setHeight(1280);
                break;
            case 3:
                this.encoderConfig.setWidth(640);
                this.encoderConfig.setHeight(360);
                break;
            case 4:
                this.encoderConfig.setWidth(960);
                this.encoderConfig.setHeight(540);
                break;
            case 5:
                this.encoderConfig.setWidth(1280);
                this.encoderConfig.setHeight(720);
                break;
            case 6:
                this.encoderConfig.setWidth(1080);
                this.encoderConfig.setHeight(1920);
                break;
            case 7:
                this.encoderConfig.setWidth(1920);
                this.encoderConfig.setHeight(1080);
                break;
        }
    }

    public final void setVideoResolution(int i7, int i8) {
        this.encoderConfig.setWidth(i7);
        this.encoderConfig.setHeight(i8);
        if (this.encoderConfig.getWidth() == 0 || this.encoderConfig.getHeight() == 0) {
            LivePusherLog.e$default(TAG, "video resolution set illegal param and set default param : 720 x 1280", null, 4, null);
            this.encoderConfig.setWidth(720);
            this.encoderConfig.setHeight(1280);
        }
    }

    public final boolean useAVCEncoder() {
        this.videoCodecType = LiveConstants.NORMAL_VIDEO_CODEC;
        this.encoderConfig.setMimeType(BiliPushAVCodecUtils.AVC_MIME);
        return true;
    }

    public final boolean useDolbyEncoder(boolean z6) {
        this.videoCodecType = LiveConstants.NORMAL_VIDEO_CODEC;
        this.encoderConfig.setMimeType(BiliPushAVCodecUtils.DOLBY_MIME);
        this.encoderConfig.setUseBiliHEVC(z6);
        return true;
    }

    public final boolean useHEVCEncoder(boolean z6) {
        this.videoCodecType = LiveConstants.NORMAL_VIDEO_CODEC;
        this.encoderConfig.setMimeType(BiliPushAVCodecUtils.HEVC_MIME);
        this.encoderConfig.setUseBiliHEVC(z6);
        return true;
    }

    public final void useOnlyVoicePush() {
        this.videoCodecType = LiveConstants.PURE_VOICE_VIDEO_CODEC;
        this.encoderConfig.setWidth(320);
        this.encoderConfig.setHeight(240);
        this.encoderConfig.setVideoBitRate(LiveConstants.VIDEO_BITRATE_800);
    }

    public final void useTestSpeedPush() {
        this.videoCodecType = LiveConstants.NETWORK_TEST_CODEC;
        this.encoderConfig.setVideoBitRate(LiveConstants.VIDEO_BITRATE_8000);
    }
}
