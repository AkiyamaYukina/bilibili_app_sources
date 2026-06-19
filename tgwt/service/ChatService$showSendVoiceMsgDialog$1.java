package com.bilibili.tgwt.service;

import android.app.Activity;
import android.content.Context;
import bolts.CancellationTokenSource;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.bangumi.module.chatroom.UserConf;
import com.bilibili.chatroomsdk.ChatBubble;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.tgwt.im.widget.C6659e;
import com.bilibili.tgwt.im.widget.InterfaceC6660f;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$showSendVoiceMsgDialog$1.class */
public final class ChatService$showSendVoiceMsgDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterfaceC6660f $action;
    final CharSequence $inputText;
    int label;
    final ChatService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatService$showSendVoiceMsgDialog$1(ChatService chatService, CharSequence charSequence, InterfaceC6660f interfaceC6660f, Continuation<? super ChatService$showSendVoiceMsgDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = chatService;
        this.$inputText = charSequence;
        this.$action = interfaceC6660f;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatService$showSendVoiceMsgDialog$1(this.this$0, this.$inputText, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Activity activityRequireActivity = ContextUtilKt.requireActivity(this.this$0.f111878a);
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
            PermissionsChecker.grantPermissions(activityRequireActivity, new String[]{"android.permission.RECORD_AUDIO"}, 19, 2131835405).continueWith(new Ul0.b(cancellableContinuationImpl), cancellationTokenSource.getToken());
            cancellableContinuationImpl.invokeOnCancellation(new Ul0.c(cancellationTokenSource));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = result;
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            ChatService chatService = this.this$0;
            ChatService chatService2 = this.this$0;
            Context context = chatService2.f111878a;
            BangumiUniformSeason season = chatService2.f111882c.getSeason();
            ChatBubble chatBubbleA = null;
            if (season != null) {
                ChatRoomInfo chatRoomInfo = season.E;
                chatBubbleA = null;
                if (chatRoomInfo != null) {
                    UserConf userConfE = chatRoomInfo.E();
                    chatBubbleA = null;
                    if (userConfE != null) {
                        chatBubbleA = userConfE.a();
                    }
                }
            }
            CharSequence charSequence = this.$inputText;
            ChatService chatService3 = this.this$0;
            chatService.f111860I = new C6659e(context, chatService2.f111891j, chatBubbleA, charSequence, chatService3, chatService3.h);
            C6659e c6659e = this.this$0.f111860I;
            if (c6659e != null) {
                c6659e.f111414q = this.$action;
            }
            if (c6659e != null) {
                c6659e.show();
            }
        } else {
            this.this$0.o(null);
        }
        return Unit.INSTANCE;
    }
}
