package com.bilibili.teenagersmode.osteen;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/osteen/OSTeensParentControlRedirectActivity$onCreate$1$toFinish$1.class */
public final class OSTeensParentControlRedirectActivity$onCreate$1$toFinish$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    int label;
    final OSTeensParentControlRedirectActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSTeensParentControlRedirectActivity$onCreate$1$toFinish$1(OSTeensParentControlRedirectActivity oSTeensParentControlRedirectActivity, Continuation<? super OSTeensParentControlRedirectActivity$onCreate$1$toFinish$1> continuation) {
        super(1, continuation);
        this.this$0 = oSTeensParentControlRedirectActivity;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OSTeensParentControlRedirectActivity$onCreate$1$toFinish$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Boolean> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.setResult(-1);
        return Boxing.boxBoolean(true);
    }
}
