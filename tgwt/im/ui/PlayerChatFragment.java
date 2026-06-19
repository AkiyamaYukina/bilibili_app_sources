package com.bilibili.tgwt.im.ui;

import DD0.O;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.transition.TransitionManager;
import com.alipay.sdk.app.PayTask;
import com.bilibili.bangumi.module.chatroom.ChatConfigType;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfig;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfigValue;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.service.ChatService;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import hm.c;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.webrtc.ScreenCapturerAndroid;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatFragment.class */
@StabilityInferred(parameters = 0)
public final class PlayerChatFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.bilibili.tgwt.detail.chat.p f111250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TogetherWatchDetailPageViewModel f111251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f111252d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f111254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f111255g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f111256i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Handler f111253e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommon.features.network.g f111257j = new com.bilibili.playerbizcommon.features.network.g(this, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final a f111258k = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatFragment$a.class */
    public static final class a implements com.bilibili.tgwt.detail.chat.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerChatFragment f111259a;

        public a(PlayerChatFragment playerChatFragment) {
            this.f111259a = playerChatFragment;
        }

        @Override // com.bilibili.tgwt.detail.chat.v
        public final void a() {
            PlayerChatFragment playerChatFragment = this.f111259a;
            com.bilibili.tgwt.detail.chat.p pVar = playerChatFragment.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar2 = pVar;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar2 = null;
            }
            ChatRoomConfig chatRoomConfig = pVar2.f111109U;
            ChatRoomConfigValue chatRoomConfigValueB = chatRoomConfig != null ? chatRoomConfig.b() : null;
            if ((chatRoomConfigValueB != null ? chatRoomConfigValueB.a() : null) != ChatConfigType.UNAVAILABLE_AND_VISIBLE) {
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(playerChatFragment.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new PlayerChatFragment$roomEventListener$1$onChangeRoomClick$1(playerChatFragment, null), 3, (Object) null);
                Neurons.reportClick$default(false, "pgc.watch-together-fullscreen-cinema.chat-zone.change-room.click", (Map) null, 4, (Object) null);
                return;
            }
            Context context = playerChatFragment.getContext();
            String strB = chatRoomConfigValueB.b();
            String str = strB;
            if (strB == null) {
                str = "";
            }
            ToastHelper.showToastShort(context, str);
        }

        @Override // com.bilibili.tgwt.detail.chat.v
        public final void b() {
            PlayerChatFragment playerChatFragment = this.f111259a;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = playerChatFragment.f111251c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            cf.p.b("is_full_screen", !togetherWatchDetailPageViewModel2.getScreenStateService().getScreenStateHelper().a().b ? "0" : "1", "pgc.watch-together-cinema.cinema-im.im-message.click", false);
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = playerChatFragment.f111251c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
            if (togetherWatchDetailPageViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel4 = null;
            }
            ChatService chatService = togetherWatchDetailPageViewModel4.getChatService();
            com.bilibili.tgwt.detail.chat.p pVar = playerChatFragment.f111250b;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar = null;
            }
            chatService.t(!pVar.f111121g);
        }

        @Override // com.bilibili.tgwt.detail.chat.v
        public final void c() {
            Neurons.reportClick$default(false, "pgc.watch-together-fullscreen-cinema.chat-zone.notice.click", (Map) null, 4, (Object) null);
            new l(this.f111259a.requireContext()).show();
        }

        @Override // com.bilibili.tgwt.detail.chat.v
        public final void e(View view) {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            PlayerChatFragment playerChatFragment = this.f111259a;
            com.bilibili.tgwt.detail.chat.p pVar = playerChatFragment.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar2 = pVar;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar2 = null;
            }
            mapCreateMapBuilder.put("room_state", pVar2.f111120f.get() ? "0" : "1");
            Unit unit = Unit.INSTANCE;
            Neurons.reportClick(false, "pgc.watch-together-fullscreen-cinema.chat-zone.public-room.click", MapsKt.build(mapCreateMapBuilder));
            if (System.currentTimeMillis() - playerChatFragment.f111254f < PayTask.f60018j) {
                ToastHelper.showToastShort(playerChatFragment.getContext(), 2131836336);
                return;
            }
            com.bilibili.tgwt.detail.chat.p pVar3 = playerChatFragment.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar4 = pVar3;
            if (pVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar4 = null;
            }
            if (pVar4.f111120f.get()) {
                PlayerChatFragment.kf(playerChatFragment, false);
                return;
            }
            c.a aVar = new c.a(view.getContext());
            aVar.b = playerChatFragment.getString(2131836260);
            aVar.b(playerChatFragment.getString(2131836253), (Function1) null);
            aVar.c(playerChatFragment.getString(2131836318), new EQ.h(playerChatFragment, 1));
            aVar.a().show();
        }

        @Override // com.bilibili.tgwt.detail.chat.v
        public final void f(View view) {
            PlayerChatFragment playerChatFragment = this.f111259a;
            com.bilibili.tgwt.detail.chat.p pVar = playerChatFragment.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar2 = pVar;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar2 = null;
            }
            if (pVar2.f111131r.get() == 6) {
                Neurons.reportClick$default(false, "pgc.watch-together-fullscreen-cinema.chat-zone.settings.click", (Map) null, 4, (Object) null);
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = playerChatFragment.f111251c;
                if (togetherWatchDetailPageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel = null;
                }
                togetherWatchDetailPageViewModel.getScreenStateService().getScreenStateHelper().i();
                new CinemaSettingsDialog(view.getContext()).show();
            }
        }
    }

    public static final void jf(PlayerChatFragment playerChatFragment) {
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = playerChatFragment.f111251c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        if (togetherWatchDetailPageViewModel2.getChatRoomManagerService().g() == 1) {
            com.bilibili.tgwt.detail.chat.p pVar = playerChatFragment.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar2 = pVar;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar2 = null;
            }
            if (pVar2.h.get()) {
                com.bilibili.tgwt.detail.chat.p pVar3 = playerChatFragment.f111250b;
                com.bilibili.tgwt.detail.chat.p pVar4 = pVar3;
                if (pVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    pVar4 = null;
                }
                if (pVar4.f111131r.get() != 1 && !playerChatFragment.f111255g) {
                    Neurons.reportExposure$default(false, "pgc.watch-together-fullscreen-cinema.chat-zone.public-room.show", (Map) null, (List) null, 12, (Object) null);
                    playerChatFragment.f111255g = true;
                }
            }
        }
        if (!playerChatFragment.h) {
            com.bilibili.tgwt.detail.chat.p pVar5 = playerChatFragment.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar6 = pVar5;
            if (pVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar6 = null;
            }
            if (!pVar6.h.get()) {
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = playerChatFragment.f111251c;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
                if (togetherWatchDetailPageViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel4 = null;
                }
                if (togetherWatchDetailPageViewModel4.getChatRoomManagerService().g() == 1) {
                    com.bilibili.tgwt.detail.chat.p pVar7 = playerChatFragment.f111250b;
                    com.bilibili.tgwt.detail.chat.p pVar8 = pVar7;
                    if (pVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mVm");
                        pVar8 = null;
                    }
                    if (pVar8.f111131r.get() != 1) {
                        Neurons.reportExposure$default(false, "pgc.watch-together-fullscreen-cinema.chat-zone.change-room.show", (Map) null, (List) null, 12, (Object) null);
                        playerChatFragment.h = true;
                    }
                }
            }
        }
        com.bilibili.tgwt.detail.chat.p pVar9 = playerChatFragment.f111250b;
        com.bilibili.tgwt.detail.chat.p pVar10 = pVar9;
        if (pVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            pVar10 = null;
        }
        if (pVar10.h.get()) {
            return;
        }
        com.bilibili.tgwt.detail.chat.p pVar11 = playerChatFragment.f111250b;
        com.bilibili.tgwt.detail.chat.p pVar12 = pVar11;
        if (pVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            pVar12 = null;
        }
        if (pVar12.f111131r.get() == 6) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = playerChatFragment.f111251c;
            if (togetherWatchDetailPageViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel5 = null;
            }
            if (togetherWatchDetailPageViewModel5.getChatRoomManagerService().g() != 1 || playerChatFragment.f111256i) {
                return;
            }
            Neurons.reportExposure$default(false, "pgc.watch-together-cinema.cinema-im.im-message.show", MapsKt.mapOf(TuplesKt.to("is_full_screen", "1")), (List) null, 8, (Object) null);
            playerChatFragment.f111256i = true;
        }
    }

    public static final void kf(PlayerChatFragment playerChatFragment, boolean z6) {
        com.bilibili.tgwt.detail.chat.p pVar = playerChatFragment.f111250b;
        com.bilibili.tgwt.detail.chat.p pVar2 = pVar;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            pVar2 = null;
        }
        pVar2.f111102N.set(false);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(playerChatFragment), (CoroutineContext) null, (CoroutineStart) null, new PlayerChatFragment$requestChatSettingPublicChange$1(playerChatFragment, z6, null), 3, (Object) null);
    }

    public final void lf(int i7) {
        int i8 = this.f111252d;
        if (i8 != i7) {
            if (i8 == 62) {
                if (i7 == 46) {
                    this.f111253e.postDelayed(this.f111257j, PayTask.f60018j);
                } else {
                    final int i9 = 0;
                    this.f111253e.postDelayed(new Runnable(this, i9) { // from class: com.bilibili.tgwt.im.ui.p

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f111311a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f111312b;

                        {
                            this.f111311a = i9;
                            this.f111312b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (this.f111311a) {
                                case 0:
                                    PlayerChatFragment playerChatFragment = (PlayerChatFragment) this.f111312b;
                                    if (playerChatFragment.getView() instanceof ViewGroup) {
                                        TransitionManager.beginDelayedTransition((ViewGroup) playerChatFragment.getView());
                                    }
                                    com.bilibili.tgwt.detail.chat.p pVar = playerChatFragment.f111250b;
                                    com.bilibili.tgwt.detail.chat.p pVar2 = pVar;
                                    if (pVar == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mVm");
                                        pVar2 = null;
                                    }
                                    pVar2.f111133t.set(false);
                                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = playerChatFragment.f111251c;
                                    if (togetherWatchDetailPageViewModel == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        togetherWatchDetailPageViewModel = null;
                                    }
                                    togetherWatchDetailPageViewModel.getChatRoomManagerService().k(ChatRoomManagerService.FullScreenChatPopLayerType.WAIT_PEOPLE_POP_LAYER, false);
                                    break;
                                default:
                                    ScreenCapturerAndroid.a((ScreenCapturerAndroid) this.f111312b);
                                    break;
                            }
                        }
                    }, 200L);
                }
            } else if (i7 == 62) {
                this.f111253e.removeCallbacks(this.f111257j);
                com.bilibili.tgwt.detail.chat.p pVar = this.f111250b;
                com.bilibili.tgwt.detail.chat.p pVar2 = pVar;
                if (pVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    pVar2 = null;
                }
                pVar2.f111136w.set(true);
                com.bilibili.tgwt.detail.chat.p pVar3 = this.f111250b;
                if (pVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    pVar3 = null;
                }
                pVar3.f111136w.notifyChange();
                this.f111253e.postDelayed(new Hf1.m(this, 1), 200L);
            }
            this.f111252d = i7;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        O oInflate = O.inflate(layoutInflater, viewGroup, false);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = (TogetherWatchDetailPageViewModel) new ViewModelProvider(requireActivity()).get(TogetherWatchDetailPageViewModel.class);
        this.f111251c = togetherWatchDetailPageViewModel;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        com.bilibili.tgwt.detail.chat.p pVar = new com.bilibili.tgwt.detail.chat.p(togetherWatchDetailPageViewModel2.getChatRoomManagerService(), this.f111258k);
        pVar.f111123j.set(8);
        pVar.f111125l.set(false);
        this.f111250b = pVar;
        oInflate.q(pVar);
        oInflate.f2337H.setSelected(true);
        return oInflate.getRoot();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.bilibili.tgwt.detail.chat.p pVar = this.f111250b;
        com.bilibili.tgwt.detail.chat.p pVar2 = pVar;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            pVar2 = null;
        }
        pVar2.f111116b = null;
        super.onDestroyView();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        int iA = Kl.d.a(requireActivity().getWindow());
        if (iA > 0) {
            com.bilibili.tgwt.detail.chat.p pVar = this.f111250b;
            com.bilibili.tgwt.detail.chat.p pVar2 = pVar;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                pVar2 = null;
            }
            pVar2.f111132s.set(iA);
        }
        PlayerChatMsgFragment playerChatMsgFragment = new PlayerChatMsgFragment();
        com.bilibili.tgwt.detail.chat.p pVar3 = this.f111250b;
        com.bilibili.tgwt.detail.chat.p pVar4 = pVar3;
        if (pVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            pVar4 = null;
        }
        pVar4.f111113Y.set(new MD0.b(this) { // from class: com.bilibili.tgwt.im.ui.PlayerChatFragment.onViewCreated.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerChatFragment f111260a;

            {
                this.f111260a = this;
            }

            @Override // MD0.b
            public final void a() {
                PlayerChatFragment playerChatFragment = this.f111260a;
                com.bilibili.tgwt.detail.chat.p pVar5 = playerChatFragment.f111250b;
                com.bilibili.tgwt.detail.chat.p pVar6 = pVar5;
                if (pVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    pVar6 = null;
                }
                ChatRoomConfig chatRoomConfig = pVar6.f111109U;
                ChatRoomConfigValue chatRoomConfigValueB = chatRoomConfig != null ? chatRoomConfig.b() : null;
                if ((chatRoomConfigValueB != null ? chatRoomConfigValueB.a() : null) != ChatConfigType.UNAVAILABLE_AND_VISIBLE) {
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(playerChatFragment.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new PlayerChatFragment$onViewCreated$1$switchRoomClick$1(playerChatFragment, null), 3, (Object) null);
                    return;
                }
                Context context = playerChatFragment.getContext();
                String strB = chatRoomConfigValueB.b();
                String str = strB;
                if (strB == null) {
                    str = "";
                }
                ToastHelper.showToastShort(context, str);
            }
        });
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (playerChatMsgFragment.isAdded()) {
            parentFragmentManager.beginTransaction().show(playerChatMsgFragment).commitAllowingStateLoss();
        } else {
            parentFragmentManager.beginTransaction().add(2131308970, playerChatMsgFragment).commitAllowingStateLoss();
        }
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111251c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(togetherWatchDetailPageViewModel2.getChatRoomManagerService().f110925r), new PlayerChatFragment$subscribeData$1(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.f111251c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
        if (togetherWatchDetailPageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel4 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(togetherWatchDetailPageViewModel4.getChatRoomManagerService().f110924q), new PlayerChatFragment$subscribeData$2(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = this.f111251c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
        if (togetherWatchDetailPageViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel6 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel6.getSeasonService().getSeasonObservable(), new PlayerChatFragment$subscribeData$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel7 = this.f111251c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel8 = togetherWatchDetailPageViewModel7;
        if (togetherWatchDetailPageViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel8 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel8.getChatRoomManagerService().f110932y, new PlayerChatFragment$subscribeData$4(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel9 = this.f111251c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel10 = togetherWatchDetailPageViewModel9;
        if (togetherWatchDetailPageViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel10 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel10.getChatRoomManagerService().f110889C, new PlayerChatFragment$subscribeData$5(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel11 = this.f111251c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel12 = togetherWatchDetailPageViewModel11;
        if (togetherWatchDetailPageViewModel11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel12 = null;
        }
        MutableStateFlow<Integer> mutableStateFlow = togetherWatchDetailPageViewModel12.getChatRoomManagerService().f110931x;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel13 = this.f111251c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel14 = togetherWatchDetailPageViewModel13;
        if (togetherWatchDetailPageViewModel13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel14 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(FlowKt.combine(mutableStateFlow, togetherWatchDetailPageViewModel14.getChatRoomManagerService().f110890D, PlayerChatFragment$subscribeData$8.INSTANCE), new PlayerChatFragment$subscribeData$9(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel15 = this.f111251c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel16 = togetherWatchDetailPageViewModel15;
        if (togetherWatchDetailPageViewModel15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel16 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel16.getChatRoomManagerService().f110891E, new PlayerChatFragment$subscribeData$10(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel17 = this.f111251c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel18 = togetherWatchDetailPageViewModel17;
        if (togetherWatchDetailPageViewModel17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel18 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel18.getChatService().f111883c0, new PlayerChatFragment$subscribeData$11(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }
}
