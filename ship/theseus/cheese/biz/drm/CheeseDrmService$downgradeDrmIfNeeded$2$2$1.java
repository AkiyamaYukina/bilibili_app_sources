package com.bilibili.ship.theseus.cheese.biz.drm;

import com.bilibili.ship.theseus.keel.player.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/drm/CheeseDrmService$downgradeDrmIfNeeded$2$2$1.class */
public final class CheeseDrmService$downgradeDrmIfNeeded$2$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final CheeseDrmService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseDrmService$downgradeDrmIfNeeded$2$2$1(CheeseDrmService cheeseDrmService, Continuation<? super CheeseDrmService$downgradeDrmIfNeeded$2$2$1> continuation) {
        super(1, continuation);
        this.this$0 = cheeseDrmService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheeseDrmService$downgradeDrmIfNeeded$2$2$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            j jVar = this.this$0.f89261e;
            this.label = 1;
            if (jVar.u(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BLog.i("CheeseDrmService$downgradeDrmIfNeeded$2$2$1-invokeSuspend", "[theseus-cheese-CheeseDrmService$downgradeDrmIfNeeded$2$2$1-invokeSuspend] no need to fallback on drm first frame success");
        return Unit.INSTANCE;
    }
}
