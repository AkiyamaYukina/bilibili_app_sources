package com.bilibili.live.streaming.encoder;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.emoticon.impl.B;
import com.bilibili.emoticon.impl.F;
import com.bilibili.emoticon.impl.J;
import com.bilibili.live.streaming.log.BiliPushLogger;
import com.bilibili.live.streaming.log.IBiliPushLogger;
import com.bilibili.mediastreaming.enums.BiliVideoCodec;
import com.bilibili.mediastreaming.flashpoint.BiliDispatchManagementFlaspoint;
import com.bilibili.mediastreaming.packet.BiliAudioEncoderPacket;
import com.bilibili.mediastreaming.packet.BiliVideoEncoderPacket;
import com.bilibili.mediastreaming.video.BiliH26XParser;
import com.bilibili.mediastreaming.video.BiliSeiBuffer;
import com.bilibili.mediastreaming.video.BiliSeiGenerate;
import com.bilibili.mediastreaming.video.BiliSeiManagement;
import com.bilibili.mediastreaming.video.IBiliSeiInKeyFrameInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kntr.common.ouro.common.ui.toolPanel.TextStylePanelEvent;
import kntr.common.ouro.core.OuroStore;
import kntr.common.ouro.core.plugin.paragraphStyle.s;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/PushEncoderSink.class */
public final class PushEncoderSink implements IVideoEncoderCallback, IAudioEncoderCallback, IBiliPushLogger {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "PushEncoderSink";

    @NotNull
    private final BiliDispatchManagementFlaspoint flashpoint;
    private int mAudioBitrate;
    private int mAudioChannels;
    private int mAudioSampleRate;
    private int mAudioSampleSize;

    @Nullable
    private BiliH26XParser mBiliH26XParser;

    @Nullable
    private IEncoderStateCallback mEncoderStateCallback;
    private boolean mHasDolbyVision;

    @Nullable
    private IBiliSeiInKeyFrameInterface mSeiInKeyFrameInterface;
    private int mVideoBitrate;
    private int mVideoFrameRate;
    private int mVideoHeight;
    private int mVideoWidth;
    private final BiliPushLogger $$delegate_0 = new BiliPushLogger(TAG);

    @NotNull
    private BiliSeiManagement mBiliSeiManagement = new BiliSeiManagement();

    @NotNull
    private BiliVideoCodec mVideoCodecType = BiliVideoCodec.UN_DEFINE;

    @NotNull
    private AtomicBoolean mIsDisable = new AtomicBoolean(false);

