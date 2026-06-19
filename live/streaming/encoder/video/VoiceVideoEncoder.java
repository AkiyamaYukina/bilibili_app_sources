package com.bilibili.live.streaming.encoder.video;

import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils;
import com.bilibili.live.streaming.encoder.EncoderConfig;
import com.bilibili.live.streaming.encoder.IVideoEncoderCallback;
import com.bilibili.live.streaming.filter.IVideoSource;
import com.bilibili.mediastreaming.enums.BiliVideoCodec;
import com.bilibili.mediastreaming.packet.BiliVideoEncoderPacket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/video/VoiceVideoEncoder.class */
public final class VoiceVideoEncoder implements IVideoEncoder {

    @NotNull
    private static final String TAG = "VoiceVideoEncoder";

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
    private static final List<byte[]> videoFrameData = CollectionsKt.mutableListOf((Object[]) new byte[]{new byte[]{0, 0, 0, 1, 101, -72, 64, -17, -51, -8, 30, -25, -25, 77, 24, -107, -40, -1, -33, 54, 78, 121, -21, -67, -49, -59, 102, -32, 95, -108, 82, 31, -30, 121, -128, 0, 13, 81, 82, -6, -126, -20, 42, -57, 124, 71, 104, 2, 90, 0, 0, 108, -122, 117, 115, 58, -118, 85, -58, 122, -2, 34, 2, 10}, new byte[]{0, 0, 0, 1, 97, -29, -85, -115, -1, -28, 64, 0, 11, -72, 10}, new byte[]{0, 0, 0, 1, 97, -27, -85, -123, 127, -4, -124, 0, 0, -54, -128, 10}, new byte[]{0, 0, 0, 1, 97, -25, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -23, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -21, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -19, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -17, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -15, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -13, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -11, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -9, -85, -124, 127, -6, 88, 0, 1, -115, 10}, new byte[]{0, 0, 0, 1, 97, -7, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -5, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -3, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -1, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -31, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -29, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -27, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -25, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -23, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -21, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -19, -85, -124, 127, -6, 88, 0, 1, -115, 10}, new byte[]{0, 0, 0, 1, 97, -17, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -15, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -13, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -11, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -9, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -7, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -5, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -3, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -1, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -31, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -29, -85, -124, 127, -6, 88, 0, 1, -115, 10}, new byte[]{0, 0, 0, 1, 97, -27, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -25, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -23, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -21, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -19, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -17, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -15, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -13, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -11, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -9, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -7, -85, -124, 127, -6, 88, 0, 1, -115, 10}, new byte[]{0, 0, 0, 1, 97, -5, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -3, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -1, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -31, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -29, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -27, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -25, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -23, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -21, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -19, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -17, -85, -124, 127, -6, 88, 0, 1, -115, 10}, new byte[]{0, 0, 0, 1, 97, -15, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -13, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -11, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -9, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -7, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -5, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -3, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -1, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -31, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -29, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -27, -85, -124, 127, -6, 88, 0, 1, -115, 10}, new byte[]{0, 0, 0, 1, 97, -25, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -23, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -21, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -19, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -17, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -15, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -13, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}, new byte[]{0, 0, 0, 1, 97, -11, -85, -121, 127, -2, -116, -80, 0, 3, 106, 10}});

    @NotNull
    private static final String SLICE_TYPE_I = "I";

    @NotNull
    private String mCodecName = "AndroidVideoCodecAVC";

    @NotNull
    private volatile AtomicBoolean mIsEncoding = new AtomicBoolean();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/video/VoiceVideoEncoder$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final ArrayList<BiliVideoEncoderPacket> getSendVideoPacket(long j7) {
        long j8 = this.videoRenderNum;
        List<byte[]> list = videoFrameData;
        boolean z6 = ((int) (j8 % ((long) list.size()))) == 0;
        byte[] bArr = list.get((int) (this.videoRenderNum % ((long) list.size())));
        BiliVideoEncoderPacket biliVideoEncoderPacket = new BiliVideoEncoderPacket();
        biliVideoEncoderPacket.codec = BiliVideoCodec.AVC;
        biliVideoEncoderPacket.data = bArr;
        biliVideoEncoderPacket.length = bArr.length;
        biliVideoEncoderPacket.dtsUs = 0L;
        biliVideoEncoderPacket.ptsUs = j7;
        biliVideoEncoderPacket.isHeader = false;
        biliVideoEncoderPacket.isKeyFrame = z6;
        ArrayList<BiliVideoEncoderPacket> arrayList = new ArrayList<>();
        arrayList.add(biliVideoEncoderPacket);
        return arrayList;
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
        for (BiliVideoEncoderPacket biliVideoEncoderPacket : getSendVideoPacket(j7)) {
            IVideoEncoderCallback iVideoEncoderCallback = this.mCallback;
            if (iVideoEncoderCallback != null) {
                iVideoEncoderCallback.onVideoPacket(biliVideoEncoderPacket, true, this.mCodecName);
            }
        }
        this.videoRenderNum++;
        this.videoOutNum++;
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
        return 0L;
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
            int videoBitRate = encoderConfig8.getVideoBitRate();
            EncoderConfig encoderConfig9 = this.mConfig;
            EncoderConfig encoderConfig10 = encoderConfig9;
            if (encoderConfig9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig10 = null;
            }
            iVideoEncoderCallback.onSendVideoConfig(width, height, frameRate, videoBitRate, encoderConfig10.getBFrameDelayFrames(), this.mCodecName, BiliPushAVCodecUtils.AVC_MIME, false);
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
