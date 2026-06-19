package com.bilibili.live.streaming.encoder.video;

import Vn.A;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import androidx.appcompat.widget.C3259x;
import androidx.compose.foundation.gestures.C3392f;
import androidx.core.os.EnvironmentCompat;
import androidx.fragment.app.C;
import androidx.fragment.app.z;
import com.bilibili.app.authorspace.helpers.o;
import com.bilibili.app.comment3.ui.widget.m;
import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.VideoUtils;
import com.bilibili.live.streaming.encoder.AsyncEncoderUtil;
import com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils;
import com.bilibili.live.streaming.encoder.EncoderConfig;
import com.bilibili.live.streaming.encoder.IVideoEncoderCallback;
import com.bilibili.live.streaming.encoder.MediaCodecPair;
import com.bilibili.live.streaming.encoder.VideoEncodeState;
import com.bilibili.live.streaming.filter.IVideoSource;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BEGLCurrentState;
import com.bilibili.live.streaming.gl.BEGLSurface;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLFramebuffer;
import com.bilibili.live.streaming.gl.BGLP010Conversion;
import com.bilibili.live.streaming.gl.BGLTexture;
import com.bilibili.live.streaming.gl.BGLUtil;
import com.bilibili.live.streaming.gl.ConversionResult;
import com.bilibili.live.streaming.log.BiliPushLogger;
import com.bilibili.live.streaming.log.IBiliPushLogger;
import com.bilibili.live.streaming.log.LivePusherLog;
import com.bilibili.live.streaming.utils.ExtMethodsKt;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/video/VideoEncoderV2.class */
public final class VideoEncoderV2 implements IVideoEncoder, IBiliPushLogger {
    private static final int ACTION_RE_START = 2;
    private static final int ACTION_START = 1;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String DRAIN_THREAD_NAME = "video_encode_drain";
    private static final long ENCODE_TIMEOUT_USEC = 200000;

    @NotNull
    private static final String FEED_THREAD_NAME = "video_encode_feed";

    @NotNull
    private static final String TAG = "VideoEncoderV2";
    private long dropRedundanceBytes;
    private long encoderGeneratedBytes;

    @NotNull
    private final VideoEncoderV2$handler$1 handler;
    private boolean isBFrameExists;

    @Nullable
    private final Looper looper;

    @Nullable
    private BEGLSurface mBEGLSurface;
    private MediaCodec.BufferInfo mBufferInfo;

    @Nullable
    private BGLTexture mBufferTexture;

    @Nullable
    private IVideoEncoderCallback mCallback;
    private EncoderConfig mConfig;

    @Nullable
    private DrainEncoderThread mDrainThread;

    @Nullable
    private BGLFramebuffer mFramebuffer;

    @Nullable
    private Surface mInputSurface;

    @Nullable
    private BGLP010Conversion mP010Context;
    private long mP010WaitResultMs;

    @Nullable
    private Handler mRenderHandler;
    private int mRenderHeight;
    private int mRenderWidth;
    private AVContext mVideoCtx;
    private int mVideoSetBitrate;
    private int mVideoUpdateBitrate;
    private long videoEncoderDurationUs;
    private long videoOutNum;
    private long videoRenderNum;
    private final BiliPushLogger $$delegate_0 = new BiliPushLogger(TAG);

    @NotNull
    private ConcurrentLinkedQueue<MediaCodecPair> mEncoderList = new ConcurrentLinkedQueue<>();
    private boolean mIsSurfaceInput = true;

    @NotNull
    private volatile AtomicBoolean mIsEncoding = new AtomicBoolean();

    @NotNull
    private AtomicLong markSignalEndTime = new AtomicLong(0);

    @NotNull
    private String mCodecName = "AndroidVideoHardwareCodec";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/video/VideoEncoderV2$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/video/VideoEncoderV2$DrainEncoderThread.class */
    public final class DrainEncoderThread extends Thread {

