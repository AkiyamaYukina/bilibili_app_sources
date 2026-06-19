package com.bilibili.tgwt.im.ui;

import androidx.databinding.ObservableField;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatFragment$subscribeData$1.class */
final class PlayerChatFragment$subscribeData$1 extends SuspendLambda implements Function2<List<? extends ChatRoomMember>, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final PlayerChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerChatFragment$subscribeData$1(PlayerChatFragment playerChatFragment, Continuation<? super PlayerChatFragment$subscribeData$1> continuation) {
        super(2, continuation);
        this.this$0 = playerChatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerChatFragment$subscribeData$1 playerChatFragment$subscribeData$1 = new PlayerChatFragment$subscribeData$1(this.this$0, continuation);
        playerChatFragment$subscribeData$1.L$0 = obj;
        return playerChatFragment$subscribeData$1;
    }

    public final Object invoke(List<ChatRoomMember> list, Continuation<? super Unit> continuation) {
        return create(list, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object next;
        ChatRoomInfo chatRoomInfo;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List list = (List) this.L$0;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111251c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        BangumiUniformSeason season = togetherWatchDetailPageViewModel2.getSeasonService().getSeason();
        if (season != null && (chatRoomInfo = season.E) != null && !chatRoomInfo.G()) {
            com.bilibili.tgwt.detail.chat.p pVar = this.this$0.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar2 = pVar;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar2 = null;
            }
            pVar2.f111127n.set(list.size());
        }
        if (list.size() == 1) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.this$0.f111251c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
            if (togetherWatchDetailPageViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel4 = null;
            }
            com.bilibili.tgwt.chatroom.c cVarH = togetherWatchDetailPageViewModel4.getChatRoomManagerService().h();
            if (cVarH != null && ((ChatRoomMember) list.get(0)).getMid() == cVarH.f110974c && ((ChatRoomMember) list.get(0)).getMid() == com.bilibili.ogv.infra.account.a.f67852b.mid()) {
                com.bilibili.tgwt.detail.chat.p pVar3 = this.this$0.f111250b;
                if (pVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    pVar3 = null;
                }
                pVar3.f111134u.set(((ChatRoomMember) list.get(0)).getFace());
                PlayerChatFragment playerChatFragment = this.this$0;
                playerChatFragment.lf(playerChatFragment.f111252d | 16);
            } else {
                PlayerChatFragment playerChatFragment2 = this.this$0;
                playerChatFragment2.lf(playerChatFragment2.f111252d & (-17));
            }
        } else {
            com.bilibili.tgwt.detail.chat.p pVar4 = this.this$0.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar5 = pVar4;
            if (pVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar5 = null;
            }
            if (pVar5.f111133t.get()) {
                com.bilibili.tgwt.detail.chat.p pVar6 = this.this$0.f111250b;
                com.bilibili.tgwt.detail.chat.p pVar7 = pVar6;
                if (pVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    pVar7 = null;
                }
                ObservableField<ChatRoomMember> observableField = pVar7.f111135v;
                Iterator it = list.iterator();
                do {
                    next = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                } while (((ChatRoomMember) next).getMid() == com.bilibili.ogv.infra.account.a.f67852b.mid());
                observableField.set((ChatRoomMember) next);
            }
            PlayerChatFragment playerChatFragment3 = this.this$0;
            playerChatFragment3.lf(playerChatFragment3.f111252d & (-17));
        }
        return Unit.INSTANCE;
    }
}
