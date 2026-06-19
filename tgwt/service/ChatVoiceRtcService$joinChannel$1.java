package com.bilibili.tgwt.service;

import com.bilibili.api.BiliApiException;
import com.bilibili.bangumi.module.chatroom.VoiceChannelInfo;
import com.bilibili.bililive.bilirtc.openplatform.exception.SdkException;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatVoiceRtcService$joinChannel$1.class */
final class ChatVoiceRtcService$joinChannel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $channelId;
    final long $roomId;
    int label;
    final ChatVoiceRtcService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceRtcService$joinChannel$1(ChatVoiceRtcService chatVoiceRtcService, long j7, String str, Continuation<? super ChatVoiceRtcService$joinChannel$1> continuation) {
        super(2, continuation);
        this.this$0 = chatVoiceRtcService;
        this.$roomId = j7;
        this.$channelId = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatVoiceRtcService$joinChannel$1(this.this$0, this.$roomId, this.$channelId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        boolean z6 = true;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatRoomOperationService chatRoomOperationService = this.this$0.h;
            long j7 = this.$roomId;
            String str = this.$channelId;
            this.label = 1;
            Object objJoinVoiceChannel = chatRoomOperationService.joinVoiceChannel(j7, 0, str, 200000, null, this);
            obj = objJoinVoiceChannel;
            if (objJoinVoiceChannel == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        ChatVoiceRtcService chatVoiceRtcService = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BLog.e("ChatVoiceRtcService$joinChannel$1-invokeSuspend", "[together-watch-ChatVoiceRtcService$joinChannel$1-invokeSuspend] voice room joinVoiceChannel error", new BiliApiException(businessFailure.getCode(), businessFailure.getMessage()));
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            BLog.e("ChatVoiceRtcService$joinChannel$1-invokeSuspend", "[together-watch-ChatVoiceRtcService$joinChannel$1-invokeSuspend] voice room joinVoiceChannel error", ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            VoiceChannelInfo voiceChannelInfo = (VoiceChannelInfo) ((BiliApiResponse.Success) biliApiResponse).getData();
            BLog.i("ChatVoiceRtcService$joinChannel$1-invokeSuspend", "[together-watch-ChatVoiceRtcService$joinChannel$1-invokeSuspend] joinVoiceChannel success!!!");
            u uVar = chatVoiceRtcService.f111937f;
            if (uVar != null) {
                String str2 = voiceChannelInfo.b;
                Map map = voiceChannelInfo.a;
                if (PermissionsChecker.checkSelfPermissions(uVar.f112007a, new String[]{"android.permission.RECORD_AUDIO"})) {
                    uVar.f112011e.d(str2, map, new com.bilibili.bplus.im.aichat.conversation.shortcut.k(uVar, 1));
                } else {
                    uVar.f112008b.a(new SdkException(2, "No audio permission"));
                    z6 = false;
                }
                Boxing.boxBoolean(z6);
            }
        }
        return Unit.INSTANCE;
    }
}
