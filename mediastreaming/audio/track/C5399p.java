package com.bilibili.mediastreaming.audio.track;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.bilibili.mediastreaming.audio.track.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/p.class */
public final /* synthetic */ class C5399p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5405w f65928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65929b;

    public /* synthetic */ C5399p(C5405w c5405w, String str) {
        this.f65928a = c5405w;
        this.f65929b = str;
    }

    public final Object invoke() {
        iC.h hVar = this.f65928a.f65964t;
        if (hVar != null) {
            hVar.a(this.f65929b);
        }
        return Unit.INSTANCE;
    }
}
