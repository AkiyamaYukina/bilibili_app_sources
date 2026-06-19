package com.bilibili.tgwt.player.processor;

import com.bilibili.api.BiliApiException;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchPlayProcessor$mMasterSyncPendingPlayRunnable$1$1$2.class */
public final class TogetherWatchPlayProcessor$mMasterSyncPendingPlayRunnable$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ChatRoomInfo $it;
    int label;
    final TogetherWatchPlayProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchPlayProcessor$mMasterSyncPendingPlayRunnable$1$1$2(TogetherWatchPlayProcessor togetherWatchPlayProcessor, ChatRoomInfo chatRoomInfo, Continuation<? super TogetherWatchPlayProcessor$mMasterSyncPendingPlayRunnable$1$1$2> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchPlayProcessor;
        this.$it = chatRoomInfo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchPlayProcessor$mMasterSyncPendingPlayRunnable$1$1$2(this.this$0, this.$it, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        ChatRoomInfo chatRoomInfo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatRoomManagerService chatRoomManagerService = this.this$0.f111603c;
            long jT = this.$it.t();
            int value = this.this$0.f111590A.getValue();
            long j7 = Duration.getInWholeSeconds-impl(Duration.plus-LRDsOJo(this.this$0.f111591B, TogetherWatchPlayProcessor.f111588L));
            this.label = 1;
            BangumiUniformSeason season = chatRoomManagerService.f110912d.getSeason();
            Object objModifyProgress = chatRoomManagerService.f110920m.modifyProgress((season == null || (chatRoomInfo = season.E) == null || chatRoomInfo.u() != 8) ? 0 : 1, jT, value, j7, this);
            obj = objModifyProgress;
            if (objModifyProgress == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BLog.e("TogetherWatchPlayProcessor$mMasterSyncPendingPlayRunnable$1$1$2-invokeSuspend", "[together-watch-TogetherWatchPlayProcessor$mMasterSyncPendingPlayRunnable$1$1$2-invokeSuspend] 主态上报播放操作失败", new BiliApiException(businessFailure.getCode(), businessFailure.getMessage()));
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            BLog.e("TogetherWatchPlayProcessor$mMasterSyncPendingPlayRunnable$1$1$2-invokeSuspend", "[together-watch-TogetherWatchPlayProcessor$mMasterSyncPendingPlayRunnable$1$1$2-invokeSuspend] 主态上报播放操作失败", ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            BLog.i("TogetherWatchPlayProcessor$mMasterSyncPendingPlayRunnable$1$1$2-invokeSuspend", "[together-watch-TogetherWatchPlayProcessor$mMasterSyncPendingPlayRunnable$1$1$2-invokeSuspend] 主态上报播放操作");
        }
        return Unit.INSTANCE;
    }
}
