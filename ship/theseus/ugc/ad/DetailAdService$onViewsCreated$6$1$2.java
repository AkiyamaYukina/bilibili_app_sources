package com.bilibili.ship.theseus.ugc.ad;

import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.IAdUnderPlayerCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onViewsCreated$6$1$2.class */
public final class DetailAdService$onViewsCreated$6$1$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    boolean Z$0;
    int label;
    final DetailAdService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailAdService$onViewsCreated$6$1$2(DetailAdService detailAdService, Continuation<? super DetailAdService$onViewsCreated$6$1$2> continuation) {
        super(2, continuation);
        this.this$0 = detailAdService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DetailAdService$onViewsCreated$6$1$2 detailAdService$onViewsCreated$6$1$2 = new DetailAdService$onViewsCreated$6$1$2(this.this$0, continuation);
        detailAdService$onViewsCreated$6$1$2.Z$0 = ((Boolean) obj).booleanValue();
        return detailAdService$onViewsCreated$6$1$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z6 = this.Z$0;
        IAdUnderPlayerCallback iAdUnderPlayerCallback = this.this$0.f96270t;
        if (iAdUnderPlayerCallback != null) {
            iAdUnderPlayerCallback.onAdViewCoveredByOverlay(z6);
        }
        return Unit.INSTANCE;
    }
}
