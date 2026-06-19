package com.bilibili.ogv.operation.inlineplayer1;

import Mk0.g;
import TB.a;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bililive.listplayer.ListPlayerManager;
import com.bilibili.bililive.listplayer.videonew.PlayerInlineFragment;
import com.bilibili.moduleservice.list.IInlineVolumeService;
import com.bilibili.playerbizcommon.features.network.PlayerNetworkService;
import java.util.ArrayList;
import kr0.C7784a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.BufferingObserver;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerServiceManager;
import tv.danmaku.biliplayerv2.service.IRenderStartObserver;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;
import tv.danmaku.videoplayer.core.common.PlayerAudioManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer1/OGVBannerInlinePlayerFragment.class */
@StabilityInferred(parameters = 0)
public final class OGVBannerInlinePlayerFragment extends PlayerInlineFragment {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Vh.c f70220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public a f70221t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<TB.a> f70219r = new PlayerServiceManager.Client<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<com.bilibili.ogv.operation.inlineplayer1.a> f70222u = new PlayerServiceManager.Client<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<C7784a> f70223v = new PlayerServiceManager.Client<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final b f70224w = new b(this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final d f70225x = new d(this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final c f70226y = new c(this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final e f70227z = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer1/OGVBannerInlinePlayerFragment$a.class */
    public interface a {
        void a(int i7);

        void b(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer1/OGVBannerInlinePlayerFragment$b.class */
    public static final class b implements a.InterfaceC0123a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OGVBannerInlinePlayerFragment f70228a;

        public b(OGVBannerInlinePlayerFragment oGVBannerInlinePlayerFragment) {
            this.f70228a = oGVBannerInlinePlayerFragment;
        }

        @Override // TB.a.InterfaceC0123a
        public final void a() {
            Vh.c cVar;
            OGVBannerInlinePlayerFragment oGVBannerInlinePlayerFragment = this.f70228a;
            IPlayerContainer iPlayerContainer = oGVBannerInlinePlayerFragment.f62925b;
            if (iPlayerContainer == null || (cVar = oGVBannerInlinePlayerFragment.f70220s) == null) {
                return;
            }
            cVar.a(iPlayerContainer, oGVBannerInlinePlayerFragment.getCurrentPosition());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer1/OGVBannerInlinePlayerFragment$c.class */
    public static final class c implements BufferingObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OGVBannerInlinePlayerFragment f70229a;

        public c(OGVBannerInlinePlayerFragment oGVBannerInlinePlayerFragment) {
            this.f70229a = oGVBannerInlinePlayerFragment;
        }

        public final void onBufferingEnd() {
        }

        public final void onBufferingStart(int i7) {
            a aVar = this.f70229a.f70221t;
            if (aVar != null) {
                aVar.a(4);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer1/OGVBannerInlinePlayerFragment$d.class */
    public static final class d implements PlayerStateObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OGVBannerInlinePlayerFragment f70230a;

        public d(OGVBannerInlinePlayerFragment oGVBannerInlinePlayerFragment) {
            this.f70230a = oGVBannerInlinePlayerFragment;
        }

        public final void onPlayerStateChanged(int i7) {
            AbsFunctionWidgetService functionWidgetService;
            IPlayerCoreService playerCoreService;
            IPlayerCoreService playerCoreService2;
            OGVBannerInlinePlayerFragment oGVBannerInlinePlayerFragment = this.f70230a;
            a aVar = oGVBannerInlinePlayerFragment.f70221t;
            if (aVar != null) {
                aVar.a(i7);
            }
            boolean zIsMuteState = false;
            if (i7 == 3) {
                IInlineVolumeService iInlineVolumeService = oGVBannerInlinePlayerFragment.f62933k;
                if (iInlineVolumeService != null) {
                    zIsMuteState = iInlineVolumeService.isMuteState();
                }
                if (zIsMuteState) {
                    IPlayerContainer iPlayerContainer = oGVBannerInlinePlayerFragment.f62925b;
                    if (iPlayerContainer == null || (playerCoreService2 = iPlayerContainer.getPlayerCoreService()) == null) {
                        return;
                    }
                    playerCoreService2.setVolume(0.0f, 0.0f);
                    return;
                }
                IPlayerContainer iPlayerContainer2 = oGVBannerInlinePlayerFragment.f62925b;
                if (iPlayerContainer2 != null && (playerCoreService = iPlayerContainer2.getPlayerCoreService()) != null) {
                    playerCoreService.setVolume(1.0f, 1.0f);
                }
                PlayerAudioManager.Companion.getInstance().requestAudioFocus(ListPlayerManager.getInstance().getListPlayerAudioFocusListener(), 3, 1);
                return;
            }
            if (i7 == 4) {
                IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
                layoutParams.setLayoutType(32);
                layoutParams.setEnterAnim(-1);
                layoutParams.setExitAnim(-1);
                layoutParams.setFunctionType(1);
                IPlayerContainer iPlayerContainer3 = oGVBannerInlinePlayerFragment.f62925b;
                if (iPlayerContainer3 != null && (functionWidgetService = iPlayerContainer3.getFunctionWidgetService()) != null) {
                    functionWidgetService.showWidget(g.class, layoutParams);
                }
                a aVar2 = oGVBannerInlinePlayerFragment.f70221t;
                if (aVar2 != null) {
                    aVar2.b(false);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer1/OGVBannerInlinePlayerFragment$e.class */
    public static final class e implements IRenderStartObserver {
        public final void onVideoRenderStart() {
        }
    }

    @Override // com.bilibili.bililive.listplayer.videonew.PlayerInlineFragment, com.bilibili.bililive.listplayer.videonew.a
    public final void D() {
        TB.a aVar;
        if (!this.f62928e || (aVar = (TB.a) this.f70219r.getService()) == null || ((ArrayList) aVar.f23442e).isEmpty()) {
            return;
        }
        for (a.b bVar : (ArrayList) aVar.f23442e) {
            if (bVar != null) {
                bVar.D();
            }
        }
    }

    @Override // com.bilibili.bililive.listplayer.videonew.PlayerInlineFragment
    public final void kf() {
        IPlayerCoreService playerCoreService;
        IPlayerCoreService playerCoreService2;
        IPlayerCoreService playerCoreService3;
        super.kf();
        jf(TB.a.class, this.f70219r);
        jf(com.bilibili.ogv.operation.inlineplayer1.a.class, this.f70222u);
        jf(C7784a.class, this.f70223v);
        TB.a aVar = (TB.a) this.f70219r.getService();
        if (aVar != null) {
            aVar.f23444g = false;
        }
        TB.a aVar2 = (TB.a) this.f70219r.getService();
        if (aVar2 != null) {
            aVar2.f23443f = false;
        }
        TB.a aVar3 = (TB.a) this.f70219r.getService();
        if (aVar3 != null) {
            aVar3.h = false;
        }
        TB.a aVar4 = (TB.a) this.f70219r.getService();
        if (aVar4 != null) {
            aVar4.f23444g = false;
            aVar4.f23443f = false;
            aVar4.h = false;
            b bVar = this.f70224w;
            if (bVar != null) {
                ((ArrayList) aVar4.f23441d).add(bVar);
            }
        }
        com.bilibili.ogv.operation.inlineplayer1.a aVar5 = (com.bilibili.ogv.operation.inlineplayer1.a) this.f70222u.getService();
        if (aVar5 != null) {
            aVar5.f70236d = this.f70221t;
        }
        IPlayerContainer iPlayerContainer = this.f62925b;
        if (iPlayerContainer != null && (playerCoreService3 = iPlayerContainer.getPlayerCoreService()) != null) {
            playerCoreService3.registerBufferingState(this.f70226y);
        }
        IPlayerContainer iPlayerContainer2 = this.f62925b;
        if (iPlayerContainer2 != null && (playerCoreService2 = iPlayerContainer2.getPlayerCoreService()) != null) {
            playerCoreService2.registerState(this.f70225x, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 10});
        }
        IPlayerContainer iPlayerContainer3 = this.f62925b;
        if (iPlayerContainer3 == null || (playerCoreService = iPlayerContainer3.getPlayerCoreService()) == null) {
            return;
        }
        playerCoreService.addRenderStartObserver(this.f70227z);
    }

    @Override // com.bilibili.bililive.listplayer.videonew.PlayerInlineFragment
    public final void lf() {
        IPlayerCoreService playerCoreService;
        IPlayerCoreService playerCoreService2;
        IPlayerCoreService playerCoreService3;
        IPlayerServiceManager playerServiceManager;
        b bVar;
        super.lf();
        mf(TB.a.class, this.f70219r);
        mf(com.bilibili.ogv.operation.inlineplayer1.a.class, this.f70222u);
        mf(C7784a.class, this.f70223v);
        TB.a aVar = (TB.a) this.f70219r.getService();
        if (aVar != null && (bVar = this.f70224w) != null) {
            ((ArrayList) aVar.f23441d).remove(bVar);
        }
        IPlayerContainer iPlayerContainer = this.f62925b;
        if (iPlayerContainer != null && (playerServiceManager = iPlayerContainer.getPlayerServiceManager()) != null) {
            playerServiceManager.unbindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(PlayerNetworkService.class), this.f70222u);
        }
        com.bilibili.ogv.operation.inlineplayer1.a aVar2 = (com.bilibili.ogv.operation.inlineplayer1.a) this.f70222u.getService();
        if (aVar2 != null) {
            aVar2.f70236d = null;
        }
        IPlayerContainer iPlayerContainer2 = this.f62925b;
        if (iPlayerContainer2 != null && (playerCoreService3 = iPlayerContainer2.getPlayerCoreService()) != null) {
            playerCoreService3.unregisterBufferingState(this.f70226y);
        }
        IPlayerContainer iPlayerContainer3 = this.f62925b;
        if (iPlayerContainer3 != null && (playerCoreService2 = iPlayerContainer3.getPlayerCoreService()) != null) {
            playerCoreService2.removeRenderStartObserver(this.f70227z);
        }
        IPlayerContainer iPlayerContainer4 = this.f62925b;
        if (iPlayerContainer4 == null || (playerCoreService = iPlayerContainer4.getPlayerCoreService()) == null) {
            return;
        }
        playerCoreService.unregisterState(this.f70225x);
    }

    @Override // com.bilibili.bililive.listplayer.videonew.PlayerInlineFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f62932j = false;
    }
}
