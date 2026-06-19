package com.bilibili.tgwt.detail.chat;

import DD0.AbstractC1538k;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import bolts.CancellationTokenSource;
import com.bilibili.app.comm.opus.lightpublish.page.comment.z;
import com.bilibili.app.comm.supermenu.core.IMenuPanel;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuItemClickListenerV2;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuVisibilityChangeListenerV2;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiPopFragmentService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.FetchShareMenuCallback;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewShareService;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.tgwt.detail.chat.ChatVoiceFragment;
import com.bilibili.tgwt.detail.chat.m;
import com.bilibili.tgwt.service.ChatService;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment.class */
@StabilityInferred(parameters = 0)
public final class ChatVoiceFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f111044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TogetherWatchDetailPageViewModel f111045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f111046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f111047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f111048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a f111049g = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment$a.class */
    public static final class a implements m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatVoiceFragment f111050a;

        public a(ChatVoiceFragment chatVoiceFragment) {
            this.f111050a = chatVoiceFragment;
        }

        @Override // com.bilibili.tgwt.detail.chat.m.a
        public final void a(Context context) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ChatVoiceFragment chatVoiceFragment = this.f111050a;
            if (jCurrentTimeMillis - chatVoiceFragment.f111048f >= 1000) {
                chatVoiceFragment.f111048f = jCurrentTimeMillis;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatVoiceFragment.f111045c;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
                if (togetherWatchDetailPageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    togetherWatchDetailPageViewModel2 = null;
                }
                Neurons.reportClick(false, "pgc.watch-together-cinema-voice.audience.invite.click", togetherWatchDetailPageViewModel2.getChatService().f111870S);
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = chatVoiceFragment.f111045c;
                if (togetherWatchDetailPageViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    togetherWatchDetailPageViewModel3 = null;
                }
                NewShareService.showMenu$default(togetherWatchDetailPageViewModel3.getShareService(), context, "ogv_video_detail_member_list_invite_together_watch_share", (FetchShareMenuCallback) null, (OnMenuItemClickListenerV2) null, (IMenuPanel) null, (OnMenuVisibilityChangeListenerV2) null, 60, (Object) null);
            }
        }

        @Override // com.bilibili.tgwt.detail.chat.m.a
        public final void b(long j7) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111050a.f111045c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            ChatService chatService = togetherWatchDetailPageViewModel2.getChatService();
            List<ChatRoomMember> listJ = chatService.h.j();
            if (listJ != null) {
                for (ChatRoomMember chatRoomMember : listJ) {
                    if (chatRoomMember.getMid() == j7) {
                        chatService.f111890i.a(chatRoomMember);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.detail.chat.ChatVoiceFragment$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChatVoiceFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChatVoiceFragment chatVoiceFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatVoiceFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(ChatVoiceFragment chatVoiceFragment, Context context) {
            ChatVoiceFragment.kf(chatVoiceFragment);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                String[] strArr = Build.VERSION.SDK_INT >= 31 ? new String[]{"android.permission.BLUETOOTH_CONNECT", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.RECORD_AUDIO"};
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                PermissionsChecker.grantPermissions(fragmentActivityRequireActivity, strArr, 19, 2131835404).continueWith(new Ul0.b(cancellableContinuationImpl), cancellationTokenSource.getToken());
                cancellableContinuationImpl.invokeOnCancellation(new Ul0.c(cancellationTokenSource));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                obj = result;
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = null;
            if (zBooleanValue) {
                ChatVoiceFragment.kf(this.this$0);
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = this.this$0.f111045c;
                if (togetherWatchDetailPageViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    togetherWatchDetailPageViewModel2 = null;
                }
                togetherWatchDetailPageViewModel2.getChatService().v(true);
            } else {
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.this$0.f111045c;
                if (togetherWatchDetailPageViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    togetherWatchDetailPageViewModel = togetherWatchDetailPageViewModel3;
                }
                ChatService chatService = togetherWatchDetailPageViewModel.getChatService();
                final ChatVoiceFragment chatVoiceFragment = this.this$0;
                chatService.o(new Function1(chatVoiceFragment) { // from class: com.bilibili.tgwt.detail.chat.r

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ChatVoiceFragment f111140a;

                    {
                        this.f111140a = chatVoiceFragment;
                    }

                    public final Object invoke(Object obj2) {
                        return ChatVoiceFragment.AnonymousClass1.invokeSuspend$lambda$0(this.f111140a, (Context) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    public static final void jf(ChatVoiceFragment chatVoiceFragment) {
        chatVoiceFragment.getClass();
        Lazy lazy = Nl0.i.f17294a;
        if (((Boolean) Nl0.i.a("bangumi_voice_mode_announcement_shown", Boolean.FALSE)).booleanValue()) {
            return;
        }
        u uVar = chatVoiceFragment.f111044b;
        u uVar2 = uVar;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            uVar2 = null;
        }
        uVar2.m(chatVoiceFragment.requireContext());
        Nl0.i.c("bangumi_voice_mode_announcement_shown", Boolean.TRUE);
    }

    public static final void kf(ChatVoiceFragment chatVoiceFragment) {
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatVoiceFragment.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel2.getSeasonService().getSeasonObservable(), new ChatVoiceFragment$subscribe$1(chatVoiceFragment, null)), LifecycleOwnerKt.getLifecycleScope(chatVoiceFragment));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = chatVoiceFragment.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
        if (togetherWatchDetailPageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel4 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(togetherWatchDetailPageViewModel4.getChatRoomManagerService().f110925r), new ChatVoiceFragment$subscribe$2(chatVoiceFragment, null)), LifecycleOwnerKt.getLifecycleScope(chatVoiceFragment));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = chatVoiceFragment.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
        if (togetherWatchDetailPageViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel6 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel6.getDetailChatService().b, new ChatVoiceFragment$subscribe$3(chatVoiceFragment, null)), LifecycleOwnerKt.getLifecycleScope(chatVoiceFragment));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel7 = chatVoiceFragment.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel8 = togetherWatchDetailPageViewModel7;
        if (togetherWatchDetailPageViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel8 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel8.getChatService().f111855D, new ChatVoiceFragment$subscribe$4(chatVoiceFragment, null)), LifecycleOwnerKt.getLifecycleScope(chatVoiceFragment));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel9 = chatVoiceFragment.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel10 = togetherWatchDetailPageViewModel9;
        if (togetherWatchDetailPageViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel10 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel10.getSeasonService().getSeasonObservable(), new ChatVoiceFragment$subscribe$5(chatVoiceFragment, null)), LifecycleOwnerKt.getLifecycleScope(chatVoiceFragment));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel11 = chatVoiceFragment.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel12 = togetherWatchDetailPageViewModel11;
        if (togetherWatchDetailPageViewModel11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel12 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel12.getPlayControlService().getCurrentEpisodeFlow(), new ChatVoiceFragment$subscribe$6(chatVoiceFragment, null)), LifecycleOwnerKt.getLifecycleScope(chatVoiceFragment));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel13 = chatVoiceFragment.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel14 = togetherWatchDetailPageViewModel13;
        if (togetherWatchDetailPageViewModel13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel14 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel14.getChatService().f111856E, new ChatVoiceFragment$subscribe$7(chatVoiceFragment, null)), LifecycleOwnerKt.getLifecycleScope(chatVoiceFragment));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel15 = chatVoiceFragment.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel16 = togetherWatchDetailPageViewModel15;
        if (togetherWatchDetailPageViewModel15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel16 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel16.getChatService().f111863L, new ChatVoiceFragment$subscribe$8(chatVoiceFragment, null)), LifecycleOwnerKt.getLifecycleScope(chatVoiceFragment));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel17 = chatVoiceFragment.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel18 = togetherWatchDetailPageViewModel17;
        if (togetherWatchDetailPageViewModel17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel18 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel18.getChatVoiceRtcService().f111939i, new ChatVoiceFragment$subscribe$9(chatVoiceFragment, null)), LifecycleOwnerKt.getLifecycleScope(chatVoiceFragment));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel19 = chatVoiceFragment.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel20 = togetherWatchDetailPageViewModel19;
        if (togetherWatchDetailPageViewModel19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel20 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(FlowKt.debounce(FlowKt.onEach(togetherWatchDetailPageViewModel20.getChatVoiceRtcService().f111941k, new ChatVoiceFragment$subscribe$10(chatVoiceFragment, null)), 200L), new ChatVoiceFragment$subscribe$11(chatVoiceFragment, null)), LifecycleOwnerKt.getLifecycleScope(chatVoiceFragment));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel21 = chatVoiceFragment.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel22 = togetherWatchDetailPageViewModel21;
        if (togetherWatchDetailPageViewModel21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel22 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(FlowKt.debounce(FlowKt.onEach(togetherWatchDetailPageViewModel22.getChatVoiceRtcService().f111942l, new ChatVoiceFragment$subscribe$12(chatVoiceFragment, null)), 200L), new ChatVoiceFragment$subscribe$13(chatVoiceFragment, null)), LifecycleOwnerKt.getLifecycleScope(chatVoiceFragment));
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        AbstractC1538k abstractC1538kInflate = AbstractC1538k.inflate(LayoutInflater.from(getContext()), viewGroup, false);
        this.f111045c = (TogetherWatchDetailPageViewModel) new ViewModelProvider(requireActivity()).get(TogetherWatchDetailPageViewModel.class);
        Context contextRequireContext = requireContext();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        BangumiPopFragmentService popFragmentService = togetherWatchDetailPageViewModel2.getPopFragmentService();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
        if (togetherWatchDetailPageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel4 = null;
        }
        NewSeasonService seasonService = togetherWatchDetailPageViewModel4.getSeasonService();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = this.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
        if (togetherWatchDetailPageViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel6 = null;
        }
        u uVar = new u(contextRequireContext, popFragmentService, seasonService, togetherWatchDetailPageViewModel6.getChatService(), new z(this, 1));
        this.f111044b = uVar;
        uVar.f111148f.f111081o = this.f111049g;
        uVar.f111149g.f111081o = this.f111049g;
        u uVar2 = this.f111044b;
        if (uVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            uVar2 = null;
        }
        abstractC1538kInflate.q(uVar2);
        return abstractC1538kInflate.getRoot();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        togetherWatchDetailPageViewModel2.getChatVoiceRtcService().e("");
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
