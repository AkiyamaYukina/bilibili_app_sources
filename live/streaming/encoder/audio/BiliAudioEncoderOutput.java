package com.bilibili.live.streaming.encoder.audio;

import G.p;
import Ld.c;
import Ua0.l;
import Vn.A;
import a5.C3188c;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.compose.foundation.gestures.C3392f;
import androidx.compose.ui.input.pointer.k;
import androidx.compose.ui.text.font.C4496a;
import androidx.constraintlayout.widget.e;
import androidx.media3.exoplayer.C4690e;
import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils;
import com.bilibili.live.streaming.encoder.EncoderConfig;
import com.bilibili.live.streaming.encoder.IAudioEncoderCallback;
import com.bilibili.live.streaming.encoder.audio.BiliAudioEncoderOutput;
import com.bilibili.mediastreaming.audio.croutine.BiliAudioCoroutineKt;
import com.bilibili.mediastreaming.audio.output.BiliAudioOutput;
import com.bilibili.mediastreaming.enums.BiliAudioCodec;
import com.bilibili.mediastreaming.packet.BiliAudioEncoderPacket;
import com.bilibili.montage.export.ExportEngine;
import com.bilibili.studio.comm.report.editor.bean.EditorAction;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.android.HandlerDispatcher;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import nh0.InterfaceC8094b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ph0.C8300a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/audio/BiliAudioEncoderOutput.class */
public final class BiliAudioEncoderOutput extends BiliAudioOutput {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "BiliAudioEncoderOutput";

    @NotNull
    private final AVContext avCtx;
    private int mAACFrameBytes;

    @Nullable
    private C8300a mAudioADTS;

    @Nullable
    private EncoderConfig mAudioConfig;

    @Nullable
    private BiliAudioEncoder mAudioEncoder;

    @NotNull
    private final CoroutineContext mAudioEncoderCtx;

    @NotNull
    private final Handler mAudioEncoderHandler;

    @NotNull
    private final HandlerThread mAudioEncoderHandlerThread;

    @NotNull
    private final CoroutineScope mAudioEncoderScope;
    private boolean mAudioEncoderScopeIsCancel;

    @NotNull
    private ByteBuffer mByteBuffer;
    private long mEncodedAudioBytes;

    @NotNull
    private AtomicBoolean mIsAudioCodecStart;

    @NotNull
    private AtomicLong mLatestPts;
    private long mLoopTimeUs;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/audio/BiliAudioEncoderOutput$BiliAudioEncoder.class */
    public final class BiliAudioEncoder extends MediaCodec.Callback {
        private long inputAudioFrames;
        private boolean isEncodingF32;

        @Nullable
        private IAudioEncoderCallback mCallback;

        @Nullable
        private EncoderConfig mConfig;

        @Nullable
        private MediaCodec mEncoder;
        private boolean mHasCSDSent;

        @Nullable
        private FileOutputStream mInputFos;

        @Nullable
        private FileOutputStream mOutputFos;
        private long oneFrameTs;
        private long outputAudioFrames;
        final BiliAudioEncoderOutput this$0;

        @NotNull
        private final String AAC_MIME_TYPE = "audio/mp4a-latm";
        private final int AAC_PROFILE_VALUE = 2;

        @NotNull
        private AtomicBoolean mIsEncoding = new AtomicBoolean(false);
        private int mSamplerate = -1;
        private int mChannels = -1;
        private int mBitRate = -1;

        @NotNull
        private String mCodecName = "";

