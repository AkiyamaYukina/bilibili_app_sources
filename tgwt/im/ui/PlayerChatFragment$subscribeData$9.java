package com.bilibili.tgwt.im.ui;

import com.bilibili.chatroomsdk.AnimState;
import com.bilibili.chatroomsdk.SurpriseEvent;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatFragment$subscribeData$9.class */
final class PlayerChatFragment$subscribeData$9 extends SuspendLambda implements Function2<Pair<? extends Integer, ? extends Boolean>, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final PlayerChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerChatFragment$subscribeData$9(PlayerChatFragment playerChatFragment, Continuation<? super PlayerChatFragment$subscribeData$9> continuation) {
        super(2, continuation);
        this.this$0 = playerChatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerChatFragment$subscribeData$9 playerChatFragment$subscribeData$9 = new PlayerChatFragment$subscribeData$9(this.this$0, continuation);
        playerChatFragment$subscribeData$9.L$0 = obj;
        return playerChatFragment$subscribeData$9;
    }

    public final Object invoke(Pair<Integer, Boolean> pair, Continuation<? super Unit> continuation) {
        return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Pair pair = (Pair) this.L$0;
        int iIntValue = ((Number) pair.component1()).intValue();
        boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111251c;
        if (togetherWatchDetailPageViewModel != null) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            if (!togetherWatchDetailPageViewModel2.getScreenStateService().getScreenStateHelper().a().a) {
                if (iIntValue > 0 || zBooleanValue) {
                    com.bilibili.tgwt.detail.chat.p pVar = this.this$0.f111250b;
                    if (pVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mVm");
                        pVar = null;
                    }
                    pVar.m0(AnimState.STOP);
                    return Unit.INSTANCE;
                }
                com.bilibili.tgwt.detail.chat.p pVar2 = this.this$0.f111250b;
                com.bilibili.tgwt.detail.chat.p pVar3 = pVar2;
                if (pVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    pVar3 = null;
                }
                Iterator<Map.Entry<Long, SurpriseEvent>> it = pVar3.f111117c.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry<Long, SurpriseEvent> next = it.next();
                    if (System.currentTimeMillis() - next.getKey().longValue() > 60000) {
                        com.bilibili.tgwt.detail.chat.p pVar4 = this.this$0.f111250b;
                        if (pVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mVm");
                            pVar4 = null;
                        }
                        pVar4.f111117c.remove(next.getKey());
                    } else {
                        com.bilibili.tgwt.detail.chat.p pVar5 = this.this$0.f111250b;
                        com.bilibili.tgwt.detail.chat.p pVar6 = pVar5;
                        if (pVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mVm");
                            pVar6 = null;
                        }
                        pVar6.f111117c.remove(next.getKey());
                        com.bilibili.tgwt.detail.chat.p pVar7 = this.this$0.f111250b;
                        com.bilibili.tgwt.detail.chat.p pVar8 = pVar7;
                        if (pVar7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mVm");
                            pVar8 = null;
                        }
                        pVar8.l0(next.getValue());
                        com.bilibili.tgwt.detail.chat.p pVar9 = this.this$0.f111250b;
                        if (pVar9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mVm");
                            pVar9 = null;
                        }
                        pVar9.m0(AnimState.START);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
