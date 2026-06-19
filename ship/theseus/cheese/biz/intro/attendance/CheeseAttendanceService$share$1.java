package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.droid.ToastHelper;
import com.bilibili.playerbizcommonv2.widget.share.ShareLoadingDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceService$share$1.class */
final class CheeseAttendanceService$share$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $shareId;
    int label;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseAttendanceService$share$1(l lVar, String str, Continuation<? super CheeseAttendanceService$share$1> continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$shareId = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseAttendanceService$share$1(this.this$0, this.$shareId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ShareLoadingDialog shareLoadingDialog = new ShareLoadingDialog();
            l lVar = this.this$0;
            FragmentActivity fragmentActivity = lVar.f89322a;
            CheeseAttendanceService$share$1$result$1 cheeseAttendanceService$share$1$result$1 = new CheeseAttendanceService$share$1$result$1(lVar, this.$shareId, null);
            this.label = 1;
            Object objHf = shareLoadingDialog.hf(fragmentActivity, cheeseAttendanceService$share$1$result$1, this);
            obj = objHf;
            if (objHf == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            ToastHelper.showToastShort(this.this$0.f89322a, 2131855736);
        }
        return Unit.INSTANCE;
    }
}
