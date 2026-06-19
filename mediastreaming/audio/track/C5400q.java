package com.bilibili.mediastreaming.audio.track;

import android.media.AudioRecord;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.mediastreaming.audio.track.C5405w;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import nh0.InterfaceC8094b;

/* JADX INFO: renamed from: com.bilibili.mediastreaming.audio.track.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/q.class */
public final /* synthetic */ class C5400q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.BooleanRef f65930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5405w f65931b;

    public /* synthetic */ C5400q(Ref.BooleanRef booleanRef, C5405w c5405w) {
        this.f65930a = booleanRef;
        this.f65931b = c5405w;
    }

    public final Object invoke() {
        final C5405w c5405w = this.f65931b;
        if (c5405w.f65958n == null) {
            c5405w.B(new I9.e(c5405w, 5));
            InterfaceC8094b.a(c5405w, "mAudioRecord is nullptr!!!!", null, null, 14);
        }
        final AudioRecord audioRecord = c5405w.f65958n;
        boolean z6 = false;
        if (audioRecord != null) {
            final int state = audioRecord.getState();
            if (state != 1) {
                c5405w.B(new Function0(c5405w, state) { // from class: com.bilibili.mediastreaming.audio.track.l

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C5405w f65918a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f65919b;

                    {
                        this.f65918a = c5405w;
                        this.f65919b = state;
                    }

                    public final Object invoke() {
                        iC.h hVar = this.f65918a.f65964t;
                        if (hVar != null) {
                            hVar.c("record current state not is INITIALIZED!!!!", Integer.valueOf(this.f65919b), (Integer) null);
                        }
                        return Unit.INSTANCE;
                    }
                });
                InterfaceC8094b.a(c5405w, "record current state not is INITIALIZED!!!!", null, null, 14);
            } else {
                final int recordingState = audioRecord.getRecordingState();
                if (recordingState == 3) {
                    c5405w.B(new Function0(c5405w, audioRecord, recordingState) { // from class: com.bilibili.mediastreaming.audio.track.m

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final C5405w f65920a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final AudioRecord f65921b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final int f65922c;

                        {
                            this.f65920a = c5405w;
                            this.f65921b = audioRecord;
                            this.f65922c = recordingState;
                        }

                        public final Object invoke() {
                            AudioRecord audioRecord2 = this.f65921b;
                            iC.h hVar = this.f65920a.f65964t;
                            if (hVar != null) {
                                hVar.c("record current recoding state already RECORDING don't need start!!!", Integer.valueOf(audioRecord2.getState()), Integer.valueOf(this.f65922c));
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    InterfaceC8094b.a(c5405w, "record current recoding state already RECORDING don't need start!!!", null, null, 14);
                } else {
                    try {
                        audioRecord.startRecording();
                        C5405w.a aVar = c5405w.f65959o;
                        if (aVar != null) {
                            aVar.f65965a.set(false);
                        }
                        C5405w.a aVar2 = c5405w.f65959o;
                        if (aVar2 != null) {
                            aVar2.join();
                        }
                        c5405w.f65959o = null;
                        C5405w.a aVar3 = new C5405w.a(c5405w);
                        c5405w.f65959o = aVar3;
                        aVar3.start();
                        z6 = true;
                    } catch (Exception e7) {
                        final String strA = C4496a.a("startRecording fail, exception message:", e7.getMessage());
                        c5405w.B(new Function0(c5405w, strA, audioRecord) { // from class: com.bilibili.mediastreaming.audio.track.n

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final C5405w f65923a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final String f65924b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final AudioRecord f65925c;

                            {
                                this.f65923a = c5405w;
                                this.f65924b = strA;
                                this.f65925c = audioRecord;
                            }

                            public final Object invoke() {
                                AudioRecord audioRecord2 = this.f65925c;
                                iC.h hVar = this.f65923a.f65964t;
                                if (hVar != null) {
                                    hVar.c(this.f65924b, Integer.valueOf(audioRecord2.getState()), Integer.valueOf(audioRecord2.getRecordingState()));
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        InterfaceC8094b.a(c5405w, strA, null, e7, 6);
                    }
                }
            }
        }
        this.f65930a.element = z6;
        return Unit.INSTANCE;
    }
}
