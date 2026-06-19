package com.bilibili.mediastreaming.audio.output;

import com.bilibili.mediastreaming.audio.output.BiliAudioPlayOutput;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/output/n.class */
public final /* synthetic */ class n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef f65764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliAudioPlayOutput f65765b;

    public /* synthetic */ n(Ref.ObjectRef objectRef, BiliAudioPlayOutput biliAudioPlayOutput) {
        this.f65764a = objectRef;
        this.f65765b = biliAudioPlayOutput;
    }

    public final Object invoke() {
        BiliAudioPlayOutput.BiliAudioTrackThread biliAudioTrackThread = this.f65765b.f65718a;
        this.f65764a.element = biliAudioTrackThread != null ? biliAudioTrackThread.f65726e : null;
        return Unit.INSTANCE;
    }
}
