package com.bilibili.studio.editor.question.manager;

import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/manager/QuestionApiManager$saveDataInLocal$1.class */
final class QuestionApiManager$saveDataInLocal$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionApiManager$saveDataInLocal$1(String str, Continuation<? super QuestionApiManager$saveDataInLocal$1> continuation) {
        super(2, continuation);
        this.$value = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuestionApiManager$saveDataInLocal$1(this.$value, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Application application = BiliContext.application();
        if (application != null) {
            BiliGlobalPreferenceHelper.getInstance(application).setString("upper_investigation_events_key", this.$value);
        }
        return Unit.INSTANCE;
    }
}
