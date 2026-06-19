package com.bilibili.playerbizcommon.features.danmaku;

import EG0.i;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.playerbizcommon.features.danmaku.a;
import com.bilibili.playerbizcommon.features.danmaku.input.DanmakuInputWindowService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oq0.f;
import oq0.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.router.PlayerRouteUris;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/c.class */
public final class c extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f79649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public InteractDanmakuListWidget f79650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<DanmakuInputWindowService> f79651c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/c$a.class */
    public static final class a implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f79652a;

        public a(c cVar) {
            this.f79652a = cVar;
        }

        @Override // com.bilibili.playerbizcommon.features.danmaku.a.b
        public final void H(CommandsDanmaku commandsDanmaku) {
            c cVar = this.f79652a;
            IPlayerContainer iPlayerContainer = cVar.f79649a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.danmaku-set.dm-order-list.delete.player", new String[0]));
            PlayerContainer playerContainer = cVar.f79649a;
            PlayerContainer playerContainer2 = playerContainer;
            if (playerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer2 = null;
            }
            if (BiliAccounts.get(playerContainer2.getContext()).isLogin()) {
                DanmakuInputWindowService danmakuInputWindowService = (DanmakuInputWindowService) cVar.f79651c.getService();
                if (danmakuInputWindowService != null) {
                    danmakuInputWindowService.c(commandsDanmaku, new i(cVar));
                    return;
                }
                return;
            }
            PlayerRouteUris.Routers routers = PlayerRouteUris.Routers.INSTANCE;
            PlayerContainer playerContainer3 = cVar.f79649a;
            if (playerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer3 = null;
            }
            PlayerRouteUris.Routers.login$default(routers, playerContainer3.getContext(), 0, (String) null, 4, (Object) null);
        }

        @Override // com.bilibili.playerbizcommon.features.danmaku.a.b
        public final void b(CommandsDanmaku commandsDanmaku) {
            c cVar = this.f79652a;
            IPlayerContainer iPlayerContainer = cVar.f79649a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getPlayerCoreService().seekTo(commandsDanmaku.getProgress());
            IPlayerContainer iPlayerContainer3 = cVar.f79649a;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer3 = null;
            }
            iPlayerContainer3.getFunctionWidgetService().hideWidget(cVar.getToken());
        }

        /* JADX WARN: Type inference failed for: r0v45, types: [com.bilibili.playerbizcommon.features.danmaku.b$a, tv.danmaku.biliplayerv2.widget.AbsFunctionWidget$Configuration] */
        @Override // com.bilibili.playerbizcommon.features.danmaku.a.b
        public final void y(CommandsDanmaku commandsDanmaku) {
            IFunctionContainer.LayoutParams layoutParams;
            c cVar = this.f79652a;
            IPlayerContainer iPlayerContainer = cVar.f79649a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getFunctionWidgetService().hideWidget(cVar.getToken());
            PlayerContainer playerContainer = cVar.f79649a;
            PlayerContainer playerContainer2 = playerContainer;
            if (playerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer2 = null;
            }
            if (!BiliAccounts.get(playerContainer2.getContext()).isLogin()) {
                PlayerRouteUris.Routers routers = PlayerRouteUris.Routers.INSTANCE;
                PlayerContainer playerContainer3 = cVar.f79649a;
                if (playerContainer3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    playerContainer3 = null;
                }
                PlayerRouteUris.Routers.login$default(routers, playerContainer3.getContext(), 0, (String) null, 4, (Object) null);
                return;
            }
            IPlayerContainer iPlayerContainer3 = cVar.f79649a;
            IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer4 = null;
            }
            ScreenModeType screenModeType = iPlayerContainer4.getControlContainerService().getScreenModeType();
            ScreenModeType screenModeType2 = ScreenModeType.VERTICAL_FULLSCREEN;
            if (screenModeType == screenModeType2) {
                PlayerContainer playerContainer4 = cVar.f79649a;
                PlayerContainer playerContainer5 = playerContainer4;
                if (playerContainer4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    playerContainer5 = null;
                }
                layoutParams = new IFunctionContainer.LayoutParams(-1, (int) DpUtils.dp2px(playerContainer5.getContext(), 380.0f));
            } else {
                PlayerContainer playerContainer6 = cVar.f79649a;
                PlayerContainer playerContainer7 = playerContainer6;
                if (playerContainer6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    playerContainer7 = null;
                }
                layoutParams = new IFunctionContainer.LayoutParams((int) DpUtils.dp2px(playerContainer7.getContext(), 320.0f), -1);
            }
            layoutParams.setLayoutType(screenModeType == screenModeType2 ? 8 : 4);
            IPlayerContainer iPlayerContainer5 = cVar.f79649a;
            IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
            if (iPlayerContainer5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer6 = null;
            }
            FunctionWidgetToken functionWidgetTokenShowWidget = iPlayerContainer6.getFunctionWidgetService().showWidget(com.bilibili.playerbizcommon.features.danmaku.b.class, layoutParams);
            if (functionWidgetTokenShowWidget == null) {
                return;
            }
            ?? configuration = new AbsFunctionWidget.Configuration();
            configuration.f79647a = commandsDanmaku;
            configuration.f79648b = 3;
            IPlayerContainer iPlayerContainer7 = cVar.f79649a;
            if (iPlayerContainer7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer7 = null;
            }
            iPlayerContainer7.getFunctionWidgetService().updateFunctionWidgetConfiguration(functionWidgetTokenShowWidget, (AbsFunctionWidget.Configuration) configuration);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/c$b.class */
    public static final class b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f79653a;

        public b(c cVar) {
            this.f79653a = cVar;
        }

        @Override // oq0.k
        public final void onCloseClick() {
            c cVar = this.f79653a;
            IPlayerContainer iPlayerContainer = cVar.f79649a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getFunctionWidgetService().hideWidget(cVar.getToken());
        }
    }

    public c(@NotNull Context context) {
        super(context);
        this.f79651c = new PlayerServiceManager.Client<>();
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f79649a = playerContainer;
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131496387, (ViewGroup) null);
        this.f79650b = (InteractDanmakuListWidget) viewInflate.findViewById(2131303785);
        return viewInflate;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builder = new FunctionWidgetConfig.Builder();
        builder.dismissWhenActivityStop(true);
        builder.dismissWhenScreenModeChange(true);
        builder.dismissWhenVideoChange(true);
        builder.dismissWhenVideoCompleted(true);
        builder.changeOrientationDisableWhenShow(true);
        builder.persistent(true);
        return builder.build();
    }

    @NotNull
    public final String getTag() {
        return "PlayerCommandDanmakuListFunctionWidget";
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        com.bilibili.playerbizcommon.features.danmaku.a aVar;
        super.onWidgetDismiss();
        InteractDanmakuListWidget interactDanmakuListWidget = this.f79650b;
        if (interactDanmakuListWidget != null && (aVar = interactDanmakuListWidget.f79627d) != null) {
            aVar.f79629a.clear();
            aVar.notifyDataSetChanged();
        }
        IPlayerContainer iPlayerContainer = this.f79649a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerServiceManager().unbindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(DanmakuInputWindowService.class), this.f79651c);
    }

    public final void onWidgetShow(@Nullable AbsFunctionWidget.Configuration configuration) {
        InteractDanmakuListWidget interactDanmakuListWidget;
        super.onWidgetShow(configuration);
        IPlayerContainer iPlayerContainer = this.f79649a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerServiceManager().bindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(DanmakuInputWindowService.class), this.f79651c);
        f fVar = configuration instanceof f ? (f) configuration : null;
        if (fVar != null && (interactDanmakuListWidget = this.f79650b) != null) {
            interactDanmakuListWidget.setBackButtonVisible(fVar.f124891a);
        }
        IPlayerContainer iPlayerContainer3 = this.f79649a;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        IRemoteHandler remoteHandler = iPlayerContainer4.getInteractLayerService().getRemoteHandler();
        List<CommandsDanmaku> commandDanmakus = null;
        if (remoteHandler != null) {
            commandDanmakus = remoteHandler.getCommandDanmakus();
        }
        InteractDanmakuListWidget interactDanmakuListWidget2 = this.f79650b;
        if (interactDanmakuListWidget2 != null) {
            interactDanmakuListWidget2.setCommandDmOperationCallback(new a(this));
        }
        InteractDanmakuListWidget interactDanmakuListWidget3 = this.f79650b;
        if (interactDanmakuListWidget3 != null) {
            interactDanmakuListWidget3.setData(commandDanmakus);
        }
        InteractDanmakuListWidget interactDanmakuListWidget4 = this.f79650b;
        if (interactDanmakuListWidget4 != null) {
            interactDanmakuListWidget4.setActionCallback(new b(this));
        }
    }
}
