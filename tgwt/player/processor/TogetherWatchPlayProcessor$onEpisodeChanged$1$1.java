package com.bilibili.tgwt.player.processor;

import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformEpisode;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchPlayProcessor$onEpisodeChanged$1$1.class */
final class TogetherWatchPlayProcessor$onEpisodeChanged$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ChatRoomInfo $chatRoomInfo;
    final BangumiUniformEpisode $ep;
    final long $seasonId;
    int label;
    final TogetherWatchPlayProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchPlayProcessor$onEpisodeChanged$1$1(TogetherWatchPlayProcessor togetherWatchPlayProcessor, ChatRoomInfo chatRoomInfo, long j7, BangumiUniformEpisode bangumiUniformEpisode, Continuation<? super TogetherWatchPlayProcessor$onEpisodeChanged$1$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchPlayProcessor;
        this.$chatRoomInfo = chatRoomInfo;
        this.$seasonId = j7;
        this.$ep = bangumiUniformEpisode;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchPlayProcessor$onEpisodeChanged$1$1(this.this$0, this.$chatRoomInfo, this.$seasonId, this.$ep, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ChatRoomInfo chatRoomInfo;
        String message;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatRoomManagerService chatRoomManagerService = this.this$0.f111603c;
            long jT = this.$chatRoomInfo.t();
            long j7 = this.$seasonId;
            long jA = this.$ep.a();
            this.label = 1;
            BangumiUniformSeason season = chatRoomManagerService.f110912d.getSeason();
            Object objModifyRoomVideo = chatRoomManagerService.f110920m.modifyRoomVideo((season == null || (chatRoomInfo = season.E) == null || chatRoomInfo.u() != 8) ? 0 : 1, jT, j7, jA, this);
            obj = objModifyRoomVideo;
            if (objModifyRoomVideo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        if ((biliApiResponse instanceof BiliApiResponse.BusinessFailure) && (message = ((BiliApiResponse.BusinessFailure) biliApiResponse).getMessage()) != null) {
            Kl.a.b(this.this$0.f111613n, message);
        }
        return Unit.INSTANCE;
    }
}
