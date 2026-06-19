package com.bilibili.tgwt.im.ui;

import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatConfigType;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfig;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfigValue;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatFragment$subscribeData$3.class */
final class PlayerChatFragment$subscribeData$3 extends SuspendLambda implements Function2<BangumiUniformSeason, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final PlayerChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerChatFragment$subscribeData$3(PlayerChatFragment playerChatFragment, Continuation<? super PlayerChatFragment$subscribeData$3> continuation) {
        super(2, continuation);
        this.this$0 = playerChatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerChatFragment$subscribeData$3 playerChatFragment$subscribeData$3 = new PlayerChatFragment$subscribeData$3(this.this$0, continuation);
        playerChatFragment$subscribeData$3.L$0 = obj;
        return playerChatFragment$subscribeData$3;
    }

    public final Object invoke(BangumiUniformSeason bangumiUniformSeason, Continuation<? super Unit> continuation) {
        return create(bangumiUniformSeason, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BangumiUniformSeason bangumiUniformSeason = (BangumiUniformSeason) this.L$0;
        if (bangumiUniformSeason == null) {
            return Unit.INSTANCE;
        }
        ChatRoomInfo chatRoomInfo = bangumiUniformSeason.E;
        if (chatRoomInfo != null) {
            PlayerChatFragment playerChatFragment = this.this$0;
            com.bilibili.tgwt.detail.chat.p pVar = playerChatFragment.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar2 = pVar;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar2 = null;
            }
            pVar2.f111131r.set(chatRoomInfo.u());
            com.bilibili.tgwt.detail.chat.p pVar3 = playerChatFragment.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar4 = pVar3;
            if (pVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar4 = null;
            }
            pVar4.h.set(chatRoomInfo.n() == com.bilibili.ogv.infra.account.a.f67852b.mid());
            if (chatRoomInfo.s() != null) {
                com.bilibili.tgwt.detail.chat.p pVar5 = playerChatFragment.f111250b;
                com.bilibili.tgwt.detail.chat.p pVar6 = pVar5;
                if (pVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    pVar6 = null;
                }
                ChatRoomConfig chatRoomConfigS = chatRoomInfo.s();
                if (!Intrinsics.areEqual(chatRoomConfigS, pVar6.f111109U)) {
                    pVar6.f111109U = chatRoomConfigS;
                    pVar6.notifyPropertyChanged(97);
                }
            }
            if (chatRoomInfo.u() == 1) {
                playerChatFragment.lf(playerChatFragment.f111252d & (-5));
            } else {
                playerChatFragment.lf(playerChatFragment.f111252d | 4);
            }
            com.bilibili.tgwt.detail.chat.p pVar7 = playerChatFragment.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar8 = pVar7;
            if (pVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar8 = null;
            }
            ChatRoomConfig chatRoomConfig = pVar8.f111109U;
            ChatConfigType chatConfigTypeA = null;
            if (chatRoomConfig != null) {
                ChatRoomConfigValue chatRoomConfigValueG = chatRoomConfig.g();
                chatConfigTypeA = null;
                if (chatRoomConfigValueG != null) {
                    chatConfigTypeA = chatRoomConfigValueG.a();
                }
            }
            if (chatConfigTypeA != ChatConfigType.UNAVAILABLE_AND_INVISIBLE) {
                playerChatFragment.lf(playerChatFragment.f111252d | 32);
            } else {
                playerChatFragment.lf(playerChatFragment.f111252d & (-33));
            }
        }
        return Unit.INSTANCE;
    }
}
