package com.bilibili.ship.theseus.ogv.chathall;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.chatroom.init.BizType;
import com.bilibili.chatroom.ui.ChatEmptyStateFragment;
import com.bilibili.chatroomsdk.RoomInfo;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.ship.theseus.ogv.chathall.ChatHallService;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zu0.AbstractC9247p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallFragment.class */
@StabilityInferred(parameters = 0)
public final class ChatHallFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ChatHallService f91696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Handler f91697c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final f f91698d = new Runnable(this) { // from class: com.bilibili.ship.theseus.ogv.chathall.f

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatHallFragment f91766a;

        {
            this.f91766a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f91766a.f91696b.b();
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [com.bilibili.ship.theseus.ogv.chathall.f] */
    @Inject
    public ChatHallFragment(@NotNull ChatHallService chatHallService) {
        this.f91696b = chatHallService;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ChatHallService chatHallService = this.f91696b;
        chatHallService.f91715m = new h(chatHallService.f91720r);
        fV.m mVar = new fV.m(chatHallService.f91705b);
        BizType bizType = BizType.OGV;
        OgvEpisode ogvEpisodeC = chatHallService.f91706c.c();
        mVar.b = new fV.a(bizType, ogvEpisodeC != null ? ogvEpisodeC.f93555a : 0L, chatHallService.f91708e.f94449a, chatHallService.f91707d.a().f123880b);
        mVar.c = chatHallService.c();
        fV.i iVar = new fV.i();
        iVar.a = mVar.a;
        String str = mVar.c;
        String str2 = str;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bizReport");
            str2 = null;
        }
        iVar.c = str2;
        fV.a aVar = mVar.b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("businessData");
            aVar = null;
        }
        iVar.b = aVar;
        chatHallService.f91717o = iVar;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f91696b.f91716n = requireArguments().getLong("roomId");
        AbstractC9247p abstractC9247pInflate = AbstractC9247p.inflate(layoutInflater, viewGroup, false);
        abstractC9247pInflate.q(this.f91696b.d());
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("ChatEmptyStateFragment");
        if (fragmentFindFragmentByTag != null) {
            getChildFragmentManager().beginTransaction().remove(fragmentFindFragmentByTag).commitNowAllowingStateLoss();
        }
        fV.i iVar = this.f91696b.f91717o;
        fV.i iVar2 = iVar;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatExternalService");
            iVar2 = null;
        }
        ChatEmptyStateFragment chatEmptyStateFragment = iVar2.n;
        if (chatEmptyStateFragment == null) {
            chatEmptyStateFragment = new ChatEmptyStateFragment();
            chatEmptyStateFragment.b.c = false;
        }
        getChildFragmentManager().beginTransaction().add(2131301637, (Fragment) chatEmptyStateFragment, "ChatEmptyStateFragment").commitNowAllowingStateLoss();
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new ChatHallFragment$initChangeRoomFragment$1(this, null), 3, (Object) null);
        abstractC9247pInflate.f130816w.setDrawerLockMode(1);
        return abstractC9247pInflate.getRoot();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewDataBinding binding = DataBindingUtil.getBinding(requireView());
        if (binding != null) {
            binding.unbind();
        }
        this.f91697c.removeCallbacks(this.f91698d);
        this.f91696b.b();
        super.onDestroyView();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        this.f91697c.removeCallbacks(this.f91698d);
        if (flag == Flag.FLAG_PAGER) {
            this.f91697c.postDelayed(this.f91698d, 10000L);
        }
        super.onFragmentHide(flag);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.bilibili.ship.theseus.ogv.chathall.k] */
    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        this.f91697c.removeCallbacks(this.f91698d);
        final ChatHallService chatHallService = this.f91696b;
        ChatHallService.RoomState roomState = chatHallService.f91714l;
        ChatHallService.RoomState roomState2 = ChatHallService.RoomState.JOINING;
        if (roomState != roomState2) {
            chatHallService.f91714l = roomState2;
            if (chatHallService.f91713k == null) {
                fV.i iVar = null;
                CoroutineScope coroutineScopeA = o.a(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
                chatHallService.f91721s = coroutineScopeA;
                CoroutineScope coroutineScope = coroutineScopeA;
                if (coroutineScopeA == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("roomJoiningScope");
                    coroutineScope = null;
                }
                fV.i iVar2 = chatHallService.f91717o;
                if (iVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChatExternalService");
                } else {
                    iVar = iVar2;
                }
                final CoroutineScope coroutineScope2 = coroutineScope;
                iVar.a(chatHallService.f91716n, new l(chatHallService, coroutineScope), (k) new Function1(chatHallService, coroutineScope2) { // from class: com.bilibili.ship.theseus.ogv.chathall.k

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ChatHallService f91780a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final CoroutineScope f91781b;

                    {
                        this.f91780a = chatHallService;
                        this.f91781b = coroutineScope2;
                    }

                    public final Object invoke(Object obj) {
                        RoomInfo roomInfo = (RoomInfo) obj;
                        ChatHallService.RoomState roomState3 = roomInfo != null ? ChatHallService.RoomState.JOINED : ChatHallService.RoomState.INIT;
                        ChatHallService chatHallService2 = this.f91780a;
                        chatHallService2.f91714l = roomState3;
                        chatHallService2.f91713k = roomInfo;
                        if (roomInfo != null) {
                            h hVarD = chatHallService2.d();
                            String title = roomInfo.getTitle();
                            if (!Intrinsics.areEqual(title, hVarD.f91771c)) {
                                hVarD.f91771c = title;
                                hVarD.notifyPropertyChanged(258);
                            }
                            h hVarD2 = chatHallService2.d();
                            String subtitle = roomInfo.getSubtitle();
                            if (!Intrinsics.areEqual(subtitle, hVarD2.f91772d)) {
                                hVarD2.f91772d = subtitle;
                                hVarD2.notifyPropertyChanged(257);
                            }
                            BuildersKt.launch$default(this.f91781b, (CoroutineContext) null, (CoroutineStart) null, new ChatHallService$joinRoom$2$1$1(chatHallService2, null), 3, (Object) null);
                        }
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        super.onFragmentShow(flag);
    }
}
