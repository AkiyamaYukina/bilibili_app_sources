package com.bilibili.tgwt.detail.chat;

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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$subscribeData$2.class */
final class ChatFragment$subscribeData$2 extends SuspendLambda implements Function2<com.bilibili.tgwt.chatroom.c, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$subscribeData$2(ChatFragment chatFragment, Continuation<? super ChatFragment$subscribeData$2> continuation) {
        super(2, continuation);
        this.this$0 = chatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatFragment$subscribeData$2 chatFragment$subscribeData$2 = new ChatFragment$subscribeData$2(this.this$0, continuation);
        chatFragment$subscribeData$2.L$0 = obj;
        return chatFragment$subscribeData$2;
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
        this.this$0.f111014c = Boxing.boxLong(cVar.f110972a);
        p pVar = this.this$0.f111021k;
        p pVar2 = pVar;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar2 = null;
        }
        pVar2.h.set(cVar.f110974c == com.bilibili.ogv.infra.account.a.f67852b.mid());
        p pVar3 = this.this$0.f111021k;
        p pVar4 = pVar3;
        if (pVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar4 = null;
        }
        boolean z6 = pVar4.h.get();
        int i7 = cVar.f110973b;
        if (z6) {
            ChatFragment chatFragment = this.this$0;
            chatFragment.nf(8 | chatFragment.f111023m);
            p pVar5 = this.this$0.f111021k;
            p pVar6 = pVar5;
            if (pVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar6 = null;
            }
            pVar6.f111123j.set(0);
            p pVar7 = this.this$0.f111021k;
            p pVar8 = pVar7;
            if (pVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar8 = null;
            }
            pVar8.f111125l.set(true);
            p pVar9 = this.this$0.f111021k;
            p pVar10 = pVar9;
            if (pVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar10 = null;
            }
            pVar10.f111120f.set(i7 == 1);
        } else {
            ChatFragment chatFragment2 = this.this$0;
            chatFragment2.nf(chatFragment2.f111023m & (-9));
            p pVar11 = this.this$0.f111021k;
            p pVar12 = pVar11;
            if (pVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar12 = null;
            }
            pVar12.f111123j.set(8);
            p pVar13 = this.this$0.f111021k;
            p pVar14 = pVar13;
            if (pVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar14 = null;
            }
            pVar14.f111125l.set(i7 == 1);
        }
        if (i7 == 1) {
            ChatFragment chatFragment3 = this.this$0;
            chatFragment3.nf(chatFragment3.f111023m | 2);
        } else {
            ChatFragment chatFragment4 = this.this$0;
            chatFragment4.nf(chatFragment4.f111023m & (-3));
        }
        p pVar15 = this.this$0.f111021k;
        p pVar16 = pVar15;
        if (pVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar16 = null;
        }
        pVar16.f111126m.set(cVar.f110978g);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        BangumiUniformSeason season = togetherWatchDetailPageViewModel2.getSeasonService().getSeason();
        if (season != null && (chatRoomInfo = season.E) != null && chatRoomInfo.G()) {
            p pVar17 = this.this$0.f111021k;
            p pVar18 = pVar17;
            if (pVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar18 = null;
            }
            pVar18.f111127n.set(cVar.h);
            p pVar19 = this.this$0.f111021k;
            p pVar20 = pVar19;
            if (pVar19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar20 = null;
            }
            pVar20.f111128o.set(cVar.f110979i);
            p pVar21 = this.this$0.f111021k;
            p pVar22 = pVar21;
            if (pVar21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar22 = null;
            }
            pVar22.f111129p.set(cVar.f110981k);
            Drawable drawable = AppCompatResources.getDrawable(this.this$0.requireContext(), 2131240662);
            if (drawable != null) {
                drawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
            }
            p pVar23 = this.this$0.f111021k;
            p pVar24 = pVar23;
            if (pVar23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar24 = null;
            }
            pVar24.f111124k.set(drawable);
        }
        p pVar25 = this.this$0.f111021k;
        if (pVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar25 = null;
        }
        pVar25.f111130q.set(cVar.f110977f);
        this.this$0.mf();
        return Unit.INSTANCE;
    }
}
