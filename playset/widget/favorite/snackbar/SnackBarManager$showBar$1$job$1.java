package com.bilibili.playset.widget.favorite.snackbar;

import com.bilibili.playset.widget.favorite.snackbar.SnackBarManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/snackbar/SnackBarManager$showBar$1$job$1.class */
public final class SnackBarManager$showBar$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final SnackBarManager.a $data;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackBarManager$showBar$1$job$1(SnackBarManager.a aVar, Continuation<? super SnackBarManager$showBar$1$job$1> continuation) {
        super(2, continuation);
        this.$data = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SnackBarManager$showBar$1$job$1(this.$data, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = this.$data.f85796c;
            this.label = 1;
            if (DelayKt.delay(j7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BLog.i("SnackBarManager", "dismiss cause of time is up");
        SnackBarManager.a();
        return Unit.INSTANCE;
    }
}
