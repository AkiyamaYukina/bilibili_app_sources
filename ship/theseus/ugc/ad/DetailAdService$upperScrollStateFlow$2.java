package com.bilibili.ship.theseus.ugc.ad;

import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.UpperScrollState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$upperScrollStateFlow$2.class */
public final class DetailAdService$upperScrollStateFlow$2 extends SuspendLambda implements Function2<UpperScrollState, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;

    public DetailAdService$upperScrollStateFlow$2(Continuation<? super DetailAdService$upperScrollStateFlow$2> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DetailAdService$upperScrollStateFlow$2 detailAdService$upperScrollStateFlow$2 = new DetailAdService$upperScrollStateFlow$2(continuation);
        detailAdService$upperScrollStateFlow$2.L$0 = obj;
        return detailAdService$upperScrollStateFlow$2;
    }

    public final Object invoke(UpperScrollState upperScrollState, Continuation<? super Unit> continuation) {
        return create(upperScrollState, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BLog.d("DetailAdService", "upperScrollStateFlow: " + ((UpperScrollState) this.L$0));
        return Unit.INSTANCE;
    }
}
