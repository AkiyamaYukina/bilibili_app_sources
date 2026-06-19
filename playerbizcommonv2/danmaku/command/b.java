package com.bilibili.playerbizcommonv2.danmaku.command;

import I3.C2207c1;
import WS0.s;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.gson.GsonKt;
import com.bilibili.playerbizcommonv2.danmaku.command.a;
import com.bilibili.playerbizcommonv2.danmaku.widget.w;
import com.bilibili.playerbizcommonv2.service.DanmakuInputWindowService;
import com.bilibili.playerbizcommonv2.view.RoundFrameLayout;
import ir0.C7612a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import mr0.f;
import mr0.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainerKt;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.router.PlayerRouteUris;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/command/b.class */
@StabilityInferred(parameters = 0)
public final class b extends AbsFunctionWidget {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Lazy<String> f80838d = LazyKt.lazy(new C2207c1(11));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f80839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public InteractDanmakuListWidget f80840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<DanmakuInputWindowService> f80841c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/command/b$a.class */
    public static final class a {
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.command.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/command/b$b.class */
    public static final class C0527b implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f80842a;

        public C0527b(b bVar) {
            this.f80842a = bVar;
        }

        @Override // com.bilibili.playerbizcommonv2.danmaku.command.a.b
        public final void H(CommandsDanmaku commandsDanmaku) {
            b bVar = this.f80842a;
            IPlayerContainer iPlayerContainer = bVar.f80839a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.danmaku-set.dm-order-list.delete.player", new String[0]));
            PlayerContainer playerContainer = bVar.f80839a;
            PlayerContainer playerContainer2 = playerContainer;
            if (playerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer2 = null;
            }
            if (BiliAccounts.get(playerContainer2.getContext()).isLogin()) {
                DanmakuInputWindowService danmakuInputWindowService = (DanmakuInputWindowService) bVar.f80841c.getService();
                if (danmakuInputWindowService != null) {
                    danmakuInputWindowService.O(commandsDanmaku, new g(bVar));
                    return;
                }
                return;
            }
            PlayerRouteUris.Routers routers = PlayerRouteUris.Routers.INSTANCE;
            PlayerContainer playerContainer3 = bVar.f80839a;
            if (playerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer3 = null;
            }
            PlayerRouteUris.Routers.login$default(routers, playerContainer3.getContext(), 0, (String) null, 4, (Object) null);
        }

        @Override // com.bilibili.playerbizcommonv2.danmaku.command.a.b
        public final void b(CommandsDanmaku commandsDanmaku) {
            b bVar = this.f80842a;
            IPlayerContainer iPlayerContainer = bVar.f80839a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getPlayerCoreService().seekTo(commandsDanmaku.getProgress());
            IPlayerContainer iPlayerContainer3 = bVar.f80839a;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer3 = null;
            }
            iPlayerContainer3.getFunctionWidgetService().hideWidget(bVar.getToken());
        }

