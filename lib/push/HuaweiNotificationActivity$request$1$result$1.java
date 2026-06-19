package com.bilibili.lib.push;

import com.huawei.hms.push.plugin.notification.NotificationStatus;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HuaweiNotificationActivity$request$1$result$1.class */
public final class HuaweiNotificationActivity$request$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends NotificationStatus>>, Object> {
    int label;
    final HuaweiNotificationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuaweiNotificationActivity$request$1$result$1(HuaweiNotificationActivity huaweiNotificationActivity, Continuation<? super HuaweiNotificationActivity$request$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = huaweiNotificationActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HuaweiNotificationActivity$request$1$result$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends NotificationStatus>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            HuaweiNotificationActivity huaweiNotificationActivity = this.this$0;
            this.label = 1;
            Object objK6 = HuaweiNotificationActivity.K6(huaweiNotificationActivity, this);
            obj2 = objK6;
            if (objK6 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        return Result.box-impl(obj2);
    }
}
