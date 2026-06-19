package com.bilibili.tgwt.player.widget;

import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/PlayerChatPopupLayer$onAddView$2.class */
public final class PlayerChatPopupLayer$onAddView$2 extends SuspendLambda implements Function2<com.bilibili.tgwt.chatroom.c, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final PlayerChatPopupLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerChatPopupLayer$onAddView$2(PlayerChatPopupLayer playerChatPopupLayer, Continuation<? super PlayerChatPopupLayer$onAddView$2> continuation) {
        super(2, continuation);
        this.this$0 = playerChatPopupLayer;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerChatPopupLayer$onAddView$2 playerChatPopupLayer$onAddView$2 = new PlayerChatPopupLayer$onAddView$2(this.this$0, continuation);
        playerChatPopupLayer$onAddView$2.L$0 = obj;
        return playerChatPopupLayer$onAddView$2;
    }

    public final Object invoke(com.bilibili.tgwt.chatroom.c cVar, Continuation<? super Unit> continuation) {
        return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int iB;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        com.bilibili.tgwt.chatroom.c cVar = (com.bilibili.tgwt.chatroom.c) this.L$0;
        PlayerChatPopupLayer playerChatPopupLayer = this.this$0;
        if (cVar.f110974c == com.bilibili.ogv.infra.account.a.f67852b.mid()) {
            iB = Uj0.c.b(74, this.this$0.getContext());
        } else {
            iB = Uj0.c.b(56, this.this$0.getContext());
        }
        playerChatPopupLayer.f111749g = iB;
        if (this.this$0.f111743a.getPlayerServiceController().p()) {
            ViewSwitcher viewSwitcher = this.this$0.f111746d;
            ViewSwitcher viewSwitcher2 = viewSwitcher;
            if (viewSwitcher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgContainer");
                viewSwitcher2 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewSwitcher2.getLayoutParams();
            PlayerChatPopupLayer playerChatPopupLayer2 = this.this$0;
            marginLayoutParams.bottomMargin = playerChatPopupLayer2.f111749g;
            ViewSwitcher viewSwitcher3 = playerChatPopupLayer2.f111746d;
            if (viewSwitcher3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgContainer");
                viewSwitcher3 = null;
            }
            viewSwitcher3.requestLayout();
        }
        return Unit.INSTANCE;
    }
}