        @NotNull
        private AtomicBoolean keepAlive;
        final VideoEncoderV2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DrainEncoderThread(@NotNull VideoEncoderV2 videoEncoderV2, String str) {
            super(str);
            this.this$0 = videoEncoderV2;
            this.keepAlive = new AtomicBoolean(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void run$lambda$0(MediaCodecPair mediaCodecPair, MediaCodecPair mediaCodecPair2) {
            try {
                if (mediaCodecPair != null) {
                    try {
                        try {
                            AsyncEncoderUtil async = mediaCodecPair.getAsync();
                            if (async != null) {
                                async.destroy();
                            }
                        } catch (IllegalStateException e7) {
                            LivePusherLog.w(VideoEncoderV2.TAG, "cur encoder is the Released state.", e7);
                        }
                    } catch (Exception e8) {
                        LivePusherLog.e(VideoEncoderV2.TAG, "other exception: ", e8);
                    }
                }
                mediaCodecPair2.getEncoder().stop();
            } finally {
                mediaCodecPair2.getEncoder().release();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            LivePusherLog.i$default(VideoEncoderV2.TAG, "drainEncoder start", null, 4, null);
            while (this.keepAlive.get()) {
                MediaCodecPair mediaCodecPair = (MediaCodecPair) this.this$0.mEncoderList.peek();
                if (mediaCodecPair != null) {
                    MediaFormat mediaFormat = mediaCodecPair.getMediaFormat();
                    LivePusherLog.i$default(VideoEncoderV2.TAG, "current encoder:" + mediaCodecPair.getEncoder().hashCode() + ", outputFormat:" + mediaFormat, null, 4, null);
                    LivePusherLog.i$default(VideoEncoderV2.TAG, "drainOneEncode---------------", null, 4, null);
                    this.this$0.mIsEncoding.set(true);
                    this.this$0.mCodecName = mediaCodecPair.getEncoder().getCodecInfo().getName();
                    this.this$0.flushVideoConfig(mediaFormat);
                    this.this$0.resetVideoBitrate();
                    this.this$0.drainOneEncode(mediaCodecPair);
                    MediaCodecPair mediaCodecPair2 = (MediaCodecPair) this.this$0.mEncoderList.poll();
                    LivePusherLog.i$default(VideoEncoderV2.TAG, com.bilibili.app.comm.rubick.common.g.b(mediaCodecPair2 != null ? Integer.valueOf(mediaCodecPair2.hashCode()) : null, "poll codec "), null, 4, null);
                    this.this$0.mRenderHandler.post(new o(1, mediaCodecPair2, mediaCodecPair));
                }
            }
            LivePusherLog.i$default(VideoEncoderV2.TAG, "drainEncoder end", null, 4, null);
        }

        public final void stopEncoder() {
            this.keepAlive.set(false);
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [com.bilibili.live.streaming.encoder.video.VideoEncoderV2$handler$1] */
    public VideoEncoderV2(@Nullable Looper looper) {
        this.looper = looper;
        final Looper looperMyLooper = looper == null ? Looper.myLooper() : looper;
        this.handler = new Handler(this, looperMyLooper) { // from class: com.bilibili.live.streaming.encoder.video.VideoEncoderV2$handler$1
            final VideoEncoderV2 this$0;

            {
                this.this$0 = this;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) throws Throwable {
                int i7 = message.what;
                if (i7 == 1) {
                    this.this$0.realStart();
                } else {
                    if (i7 != 2) {
                        return;
                    }
                    this.this$0.realRestart((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(message.obj, 2));
                }
            }
        };
    }

    private final MediaCodecPair createEncoder() throws Throwable {
        EncoderConfig encoderConfig = this.mConfig;
        EncoderConfig encoderConfig2 = encoderConfig;
        if (encoderConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConfig");
            encoderConfig2 = null;
        }
        LivePusherLog.i$default(TAG, "createEncoder " + encoderConfig2, null, 4, null);
        EncoderConfig encoderConfig3 = this.mConfig;
        EncoderConfig encoderConfig4 = encoderConfig3;
        if (encoderConfig3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConfig");
            encoderConfig4 = null;
        }
        String mimeType = encoderConfig4.getMimeType();
        try {
            BiliPushAVCodecUtils biliPushAVCodecUtils = BiliPushAVCodecUtils.INSTANCE;
            EncoderConfig encoderConfig5 = this.mConfig;
            EncoderConfig encoderConfig6 = encoderConfig5;
            if (encoderConfig5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig6 = null;
            }
            MediaCodecPair mediaCodecPairCreateEncoder = biliPushAVCodecUtils.createEncoder(encoderConfig6);
            if (mediaCodecPairCreateEncoder == null) {
                String strA = android.support.v4.media.a.a("createEncoder:", mimeType, " fail!, encoder is null!");
                LivePusherLog.e$default(TAG, strA, null, 4, null);
                IVideoEncoderCallback iVideoEncoderCallback = this.mCallback;
                if (iVideoEncoderCallback == null) {
                    return null;
                }
                iVideoEncoderCallback.onVideoEncoderState(VideoEncodeState.UNINITIALIZED, strA);
                return null;
            }
            try {
                int integer = mediaCodecPairCreateEncoder.getMediaFormat().getInteger("color-format");
                if (integer == 21 || integer == 54) {
                    this.mIsSurfaceInput = false;
                } else if (integer == 2130708361) {
                    this.mIsSurfaceInput = true;
                }
                mediaCodecPairCreateEncoder.getEncoder().configure(mediaCodecPairCreateEncoder.getMediaFormat(), (Surface) null, (MediaCrypto) null, 1);
                return mediaCodecPairCreateEncoder;
            } catch (Exception e7) {
                String str = "encoder:" + mimeType + " config fail!, config format:" + mediaCodecPairCreateEncoder.getMediaFormat() + " message:" + e7.getMessage();
                LivePusherLog.e$default(TAG, str, null, 4, null);
                IVideoEncoderCallback iVideoEncoderCallback2 = this.mCallback;
                if (iVideoEncoderCallback2 != null) {
                    iVideoEncoderCallback2.onVideoEncoderState(VideoEncodeState.UNINITIALIZED, str);
                }
                mediaCodecPairCreateEncoder.getEncoder().release();
                return null;
            }
        } catch (Exception e8) {
            String strA2 = z.a("createEncoder:", mimeType, " fail!, exception message:", e8.getMessage());
            LivePusherLog.e$default(TAG, strA2, null, 4, null);
            IVideoEncoderCallback iVideoEncoderCallback3 = this.mCallback;
            if (iVideoEncoderCallback3 == null) {
                return null;
            }
            iVideoEncoderCallback3.onVideoEncoderState(VideoEncodeState.UNINITIALIZED, strA2);
            return null;
        }
    }

    private final void createInputSurface(MediaCodecPair mediaCodecPair) throws Exception {
        try {
            MediaFormat inputFormat = mediaCodecPair.getEncoder().getInputFormat();
            this.mRenderWidth = inputFormat.getInteger("width");
            this.mRenderHeight = inputFormat.getInteger("height");
            EncoderConfig encoderConfig = null;
            if (this.mIsSurfaceInput) {
                this.mInputSurface = mediaCodecPair.getEncoder().createInputSurface();
                AVContext aVContext = this.mVideoCtx;
                AVContext aVContext2 = aVContext;
                if (aVContext == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVideoCtx");
                    aVContext2 = null;
                }
                BEGLContext eglContext = aVContext2.getEglContext();
                BEGLSurface bEGLSurfaceCreateSurface = null;
                if (eglContext != null) {
                    Surface surface = this.mInputSurface;
                    EncoderConfig encoderConfig2 = this.mConfig;
                    if (encoderConfig2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                        encoderConfig2 = null;
                    }
                    bEGLSurfaceCreateSurface = eglContext.createSurface(surface, encoderConfig2.getRenderMode());
                }
                this.mBEGLSurface = bEGLSurfaceCreateSurface;
                return;
            }
            int integer = inputFormat.getInteger("slice-height");
            int integer2 = inputFormat.getInteger("stride");
            AVContext aVContext3 = this.mVideoCtx;
            AVContext aVContext4 = aVContext3;
            if (aVContext3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVideoCtx");
                aVContext4 = null;
            }
            BEGLContext eglContext2 = aVContext4.getEglContext();
            BEGLSurface bEGLSurface = null;
            if (eglContext2 != null) {
                BEGLSurface bEGLSurfaceCreateSurface2 = eglContext2.createSurface(1, 1);
                bEGLSurface = null;
                if (bEGLSurfaceCreateSurface2 != null) {
                    BEGLCurrentState bEGLCurrentStateSave = BEGLCurrentState.save();
                    bEGLSurfaceCreateSurface2.makeCurrent();
                    BGLUtil.clearErrors();
                    BGLTexture bGLTextureCreateTex2D = BGLTexture.createTex2D();
                    bGLTextureCreateTex2D.bind();
                    bGLTextureCreateTex2D.applySamplerParam();
                    this.mFramebuffer = bGLTextureCreateTex2D.createFramebuffer(this.mRenderWidth, this.mRenderHeight, true);
                    bGLTextureCreateTex2D.unbind();
                    this.mBufferTexture = bGLTextureCreateTex2D;
                    BGLP010Conversion bGLP010Conversion = this.mP010Context;
                    if (bGLP010Conversion != null) {
                        bGLP010Conversion.destroy();
                    }
                    BGLP010Conversion bGLP010Conversion2 = new BGLP010Conversion();
                    AVContext aVContext5 = this.mVideoCtx;
                    if (aVContext5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mVideoCtx");
                        aVContext5 = null;
                    }
                    int i7 = this.mRenderWidth;
                    int i8 = this.mRenderHeight;
                    int i9 = integer2 / 4;
                    EncoderConfig encoderConfig3 = this.mConfig;
                    if (encoderConfig3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                    } else {
                        encoderConfig = encoderConfig3;
                    }
                    bGLP010Conversion2.init(aVContext5, i7, i8, i9, integer, BEGLSurface.isHDR(encoderConfig.getRenderMode()) ? BGLP010Conversion.Mode.P010 : BGLP010Conversion.Mode.NV12);
                    this.mP010Context = bGLP010Conversion2;
                    bEGLCurrentStateSave.restore();
                    bEGLSurface = bEGLSurfaceCreateSurface2;
                }
            }
            this.mBEGLSurface = bEGLSurface;
        } catch (BGLException e7) {
            LivePusherLog.w(TAG, "createInputSurface exception, message:" + e7.getMessage(), e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02af, code lost:
    
        com.bilibili.live.streaming.log.LivePusherLog.w$default(com.bilibili.live.streaming.encoder.video.VideoEncoderV2.TAG, "MediaCodec.BUFFER_FLAG_END_OF_STREAM", null, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02bc, code lost:
    
        r0.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02c2, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02c4, code lost:
    
        com.bilibili.live.streaming.log.LivePusherLog.e(com.bilibili.live.streaming.encoder.video.VideoEncoderV2.TAG, "drainOneEncode flush exception: " + r14.getMessage(), r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drainOneEncode(com.bilibili.live.streaming.encoder.MediaCodecPair r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.encoder.video.VideoEncoderV2.drainOneEncode(com.bilibili.live.streaming.encoder.MediaCodecPair):void");
    }

    private static final Unit drainOneEncode$lambda$15(VideoEncoderV2 videoEncoderV2, MediaCodec mediaCodec, Ref.BooleanRef booleanRef) {
        IVideoEncoderCallback iVideoEncoderCallback = videoEncoderV2.mCallback;
        if (iVideoEncoderCallback != null) {
            iVideoEncoderCallback.onVideoConfigPacket(VideoEncoderUtilKt.getHead(mediaCodec.getOutputFormat()), videoEncoderV2.mCodecName);
        }
        booleanRef.element = true;
        return Unit.INSTANCE;
    }

    private static final boolean drainOneEncode$lambda$16(VideoEncoderV2 videoEncoderV2) {
        if (videoEncoderV2.mIsEncoding.get() || videoEncoderV2.markSignalEndTime.get() <= 0) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j7 = videoEncoderV2.markSignalEndTime.get();
        EncoderConfig encoderConfig = videoEncoderV2.mConfig;
        EncoderConfig encoderConfig2 = encoderConfig;
        if (encoderConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConfig");
            encoderConfig2 = null;
        }
        if (jUptimeMillis - j7 < encoderConfig2.getSignalEndTimeOutMs()) {
            return false;
        }
        EncoderConfig encoderConfig3 = videoEncoderV2.mConfig;
        EncoderConfig encoderConfig4 = encoderConfig3;
        if (encoderConfig3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConfig");
            encoderConfig4 = null;
        }
        LivePusherLog.w$default(TAG, C3392f.a(encoderConfig4.getSignalEndTimeOutMs(), "drainOneEncode exit for timeout after ", "ms of signalEndOfInputStream"), null, 4, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endRenderFrame$lambda$10$lambda$9(BGLP010Conversion.ConversionContext conversionContext, VideoEncoderV2 videoEncoderV2, Ref.LongRef longRef, BGLP010Conversion bGLP010Conversion, MediaCodecPair mediaCodecPair) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final ConversionResult result = conversionContext.getResult();
        if (SystemClock.elapsedRealtime() - jElapsedRealtime < 2) {
            videoEncoderV2.mP010WaitResultMs = (long) (((longRef.element - 1) * 0.2d) + (videoEncoderV2.mP010WaitResultMs * 0.8d));
        } else {
            videoEncoderV2.mP010WaitResultMs = (long) (((r0 + longRef.element) * 0.2d) + (videoEncoderV2.mP010WaitResultMs * 0.8d));
        }
        if (result != null) {
            mediaCodecPair.getAsync().queueInput(new Function3(result) { // from class: com.bilibili.live.streaming.encoder.video.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ConversionResult f65315a;

                {
                    this.f65315a = result;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return VideoEncoderV2.endRenderFrame$lambda$10$lambda$9$lambda$8(this.f65315a, (MediaCodec) obj, ((Integer) obj2).intValue(), (Function0) obj3);
                }
            });
        } else {
            LivePusherLog.e$default(TAG, "wait p010 read back timeout", null, 4, null);
            bGLP010Conversion.releaseConversionContext(conversionContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit endRenderFrame$lambda$10$lambda$9$lambda$8(ConversionResult conversionResult, MediaCodec mediaCodec, int i7, Function0 function0) {
        if (i7 >= 0) {
            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i7);
            inputBuffer.position(0);
            mediaCodec.queueInputBuffer(i7, 0, conversionResult.store(inputBuffer), ((Long) conversionResult.getOpaque()).longValue(), 0);
        }
        conversionResult.release();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit feedFrame$lambda$11(VideoEncoderV2 videoEncoderV2, IVideoSource iVideoSource, int i7, long j7, Ref.BooleanRef booleanRef) {
        if (videoEncoderV2.beginRenderFrame()) {
            AVContext aVContext = videoEncoderV2.mVideoCtx;
            AVContext aVContext2 = aVContext;
            if (aVContext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVideoCtx");
                aVContext2 = null;
            }
            aVContext2.waitTickFinish();
            VideoUtils.Companion companion = VideoUtils.Companion;
            AVContext aVContext3 = videoEncoderV2.mVideoCtx;
            if (aVContext3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVideoCtx");
                aVContext3 = null;
            }
            VideoUtils.Companion.renderSource$default(companion, aVContext3, 0, 0, videoEncoderV2.mRenderWidth, videoEncoderV2.mRenderHeight, iVideoSource, 1, i7, null, 256, null);
            videoEncoderV2.endRenderFrame(j7);
            booleanRef.element = true;
        } else {
            booleanRef.element = false;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushVideoConfig(MediaFormat mediaFormat) {
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        int integer3 = mediaFormat.getInteger("frame-rate");
        int integer4 = mediaFormat.getInteger("bitrate");
        IBiliPushLogger.logInfo$default(this, C.a(integer3, integer4, ", bitrate:", A.b(integer, integer2, "update metadata, w:", ", h:", ", framerate:")), null, null, null, 14, null);
        IVideoEncoderCallback iVideoEncoderCallback = this.mCallback;
        if (iVideoEncoderCallback != null) {
            EncoderConfig encoderConfig = this.mConfig;
            EncoderConfig encoderConfig2 = encoderConfig;
            if (encoderConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig2 = null;
            }
            int bFrameDelayFrames = encoderConfig2.getBFrameDelayFrames();
            String str = this.mCodecName;
            EncoderConfig encoderConfig3 = this.mConfig;
            EncoderConfig encoderConfig4 = encoderConfig3;
            if (encoderConfig3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig4 = null;
            }
            String mimeType = encoderConfig4.getMimeType();
            EncoderConfig encoderConfig5 = this.mConfig;
            if (encoderConfig5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig5 = null;
            }
            iVideoEncoderCallback.onSendVideoConfig(integer, integer2, integer3, integer4, bFrameDelayFrames, str, mimeType, !encoderConfig5.getUseBiliHEVC());
        }
    }

    private final void ifNeedStartDrainThread() {
        if (this.mDrainThread == null) {
            DrainEncoderThread drainEncoderThread = new DrainEncoderThread(this, DRAIN_THREAD_NAME);
            this.mDrainThread = drainEncoderThread;
            drainEncoderThread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void realRestart(Function2<? super Integer, ? super String, Unit> function2) {
        if (startNewEncoder()) {
            function2.invoke(0, "RestartEncoder Successful");
        } else {
            function2.invoke(-1, "RestartEncoder Failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean realStart() throws Throwable {
        AVContext aVContext = null;
        LivePusherLog.i$default(TAG, "isEncoding:" + this.mIsEncoding, null, 4, null);
        if (this.mIsEncoding.get()) {
            return true;
        }
        try {
            this.mEncoderList.isEmpty();
            boolean zStartNewEncoder = startNewEncoder();
            AVContext aVContext2 = this.mVideoCtx;
            if (aVContext2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVideoCtx");
            } else {
                aVContext = aVContext2;
            }
            this.videoEncoderDurationUs = aVContext.getTimeStampUs();
            return zStartNewEncoder;
        } catch (Exception e7) {
            LivePusherLog.e(TAG, "start exception: ", e7);
            return false;
        }
    }

    private final void releaseInputSurface() throws BGLException {
        BEGLSurface bEGLSurface = this.mBEGLSurface;
        if (bEGLSurface != null) {
            bEGLSurface.makeCurrent();
            BGLFramebuffer bGLFramebuffer = this.mFramebuffer;
            if (bGLFramebuffer != null) {
                bGLFramebuffer.destroy();
            }
            this.mFramebuffer = null;
            BGLTexture bGLTexture = this.mBufferTexture;
            if (bGLTexture != null) {
                bGLTexture.destroy();
            }
            this.mBufferTexture = null;
            Surface surface = this.mInputSurface;
            if (surface != null) {
                surface.release();
            }
            this.mInputSurface = null;
            BGLP010Conversion bGLP010Conversion = this.mP010Context;
            if (bGLP010Conversion != null) {
                bGLP010Conversion.destroy();
            }
            this.mP010Context = null;
            bEGLSurface.makeCurrentNull();
            bEGLSurface.destroy();
        }
        this.mBEGLSurface = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NotImplementedError */
    private final void releaseLastReStartCodec(MediaCodecPair mediaCodecPair, MediaCodecPair mediaCodecPair2) throws NotImplementedError {
        MediaCodec encoder;
        if (mediaCodecPair2 != null) {
            signalEndOfInputStream(mediaCodecPair2);
            this.mIsEncoding.set(false);
        }
        if (mediaCodecPair != null) {
            try {
                MediaCodec encoder2 = mediaCodecPair.getEncoder();
                if (encoder2 != null) {
                    encoder2.start();
                }
            } catch (Exception e7) {
                if (mediaCodecPair != null && (encoder = mediaCodecPair.getEncoder()) != null) {
                    encoder.release();
                }
                String str = "retry encoder start fail, WTF ??? , exception:" + e7.getMessage();
                LivePusherLog.e(TAG, str, e7);
                IVideoEncoderCallback iVideoEncoderCallback = this.mCallback;
                if (iVideoEncoderCallback != null) {
                    iVideoEncoderCallback.onVideoEncoderState(VideoEncodeState.START_ERROR, str);
                    return;
                }
                return;
            }
        }
        this.mEncoderList.offer(mediaCodecPair);
    }

    private final void resetInputSurface(MediaCodecPair mediaCodecPair) throws Exception {
        Handler handler = this.mRenderHandler;
        if (handler != null) {
            ExtMethodsKt.invoke(handler, new m(1, this, mediaCodecPair));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resetInputSurface$lambda$2(VideoEncoderV2 videoEncoderV2, MediaCodecPair mediaCodecPair) throws Exception {
        videoEncoderV2.releaseInputSurface();
        videoEncoderV2.createInputSurface(mediaCodecPair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetVideoBitrate() {
        this.mVideoSetBitrate = 0;
        this.mVideoUpdateBitrate = 0;
    }

    private final void setEncoderInfo() {
        MediaCodecPair mediaCodecPairPeek = this.mEncoderList.peek();
        if (mediaCodecPairPeek == null) {
            return;
        }
        try {
            LivePusherLog.i$default(TAG, "set codecName", null, 4, null);
            EncoderConfig encoderConfig = this.mConfig;
            EncoderConfig encoderConfig2 = encoderConfig;
            if (encoderConfig == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig2 = null;
            }
            encoderConfig2.getVideoEncoderInfo().setCodecName(this.mCodecName);
            MediaFormat mediaFormat = mediaCodecPairPeek.getMediaFormat();
            EncoderConfig encoderConfig3 = this.mConfig;
            EncoderConfig encoderConfig4 = encoderConfig3;
            if (encoderConfig3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig4 = null;
            }
            encoderConfig4.getVideoEncoderInfo().setBFrameEnable(this.isBFrameExists);
            EncoderConfig encoderConfig5 = this.mConfig;
            EncoderConfig encoderConfig6 = encoderConfig5;
            if (encoderConfig5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig6 = null;
            }
            LivePusherLog.i$default(TAG, "mimeType: " + encoderConfig6.getMimeType(), null, 4, null);
            EncoderConfig encoderConfig7 = this.mConfig;
            EncoderConfig encoderConfig8 = encoderConfig7;
            if (encoderConfig7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig8 = null;
            }
            String mimeType = encoderConfig8.getMimeType();
            int iHashCode = mimeType.hashCode();
            if (iHashCode != -1851077871) {
                if (iHashCode != -1662541442) {
                    if (iHashCode == 1331836730 && mimeType.equals(BiliPushAVCodecUtils.AVC_MIME)) {
                        EncoderConfig encoderConfig9 = this.mConfig;
                        EncoderConfig encoderConfig10 = encoderConfig9;
                        if (encoderConfig9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                            encoderConfig10 = null;
                        }
                        encoderConfig10.getVideoEncoderInfo().setCodecType("avc");
                        LivePusherLog.i$default(TAG, "getInteger profile", null, 4, null);
                        BiliPushAVCodecUtils biliPushAVCodecUtils = BiliPushAVCodecUtils.INSTANCE;
                        String strAvcProfileToString = biliPushAVCodecUtils.avcProfileToString(mediaFormat.getInteger("profile"));
                        if (strAvcProfileToString != null) {
                            EncoderConfig encoderConfig11 = this.mConfig;
                            EncoderConfig encoderConfig12 = encoderConfig11;
                            if (encoderConfig11 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                                encoderConfig12 = null;
                            }
                            encoderConfig12.getVideoEncoderInfo().setCodecProfile(strAvcProfileToString);
                        } else {
                            EncoderConfig encoderConfig13 = this.mConfig;
                            EncoderConfig encoderConfig14 = encoderConfig13;
                            if (encoderConfig13 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                                encoderConfig14 = null;
                            }
                            encoderConfig14.getVideoEncoderInfo().setCodecProfile("unSupport");
                        }
                        LivePusherLog.i$default(TAG, "getInteger level", null, 4, null);
                        String strAvcLevelToString = biliPushAVCodecUtils.avcLevelToString(mediaFormat.getInteger("level"));
                        if (strAvcLevelToString != null) {
                            EncoderConfig encoderConfig15 = this.mConfig;
                            if (encoderConfig15 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                                encoderConfig15 = null;
                            }
                            encoderConfig15.getVideoEncoderInfo().setCodecLevel(strAvcLevelToString);
                            return;
                        }
                        EncoderConfig encoderConfig16 = this.mConfig;
                        if (encoderConfig16 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                            encoderConfig16 = null;
                        }
                        encoderConfig16.getVideoEncoderInfo().setCodecLevel("unSupport");
                        return;
                    }
                } else if (mimeType.equals(BiliPushAVCodecUtils.HEVC_MIME)) {
                    EncoderConfig encoderConfig17 = this.mConfig;
                    EncoderConfig encoderConfig18 = encoderConfig17;
                    if (encoderConfig17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                        encoderConfig18 = null;
                    }
                    encoderConfig18.getVideoEncoderInfo().setCodecType("hevc");
                    LivePusherLog.i$default(TAG, "getInteger profile", null, 4, null);
                    BiliPushAVCodecUtils biliPushAVCodecUtils2 = BiliPushAVCodecUtils.INSTANCE;
                    String strHevcProfileToString = biliPushAVCodecUtils2.hevcProfileToString(mediaFormat.getInteger("profile"));
                    if (strHevcProfileToString != null) {
                        EncoderConfig encoderConfig19 = this.mConfig;
                        EncoderConfig encoderConfig20 = encoderConfig19;
                        if (encoderConfig19 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                            encoderConfig20 = null;
                        }
                        encoderConfig20.getVideoEncoderInfo().setCodecProfile(strHevcProfileToString);
                    } else {
                        EncoderConfig encoderConfig21 = this.mConfig;
                        EncoderConfig encoderConfig22 = encoderConfig21;
                        if (encoderConfig21 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                            encoderConfig22 = null;
                        }
                        encoderConfig22.getVideoEncoderInfo().setCodecProfile("unSupport");
                    }
                    LivePusherLog.i$default(TAG, "getInteger level", null, 4, null);
                    String strHevcLevelToString = biliPushAVCodecUtils2.hevcLevelToString(mediaFormat.getInteger("level"));
                    if (strHevcLevelToString != null) {
                        EncoderConfig encoderConfig23 = this.mConfig;
                        if (encoderConfig23 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                            encoderConfig23 = null;
                        }
                        encoderConfig23.getVideoEncoderInfo().setCodecLevel(strHevcLevelToString);
                        return;
                    }
                    EncoderConfig encoderConfig24 = this.mConfig;
                    if (encoderConfig24 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                        encoderConfig24 = null;
                    }
                    encoderConfig24.getVideoEncoderInfo().setCodecLevel("unSupport");
                    return;
                }
            } else if (mimeType.equals(BiliPushAVCodecUtils.DOLBY_MIME)) {
                EncoderConfig encoderConfig25 = this.mConfig;
                EncoderConfig encoderConfig26 = encoderConfig25;
                if (encoderConfig25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                    encoderConfig26 = null;
                }
                encoderConfig26.getVideoEncoderInfo().setCodecType("hevc_dolby");
                LivePusherLog.i$default(TAG, "getInteger profile", null, 4, null);
                BiliPushAVCodecUtils biliPushAVCodecUtils3 = BiliPushAVCodecUtils.INSTANCE;
                String strDolbyProfileToString = biliPushAVCodecUtils3.dolbyProfileToString(mediaFormat.getInteger("profile"));
                if (strDolbyProfileToString != null) {
                    EncoderConfig encoderConfig27 = this.mConfig;
                    EncoderConfig encoderConfig28 = encoderConfig27;
                    if (encoderConfig27 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                        encoderConfig28 = null;
                    }
                    encoderConfig28.getVideoEncoderInfo().setCodecProfile(strDolbyProfileToString);
                } else {
                    EncoderConfig encoderConfig29 = this.mConfig;
                    EncoderConfig encoderConfig30 = encoderConfig29;
                    if (encoderConfig29 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                        encoderConfig30 = null;
                    }
                    encoderConfig30.getVideoEncoderInfo().setCodecProfile("unSupport");
                }
                LivePusherLog.i$default(TAG, "getInteger level", null, 4, null);
                String strDolbyLevelToString = biliPushAVCodecUtils3.dolbyLevelToString(mediaFormat.getInteger("level"));
                if (strDolbyLevelToString != null) {
                    EncoderConfig encoderConfig31 = this.mConfig;
                    if (encoderConfig31 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                        encoderConfig31 = null;
                    }
                    encoderConfig31.getVideoEncoderInfo().setCodecLevel(strDolbyLevelToString);
                    return;
                }
                EncoderConfig encoderConfig32 = this.mConfig;
                if (encoderConfig32 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                    encoderConfig32 = null;
                }
                encoderConfig32.getVideoEncoderInfo().setCodecLevel("unSupport");
                return;
            }
            EncoderConfig encoderConfig33 = this.mConfig;
            EncoderConfig encoderConfig34 = encoderConfig33;
            if (encoderConfig33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig34 = null;
            }
            encoderConfig34.getVideoEncoderInfo().setCodecType(EnvironmentCompat.MEDIA_UNKNOWN);
            EncoderConfig encoderConfig35 = this.mConfig;
            EncoderConfig encoderConfig36 = encoderConfig35;
            if (encoderConfig35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig36 = null;
            }
            encoderConfig36.getVideoEncoderInfo().setCodecProfile(EnvironmentCompat.MEDIA_UNKNOWN);
            EncoderConfig encoderConfig37 = this.mConfig;
            if (encoderConfig37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                encoderConfig37 = null;
            }
            encoderConfig37.getVideoEncoderInfo().setCodecLevel(EnvironmentCompat.MEDIA_UNKNOWN);
        } catch (Exception e7) {
            LivePusherLog.e(TAG, "An exception occurred while VideoEncoder#setEncoderInfo running,error_msg: " + e7.getMessage(), e7);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NotImplementedError */
    private final void signalEndOfInputStream(MediaCodecPair mediaCodecPair) throws NotImplementedError {
        LivePusherLog.i$default(TAG, com.bilibili.app.comm.rubick.common.g.b(mediaCodecPair != null ? Integer.valueOf(mediaCodecPair.hashCode()) : null, "signalEndOfInputStream codec:"), null, 4, null);
        this.markSignalEndTime.getAndSet(SystemClock.uptimeMillis());
        if (mediaCodecPair == null) {
            return;
        }
        try {
            int integer = mediaCodecPair.getEncoder().getInputFormat().getInteger("color-format");
            if (integer == 21 || integer == 54) {
                mediaCodecPair.getAsync().queueInput(new i());
            } else {
                if (integer != 2130708361) {
                    throw new NotImplementedError("An operation is not implemented: 加了新格式这里需要对应处理");
                }
                mediaCodecPair.getEncoder().signalEndOfInputStream();
            }
        } catch (IllegalStateException e7) {
            LivePusherLog.e(TAG, "An exception occurred while VideoEncoder#stop running, error_msg: " + e7.getMessage(), e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit signalEndOfInputStream$lambda$1(MediaCodec mediaCodec, int i7, Function0 function0) {
        if (i7 >= 0) {
            mediaCodec.queueInputBuffer(i7, 0, 0, 0L, 4);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NotImplementedError */
    private final void startCodec(MediaCodecPair mediaCodecPair, MediaCodecPair mediaCodecPair2) throws NotImplementedError {
        try {
            LivePusherLog.i$default(TAG, "startCodec, current codec:" + mediaCodecPair.hashCode() + ", last:" + (mediaCodecPair2 != null ? Integer.valueOf(mediaCodecPair2.hashCode()) : null), null, 4, null);
            this.mIsEncoding.set(false);
            signalEndOfInputStream(mediaCodecPair2);
            resetInputSurface(mediaCodecPair);
            mediaCodecPair.getEncoder().start();
            this.mEncoderList.offer(mediaCodecPair);
            LivePusherLog.i$default(TAG, "encoder start success, encoder:" + mediaCodecPair.getEncoder().hashCode(), null, 4, null);
        } catch (Exception e7) {
            LivePusherLog.e(TAG, "encoder start fail, fail back to release before create, exception:" + e7.getMessage(), e7);
            releaseLastReStartCodec(mediaCodecPair, mediaCodecPair2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NotImplementedError */
    private final boolean startNewEncoder() throws Throwable {
        LivePusherLog.i$default(TAG, "startNewEncoder start!", null, 4, null);
        MediaCodecPair mediaCodecPairCreateEncoder = createEncoder();
        MediaCodecPair mediaCodecPairPeek = this.mEncoderList.peek();
        if ((mediaCodecPairCreateEncoder != null ? mediaCodecPairCreateEncoder.getEncoder() : null) == null) {
            LivePusherLog.e$default(TAG, "switch to a new encoder but failed", null, 4, null);
            return false;
        }
        startCodec(mediaCodecPairCreateEncoder, mediaCodecPairPeek);
        ifNeedStartDrainThread();
        LivePusherLog.i$default(TAG, C3259x.a(mediaCodecPairCreateEncoder.hashCode(), "switch to a new encoder "), null, 4, null);
        return true;
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public boolean beginRenderFrame() {
        BGLFramebuffer bGLFramebuffer;
        boolean z6 = false;
        if (!this.mIsEncoding.get()) {
            return false;
        }
        if (this.mBEGLSurface != null) {
            try {
                BGLUtil.clearErrors();
                BEGLSurface bEGLSurface = this.mBEGLSurface;
                if (bEGLSurface != null) {
                    bEGLSurface.makeCurrent();
                }
                if (!this.mIsSurfaceInput && (bGLFramebuffer = this.mFramebuffer) != null) {
                    bGLFramebuffer.setAsRenderTarget();
                }
                BGLUtil.clear();
                z6 = true;
            } catch (BGLException e7) {
                LivePusherLog.e(TAG, "beginRenderFrame, makeCurrent exception, message:" + e7.getMessage(), e7);
            }
        }
        return z6;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NotImplementedError */
    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public void destroy() throws InterruptedException, BGLException, NotImplementedError {
        stop();
        releaseInputSurface();
        this.mCallback = null;
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public void endRenderFrame(long j7) {
        final MediaCodecPair mediaCodecPairPeek;
        final BGLP010Conversion.ConversionContext conversionContextDoConversion;
        BEGLSurface bEGLSurface = this.mBEGLSurface;
        if (bEGLSurface != null) {
            if (this.mIsSurfaceInput) {
                bEGLSurface.setTimestamp(j7 / ((long) 1000));
                bEGLSurface.swapBuffer();
            } else {
                final BGLP010Conversion bGLP010Conversion = this.mP010Context;
                if (bGLP010Conversion == null || (mediaCodecPairPeek = this.mEncoderList.peek()) == null || (conversionContextDoConversion = bGLP010Conversion.doConversion(this.mBufferTexture, Long.valueOf(j7))) == null) {
                    return;
                }
                final Ref.LongRef longRef = new Ref.LongRef();
                long j8 = this.mP010WaitResultMs;
                longRef.element = j8;
                if (j8 > 12) {
                    longRef.element = 12L;
                } else if (j8 < 0) {
                    longRef.element = 0L;
                }
                AVContext aVContext = this.mVideoCtx;
                AVContext aVContext2 = aVContext;
                if (aVContext == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVideoCtx");
                    aVContext2 = null;
                }
                aVContext2.runInBackground(longRef.element, new Runnable(conversionContextDoConversion, this, longRef, bGLP010Conversion, mediaCodecPairPeek) { // from class: com.bilibili.live.streaming.encoder.video.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final BGLP010Conversion.ConversionContext f65310a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final VideoEncoderV2 f65311b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Ref.LongRef f65312c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final BGLP010Conversion f65313d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final MediaCodecPair f65314e;

                    {
                        this.f65310a = conversionContextDoConversion;
                        this.f65311b = this;
                        this.f65312c = longRef;
                        this.f65313d = bGLP010Conversion;
                        this.f65314e = mediaCodecPairPeek;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoEncoderV2.endRenderFrame$lambda$10$lambda$9(this.f65310a, this.f65311b, this.f65312c, this.f65313d, this.f65314e);
                    }
                });
            }
            this.videoRenderNum++;
        }
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public boolean feedFrame(@Nullable final IVideoSource iVideoSource, final long j7, final int i7) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Handler handler = this.mRenderHandler;
        if (handler != null) {
            ExtMethodsKt.invoke(handler, new Function0(this, iVideoSource, i7, j7, booleanRef) { // from class: com.bilibili.live.streaming.encoder.video.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final VideoEncoderV2 f65316a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final IVideoSource f65317b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f65318c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final long f65319d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Ref.BooleanRef f65320e;

                {
                    this.f65316a = this;
                    this.f65317b = iVideoSource;
                    this.f65318c = i7;
                    this.f65319d = j7;
                    this.f65320e = booleanRef;
                }

                public final Object invoke() {
                    Ref.BooleanRef booleanRef2 = this.f65320e;
                    return VideoEncoderV2.feedFrame$lambda$11(this.f65316a, this.f65317b, this.f65318c, this.f65319d, booleanRef2);
                }
            });
        }
        return booleanRef.element;
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public long getDelayUs() {
        EncoderConfig encoderConfig = this.mConfig;
        EncoderConfig encoderConfig2 = encoderConfig;
        if (encoderConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConfig");
            encoderConfig2 = null;
        }
        return TransitionInfo.DEFAULT_DURATION / ((long) encoderConfig2.getFrameRate());
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public long getDropRedundanceBytes() {
        long j7;
        synchronized (this) {
            j7 = this.dropRedundanceBytes;
        }
        return j7;
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
        long j7;
        synchronized (this) {
            j7 = this.encoderGeneratedBytes;
        }
        return j7;
    }

    @Nullable
    public final Looper getLooper() {
        return this.looper;
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
        AVContext aVContext2 = aVContext;
        if (aVContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVideoCtx");
            aVContext2 = null;
        }
        this.mRenderHandler = aVContext2.getRailgunHandler();
        this.mConfig = encoderConfig;
        this.mCallback = iVideoEncoderCallback;
        this.mBufferInfo = new MediaCodec.BufferInfo();
    }

    @Override // com.bilibili.live.streaming.log.IBiliPushLogger
    public void logDebug(@NotNull Function0<String> function0, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        this.$$delegate_0.logDebug(function0, str, str2, th);
    }

    @Override // com.bilibili.live.streaming.log.IBiliPushLogger
    public void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.$$delegate_0.logError(str, str2, str3, th);
    }

    @Override // com.bilibili.live.streaming.log.IBiliPushLogger
    public void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.$$delegate_0.logInfo(str, str2, str3, th);
    }

    @Override // com.bilibili.live.streaming.log.IBiliPushLogger
    public void logVerbose(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.$$delegate_0.logVerbose(str, str2, str3, th);
    }

    @Override // com.bilibili.live.streaming.log.IBiliPushLogger
    public void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.$$delegate_0.logWarning(str, str2, str3, th);
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public void requestKeyFrame() {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            MediaCodecPair mediaCodecPairPeek = this.mEncoderList.peek();
            if (mediaCodecPairPeek == null) {
                return;
            }
            mediaCodecPairPeek.getEncoder().setParameters(bundle);
        } catch (Exception e7) {
        }
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public void restart(@NotNull Function2<? super Integer, ? super String, Unit> function2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = function2;
        sendMessage(messageObtain);
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public boolean start() {
        sendEmptyMessage(1);
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NotImplementedError */
    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public boolean stop() throws InterruptedException, NotImplementedError {
        removeCallbacksAndMessages(null);
        if (!this.mIsEncoding.compareAndSet(true, false)) {
            return true;
        }
        setEncoderInfo();
        this.mIsEncoding.set(false);
        try {
            MediaCodecPair mediaCodecPairPeek = this.mEncoderList.peek();
            if (mediaCodecPairPeek != null) {
                signalEndOfInputStream(mediaCodecPairPeek);
            }
        } catch (IllegalStateException e7) {
            LivePusherLog.e(TAG, "An exception occurred while VideoEncoder#stop running, error_msg: " + e7.getMessage(), e7);
        } catch (Exception e8) {
            LivePusherLog.e(TAG, "unknown exception, msg: " + e8.getMessage(), e8);
        }
        AVContext aVContext = this.mVideoCtx;
        AVContext aVContext2 = aVContext;
        if (aVContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVideoCtx");
            aVContext2 = null;
        }
        this.videoEncoderDurationUs = aVContext2.getTimeStampUs() - this.videoEncoderDurationUs;
        DrainEncoderThread drainEncoderThread = this.mDrainThread;
        if (drainEncoderThread != null) {
            drainEncoderThread.stopEncoder();
        }
        DrainEncoderThread drainEncoderThread2 = this.mDrainThread;
        if (drainEncoderThread2 != null) {
            drainEncoderThread2.join();
        }
        this.mDrainThread = null;
        resetVideoBitrate();
        return true;
    }

    @Override // com.bilibili.live.streaming.encoder.video.IVideoEncoder
    public void updateBitrate(int i7) {
        LivePusherLog.i$default(TAG, C3259x.a(i7, "updateBitrate:"), null, 4, null);
        this.mVideoSetBitrate = i7;
    }
}
