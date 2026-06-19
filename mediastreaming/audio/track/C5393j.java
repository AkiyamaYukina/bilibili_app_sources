package com.bilibili.mediastreaming.audio.track;

import X1.C3081k;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.TextUtils;
import android.view.Surface;
import com.bilibili.app.producers.ability.l0;
import com.bilibili.mediastreaming.audio.croutine.BiliAudioCoroutineKt;
import com.bilibili.mediastreaming.audio.track.C5393j;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import nh0.InterfaceC8094b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.mediastreaming.audio.track.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/j.class */
public final class C5393j extends BiliAudioTrack {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public MediaExtractor f65900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public MediaCodec f65901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public MediaFormat f65902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final HandlerThread f65903l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Handler f65904m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f65905n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final a f65906o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public iC.g f65907p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public String f65908q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public BiliAudioFileDecodeState f65909r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public BiliAudioFileExtractorState f65910s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public BiliAudioFilePlayState f65911t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final ByteBuffer f65912u;

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.audio.track.j$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/j$a.class */
    public final class a extends MediaCodec.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final AtomicBoolean f65913a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ByteBuffer f65914b = ByteBuffer.allocateDirect(102400);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C5393j f65915c;

        public a(C5393j c5393j) {
            this.f65915c = c5393j;
        }

