package com.bilibili.tgwt.detail.chat;

import com.bilibili.app.comm.supermenu.core.IMenuPanel;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuItemClickListenerV2;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuVisibilityChangeListenerV2;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformEpisode;
import com.bilibili.bangumi.logic.page.detail.service.refactor.FetchShareMenuCallback;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewShareService;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$subscribeData$8.class */
final class ChatFragment$subscribeData$8 extends SuspendLambda implements Function2<BangumiUniformEpisode, Continuation<? super Unit>, Object> {
    int label;
    final ChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$subscribeData$8(ChatFragment chatFragment, Continuation<? super ChatFragment$subscribeData$8> continuation) {
        super(2, continuation);
        this.this$0 = chatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatFragment$subscribeData$8(this.this$0, continuation);
    }

    public final Object invoke(BangumiUniformEpisode bangumiUniformEpisode, Continuation<? super Unit> continuation) {
        return create(bangumiUniformEpisode, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        if (Intrinsics.areEqual("1", togetherWatchDetailPageViewModel2.getActivityContextParamsService().getImmutable().getNeedOpenShare())) {
            ChatFragment chatFragment = this.this$0;
            if (!chatFragment.f111017f) {
                chatFragment.f111017f = true;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = chatFragment.f111019i;
                if (togetherWatchDetailPageViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel3 = null;
                }
                NewShareService.showMenu$default(togetherWatchDetailPageViewModel3.getShareService(), this.this$0.requireContext(), "ogv_video_detail_setting_together_watch_share", (FetchShareMenuCallback) null, (OnMenuItemClickListenerV2) null, (IMenuPanel) null, (OnMenuVisibilityChangeListenerV2) null, 32, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }
}
