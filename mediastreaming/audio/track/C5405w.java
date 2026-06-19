package com.bilibili.mediastreaming.audio.track;

import Up0.C2917f;
import android.content.Context;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Process;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.C3259x;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.app.authorspace.ui.i1;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import nh0.InterfaceC8094b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.mediastreaming.audio.track.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/w.class */
@RequiresApi(29)
public final class C5405w extends BiliAudioTrack {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Context f65953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MediaProjection f65954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f65955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f65956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f65957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public AudioRecord f65958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public a f65959o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f65960p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f65961q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f65962r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f65963s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public iC.h f65964t;

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.audio.track.w$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/w$a.class */
    public final class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final AtomicBoolean f65965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C5405w f65966b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5405w c5405w) {
            super("BiliAudioInnerCaptureTrackRecoding");
            this.f65966b = c5405w;
            this.f65965a = new AtomicBoolean(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(-19);
            InterfaceC8094b.b(this.f65966b, android.support.v4.media.a.a("PlaybackCaptureThread:", getName(), " run...."), null, 14);
            while (this.f65965a.get()) {
                C5405w c5405w = this.f65966b;
                if (c5405w.f65958n == null) {
                    c5405w.B(new C2917f(c5405w, 2));
                }
                C5405w c5405w2 = this.f65966b;
                final AudioRecord audioRecord = c5405w2.f65958n;
                if (audioRecord != null) {
                    ByteBuffer byteBuffer = c5405w2.f65961q;
                    final int i7 = audioRecord.read(byteBuffer, byteBuffer.capacity());
                    if (i7 < 0) {
                        final String strA = C3259x.a(i7, "get playback audio record data return code is: ");
                        InterfaceC8094b.c(this.f65966b, strA, null, 14);
                        this.f65965a.set(false);
                        AudioRecord audioRecord2 = this.f65966b.f65958n;
                        if (audioRecord2 != null) {
                            audioRecord2.stop();
                        }
                        AudioRecord audioRecord3 = this.f65966b.f65958n;
                        if (audioRecord3 != null) {
                            audioRecord3.release();
                        }
                        final C5405w c5405w3 = this.f65966b;
                        c5405w3.f65958n = null;
                        if (i7 == -6) {
                            c5405w3.B(new Function0(c5405w3, strA, audioRecord, i7) { // from class: com.bilibili.mediastreaming.audio.track.u

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final C5405w f65944a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final String f65945b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final AudioRecord f65946c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                public final int f65947d;

                                {
                                    this.f65944a = c5405w3;
                                    this.f65945b = strA;
                                    this.f65946c = audioRecord;
                                    this.f65947d = i7;
                                }

                                public final Object invoke() {
                                    AudioRecord audioRecord4 = this.f65946c;
                                    C5405w c5405w4 = this.f65944a;
                                    iC.h hVar = c5405w4.f65964t;
                                    String str = this.f65945b;
                                    if (hVar != null) {
                                        hVar.b(G.p.a(str, ": ERROR_DEAD_OBJECT"), Integer.valueOf(audioRecord4.getState()), Integer.valueOf(audioRecord4.getRecordingState()));
                                    }
                                    iC.h hVar2 = c5405w4.f65964t;
                                    if (hVar2 != null) {
                                        hVar2.d(G.p.a(str, ": ERROR_DEAD_OBJECT"), Integer.valueOf(audioRecord4.getState()), Integer.valueOf(audioRecord4.getRecordingState()), this.f65947d);
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        } else if (i7 == -3) {
                            c5405w3.B(new Function0(c5405w3, strA, audioRecord, i7) { // from class: com.bilibili.mediastreaming.audio.track.r

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final C5405w f65932a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final String f65933b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final AudioRecord f65934c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                public final int f65935d;

                                {
                                    this.f65932a = c5405w3;
                                    this.f65933b = strA;
                                    this.f65934c = audioRecord;
                                    this.f65935d = i7;
                                }

                                public final Object invoke() {
                                    AudioRecord audioRecord4 = this.f65934c;
                                    C5405w c5405w4 = this.f65932a;
                                    iC.h hVar = c5405w4.f65964t;
                                    String str = this.f65933b;
                                    if (hVar != null) {
                                        hVar.b(G.p.a(str, ": ERROR_INVALID_OPERATION"), Integer.valueOf(audioRecord4.getState()), Integer.valueOf(audioRecord4.getRecordingState()));
                                    }
                                    iC.h hVar2 = c5405w4.f65964t;
                                    if (hVar2 != null) {
                                        hVar2.d(G.p.a(str, ": ERROR_INVALID_OPERATION"), Integer.valueOf(audioRecord4.getState()), Integer.valueOf(audioRecord4.getRecordingState()), this.f65935d);
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        } else if (i7 == -2) {
                            c5405w3.B(new Function0(c5405w3, strA, audioRecord, i7) { // from class: com.bilibili.mediastreaming.audio.track.s

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final C5405w f65936a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final String f65937b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final AudioRecord f65938c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                public final int f65939d;

                                {
                                    this.f65936a = c5405w3;
                                    this.f65937b = strA;
                                    this.f65938c = audioRecord;
                                    this.f65939d = i7;
                                }

                                public final Object invoke() {
                                    AudioRecord audioRecord4 = this.f65938c;
                                    C5405w c5405w4 = this.f65936a;
                                    iC.h hVar = c5405w4.f65964t;
                                    String str = this.f65937b;
                                    if (hVar != null) {
                                        hVar.b(G.p.a(str, ": ERROR_BAD_VALUE"), Integer.valueOf(audioRecord4.getState()), Integer.valueOf(audioRecord4.getRecordingState()));
                                    }
                                    iC.h hVar2 = c5405w4.f65964t;
                                    if (hVar2 != null) {
                                        hVar2.d(G.p.a(str, ": ERROR_BAD_VALUE"), Integer.valueOf(audioRecord4.getState()), Integer.valueOf(audioRecord4.getRecordingState()), this.f65939d);
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        } else if (i7 != -1) {
                            c5405w3.B(new C5404v(c5405w3, strA, audioRecord, i7));
                        } else {
                            c5405w3.B(new Function0(c5405w3, strA, audioRecord, i7) { // from class: com.bilibili.mediastreaming.audio.track.t

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final C5405w f65940a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final String f65941b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final AudioRecord f65942c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                public final int f65943d;

                                {
                                    this.f65940a = c5405w3;
                                    this.f65941b = strA;
                                    this.f65942c = audioRecord;
                                    this.f65943d = i7;
                                }

                                public final Object invoke() {
                                    AudioRecord audioRecord4 = this.f65942c;
                                    C5405w c5405w4 = this.f65940a;
                                    iC.h hVar = c5405w4.f65964t;
                                    String str = this.f65941b;
                                    if (hVar != null) {
                                        hVar.b(G.p.a(str, ": ERROR"), Integer.valueOf(audioRecord4.getState()), Integer.valueOf(audioRecord4.getRecordingState()));
                                    }
                                    iC.h hVar2 = c5405w4.f65964t;
                                    if (hVar2 != null) {
                                        hVar2.d(G.p.a(str, ": ERROR"), Integer.valueOf(audioRecord4.getState()), Integer.valueOf(audioRecord4.getRecordingState()), this.f65943d);
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                    } else {
                        this.f65966b.sendAudioLenS16(i7, (i7 / audioRecord.getChannelCount()) / C5405w.z(this.f65966b.f65963s), audioRecord.getChannelCount(), audioRecord.getSampleRate(), 0L);
                        byteBuffer.clear();
                    }
                }
            }
            InterfaceC8094b.b(this.f65966b, getName() + ", run done!", null, 14);
        }
    }

    public C5405w(@NotNull Context context, @NotNull MediaProjection mediaProjection, int i7, int i8, int i9) {
        super("BLiveAudioInnerCaptureSource", false, "BiliAudioInnerCaptureTrack", 2, null);
        this.f65953i = context;
        this.f65954j = mediaProjection;
        this.f65955k = i7;
        this.f65956l = i8;
        this.f65957m = i9;
        int i10 = 0;
        this.f65961q = ByteBuffer.allocateDirect(0);
        if (i8 == 1) {
            i10 = 16;
        } else if (i8 == 2) {
            i10 = 12;
        }
        this.f65962r = i10;
        this.f65963s = 2;
        setChildReleaseCoroutine(true);
        com.bilibili.mediastreaming.audio.croutine.d.g(getMAudioTrackCoroutine(), new I9.j(this, 2));
    }

    public static Unit y(C5405w c5405w) {
        InterfaceC8094b.b(c5405w, "audio release...", null, 14);
        super.release();
        InterfaceC8094b.b(c5405w, "audio release done!", null, 14);
        return Unit.INSTANCE;
    }

    public static int z(int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException(C3259x.a(i7, "Bad audio format "));
        }
        int i8 = 2;
        if (i7 != 1) {
            i8 = 2;
            if (i7 != 2) {
                i8 = 1;
                if (i7 != 3) {
                    i8 = 4;
                    if (i7 != 4) {
                        if (i7 != 13) {
                            throw new IllegalArgumentException(C3259x.a(i7, "Bad audio format "));
                        }
                        i8 = 2;
                    }
                }
            }
        }
        return i8;
    }

    public final void A() {
        try {
            a aVar = this.f65959o;
            if (aVar != null) {
                aVar.f65965a.set(false);
            }
            a aVar2 = this.f65959o;
            if (aVar2 != null) {
                aVar2.join();
            }
            this.f65959o = null;
            AudioRecord audioRecord = this.f65958n;
            if (audioRecord != null) {
                audioRecord.stop();
            }
        } catch (Exception e7) {
            final String strA = C4496a.a("stop fail, exception message:", e7.getMessage());
            B(new Function0(this, strA) { // from class: com.bilibili.mediastreaming.audio.track.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5405w f65926a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f65927b;

                {
                    this.f65926a = this;
                    this.f65927b = strA;
                }

                public final Object invoke() {
                    C5405w c5405w = this.f65926a;
                    iC.h hVar = c5405w.f65964t;
                    if (hVar != null) {
                        AudioRecord audioRecord2 = c5405w.f65958n;
                        Integer numValueOf = null;
                        Integer numValueOf2 = audioRecord2 != null ? Integer.valueOf(audioRecord2.getState()) : null;
                        AudioRecord audioRecord3 = c5405w.f65958n;
                        if (audioRecord3 != null) {
                            numValueOf = Integer.valueOf(audioRecord3.getRecordingState());
                        }
                        hVar.d(this.f65927b, numValueOf2, numValueOf, -1);
                    }
                    return Unit.INSTANCE;
                }
            });
            InterfaceC8094b.a(this, strA, null, e7, 6);
        }
    }

    public final void B(@NotNull Function0<Unit> function0) {
        com.bilibili.mediastreaming.audio.croutine.d.h(getMAudioTrackCoroutine(), new BiliAudioInnerCaptureTrack$runOnDefaultCoroutine$1(function0, null));
    }

    @Override // com.bilibili.mediastreaming.audio.track.BiliAudioTrack
    public final void release() {
        runOnAudioWorkCoroutineInvoke("control release", new i1(this, 3));
        runOnAudioNativeCoroutineInvoke("audio release", new I9.m(this, 3));
        getMAudioTrackCoroutine().d();
        this.f65961q.clear();
    }
}
