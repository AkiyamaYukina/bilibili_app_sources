package com.bilibili.tgwt.im.ui;

import android.content.Context;
import com.bilibili.api.BiliApiException;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.droid.ToastHelper;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatFragment$requestChatSettingPublicChange$1.class */
final class PlayerChatFragment$requestChatSettingPublicChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $requestOpen;
    int label;
    final PlayerChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerChatFragment$requestChatSettingPublicChange$1(PlayerChatFragment playerChatFragment, boolean z6, Continuation<? super PlayerChatFragment$requestChatSettingPublicChange$1> continuation) {
        super(2, continuation);
        this.this$0 = playerChatFragment;
        this.$requestOpen = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayerChatFragment$requestChatSettingPublicChange$1(this.this$0, this.$requestOpen, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        ChatRoomInfo chatRoomInfo;
        com.bilibili.tgwt.detail.chat.p pVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatRoomOperationService chatRoomOperationService = (ChatRoomOperationService) ServiceGenerator.createService(ChatRoomOperationService.class);
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111251c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            BangumiUniformSeason season = togetherWatchDetailPageViewModel2.getSeasonService().getSeason();
            long jT = (season == null || (chatRoomInfo = season.E) == null) ? 0L : chatRoomInfo.t();
            boolean z6 = this.$requestOpen;
            this.label = 1;
            Object objModifyRoomInfo = chatRoomOperationService.modifyRoomInfo(jT, z6 ? 1 : 0, this);
            obj = objModifyRoomInfo;
            if (objModifyRoomInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        PlayerChatFragment playerChatFragment = this.this$0;
        boolean z7 = this.$requestOpen;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BiliApiException biliApiException = new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            Context context = playerChatFragment.getContext();
            String message = biliApiException.getMessage();
            ToastHelper.showToastShort(context, message != null ? message : "");
            pVar = playerChatFragment.f111250b;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar = null;
            }
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.bilibili.tgwt.detail.chat.p pVar2 = playerChatFragment.f111250b;
                com.bilibili.tgwt.detail.chat.p pVar3 = pVar2;
                if (pVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    pVar3 = null;
                }
                pVar3.f111102N.set(true);
                com.bilibili.tgwt.detail.chat.p pVar4 = playerChatFragment.f111250b;
                if (pVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    pVar4 = null;
                }
                pVar4.f111120f.set(z7);
                if (z7) {
                    playerChatFragment.lf(playerChatFragment.f111252d | 2);
                } else {
                    playerChatFragment.lf(playerChatFragment.f111252d & (-3));
                }
                playerChatFragment.f111254f = System.currentTimeMillis();
                return Unit.INSTANCE;
            }
            Exception exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            Context context2 = playerChatFragment.getContext();
            String message2 = exception.getMessage();
            ToastHelper.showToastShort(context2, message2 != null ? message2 : "");
            pVar = playerChatFragment.f111250b;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar = null;
            }
        }
        pVar.f111102N.set(true);
        return Unit.INSTANCE;
    }
}
