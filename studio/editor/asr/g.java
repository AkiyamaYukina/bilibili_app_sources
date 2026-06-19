package com.bilibili.studio.editor.asr;

import com.bilibili.studio.editor.asr.bean.AudioInfo;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/g.class */
public final class g implements Function1<Exception, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f105573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptionAsrManager f105574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioInfo f105575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CancellableContinuationImpl f105576d;

    public g(long j7, CaptionAsrManager captionAsrManager, AudioInfo audioInfo, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f105573a = j7;
        this.f105574b = captionAsrManager;
        this.f105575c = audioInfo;
        this.f105576d = cancellableContinuationImpl;
    }

    public final Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        BLog.i("CaptionAsrManager", "extractAudioFromVideo onFailed it" + exc.getMessage());
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f105573a;
        this.f105574b.f105518i += jCurrentTimeMillis;
        b.k("failed", this.f105575c, jCurrentTimeMillis, exc.getMessage(), 16);
        Result.Companion companion = Result.Companion;
        this.f105576d.resumeWith(Result.constructor-impl(ResultKt.createFailure(exc)));
        return Unit.INSTANCE;
    }
}
