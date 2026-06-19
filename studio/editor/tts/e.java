package com.bilibili.studio.editor.tts;

import com.bilibili.studio.editor.tts.bean.TtsInputBean;
import com.bilibili.studio.editor.tts.bean.TtsResultBean;
import com.bilibili.studio.editor.tts.bean.TtsResultBeans;
import com.bilibili.studio.editor.tts.exception.TtsAITaskException;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.functions.Function3;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/e.class */
public final class e implements Function3<String, String, TtsResultBeans, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafeContinuation f108348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TtsInputBean f108349b;

    public e(SafeContinuation safeContinuation, TtsInputBean ttsInputBean) {
        this.f108348a = safeContinuation;
        this.f108349b = ttsInputBean;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj2;
        TtsResultBeans ttsResultBeans = (TtsResultBeans) obj3;
        BLog.i("TtsManager", "process onSuccess taskId:" + str + " data:" + (ttsResultBeans != null ? ttsResultBeans.getResult() : null));
        String url = null;
        if (ttsResultBeans != null) {
            List<TtsResultBean> result = ttsResultBeans.getResult();
            url = null;
            if (result != null) {
                TtsResultBean ttsResultBean = (TtsResultBean) CollectionsKt.getOrNull(result, 0);
                url = null;
                if (ttsResultBean != null) {
                    url = ttsResultBean.getUrl();
                }
            }
        }
        SafeContinuation safeContinuation = this.f108348a;
        if (url == null || url.length() == 0) {
            Result.Companion companion = Result.Companion;
            safeContinuation.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new TtsAITaskException(str, "tts failed: res url is null"))))));
        } else {
            Result.Companion companion2 = Result.Companion;
            safeContinuation.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(new Pair(this.f108349b, url)))));
        }
        return Unit.INSTANCE;
    }
}
