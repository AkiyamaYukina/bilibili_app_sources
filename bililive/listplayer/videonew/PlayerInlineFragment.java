package com.bilibili.bililive.listplayer.videonew;

import RB.d;
import RB.e;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bililive.listplayer.ListPlayerManager;
import com.bilibili.bililive.listplayer.videonew.PlayerInlineFragment;
import com.bilibili.bililive.listplayer.videonew.a;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.moduleservice.list.IInlineVolumeService;
import com.bilibili.playerbizcommon.features.background.BackgroundPlayService;
import com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService;
import com.bilibili.playerbizcommon.features.network.PlayerNetworkService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ControlContainerConfig;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerParamsV2;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerService;
import tv.danmaku.biliplayerv2.service.IPlayerServiceManager;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.IRenderStartObserver;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;
import tv.danmaku.biliplayerv2.service.PlayerDataSource;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.business.ShutOffTimingService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.PlayScene;
import tv.danmaku.ijk.media.player.render.output.IJKEXTRendererInterface;
import tv.danmaku.render.core.IVideoRenderLayer;
import tv.danmaku.videoplayer.core.common.PlayerAudioManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bililive/listplayer/videonew/PlayerInlineFragment.class */
@Deprecated(message = "使用卡片播放器代替")
public class PlayerInlineFragment extends BaseFragment implements com.bilibili.bililive.listplayer.videonew.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public IPlayerContainer f62925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public PlayerParamsV2 f62926c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f62928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f62929f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public PlayerDataSource f62934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Mk0.a f62935m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final HashMap<ControlContainerType, ControlContainerConfig> f62927d = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final RB.a f62930g = new Object();

    @NotNull
    public final List<a.InterfaceC0345a> h = new ArrayList(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<PlayerNetworkService> f62931i = new PlayerServiceManager.Client<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f62932j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final IInlineVolumeService f62933k = (IInlineVolumeService) BLRouter.INSTANCE.get(IInlineVolumeService.class, "inline_volume_key");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final b f62936n = new b(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final RB.b f62937o = new IJKEXTRendererInterface.OnFirstFrameListener(this) { // from class: RB.b

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerInlineFragment f20672a;

        {
            this.f20672a = this;
        }

        public final void onFirstFrame() {
            final PlayerInlineFragment playerInlineFragment = this.f20672a;
            HandlerThreads.post(0, new Runnable(playerInlineFragment) { // from class: RB.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlayerInlineFragment f20673a;

                {
                    this.f20673a = playerInlineFragment;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f20673a.f62936n.onVideoRenderStart();
                }
            });
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final c f62938p = new c(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final a f62939q = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/bililive/listplayer/videonew/PlayerInlineFragment$a.class */
    public static final class a implements PlayerStateObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerInlineFragment f62940a;

        public a(PlayerInlineFragment playerInlineFragment) {
            this.f62940a = playerInlineFragment;
        }

        public final void onPlayerStateChanged(int i7) {
            IPlayerCoreService playerCoreService;
            if (i7 == 3) {
                PlayerInlineFragment playerInlineFragment = this.f62940a;
                if (playerInlineFragment.f62929f > 0) {
                    IPlayerContainer iPlayerContainer = playerInlineFragment.f62925b;
                    if (iPlayerContainer != null && (playerCoreService = iPlayerContainer.getPlayerCoreService()) != null) {
                        playerCoreService.seekTo(playerInlineFragment.f62929f);
                    }
                    playerInlineFragment.f62929f = 0;
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/bililive/listplayer/videonew/PlayerInlineFragment$b.class */
    public static final class b implements IRenderStartObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerInlineFragment f62941a;

        public b(PlayerInlineFragment playerInlineFragment) {
            this.f62941a = playerInlineFragment;
        }

        public final void onVideoRenderStart() {
            Mk0.a aVar = this.f62941a.f62935m;
            if (aVar != null) {
                aVar.getClass();
                ListPlayerManager.getInstance().showVideoContainer();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/bililive/listplayer/videonew/PlayerInlineFragment$c.class */
    public static final class c implements IVideosPlayDirectorService.VideoPlayEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerInlineFragment f62942a;

        public c(PlayerInlineFragment playerInlineFragment) {
            this.f62942a = playerInlineFragment;
        }

        public final void onResolveFailed(Video video, Video.PlayableParams playableParams, String str) {
            if (this.f62942a.f62935m != null) {
                ListPlayerManager.getInstance().showVideoContainer();
            }
        }

        public final void onVideoCompleted(Video video) {
            super.onVideoCompleted(video);
            Mk0.a aVar = this.f62942a.f62935m;
        }
    }

    @Override // com.bilibili.bililive.listplayer.videonew.a
    public void D() {
    }

    @Override // com.bilibili.bililive.listplayer.videonew.a
    public final boolean Z(long j7) {
        Video video;
        PlayerDataSource playerDataSource = this.f62934l;
        return Intrinsics.areEqual(String.valueOf(j7), (playerDataSource == null || (video = playerDataSource.getVideo(0)) == null) ? null : video.getId());
    }

    @Override // com.bilibili.bililive.listplayer.videonew.a
    public final void gd(@NotNull RecyclerView.ViewHolder viewHolder) {
        PlayerNetworkService playerNetworkService;
        if (this.f62928e && (playerNetworkService = (PlayerNetworkService) this.f62931i.getService()) != null) {
            playerNetworkService.setEnableResumePlay(false);
        }
    }

    @Override // com.bilibili.bililive.listplayer.videonew.a
    public final int getCurrentPosition() {
        if (!this.f62928e) {
            return 0;
        }
        IPlayerContainer iPlayerContainer = this.f62925b;
        int currentPosition = 0;
        if (iPlayerContainer != null) {
            IPlayerCoreService playerCoreService = iPlayerContainer.getPlayerCoreService();
            currentPosition = 0;
            if (playerCoreService != null) {
                currentPosition = playerCoreService.getCurrentPosition();
            }
        }
        return currentPosition;
    }

    @Override // com.bilibili.bililive.listplayer.videonew.a
    @Nullable
    public final IPlayerContainer getPlayerContainer() {
        return this.f62925b;
    }

    @Override // com.bilibili.bililive.listplayer.videonew.a
    public final int getPlayerState() {
        if (!this.f62928e) {
            return 0;
        }
        IPlayerContainer iPlayerContainer = this.f62925b;
        int state = 0;
        if (iPlayerContainer != null) {
            IPlayerCoreService playerCoreService = iPlayerContainer.getPlayerCoreService();
            state = 0;
            if (playerCoreService != null) {
                state = playerCoreService.getState();
            }
        }
        return state;
    }

    public final <T extends IPlayerService> void jf(@NotNull Class<T> cls, @NotNull PlayerServiceManager.Client<T> client) {
        IPlayerServiceManager playerServiceManager;
        IPlayerContainer iPlayerContainer = this.f62925b;
        if (iPlayerContainer == null || (playerServiceManager = iPlayerContainer.getPlayerServiceManager()) == null) {
            return;
        }
        playerServiceManager.bindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(cls), client);
    }

    @CallSuper
    public void kf() {
        IPlayerCoreService playerCoreService;
        IRenderContainerService renderContainerService;
        IVideosPlayDirectorService videoPlayDirectorService;
        IVideosPlayDirectorService videoPlayDirectorService2;
        IPlayerContainer iPlayerContainer = this.f62925b;
        if (iPlayerContainer != null && (videoPlayDirectorService2 = iPlayerContainer.getVideoPlayDirectorService()) != null) {
            videoPlayDirectorService2.addVideoPlayEventListener(this.f62938p);
        }
        IPlayerContainer iPlayerContainer2 = this.f62925b;
        if (iPlayerContainer2 != null && (videoPlayDirectorService = iPlayerContainer2.getVideoPlayDirectorService()) != null) {
            videoPlayDirectorService.setProcessCompleteActionEnable(false);
        }
        if (IVideoRenderLayer.Companion.enableExternalRender()) {
            IPlayerContainer iPlayerContainer3 = this.f62925b;
            if (iPlayerContainer3 != null && (renderContainerService = iPlayerContainer3.getRenderContainerService()) != null) {
                renderContainerService.setFirstFrameListener(this.f62937o);
            }
        } else {
            IPlayerContainer iPlayerContainer4 = this.f62925b;
            if (iPlayerContainer4 != null && (playerCoreService = iPlayerContainer4.getPlayerCoreService()) != null) {
                playerCoreService.addRenderStartObserver(this.f62936n);
            }
        }
        if (this.f62932j) {
            jf(PlayerNetworkService.class, this.f62931i);
            PlayerNetworkService playerNetworkService = (PlayerNetworkService) this.f62931i.getService();
            if (playerNetworkService != null) {
                playerNetworkService.registerVideoEnvironmentObserver(new d(this));
            }
            PlayerNetworkService playerNetworkService2 = (PlayerNetworkService) this.f62931i.getService();
            if (playerNetworkService2 != null) {
                playerNetworkService2.setNetworkAlertHandler(new e(this));
            }
        }
    }

    @CallSuper
    public void lf() {
        IPlayerCoreService playerCoreService;
        IVideosPlayDirectorService videoPlayDirectorService;
        if (this.f62932j) {
            mf(PlayerNetworkService.class, this.f62931i);
        }
        IPlayerContainer iPlayerContainer = this.f62925b;
        if (iPlayerContainer != null && (videoPlayDirectorService = iPlayerContainer.getVideoPlayDirectorService()) != null) {
            videoPlayDirectorService.removeVideoPlayEventListener(this.f62938p);
        }
        IPlayerContainer iPlayerContainer2 = this.f62925b;
        if (iPlayerContainer2 == null || (playerCoreService = iPlayerContainer2.getPlayerCoreService()) == null) {
            return;
        }
        playerCoreService.removeRenderStartObserver(this.f62936n);
    }

    @Override // com.bilibili.bililive.listplayer.videonew.a
    public final void mc(boolean z6) {
        if (z6) {
            if (getPlayerState() == 5) {
                resume();
            }
        } else if (getPlayerState() == 4) {
            pause();
        }
    }

    public final <T extends IPlayerService> void mf(@NotNull Class<T> cls, @NotNull PlayerServiceManager.Client<T> client) {
        IPlayerServiceManager playerServiceManager;
        IPlayerContainer iPlayerContainer = this.f62925b;
        if (iPlayerContainer == null || (playerServiceManager = iPlayerContainer.getPlayerServiceManager()) == null) {
            return;
        }
        playerServiceManager.unbindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(cls), client);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        IPlayerContainer iPlayerContainer = this.f62925b;
        if (iPlayerContainer != null) {
            iPlayerContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getContext() == null || this.f62926c == null) {
            return;
        }
        if (this.f62925b == null) {
            this.f62925b = new IPlayerContainer.Builder().setContext(requireContext()).setPlayerParams(this.f62926c).setControlContainerConfig(this.f62927d).build();
        }
        IPlayerContainer iPlayerContainer = this.f62925b;
        if (iPlayerContainer != null) {
            iPlayerContainer.onCreate(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        IPlayerServiceManager playerServiceManager;
        IPlayerServiceManager playerServiceManager2;
        IPlayerServiceManager playerServiceManager3;
        IPlayerContainer iPlayerContainer = this.f62925b;
        View viewOnCreateView = null;
        if (iPlayerContainer == null) {
            return null;
        }
        if (iPlayerContainer != null && (playerServiceManager3 = iPlayerContainer.getPlayerServiceManager()) != null) {
            playerServiceManager3.startService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(ShutOffTimingService.class));
        }
        IPlayerContainer iPlayerContainer2 = this.f62925b;
        if (iPlayerContainer2 != null && (playerServiceManager2 = iPlayerContainer2.getPlayerServiceManager()) != null) {
            playerServiceManager2.startService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(BackgroundPlayService.class));
        }
        IPlayerContainer iPlayerContainer3 = this.f62925b;
        if (iPlayerContainer3 != null && (playerServiceManager = iPlayerContainer3.getPlayerServiceManager()) != null) {
            playerServiceManager.startService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(PlayerHeadsetService.class));
        }
        IPlayerContainer iPlayerContainer4 = this.f62925b;
        if (iPlayerContainer4 != null) {
            viewOnCreateView = iPlayerContainer4.onCreateView(layoutInflater, viewGroup, bundle);
        }
        return viewOnCreateView;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        IReporterService reporterService;
        lf();
        IPlayerContainer iPlayerContainer = this.f62925b;
        if (iPlayerContainer != null && (reporterService = iPlayerContainer.getReporterService()) != null) {
            reporterService.notifySceneChange(PlayScene.INLINE);
        }
        IPlayerContainer iPlayerContainer2 = this.f62925b;
        if (iPlayerContainer2 != null) {
            iPlayerContainer2.onDestroy();
        }
        super.onDestroy();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        IPlayerContainer iPlayerContainer = this.f62925b;
        if (iPlayerContainer != null) {
            iPlayerContainer.onPause();
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f62930g.getClass();
        IInlineVolumeService iInlineVolumeService = this.f62933k;
        if (iInlineVolumeService != null && !iInlineVolumeService.isMuteState()) {
            PlayerAudioManager.Companion.getInstance().requestAudioFocus(ListPlayerManager.getInstance().getListPlayerAudioFocusListener(), 3, 1);
        }
        PlayerAudioManager.Companion.getInstance().requestMonopolyFocus(ListPlayerManager.getInstance().getListPlayerAudioFocusListener(), true);
        IPlayerContainer iPlayerContainer = this.f62925b;
        if (iPlayerContainer != null) {
            iPlayerContainer.onResume();
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        IPlayerContainer iPlayerContainer = this.f62925b;
        if (iPlayerContainer != null) {
            iPlayerContainer.onStart();
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f62930g.getClass();
        PlayerAudioManager.Companion.getInstance().abandonMonopolyFocus(ListPlayerManager.getInstance().getListPlayerAudioFocusListener());
        IPlayerContainer iPlayerContainer = this.f62925b;
        if (iPlayerContainer != null) {
            iPlayerContainer.onStop();
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        IReporterService reporterService;
        IVideosPlayDirectorService videoPlayDirectorService;
        IPlayerCoreService playerCoreService;
        IPlayerContainer iPlayerContainer = this.f62925b;
        if (iPlayerContainer != null) {
            iPlayerContainer.onViewCreated(view, bundle);
        }
        kf();
        this.f62928e = true;
        a aVar = this.f62939q;
        IPlayerContainer iPlayerContainer2 = this.f62925b;
        if (iPlayerContainer2 != null && (playerCoreService = iPlayerContainer2.getPlayerCoreService()) != null) {
            playerCoreService.registerState(aVar, new int[]{3, 4, 5, 6, 8});
        }
        Iterator it = ((ArrayList) this.h).iterator();
        while (it.hasNext()) {
            ((a.InterfaceC0345a) it.next()).onReady();
        }
        ((ArrayList) this.h).clear();
        IPlayerContainer iPlayerContainer3 = this.f62925b;
        if (iPlayerContainer3 != null && (videoPlayDirectorService = iPlayerContainer3.getVideoPlayDirectorService()) != null) {
            videoPlayDirectorService.play(0, 0);
        }
        PlayerServiceManager.Client client = new PlayerServiceManager.Client();
        jf(BackgroundPlayService.class, client);
        BackgroundPlayService backgroundPlayService = (BackgroundPlayService) client.getService();
        if (backgroundPlayService != null) {
            backgroundPlayService.setSettingAvailable(false);
        }
        mf(BackgroundPlayService.class, client);
        IPlayerContainer iPlayerContainer4 = this.f62925b;
        if (iPlayerContainer4 == null || (reporterService = iPlayerContainer4.getReporterService()) == null) {
            return;
        }
        reporterService.notifySceneChange(PlayScene.INLINE);
    }

    @Override // com.bilibili.bililive.listplayer.videonew.a
    public final void pause() {
        IPlayerContainer iPlayerContainer;
        IPlayerCoreService playerCoreService;
        if (!this.f62928e || (iPlayerContainer = this.f62925b) == null || (playerCoreService = iPlayerContainer.getPlayerCoreService()) == null) {
            return;
        }
        playerCoreService.pause();
    }

    @Override // com.bilibili.bililive.listplayer.videonew.a
    public final void restoreVolume() {
        IPlayerCoreService playerCoreService;
        IPlayerContainer iPlayerContainer = this.f62925b;
        if (iPlayerContainer == null || (playerCoreService = iPlayerContainer.getPlayerCoreService()) == null) {
            return;
        }
        playerCoreService.setVolume(1.0f, 1.0f);
    }

    @Override // com.bilibili.bililive.listplayer.videonew.a
    public final void resume() {
        IPlayerContainer iPlayerContainer;
        IPlayerCoreService playerCoreService;
        if (this.f62928e) {
            if ((getPlayerState() != 5 && getPlayerState() != 0) || (iPlayerContainer = this.f62925b) == null || (playerCoreService = iPlayerContainer.getPlayerCoreService()) == null) {
                return;
            }
            playerCoreService.resume();
        }
    }

    @Override // com.bilibili.bililive.listplayer.videonew.a
    public final void te(@NotNull RecyclerView.ViewHolder viewHolder) {
        PlayerNetworkService playerNetworkService;
        if (this.f62928e && (playerNetworkService = (PlayerNetworkService) this.f62931i.getService()) != null) {
            playerNetworkService.setEnableResumePlay(true);
        }
    }
}
