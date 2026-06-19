package com.bilibili.live.streaming.encoder.video;

import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.encoder.EncoderConfig;
import com.bilibili.live.streaming.encoder.IVideoEncoderCallback;
import com.bilibili.live.streaming.filter.IVideoSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/video/IVideoEncoder.class */
public interface IVideoEncoder {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/video/IVideoEncoder$DefaultImpls.class */
    public static final class DefaultImpls {
        @Deprecated
        public static void requestKeyFrame(@NotNull IVideoEncoder iVideoEncoder) {
            iVideoEncoder.requestKeyFrame();
        }

        @Deprecated
        public static void updateBitrate(@NotNull IVideoEncoder iVideoEncoder, int i7) {
            iVideoEncoder.updateBitrate(i7);
        }
    }

    static /* synthetic */ boolean feedFrame$default(IVideoEncoder iVideoEncoder, IVideoSource iVideoSource, long j7, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: feedFrame");
        }
        if ((i8 & 4) != 0) {
            i7 = 2;
        }
        return iVideoEncoder.feedFrame(iVideoSource, j7, i7);
    }

    boolean beginRenderFrame();

    void destroy();

    void endRenderFrame(long j7);

    boolean feedFrame(@Nullable IVideoSource iVideoSource, long j7, int i7);

    long getDelayUs();

    long getDropRedundanceBytes();

    float getEncoderAverageFPS();

    long getEncoderGeneratedBytes();

    long getVideoInNum();

    long getVideoOutNum();

    long getVideoWorkDurationUs();

    void init(@NotNull AVContext aVContext, @NotNull EncoderConfig encoderConfig, @NotNull IVideoEncoderCallback iVideoEncoderCallback);

    default void requestKeyFrame() {
    }

    void restart(@NotNull Function2<? super Integer, ? super String, Unit> function2);

    boolean start();

    boolean stop();

    default void updateBitrate(int i7) {
    }
}