        public final void a() {
            InterfaceC8094b.b(this.f65915c, "stopDecoder..... " + this.f65913a.get(), null, 14);
            final C5393j c5393j = this.f65915c;
            c5393j.C("AudioDecoderCallback##stopDecoder", new Function0(this, c5393j) { // from class: com.bilibili.mediastreaming.audio.track.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5393j.a f65898a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C5393j f65899b;

                {
                    this.f65898a = this;
                    this.f65899b = c5393j;
                }

                public final Object invoke() {
                    Unit unit;
                    C5393j.a aVar = this.f65898a;
                    if (aVar.f65913a.get()) {
                        aVar.f65913a.set(false);
                        C5393j c5393j2 = this.f65899b;
                        MediaExtractor mediaExtractor = c5393j2.f65900i;
                        if (mediaExtractor != null) {
                            mediaExtractor.release();
                        }
                        c5393j2.f65900i = null;
                        c5393j2.D(new com.bilibili.biligame.widget.dialog.C(c5393j2, 2));
                        c5393j2.f65910s = BiliAudioFileExtractorState.EXTRACTED;
                        InterfaceC8094b.b(c5393j2, "mDecoder stop...mDecoder obj:" + c5393j2.f65901j, null, 14);
                        MediaCodec mediaCodec = c5393j2.f65901j;
                        if (mediaCodec != null) {
                            mediaCodec.stop();
                        }
                        MediaCodec mediaCodec2 = c5393j2.f65901j;
                        if (mediaCodec2 != null) {
                            mediaCodec2.release();
                        }
                        c5393j2.f65901j = null;
                        c5393j2.f65909r = BiliAudioFileDecodeState.DECODED;
                        c5393j2.D(new Ce1.b(c5393j2, 2));
                        unit = Unit.INSTANCE;
                    } else {
                        unit = Unit.INSTANCE;
                    }
                    return unit;
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public final void onError(@NotNull MediaCodec mediaCodec, @NotNull MediaCodec.CodecException codecException) {
            C5393j c5393j = this.f65915c;
            c5393j.D(new com.bilibili.biligame.ui.comment.add.f(1, codecException, c5393j));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onInputBufferAvailable(@NotNull MediaCodec mediaCodec, int i7) {
            if (this.f65913a.get()) {
                MediaExtractor mediaExtractor = this.f65915c.f65900i;
                if (mediaExtractor == null) {
                    a();
                    return;
                }
                int sampleData = mediaExtractor.readSampleData(this.f65914b, 0);
                if (sampleData < 0) {
                    mediaCodec.queueInputBuffer(i7, 0, 0, 0L, 4);
                    C5393j c5393j = this.f65915c;
                    c5393j.D(new Y31.b(c5393j, 1));
                    return;
                }
                ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i7);
                if (inputBuffer == null) {
                    return;
                }
                byte[] bArr = new byte[sampleData];
                this.f65914b.get(bArr);
                this.f65914b.clear();
                inputBuffer.clear();
                inputBuffer.put(bArr);
                mediaCodec.queueInputBuffer(i7, 0, sampleData, mediaExtractor.getSampleTime(), 0);
                mediaExtractor.advance();
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputBufferAvailable(@NotNull MediaCodec mediaCodec, int i7, @NotNull MediaCodec.BufferInfo bufferInfo) {
            ByteBuffer outputBuffer;
            if (this.f65913a.get()) {
                if (bufferInfo.flags == 4) {
                    InterfaceC8094b.b(this.f65915c, "info.flags == MediaCodec.BUFFER_FLAG_END_OF_STREAM", null, 14);
                    this.f65915c.sendAudioEndStream(bufferInfo.presentationTimeUs);
                    mediaCodec.releaseOutputBuffer(i7, false);
                    a();
                    C5393j c5393j = this.f65915c;
                    c5393j.D(new Ce.b(c5393j, 4));
                    return;
                }
                if (i7 >= 0 && (outputBuffer = mediaCodec.getOutputBuffer(i7)) != null) {
                    int i8 = bufferInfo.offset;
                    int i9 = bufferInfo.size;
                    if (i9 < 0) {
                        return;
                    }
                    outputBuffer.position(i8);
                    outputBuffer.limit(i8 + i9);
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    int integer = outputFormat.getInteger("sample-rate");
                    int integer2 = outputFormat.getInteger("channel-count");
                    int integer3 = outputFormat.containsKey("pcm-encoding") ? outputFormat.getInteger("pcm-encoding") : 2;
                    while (outputBuffer.hasRemaining()) {
                        this.f65915c.f65912u.clear();
                        int iMin = Math.min(outputBuffer.remaining(), this.f65915c.f65912u.capacity());
                        int iLimit = outputBuffer.limit();
                        outputBuffer.limit(outputBuffer.position() + iMin);
                        this.f65915c.f65912u.put(outputBuffer);
                        if (integer3 == 2) {
                            this.f65915c.sendAudioLenS16(iMin, (i9 / integer2) / 2, integer2, integer, bufferInfo.presentationTimeUs);
                        } else if (integer3 == 22) {
                            this.f65915c.sendAudioLenF32(iMin, (i9 / integer2) / 4, integer2, integer, bufferInfo.presentationTimeUs);
                        }
                        outputBuffer.limit(iLimit);
                    }
                    mediaCodec.releaseOutputBuffer(i7, false);
                }
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputFormatChanged(@NotNull MediaCodec mediaCodec, @NotNull MediaFormat mediaFormat) {
        }
    }

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.audio.track.j$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/j$b.class */
    public static final class b implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5393j f65916a;

        public b(C5393j c5393j) {
            this.f65916a = c5393j;
        }

        public final Unit invoke() {
            C5393j c5393j = this.f65916a;
            InterfaceC8094b.b(c5393j, "release...", null, 14);
            c5393j.A();
            CoroutineScopeKt.cancel$default(c5393j.f65905n, (CancellationException) null, 1, (Object) null);
            c5393j.f65904m.removeCallbacksAndMessages(null);
            c5393j.f65903l.quitSafely();
            InterfaceC8094b.b(c5393j, "release done!", null, 14);
            return Unit.INSTANCE;
        }
    }

    public C5393j() {
        super("LiveBGMSource", false, "BiliAudioFileTrack", 2, null);
        HandlerThread handlerThread = new HandlerThread("BiliAudioFileTrackThread");
        this.f65903l = handlerThread;
        this.f65906o = new a(this);
        this.f65908q = "";
        this.f65909r = BiliAudioFileDecodeState.UN_INIT;
        this.f65910s = BiliAudioFileExtractorState.UN_INIT;
        this.f65911t = BiliAudioFilePlayState.UN_PLAY;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(11520);
        this.f65912u = byteBufferAllocateDirect;
        setChildReleaseCoroutine(true);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f65904m = handler;
        this.f65905n = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(HandlerDispatcherKt.from(handler, "BiliAudioFileTrackCtx")));
        setPrepareDataDelayMs(1000);
        startCallback();
        setAudioByteBuffer(byteBufferAllocateDirect);
    }

    public static Unit y(C5393j c5393j) {
        InterfaceC8094b.b(c5393j, "release...", null, 14);
        super.release();
        InterfaceC8094b.b(c5393j, "release done!", null, 14);
        return Unit.INSTANCE;
    }

    public static Unit z(final C5393j c5393j, String str) {
        BiliAudioFileDecodeState biliAudioFileDecodeState = c5393j.f65909r;
        boolean z6 = (biliAudioFileDecodeState == BiliAudioFileDecodeState.UN_INIT || biliAudioFileDecodeState == BiliAudioFileDecodeState.DECODED) ? false : true;
        BiliAudioFileExtractorState biliAudioFileExtractorState = c5393j.f65910s;
        boolean z7 = (biliAudioFileExtractorState == BiliAudioFileExtractorState.UN_INIT || biliAudioFileExtractorState == BiliAudioFileExtractorState.EXTRACTED) ? false : true;
        BiliAudioFilePlayState biliAudioFilePlayState = c5393j.f65911t;
        boolean z8 = (biliAudioFilePlayState == BiliAudioFilePlayState.UN_PLAY || biliAudioFilePlayState == BiliAudioFilePlayState.PLAY_DONE) ? false : true;
        if (z6 || z7 || z8) {
            StringBuilder sbB = C3081k.b("current play url:", c5393j.f65908q, " hasn't play done! so stop...., decodeStateCheck:", " decode state:", z6);
            sbB.append(biliAudioFileDecodeState);
            sbB.append(", extractStateCheck:");
            sbB.append(z7);
            sbB.append(", extract state:");
            sbB.append(biliAudioFileExtractorState);
            sbB.append(", playStateCheck:");
            sbB.append(z8);
            sbB.append(", play state:");
            sbB.append(biliAudioFilePlayState);
            InterfaceC8094b.b(c5393j, sbB.toString(), null, 14);
            c5393j.A();
        }
        c5393j.f65908q = str;
        InterfaceC8094b.b(c5393j, "cur pause state:" + c5393j.isPause(), null, 14);
        if (c5393j.isPause()) {
            super.setPause(false);
        }
        try {
            InterfaceC8094b.b(c5393j, "initMediaExtractor, path:" + c5393j.f65908q, null, 14);
            MediaExtractor mediaExtractor = new MediaExtractor();
            c5393j.f65900i = mediaExtractor;
            mediaExtractor.setDataSource(c5393j.f65908q);
            int trackCount = mediaExtractor.getTrackCount();
            for (int i7 = 0; i7 < trackCount; i7++) {
                mediaExtractor.unselectTrack(i7);
            }
            int i8 = 0;
            while (true) {
                if (i8 >= trackCount) {
                    break;
                }
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i8);
                String string = trackFormat.getString("mime");
                if (!TextUtils.isEmpty(string) && string != null && StringsKt.n(string, "audio/")) {
                    mediaExtractor.selectTrack(i8);
                    c5393j.f65902k = trackFormat;
                    break;
                }
                i8++;
            }
            InterfaceC8094b.b(c5393j, "handler is zero?:" + (c5393j.getHandle() == 0), null, 14);
            c5393j.f65910s = BiliAudioFileExtractorState.INIT_EXTRACTOR;
        } catch (Exception e7) {
            String str2 = "initMediaExtractor exception message:" + e7.getMessage();
            InterfaceC8094b.c(c5393j, str2, e7, 6);
            MediaExtractor mediaExtractor2 = c5393j.f65900i;
            if (mediaExtractor2 != null) {
                mediaExtractor2.release();
            }
            c5393j.f65900i = null;
            c5393j.f65902k = null;
            c5393j.D(new I60.D(c5393j, 1, str2, e7));
        }
        InterfaceC8094b.b(c5393j, "initAudioDecoder", null, 14);
        MediaFormat mediaFormat = c5393j.f65902k;
        a aVar = c5393j.f65906o;
        if (mediaFormat != null) {
            try {
                String string2 = mediaFormat.getString("mime");
                if (string2 != null) {
                    MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string2);
                    c5393j.f65901j = mediaCodecCreateDecoderByType;
                    if (mediaCodecCreateDecoderByType != null) {
                        mediaCodecCreateDecoderByType.setCallback(aVar);
                    }
                    InterfaceC8094b.b(c5393j, "mDecoder configure format:" + mediaFormat, null, 14);
                    MediaCodec mediaCodec = c5393j.f65901j;
                    if (mediaCodec != null) {
                        mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                    }
                    c5393j.f65909r = BiliAudioFileDecodeState.INIT_DECODE;
                }
            } catch (Exception e8) {
                final String str3 = "initAudioDecoder exception, message:" + e8.getMessage();
                InterfaceC8094b.c(c5393j, str3, e8, 6);
                c5393j.D(new Function0(c5393j, str3, e8) { // from class: com.bilibili.mediastreaming.audio.track.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C5393j f65889a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f65890b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Exception f65891c;

                    {
                        this.f65889a = c5393j;
                        this.f65890b = str3;
                        this.f65891c = e8;
                    }

                    public final Object invoke() {
                        Exception exc = this.f65891c;
                        C5393j c5393j2 = this.f65889a;
                        iC.g gVar = c5393j2.f65907p;
                        if (gVar != null) {
                            StringBuilder sbA = l0.a("onInitDecoderError bgmPath:", c5393j2.f65908q, ", message:");
                            sbA.append(this.f65890b);
                            BLog.e("LiveBGMSourceInput", sbA.toString(), exc);
                            Iterator it = gVar.a.values().iterator();
                            while (it.hasNext()) {
                                ((iC.c) it.next()).b();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                });
                MediaCodec mediaCodec2 = c5393j.f65901j;
                if (mediaCodec2 != null) {
                    mediaCodec2.release();
                }
                c5393j.f65901j = null;
            }
        }
        InterfaceC8094b.b(aVar.f65915c, "startDecoder..... " + aVar.f65913a.get(), null, 14);
        C5393j c5393j2 = aVar.f65915c;
        c5393j2.C("AudioDecoderCallback##startDecoder", new Y50.e(2, aVar, c5393j2));
        InterfaceC8094b.b(c5393j, android.support.v4.media.a.a("startPlay path:", c5393j.f65908q, " ..."), null, 14);
        return Unit.INSTANCE;
    }

    public final void A() {
        InterfaceC8094b.b(this, "innerStopPlay...", null, 14);
        this.f65906o.a();
        this.f65909r = BiliAudioFileDecodeState.UN_INIT;
        reset();
    }

    public final void B() {
        if (this.f65911t != BiliAudioFilePlayState.PLAY_DONE) {
            D(new I60.A(this, 5));
        }
    }

    public final void C(String str, Function0<Unit> function0) {
        int threadId = this.f65903l.getThreadId();
        BiliAudioCoroutineKt.b(Process.myTid() == threadId, str, this.f65905n, CoroutineStart.DEFAULT, function0);
    }

    public final void D(Function0 function0) {
        com.bilibili.mediastreaming.audio.croutine.d.h(getMAudioTrackCoroutine(), new BiliAudioFileTrack$runOnDefaultCoroutine$1(function0, null));
    }

    @Override // com.bilibili.mediastreaming.audio.track.BiliAudioTrack
    public final void onAudioStartSpending() {
        C("onAudioStartSpending", new ZV.o(this, 4));
    }

    @Override // com.bilibili.mediastreaming.audio.track.BiliAudioTrack
    public final void onAudioTotalConsumeFrames(final long j7) {
        C("onAudioTotalConsumeFrames", new Function0(this, j7) { // from class: com.bilibili.mediastreaming.audio.track.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5393j f65892a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f65893b;

            {
                this.f65892a = this;
                this.f65893b = j7;
            }

            public final Object invoke() {
                C5393j c5393j = this.f65892a;
                BiliAudioFilePlayState biliAudioFilePlayState = c5393j.f65911t;
                BiliAudioFilePlayState biliAudioFilePlayState2 = BiliAudioFilePlayState.PLAYING;
                if (biliAudioFilePlayState != biliAudioFilePlayState2) {
                    c5393j.f65911t = biliAudioFilePlayState2;
                }
                c5393j.B();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // com.bilibili.mediastreaming.audio.track.BiliAudioTrack
    public final void onAudioTotalDropFrames(final long j7) {
        C("onAudioTotalDropFrames", new Function0(this, j7) { // from class: com.bilibili.mediastreaming.audio.track.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5393j f65894a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f65895b;

            {
                this.f65894a = this;
                this.f65895b = j7;
            }

            public final Object invoke() {
                C5393j c5393j = this.f65894a;
                c5393j.getClass();
                c5393j.B();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // com.bilibili.mediastreaming.audio.track.BiliAudioTrack
    public final void onAudioTotalProduceFrames(final long j7) {
        C("onAudioTotalProduceFrames", new Function0(this, j7) { // from class: com.bilibili.mediastreaming.audio.track.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5393j f65896a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f65897b;

            {
                this.f65896a = this;
                this.f65897b = j7;
            }

            public final Object invoke() {
                C5393j c5393j = this.f65896a;
                c5393j.getClass();
                c5393j.B();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // com.bilibili.mediastreaming.audio.track.BiliAudioTrack
    public final void onBufferConsumeEnd() {
        InterfaceC8094b.b(this, "onBufferConsumeEnd..", null, 14);
        C("onBufferConsumeEnd", new Cc.c(this, 5));
    }

    @Override // com.bilibili.mediastreaming.audio.track.BiliAudioTrack
    public final void release() {
        BiliAudioCoroutineKt.c(this.f65905n, "release", this.f65903l.getThreadId(), CoroutineStart.DEFAULT, new b(this));
        runOnAudioNativeCoroutineInvoke("release", new Cc.b(this, 9));
        getMAudioTrackCoroutine().d();
        this.f65912u.clear();
    }

    @Override // com.bilibili.mediastreaming.audio.track.BiliAudioTrack
    public final int setPause(boolean z6) {
        C("setPause", new com.bilibili.biligame.widget.dialog.y(this, 2));
        super.setPause(z6);
        return 0;
    }
}
