package com.bilibili.lib.push;

import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.push.plugin.notification.HmsNotificationManagerEx;
import com.huawei.hms.push.plugin.notification.NotificationStatus;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HuaweiNotificationActivity$enableNotification$2.class */
final class HuaweiNotificationActivity$enableNotification$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends NotificationStatus>>, Object> {
    Object L$0;
    int label;
    final HuaweiNotificationActivity this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HuaweiNotificationActivity$enableNotification$2$a.class */
    public static final class a<TResult> implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CancellableContinuationImpl f64223a;

        public a(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f64223a = cancellableContinuationImpl;
        }

        public final void onSuccess(Object obj) {
            BPushLog.i("HuaweiPushRegistry", "enable notification status success.");
            this.f64223a.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl((NotificationStatus) obj))));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HuaweiNotificationActivity$enableNotification$2$b.class */
    public static final class b implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HuaweiNotificationActivity f64224a;

        public b(HuaweiNotificationActivity huaweiNotificationActivity) {
            this.f64224a = huaweiNotificationActivity;
        }

        public final void onFailure(Exception exc) {
            BPushLog.e("HuaweiPushRegistry", " enable notification failed: " + exc.getMessage());
            String message = exc.getMessage();
            String str = message;
            if (message == null) {
                str = "";
            }
            this.f64224a.f64222x = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuaweiNotificationActivity$enableNotification$2(HuaweiNotificationActivity huaweiNotificationActivity, Continuation<? super HuaweiNotificationActivity$enableNotification$2> continuation) {
        super(2, continuation);
        this.this$0 = huaweiNotificationActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HuaweiNotificationActivity$enableNotification$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends NotificationStatus>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            HuaweiNotificationActivity huaweiNotificationActivity = this.this$0;
            this.L$0 = huaweiNotificationActivity;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            HmsNotificationManagerEx.getInstance(huaweiNotificationActivity).enableNotification().addOnSuccessListener(new a(cancellableContinuationImpl)).addOnFailureListener(new b(huaweiNotificationActivity));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = result;
            if (result == coroutine_suspended) {
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
