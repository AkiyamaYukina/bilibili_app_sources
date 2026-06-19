package com.bilibili.ship.theseus.ogv.chathall;

import androidx.collection.ArrayMap;
import com.bilibili.api.BiliApiException;
import com.bilibili.chatroom.vo.MessageOperationType;
import com.bilibili.chatroomsdk.ChatMsg;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.ogv.chathall.api.ChatHallApi;
import com.bilibili.ship.theseus.ogv.chathall.bean.ActionData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$joinRoom$1$msgClick$1.class */
final class ChatHallService$joinRoom$1$msgClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function2<MessageOperationType, ChatMsg, Unit> $callback;
    final ArrayMap<String, String> $paramsMap;
    int label;
    final ChatHallService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHallService$joinRoom$1$msgClick$1(ChatHallService chatHallService, ArrayMap<String, String> arrayMap, Function2<? super MessageOperationType, ? super ChatMsg, Unit> function2, Continuation<? super ChatHallService$joinRoom$1$msgClick$1> continuation) {
        super(2, continuation);
        this.this$0 = chatHallService;
        this.$paramsMap = arrayMap;
        this.$callback = function2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatHallService$joinRoom$1$msgClick$1(this.this$0, this.$paramsMap, this.$callback, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        ChatMsg chatMsgA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatHallApi chatHallApi = this.this$0.f91718p;
            ArrayMap<String, String> arrayMap = this.$paramsMap;
            this.label = 1;
            Object objHallAction = chatHallApi.hallAction(arrayMap, this);
            obj = objHallAction;
            if (objHallAction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        Function2<MessageOperationType, ChatMsg, Unit> function2 = this.$callback;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BLog.e("ChatHallService$joinRoom$1$msgClick$1-invokeSuspend", "[theseus-ogv-ChatHallService$joinRoom$1$msgClick$1-invokeSuspend] request /pgc/freya/chat/greeting error", new BiliApiException(businessFailure.getCode(), businessFailure.getMessage()));
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            BLog.e("ChatHallService$joinRoom$1$msgClick$1-invokeSuspend", "[theseus-ogv-ChatHallService$joinRoom$1$msgClick$1-invokeSuspend] request /pgc/freya/chat/greeting error", ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ActionData actionData = (ActionData) ((BiliApiResponse.Success) biliApiResponse).getData();
            if (actionData.b() == 1 && (chatMsgA = actionData.a()) != null) {
                function2.invoke(MessageOperationType.AddWithDeleteMsg, chatMsgA);
            }
        }
        return Unit.INSTANCE;
    }
}
