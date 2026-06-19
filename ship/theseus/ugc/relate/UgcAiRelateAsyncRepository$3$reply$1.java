package com.bilibili.ship.theseus.ugc.relate;

import com.bapis.bilibili.app.viewunite.v1.AIRelateAsyncReply;
import com.bapis.bilibili.app.viewunite.v1.AIRelateAsyncReq;
import com.bapis.bilibili.app.viewunite.v1.ViewMoss;
import com.bapis.bilibili.app.viewunite.v1.ViewuniteMossKtxKt;
import com.bilibili.lib.moss.api.CallOptions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/relate/UgcAiRelateAsyncRepository$3$reply$1.class */
public final class UgcAiRelateAsyncRepository$3$reply$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AIRelateAsyncReply>, Object> {
    final AIRelateAsyncReq $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcAiRelateAsyncRepository$3$reply$1(AIRelateAsyncReq aIRelateAsyncReq, Continuation<? super UgcAiRelateAsyncRepository$3$reply$1> continuation) {
        super(2, continuation);
        this.$request = aIRelateAsyncReq;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcAiRelateAsyncRepository$3$reply$1(this.$request, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AIRelateAsyncReply> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ViewMoss viewMoss = new ViewMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
            AIRelateAsyncReq aIRelateAsyncReq = this.$request;
            this.label = 1;
            Object objSuspendAIRelateAsync = ViewuniteMossKtxKt.suspendAIRelateAsync(viewMoss, aIRelateAsyncReq, this);
            obj = objSuspendAIRelateAsync;
            if (objSuspendAIRelateAsync == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
