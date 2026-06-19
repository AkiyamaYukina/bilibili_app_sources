package com.bilibili.playerbizcommonv2.service;

import GS0.N;
import GS0.O;
import android.content.ComponentCallbacks2;
import androidx.compose.foundation.Q;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import bi0.AbstractC5109a;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import com.bilibili.bililive.room.ui.roomv3.player.controller.widget.h;
import com.bilibili.bililive.room.ui.roomv3.player.controller.widget.i;
import com.bilibili.bus.Violet;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.service.AccessToken;
import com.bilibili.lib.fasthybrid.game.engine.ability.impl.audio.w;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playerbizcommonv2.danmaku.input.widget.PlayerDanmakuExpressionView;
import com.bilibili.playerbizcommonv2.danmaku.postpanel.DanmakuTimerService;
import com.bilibili.ship.theseus.keel.player.q;
import com.bilibili.ship.theseus.united.page.videopiece.DanmakuInputDelegateService;
import java.util.Arrays;
import java.util.Map;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import pr0.InterfaceC8347a;
import se0.k;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainerKt;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.collection.Collections;
import tv.danmaku.biliplayerv2.router.PlayerRouteUris;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.IPlayerService;
import tv.danmaku.biliplayerv2.service.IPlayerServiceManager;
import tv.danmaku.biliplayerv2.service.LifecycleState;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.VideoDirectorObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.DanmakuCommandPanelsObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.IDanmakuParamsChangeObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.service.interact.core.api.InteractApiService;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;
import tv.danmaku.biliplayerv2.service.interact.core.model.DanmakuParams;
import tv.danmaku.biliplayerv2.service.interact.core.sender.DanmakuSendParams;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/DanmakuInputWindowService.class */
@StabilityInferred(parameters = 0)
public final class DanmakuInputWindowService implements IPlayerService, InterfaceC8347a, qr0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f81791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f81792b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public PlayerDanmakuExpressionView.a f81795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public com.bilibili.playerbizcommonv2.danmaku.input.g f81796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public com.bilibili.playerbizcommonv2.service.a f81797g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f81799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f81800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f81801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public String f81802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Long f81803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public DanmakuInputDelegateService.AnonymousClass1.C11501.a f81804o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<Er0.a> f81793c = new PlayerServiceManager.Client<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<DanmakuTimerService> f81794d = new PlayerServiceManager.Client<>();
    public final Collections.SafeIteratorList<com.bilibili.playerbizcommonv2.service.b> h = Q.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f81798i = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final c f81805p = new c(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final b f81806q = new b(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final a f81807r = new a(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final e f81808s = new e(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final h f81809t = new h(this, 1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final i f81810u = new i(this, 1);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/DanmakuInputWindowService$a.class */
    public static final class a implements DanmakuCommandPanelsObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DanmakuInputWindowService f81811a;

        public a(DanmakuInputWindowService danmakuInputWindowService) {
            this.f81811a = danmakuInputWindowService;
        }

        public final void onDataSetChanged(CommandsPanel commandsPanel) {
            com.bilibili.playerbizcommonv2.danmaku.input.g gVar = this.f81811a.f81796f;
            if (gVar != null) {
                com.bilibili.playerbizcommonv2.danmaku.input.a.q(gVar, commandsPanel, null, null, null, 254);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/DanmakuInputWindowService$b.class */
    public static final class b implements IDanmakuParamsChangeObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DanmakuInputWindowService f81812a;

        public b(DanmakuInputWindowService danmakuInputWindowService) {
            this.f81812a = danmakuInputWindowService;
        }

        public final void onChanged(DanmakuParams danmakuParams) {
            com.bilibili.playerbizcommonv2.danmaku.input.g gVar = this.f81812a.f81796f;
            if (gVar != null) {
                com.bilibili.playerbizcommonv2.danmaku.input.a.q(gVar, null, danmakuParams.getDmViewReply(), null, null, 253);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/DanmakuInputWindowService$c.class */
    public static final class c implements VideoDirectorObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DanmakuInputWindowService f81813a;

        public c(DanmakuInputWindowService danmakuInputWindowService) {
            this.f81813a = danmakuInputWindowService;
        }

        public final void onItemWillChange(Video.PlayableParams playableParams, Video.PlayableParams playableParams2) {
            DanmakuInputWindowService danmakuInputWindowService = this.f81813a;
            danmakuInputWindowService.f81796f = null;
            com.bilibili.playerbizcommonv2.service.a aVar = danmakuInputWindowService.f81797g;
            if (aVar != null) {
                aVar.f81822c = null;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/DanmakuInputWindowService$d.class */
    public static final class d extends BiliApiDataCallback<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.bilibili.playerbizcommonv2.danmaku.input.panel.d f81814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CommandsDanmaku f81815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DanmakuInputWindowService f81816d;

        public d(com.bilibili.playerbizcommonv2.danmaku.input.panel.d dVar, CommandsDanmaku commandsDanmaku, DanmakuInputWindowService danmakuInputWindowService) {
            this.f81814b = dVar;
            this.f81815c = commandsDanmaku;
            this.f81816d = danmakuInputWindowService;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(String str) {
            CommandsDanmaku commandsDanmaku = this.f81815c;
            this.f81814b.b(commandsDanmaku);
            IPlayerContainer iPlayerContainer = this.f81816d.f81791a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            IRemoteHandler remoteHandler = iPlayerContainer2.getInteractLayerService().getRemoteHandler();
            if (remoteHandler != null) {
                remoteHandler.onCommandDanmakuDeleted(commandsDanmaku);
            }
            String extra = commandsDanmaku.getExtra();
            String str2 = extra;
            if (extra == null) {
                str2 = "";
            }
            Violet.INSTANCE.sendMsg(new AbstractC5109a.j(k.a("vote_id", new JSONObject(str2))));
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            this.f81814b.a(th);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/DanmakuInputWindowService$e.class */
    public static final class e implements ControlContainerObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DanmakuInputWindowService f81817a;

        public e(DanmakuInputWindowService danmakuInputWindowService) {
            this.f81817a = danmakuInputWindowService;
        }

        public final void onControlContainerChanged(ControlContainerType controlContainerType, ScreenModeType screenModeType) {
            com.bilibili.playerbizcommonv2.danmaku.input.g gVar = this.f81817a.f81796f;
            if (gVar != null) {
                gVar.i();
            }
        }
    }

    @Override // pr0.InterfaceC8347a
    public final void C(@NotNull com.bilibili.playerbizcommonv2.service.b bVar) {
        this.h.remove(bVar);
    }

    @Override // pr0.InterfaceC8347a
    public final void D(@NotNull String str, @NotNull String... strArr) {
        IPlayerContainer iPlayerContainer = this.f81791a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent(str, (String[]) Arrays.copyOf(strArr, strArr.length)));
    }

    @Override // pr0.InterfaceC8347a
    public final void O(@NotNull CommandsDanmaku commandsDanmaku, @Nullable com.bilibili.playerbizcommonv2.danmaku.input.panel.d dVar) {
        String accessKey;
        Video.DisplayParams displayParams;
        IPlayerContainer iPlayerContainer = this.f81791a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.danmaku-set.dm-order-list.delete.player", new String[0]));
        PlayerContainer playerContainer = this.f81791a;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        if (!BiliAccounts.get(playerContainer2.getContext()).isLogin()) {
            PlayerRouteUris.Routers routers = PlayerRouteUris.Routers.INSTANCE;
            PlayerContainer playerContainer3 = this.f81791a;
            if (playerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer3 = null;
            }
            PlayerRouteUris.Routers.login$default(routers, playerContainer3.getContext(), 0, (String) null, 4, (Object) null);
            return;
        }
        PlayerContainer playerContainer4 = this.f81791a;
        PlayerContainer playerContainer5 = playerContainer4;
        if (playerContainer4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer5 = null;
        }
        AccessToken accessToken = BiliAccounts.get(playerContainer5.getContext()).getAccessToken();
        if (accessToken == null || (accessKey = accessToken.getAccessKey()) == null) {
            return;
        }
        IPlayerContainer iPlayerContainer3 = this.f81791a;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        Video.PlayableParams currentPlayableParams = PlayerContainerKt.getPlayDirector(iPlayerContainer3).getCurrentPlayableParams();
        if (currentPlayableParams == null || (displayParams = currentPlayableParams.getDisplayParams()) == null) {
            return;
        }
        ((InteractApiService) ServiceGenerator.createService(InteractApiService.class)).deleteCommandDanmaku(accessKey, String.valueOf(displayParams.getAvid()), String.valueOf(displayParams.getCid()), "2", String.valueOf(commandsDanmaku.getId())).enqueue(new d(dVar, commandsDanmaku, this));
    }

    @Override // qr0.b
    public final void P(@NotNull com.bilibili.playerbizcommonv2.service.a aVar) {
        this.f81797g = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(@org.jetbrains.annotations.Nullable com.bilibili.playerbizcommonv2.service.d r15) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.service.DanmakuInputWindowService.R(com.bilibili.playerbizcommonv2.service.d):void");
    }

    @Override // qr0.b
    @NotNull
    public final qr0.e a() {
        qr0.e eVar;
        DanmakuInputDelegateService.AnonymousClass1.C11501.a aVar = this.f81804o;
        if (aVar != null) {
            DanmakuInputDelegateService danmakuInputDelegateService = aVar.f103669b;
            long jL = danmakuInputDelegateService.f103667a.L();
            Long lH = danmakuInputDelegateService.f103667a.h();
            long jLongValue = lH != null ? lH.longValue() : 0L;
            q<?> qVar = aVar.f103668a;
            long jL2 = qVar.f91144e.L();
            Long lH2 = qVar.f91144e.h();
            eVar = new qr0.e(jL, jLongValue, jL2, lH2 != null ? lH2.longValue() : 0L);
        } else {
            IPlayerContainer iPlayerContainer = this.f81791a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            long currentPosition = iPlayerContainer2.getPlayerCoreService().getCurrentPosition();
            IPlayerContainer iPlayerContainer3 = this.f81791a;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer3 = null;
            }
            long duration = iPlayerContainer3.getPlayerCoreService().getDuration();
            eVar = new qr0.e(currentPosition, duration, currentPosition, duration);
        }
        return eVar;
    }

    @Override // pr0.InterfaceC8347a
    public final void b(@NotNull CommandsDanmaku commandsDanmaku) {
        IPlayerContainer iPlayerContainer = this.f81791a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerCoreService().seekTo(commandsDanmaku.getProgress());
        com.bilibili.playerbizcommonv2.danmaku.input.g gVar = this.f81796f;
        if (gVar != null) {
            gVar.i();
        }
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f81791a = playerContainer;
    }

    @Override // qr0.b
    @Nullable
    public final PostPanelV2 d() {
        DanmakuTimerService danmakuTimerService = (DanmakuTimerService) this.f81794d.getService();
        return danmakuTimerService != null ? danmakuTimerService.f81212c : null;
    }

    @Override // pr0.InterfaceC8347a
    public final boolean e(@NotNull DanmakuSendParams danmakuSendParams) {
        IPlayerContainer iPlayerContainer = this.f81791a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        IInteractLayerService interactLayerService = iPlayerContainer2.getInteractLayerService();
        PlayerContainer playerContainer = this.f81791a;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        boolean zSendDanmaku = interactLayerService.sendDanmaku(playerContainer2.getContext(), DanmakuSendParams.copy$default(danmakuSendParams, (String) null, 0, 0, 0, "1", (String) null, false, 0, false, (Boolean) null, (Long) null, false, (String) null, (Integer) null, (Integer) null, 0L, 0L, 0L, (String) null, 524239, (Object) null));
        IPlayerContainer iPlayerContainer3 = this.f81791a;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        IPlayerSettingService playerSettingService = iPlayerContainer3.getPlayerSettingService();
        if (!playerSettingService.getBoolean("danmaku_danmaku_sent", false)) {
            playerSettingService.putBoolean("danmaku_danmaku_sent", true);
        }
        return zSendDanmaku;
    }

    @Override // qr0.b
    public final long f() {
        long cid;
        Video.DisplayParams displayParams;
        DanmakuInputDelegateService.AnonymousClass1.C11501.a aVar = this.f81804o;
        if (aVar != null) {
            cid = aVar.f103668a.f91142c;
        } else {
            IPlayerContainer iPlayerContainer = this.f81791a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            Video.PlayableParams currentPlayableParams = PlayerContainerKt.getPlayDirector(iPlayerContainer2).getCurrentPlayableParams();
            cid = (currentPlayableParams == null || (displayParams = currentPlayableParams.getDisplayParams()) == null) ? 0L : displayParams.getCid();
        }
        return cid;
    }

    @Override // pr0.InterfaceC8347a
    public final void g(@NotNull String str, @Nullable String str2) {
        this.f81801l = str2;
    }

    @Override // pr0.InterfaceC8347a
    public final boolean getBoolean(@NotNull String str, boolean z6) {
        IPlayerContainer iPlayerContainer = this.f81791a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        return iPlayerContainer2.getPlayerSettingService().getBoolean(str, z6);
    }

    @Override // qr0.b
    public final boolean getColorfulEnable() {
        return this.f81798i;
    }

    @Override // qr0.b
    @NotNull
    public final com.bilibili.playerbizcommonv2.service.a getDanmakuColorful() {
        com.bilibili.playerbizcommonv2.service.a aVar = this.f81797g;
        com.bilibili.playerbizcommonv2.service.a aVar2 = aVar;
        if (aVar == null) {
            aVar2 = new com.bilibili.playerbizcommonv2.service.a(false, 0L, null);
        }
        return aVar2;
    }

    @Override // qr0.b
    public final boolean j() {
        return this.f81792b;
    }

    @Override // pr0.InterfaceC8347a
    public final void l(@NotNull String str, @Nullable String str2) {
        this.f81803n = 0L;
        this.f81800k = str2;
    }

    @Override // pr0.InterfaceC8347a
    public final void n(@NotNull String str, @Nullable String str2) {
        this.f81802m = str2;
    }

    @Override // pr0.InterfaceC8347a
    public final void onInputWindowDismiss(@Nullable String str) {
        IPlayerContainer iPlayerContainer = this.f81791a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        LifecycleState lifecycleState = iPlayerContainer2.getActivityStateService().getLifecycleState();
        if (this.f81792b && lifecycleState == LifecycleState.ACTIVITY_RESUME) {
            IPlayerContainer iPlayerContainer3 = this.f81791a;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer3 = null;
            }
            iPlayerContainer3.getPlayerCoreService().resume();
        }
        this.f81792b = false;
    }

    @Override // pr0.InterfaceC8347a
    public final void onInputWindowShow() {
        Video.DanmakuResolveParams danmakuResolveParams;
        IPlayerContainer iPlayerContainer = this.f81791a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        Video.PlayableParams currentPlayableParams = PlayerContainerKt.getPlayDirector(iPlayerContainer2).getCurrentPlayableParams();
        if ((currentPlayableParams == null || (danmakuResolveParams = currentPlayableParams.getDanmakuResolveParams()) == null) ? false : danmakuResolveParams.isRealTime()) {
            return;
        }
        IPlayerContainer iPlayerContainer3 = this.f81791a;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        if (iPlayerContainer4.getPlayerCoreService().getState() == 4) {
            this.f81792b = true;
            IPlayerContainer iPlayerContainer5 = this.f81791a;
            if (iPlayerContainer5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer5 = null;
            }
            iPlayerContainer5.getPlayerCoreService().pause();
        }
    }

    public final void onStart(@Nullable PlayerSharingBundle playerSharingBundle) {
        IPlayerContainer iPlayerContainer = this.f81791a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        IPlayerServiceManager playerServiceManager = iPlayerContainer2.getPlayerServiceManager();
        PlayerServiceManager.ServiceDescriptor.Companion companion = PlayerServiceManager.ServiceDescriptor.Companion;
        playerServiceManager.bindService(companion.obtain(Er0.a.class), this.f81793c);
        IPlayerContainer iPlayerContainer3 = this.f81791a;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        iPlayerContainer4.getPlayerServiceManager().bindService(companion.obtain(DanmakuTimerService.class), this.f81794d);
        IPlayerContainer iPlayerContainer5 = this.f81791a;
        IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer6 = null;
        }
        PlayerContainerKt.getPlayDirector(iPlayerContainer6).addVideoDirectorObserver(this.f81805p);
        IPlayerContainer iPlayerContainer7 = this.f81791a;
        IPlayerContainer iPlayerContainer8 = iPlayerContainer7;
        if (iPlayerContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer8 = null;
        }
        iPlayerContainer8.getInteractLayerService().addDanmakuParamsChangedObserver(this.f81806q);
        IPlayerContainer iPlayerContainer9 = this.f81791a;
        IPlayerContainer iPlayerContainer10 = iPlayerContainer9;
        if (iPlayerContainer9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer10 = null;
        }
        iPlayerContainer10.getInteractLayerService().addDanmakuCommandPanelsObserver(this.f81807r);
        IPlayerContainer iPlayerContainer11 = this.f81791a;
        IPlayerContainer iPlayerContainer12 = iPlayerContainer11;
        if (iPlayerContainer11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer12 = null;
        }
        iPlayerContainer12.getControlContainerService().registerState(this.f81808s);
        PlayerContainer playerContainer = this.f81791a;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        ComponentCallbacks2 componentCallbacks2FindActivityOrNull = ContextUtilKt.findActivityOrNull(playerContainer2.getContext());
        LifecycleOwner lifecycleOwner = null;
        if (componentCallbacks2FindActivityOrNull instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) componentCallbacks2FindActivityOrNull;
        }
        if (lifecycleOwner != null) {
            Violet violet = Violet.INSTANCE;
            violet.ofChannel(AbstractC5109a.h.class).observeUnSticky(lifecycleOwner, this.f81809t);
            violet.ofChannel(AbstractC5109a.C0302a.class).observeUnSticky(lifecycleOwner, this.f81810u);
        }
        this.f81795e = new PlayerDanmakuExpressionView.a(new N(this, 2), new O(this, 2), new w(this, 2), new By0.N(this, 1));
    }

    public final void onStop() {
        this.f81795e = null;
        Violet violet = Violet.INSTANCE;
        violet.ofChannel(AbstractC5109a.h.class).removeObserver(this.f81809t);
        violet.ofChannel(AbstractC5109a.C0302a.class).removeObserver(this.f81810u);
        IPlayerContainer iPlayerContainer = this.f81791a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        PlayerContainerKt.getPlayDirector(iPlayerContainer2).removeVideoDirectorObserver(this.f81805p);
        IPlayerContainer iPlayerContainer3 = this.f81791a;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        iPlayerContainer4.getInteractLayerService().removeDanmakuParamsChangedObserver(this.f81806q);
        IPlayerContainer iPlayerContainer5 = this.f81791a;
        IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer6 = null;
        }
        iPlayerContainer6.getInteractLayerService().removeDanmakuCommandPanelsObserver(this.f81807r);
        IPlayerContainer iPlayerContainer7 = this.f81791a;
        IPlayerContainer iPlayerContainer8 = iPlayerContainer7;
        if (iPlayerContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer8 = null;
        }
        iPlayerContainer8.getControlContainerService().unregisterState(this.f81808s);
        IPlayerContainer iPlayerContainer9 = this.f81791a;
        IPlayerContainer iPlayerContainer10 = iPlayerContainer9;
        if (iPlayerContainer9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer10 = null;
        }
        IPlayerServiceManager playerServiceManager = iPlayerContainer10.getPlayerServiceManager();
        PlayerServiceManager.ServiceDescriptor.Companion companion = PlayerServiceManager.ServiceDescriptor.Companion;
        playerServiceManager.unbindService(companion.obtain(Er0.a.class), this.f81793c);
        IPlayerContainer iPlayerContainer11 = this.f81791a;
        if (iPlayerContainer11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer11 = null;
        }
        iPlayerContainer11.getPlayerServiceManager().unbindService(companion.obtain(DanmakuTimerService.class), this.f81794d);
    }

    @Override // qr0.b
    public final long p() {
        long avid;
        Video.DisplayParams displayParams;
        DanmakuInputDelegateService.AnonymousClass1.C11501.a aVar = this.f81804o;
        if (aVar != null) {
            avid = aVar.f103668a.f91141b;
        } else {
            IPlayerContainer iPlayerContainer = this.f81791a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            Video.PlayableParams currentPlayableParams = PlayerContainerKt.getPlayDirector(iPlayerContainer2).getCurrentPlayableParams();
            avid = (currentPlayableParams == null || (displayParams = currentPlayableParams.getDisplayParams()) == null) ? 0L : displayParams.getAvid();
        }
        return avid;
    }

    @Override // pr0.InterfaceC8347a
    public final void putBoolean(@NotNull String str, boolean z6) {
        IPlayerContainer iPlayerContainer = this.f81791a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerSettingService().putBoolean(str, z6);
    }

    @Override // pr0.InterfaceC8347a
    public final boolean r(int i7, @NotNull Map<String, ? extends Object> map) {
        IPlayerContainer iPlayerContainer = this.f81791a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        IInteractLayerService interactLayerService = iPlayerContainer2.getInteractLayerService();
        PlayerContainer playerContainer = this.f81791a;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer = null;
        }
        return interactLayerService.sendCommandDanmaku(playerContainer.getContext(), i7, map);
    }

    @Override // pr0.InterfaceC8347a
    public final void s(boolean z6) {
        com.bilibili.playerbizcommonv2.danmaku.input.g gVar;
        IPlayerContainer iPlayerContainer = this.f81791a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.danmaku-set.dm-order-list.click.player", new String[]{Constant.IN_KEY_LOCATION, "1"}));
        if (z6 || (gVar = this.f81796f) == null) {
            return;
        }
        gVar.i();
    }

    @Override // pr0.InterfaceC8347a
    public final void u(@NotNull com.bilibili.playerbizcommonv2.service.c cVar) {
        IPlayerContainer iPlayerContainer = this.f81791a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        BuildersKt.launch$default(tv.danmaku.biliplayerv2.c.a(iPlayerContainer2), (CoroutineContext) null, (CoroutineStart) null, new DanmakuInputWindowService$buyVipFromDanmakuColor$1(this, cVar, null), 3, (Object) null);
    }

    @Override // pr0.InterfaceC8347a
    public final void v(long j7) {
        this.f81803n = Long.valueOf(j7);
        this.f81800k = null;
    }

    @Override // pr0.InterfaceC8347a
    public final void z(@NotNull com.bilibili.playerbizcommonv2.service.b bVar) {
        Collections.SafeIteratorList<com.bilibili.playerbizcommonv2.service.b> safeIteratorList = this.h;
        if (safeIteratorList.contains(bVar)) {
            return;
        }
        safeIteratorList.add(bVar);
    }
}
