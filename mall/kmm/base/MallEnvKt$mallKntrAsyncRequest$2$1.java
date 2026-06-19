package com.bilibili.mall.kmm.base;

import com.bilibili.emoticon.impl.X0;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/base/MallEnvKt$mallKntrAsyncRequest$2$1.class */
final class MallEnvKt$mallKntrAsyncRequest$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Map<String, Object> $headers;
    final CancellableContinuation<String> $it;
    final String $method;
    final Map<String, Object> $params;
    final String $url;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MallEnvKt$mallKntrAsyncRequest$2$1(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, CancellableContinuation<? super String> cancellableContinuation, Continuation<? super MallEnvKt$mallKntrAsyncRequest$2$1> continuation) {
        super(2, continuation);
        this.$url = str;
        this.$method = str2;
        this.$headers = map;
        this.$params = map2;
        this.$it = cancellableContinuation;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallEnvKt$mallKntrAsyncRequest$2$1(this.$url, this.$method, this.$headers, this.$params, this.$it, continuation);
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
                String str = this.$url;
                String str2 = this.$method;
                Map<String, Object> map = this.$headers;
                Map<String, Object> map2 = this.$params;
                this.label = 1;
                Function4 function4 = X0.c;
                if (function4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mallKntrReuestImpl");
                    function4 = null;
                }
                Object objInvoke = function4.invoke(str, str2, map, map2);
                obj = objInvoke;
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$it.resumeWith(Result.constructor-impl((String) obj));
        } catch (Throwable th) {
            CancellableContinuation<String> cancellableContinuation = this.$it;
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.constructor-impl(ResultKt.createFailure(th)));
        }
        return Unit.INSTANCE;
    }
}
