package com.bilibili.teenagersmode.osteen;

import android.content.Context;
import com.bilibili.droid.ToastHelper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/osteen/OSTeensParentControlRedirectActivity$authTo$2.class */
final class OSTeensParentControlRedirectActivity$authTo$2 extends SuspendLambda implements Function2<Exception, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;
    final OSTeensParentControlRedirectActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSTeensParentControlRedirectActivity$authTo$2(OSTeensParentControlRedirectActivity oSTeensParentControlRedirectActivity, Continuation<? super OSTeensParentControlRedirectActivity$authTo$2> continuation) {
        super(2, continuation);
        this.this$0 = oSTeensParentControlRedirectActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OSTeensParentControlRedirectActivity$authTo$2 oSTeensParentControlRedirectActivity$authTo$2 = new OSTeensParentControlRedirectActivity$authTo$2(this.this$0, continuation);
        oSTeensParentControlRedirectActivity$authTo$2.L$0 = obj;
        return oSTeensParentControlRedirectActivity$authTo$2;
    }

    public final Object invoke(Exception exc, Continuation<? super Boolean> continuation) {
        return create(exc, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Exception exc = (Exception) this.L$0;
        Context applicationContext = this.this$0.getApplicationContext();
        String message = exc.getMessage();
        String str = message;
        if (message == null) {
            str = "验证失败";
        }
        ToastHelper.showToastShort(applicationContext, str);
        return Boxing.boxBoolean(true);
    }
}
