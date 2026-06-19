package com.bilibili.studio.editor.tts;

import com.bilibili.lib.okhttp.OkHttpClientWrapper;
import com.bilibili.studio.editor.tts.bean.TtsInputBean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$startLongTts$2$2$mediaDeferred$1.class */
public final class TtsManager$startLongTts$2$2$mediaDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final Triple<TtsInputBean, String, String> $res;
    int label;
    final TtsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsManager$startLongTts$2$2$mediaDeferred$1(TtsManager ttsManager, Triple<TtsInputBean, String, String> triple, Continuation<? super TtsManager$startLongTts$2$2$mediaDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = ttsManager;
        this.$res = triple;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TtsManager$startLongTts$2$2$mediaDeferred$1(this.this$0, this.$res, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<String>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TtsManager ttsManager = this.this$0;
        String str = (String) this.$res.getThird();
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        ttsManager.getClass();
        try {
            Result.Companion companion = Result.Companion;
            Response responseExecute = OkHttpClientWrapper.get().newCall(new Request.Builder().url(str2).get().build()).execute();
            ResponseBody responseBodyBody = responseExecute.body();
            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            obj2 = (!responseExecute.isSuccessful() || strString == null || strString.length() == 0) ? Result.constructor-impl(ResultKt.createFailure(new IllegalStateException("res isNullOrEmpty"))) : Result.constructor-impl(strString);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        return Result.box-impl(obj2);
    }
}
