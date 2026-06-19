package com.bilibili.live.streaming;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/PushManager.class */
public final class PushManager {
    private float audioEncoderDurationS;

    @NotNull
    private final AVContext avContext;
    private long averageLocalDelayUs;
    private long dropRedundanceBytes;
    private long encoderGeneratedBytes;
    private volatile long frameNum;

    @NotNull
    private final RenderPipeLine pipeLine;

    @Nullable
    private Integer postRenderTaskId;

    @Nullable
    private Integer postTickTaskId;

    @Nullable
    private Integer preRenderTaskId;
    private long preRenderTimeMs;

    @Nullable
    private Integer preTickTaskId;
    private long preTickTimeMs;
    private long renderTimesMs;
    private long tickTimesMs;
    private float videoEncoderAverageFPS;
    private long videoEncoderDurationUs;

    public PushManager(@NotNull AVContext aVContext, @NotNull RenderPipeLine renderPipeLine) {
        this.avContext = aVContext;
        this.pipeLine = renderPipeLine;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startDataStatistics$lambda$0(PushManager pushManager, long j7) {
        pushManager.preTickTimeMs = SystemClock.uptimeMillis();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startDataStatistics$lambda$1(PushManager pushManager, long j7) {
        pushManager.frameNum++;
        pushManager.tickTimesMs = (SystemClock.uptimeMillis() - pushManager.preTickTimeMs) + pushManager.tickTimesMs;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startDataStatistics$lambda$2(PushManager pushManager, long j7) {
        pushManager.preRenderTimeMs = SystemClock.uptimeMillis();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startDataStatistics$lambda$3(PushManager pushManager, long j7) {
        pushManager.renderTimesMs = (SystemClock.uptimeMillis() - pushManager.preRenderTimeMs) + pushManager.renderTimesMs;
        return Unit.INSTANCE;
    }

    public final float getAudioDurationS() {
        return this.audioEncoderDurationS;
    }

    public final float getAudioEncoderDurationS$BiliLivePushStreaming_release() {
        return this.audioEncoderDurationS;
    }

    public final long getAverageLocalDelayUs() {
        return this.averageLocalDelayUs;
    }

    public final long getAverageLocalDelayUs$BiliLivePushStreaming_release() {
        return this.averageLocalDelayUs;
    }

    public final long getDropRedundanceBytes() {
        return this.dropRedundanceBytes;
    }

    public final long getDropRedundanceBytes$BiliLivePushStreaming_release() {
        return this.dropRedundanceBytes;
    }

    public final long getEncoderGeneratedBytes() {
        return this.encoderGeneratedBytes;
    }

    public final long getEncoderGeneratedBytes$BiliLivePushStreaming_release() {
        return this.encoderGeneratedBytes;
    }

    public final long getFrameNum() {
        return this.frameNum;
    }

    public final float getPerCameraProcessTimeMs() {
        return (this.avContext.getBeautyProcessTotalTime() * 1.0f) / this.frameNum;
    }

    public final float getPerRenderTimeMs() {
        return (this.renderTimesMs * 1.0f) / this.frameNum;
    }

    public final float getPerTickTimeMs() {
        return (this.tickTimesMs * 1.0f) / this.frameNum;
    }

    public final float getVideoEncoderAverageFPS() {
        return this.videoEncoderAverageFPS;
    }

    public final float getVideoEncoderAverageFPS$BiliLivePushStreaming_release() {
        return this.videoEncoderAverageFPS;
    }

    public final long getVideoEncoderDurationUs() {
        return this.videoEncoderDurationUs;
    }

    public final long getVideoEncoderDurationUs$BiliLivePushStreaming_release() {
        return this.videoEncoderDurationUs;
    }

    public final void setAudioEncoderDurationS$BiliLivePushStreaming_release(float f7) {
        this.audioEncoderDurationS = f7;
    }

    public final void setAverageLocalDelayUs$BiliLivePushStreaming_release(long j7) {
        this.averageLocalDelayUs = j7;
    }

    public final void setDropRedundanceBytes$BiliLivePushStreaming_release(long j7) {
        this.dropRedundanceBytes = j7;
    }

    public final void setEncoderGeneratedBytes$BiliLivePushStreaming_release(long j7) {
        this.encoderGeneratedBytes = j7;
    }

    public final void setVideoEncoderAverageFPS$BiliLivePushStreaming_release(float f7) {
        this.videoEncoderAverageFPS = f7;
    }

    public final void setVideoEncoderDurationUs$BiliLivePushStreaming_release(long j7) {
        this.videoEncoderDurationUs = j7;
    }

    public final void startDataStatistics$BiliLivePushStreaming_release() {
        this.preTickTaskId = Integer.valueOf(this.pipeLine.getPreTickEvent().register(new Function1(this) { // from class: com.bilibili.live.streaming.M

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PushManager f65196a;

            {
                this.f65196a = this;
            }

            public final Object invoke(Object obj) {
                return PushManager.startDataStatistics$lambda$0(this.f65196a, ((Long) obj).longValue());
            }
        }));
        this.postTickTaskId = Integer.valueOf(this.pipeLine.getPostTickEvent().register(new com.bilibili.app.comment3.ui.view.c(this, 1)));
        this.preRenderTaskId = Integer.valueOf(this.pipeLine.getPreRenderEvent().register(new C80.f(this, 4)));
        this.postRenderTaskId = Integer.valueOf(this.pipeLine.getPostRenderEvent().register(new Tc.f(this, 2)));
    }

    public final void stopDataStatistics$BiliLivePushStreaming_release() {
        Integer num = this.preTickTaskId;
        if (num != null) {
            this.pipeLine.getPreTickEvent().unregister(num.intValue());
            this.preTickTaskId = null;
        }
        Integer num2 = this.postTickTaskId;
        if (num2 != null) {
            this.pipeLine.getPostTickEvent().unregister(num2.intValue());
            this.postTickTaskId = null;
        }
        Integer num3 = this.preRenderTaskId;
        if (num3 != null) {
            this.pipeLine.getPreRenderEvent().unregister(num3.intValue());
            this.preRenderTaskId = null;
        }
        Integer num4 = this.postRenderTaskId;
        if (num4 != null) {
            this.pipeLine.getPostRenderEvent().unregister(num4.intValue());
            this.postRenderTaskId = null;
        }
    }
}
