package com.bilibili.ship.theseus.ogv.chathall;

import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$event$1$popGuideDialog$1.class */
public final class ChatHallService$event$1$popGuideDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $link;
    int label;
    final ChatHallService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHallService$event$1$popGuideDialog$1(ChatHallService chatHallService, String str, Continuation<? super ChatHallService$event$1$popGuideDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = chatHallService;
        this.$link = str;
    }

    private static final Unit invokeSuspend$lambda$0(ChatHallService chatHallService, ChatHallPopDialog chatHallPopDialog, com.bilibili.ogv.infra.coroutine.c cVar) {
        cVar.b(new ChatHallService$event$1$popGuideDialog$1$1$1(chatHallService, chatHallPopDialog, null));
        cVar.b(new ChatHallService$event$1$popGuideDialog$1$1$2(chatHallService, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatHallService$event$1$popGuideDialog$1(this.this$0, this.$link, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatHallPopDialog chatHallPopDialog = new ChatHallPopDialog(this.this$0.f91705b, WebFloatLayerService.b(this.this$0.h, this.$link, new TheseusWebUIComponent.a(false, null, 0, 0, 0, false, 0, false, 0, 0, false, false, null, 1048574)));
            ChatHallService chatHallService = this.this$0;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(chatHallService, chatHallPopDialog, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
