package com.bilibili.mediastreaming.audio.track;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Process;
import androidx.appcompat.widget.C3259x;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import nh0.C8093a;
import nh0.InterfaceC8094b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/BiliAudioRecordTrack.class */
public final class BiliAudioRecordTrack extends BiliAudioTrack {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public iC.f f65787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public b f65788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public AudioRecord f65789k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public ByteBuffer f65790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f65791m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f65792n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f65793o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f65794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f65795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public AudioDeviceInfo f65796r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final AudioManager f65797s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public a f65798t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public AudioFocusRequest f65799u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public C8093a f65800v;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/BiliAudioRecordTrack$a.class */
    public final class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliAudioRecordTrack f65801a;

        public a(BiliAudioRecordTrack biliAudioRecordTrack) {
            this.f65801a = biliAudioRecordTrack;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i7) {
            if (i7 == -3) {
                InterfaceC8094b.b(this.f65801a, "focusChange: AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK", null, 14);
                return;
            }
            if (i7 == -2) {
                InterfaceC8094b.b(this.f65801a, "focusChange: AudioManager.AUDIOFOCUS_LOSS_TRANSIENT", null, 14);
            } else if (i7 == -1) {
                InterfaceC8094b.b(this.f65801a, "focusChange: AudioManager.AUDIOFOCUS_LOSS", null, 14);
            } else {
                if (i7 != 1) {
                    return;
                }
                InterfaceC8094b.b(this.f65801a, "focusChange: AudioManager.AUDIOFOCUS_GAIN", null, 14);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/BiliAudioRecordTrack$b.class */
    public final class b extends Thread implements InterfaceC8094b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.mediastreaming.audio.b f65802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final AtomicBoolean f65803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BiliAudioRecordTrack f65804c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BiliAudioRecordTrack biliAudioRecordTrack) {
            super("BiliAudioRecordTrackThread");
            this.f65804c = biliAudioRecordTrack;
            this.f65802a = new com.bilibili.mediastreaming.audio.b("BiliAudioRecordTrackThread");
            this.f65803b = new AtomicBoolean(true);
        }

        @Override // nh0.InterfaceC8094b
        public final void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
            this.f65802a.logError(str, str2, str3, th);
        }

