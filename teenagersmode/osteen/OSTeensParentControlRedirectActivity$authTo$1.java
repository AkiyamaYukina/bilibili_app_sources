package com.bilibili.teenagersmode.osteen;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/osteen/OSTeensParentControlRedirectActivity$authTo$1.class */
final class OSTeensParentControlRedirectActivity$authTo$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    Object result;
    final OSTeensParentControlRedirectActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSTeensParentControlRedirectActivity$authTo$1(OSTeensParentControlRedirectActivity oSTeensParentControlRedirectActivity, Continuation<? super OSTeensParentControlRedirectActivity$authTo$1> continuation) {
        super(continuation);
        this.this$0 = oSTeensParentControlRedirectActivity;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        OSTeensParentControlRedirectActivity oSTeensParentControlRedirectActivity = this.this$0;
        int i7 = OSTeensParentControlRedirectActivity.f110578y;
        return oSTeensParentControlRedirectActivity.P6(null, null, null, this);
    }
}
