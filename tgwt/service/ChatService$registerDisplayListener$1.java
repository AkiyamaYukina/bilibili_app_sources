package com.bilibili.tgwt.service;

import android.hardware.display.DisplayManager;
import androidx.core.content.ContextCompat;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$registerDisplayListener$1.class */
final class ChatService$registerDisplayListener$1 extends SuspendLambda implements Function2<BangumiUniformSeason, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ChatService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$registerDisplayListener$1$a.class */
    public static final class a implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatService f111926a;

        public a(ChatService chatService) {
            this.f111926a = chatService;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i7) {
            if (i7 != 0) {
                Kl.a.a(this.f111926a.f111899r, 2131835399);
                this.f111926a.f();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i7) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i7) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatService$registerDisplayListener$1(ChatService chatService, Continuation<? super ChatService$registerDisplayListener$1> continuation) {
        super(2, continuation);
        this.this$0 = chatService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatService$registerDisplayListener$1 chatService$registerDisplayListener$1 = new ChatService$registerDisplayListener$1(this.this$0, continuation);
        chatService$registerDisplayListener$1.L$0 = obj;
        return chatService$registerDisplayListener$1;
    }

    public final Object invoke(BangumiUniformSeason bangumiUniformSeason, Continuation<? super Unit> continuation) {
        return create(bangumiUniformSeason, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ChatRoomInfo chatRoomInfo;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BangumiUniformSeason bangumiUniformSeason = (BangumiUniformSeason) this.L$0;
        if (bangumiUniformSeason == null || (chatRoomInfo = bangumiUniformSeason.E) == null) {
            return Unit.INSTANCE;
        }
        if (chatRoomInfo.H()) {
            Object systemService = ContextCompat.getSystemService(this.this$0.f111878a, DisplayManager.class);
            if (systemService == null) {
                throw new IllegalArgumentException("Can not find system service for type ".concat(DisplayManager.class.getName()).toString());
            }
            DisplayManager displayManager = (DisplayManager) systemService;
            if (displayManager.getDisplays().length > 1) {
                Kl.a.a(this.this$0.f111899r, 2131835399);
                this.this$0.f();
            }
            ChatService chatService = this.this$0;
            if (chatService.f111901t == null) {
                a aVar = new a(chatService);
                chatService.f111901t = aVar;
                displayManager.registerDisplayListener(aVar, null);
            }
        }
        return Unit.INSTANCE;
    }
}
