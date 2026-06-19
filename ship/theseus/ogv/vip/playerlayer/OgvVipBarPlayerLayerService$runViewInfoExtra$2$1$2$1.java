package com.bilibili.ship.theseus.ogv.vip.playerlayer;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/playerlayer/OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$2$1.class */
public final class OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final a $layer;
    final e $viewModel;
    Object L$0;
    Object L$1;
    int label;
    final OgvVipBarPlayerLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$2$1(OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, e eVar, a aVar, Continuation<? super OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$2$1> continuation) {
        super(1, continuation);
        this.this$0 = ogvVipBarPlayerLayerService;
        this.$viewModel = eVar;
        this.$layer = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvVipBarPlayerLayerService$runViewInfoExtra$2$1$2$1(this.this$0, this.$viewModel, this.$layer, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService;
        Object objA;
        e eVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ogvVipBarPlayerLayerService = this.this$0;
            e eVar2 = this.$viewModel;
            a aVar = this.$layer;
            this.L$0 = ogvVipBarPlayerLayerService;
            this.L$1 = eVar2;
            this.label = 1;
            objA = aVar.a(this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            eVar = eVar2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (e) this.L$1;
            ogvVipBarPlayerLayerService = (OgvVipBarPlayerLayerService) this.L$0;
            ResultKt.throwOnFailure(obj);
            objA = obj;
        }
        OgvVipBarPlayerLayerService.a(ogvVipBarPlayerLayerService, eVar, ((Number) objA).floatValue());
        return Unit.INSTANCE;
    }
}
