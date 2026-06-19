package com.bilibili.live.streaming.encoder.video;

import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils;
import com.bilibili.live.streaming.encoder.EncoderConfig;
import com.bilibili.live.streaming.encoder.IVideoEncoderCallback;
import com.bilibili.live.streaming.filter.IVideoSource;
import com.bilibili.mediastreaming.enums.BiliVideoCodec;
import com.bilibili.mediastreaming.packet.BiliVideoEncoderPacket;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/video/NetworkTestEncoder.class */
public final class NetworkTestEncoder implements IVideoEncoder {
    private long encoderGeneratedBytes;

    @Nullable
    private byte[] kfd;

    @Nullable
    private IVideoEncoderCallback mCallback;
    private EncoderConfig mConfig;
    private AVContext mVideoCtx;
    private long videoEncoderDurationUs;
    private long videoOutNum;
    private long videoRenderNum;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final byte[] SPSPPSData = {0, 0, 0, 1, 103, 100, 0, 13, -84, -75, 10, 15, -109, 80, 96, 16, 80, 120, 64, 33, 80, 0, 0, 0, 1, 104, -18, 51, -56, -16, 10};

    @NotNull
    private static final byte[] KEYFRAMEDATA = {0, 0, 1, 101, -120, -124, 31, -1, 29, -32, -1, -97, 83, 64, 0, 0, 3, 0, 28, -24, 46, 117, 107, 96, -5, -128, 0, 0, 3, 0, 0, 3, 0, 0, 3, 0, 0, 12, 25, 0};

    @NotNull
    private volatile AtomicBoolean mIsEncoding = new AtomicBoolean();

    @NotNull
    private final String mCodecName = "AndroidVideoCodec";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/video/NetworkTestEncoder$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final byte[] genFiller(int i7) {
        if (i7 < 4) {
            return new byte[0];
        }
        byte[] bArr = new byte[i7];
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 1;
        bArr[3] = 12;
        for (int i8 = 4; i8 < i7; i8++) {
            bArr[i8] = -1;
        }
        return bArr;
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public boolean beginRenderFrame() {
        return true;
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public void destroy() {
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public void endRenderFrame(long j7) {
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public boolean feedFrame(@Nullable IVideoSource iVideoSource, long j7, int i7) {
        byte[] bArr = this.kfd;
        if (bArr == null) {
            return false;
        }
        this.encoderGeneratedBytes += (long) bArr.length;
        BiliVideoEncoderPacket biliVideoEncoderPacket = new BiliVideoEncoderPacket();
        biliVideoEncoderPacket.codec = BiliVideoCodec.AVC;
        biliVideoEncoderPacket.isKeyFrame = true;
        AVContext aVContext = this.mVideoCtx;
        AVContext aVContext2 = aVContext;
        if (aVContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVideoCtx");
            aVContext2 = null;
        }
        long timeStampUs = aVContext2.getTimeStampUs();
        biliVideoEncoderPacket.ptsUs = timeStampUs;
        biliVideoEncoderPacket.dtsUs = timeStampUs;
        biliVideoEncoderPacket.data = bArr;
        biliVideoEncoderPacket.length = bArr.length;
        biliVideoEncoderPacket.isHeader = false;
        this.videoRenderNum++;
        this.videoOutNum++;
        IVideoEncoderCallback iVideoEncoderCallback = this.mCallback;
        if (iVideoEncoderCallback == null) {
            return true;
        }
        iVideoEncoderCallback.onVideoPacket(biliVideoEncoderPacket, false, this.mCodecName);
        return true;
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public long getDelayUs() {
        return 0L;
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public long getDropRedundanceBytes() {
        return 0L;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public float getEncoderAverageFPS() throws NoWhenBranchMatchedException {
        float f7;
        boolean z6 = this.mIsEncoding.get();
        if (z6) {
            f7 = 0.0f;
        } else {
            if (z6) {
                throw new NoWhenBranchMatchedException();
            }
            f7 = this.videoRenderNum / (this.videoEncoderDurationUs / 1000000.0f);
        }
        return f7;
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public long getEncoderGeneratedBytes() {
        return this.encoderGeneratedBytes;
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public long getVideoInNum() {
        return this.videoRenderNum;
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public long getVideoOutNum() {
        return this.videoOutNum;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public long getVideoWorkDurationUs() throws NoWhenBranchMatchedException {
        long j7;
        boolean z6 = this.mIsEncoding.get();
        if (z6) {
            j7 = 0;
        } else {
            if (z6) {
                throw new NoWhenBranchMatchedException();
            }
            j7 = this.videoEncoderDurationUs;
        }
        return j7;
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public void init(@NotNull AVContext aVContext, @NotNull EncoderConfig encoderConfig, @NotNull IVideoEncoderCallback iVideoEncoderCallback) {
        this.mVideoCtx = aVContext;
        this.mConfig = encoderConfig;
        this.mCallback = iVideoEncoderCallback;
        int videoBitRate = (encoderConfig.getVideoBitRate() / 8) / encoderConfig.getFrameRate();
        byte[] bArr = KEYFRAMEDATA;
        this.kfd = ArraysKt.plus(bArr, genFiller(videoBitRate - bArr.length));
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public void requestKeyFrame() {
        super.requestKeyFrame();
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public void restart(@NotNull Function2<? super Integer, ? super String, Unit> function2) {
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public boolean start() {
        this.mIsEncoding.set(true);
        IVideoEncoderCallback iVideoEncoderCallback = this.mCallback;
        if (iVideoEncoderCallback != null) {
            EncoderConfig encoderConfig = this.mConfig;
            EncoderConfig encoderConfig2 = encoderConfig;
            if (encoderConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig2 = null;
            }
            int width = encoderConfig2.getWidth();
            EncoderConfig encoderConfig3 = this.mConfig;
            EncoderConfig encoderConfig4 = encoderConfig3;
            if (encoderConfig3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig4 = null;
            }
            int height = encoderConfig4.getHeight();
            EncoderConfig encoderConfig5 = this.mConfig;
            EncoderConfig encoderConfig6 = encoderConfig5;
            if (encoderConfig5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig6 = null;
            }
            int frameRate = encoderConfig6.getFrameRate();
            EncoderConfig encoderConfig7 = this.mConfig;
            EncoderConfig encoderConfig8 = encoderConfig7;
            if (encoderConfig7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig8 = null;
            }
            iVideoEncoderCallback.onSendVideoConfig(width, height, frameRate, encoderConfig8.getVideoBitRate(), 0, this.mCodecName, BiliPushAVCodecUtils.AVC_MIME, false);
        }
        IVideoEncoderCallback iVideoEncoderCallback2 = this.mCallback;
        if (iVideoEncoderCallback2 != null) {
            iVideoEncoderCallback2.onVideoConfigPacket(SPSPPSData, this.mCodecName);
        }
        AVContext aVContext = this.mVideoCtx;
        if (aVContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVideoCtx");
            aVContext = null;
        }
        this.videoEncoderDurationUs = aVContext.getTimeStampUs();
        return true;
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public boolean stop() {
        AVContext aVContext = this.mVideoCtx;
        AVContext aVContext2 = aVContext;
        if (aVContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVideoCtx");
            aVContext2 = null;
        }
        this.videoEncoderDurationUs = aVContext2.getTimeStampUs() - this.videoEncoderDurationUs;
        this.mIsEncoding.set(false);
        return true;
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public void updateBitrate(int i7) {
        super.updateBitrate(i7);
    }
}
