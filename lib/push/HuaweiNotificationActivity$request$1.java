package com.bilibili.lib.push;

import android.content.IntentSender;
import com.huawei.hms.push.plugin.notification.NotificationStatus;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HuaweiNotificationActivity$request$1.class */
final class HuaweiNotificationActivity$request$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $timeOut;
    int label;
    final HuaweiNotificationActivity this$0;

    /* JADX INFO: renamed from: com.bilibili.lib.push.HuaweiNotificationActivity$request$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HuaweiNotificationActivity$request$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Object $result;
        int label;
        final HuaweiNotificationActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, HuaweiNotificationActivity huaweiNotificationActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$result = obj;
            this.this$0 = huaweiNotificationActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$result, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Unit unit;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Object obj2 = this.$result;
                if (Result.isFailure-impl(obj2)) {
                    obj2 = null;
                }
                NotificationStatus notificationStatus = (NotificationStatus) obj2;
                unit = null;
                if (notificationStatus != null) {
                    notificationStatus.startResolutionForResult(this.this$0, 100);
                    unit = Unit.INSTANCE;
                }
            } catch (IntentSender.SendIntentException e7) {
                HuaweiNotificationActivity huaweiNotificationActivity = this.this$0;
                String message = e7.getMessage();
                String str = message;
                if (message == null) {
                    str = "";
                }
                huaweiNotificationActivity.f64222x = str;
                BPushLog.e("HuaweiPushRegistry", "enable notification catch exception: " + e7.getMessage());
                this.this$0.L6(1, false, false);
                unit = Unit.INSTANCE;
            }
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuaweiNotificationActivity$request$1(long j7, HuaweiNotificationActivity huaweiNotificationActivity, Continuation<? super HuaweiNotificationActivity$request$1> continuation) {
        super(2, continuation);
        this.$timeOut = j7;
        this.this$0 = huaweiNotificationActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HuaweiNotificationActivity$request$1(this.$timeOut, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
        } catch (Exception e7) {
            BPushLog.e("HuaweiPushRegistry", "enable notification catch exception: " + e7.getMessage());
            HuaweiNotificationActivity huaweiNotificationActivity = this.this$0;
            String message = e7.getMessage();
            String str = message;
            if (message == null) {
                str = "enable notification failed";
            }
            huaweiNotificationActivity.f64222x = str;
            this.this$0.L6(4, false, false);
        } catch (TimeoutCancellationException e8) {
            BPushLog.e("HuaweiPushRegistry", "enable notification timeout.");
            HuaweiNotificationActivity huaweiNotificationActivity2 = this.this$0;
            huaweiNotificationActivity2.f64222x = "enable notification timeout";
            huaweiNotificationActivity2.L6(3, false, false);
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = this.$timeOut;
            HuaweiNotificationActivity$request$1$result$1 huaweiNotificationActivity$request$1$result$1 = new HuaweiNotificationActivity$request$1$result$1(this.this$0, null);
            this.label = 1;
            Object objWithTimeout = TimeoutKt.withTimeout(j7, huaweiNotificationActivity$request$1$result$1, this);
            obj = objWithTimeout;
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        Object obj2 = ((Result) obj).unbox-impl();
        if (!Result.isSuccess-impl(obj2)) {
            BPushLog.e("HuaweiPushRegistry", "enable notification failed.");
            HuaweiNotificationActivity huaweiNotificationActivity3 = this.this$0;
            int i8 = HuaweiNotificationActivity.f64221y;
            huaweiNotificationActivity3.L6(2, false, false);
            return Unit.INSTANCE;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(obj2, this.this$0, null);
        this.label = 2;
        Object objWithContext = BuildersKt.withContext(main, anonymousClass1, this);
        obj = objWithContext;
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
