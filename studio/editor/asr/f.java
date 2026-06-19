package com.bilibili.studio.editor.asr;

import androidx.compose.runtime.snapshots.z;
import com.bilibili.app.comment3.utils.r;
import com.bilibili.studio.editor.asr.bean.AudioInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/f.class */
public final class f implements Function1<String, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f105569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptionAsrManager f105570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioInfo f105571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CancellableContinuationImpl f105572d;

    public f(long j7, CaptionAsrManager captionAsrManager, AudioInfo audioInfo, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f105569a = j7;
        this.f105570b = captionAsrManager;
        this.f105571c = audioInfo;
        this.f105572d = cancellableContinuationImpl;
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f105569a;
        this.f105570b.f105518i += jCurrentTimeMillis;
        AudioInfo audioInfo = this.f105571c;
        b.k("success", audioInfo, jCurrentTimeMillis, null, 24);
        audioInfo.setAudioFilePath(str);
        this.f105572d.resumeWith(Result.constructor-impl(audioInfo));
        long jA = com.bilibili.studio.editor.asr.core.util.a.a(audioInfo.getVideoPath());
        long jA2 = com.bilibili.studio.editor.asr.core.util.a.a(str);
        StringBuilder sbA = z.a(jCurrentTimeMillis, "extractAudioFromVideo spend:", "videoSize:");
        sbA.append(jA);
        r.b(jA2, " audioSize:", "CaptionAsrManager", sbA);
        return Unit.INSTANCE;
    }
}
