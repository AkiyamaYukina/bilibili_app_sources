package com.bilibili.tgwt.detail.chat;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$subscribeData$14.class */
final class ChatFragment$subscribeData$14 extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends Integer>, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$subscribeData$14(ChatFragment chatFragment, Continuation<? super ChatFragment$subscribeData$14> continuation) {
        super(2, continuation);
        this.this$0 = chatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatFragment$subscribeData$14 chatFragment$subscribeData$14 = new ChatFragment$subscribeData$14(this.this$0, continuation);
        chatFragment$subscribeData$14.L$0 = obj;
        return chatFragment$subscribeData$14;
    }

    public final Object invoke(Pair<Boolean, Integer> pair, Continuation<? super Unit> continuation) {
        return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Pair pair = (Pair) this.L$0;
        boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
        int iIntValue = ((Number) pair.component2()).intValue();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111019i;
        if (togetherWatchDetailPageViewModel != null) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            if (!togetherWatchDetailPageViewModel2.getScreenStateService().getScreenStateHelper().a().b) {
                if (iIntValue > 0 || zBooleanValue) {
                    p pVar = this.this$0.f111021k;
                    if (pVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                        pVar = null;
                    }
                    pVar.m0(AnimState.STOP);
                    return Unit.INSTANCE;
                }
                p pVar2 = this.this$0.f111021k;
                p pVar3 = pVar2;
                if (pVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar3 = null;
                }
                Iterator<Map.Entry<Long, SurpriseEvent>> it = pVar3.f111117c.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry<Long, SurpriseEvent> next = it.next();
                    if (System.currentTimeMillis() - next.getKey().longValue() > 60000) {
                        p pVar4 = this.this$0.f111021k;
                        if (pVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                            pVar4 = null;
                        }
                        pVar4.f111117c.remove(next.getKey());
                    } else {
                        p pVar5 = this.this$0.f111021k;
                        p pVar6 = pVar5;
                        if (pVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                            pVar6 = null;
                        }
                        pVar6.f111117c.remove(next.getKey());
                        p pVar7 = this.this$0.f111021k;
                        p pVar8 = pVar7;
                        if (pVar7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                            pVar8 = null;
                        }
                        pVar8.l0(next.getValue());
                        p pVar9 = this.this$0.f111021k;
                        if (pVar9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
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
