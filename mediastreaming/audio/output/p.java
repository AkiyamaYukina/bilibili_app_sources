package com.bilibili.mediastreaming.audio.output;

import kntr.common.ad.core.AdSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import nh0.C8093a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/output/p.class */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f65770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f65771c;

    public /* synthetic */ p(int i7, Object obj, Object obj2) {
        this.f65769a = i7;
        this.f65770b = obj;
        this.f65771c = obj2;
    }

    public final Object invoke() {
        switch (this.f65769a) {
            case 0:
                BiliAudioPlayOutput biliAudioPlayOutput = (BiliAudioPlayOutput) this.f65770b;
                biliAudioPlayOutput.E();
                return Integer.valueOf(biliAudioPlayOutput.D((C8093a) this.f65771c));
            default:
                ((Function1) this.f65770b).invoke((AdSlot) this.f65771c);
                return Unit.INSTANCE;
        }
    }
}
