package com.bilibili.tgwt.player.processor;

import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformEpisode;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchPlayProcessor$start$3.class */
final class TogetherWatchPlayProcessor$start$3 extends SuspendLambda implements Function2<BangumiUniformEpisode, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final TogetherWatchPlayProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchPlayProcessor$start$3(TogetherWatchPlayProcessor togetherWatchPlayProcessor, Continuation<? super TogetherWatchPlayProcessor$start$3> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchPlayProcessor;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TogetherWatchPlayProcessor$start$3 togetherWatchPlayProcessor$start$3 = new TogetherWatchPlayProcessor$start$3(this.this$0, continuation);
        togetherWatchPlayProcessor$start$3.L$0 = obj;
        return togetherWatchPlayProcessor$start$3;
    }

    public final Object invoke(BangumiUniformEpisode bangumiUniformEpisode, Continuation<? super Unit> continuation) {
        return create(bangumiUniformEpisode, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        BangumiUniformSeason season;
        ChatRoomInfo chatRoomInfo;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BangumiUniformEpisode bangumiUniformEpisode = (BangumiUniformEpisode) this.L$0;
        if (bangumiUniformEpisode == null) {
            return Unit.INSTANCE;
        }
        TogetherWatchPlayProcessor togetherWatchPlayProcessor = this.this$0;
        if (togetherWatchPlayProcessor.f111616q && (season = togetherWatchPlayProcessor.f111604d.getSeason()) != null && (chatRoomInfo = season.E) != null) {
            ChatRoomManagerService chatRoomManagerService = togetherWatchPlayProcessor.f111603c;
            chatRoomManagerService.getClass();
            long j7 = season.a;
            if (0 != j7 || chatRoomManagerService.f110905S != bangumiUniformEpisode.a()) {
                chatRoomManagerService.f110905S = j7;
                chatRoomManagerService.f110905S = bangumiUniformEpisode.a();
                BuildersKt.launch$default(togetherWatchPlayProcessor.f111611l, (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchPlayProcessor$onEpisodeChanged$1$1(togetherWatchPlayProcessor, chatRoomInfo, j7, bangumiUniformEpisode, null), 3, (Object) null);
            }
        }
        togetherWatchPlayProcessor.c();
        return Unit.INSTANCE;
    }
}
