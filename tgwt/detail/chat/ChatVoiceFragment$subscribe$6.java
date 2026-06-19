package com.bilibili.tgwt.detail.chat;

import com.bilibili.app.comm.supermenu.core.IMenuPanel;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuItemClickListenerV2;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuVisibilityChangeListenerV2;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformEpisode;
import com.bilibili.bangumi.logic.page.detail.service.refactor.FetchShareMenuCallback;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment$subscribe$6.class */
final class ChatVoiceFragment$subscribe$6 extends SuspendLambda implements Function2<BangumiUniformEpisode, Continuation<? super Unit>, Object> {
    int label;
    final ChatVoiceFragment this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment$subscribe$6$a.class */
    public static final class a implements OnMenuVisibilityChangeListenerV2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatVoiceFragment f111051a;

        public a(ChatVoiceFragment chatVoiceFragment) {
            this.f111051a = chatVoiceFragment;
        }

        public final void onDismiss() {
            ChatVoiceFragment.jf(this.f111051a);
        }

        public final void onShow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceFragment$subscribe$6(ChatVoiceFragment chatVoiceFragment, Continuation<? super ChatVoiceFragment$subscribe$6> continuation) {
        super(2, continuation);
        this.this$0 = chatVoiceFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatVoiceFragment$subscribe$6(this.this$0, continuation);
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
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        if (togetherWatchDetailPageViewModel2.getChatService().f111868Q) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.this$0.f111045c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
            if (togetherWatchDetailPageViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel4 = null;
            }
            if (Intrinsics.areEqual("1", togetherWatchDetailPageViewModel4.getActivityContextParamsService().getImmutable().getNeedOpenShare())) {
                ChatVoiceFragment chatVoiceFragment = this.this$0;
                if (!chatVoiceFragment.f111046d) {
                    chatVoiceFragment.f111046d = true;
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = chatVoiceFragment.f111045c;
                    if (togetherWatchDetailPageViewModel5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        togetherWatchDetailPageViewModel5 = null;
                    }
                    togetherWatchDetailPageViewModel5.getShareService().showMenu(this.this$0.requireContext(), "ogv_video_detail_setting_together_watch_share", (FetchShareMenuCallback) null, (OnMenuItemClickListenerV2) null, (IMenuPanel) null, new a(this.this$0));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
