package com.bilibili.tgwt.detail.chat;

import DD0.A;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$subscribeData$4.class */
final class ChatFragment$subscribeData$4 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    int I$0;
    int label;
    final ChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$subscribeData$4(ChatFragment chatFragment, Continuation<? super ChatFragment$subscribeData$4> continuation) {
        super(2, continuation);
        this.this$0 = chatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatFragment$subscribeData$4 chatFragment$subscribeData$4 = new ChatFragment$subscribeData$4(this.this$0, continuation);
        chatFragment$subscribeData$4.I$0 = ((Number) obj).intValue();
        return chatFragment$subscribeData$4;
    }

    public final Object invoke(int i7, Continuation<? super Unit> continuation) {
        return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        ChatRoomInfo chatRoomInfo;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.I$0 == 0) {
            A a7 = this.this$0.f111020j;
            A a8 = a7;
            if (a7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a8 = null;
            }
            a8.f2169A.setVisibility(0);
            A a9 = this.this$0.f111020j;
            A a10 = a9;
            if (a9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a10 = null;
            }
            FrameLayout frameLayout = a10.f2180L;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111019i;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            BangumiUniformSeason season = togetherWatchDetailPageViewModel2.getSeasonService().getSeason();
            frameLayout.setVisibility((season == null || (chatRoomInfo = season.E) == null || chatRoomInfo.u() != 1) ? 8 : 0);
            A a11 = this.this$0.f111020j;
            A a12 = a11;
            if (a11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a12 = null;
            }
            ConstraintLayout constraintLayout = a12.f2194Y;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.this$0.f111019i;
            if (togetherWatchDetailPageViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel3 = null;
            }
            int i7 = 8;
            if (((Boolean) ((Pair) togetherWatchDetailPageViewModel3.getChatRoomManagerService().f110891E.getValue()).getSecond()).booleanValue()) {
                i7 = 0;
            }
            constraintLayout.setVisibility(i7);
        } else {
            A a13 = this.this$0.f111020j;
            A a14 = a13;
            if (a13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a14 = null;
            }
            a14.f2169A.setVisibility(8);
            A a15 = this.this$0.f111020j;
            A a16 = a15;
            if (a15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a16 = null;
            }
            a16.f2180L.setVisibility(8);
            ChatFragment chatFragment = this.this$0;
            if (chatFragment.f111011B) {
                chatFragment.kf();
            }
            A a17 = this.this$0.f111020j;
            if (a17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a17 = null;
            }
            a17.f2194Y.setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
