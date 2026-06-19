package com.bilibili.lib.push;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HuaweiNotificationActivity$enableNotification$1.class */
final class HuaweiNotificationActivity$enableNotification$1 extends ContinuationImpl {
    int label;
    Object result;
    final HuaweiNotificationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuaweiNotificationActivity$enableNotification$1(HuaweiNotificationActivity huaweiNotificationActivity, Continuation<? super HuaweiNotificationActivity$enableNotification$1> continuation) {
        super(continuation);
        this.this$0 = huaweiNotificationActivity;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objK6 = HuaweiNotificationActivity.K6(this.this$0, this);
        return objK6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK6 : Result.box-impl(objK6);
    }
}
