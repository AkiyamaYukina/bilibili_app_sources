package com.bilibili.ship.theseus.ogv.vip.playerlayer;

import android.content.res.Configuration;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/playerlayer/OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$2$2.class */
public final class OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$2$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final OgvVipBarPlayerLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$2$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/playerlayer/OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$2$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Configuration, Continuation<? super Boolean>, Object> {
        Object L$0;
        int label;
        final OgvVipBarPlayerLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvVipBarPlayerLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Configuration configuration, Continuation<? super Boolean> continuation) {
            return create(configuration, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(OgvVipBarPlayerLayerService.c(this.this$0, (Configuration) this.L$0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$2$2(OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, Continuation<? super OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$2$2> continuation) {
        super(1, continuation);
        this.this$0 = ogvVipBarPlayerLayerService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$2$2(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService = this.this$0;
            Flow<Configuration> flow = ogvVipBarPlayerLayerService.f94846c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ogvVipBarPlayerLayerService, null);
            this.label = 1;
            if (FlowKt.first(flow, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
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
