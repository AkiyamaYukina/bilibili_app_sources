package com.bilibili.live.streaming;

import com.bilibili.live.streaming.encoder.EncoderConfig;
import com.bilibili.live.streaming.encoder.audio.BiliAudioEncoderOutput;
import com.bilibili.live.streaming.log.LivePusherLog;
import com.bilibili.mediastreaming.audio.IBiliAudioLoggerObserver;
import com.bilibili.mediastreaming.audio.starlight.BiliAudioMixer;
import com.bilibili.mediastreaming.audio.track.BiliATrainTrack;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import nh0.InterfaceC8094b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/AudioSessionV2.class */
public final class AudioSessionV2 implements InterfaceC8094b {
    private final com.bilibili.mediastreaming.audio.b $$delegate_0 = new com.bilibili.mediastreaming.audio.b("AudioSessionV2");

    @NotNull
    private EncoderConfig encoderConfig;

    @NotNull
    private BiliATrainTrack mATrainTrack;

    @NotNull
    private BiliAudioMixer mAudioMixer;

    @Nullable
    private BiliAudioEncoderOutput mAudioOutputEncoder;

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.live.streaming.AudioSessionV2$1] */
    public AudioSessionV2(@NotNull EncoderManager encoderManager) {
        this.encoderConfig = encoderManager.getEncoderConfig$BiliLivePushStreaming_release();
        BiliAudioMixer biliAudioMixer = new BiliAudioMixer();
        this.mAudioMixer = biliAudioMixer;
        this.mATrainTrack = new BiliATrainTrack(biliAudioMixer, this.encoderConfig.getSampleRateInHz(), this.encoderConfig.getChannelCount());
        com.bilibili.mediastreaming.audio.a.f65700a = new IBiliAudioLoggerObserver() { // from class: com.bilibili.live.streaming.AudioSessionV2.1

            /* JADX INFO: renamed from: com.bilibili.live.streaming.AudioSessionV2$1$WhenMappings */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/AudioSessionV2$1$WhenMappings.class */
            public static final /* synthetic */ class WhenMappings {
                public static final int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[IBiliAudioLoggerObserver.Severity.values().length];
                    try {
                        iArr[IBiliAudioLoggerObserver.Severity.LS_VERBOSE.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    try {
                        iArr[IBiliAudioLoggerObserver.Severity.LS_DEBUG.ordinal()] = 2;
                    } catch (NoSuchFieldError e8) {
                    }
                    try {
                        iArr[IBiliAudioLoggerObserver.Severity.LS_INFO.ordinal()] = 3;
                    } catch (NoSuchFieldError e9) {
                    }
                    try {
                        iArr[IBiliAudioLoggerObserver.Severity.LS_WARNING.ordinal()] = 4;
                    } catch (NoSuchFieldError e10) {
                    }
                    try {
                        iArr[IBiliAudioLoggerObserver.Severity.LS_ERROR.ordinal()] = 5;
                    } catch (NoSuchFieldError e11) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.bilibili.mediastreaming.audio.IBiliAudioLoggerObserver
            public void onLogMessage(IBiliAudioLoggerObserver.Severity severity, String str, String str2, Throwable th) {
                if (str2 == null) {
                    return;
                }
                String str3 = str;
                if (str == null) {
                    str3 = "AudioSessionV2";
                }
                int i7 = WhenMappings.$EnumSwitchMapping$0[severity.ordinal()];
                if (i7 == 1) {
                    LivePusherLog.v(str3, str2, th);
                    return;
                }
                if (i7 == 2) {
                    LivePusherLog.d(str3, str2, th);
                    return;
                }
                if (i7 == 3) {
                    LivePusherLog.i(str3, str2, th);
                    return;
                }
                if (i7 == 4) {
                    LivePusherLog.w(str3, str2, th);
                } else if (i7 != 5) {
                    LivePusherLog.d(str3, str2, th);
                } else {
                    LivePusherLog.e(str3, str2, th);
                }
            }
        };
    }

    public final boolean addInputTrack(@NotNull com.bilibili.mediastreaming.audio.track.Y y6) {
        return this.mAudioMixer.h(y6) == 0;
    }

    @Nullable
    public final Boolean addMixTrack(@NotNull com.bilibili.mediastreaming.audio.track.Y y6) {
        BiliAudioEncoderOutput biliAudioEncoderOutput = this.mAudioOutputEncoder;
        return biliAudioEncoderOutput != null ? Boolean.valueOf(biliAudioEncoderOutput.addMixTrack(y6)) : null;
    }

    public final boolean addOutputSink(@NotNull com.bilibili.mediastreaming.audio.output.q qVar) {
        return this.mAudioMixer.i(qVar) == 0;
    }

    public final boolean clearInputTracks() {
        BiliAudioMixer biliAudioMixer = this.mAudioMixer;
        biliAudioMixer.getClass();
        Integer numD = biliAudioMixer.f65773b == 0 ? null : BiliAudioMixer.d(biliAudioMixer);
        return (numD != null ? numD.intValue() : -1) == 0;
    }

    @Nullable
    public final Boolean clearMixTrack() {
        BiliAudioEncoderOutput biliAudioEncoderOutput = this.mAudioOutputEncoder;
        return biliAudioEncoderOutput != null ? Boolean.valueOf(biliAudioEncoderOutput.clearMixTracks()) : null;
    }

    public final boolean clearOutputSinks() {
        BiliAudioMixer biliAudioMixer = this.mAudioMixer;
        biliAudioMixer.getClass();
        Integer numF = biliAudioMixer.f65773b == 0 ? null : BiliAudioMixer.f(biliAudioMixer);
        boolean z6 = false;
        if ((numF != null ? numF.intValue() : 0) == 0) {
            z6 = true;
        }
        return z6;
    }

    @Nullable
    public final Float getAudioDurationS() {
        BiliAudioEncoderOutput biliAudioEncoderOutput = this.mAudioOutputEncoder;
        return biliAudioEncoderOutput != null ? Float.valueOf(biliAudioEncoderOutput.getAudioDurationS()) : null;
    }

    @Nullable
    public final Float getEncoderLeftVolume() {
        BiliAudioEncoderOutput biliAudioEncoderOutput = this.mAudioOutputEncoder;
        return biliAudioEncoderOutput != null ? Float.valueOf(biliAudioEncoderOutput.getLeftVolume()) : null;
    }

    @Nullable
    public final Float getEncoderRightVolume() {
        BiliAudioEncoderOutput biliAudioEncoderOutput = this.mAudioOutputEncoder;
        return biliAudioEncoderOutput != null ? Float.valueOf(biliAudioEncoderOutput.getRightVolume()) : null;
    }

    @Nullable
    public final List<com.bilibili.mediastreaming.audio.track.Y> getMixTrackList() {
        BiliAudioEncoderOutput biliAudioEncoderOutput = this.mAudioOutputEncoder;
        return biliAudioEncoderOutput != null ? biliAudioEncoderOutput.getMixTrackList() : null;
    }

    public void logDebug(@NotNull Function0<String> function0, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        this.$$delegate_0.d(function0, str, str2, th);
    }

    @Override // nh0.InterfaceC8094b
    public void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.$$delegate_0.logError(str, str2, str3, th);
    }

    @Override // nh0.InterfaceC8094b
    public void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.$$delegate_0.logInfo(str, str2, str3, th);
    }

    public void logVerbose(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.$$delegate_0.e(str, str2, str3, th);
    }

    @Override // nh0.InterfaceC8094b
    public void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.$$delegate_0.logWarning(str, str2, str3, th);
    }

    public final void release() {
        InterfaceC8094b.b(this, "release!", null, 14);
        BiliATrainTrack biliATrainTrack = this.mATrainTrack;
        biliATrainTrack.getClass();
        Function0<Unit> n7 = new b60.N<>(biliATrainTrack, 5);
        com.bilibili.mediastreaming.audio.croutine.d dVar = biliATrainTrack.f65783c;
        dVar.f("release", n7);
        dVar.d();
        BiliAudioMixer biliAudioMixer = this.mAudioMixer;
        if (biliAudioMixer.f65773b != 0) {
            BiliAudioMixer.e(biliAudioMixer);
        }
        this.mAudioOutputEncoder = null;
        InterfaceC8094b.b(this, "release done!", null, 14);
        com.bilibili.mediastreaming.audio.a.f65700a = null;
    }

    public final boolean removeInputTrack(@NotNull com.bilibili.mediastreaming.audio.track.Y y6) {
        return this.mAudioMixer.j(y6) == 0;
    }

    @Nullable
    public final Boolean removeMixTrack(@NotNull com.bilibili.mediastreaming.audio.track.Y y6) {
        BiliAudioEncoderOutput biliAudioEncoderOutput = this.mAudioOutputEncoder;
        return biliAudioEncoderOutput != null ? Boolean.valueOf(biliAudioEncoderOutput.removeMixTrack(y6)) : null;
    }

    public final boolean removeOutputSink(@NotNull com.bilibili.mediastreaming.audio.output.q qVar) {
        return this.mAudioMixer.k(qVar) == 0;
    }

    public final void setATrainTrackLoopIntervalTimeMs(final int i7) {
        final BiliATrainTrack biliATrainTrack = this.mATrainTrack;
        biliATrainTrack.getClass();
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        biliATrainTrack.f65783c.f("setLoopIntervalTimeMs", new Function0(biliATrainTrack, i7, intRef) { // from class: com.bilibili.mediastreaming.audio.track.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliATrainTrack f65884a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f65885b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Ref.IntRef f65886c;

            {
                this.f65884a = biliATrainTrack;
                this.f65885b = i7;
                this.f65886c = intRef;
            }

            public final Object invoke() {
                return BiliATrainTrack.g(this.f65884a, this.f65885b, this.f65886c);
            }
        });
    }

    public final void setAudioOutputEncoder(@NotNull BiliAudioEncoderOutput biliAudioEncoderOutput) {
        this.mAudioOutputEncoder = biliAudioEncoderOutput;
        if (biliAudioEncoderOutput != null) {
            this.mAudioMixer.i(biliAudioEncoderOutput);
        }
    }

    public final void setDebugCacheDirPath(@NotNull String str) {
        BiliAudioMixer biliAudioMixer = this.mAudioMixer;
        biliAudioMixer.getClass();
        if (biliAudioMixer.f65773b == 0) {
            return;
        }
        BiliAudioMixer.g(biliAudioMixer, str);
    }

    @Nullable
    public final Boolean setEncoderVolume(float f7) {
        BiliAudioEncoderOutput biliAudioEncoderOutput = this.mAudioOutputEncoder;
        return biliAudioEncoderOutput != null ? Boolean.valueOf(biliAudioEncoderOutput.setVolume(f7)) : null;
    }

    public final void start() {
        final BiliATrainTrack biliATrainTrack = this.mATrainTrack;
        biliATrainTrack.getClass();
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        biliATrainTrack.f65783c.f("start", new Function0(biliATrainTrack, intRef) { // from class: com.bilibili.mediastreaming.audio.track.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliATrainTrack f65879a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.IntRef f65880b;

            {
                this.f65879a = biliATrainTrack;
                this.f65880b = intRef;
            }

            public final Object invoke() {
                return BiliATrainTrack.d(this.f65879a, this.f65880b);
            }
        });
    }

    public final void stop() {
        InterfaceC8094b.b(this, "stop...", null, 14);
        this.mATrainTrack.h();
        InterfaceC8094b.b(this, "stop done!", null, 14);
    }
}
