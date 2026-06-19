package com.bilibili.ship.theseus.ugc.endpage;

import com.bilibili.ship.theseus.keel.player.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCVerticalFullScreenEndPageWidget$onCreateContentView$1$1.class */
public final class UGCVerticalFullScreenEndPageWidget$onCreateContentView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UGCVerticalFullScreenEndPageWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCVerticalFullScreenEndPageWidget$onCreateContentView$1$1(UGCVerticalFullScreenEndPageWidget uGCVerticalFullScreenEndPageWidget, Continuation<? super UGCVerticalFullScreenEndPageWidget$onCreateContentView$1$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCVerticalFullScreenEndPageWidget;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCVerticalFullScreenEndPageWidget$onCreateContentView$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.f96564e.p();
            j jVarJ = this.this$0.f96564e.j();
            if (jVarJ != null) {
                this.label = 1;
                if (jVarJ.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
