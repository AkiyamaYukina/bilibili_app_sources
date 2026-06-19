package com.bilibili.tgwt.service;

import com.bilibili.api.BiliApiException;
import com.bilibili.app.comm.supermenu.share.pic.IPosterShareListener;
import com.bilibili.app.comm.supermenu.share.pic.PosterShareParam;
import com.bilibili.app.comm.supermenu.share.pic.PosterShareTask;
import com.bilibili.bangumi.module.chatroom.ChatShareCardInfo;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$showShareCard$1.class */
public final class ChatService$showShareCard$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function0<Unit> $onErrorAction;
    final long $roomId;
    int label;
    final ChatService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$showShareCard$1$a.class */
    public static final class a implements IPosterShareListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatService f111927a;

        public a(ChatService chatService) {
            this.f111927a = chatService;
        }

        public final void onDismiss() {
            this.f111927a.f();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatService$showShareCard$1(ChatService chatService, long j7, Function0<Unit> function0, Continuation<? super ChatService$showShareCard$1> continuation) {
        super(2, continuation);
        this.this$0 = chatService;
        this.$roomId = j7;
        this.$onErrorAction = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatService$showShareCard$1(this.this$0, this.$roomId, this.$onErrorAction, continuation);
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
            ChatRoomOperationService chatRoomOperationService = this.this$0.f111869R;
            long j7 = this.$roomId;
            this.label = 1;
            Object objRequestShareCard = chatRoomOperationService.requestShareCard(j7, this);
            obj = objRequestShareCard;
            if (objRequestShareCard == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        Function0<Unit> function0 = this.$onErrorAction;
        long j8 = this.$roomId;
        ChatService chatService = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BLog.e("ChatService$showShareCard$1-invokeSuspend", "[together-watch-ChatService$showShareCard$1-invokeSuspend] requestShareCard error", new BiliApiException(businessFailure.getCode(), businessFailure.getMessage()));
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChatShareCardInfo chatShareCardInfo = (ChatShareCardInfo) ((BiliApiResponse.Success) biliApiResponse).getData();
                if (StringsKt.isBlank(chatShareCardInfo.a)) {
                    function0.invoke();
                } else {
                    PosterShareTask.Companion.with(ContextUtilKt.requireFragmentActivity(chatService.f111878a)).posterParams(new PosterShareParam("pgc.watch-together-cinema.summary.share.click", "wtgt", String.valueOf(j8), "", "", "pgc.pgc-video-detail.0.0", "", (String) null, (String) null, 0, (String) null, (String) null, (String) null, 8064, (DefaultConstructorMarker) null)).imageUrl(chatShareCardInfo.a).shareCallback(new a(chatService)).show();
                }
                return Unit.INSTANCE;
            }
            BLog.e("ChatService$showShareCard$1-invokeSuspend", "[together-watch-ChatService$showShareCard$1-invokeSuspend] requestShareCard error", ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        }
        function0.invoke();
        return Unit.INSTANCE;
    }
}
