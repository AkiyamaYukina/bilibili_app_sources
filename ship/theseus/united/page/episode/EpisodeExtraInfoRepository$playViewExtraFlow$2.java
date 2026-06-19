package com.bilibili.ship.theseus.united.page.episode;

import com.bilibili.lib.media.resource.ExtraInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/episode/EpisodeExtraInfoRepository$playViewExtraFlow$2.class */
public final class EpisodeExtraInfoRepository$playViewExtraFlow$2 extends SuspendLambda implements Function2<ExtraInfo, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final EpisodeExtraInfoRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpisodeExtraInfoRepository$playViewExtraFlow$2(EpisodeExtraInfoRepository episodeExtraInfoRepository, Continuation<? super EpisodeExtraInfoRepository$playViewExtraFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = episodeExtraInfoRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EpisodeExtraInfoRepository$playViewExtraFlow$2 episodeExtraInfoRepository$playViewExtraFlow$2 = new EpisodeExtraInfoRepository$playViewExtraFlow$2(this.this$0, continuation);
        episodeExtraInfoRepository$playViewExtraFlow$2.L$0 = obj;
        return episodeExtraInfoRepository$playViewExtraFlow$2;
    }

    public final Object invoke(ExtraInfo extraInfo, Continuation<? super Unit> continuation) {
        return create(extraInfo, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.f99565a.setValue((ExtraInfo) this.L$0);
        return Unit.INSTANCE;
    }
}
