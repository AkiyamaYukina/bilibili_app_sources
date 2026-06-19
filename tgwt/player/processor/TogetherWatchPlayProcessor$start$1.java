package com.bilibili.tgwt.player.processor;

import com.bilibili.api.BiliApiException;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.chatroom.ChatRoomState;
import com.bilibili.tgwt.chatroom.PlayStatus;
import com.bilibili.tgwt.service.ChatService;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchPlayProcessor$start$1.class */
final class TogetherWatchPlayProcessor$start$1 extends SuspendLambda implements Function2<com.bilibili.tgwt.chatroom.c, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final TogetherWatchPlayProcessor this$0;

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.processor.TogetherWatchPlayProcessor$start$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchPlayProcessor$start$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.tgwt.chatroom.c $it;
        int label;
        final TogetherWatchPlayProcessor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TogetherWatchPlayProcessor togetherWatchPlayProcessor, com.bilibili.tgwt.chatroom.c cVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = togetherWatchPlayProcessor;
            this.$it = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$it, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ChatRoomManagerService chatRoomManagerService = this.this$0.f111603c;
                long j7 = this.$it.f110972a;
                this.label = 1;
                Object objM = chatRoomManagerService.m(j7, this, true);
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
            TogetherWatchPlayProcessor togetherWatchPlayProcessor = this.this$0;
            if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
                BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
                BiliApiException biliApiException = new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
                BLog.e("TogetherWatchPlayProcessor$start$1$1-invokeSuspend", "[together-watch-TogetherWatchPlayProcessor$start$1$1-invokeSuspend] " + biliApiException.getMessage(), biliApiException);
            } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
                Exception exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
                com.bilibili.biligame.dialogdispatcher.e.a("[together-watch-TogetherWatchPlayProcessor$start$1$1-invokeSuspend] ", exception.getMessage(), "TogetherWatchPlayProcessor$start$1$1-invokeSuspend", exception);
            } else {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChatRoomState chatRoomStateI = togetherWatchPlayProcessor.f111603c.i();
                if (chatRoomStateI != null) {
                    togetherWatchPlayProcessor.b(chatRoomStateI, true);
                    BLog.i("TogetherWatchPlayProcessor-changeToMaster", "[together-watch-TogetherWatchPlayProcessor-changeToMaster] 切换成房主");
                    JobKt.cancelChildren$default(togetherWatchPlayProcessor.f111593D.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
                    togetherWatchPlayProcessor.f111608i.setSeekGestureEnable(true);
                    togetherWatchPlayProcessor.f111614o.j().registerSeekObserver(togetherWatchPlayProcessor.f111598I);
                    com.bilibili.tgwt.player.widget.l lVar = togetherWatchPlayProcessor.f111594E;
                    if (lVar != null) {
                        lVar.b();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchPlayProcessor$start$1(TogetherWatchPlayProcessor togetherWatchPlayProcessor, Continuation<? super TogetherWatchPlayProcessor$start$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchPlayProcessor;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TogetherWatchPlayProcessor$start$1 togetherWatchPlayProcessor$start$1 = new TogetherWatchPlayProcessor$start$1(this.this$0, continuation);
        togetherWatchPlayProcessor$start$1.L$0 = obj;
        return togetherWatchPlayProcessor$start$1;
    }

    public final Object invoke(com.bilibili.tgwt.chatroom.c cVar, Continuation<? super Unit> continuation) {
        return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ChatRoomInfo chatRoomInfo;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        com.bilibili.tgwt.chatroom.c cVar = (com.bilibili.tgwt.chatroom.c) this.L$0;
        BLog.i("TogetherWatchPlayProcessor$start$1-invokeSuspend", "[together-watch-TogetherWatchPlayProcessor$start$1-invokeSuspend] 收到成员变化");
        boolean z6 = cVar.f110974c == this.this$0.f111612m.mid();
        TogetherWatchPlayProcessor togetherWatchPlayProcessor = this.this$0;
        if (z6 != togetherWatchPlayProcessor.f111616q || togetherWatchPlayProcessor.f111617r) {
            togetherWatchPlayProcessor.f111616q = z6;
            BangumiUniformSeason season = togetherWatchPlayProcessor.f111604d.getSeason();
            if (season == null || (chatRoomInfo = season.E) == null || chatRoomInfo.u() != 1 || this.this$0.f111617r) {
                this.this$0.f111606f.u(ChatService.GuestWatchMode.Follow);
                if (z6) {
                    TogetherWatchPlayProcessor togetherWatchPlayProcessor2 = this.this$0;
                    BuildersKt.launch$default(togetherWatchPlayProcessor2.f111611l, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(togetherWatchPlayProcessor2, cVar, null), 3, (Object) null);
                } else {
                    TogetherWatchPlayProcessor togetherWatchPlayProcessor3 = this.this$0;
                    togetherWatchPlayProcessor3.getClass();
                    togetherWatchPlayProcessor3.f111590A = PlayStatus.PAUSE;
                    togetherWatchPlayProcessor3.f111591B = Duration.Companion.getZERO-UwyO8pc();
                    CoroutineScope coroutineScope = togetherWatchPlayProcessor3.f111593D;
                    JobKt.cancelChildren$default(coroutineScope.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
                    BLog.i("TogetherWatchPlayProcessor-changeToGuest", "[together-watch-TogetherWatchPlayProcessor-changeToGuest] 切换成房客");
                    togetherWatchPlayProcessor3.f111608i.setSeekGestureEnable(false);
                    togetherWatchPlayProcessor3.f111614o.j().unregisterSeekObserver(togetherWatchPlayProcessor3.f111598I);
                    FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(togetherWatchPlayProcessor3.f111603c.f110923p), new TogetherWatchPlayProcessor$changeToGuest$1(togetherWatchPlayProcessor3, null)), coroutineScope);
                }
            }
            this.this$0.f111617r = false;
        }
        return Unit.INSTANCE;
    }
}