    @NotNull
    private CoroutineScope defaultCoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault().limitedParallelism(1)));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/PushEncoderSink$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.live.streaming.encoder.PushEncoderSink$runOnPushSinkCoroutine$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/PushEncoderSink$runOnPushSinkCoroutine$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function0<Unit> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$block = function0;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$block, continuation);
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
            this.$block.invoke();
            return Unit.INSTANCE;
        }
    }

    public PushEncoderSink(@NotNull BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint) {
        this.flashpoint = biliDispatchManagementFlaspoint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit destroy$lambda$13(PushEncoderSink pushEncoderSink) {
        pushEncoderSink.mIsDisable.set(true);
        BiliH26XParser biliH26XParser = pushEncoderSink.mBiliH26XParser;
        if (biliH26XParser != null) {
            biliH26XParser.close();
        }
        pushEncoderSink.mBiliSeiManagement.close();
        pushEncoderSink.mBiliH26XParser = null;
        pushEncoderSink.mEncoderStateCallback = null;
        try {
            CoroutineScopeKt.cancel$default(pushEncoderSink.defaultCoroutineScope, (CancellationException) null, 1, (Object) null);
        } catch (Exception e7) {
            IBiliPushLogger.logWarning$default(pushEncoderSink, C4496a.a("mPushSinkCoroutineScope cancel, exception, msg:", e7.getMessage()), null, null, e7, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAudioConfigPacket$lambda$11(PushEncoderSink pushEncoderSink, byte[] bArr, String str) {
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = pushEncoderSink.flashpoint;
        int i7 = pushEncoderSink.mAudioChannels;
        int i8 = pushEncoderSink.mAudioSampleRate;
        int i9 = pushEncoderSink.mAudioBitrate;
        int i10 = pushEncoderSink.mAudioSampleSize;
        synchronized (biliDispatchManagementFlaspoint) {
            if (biliDispatchManagementFlaspoint.f65981b != 0) {
                BiliDispatchManagementFlaspoint.a(biliDispatchManagementFlaspoint, bArr, str, i7, i8, i9, i10);
            } else {
                com.bilibili.mediastreaming.flashpoint.i.c(biliDispatchManagementFlaspoint, "nativeHandle is zero!!!!, run func:sendAudioConfig, fail!", null, 14);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAudioEncoderState$lambda$3(PushEncoderSink pushEncoderSink, String str) {
        IEncoderStateCallback iEncoderStateCallback = pushEncoderSink.mEncoderStateCallback;
        if (iEncoderStateCallback != null) {
            iEncoderStateCallback.onAudioEncoderState(0, str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAudioPacket$lambda$12(BiliAudioEncoderPacket biliAudioEncoderPacket, PushEncoderSink pushEncoderSink, String str) {
        byte[] bArr = biliAudioEncoderPacket.data;
        if (bArr == null) {
            return Unit.INSTANCE;
        }
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = pushEncoderSink.flashpoint;
        long j7 = biliAudioEncoderPacket.ptsUs;
        long j8 = biliAudioEncoderPacket.dtsUs;
        int i7 = pushEncoderSink.mAudioChannels;
        int i8 = pushEncoderSink.mAudioSampleRate;
        int i9 = pushEncoderSink.mAudioBitrate;
        int i10 = pushEncoderSink.mAudioSampleSize;
        synchronized (biliDispatchManagementFlaspoint) {
            if (biliDispatchManagementFlaspoint.f65981b != 0) {
                BiliDispatchManagementFlaspoint.f(biliDispatchManagementFlaspoint, bArr, j7, j8, str, i7, i8, i9, i10);
            } else {
                com.bilibili.mediastreaming.flashpoint.i.c(biliDispatchManagementFlaspoint, "nativeHandle is zero!!!!, run func:sendAudioPacket, fail!", null, 14);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSendAudioConfig$lambda$10(PushEncoderSink pushEncoderSink, int i7, int i8, int i9, int i10, String str) {
        pushEncoderSink.mAudioChannels = i7;
        pushEncoderSink.mAudioSampleRate = i8;
        pushEncoderSink.mAudioBitrate = i9;
        pushEncoderSink.mAudioSampleSize = i10;
        BiliDispatchManagementFlaspoint.C(pushEncoderSink.flashpoint, null, null, null, null, null, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), str, 543);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSendVideoConfig$lambda$5(PushEncoderSink pushEncoderSink, int i7, int i8, int i9, int i10, String str, boolean z6, int i11, String str2) {
        pushEncoderSink.mVideoWidth = i7;
        pushEncoderSink.mVideoHeight = i8;
        pushEncoderSink.mVideoFrameRate = i9;
        pushEncoderSink.mVideoBitrate = i10;
        pushEncoderSink.mHasDolbyVision = Intrinsics.areEqual(str, BiliPushAVCodecUtils.DOLBY_MIME);
        int iHashCode = str.hashCode();
        if (iHashCode != -1851077871) {
            if (iHashCode != -1662541442) {
                if (iHashCode == 1331836730 && str.equals(BiliPushAVCodecUtils.AVC_MIME)) {
                    pushEncoderSink.mVideoCodecType = BiliVideoCodec.AVC;
                }
            } else if (str.equals(BiliPushAVCodecUtils.HEVC_MIME)) {
                pushEncoderSink.mVideoCodecType = z6 ? BiliVideoCodec.HEVC : BiliVideoCodec.BILI_HEVC;
            }
        } else if (str.equals(BiliPushAVCodecUtils.DOLBY_MIME)) {
            pushEncoderSink.mVideoCodecType = z6 ? BiliVideoCodec.HEVC : BiliVideoCodec.BILI_HEVC;
        }
        BiliH26XParser biliH26XParser = pushEncoderSink.mBiliH26XParser;
        if (biliH26XParser == null) {
            pushEncoderSink.mBiliH26XParser = new BiliH26XParser(pushEncoderSink.mVideoCodecType, ((double) i9) * 1.0d, i11, str2);
        } else {
            String str3 = biliH26XParser.f66028b;
            BiliVideoEncoderPacket[] biliVideoEncoderPacketArrE = biliH26XParser.e(pushEncoderSink.mVideoCodecType, ((double) i9) * 1.0d, i11, str2);
            if (biliVideoEncoderPacketArrE != null) {
                for (BiliVideoEncoderPacket biliVideoEncoderPacket : biliVideoEncoderPacketArrE) {
                    byte[] bArr = biliVideoEncoderPacket.data;
                    if (bArr != null) {
                        pushEncoderSink.flashpoint.t(bArr, biliVideoEncoderPacket.isKeyFrame, biliVideoEncoderPacket.ptsUs, biliVideoEncoderPacket.dtsUs, str3, pushEncoderSink.mVideoWidth, pushEncoderSink.mVideoHeight, pushEncoderSink.mVideoFrameRate, pushEncoderSink.mVideoBitrate, pushEncoderSink.mHasDolbyVision);
                    }
                }
            }
        }
        pushEncoderSink.flashpoint.u(pushEncoderSink.mVideoCodecType);
        BiliDispatchManagementFlaspoint.C(pushEncoderSink.flashpoint, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), str2, null, null, null, null, 992);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onVideoConfigPacket$lambda$6(PushEncoderSink pushEncoderSink, byte[] bArr, String str) {
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = pushEncoderSink.flashpoint;
        int i7 = pushEncoderSink.mVideoWidth;
        int i8 = pushEncoderSink.mVideoHeight;
        int i9 = pushEncoderSink.mVideoFrameRate;
        int i10 = pushEncoderSink.mVideoBitrate;
        boolean z6 = pushEncoderSink.mHasDolbyVision;
        synchronized (biliDispatchManagementFlaspoint) {
            if (biliDispatchManagementFlaspoint.f65981b != 0) {
                BiliDispatchManagementFlaspoint.h(biliDispatchManagementFlaspoint, bArr, str, i7, i8, i9, i10, z6);
            } else {
                com.bilibili.mediastreaming.flashpoint.i.c(biliDispatchManagementFlaspoint, "nativeHandle is zero!!!!, run func:sendVideoConfig, fail!", null, 14);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onVideoEncoderState$lambda$2(PushEncoderSink pushEncoderSink, VideoEncodeState videoEncodeState, String str) {
        IEncoderStateCallback iEncoderStateCallback = pushEncoderSink.mEncoderStateCallback;
        if (iEncoderStateCallback != null) {
            iEncoderStateCallback.onVideoEncoderState(videoEncodeState, str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onVideoPacket$lambda$9(BiliVideoEncoderPacket biliVideoEncoderPacket, boolean z6, PushEncoderSink pushEncoderSink, String str) {
        IBiliSeiInKeyFrameInterface iBiliSeiInKeyFrameInterface;
        byte[] bArr = biliVideoEncoderPacket.data;
        if (bArr == null) {
            return Unit.INSTANCE;
        }
        if (z6) {
            BiliH26XParser biliH26XParser = pushEncoderSink.mBiliH26XParser;
            if (biliH26XParser == null) {
                return Unit.INSTANCE;
            }
            List<BiliSeiBuffer> listG = pushEncoderSink.mBiliSeiManagement.g(pushEncoderSink.mVideoCodecType);
            if (biliVideoEncoderPacket.isKeyFrame && (iBiliSeiInKeyFrameInterface = pushEncoderSink.mSeiInKeyFrameInterface) != null) {
                ArrayList<Pair<String, byte[]>> keyFrameSei = iBiliSeiInKeyFrameInterface.getKeyFrameSei(biliVideoEncoderPacket.ptsUs);
                BiliSeiGenerate biliSeiGenerate = BiliSeiGenerate.f66030a;
                BiliVideoCodec biliVideoCodec = pushEncoderSink.mVideoCodecType;
                biliSeiGenerate.getClass();
                BiliSeiBuffer[] biliSeiBufferArrA = BiliSeiGenerate.a(keyFrameSei, biliVideoCodec);
                if (biliSeiBufferArrA != null && listG != null) {
                    CollectionsKt.e(listG, biliSeiBufferArrA);
                }
            }
            BiliVideoEncoderPacket[] biliVideoEncoderPacketArrD = biliH26XParser.d(listG != null ? (BiliSeiBuffer[]) listG.toArray(new BiliSeiBuffer[0]) : null, bArr, biliVideoEncoderPacket.isKeyFrame, biliVideoEncoderPacket.ptsUs);
            if (biliVideoEncoderPacketArrD != null) {
                for (BiliVideoEncoderPacket biliVideoEncoderPacket2 : biliVideoEncoderPacketArrD) {
                    byte[] bArr2 = biliVideoEncoderPacket2.data;
                    if (bArr2 != null) {
                        pushEncoderSink.flashpoint.t(bArr2, biliVideoEncoderPacket2.isKeyFrame, biliVideoEncoderPacket2.ptsUs, biliVideoEncoderPacket2.dtsUs, str, pushEncoderSink.mVideoWidth, pushEncoderSink.mVideoHeight, pushEncoderSink.mVideoFrameRate, pushEncoderSink.mVideoBitrate, pushEncoderSink.mHasDolbyVision);
                    }
                }
            }
        } else {
            pushEncoderSink.flashpoint.t(bArr, biliVideoEncoderPacket.isKeyFrame, biliVideoEncoderPacket.ptsUs, biliVideoEncoderPacket.dtsUs, str, pushEncoderSink.mVideoWidth, pushEncoderSink.mVideoHeight, pushEncoderSink.mVideoFrameRate, pushEncoderSink.mVideoBitrate, pushEncoderSink.mHasDolbyVision);
        }
        return Unit.INSTANCE;
    }

    private final void runOnPushSinkCoroutine(String str, Function0<Unit> function0) {
        if (this.mIsDisable.get()) {
            return;
        }
        BuildersKt.launch$default(this.defaultCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(function0, null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEncoderStateCallback$lambda$0(PushEncoderSink pushEncoderSink, IEncoderStateCallback iEncoderStateCallback) {
        pushEncoderSink.mEncoderStateCallback = iEncoderStateCallback;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSeiInKeyFrameInterface$lambda$1(PushEncoderSink pushEncoderSink, IBiliSeiInKeyFrameInterface iBiliSeiInKeyFrameInterface) {
        pushEncoderSink.mSeiInKeyFrameInterface = iBiliSeiInKeyFrameInterface;
        return Unit.INSTANCE;
    }

    public final void appendSei(@NotNull String str, @NotNull byte[] bArr) {
        if (this.mIsDisable.get()) {
            return;
        }
        this.mBiliSeiManagement.d(str, bArr);
    }

    public final void destroy() {
        if (this.mIsDisable.get()) {
            return;
        }
        runOnPushSinkCoroutine("close", new Xz.j(this, 1));
    }

    public final void disableSeiWrite() {
        if (this.mIsDisable.get()) {
            return;
        }
        this.mBiliSeiManagement.e();
    }

    public final void enableSeiWrite() {
        if (this.mIsDisable.get()) {
            return;
        }
        this.mBiliSeiManagement.f();
    }

    @NotNull
    public final BiliDispatchManagementFlaspoint getFlashpoint() {
        return this.flashpoint;
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

    @Override // com.bilibili.live.streaming.encoder.IAudioEncoderCallback
    public void onAudioConfigPacket(@NotNull byte[] bArr, @NotNull String str) {
        runOnPushSinkCoroutine("onAudioConfigPacket", new h(this, bArr, str));
    }

    @Override // com.bilibili.live.streaming.encoder.IAudioEncoderCallback
    public void onAudioEncoderState(@NotNull final String str) {
        final int i7 = 0;
        runOnPushSinkCoroutine("onVideoEncoderState", new Function0(i7, this, str) { // from class: com.bilibili.live.streaming.encoder.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65275a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f65276b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f65277c;

            {
                this.f65275a = i7;
                this.f65276b = this;
                this.f65277c = str;
            }

            public final Object invoke() {
                switch (this.f65275a) {
                    case 0:
                        return PushEncoderSink.onAudioEncoderState$lambda$3((PushEncoderSink) this.f65276b, (String) this.f65277c);
                    default:
                        ((OuroStore) this.f65276b).a(s.b);
                        ((Function2) this.f65277c).invoke(TextStylePanelEvent.H2, Boolean.TRUE);
                        return Unit.INSTANCE;
                }
            }
        });
    }

    @Override // com.bilibili.live.streaming.encoder.IAudioEncoderCallback
    public void onAudioPacket(@NotNull final BiliAudioEncoderPacket biliAudioEncoderPacket, @NotNull final String str) {
        runOnPushSinkCoroutine("onAudioPacket", new Function0(biliAudioEncoderPacket, this, str) { // from class: com.bilibili.live.streaming.encoder.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioEncoderPacket f65282a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PushEncoderSink f65283b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f65284c;

            {
                this.f65282a = biliAudioEncoderPacket;
                this.f65283b = this;
                this.f65284c = str;
            }

            public final Object invoke() {
                return PushEncoderSink.onAudioPacket$lambda$12(this.f65282a, this.f65283b, this.f65284c);
            }
        });
    }

    @Override // com.bilibili.live.streaming.encoder.IAudioEncoderCallback
    public void onSendAudioConfig(final int i7, final int i8, final int i9, final int i10, @NotNull final String str) {
        runOnPushSinkCoroutine("onSendAudioConfig", new Function0(this, i7, i8, i9, i10, str) { // from class: com.bilibili.live.streaming.encoder.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PushEncoderSink f65261a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f65262b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f65263c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f65264d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f65265e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f65266f;

            {
                this.f65261a = this;
                this.f65262b = i7;
                this.f65263c = i8;
                this.f65264d = i9;
                this.f65265e = i10;
                this.f65266f = str;
            }

            public final Object invoke() {
                return PushEncoderSink.onSendAudioConfig$lambda$10(this.f65261a, this.f65262b, this.f65263c, this.f65264d, this.f65265e, this.f65266f);
            }
        });
    }

    @Override // com.bilibili.live.streaming.encoder.IVideoEncoderCallback
    public void onSendVideoConfig(final int i7, final int i8, final int i9, final int i10, final int i11, @NotNull final String str, @NotNull final String str2, final boolean z6) {
        runOnPushSinkCoroutine("onSendVideoConfig", new Function0(this, i7, i8, i9, i10, str2, z6, i11, str) { // from class: com.bilibili.live.streaming.encoder.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PushEncoderSink f65267a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f65268b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f65269c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f65270d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f65271e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f65272f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f65273g;
            public final int h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final String f65274i;

            {
                this.f65267a = this;
                this.f65268b = i7;
                this.f65269c = i8;
                this.f65270d = i9;
                this.f65271e = i10;
                this.f65272f = str2;
                this.f65273g = z6;
                this.h = i11;
                this.f65274i = str;
            }

            public final Object invoke() {
                return PushEncoderSink.onSendVideoConfig$lambda$5(this.f65267a, this.f65268b, this.f65269c, this.f65270d, this.f65271e, this.f65272f, this.f65273g, this.h, this.f65274i);
            }
        });
    }

    @Override // com.bilibili.live.streaming.encoder.IVideoEncoderCallback
    public void onVideoConfigPacket(@NotNull byte[] bArr, @NotNull String str) {
        runOnPushSinkCoroutine("onVideoConfigPacket", new B(this, 1, bArr, str));
    }

    @Override // com.bilibili.live.streaming.encoder.IVideoEncoderCallback
    public void onVideoEncoderState(@NotNull VideoEncodeState videoEncodeState, @NotNull String str) {
        runOnPushSinkCoroutine("onVideoEncoderState", new F(this, 1, videoEncodeState, str));
    }

    @Override // com.bilibili.live.streaming.encoder.IVideoEncoderCallback
    public void onVideoPacket(@NotNull final BiliVideoEncoderPacket biliVideoEncoderPacket, final boolean z6, @NotNull final String str) {
        runOnPushSinkCoroutine("onVideoPacket", new Function0(biliVideoEncoderPacket, z6, this, str) { // from class: com.bilibili.live.streaming.encoder.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliVideoEncoderPacket f65285a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f65286b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final PushEncoderSink f65287c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f65288d;

            {
                this.f65285a = biliVideoEncoderPacket;
                this.f65286b = z6;
                this.f65287c = this;
                this.f65288d = str;
            }

            public final Object invoke() {
                return PushEncoderSink.onVideoPacket$lambda$9(this.f65285a, this.f65286b, this.f65287c, this.f65288d);
            }
        });
    }

    public final void setEncoderStateCallback(@Nullable final IEncoderStateCallback iEncoderStateCallback) {
        runOnPushSinkCoroutine("setEncoderStateCallback", new Function0(this, iEncoderStateCallback) { // from class: com.bilibili.live.streaming.encoder.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PushEncoderSink f65259a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final IEncoderStateCallback f65260b;

            {
                this.f65259a = this;
                this.f65260b = iEncoderStateCallback;
            }

            public final Object invoke() {
                return PushEncoderSink.setEncoderStateCallback$lambda$0(this.f65259a, this.f65260b);
            }
        });
    }

    public final void setSeiInKeyFrameInterface(@Nullable IBiliSeiInKeyFrameInterface iBiliSeiInKeyFrameInterface) {
        runOnPushSinkCoroutine("setSeiInKeyFrameInterface", new J(1, this, iBiliSeiInKeyFrameInterface));
    }
}
