package com.bilibili.studio.editor.tts;

import com.bilibili.lib.okdownloader.DownloadListener;
import com.bilibili.studio.editor.tts.bean.TtsInputBean;
import com.bilibili.studio.editor.tts.exception.TtsDownloadException;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.SafeContinuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/a.class */
public final class a implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafeContinuation f108341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Triple<TtsInputBean, String, String> f108342b;

    public a(SafeContinuation safeContinuation, Triple triple) {
        this.f108341a = safeContinuation;
        this.f108342b = triple;
    }

    public final void onError(String str, List<Integer> list, long j7, long j8) {
        super.onError(str, list, j7, j8);
        TtsDownloadException ttsDownloadException = new TtsDownloadException(com.bilibili.app.comm.rubick.common.g.b(list != null ? (Integer) CollectionsKt.getOrNull(list, 0) : null, "download fail code:"));
        Result.Companion companion = Result.Companion;
        com.bilibili.studio.videoeditor.extension.d.b(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(ttsDownloadException))), this.f108341a);
    }

    public final void onFinish(String str, String str2, String str3) {
        super.onFinish(str, str2, str3);
        Result.Companion companion = Result.Companion;
        com.bilibili.studio.videoeditor.extension.d.b(Result.box-impl(Result.constructor-impl(this.f108342b)), this.f108341a);
    }
}
