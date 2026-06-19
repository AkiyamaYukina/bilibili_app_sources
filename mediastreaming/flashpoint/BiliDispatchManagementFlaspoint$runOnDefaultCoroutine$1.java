package com.bilibili.mediastreaming.flashpoint;

import androidx.fragment.app.z;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$runOnDefaultCoroutine$1.class */
final class BiliDispatchManagementFlaspoint$runOnDefaultCoroutine$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function2<CoroutineScope, Continuation<? super Unit>, Object> $action;
    final String $funcName;
    private Object L$0;
    int label;
    final BiliDispatchManagementFlaspoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliDispatchManagementFlaspoint$runOnDefaultCoroutine$1(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, Continuation<? super BiliDispatchManagementFlaspoint$runOnDefaultCoroutine$1> continuation) {
        super(2, continuation);
        this.$action = function2;
        this.this$0 = biliDispatchManagementFlaspoint;
        this.$funcName = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BiliDispatchManagementFlaspoint$runOnDefaultCoroutine$1 biliDispatchManagementFlaspoint$runOnDefaultCoroutine$1 = new BiliDispatchManagementFlaspoint$runOnDefaultCoroutine$1(this.$action, this.this$0, this.$funcName, continuation);
        biliDispatchManagementFlaspoint$runOnDefaultCoroutine$1.L$0 = obj;
        return biliDispatchManagementFlaspoint$runOnDefaultCoroutine$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$action;
                this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.label = 1;
                if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e7) {
            i.b(this.this$0, z.a("defaultCoroutineScope launch funcName:", this.$funcName, ", error, message:", e7.getMessage()), e7, 6);
        }
        return Unit.INSTANCE;
    }
}
