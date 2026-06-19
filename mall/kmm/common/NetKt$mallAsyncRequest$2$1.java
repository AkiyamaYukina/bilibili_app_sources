package com.bilibili.mall.kmm.common;

import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/common/NetKt$mallAsyncRequest$2$1.class */
final class NetKt$mallAsyncRequest$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Map<String, Object> $headers;
    final CancellableContinuation<String> $it;
    final String $method;
    final Map<String, Object> $params;
    final String $url;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NetKt$mallAsyncRequest$2$1(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, CancellableContinuation<? super String> cancellableContinuation, Continuation<? super NetKt$mallAsyncRequest$2$1> continuation) {
        super(2, continuation);
        this.$url = str;
        this.$method = str2;
        this.$headers = map;
        this.$params = map2;
        this.$it = cancellableContinuation;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetKt$mallAsyncRequest$2$1(this.$url, this.$method, this.$headers, this.$params, this.$it, continuation);
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
                Function5<? super String, ? super String, ? super Map<String, ? extends Object>, ? super Map<String, ? extends Object>, ? super Continuation<? super String>, ? extends Object> function5 = g.f65595a;
                if (function5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mallAppNetImpl");
                    function5 = null;
                }
                Object objInvoke = function5.invoke(str, str2, map, map2, this);
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
