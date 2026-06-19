package com.bilibili.tgwt.player.processor;

import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.chatroom.ChatRoomFullInfo;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.chatroom.ChatRoomStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchEndPageProcessor$onVideoCompleted$1$1.class */
final class TogetherWatchEndPageProcessor$onVideoCompleted$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $roomId;
    int label;
    final TogetherWatchEndPageProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchEndPageProcessor$onVideoCompleted$1$1(TogetherWatchEndPageProcessor togetherWatchEndPageProcessor, long j7, Continuation<? super TogetherWatchEndPageProcessor$onVideoCompleted$1$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchEndPageProcessor;
        this.$roomId = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchEndPageProcessor$onVideoCompleted$1$1(this.this$0, this.$roomId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        String strA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatRoomManagerService chatRoomManagerService = this.this$0.f111569a;
            long j7 = this.$roomId;
            this.label = 1;
            Object objM = chatRoomManagerService.m(j7, this, false);
            obj = objM;
            if (objM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        TogetherWatchEndPageProcessor togetherWatchEndPageProcessor = this.this$0;
        long j8 = this.$roomId;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            strA = "guest onVideoCompleted requestRefreshRoomState error ===> " + new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChatRoomStatus chatRoomStatusM = ((ChatRoomFullInfo) ((BiliApiResponse.Success) biliApiResponse).getData()).m();
                if (chatRoomStatusM != null) {
                    long jC = chatRoomStatusM.c();
                    Duration.Companion companion = Duration.Companion;
                    if (Duration.compareTo-LRDsOJo(DurationKt.toDuration(jC, DurationUnit.SECONDS), togetherWatchEndPageProcessor.f111572d.getPlayerServiceController().g()) < 0) {
                        togetherWatchEndPageProcessor.f111571c.b(j8, jC);
                    }
                }
                return Unit.INSTANCE;
            }
            strA = N4.a.a("guest onVideoCompleted requestRefreshRoomState error ===> ", ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        }
        com.bilibili.bangumi.logic.page.detail.service.e.a("[together-watch-TogetherWatchEndPageProcessor$onVideoCompleted$1$1-invokeSuspend] ", strA, "TogetherWatchEndPageProcessor$onVideoCompleted$1$1-invokeSuspend", (Throwable) null);
        return Unit.INSTANCE;
    }
}
