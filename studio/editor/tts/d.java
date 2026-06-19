package com.bilibili.studio.editor.tts;

import androidx.core.app.o;
import com.bilibili.studio.editor.tts.exception.TtsAITaskException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/d.class */
public final class d implements Function2<Integer, String, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafeContinuation f108347a;

    public d(SafeContinuation safeContinuation) {
        this.f108347a = safeContinuation;
    }

    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        androidx.constraintlayout.widget.a.b(iIntValue, "process failed :", " errorMsg:", str, "TtsManager");
        Result.Companion companion = Result.Companion;
        this.f108347a.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new TtsAITaskException("", o.a(iIntValue, "tts failed: code=", " errorMsg", str)))))));
        return Unit.INSTANCE;
    }
}
