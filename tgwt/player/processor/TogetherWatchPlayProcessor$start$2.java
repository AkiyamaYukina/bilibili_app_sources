package com.bilibili.tgwt.player.processor;

import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchPlayProcessor$start$2.class */
final class TogetherWatchPlayProcessor$start$2 extends SuspendLambda implements Function2<BangumiUniformSeason, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final TogetherWatchPlayProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchPlayProcessor$start$2(TogetherWatchPlayProcessor togetherWatchPlayProcessor, Continuation<? super TogetherWatchPlayProcessor$start$2> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchPlayProcessor;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TogetherWatchPlayProcessor$start$2 togetherWatchPlayProcessor$start$2 = new TogetherWatchPlayProcessor$start$2(this.this$0, continuation);
        togetherWatchPlayProcessor$start$2.L$0 = obj;
        return togetherWatchPlayProcessor$start$2;
    }

    public final Object invoke(BangumiUniformSeason bangumiUniformSeason, Continuation<? super Unit> continuation) {
        return create(bangumiUniformSeason, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (((BangumiUniformSeason) this.L$0) != null) {
            TogetherWatchPlayProcessor togetherWatchPlayProcessor = this.this$0;
            int i7 = TogetherWatchPlayProcessor.f111589M;
            togetherWatchPlayProcessor.c();
        }
        return Unit.INSTANCE;
    }
}