        /* JADX WARN: Type inference failed for: r0v51, types: [Jr0.g$a, tv.danmaku.biliplayerv2.widget.AbsFunctionWidget$Configuration] */
        @Override // com.bilibili.playerbizcommonv2.danmaku.command.a.b
        public final void y(CommandsDanmaku commandsDanmaku) {
            IFunctionContainer.LayoutParams layoutParams;
            b bVar = this.f80842a;
            IPlayerContainer iPlayerContainer = bVar.f80839a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getFunctionWidgetService().hideWidget(bVar.getToken());
            PlayerContainer playerContainer = bVar.f80839a;
            PlayerContainer playerContainer2 = playerContainer;
            if (playerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer2 = null;
            }
            if (!BiliAccounts.get(playerContainer2.getContext()).isLogin()) {
                PlayerRouteUris.Routers routers = PlayerRouteUris.Routers.INSTANCE;
                PlayerContainer playerContainer3 = bVar.f80839a;
                if (playerContainer3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    playerContainer3 = null;
                }
                PlayerRouteUris.Routers.login$default(routers, playerContainer3.getContext(), 0, (String) null, 4, (Object) null);
                return;
            }
            IPlayerContainer iPlayerContainer3 = bVar.f80839a;
            IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer4 = null;
            }
            ScreenModeType screenModeType = iPlayerContainer4.getControlContainerService().getScreenModeType();
            Lazy<String> lazy = b.f80838d;
            if (((String) lazy.getValue()).length() <= 0) {
                ScreenModeType screenModeType2 = ScreenModeType.VERTICAL_FULLSCREEN;
                if (screenModeType == screenModeType2) {
                    PlayerContainer playerContainer4 = bVar.f80839a;
                    PlayerContainer playerContainer5 = playerContainer4;
                    if (playerContainer4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                        playerContainer5 = null;
                    }
                    layoutParams = new IFunctionContainer.LayoutParams(-1, (int) DpUtils.dp2px(playerContainer5.getContext(), 380.0f));
                } else {
                    PlayerContainer playerContainer6 = bVar.f80839a;
                    PlayerContainer playerContainer7 = playerContainer6;
                    if (playerContainer6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                        playerContainer7 = null;
                    }
                    layoutParams = new IFunctionContainer.LayoutParams((int) DpUtils.dp2px(playerContainer7.getContext(), 320.0f), -1);
                }
                layoutParams.setLayoutType(screenModeType == screenModeType2 ? 8 : 4);
                IPlayerContainer iPlayerContainer5 = bVar.f80839a;
                IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
                if (iPlayerContainer5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer6 = null;
                }
                FunctionWidgetToken functionWidgetTokenShowWidget = iPlayerContainer6.getFunctionWidgetService().showWidget(Jr0.g.class, layoutParams);
                if (functionWidgetTokenShowWidget == null) {
                    return;
                }
                ?? configuration = new AbsFunctionWidget.Configuration();
                configuration.f11669a = commandsDanmaku;
                configuration.f11670b = 3;
                IPlayerContainer iPlayerContainer7 = bVar.f80839a;
                if (iPlayerContainer7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer7 = null;
                }
                iPlayerContainer7.getFunctionWidgetService().updateFunctionWidgetConfiguration(functionWidgetTokenShowWidget, (AbsFunctionWidget.Configuration) configuration);
                return;
            }
            PlayerContainer playerContainer8 = bVar.f80839a;
            PlayerContainer playerContainer9 = playerContainer8;
            if (playerContainer8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer9 = null;
            }
            IFunctionContainer.LayoutParams layoutParamsA = C7612a.a(playerContainer9.getContext(), screenModeType);
            layoutParamsA.touchEnable(true);
            IPlayerContainer iPlayerContainer8 = bVar.f80839a;
            IPlayerContainer iPlayerContainer9 = iPlayerContainer8;
            if (iPlayerContainer8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer9 = null;
            }
            FunctionWidgetToken functionWidgetTokenShowWidget2 = iPlayerContainer9.getFunctionWidgetService().showWidget(w.class, layoutParamsA);
            if (functionWidgetTokenShowWidget2 == null) {
                return;
            }
            IPlayerContainer iPlayerContainer10 = bVar.f80839a;
            IPlayerContainer iPlayerContainer11 = iPlayerContainer10;
            if (iPlayerContainer10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer11 = null;
            }
            Video.PlayableParams currentPlayableParams = PlayerContainerKt.getPlayDirector(iPlayerContainer11).getCurrentPlayableParams();
            Video.ReportCommonParams reportCommonParams = currentPlayableParams != null ? currentPlayableParams.getReportCommonParams() : null;
            Pair pair = TuplesKt.to("aid", String.valueOf(reportCommonParams != null ? reportCommonParams.getAvid() : 0L));
            Pair pair2 = TuplesKt.to("cid", String.valueOf(commandsDanmaku.getOid()));
            String content = commandsDanmaku.getContent();
            String str = content;
            if (content == null) {
                str = "";
            }
            Pair pair3 = TuplesKt.to("dmcontent", str);
            Pair pair4 = TuplesKt.to("dmid", String.valueOf(commandsDanmaku.getId()));
            IPlayerContainer iPlayerContainer12 = bVar.f80839a;
            IPlayerContainer iPlayerContainer13 = iPlayerContainer12;
            if (iPlayerContainer12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer13 = null;
            }
            Video.PlayableParams currentPlayableParams2 = PlayerContainerKt.getPlayDirector(iPlayerContainer13).getCurrentPlayableParams();
            Video.ReportCommonParams reportCommonParams2 = currentPlayableParams2 != null ? currentPlayableParams2.getReportCommonParams() : null;
            String spmid = reportCommonParams2 != null ? reportCommonParams2.getSpmid() : null;
            if (spmid == null) {
                spmid = "";
            }
            w.a aVar = new w.a(B0.a.a((String) lazy.getValue(), "/?report_cfg=", Uri.encode(GsonKt.toJsonString(MapsKt.mapOf(new Pair[]{pair, pair2, pair3, pair4, TuplesKt.to("from_spmid", spmid), TuplesKt.to("scene", screenModeType == ScreenModeType.VERTICAL_FULLSCREEN ? "vertical_player" : "player"), TuplesKt.to("dmuid", String.valueOf(commandsDanmaku.getMid())), TuplesKt.to("biz_from", "command")})))), false, true, true, new s(bVar, 4));
            IPlayerContainer iPlayerContainer14 = bVar.f80839a;
            if (iPlayerContainer14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer14 = null;
            }
            iPlayerContainer14.getFunctionWidgetService().updateFunctionWidgetConfiguration(functionWidgetTokenShowWidget2, aVar);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/command/b$c.class */
    public static final class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f80843a;

        public c(b bVar) {
            this.f80843a = bVar;
        }

        @Override // mr0.f
        public final void onCloseClick() {
            b bVar = this.f80843a;
            IPlayerContainer iPlayerContainer = bVar.f80839a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getFunctionWidgetService().hideWidget(bVar.getToken());
        }
    }

    public b(@NotNull Context context) {
        super(context);
        this.f80841c = new PlayerServiceManager.Client<>();
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f80839a = playerContainer;
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131496600, (ViewGroup) null);
        RoundFrameLayout roundFrameLayout = (RoundFrameLayout) viewInflate.findViewById(2131321687);
        if (roundFrameLayout != null) {
            roundFrameLayout.setRadius(0.0f);
        }
        this.f80840b = (InteractDanmakuListWidget) viewInflate.findViewById(2131303785);
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
        com.bilibili.playerbizcommonv2.danmaku.command.a aVar;
        super.onWidgetDismiss();
        InteractDanmakuListWidget interactDanmakuListWidget = this.f80840b;
        if (interactDanmakuListWidget != null && (aVar = interactDanmakuListWidget.f80828d) != null) {
            aVar.f80830a.clear();
            aVar.notifyDataSetChanged();
        }
        IPlayerContainer iPlayerContainer = this.f80839a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerServiceManager().unbindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(DanmakuInputWindowService.class), this.f80841c);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onWidgetShow(@org.jetbrains.annotations.Nullable tv.danmaku.biliplayerv2.widget.AbsFunctionWidget.Configuration r7) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.command.b.onWidgetShow(tv.danmaku.biliplayerv2.widget.AbsFunctionWidget$Configuration):void");
    }
}
