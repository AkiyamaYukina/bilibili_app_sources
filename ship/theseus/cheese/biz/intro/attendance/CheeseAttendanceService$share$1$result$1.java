package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import com.bilibili.playerbizcommonv2.widget.share.ShareLoadingDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceService$share$1$result$1.class */
public final class CheeseAttendanceService$share$1$result$1 extends SuspendLambda implements Function2<ShareLoadingDialog, Continuation<? super Boolean>, Object> {
    final String $shareId;
    Object L$0;
    int label;
    final l this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceService$share$1$result$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceService$share$1$result$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final ShareLoadingDialog $it;
        final String $shareId;
        Object L$0;
        Object L$1;
        int label;
        final l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, String str, ShareLoadingDialog shareLoadingDialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = lVar;
            this.$shareId = str;
            this.$it = shareLoadingDialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$shareId, this.$it, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0201  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 629
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceService$share$1$result$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseAttendanceService$share$1$result$1(l lVar, String str, Continuation<? super CheeseAttendanceService$share$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$shareId = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseAttendanceService$share$1$result$1 cheeseAttendanceService$share$1$result$1 = new CheeseAttendanceService$share$1$result$1(this.this$0, this.$shareId, continuation);
        cheeseAttendanceService$share$1$result$1.L$0 = obj;
        return cheeseAttendanceService$share$1$result$1;
    }

    public final Object invoke(ShareLoadingDialog shareLoadingDialog, Continuation<? super Boolean> continuation) {
        return create(shareLoadingDialog, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$shareId, (ShareLoadingDialog) this.L$0, null);
                this.label = 1;
                Object objWithTimeout = TimeoutKt.withTimeout(com.bilibili.ogv.operation2.inlinevideo.v.f70979a, anonymousClass1, this);
                obj = objWithTimeout;
                if (objWithTimeout == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(((Boolean) obj).booleanValue());
        } catch (Exception e7) {
            BLog.e("CheeseAttendanceService$share$1$result$1-invokeSuspend", "[theseus-cheese-CheeseAttendanceService$share$1$result$1-invokeSuspend] " + N4.a.a("share failed: ", e7), (Throwable) null);
            return Boxing.boxBoolean(false);
        }
    }
}
