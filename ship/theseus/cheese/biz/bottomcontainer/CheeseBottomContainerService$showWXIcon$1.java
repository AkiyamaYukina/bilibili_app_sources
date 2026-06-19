package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import androidx.fragment.app.FragmentActivity;
import com.alipay.sdk.app.PayTask;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$showWXIcon$1.class */
final class CheeseBottomContainerService$showWXIcon$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final WeakReference<CheeseBottomContainerService> $weakSelf;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseBottomContainerService$showWXIcon$1(WeakReference<CheeseBottomContainerService> weakReference, Continuation<? super CheeseBottomContainerService$showWXIcon$1> continuation) {
        super(2, continuation);
        this.$weakSelf = weakReference;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseBottomContainerService$showWXIcon$1(this.$weakSelf, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(PayTask.f60018j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CheeseBottomContainerService cheeseBottomContainerService = this.$weakSelf.get();
        if (cheeseBottomContainerService != null) {
            FragmentActivity fragmentActivity = cheeseBottomContainerService.f89027d;
            if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
                return Unit.INSTANCE;
            }
            cheeseBottomContainerService.c();
        }
        return Unit.INSTANCE;
    }
}
