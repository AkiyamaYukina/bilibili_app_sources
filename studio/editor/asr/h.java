package com.bilibili.studio.editor.asr;

import com.bilibili.studio.editor.asr.bean.AudioInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/h.class */
public final class h implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f105577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptionAsrManager f105578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioInfo f105579c;

    public h(long j7, CaptionAsrManager captionAsrManager, AudioInfo audioInfo) {
        this.f105577a = j7;
        this.f105578b = captionAsrManager;
        this.f105579c = audioInfo;
    }

    public final Object invoke() {
        BLog.i("CaptionAsrManager", "extractAudioFromVideo onCancel");
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f105577a;
        this.f105578b.f105518i += jCurrentTimeMillis;
        b.k("cancel", this.f105579c, jCurrentTimeMillis, null, 24);
        return Unit.INSTANCE;
    }
}
