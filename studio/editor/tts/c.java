package com.bilibili.studio.editor.tts;

import com.bilibili.studio.editor.tts.bean.LongTtsResultBean;
import com.bilibili.studio.editor.tts.bean.TtsInputBean;
import com.bilibili.studio.editor.tts.exception.TtsAITaskException;
import j4.o;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/c.class */
public final class c implements Function3<String, String, LongTtsResultBean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafeContinuation f108345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TtsInputBean f108346b;

    public c(SafeContinuation safeContinuation, TtsInputBean ttsInputBean) {
        this.f108345a = safeContinuation;
        this.f108346b = ttsInputBean;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj2;
        LongTtsResultBean longTtsResultBean = (LongTtsResultBean) obj3;
        String metaUrl = null;
        o.a("process onSuccess taskId:", str, " data:", longTtsResultBean != null ? longTtsResultBean.getAudioUrl() : null, "TtsManager");
        String audioUrl = longTtsResultBean != null ? longTtsResultBean.getAudioUrl() : null;
        SafeContinuation safeContinuation = this.f108345a;
        if (audioUrl == null || audioUrl.length() == 0) {
            Result.Companion companion = Result.Companion;
            safeContinuation.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new TtsAITaskException(str, "tts failed: audio url is null"))))));
        } else {
            String metaUrl2 = longTtsResultBean != null ? longTtsResultBean.getMetaUrl() : null;
            if (metaUrl2 == null || metaUrl2.length() == 0) {
                Result.Companion companion2 = Result.Companion;
                safeContinuation.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new TtsAITaskException(str, "tts failed: meta url is null"))))));
            } else {
                Result.Companion companion3 = Result.Companion;
                String audioUrl2 = longTtsResultBean != null ? longTtsResultBean.getAudioUrl() : null;
                if (longTtsResultBean != null) {
                    metaUrl = longTtsResultBean.getMetaUrl();
                }
                safeContinuation.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(new Triple(this.f108346b, audioUrl2, metaUrl)))));
            }
        }
        return Unit.INSTANCE;
    }
}