        public BiliAudioEncoder(BiliAudioEncoderOutput biliAudioEncoderOutput) {
            this.this$0 = biliAudioEncoderOutput;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean configureEncoder() {
            MediaCodecInfo codecInfo;
            String name;
            EncoderConfig encoderConfig = this.mConfig;
            if (encoderConfig == null) {
                return false;
            }
            try {
                this.mEncoder = MediaCodec.createEncoderByType(this.AAC_MIME_TYPE);
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", this.AAC_MIME_TYPE);
                mediaFormat.setInteger("channel-mask", this.mChannels == 1 ? 16 : 12);
                mediaFormat.setInteger("aac-profile", this.AAC_PROFILE_VALUE);
                mediaFormat.setInteger("sample-rate", this.mSamplerate);
                mediaFormat.setInteger("channel-count", this.mChannels);
                mediaFormat.setInteger("bitrate", this.mBitRate);
                mediaFormat.setInteger("max-input-size", this.this$0.mAACFrameBytes);
                MediaCodec mediaCodec = this.mEncoder;
                if (mediaCodec != null) {
                    mediaCodec.setCallback(this);
                }
                MediaCodec mediaCodec2 = this.mEncoder;
                if (mediaCodec2 != null) {
                    mediaCodec2.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                }
                MediaCodec mediaCodec3 = this.mEncoder;
                if (mediaCodec3 != null && (codecInfo = mediaCodec3.getCodecInfo()) != null && (name = codecInfo.getName()) != null) {
                    this.mCodecName = name;
                }
                IAudioEncoderCallback iAudioEncoderCallback = this.mCallback;
                if (iAudioEncoderCallback == null) {
                    return true;
                }
                iAudioEncoderCallback.onSendAudioConfig(this.mChannels, this.mSamplerate, this.mBitRate, encoderConfig.getAudioDepth(), this.mCodecName);
                return true;
            } catch (Exception e7) {
                BiliAudioEncoderOutput biliAudioEncoderOutput = this.this$0;
                String message = e7.getMessage();
                int i7 = this.mChannels;
                int i8 = this.mSamplerate;
                int audioBitRate = encoderConfig.getAudioBitRate();
                MediaCodec mediaCodec4 = this.mEncoder;
                StringBuilder sbA = e.a(i7, "An exception occurred while AudioEncoder#configureEncoder running, error_msg: ", message, ", audio config channelCount:", ",sampleRateInHz:");
                C4690e.a(i8, audioBitRate, ", audioBitRate:", ", mEncoder:", sbA);
                sbA.append(mediaCodec4);
                InterfaceC8094b.c(biliAudioEncoderOutput, sbA.toString(), e7, 6);
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void innerStop() {
            InterfaceC8094b.b(this.this$0, "innerStop...", null, 14);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                if (!this.mIsEncoding.getAcquire()) {
                    return;
                }
            } else if (!this.mIsEncoding.get()) {
                return;
            }
            if (i7 >= 33) {
                this.mIsEncoding.setRelease(false);
            } else {
                this.mIsEncoding.set(false);
            }
            this.inputAudioFrames = 0L;
            this.outputAudioFrames = 0L;
            setEncoderInfo();
            try {
                InterfaceC8094b.b(this.this$0, "encode stop...mEncoder:" + this.mEncoder, null, 14);
                this.isEncodingF32 = false;
                MediaCodec mediaCodec = this.mEncoder;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                }
                MediaCodec mediaCodec2 = this.mEncoder;
                if (mediaCodec2 != null) {
                    mediaCodec2.release();
                }
                this.mEncoder = null;
            } catch (IllegalStateException e7) {
                InterfaceC8094b.c(this.this$0, "An exception occurred while audio encoding stops, error_msg: " + e7.getMessage(), e7, 6);
            }
            InterfaceC8094b.b(this.this$0, "innerStop done!", null, 14);
        }

        private static final String onOutputBufferAvailable$lambda$9(BiliAudioEncoder biliAudioEncoder, int i7, MediaCodec.BufferInfo bufferInfo) {
            long j7 = biliAudioEncoder.outputAudioFrames;
            return c.a(O4.c.b(i7, j7, "outputAudioFrames:", ", index:"), bufferInfo.presentationTimeUs, ", ts:");
        }

        private final void resendCSD() {
            MediaFormat outputFormat;
            ByteBuffer byteBuffer;
            MediaCodec mediaCodec = this.mEncoder;
            if (mediaCodec == null || (outputFormat = mediaCodec.getOutputFormat()) == null || (byteBuffer = outputFormat.getByteBuffer("csd-0")) == null) {
                return;
            }
            byte[] bArr = new byte[byteBuffer.capacity()];
            byteBuffer.get(bArr, 0, byteBuffer.capacity());
            IAudioEncoderCallback iAudioEncoderCallback = this.mCallback;
            if (iAudioEncoderCallback != null) {
                iAudioEncoderCallback.onAudioConfigPacket(bArr, this.mCodecName);
            }
            this.mHasCSDSent = true;
        }

        private final void setEncoderInfo() {
            EncoderConfig encoderConfig = this.mConfig;
            if (encoderConfig != null) {
                encoderConfig.getAudioEncoderInfo().setCodecName(this.mCodecName);
                encoderConfig.getAudioEncoderInfo().setCodecType(ExportEngine.COMPILE_AUDIO_ENCODER_NAME_AAC);
                encoderConfig.getAudioEncoderInfo().setCodecProfile(BiliPushAVCodecUtils.INSTANCE.getAACProfileString(this.AAC_PROFILE_VALUE));
            }
        }

        public final float getAudioDurationS() {
            return (this.inputAudioFrames * 1024.0f) / this.mSamplerate;
        }

        public final boolean init(@NotNull final EncoderConfig encoderConfig) {
            final BiliAudioEncoderOutput biliAudioEncoderOutput = this.this$0;
            Boolean bool = (Boolean) BiliAudioCoroutineKt.c(biliAudioEncoderOutput.mAudioEncoderScope, "init", biliAudioEncoderOutput.mAudioEncoderHandlerThread.getThreadId(), CoroutineStart.DEFAULT, new Function0<Boolean>(biliAudioEncoderOutput, this, encoderConfig, biliAudioEncoderOutput) { // from class: com.bilibili.live.streaming.encoder.audio.BiliAudioEncoderOutput$BiliAudioEncoder$init$$inlined$invokeAudioEncoderThread$1
                final EncoderConfig $config$inlined;
                final BiliAudioEncoderOutput.BiliAudioEncoder this$0;
                final BiliAudioEncoderOutput this$0$inline_fun;
                final BiliAudioEncoderOutput this$1$inlined;

                {
                    this.this$0$inline_fun = biliAudioEncoderOutput;
                    this.this$0 = this;
                    this.$config$inlined = encoderConfig;
                    this.this$1$inlined = biliAudioEncoderOutput;
                }

                public final Boolean invoke() {
                    if (this.this$0$inline_fun.mAudioEncoderScopeIsCancel) {
                        return null;
                    }
                    this.this$0.mConfig = this.$config$inlined;
                    this.this$0.mSamplerate = this.$config$inlined.getSampleRateInHz();
                    this.this$0.mChannels = this.$config$inlined.getChannelCount();
                    this.this$0.mBitRate = this.$config$inlined.getAudioBitRate();
                    BiliAudioEncoderOutput.BiliAudioEncoder biliAudioEncoder = this.this$0;
                    biliAudioEncoder.oneFrameTs = 1024000000 / ((long) biliAudioEncoder.mSamplerate);
                    BiliAudioEncoderOutput.access$getMAudioADTS$p(this.this$1$inlined);
                    return Boolean.valueOf(this.this$0.mEncoder == null ? this.this$0.configureEncoder() : true);
                }
            });
            return bool != null ? bool.booleanValue() : false;
        }

        public final boolean isEncoding() {
            return this.mIsEncoding.get();
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(@NotNull MediaCodec mediaCodec, @NotNull MediaCodec.CodecException codecException) {
            int i7 = Build.VERSION.SDK_INT;
            int errorCode = codecException.getErrorCode();
            String diagnosticInfo = codecException.getDiagnosticInfo();
            boolean zIsRecoverable = codecException.isRecoverable();
            boolean zIsTransient = codecException.isTransient();
            StringBuilder sbB = A.b(i7, errorCode, "audioEncoder failed, OSVersion:", ", errorCode=", ", diagnosticInfo=");
            C3188c.a(diagnosticInfo, ", isRecoverable=", ", isTransient=", sbB, zIsRecoverable);
            sbB.append(zIsTransient);
            String string = sbB.toString();
            String strA = string;
            if (errorCode == 1101) {
                strA = p.a(string, ", Audio encoder reclaimed by system");
            }
            String strA2 = C4496a.a("onError, ", strA);
            IAudioEncoderCallback iAudioEncoderCallback = this.mCallback;
            if (iAudioEncoderCallback != null) {
                iAudioEncoderCallback.onAudioEncoderState(strA2);
            }
            InterfaceC8094b.c(this.this$0, strA2, codecException, 6);
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(@NotNull MediaCodec mediaCodec, int i7) {
            String strA;
            try {
                if (this.this$0.mAudioEncoderScopeIsCancel) {
                    return;
                }
                if (this.this$0.remainingCacheFrames() < 1024) {
                    mediaCodec.queueInputBuffer(i7, 0, 0, 0L, 0);
                    return;
                }
                long jRequestAudioData = this.this$0.requestAudioData(r0.mAACFrameBytes);
                if (jRequestAudioData < this.this$0.mAACFrameBytes) {
                    InterfaceC8094b.a(this.this$0, "requested buffer size smaller than expected: " + jRequestAudioData, null, null, 14);
                    mediaCodec.queueInputBuffer(i7, 0, 0, 0L, 0);
                    return;
                }
                boolean z6 = false;
                this.this$0.mByteBuffer.position(0);
                this.this$0.mByteBuffer.limit((int) jRequestAudioData);
                ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i7);
                if (inputBuffer != null && inputBuffer.capacity() >= this.this$0.mAACFrameBytes) {
                    inputBuffer.clear();
                    inputBuffer.put(this.this$0.mByteBuffer);
                    inputBuffer.flip();
                    mediaCodec.queueInputBuffer(i7, 0, this.this$0.mAACFrameBytes, this.this$0.mLatestPts.get() == 0 ? this.this$0.mLatestPts.getAndAdd(this.this$0.avCtx.getTimeStampUs() + this.this$0.mLoopTimeUs) : this.this$0.mLatestPts.getAndAdd(this.oneFrameTs), 0);
                    this.this$0.mByteBuffer.clear();
                    return;
                }
                int iCapacity = inputBuffer != null ? inputBuffer.capacity() : -1;
                BiliAudioEncoderOutput biliAudioEncoderOutput = this.this$0;
                if (inputBuffer == null) {
                    z6 = true;
                }
                InterfaceC8094b.c(biliAudioEncoderOutput, "input buffer invalid: isNull=" + z6 + ", capacity=" + iCapacity + ", required=" + biliAudioEncoderOutput.mAACFrameBytes + ", index=" + i7, null, 14);
                mediaCodec.queueInputBuffer(i7, 0, 0, 0L, 0);
            } catch (Exception e7) {
                if (e7 instanceof MediaCodec.CodecException) {
                    int i8 = Build.VERSION.SDK_INT;
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) e7;
                    int errorCode = codecException.getErrorCode();
                    String diagnosticInfo = codecException.getDiagnosticInfo();
                    boolean zIsRecoverable = codecException.isRecoverable();
                    boolean zIsTransient = codecException.isTransient();
                    StringBuilder sbB = A.b(i8, errorCode, "queueInputBuffer failed, OSVersion:", ", errorCode=", ", diagnosticInfo=");
                    C3188c.a(diagnosticInfo, ", isRecoverable=", ", isTransient=", sbB, zIsRecoverable);
                    sbB.append(zIsTransient);
                    String string = sbB.toString();
                    strA = string;
                    if (errorCode == 1101) {
                        strA = p.a(string, ", Audio encoder reclaimed by system");
                    }
                } else {
                    strA = e7 instanceof IllegalStateException ? C4496a.a("queueInputBuffer failed, IllegalStateException, msg:", e7.getMessage()) : C4496a.a("queueInputBuffer failed, msg:", e7.getMessage());
                }
                InterfaceC8094b.c(this.this$0, strA, e7, 6);
                IAudioEncoderCallback iAudioEncoderCallback = this.mCallback;
                if (iAudioEncoderCallback != null) {
                    iAudioEncoderCallback.onAudioEncoderState(strA);
                }
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(@NotNull MediaCodec mediaCodec, int i7, @NotNull MediaCodec.BufferInfo bufferInfo) {
            ByteBuffer outputBuffer;
            try {
                if (this.this$0.mAudioEncoderScopeIsCancel || (outputBuffer = mediaCodec.getOutputBuffer(i7)) == null) {
                    return;
                }
                if (bufferInfo.size >= 0) {
                    outputBuffer.position(bufferInfo.offset);
                    outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    byte[] bArr = new byte[bufferInfo.size];
                    outputBuffer.get(bArr);
                    int i8 = bufferInfo.flags;
                    if ((i8 & 2) != 0) {
                        this.mHasCSDSent = true;
                        IAudioEncoderCallback iAudioEncoderCallback = this.mCallback;
                        if (iAudioEncoderCallback != null) {
                            iAudioEncoderCallback.onAudioConfigPacket(bArr, this.mCodecName);
                        }
                    } else {
                        if ((i8 & 1) != 0 && !this.mHasCSDSent) {
                            resendCSD();
                        }
                        BiliAudioEncoderOutput.access$getMAudioADTS$p(this.this$0);
                        BiliAudioEncoderPacket biliAudioEncoderPacket = new BiliAudioEncoderPacket();
                        biliAudioEncoderPacket.data = bArr;
                        biliAudioEncoderPacket.codec = BiliAudioCodec.AAC;
                        long j7 = bufferInfo.presentationTimeUs;
                        biliAudioEncoderPacket.ptsUs = j7;
                        biliAudioEncoderPacket.dtsUs = j7;
                        this.this$0.mEncodedAudioBytes += (long) bufferInfo.size;
                        IAudioEncoderCallback iAudioEncoderCallback2 = this.mCallback;
                        if (iAudioEncoderCallback2 != null) {
                            iAudioEncoderCallback2.onAudioPacket(biliAudioEncoderPacket, this.mCodecName);
                        }
                        this.outputAudioFrames++;
                    }
                }
                mediaCodec.releaseOutputBuffer(i7, false);
            } catch (Exception e7) {
                InterfaceC8094b.a(this.this$0, C4496a.a("onOutputBufferAvailable, exception, msg:", e7.getMessage()), null, e7, 6);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(@NotNull MediaCodec mediaCodec, @NotNull MediaFormat mediaFormat) {
        }

        public final void registerAudioEncoderCallback(@Nullable final IAudioEncoderCallback iAudioEncoderCallback) {
            final BiliAudioEncoderOutput biliAudioEncoderOutput = this.this$0;
            BiliAudioCoroutineKt.c(biliAudioEncoderOutput.mAudioEncoderScope, "registerAudioEncoderCallback", biliAudioEncoderOutput.mAudioEncoderHandlerThread.getThreadId(), CoroutineStart.DEFAULT, new Function0<Unit>(biliAudioEncoderOutput, this, iAudioEncoderCallback) { // from class: com.bilibili.live.streaming.encoder.audio.BiliAudioEncoderOutput$BiliAudioEncoder$registerAudioEncoderCallback$$inlined$invokeAudioEncoderThread$1
                final IAudioEncoderCallback $callback$inlined;
                final BiliAudioEncoderOutput.BiliAudioEncoder this$0;
                final BiliAudioEncoderOutput this$0$inline_fun;

                {
                    this.this$0$inline_fun = biliAudioEncoderOutput;
                    this.this$0 = this;
                    this.$callback$inlined = iAudioEncoderCallback;
                }

                public final Unit invoke() {
                    if (this.this$0$inline_fun.mAudioEncoderScopeIsCancel) {
                        return null;
                    }
                    this.this$0.mCallback = this.$callback$inlined;
                    return Unit.INSTANCE;
                }
            });
        }

        public final void release() {
            InterfaceC8094b.b(this.this$0, "release!", null, 14);
            final BiliAudioEncoderOutput biliAudioEncoderOutput = this.this$0;
            BiliAudioCoroutineKt.c(biliAudioEncoderOutput.mAudioEncoderScope, "release", biliAudioEncoderOutput.mAudioEncoderHandlerThread.getThreadId(), CoroutineStart.DEFAULT, new Function0<Unit>(biliAudioEncoderOutput, biliAudioEncoderOutput, this) { // from class: com.bilibili.live.streaming.encoder.audio.BiliAudioEncoderOutput$BiliAudioEncoder$release$$inlined$invokeAudioEncoderThread$1
                final BiliAudioEncoderOutput this$0;
                final BiliAudioEncoderOutput this$0$inline_fun;
                final BiliAudioEncoderOutput.BiliAudioEncoder this$1$inlined;

                {
                    this.this$0$inline_fun = biliAudioEncoderOutput;
                    this.this$0 = biliAudioEncoderOutput;
                    this.this$1$inlined = this;
                }

                public final Unit invoke() {
                    if (this.this$0$inline_fun.mAudioEncoderScopeIsCancel) {
                        return null;
                    }
                    InterfaceC8094b.b(this.this$0, "encoder release....", null, 14);
                    this.this$1$inlined.innerStop();
                    this.this$1$inlined.mCallback = null;
                    this.this$0.mAudioEncoderScopeIsCancel = true;
                    InterfaceC8094b.b(this.this$0, "encoder release done!", null, 14);
                    return Unit.INSTANCE;
                }
            });
            CoroutineScopeKt.cancel$default(this.this$0.mAudioEncoderScope, (CancellationException) null, 1, (Object) null);
            this.this$0.mAudioEncoderHandlerThread.quitSafely();
            this.this$0.mByteBuffer.clear();
        }

        public final void start() {
            BiliAudioEncoderOutput biliAudioEncoderOutput = this.this$0;
            BuildersKt.launch(biliAudioEncoderOutput.mAudioEncoderScope, biliAudioEncoderOutput.mAudioEncoderCtx, CoroutineStart.DEFAULT, new BiliAudioEncoderOutput$BiliAudioEncoder$start$$inlined$postAudioEncoderThread$1(biliAudioEncoderOutput, null, biliAudioEncoderOutput, this));
        }

        public final void stop() {
            InterfaceC8094b.b(this.this$0, "stop...", null, 14);
            final BiliAudioEncoderOutput biliAudioEncoderOutput = this.this$0;
            BiliAudioCoroutineKt.c(biliAudioEncoderOutput.mAudioEncoderScope, EditorAction.ACTION_STOP, biliAudioEncoderOutput.mAudioEncoderHandlerThread.getThreadId(), CoroutineStart.DEFAULT, new Function0<Unit>(biliAudioEncoderOutput, this) { // from class: com.bilibili.live.streaming.encoder.audio.BiliAudioEncoderOutput$BiliAudioEncoder$stop$$inlined$invokeAudioEncoderThread$1
                final BiliAudioEncoderOutput.BiliAudioEncoder this$0;
                final BiliAudioEncoderOutput this$0$inline_fun;

                {
                    this.this$0$inline_fun = biliAudioEncoderOutput;
                    this.this$0 = this;
                }

                public final Unit invoke() {
                    if (this.this$0$inline_fun.mAudioEncoderScopeIsCancel) {
                        return null;
                    }
                    this.this$0.innerStop();
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/audio/BiliAudioEncoderOutput$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.live.streaming.encoder.audio.BiliAudioEncoderOutput$postAudioEncoderThread$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/audio/BiliAudioEncoderOutput$postAudioEncoderThread$1.class */
    public static final class C53621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function0<Unit> $block;
        int label;
        final BiliAudioEncoderOutput this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53621(BiliAudioEncoderOutput biliAudioEncoderOutput, Function0<Unit> function0, Continuation<? super C53621> continuation) {
            super(2, continuation);
            this.this$0 = biliAudioEncoderOutput;
            this.$block = function0;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C53621(this.this$0, this.$block, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.this$0.mAudioEncoderScopeIsCancel) {
                return Unit.INSTANCE;
            }
            this.$block.invoke();
            return Unit.INSTANCE;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            if (this.this$0.mAudioEncoderScopeIsCancel) {
                return Unit.INSTANCE;
            }
            this.$block.invoke();
            return Unit.INSTANCE;
        }
    }

    public BiliAudioEncoderOutput(@NotNull AVContext aVContext) {
        super(TAG, TAG);
        this.avCtx = aVContext;
        this.mIsAudioCodecStart = new AtomicBoolean(false);
        HandlerThread handlerThread = new HandlerThread("BiliAudioEncoderOutputCallbackThread");
        this.mAudioEncoderHandlerThread = handlerThread;
        this.mAACFrameBytes = -1;
        this.mLatestPts = new AtomicLong(0L);
        this.mByteBuffer = ByteBuffer.allocateDirect(0);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mAudioEncoderHandler = handler;
        HandlerDispatcher handlerDispatcherFrom$default = HandlerDispatcherKt.from$default(handler, (String) null, 1, (Object) null);
        this.mAudioEncoderCtx = handlerDispatcherFrom$default;
        this.mAudioEncoderScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(handlerDispatcherFrom$default));
    }

    public static final /* synthetic */ C8300a access$getMAudioADTS$p(BiliAudioEncoderOutput biliAudioEncoderOutput) {
        biliAudioEncoderOutput.getClass();
        return null;
    }

    private final <T> T invokeAudioEncoderThread(String str, Function0<? extends T> function0) {
        return (T) BiliAudioCoroutineKt.c(this.mAudioEncoderScope, str, this.mAudioEncoderHandlerThread.getThreadId(), CoroutineStart.DEFAULT, new Function0<T>(this, function0) { // from class: com.bilibili.live.streaming.encoder.audio.BiliAudioEncoderOutput.invokeAudioEncoderThread.1
            final Function0<T> $block;
            final BiliAudioEncoderOutput this$0;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.this$0 = this;
                this.$block = function0;
            }

            public final T invoke() {
                if (this.this$0.mAudioEncoderScopeIsCancel) {
                    return null;
                }
                return (T) this.$block.invoke();
            }
        });
    }

    private final void postAudioEncoderThread(Function0<Unit> function0) {
        BuildersKt.launch(this.mAudioEncoderScope, this.mAudioEncoderCtx, CoroutineStart.DEFAULT, new C53621(this, function0, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit release$lambda$0(BiliAudioEncoderOutput biliAudioEncoderOutput) {
        super.release();
        return Unit.INSTANCE;
    }

    public final float getAudioDurationS() {
        InterfaceC8094b.b(this, "getAudioDurationS mAudioEncoder is null?:" + (this.mAudioEncoder == null), null, 14);
        BiliAudioEncoder biliAudioEncoder = this.mAudioEncoder;
        if (biliAudioEncoder == null) {
            return 0.0f;
        }
        return biliAudioEncoder.getAudioDurationS();
    }

    public final boolean init(@NotNull EncoderConfig encoderConfig) {
        InterfaceC8094b.b(this, "AudioEncoder init.....", null, 14);
        if (this.mAudioEncoder == null) {
            this.mAudioEncoder = new BiliAudioEncoder(this);
        }
        if (this.mAudioEncoder == null) {
            return false;
        }
        this.mAudioConfig = encoderConfig;
        initHandle(false, false);
        setReceiving(false);
        setTargetStreamConfig(encoderConfig.getSampleRateInHz(), encoderConfig.getChannelCount());
        int channelCount = encoderConfig.getChannelCount() * (encoderConfig.getAudioDepth() / 8) * 1024;
        this.mAACFrameBytes = channelCount;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(channelCount);
        this.mByteBuffer = byteBufferAllocateDirect;
        setCacheDirectBufferAddress(byteBufferAllocateDirect);
        return true;
    }

    @Override // com.bilibili.mediastreaming.audio.output.BiliAudioOutput
    public void onAudioDataNotify(int i7, long j7, int i8, int i9) {
    }

    @Override // com.bilibili.mediastreaming.audio.output.BiliAudioOutput
    public void onAudioLoopTime(int i7) {
        InterfaceC8094b.b(this, C3392f.a(i7, "onAudioLoopTime, loopTime:", "ms"), null, 14);
        long j7 = (i7 / 2) * 1000;
        this.mLoopTimeUs = j7;
        InterfaceC8094b.b(this, k.a(j7, "change begin:", "us"), null, 14);
    }

    public final void registerAudioEncoderCallback(@Nullable IAudioEncoderCallback iAudioEncoderCallback) {
        InterfaceC8094b.b(this, "registerAudioEncoderCallback callback obj:" + iAudioEncoderCallback, null, 14);
        BiliAudioEncoder biliAudioEncoder = this.mAudioEncoder;
        if (biliAudioEncoder != null) {
            biliAudioEncoder.registerAudioEncoderCallback(iAudioEncoderCallback);
        }
    }

    @Override // com.bilibili.mediastreaming.audio.output.BiliAudioOutput
    public void release() {
        InterfaceC8094b.b(this, "release!", null, 14);
        BiliAudioEncoder biliAudioEncoder = this.mAudioEncoder;
        if (biliAudioEncoder != null) {
            biliAudioEncoder.release();
        }
        runOnAudioCoroutineInvoke("release", new l(this, 4));
        getMAudioOutputCoroutine().d();
    }

    public final boolean start() {
        EncoderConfig encoderConfig;
        InterfaceC8094b.b(this, "start mAudioEncoder is null?:" + (this.mAudioEncoder == null), null, 14);
        this.mIsAudioCodecStart.set(true);
        BiliAudioEncoder biliAudioEncoder = this.mAudioEncoder;
        if (biliAudioEncoder == null || (encoderConfig = this.mAudioConfig) == null) {
            return false;
        }
        boolean zInit = biliAudioEncoder.init(encoderConfig);
        InterfaceC8094b.b(this, "AudioEncoder init done!, result:" + zInit, null, 14);
        if (!zInit) {
            return false;
        }
        biliAudioEncoder.start();
        clearCacheStream();
        return true;
    }

    public final boolean stop() {
        InterfaceC8094b.b(this, "stop mAudioEncoder is null?:" + (this.mAudioEncoder == null), null, 14);
        this.mIsAudioCodecStart.set(false);
        BiliAudioEncoder biliAudioEncoder = this.mAudioEncoder;
        if (biliAudioEncoder == null) {
            return false;
        }
        biliAudioEncoder.stop();
        this.mLatestPts.set(0L);
        return true;
    }
}
