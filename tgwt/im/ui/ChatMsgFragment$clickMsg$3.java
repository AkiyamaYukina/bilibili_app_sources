package com.bilibili.tgwt.im.ui;

import DD0.AbstractC1534g;
import android.content.Context;
import androidx.collection.ArrayMap;
import com.bilibili.api.BiliApiException;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.chatroom.vo.ChatMessageVo;
import com.bilibili.chatroomsdk.ChatMsg;
import com.bilibili.chatroomsdk.MessagePro;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.chatroom.ActionData;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$clickMsg$3.class */
final class ChatMsgFragment$clickMsg$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    final ArrayMap<String, String> $paramsMap;
    int label;
    final ChatMsgFragment this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$clickMsg$3$a.class */
    public static final class a extends TypeToken<ChatMessageVo> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMsgFragment$clickMsg$3(ChatMsgFragment chatMsgFragment, ArrayMap<String, String> arrayMap, Context context, Continuation<? super ChatMsgFragment$clickMsg$3> continuation) {
        super(2, continuation);
        this.this$0 = chatMsgFragment;
        this.$paramsMap = arrayMap;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatMsgFragment$clickMsg$3(this.this$0, this.$paramsMap, this.$context, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        ChatMsg chatMsgA;
        ChatRoomInfo chatRoomInfo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatRoomOperationService chatRoomOperationService = this.this$0.f111221f;
            ArrayMap<String, String> arrayMap = this.$paramsMap;
            this.label = 1;
            Object objImAction = chatRoomOperationService.imAction(arrayMap, this);
            obj = objImAction;
            if (objImAction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        ChatMsgFragment chatMsgFragment = this.this$0;
        Context context = this.$context;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BiliApiException biliApiException = new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            BLog.e("ChatMsgFragment$clickMsg$3-invokeSuspend", "[together-watch-ChatMsgFragment$clickMsg$3-invokeSuspend] " + biliApiException.getMessage(), biliApiException);
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            Exception exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            com.bilibili.biligame.dialogdispatcher.e.a("[together-watch-ChatMsgFragment$clickMsg$3-invokeSuspend] ", exception.getMessage(), "ChatMsgFragment$clickMsg$3-invokeSuspend", exception);
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ActionData actionData = (ActionData) ((BiliApiResponse.Success) biliApiResponse).getData();
            if (actionData.b() == 1 && (chatMsgA = actionData.a()) != null) {
                MessagePro message = chatMsgA.getMessage();
                String contentStr = message != null ? message.getContentStr() : null;
                if (contentStr != null && contentStr.length() != 0) {
                    ChatMessageVo chatMessageVo = (ChatMessageVo) JsonUtilKt.parseJson(chatMsgA.getMessage().getContentStr(), new a().getType());
                    AbstractC1534g abstractC1534g = chatMsgFragment.f111219d;
                    AbstractC1534g abstractC1534g2 = abstractC1534g;
                    if (abstractC1534g == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        abstractC1534g2 = null;
                    }
                    HD0.x xVar = abstractC1534g2.f2505B;
                    if (xVar != null) {
                        long msgId = chatMsgA.getMsgId();
                        String str = chatMessageVo.a;
                        Map mapB = chatMessageVo.b();
                        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatMsgFragment.f111220e;
                        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
                        if (togetherWatchDetailPageViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                            togetherWatchDetailPageViewModel2 = null;
                        }
                        BangumiUniformSeason season = togetherWatchDetailPageViewModel2.getSeasonService().getSeason();
                        HD0.x.q(xVar, context, msgId, str, mapB, (season == null || (chatRoomInfo = season.E) == null) ? null : chatRoomInfo.E(), null, 96);
                    }
                    chatMsgFragment.f111222g = true;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
