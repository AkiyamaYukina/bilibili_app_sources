package com.bilibili.tgwt.im.ui;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatFragment$subscribeData$2.class */
final class PlayerChatFragment$subscribeData$2 extends SuspendLambda implements Function2<com.bilibili.tgwt.chatroom.c, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final PlayerChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerChatFragment$subscribeData$2(PlayerChatFragment playerChatFragment, Continuation<? super PlayerChatFragment$subscribeData$2> continuation) {
        super(2, continuation);
        this.this$0 = playerChatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerChatFragment$subscribeData$2 playerChatFragment$subscribeData$2 = new PlayerChatFragment$subscribeData$2(this.this$0, continuation);
        playerChatFragment$subscribeData$2.L$0 = obj;
        return playerChatFragment$subscribeData$2;
    }

    public final Object invoke(com.bilibili.tgwt.chatroom.c cVar, Continuation<? super Unit> continuation) {
        return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ChatRoomInfo chatRoomInfo;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        com.bilibili.tgwt.chatroom.c cVar = (com.bilibili.tgwt.chatroom.c) this.L$0;
        com.bilibili.tgwt.detail.chat.p pVar = this.this$0.f111250b;
        com.bilibili.tgwt.detail.chat.p pVar2 = pVar;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            pVar2 = null;
        }
        pVar2.h.set(cVar.f110974c == com.bilibili.ogv.infra.account.a.f67852b.mid());
        com.bilibili.tgwt.detail.chat.p pVar3 = this.this$0.f111250b;
        com.bilibili.tgwt.detail.chat.p pVar4 = pVar3;
        if (pVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            pVar4 = null;
        }
        boolean z6 = pVar4.h.get();
        int i7 = cVar.f110973b;
        if (z6) {
            PlayerChatFragment playerChatFragment = this.this$0;
            playerChatFragment.lf(8 | playerChatFragment.f111252d);
            com.bilibili.tgwt.detail.chat.p pVar5 = this.this$0.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar6 = pVar5;
            if (pVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar6 = null;
            }
            pVar6.f111123j.set(0);
            com.bilibili.tgwt.detail.chat.p pVar7 = this.this$0.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar8 = pVar7;
            if (pVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar8 = null;
            }
            pVar8.f111125l.set(true);
            com.bilibili.tgwt.detail.chat.p pVar9 = this.this$0.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar10 = pVar9;
            if (pVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar10 = null;
            }
            pVar10.f111120f.set(i7 == 1);
        } else {
            PlayerChatFragment playerChatFragment2 = this.this$0;
            playerChatFragment2.lf(playerChatFragment2.f111252d & (-9));
            com.bilibili.tgwt.detail.chat.p pVar11 = this.this$0.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar12 = pVar11;
            if (pVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar12 = null;
            }
            pVar12.f111123j.set(8);
            com.bilibili.tgwt.detail.chat.p pVar13 = this.this$0.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar14 = pVar13;
            if (pVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar14 = null;
            }
            pVar14.f111125l.set(i7 == 1);
        }
        if (i7 == 1) {
            PlayerChatFragment playerChatFragment3 = this.this$0;
            playerChatFragment3.lf(playerChatFragment3.f111252d | 2);
        } else {
            PlayerChatFragment playerChatFragment4 = this.this$0;
            playerChatFragment4.lf(playerChatFragment4.f111252d & (-3));
        }
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111251c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        BangumiUniformSeason season = togetherWatchDetailPageViewModel2.getSeasonService().getSeason();
        if (season != null && (chatRoomInfo = season.E) != null && chatRoomInfo.G()) {
            com.bilibili.tgwt.detail.chat.p pVar15 = this.this$0.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar16 = pVar15;
            if (pVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar16 = null;
            }
            pVar16.f111127n.set(cVar.h);
            com.bilibili.tgwt.detail.chat.p pVar17 = this.this$0.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar18 = pVar17;
            if (pVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar18 = null;
            }
            pVar18.f111128o.set(cVar.f110979i);
            com.bilibili.tgwt.detail.chat.p pVar19 = this.this$0.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar20 = pVar19;
            if (pVar19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar20 = null;
            }
            pVar20.f111129p.set(cVar.f110980j);
            com.bilibili.tgwt.detail.chat.p pVar21 = this.this$0.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar22 = pVar21;
            if (pVar21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar22 = null;
            }
            pVar22.f111126m.set(cVar.f110978g);
            Drawable drawable = AppCompatResources.getDrawable(this.this$0.requireContext(), 2131240662);
            if (drawable != null) {
                drawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
            }
            com.bilibili.tgwt.detail.chat.p pVar23 = this.this$0.f111250b;
            if (pVar23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar23 = null;
            }
            pVar23.f111124k.set(drawable);
        }
        PlayerChatFragment.jf(this.this$0);
        return Unit.INSTANCE;
    }
}