        @Override // nh0.InterfaceC8094b
        public final void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
            this.f65802a.logInfo(str, str2, str3, th);
        }

        @Override // nh0.InterfaceC8094b
        public final void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
            this.f65802a.logWarning(str, str2, str3, th);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            BiliAudioRecordTrack biliAudioRecordTrack;
            AudioRecord audioRecord;
            Process.setThreadPriority(-19);
            InterfaceC8094b.b(this, android.support.v4.media.a.a("BiliAudioRecordStreamThread:", getName(), " run...."), null, 14);
            while (this.f65803b.get()) {
                try {
                    BiliAudioRecordTrack biliAudioRecordTrack2 = this.f65804c;
                    if (biliAudioRecordTrack2.f65789k == null) {
                        biliAudioRecordTrack2.H(new E(biliAudioRecordTrack2, 0));
                    }
                    biliAudioRecordTrack = this.f65804c;
                    audioRecord = biliAudioRecordTrack.f65789k;
                } catch (Exception e7) {
                    InterfaceC8094b.c(this, "audioRecord read data error, msg: " + e7.getMessage(), e7, 6);
                    this.f65803b.set(false);
                    AudioRecord audioRecord2 = this.f65804c.f65789k;
                    if (audioRecord2 != null) {
                        audioRecord2.stop();
                    }
                    AudioRecord audioRecord3 = this.f65804c.f65789k;
                    if (audioRecord3 != null) {
                        audioRecord3.release();
                    }
                    this.f65804c.f65789k = null;
                }
                if (audioRecord == null) {
                    break;
                }
                ByteBuffer byteBuffer = biliAudioRecordTrack.f65790l;
                final int i7 = audioRecord.read(byteBuffer, byteBuffer.capacity());
                if (i7 != byteBuffer.capacity()) {
                    final String str = "record.read result:" + i7 + " so stop record!";
                    InterfaceC8094b.c(this, str, null, 14);
                    this.f65803b.set(false);
                    AudioRecord audioRecord4 = this.f65804c.f65789k;
                    if (audioRecord4 != null) {
                        audioRecord4.stop();
                    }
                    AudioRecord audioRecord5 = this.f65804c.f65789k;
                    if (audioRecord5 != null) {
                        audioRecord5.release();
                    }
                    BiliAudioRecordTrack biliAudioRecordTrack3 = this.f65804c;
                    biliAudioRecordTrack3.f65789k = null;
                    biliAudioRecordTrack3.D();
                    if (i7 == -6) {
                        final BiliAudioRecordTrack biliAudioRecordTrack4 = this.f65804c;
                        biliAudioRecordTrack4.H(new Function0(biliAudioRecordTrack4, str, i7) { // from class: com.bilibili.mediastreaming.audio.track.I

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final BiliAudioRecordTrack f65828a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final String f65829b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final int f65830c;

                            {
                                this.f65828a = biliAudioRecordTrack4;
                                this.f65829b = str;
                                this.f65830c = i7;
                            }

                            public final Object invoke() {
                                BiliAudioRecordTrack biliAudioRecordTrack5 = this.f65828a;
                                iC.f fVar = biliAudioRecordTrack5.f65787i;
                                String str2 = this.f65829b;
                                int i8 = this.f65830c;
                                if (fVar != null) {
                                    fVar.b(str2 + ": ERROR_DEAD_OBJECT", i8, (C8093a) null);
                                }
                                iC.f fVar2 = biliAudioRecordTrack5.f65787i;
                                if (fVar2 != null) {
                                    fVar2.a(i8, str2 + ": ERROR_DEAD_OBJECT");
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    } else if (i7 == -3) {
                        final BiliAudioRecordTrack biliAudioRecordTrack5 = this.f65804c;
                        biliAudioRecordTrack5.H(new Function0(biliAudioRecordTrack5, str, i7) { // from class: com.bilibili.mediastreaming.audio.track.F

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final BiliAudioRecordTrack f65819a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final String f65820b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final int f65821c;

                            {
                                this.f65819a = biliAudioRecordTrack5;
                                this.f65820b = str;
                                this.f65821c = i7;
                            }

                            public final Object invoke() {
                                BiliAudioRecordTrack biliAudioRecordTrack6 = this.f65819a;
                                iC.f fVar = biliAudioRecordTrack6.f65787i;
                                String str2 = this.f65820b;
                                int i8 = this.f65821c;
                                if (fVar != null) {
                                    fVar.b(str2 + ": ERROR_INVALID_OPERATION", i8, (C8093a) null);
                                }
                                iC.f fVar2 = biliAudioRecordTrack6.f65787i;
                                if (fVar2 != null) {
                                    fVar2.a(i8, str2 + ": ERROR_INVALID_OPERATION");
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    } else if (i7 == -2) {
                        final BiliAudioRecordTrack biliAudioRecordTrack6 = this.f65804c;
                        biliAudioRecordTrack6.H(new Function0(biliAudioRecordTrack6, str, i7) { // from class: com.bilibili.mediastreaming.audio.track.G

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final BiliAudioRecordTrack f65822a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final String f65823b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final int f65824c;

                            {
                                this.f65822a = biliAudioRecordTrack6;
                                this.f65823b = str;
                                this.f65824c = i7;
                            }

                            public final Object invoke() {
                                BiliAudioRecordTrack biliAudioRecordTrack7 = this.f65822a;
                                iC.f fVar = biliAudioRecordTrack7.f65787i;
                                String str2 = this.f65823b;
                                int i8 = this.f65824c;
                                if (fVar != null) {
                                    fVar.b(str2 + ": ERROR_BAD_VALUE", i8, (C8093a) null);
                                }
                                iC.f fVar2 = biliAudioRecordTrack7.f65787i;
                                if (fVar2 != null) {
                                    fVar2.a(i8, str2 + ": ERROR_BAD_VALUE");
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    } else if (i7 != -1) {
                        final BiliAudioRecordTrack biliAudioRecordTrack7 = this.f65804c;
                        biliAudioRecordTrack7.H(new Function0(biliAudioRecordTrack7, str, i7) { // from class: com.bilibili.mediastreaming.audio.track.J

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final BiliAudioRecordTrack f65831a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final String f65832b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final int f65833c;

                            {
                                this.f65831a = biliAudioRecordTrack7;
                                this.f65832b = str;
                                this.f65833c = i7;
                            }

                            public final Object invoke() {
                                BiliAudioRecordTrack biliAudioRecordTrack8 = this.f65831a;
                                iC.f fVar = biliAudioRecordTrack8.f65787i;
                                String str2 = this.f65832b;
                                int i8 = this.f65833c;
                                if (fVar != null) {
                                    fVar.b(str2 + ": unknown...", i8, (C8093a) null);
                                }
                                iC.f fVar2 = biliAudioRecordTrack8.f65787i;
                                if (fVar2 != null) {
                                    fVar2.a(i8, str2 + ": unknown...");
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    } else {
                        final BiliAudioRecordTrack biliAudioRecordTrack8 = this.f65804c;
                        biliAudioRecordTrack8.H(new Function0(biliAudioRecordTrack8, str, i7) { // from class: com.bilibili.mediastreaming.audio.track.H

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final BiliAudioRecordTrack f65825a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final String f65826b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final int f65827c;

                            {
                                this.f65825a = biliAudioRecordTrack8;
                                this.f65826b = str;
                                this.f65827c = i7;
                            }

                            public final Object invoke() {
                                BiliAudioRecordTrack biliAudioRecordTrack9 = this.f65825a;
                                iC.f fVar = biliAudioRecordTrack9.f65787i;
                                String str2 = this.f65826b;
                                int i8 = this.f65827c;
                                if (fVar != null) {
                                    fVar.b(str2 + ": ERROR", i8, (C8093a) null);
                                }
                                iC.f fVar2 = biliAudioRecordTrack9.f65787i;
                                if (fVar2 != null) {
                                    fVar2.a(i8, str2 + ": ERROR");
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                } else {
                    int channelCount = (i7 / audioRecord.getChannelCount()) / this.f65804c.F();
                    long jCurrentTimeMillis = System.currentTimeMillis() * ((long) 1000);
                    BiliAudioRecordTrack biliAudioRecordTrack9 = this.f65804c;
                    int i8 = biliAudioRecordTrack9.f65793o;
                    if (i8 == 4) {
                        biliAudioRecordTrack9.sendAudioLenF32(i7, channelCount, audioRecord.getChannelCount(), audioRecord.getSampleRate(), jCurrentTimeMillis);
                    } else if (i8 == 2) {
                        biliAudioRecordTrack9.sendAudioLenS16(i7, channelCount, audioRecord.getChannelCount(), audioRecord.getSampleRate(), jCurrentTimeMillis);
                    }
                    byteBuffer.clear();
                }
            }
            InterfaceC8094b.b(this, "BiliAudioRecordStreamThread run done!!!", null, 14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliAudioRecordTrack(@NotNull Context context) {
        super("BLiveAudioRecordSource", false, "BiliAudioRecordTrack");
        boolean z6 = false;
        this.f65790l = ByteBuffer.allocateDirect(0);
        this.f65791m = 2;
        this.f65792n = 12;
        this.f65793o = 2;
        this.f65794p = 1;
        this.f65795q = 48000;
        this.f65797s = (AudioManager) context.getSystemService("audio");
        setChildReleaseCoroutine(true);
        InterfaceC8094b.b(this, "handler is zero?:" + (getHandle() == 0 ? true : z6), null, 14);
        setHandle(nativeInit("BLiveAudioRecordSource", this));
        startCallback();
    }

    public static Boolean A(BiliAudioRecordTrack biliAudioRecordTrack) {
        boolean z6;
        if (biliAudioRecordTrack.getHandle() == 0) {
            InterfaceC8094b.b(biliAudioRecordTrack, "handle is zero!", null, 14);
            z6 = false;
        } else {
            biliAudioRecordTrack.nativeEnableDebug(biliAudioRecordTrack.getHandle());
            z6 = true;
        }
        return Boolean.valueOf(z6);
    }

    public static Integer B(BiliAudioRecordTrack biliAudioRecordTrack, boolean z6) {
        int iNativeAudioEffectIsAGC;
        InterfaceC8094b.b(biliAudioRecordTrack, com.bilibili.app.comm.bh.x5.a.a("setAudioEffectAGC,handle is zero?:", ", isEnable:", biliAudioRecordTrack.getHandle() == 0, z6), null, 14);
        if (biliAudioRecordTrack.getHandle() == 0) {
            InterfaceC8094b.a(biliAudioRecordTrack, "handle is zero!!!", null, null, 14);
            iNativeAudioEffectIsAGC = -1;
        } else {
            iNativeAudioEffectIsAGC = biliAudioRecordTrack.nativeAudioEffectIsAGC(biliAudioRecordTrack.getHandle(), z6);
        }
        return Integer.valueOf(iNativeAudioEffectIsAGC);
    }

    public static Unit C(BiliAudioRecordTrack biliAudioRecordTrack) {
        InterfaceC8094b.b(biliAudioRecordTrack, "audio release....", null, 14);
        super.release();
        InterfaceC8094b.b(biliAudioRecordTrack, "audio release done!", null, 14);
        return Unit.INSTANCE;
    }

    private final native int nativeAudioEffectIsAGC(long j7, boolean z6);

    private final native int nativeAudioEffectIsANS(long j7, int i7, boolean z6);

    private final native int nativeAudioEffectIsRunning(long j7, boolean z6);

    private final native void nativeEnableDebug(long j7);

    private final native long nativeInit(String str, BiliAudioRecordTrack biliAudioRecordTrack);

    public static Integer y(BiliAudioRecordTrack biliAudioRecordTrack, boolean z6) {
        int iNativeAudioEffectIsANS;
        InterfaceC8094b.b(biliAudioRecordTrack, com.bilibili.app.comm.bh.x5.a.a("setAudioEffectANS,handle is zero?:", ", isRnnoise:true, isEnable:", biliAudioRecordTrack.getHandle() == 0, z6), null, 14);
        if (biliAudioRecordTrack.getHandle() == 0) {
            InterfaceC8094b.a(biliAudioRecordTrack, "handle is zero!!!", null, null, 14);
            iNativeAudioEffectIsANS = -1;
        } else {
            iNativeAudioEffectIsANS = biliAudioRecordTrack.nativeAudioEffectIsANS(biliAudioRecordTrack.getHandle(), 2, z6);
        }
        return Integer.valueOf(iNativeAudioEffectIsANS);
    }

    public static Integer z(BiliAudioRecordTrack biliAudioRecordTrack, boolean z6) {
        int iNativeAudioEffectIsRunning;
        InterfaceC8094b.b(biliAudioRecordTrack, com.bilibili.app.comm.bh.x5.a.a("setAudioEffectIsRunning,handle is zero?:", ", isRunning:", biliAudioRecordTrack.getHandle() == 0, z6), null, 14);
        if (biliAudioRecordTrack.getHandle() == 0) {
            InterfaceC8094b.a(biliAudioRecordTrack, "handle is zero!!!", null, null, 14);
            iNativeAudioEffectIsRunning = -1;
        } else {
            iNativeAudioEffectIsRunning = biliAudioRecordTrack.nativeAudioEffectIsRunning(biliAudioRecordTrack.getHandle(), z6);
        }
        return Integer.valueOf(iNativeAudioEffectIsRunning);
    }

    public final void D() {
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequest = this.f65799u;
            if (audioFocusRequest == null) {
                return;
            } else {
                this.f65797s.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            a aVar = this.f65798t;
            if (aVar == null) {
                return;
            } else {
                this.f65797s.abandonAudioFocus(aVar);
            }
        }
        if (this.f65797s.getMode() == 3) {
            this.f65797s.setMode(0);
        }
        this.f65799u = null;
        this.f65798t = null;
    }

    public final AudioRecord E(int i7) {
        return new AudioRecord.Builder().setAudioSource(this.f65794p).setAudioFormat(new AudioFormat.Builder().setEncoding(this.f65793o).setSampleRate(this.f65795q).setChannelMask(this.f65792n).build()).setBufferSizeInBytes(i7).build();
    }

    public final int F() {
        int i7 = this.f65793o;
        int i8 = 2;
        if (i7 != 1) {
            i8 = 2;
            if (i7 != 2) {
                i8 = 1;
                if (i7 != 3) {
                    i8 = 4;
                    if (i7 != 4) {
                        if (i7 != 13) {
                            throw new IllegalArgumentException(C3259x.a(this.f65793o, "Bad audio format "));
                        }
                        i8 = 2;
                    }
                }
            }
        }
        return i8;
    }

    public final void G() {
        a aVar = new a(this);
        this.f65798t = aVar;
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(4).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(aVar).build();
            this.f65799u = audioFocusRequestBuild;
            if (audioFocusRequestBuild == null) {
                return;
            }
            int iRequestAudioFocus = this.f65797s.requestAudioFocus(audioFocusRequestBuild);
            InterfaceC8094b.b(this, "mAudioManager.requestAudioFocus, ret:" + iRequestAudioFocus, null, 14);
            if (iRequestAudioFocus != 1) {
                return;
            }
        } else {
            int iRequestAudioFocus2 = this.f65797s.requestAudioFocus(aVar, 0, 4);
            InterfaceC8094b.b(this, "mAudioManager.requestAudioFocus, ret:" + iRequestAudioFocus2, null, 14);
            if (iRequestAudioFocus2 != 1) {
                return;
            }
        }
        this.f65797s.setMode(3);
    }

    public final void H(@NotNull Function0<Unit> function0) {
        com.bilibili.mediastreaming.audio.croutine.d.h(getMAudioTrackCoroutine(), new BiliAudioRecordTrack$runOnDefaultCoroutine$1(function0, null));
    }

    public final boolean I() {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        runOnAudioWorkCoroutineInvoke("stopRecordStream", new C5406x(0, this, booleanRef));
        return booleanRef.element;
    }

    @Override // com.bilibili.mediastreaming.audio.track.BiliAudioTrack
    public final void enableDebug() {
    }

    @Override // com.bilibili.mediastreaming.audio.track.BiliAudioTrack
    public final void release() {
        runOnAudioWorkCoroutineInvoke("control release", new I90.k(this, 3));
        runOnAudioNativeCoroutineInvoke("audio release", new I90.l(this, 4));
        getMAudioTrackCoroutine().d();
        this.f65790l.clear();
    }
}
