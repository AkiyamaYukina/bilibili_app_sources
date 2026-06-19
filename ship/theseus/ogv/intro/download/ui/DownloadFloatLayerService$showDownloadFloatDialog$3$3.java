package com.bilibili.ship.theseus.ogv.intro.download.ui;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$showDownloadFloatDialog$3$3.class */
public final class DownloadFloatLayerService$showDownloadFloatDialog$3$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final DownloadFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFloatLayerService$showDownloadFloatDialog$3$3(DownloadFloatLayerService downloadFloatLayerService, Continuation<? super DownloadFloatLayerService$showDownloadFloatDialog$3$3> continuation) {
        super(1, continuation);
        this.this$0 = downloadFloatLayerService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DownloadFloatLayerService$showDownloadFloatDialog$3$3(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<Unit> mutableSharedFlow = this.this$0.f92443q;
            this.label = 1;
            if (FlowKt.first(mutableSharedFlow, this) == coroutine_suspended) {
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
