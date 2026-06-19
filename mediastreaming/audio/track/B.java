package com.bilibili.mediastreaming.audio.track;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import nh0.C8093a;
import nh0.InterfaceC8094b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/B.class */
public final /* synthetic */ class B implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.BooleanRef f65778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliAudioRecordTrack f65779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C8093a f65780c;

    public /* synthetic */ B(BiliAudioRecordTrack biliAudioRecordTrack, Ref.BooleanRef booleanRef, C8093a c8093a) {
        this.f65778a = booleanRef;
        this.f65779b = biliAudioRecordTrack;
        this.f65780c = c8093a;
    }

    public final Object invoke() {
        final BiliAudioRecordTrack biliAudioRecordTrack = this.f65779b;
        boolean zI = biliAudioRecordTrack.I();
        Ref.BooleanRef booleanRef = this.f65778a;
        booleanRef.element = zI;
        InterfaceC8094b.b(biliAudioRecordTrack, "restartRecordStream, stopRecordStream, result:" + zI, null, 14);
        final C8093a c8093a = this.f65780c;
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        biliAudioRecordTrack.runOnAudioWorkCoroutineInvoke("openRecordStream", new Function0(biliAudioRecordTrack, booleanRef2, c8093a) { // from class: com.bilibili.mediastreaming.audio.track.D

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioRecordTrack f65814a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C8093a f65815b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Ref.BooleanRef f65816c;

            {
                this.f65814a = biliAudioRecordTrack;
                this.f65815b = c8093a;
                this.f65816c = booleanRef2;
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 936
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mediastreaming.audio.track.D.invoke():java.lang.Object");
            }
        });
        boolean z6 = booleanRef2.element;
        booleanRef.element = z6;
        InterfaceC8094b.b(biliAudioRecordTrack, "restartRecordStream, openRecordStream, result:" + z6, null, 14);
        return Unit.INSTANCE;
    }
}
