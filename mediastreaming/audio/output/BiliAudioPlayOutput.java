package com.bilibili.mediastreaming.audio.output;

import Vn.A;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import androidx.appcompat.widget.C3259x;
import androidx.compose.foundation.gestures.C3392f;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.C;
import androidx.media3.exoplayer.C4690e;
import com.bilibili.mediastreaming.audio.output.BiliAudioPlayOutput;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import nh0.C8093a;
import nh0.InterfaceC8094b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/output/BiliAudioPlayOutput.class */
public final class BiliAudioPlayOutput extends BiliAudioOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public BiliAudioTrackThread f65718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f65719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ByteBuffer f65720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public iC.f f65721d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/output/BiliAudioPlayOutput$BiliAudioTrackThread.class */
    public final class BiliAudioTrackThread extends Thread implements InterfaceC8094b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.mediastreaming.audio.b f65722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f65723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f65724c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public AudioTrack f65725d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public C8093a f65726e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f65727f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f65728g;
        public final int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final BiliAudioPlayOutput f65729i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BiliAudioTrackThread(@NotNull BiliAudioPlayOutput biliAudioPlayOutput, String str) {
            super(str);
            this.f65729i = biliAudioPlayOutput;
            this.f65722a = new com.bilibili.mediastreaming.audio.b(G.p.a(str, "Thread"));
            this.f65723b = true;
            this.f65727f = true;
            this.f65728g = 16;
            this.h = 100;
        }

        public final AudioTrack d(C8093a c8093a) {
            int i7 = c8093a.f124226f;
            int i8 = c8093a.f124221a;
            int i9 = c8093a.f124225e;
            int i10 = c8093a.f124229j;
            int i11 = i9 == 2 ? 4 : 2;
            if (i11 == 4) {
                InterfaceC8094b.a(this, "current device not support PCM_FLOAT so down level PCM_16BIT", null, null, 14);
                i11 = 2;
            }
            int i12 = i10 == 3 ? 12 : 16;
            int iG = g(c8093a.h);
            int iF = f(c8093a.f124228i);
            int minBufferSize = AudioTrack.getMinBufferSize(i7, i12, i11);
            StringBuilder sbB = A.b(i7, i8, "sampleRate:", ", channelCount:", ", format:");
            C4690e.a(i11, i12, ", channelMask:", ", minBufferSize:", sbB);
            sbB.append(minBufferSize);
            InterfaceC8094b.b(this, sbB.toString(), null, 14);
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setEncoding(i11).setSampleRate(i7).setChannelMask(i12).build();
            AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(iG).setContentType(iF);
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 29) {
                InterfaceC8094b.b(this, C3392f.a(i13, "current os:", " support setAllowedCapturePolicy, so set AudioAttributes.ALLOW_CAPTURE_BY_NONE...."), null, 14);
                contentType.setAllowedCapturePolicy(3);
            }
            int i14 = c8093a.f124224d;
            if (i14 > 0) {
                InterfaceC8094b.b(this, "recordSessionId:" + i14, null, 14);
            } else {
                i14 = 0;
            }
            InterfaceC8094b.b(this, "latest set sessionID:" + i14, null, 14);
            return new AudioTrack(contentType.build(), audioFormatBuild, minBufferSize, 1, i14);
        }

        public final AudioTrack e(C8093a c8093a) {
            int i7 = c8093a.f124226f;
            int i8 = c8093a.f124221a;
            int i9 = c8093a.f124225e;
            int i10 = c8093a.f124229j;
            int i11 = i9 == 2 ? 4 : 2;
            if (i11 == 4) {
                InterfaceC8094b.a(this, "current device not support PCM_FLOAT so down level PCM_16BIT", null, null, 14);
                i11 = 2;
            }
            int i12 = i10 == 3 ? 12 : 16;
            InterfaceC8094b.b(this, "performanceMode:".concat("LL"), null, 14);
            int iG = g(c8093a.h);
            int iF = f(c8093a.f124228i);
            int minBufferSize = AudioTrack.getMinBufferSize(i7, i12, i11);
            StringBuilder sbB = A.b(i7, i8, "sampleRate:", ", channelCount:", ", format:");
            C4690e.a(i11, i12, ", channelMask:", ", minBufferSize:", sbB);
            InterfaceC8094b.b(this, C.a(minBufferSize, 1, ", audioPerformanceMode:", sbB), null, 14);
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setEncoding(i11).setSampleRate(i7).setChannelMask(i12).build();
            AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(iG).setContentType(iF);
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 29) {
                InterfaceC8094b.b(this, C3392f.a(i13, "current os:", " support setAllowedCapturePolicy, so set AudioAttributes.ALLOW_CAPTURE_BY_NONE...."), null, 14);
                contentType.setAllowedCapturePolicy(3);
            }
            AudioTrack.Builder transferMode = new AudioTrack.Builder().setAudioFormat(audioFormatBuild).setAudioAttributes(contentType.build()).setBufferSizeInBytes(minBufferSize).setTransferMode(1);
            int i14 = c8093a.f124224d;
            if (i14 > 0) {
                InterfaceC8094b.b(this, "recordSessionId:" + i14, null, 14);
            } else {
                i14 = 0;
            }
            InterfaceC8094b.b(this, "latest set sessionID:" + i14, null, 14);
            transferMode.setSessionId(i14);
            return transferMode.build();
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int f(int r6) {
            /*
                r5 = this;
                r0 = 4
                r7 = r0
                r0 = r6
                if (r0 == 0) goto L3c
                r0 = r6
                r1 = 1
                if (r0 == r1) goto L36
                r0 = r6
                r1 = 2
                if (r0 == r1) goto L30
                r0 = r6
                r1 = 3
                if (r0 == r1) goto L2a
                r0 = r6
                r1 = 4
                if (r0 == r1) goto L24
                r0 = r6
                java.lang.String r1 = "?="
                java.lang.String r0 = androidx.appcompat.widget.C3259x.a(r0, r1)
                r8 = r0
                goto L3f
            L24:
                java.lang.String r0 = "Sonification"
                r8 = r0
                goto L3f
            L2a:
                java.lang.String r0 = "Movie"
                r8 = r0
                goto L3f
            L30:
                java.lang.String r0 = "Music"
                r8 = r0
                goto L3f
            L36:
                java.lang.String r0 = "Speech"
                r8 = r0
                goto L3f
            L3c:
                java.lang.String r0 = "Unspecified"
                r8 = r0
            L3f:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "contentType:"
                r1.<init>(r2)
                r9 = r0
                r0 = r9
                r1 = r8
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                r1 = r9
                java.lang.String r1 = r1.toString()
                r2 = 0
                r3 = 14
                nh0.InterfaceC8094b.b(r0, r1, r2, r3)
                r0 = r6
                r1 = 1
                if (r0 == r1) goto L7b
                r0 = r6
                r1 = 2
                if (r0 == r1) goto L71
                r0 = r6
                r1 = 3
                if (r0 == r1) goto L76
                r0 = r6
                r1 = 4
                if (r0 == r1) goto L7d
            L71:
                r0 = 2
                r7 = r0
                goto L7d
            L76:
                r0 = 3
                r7 = r0
                goto L7d
            L7b:
                r0 = 1
                r7 = r0
            L7d:
                r0 = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mediastreaming.audio.output.BiliAudioPlayOutput.BiliAudioTrackThread.f(int):int");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int g(int r6) {
            /*
                Method dump skipped, instruction units count: 356
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mediastreaming.audio.output.BiliAudioPlayOutput.BiliAudioTrackThread.g(int):int");
        }

        public final void h(int i7, String str) {
            InterfaceC8094b.b(this, "innerReleaseAudioTrack....", null, 14);
            try {
                try {
                    AudioTrack audioTrack = this.f65725d;
                    if (audioTrack != null) {
                        audioTrack.release();
                    }
                    this.f65725d = null;
                    this.f65729i.clearCacheDirectBufferAddress();
                    this.f65729i.requestAudioData(0L);
                    BiliAudioPlayOutput biliAudioPlayOutput = this.f65729i;
                    biliAudioPlayOutput.f65720c = null;
                    com.bilibili.mediastreaming.audio.croutine.d.h(biliAudioPlayOutput.getMAudioOutputCoroutine(), new BiliAudioPlayOutput$BiliAudioTrackThread$innerReleaseAudioTrack$1(this.f65729i, str, i7, null));
                } catch (Exception e7) {
                    InterfaceC8094b.a(this, "innerReleaseAudioTrack fail, message:" + e7.getMessage(), null, e7, 6);
                }
            } finally {
                this.f65727f = true;
            }
        }

        @Override // nh0.InterfaceC8094b
        public final void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
            this.f65722a.logError(str, str2, str3, th);
        }

        @Override // nh0.InterfaceC8094b
        public final void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
            this.f65722a.logInfo(str, str2, str3, th);
        }

        @Override // nh0.InterfaceC8094b
        public final void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
            this.f65722a.logWarning(str, str2, str3, th);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            int iRequestAudioData;
            this.f65724c = true;
            Process.setThreadPriority(-19);
            if (this.f65725d == null) {
                InterfaceC8094b.c(this, "mAudioTrack not init!!!!!", null, 14);
            }
            AudioTrack audioTrack = this.f65725d;
            if (audioTrack == null) {
                return;
            }
            if (audioTrack.getPlayState() != 3) {
                InterfaceC8094b.c(this, androidx.compose.runtime.collection.d.a(audioTrack.getState(), audioTrack.getPlayState(), "audioTrack current state is:", ", playState:", ", not is PLAYING !!!!!"), null, 14);
                return;
            }
            InterfaceC8094b.b(this, getName() + ", run....", null, 14);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "ok";
            int i7 = 0;
            while (this.f65723b) {
                BiliAudioPlayOutput biliAudioPlayOutput = this.f65729i;
                ByteBuffer byteBuffer = biliAudioPlayOutput.f65720c;
                if (byteBuffer != null && (iRequestAudioData = (int) biliAudioPlayOutput.requestAudioData(byteBuffer.capacity())) > 0) {
                    if (this.f65727f) {
                        com.bilibili.mediastreaming.audio.croutine.d.h(this.f65729i.getMAudioOutputCoroutine(), new BiliAudioPlayOutput$BiliAudioTrackThread$run$1(this.f65729i, this, null));
                        this.f65727f = false;
                    }
                    int iWrite = audioTrack.write(byteBuffer, iRequestAudioData, 0);
                    int i8 = i7;
                    if (iWrite != iRequestAudioData) {
                        i8 = i7;
                        if (iWrite != 0) {
                            String strA = C3259x.a(iWrite, "AudioTrack.write played invalid number of bytes: ");
                            objectRef.element = strA;
                            InterfaceC8094b.c(this, strA, null, 14);
                            if (iWrite < 0) {
                                this.f65723b = false;
                                com.bilibili.mediastreaming.audio.croutine.d.h(this.f65729i.getMAudioOutputCoroutine(), new BiliAudioPlayOutput$BiliAudioTrackThread$run$2(this.f65729i, objectRef, iWrite, this, null));
                            }
                            i8 = iWrite;
                        }
                    }
                    byteBuffer.rewind();
                    i7 = i8;
                }
            }
            InterfaceC8094b.b(this, getName() + ", done....", null, 14);
            h(i7, (String) objectRef.element);
            this.f65724c = false;
        }
    }

    public final int D(@NotNull final C8093a c8093a) {
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        InterfaceC8094b.b(this, "openPlayStream....", null, 14);
        runOnAudioWorkCoroutineInvoke("openPlayStream", new Function0(this, intRef, c8093a) { // from class: com.bilibili.mediastreaming.audio.output.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioPlayOutput f65766a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.IntRef f65767b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final C8093a f65768c;

            {
                this.f65766a = this;
                this.f65767b = intRef;
                this.f65768c = c8093a;
            }

            public final Object invoke() throws InterruptedException {
                int i7;
                Unit unit;
                C8093a c8093a2 = this.f65768c;
                BiliAudioPlayOutput biliAudioPlayOutput = this.f65766a;
                BiliAudioPlayOutput.BiliAudioTrackThread biliAudioTrackThread = biliAudioPlayOutput.f65718a;
                if (biliAudioTrackThread != null) {
                    biliAudioTrackThread.f65723b = false;
                    biliAudioTrackThread.join();
                }
                BiliAudioPlayOutput.BiliAudioTrackThread biliAudioTrackThread2 = biliAudioPlayOutput.f65718a;
                if (biliAudioTrackThread2 != null) {
                    biliAudioTrackThread2.join();
                }
                biliAudioPlayOutput.f65718a = null;
                long j7 = biliAudioPlayOutput.f65719b;
                biliAudioPlayOutput.f65719b = 1 + j7;
                BiliAudioPlayOutput.BiliAudioTrackThread biliAudioTrackThread3 = new BiliAudioPlayOutput.BiliAudioTrackThread(biliAudioPlayOutput, C3751q.a(j7, "BiliAudioPlayOutput-"));
                biliAudioPlayOutput.f65718a = biliAudioTrackThread3;
                InterfaceC8094b.b(biliAudioTrackThread3, "initAudioTrack....", null, 14);
                if (biliAudioTrackThread3.f65724c) {
                    biliAudioTrackThread3.f65723b = false;
                    biliAudioTrackThread3.join();
                }
                int i8 = -1;
                try {
                    biliAudioTrackThread3.f65725d = Build.VERSION.SDK_INT >= 26 ? biliAudioTrackThread3.e(c8093a2) : biliAudioTrackThread3.d(c8093a2);
                } catch (Exception e7) {
                    String str = "innerInitAudioTrack, exception, message:" + e7.getMessage();
                    InterfaceC8094b.c(biliAudioTrackThread3, str, e7, 6);
                    biliAudioTrackThread3.h(-1, str);
                }
                AudioTrack audioTrack = biliAudioTrackThread3.f65725d;
                if (audioTrack != null) {
                    AudioDeviceInfo audioDeviceInfo = c8093a2.f124223c;
                    if (audioDeviceInfo != null) {
                        audioTrack.setPreferredDevice(audioDeviceInfo);
                    }
                    int i9 = c8093a2.f124221a;
                    int i10 = c8093a2.f124226f;
                    biliAudioTrackThread3.f65729i.setTargetStreamConfig(i10, i9);
                    int bufferCapacityInFrames = audioTrack.getBufferCapacityInFrames();
                    int i11 = 1000;
                    int i12 = ((1000 / (i10 / (bufferCapacityInFrames / 2))) * 2) + 200;
                    InterfaceC8094b.b(biliAudioTrackThread3, "updateQueueCacheBufferMs before, deviceInfo:" + audioDeviceInfo + ", bufferCapacityInFrames:" + bufferCapacityInFrames, null, 14);
                    if (audioDeviceInfo == null || audioDeviceInfo.getType() != 8 || i12 >= 400) {
                        i11 = i12;
                    }
                    biliAudioTrackThread3.f65729i.updateQueueCacheBufferMs(i11);
                    BiliAudioPlayOutput biliAudioPlayOutput2 = biliAudioTrackThread3.f65729i;
                    if (biliAudioPlayOutput2.f65720c != null) {
                        biliAudioPlayOutput2.clearCacheDirectBufferAddress();
                        biliAudioTrackThread3.f65729i.requestAudioData(0L);
                        biliAudioTrackThread3.f65729i.f65720c = null;
                    }
                    biliAudioTrackThread3.f65729i.f65720c = ByteBuffer.allocateDirect((i10 / biliAudioTrackThread3.h) * (biliAudioTrackThread3.f65728g / 8) * i9);
                    BiliAudioPlayOutput biliAudioPlayOutput3 = biliAudioTrackThread3.f65729i;
                    ByteBuffer byteBuffer = biliAudioPlayOutput3.f65720c;
                    if (byteBuffer != null) {
                        biliAudioPlayOutput3.setCacheDirectBufferAddress(byteBuffer);
                    }
                    biliAudioTrackThread3.f65726e = c8093a2;
                    i8 = 0;
                }
                Ref.IntRef intRef2 = this.f65767b;
                intRef2.element = i8;
                if (i8 != 0) {
                    unit = Unit.INSTANCE;
                } else {
                    InterfaceC8094b.b(biliAudioTrackThread3, "openAudioTrack....", null, 14);
                    AudioTrack audioTrack2 = biliAudioTrackThread3.f65725d;
                    if (audioTrack2 == null) {
                        i7 = -2;
                        intRef2.element = i7;
                        unit = Unit.INSTANCE;
                    } else {
                        try {
                            audioTrack2.play();
                            biliAudioTrackThread3.start();
                            i7 = 0;
                        } catch (Exception e8) {
                            InterfaceC8094b.a(biliAudioTrackThread3, C4496a.a("innerOpenAudioTrack, fail, message:", e8.getMessage()), null, e8, 6);
                            biliAudioTrackThread3.f65723b = false;
                            biliAudioTrackThread3.join();
                            i7 = -2;
                        }
                        intRef2.element = i7;
                        unit = Unit.INSTANCE;
                    }
                }
                return unit;
            }
        });
        return intRef.element;
    }

    public final void E() {
        InterfaceC8094b.b(this, "stopPlayStream....", null, 14);
        runOnAudioWorkCoroutineInvoke("stopPlayStream", new com.bilibili.biligame.widget.dialog.q(this, 2));
    }

    @Override // com.bilibili.mediastreaming.audio.output.BiliAudioOutput
    public final void enableDebug() {
    }

    @Override // com.bilibili.mediastreaming.audio.output.BiliAudioOutput
    public final void release() {
        InterfaceC8094b.b(this, "BiliAudioPlayOutput,release....", null, 14);
        E();
        this.f65719b = 0L;
        this.f65721d = null;
        super.release();
        getMAudioOutputCoroutine().d();
    }
}
