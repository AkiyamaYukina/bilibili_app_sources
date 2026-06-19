package com.bilibili.ship.theseus.ogv;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmService$downgradeDrmIfNeeded$2$2$1.class */
public final class OgvDrmService$downgradeDrmIfNeeded$2$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final OgvDrmService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvDrmService$downgradeDrmIfNeeded$2$2$1(OgvDrmService ogvDrmService, Continuation<? super OgvDrmService$downgradeDrmIfNeeded$2$2$1> continuation) {
        super(1, continuation);
        this.this$0 = ogvDrmService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvDrmService$downgradeDrmIfNeeded$2$2$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.keel.player.j jVar = this.this$0.h;
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
        BLog.i("OgvDrmService$downgradeDrmIfNeeded$2$2$1-invokeSuspend", "[theseus-ogv-OgvDrmService$downgradeDrmIfNeeded$2$2$1-invokeSuspend] no need to fallback on drm first frame success");
        return Unit.INSTANCE;
    }
}
