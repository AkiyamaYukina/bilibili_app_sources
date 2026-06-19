package com.bilibili.studio.editor.question.manager;

import com.alibaba.fastjson.JSON;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.editor.question.bean.InvestigationConfig;
import com.bilibili.studio.editor.question.bean.QuestionConfig;
import com.bilibili.studio.editor.question.service.QuestionApiService;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/manager/QuestionApiManager$getDataFromNet$1.class */
final class QuestionApiManager$getDataFromNet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public QuestionApiManager$getDataFromNet$1(Continuation<? super QuestionApiManager$getDataFromNet$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuestionApiManager$getDataFromNet$1(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                ((QuestionApiService) ServiceGenerator.createService(QuestionApiService.class)).requestInvestigationEvent().enqueue(new Vz0.a(cancellableContinuationImpl, 0));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                obj = result;
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            InvestigationConfig investigationConfig = (InvestigationConfig) obj;
            Map<String, QuestionConfig> map = a.f108211a;
            String jSONString = JSON.toJSONString(investigationConfig);
            if (jSONString != null) {
                BuildersKt.launch$default(a.f108212b, Dispatchers.getIO(), (CoroutineStart) null, new QuestionApiManager$saveDataInLocal$1(jSONString, null), 2, (Object) null);
            }
            a.a(investigationConfig);
            Wz0.a.a("【问卷调查事件：返回成功】 接口返回成功 questionMap = " + a.f108211a);
        } catch (Exception e7) {
            e7.printStackTrace();
            Wz0.a.a("【问卷调查事件：返回失败】 接口返回失败 reason = " + e7);
        }
        return Unit.INSTANCE;
    }
}
