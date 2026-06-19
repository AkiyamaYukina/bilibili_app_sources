package com.bilibili.tgwt.ui;

import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformEpisode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity$subscribe$4.class */
final class TogetherWatchDetailPageActivity$subscribe$4 extends SuspendLambda implements Function2<BangumiUniformEpisode, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final TogetherWatchDetailPageActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchDetailPageActivity$subscribe$4(TogetherWatchDetailPageActivity togetherWatchDetailPageActivity, Continuation<? super TogetherWatchDetailPageActivity$subscribe$4> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchDetailPageActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TogetherWatchDetailPageActivity$subscribe$4 togetherWatchDetailPageActivity$subscribe$4 = new TogetherWatchDetailPageActivity$subscribe$4(this.this$0, continuation);
        togetherWatchDetailPageActivity$subscribe$4.L$0 = obj;
        return togetherWatchDetailPageActivity$subscribe$4;
    }

    public final Object invoke(BangumiUniformEpisode bangumiUniformEpisode, Continuation<? super Unit> continuation) {
        return create(bangumiUniformEpisode, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BangumiUniformEpisode bangumiUniformEpisode = (BangumiUniformEpisode) this.L$0;
        if (bangumiUniformEpisode == null) {
            return Unit.INSTANCE;
        }
        this.this$0.getIntent().putExtra("epid", String.valueOf(bangumiUniformEpisode.a()));
        return Unit.INSTANCE;
    }
}
