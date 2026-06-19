package com.bilibili.playerbizcommon.features.danmaku.input;

import android.content.ComponentCallbacks2;
import androidx.compose.foundation.Q;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import bi0.AbstractC5109a;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.alipay.blueshield.IDeviceColorModule;
import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import com.bilibili.bus.Violet;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.service.AccessToken;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.ServicesProvider;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playerbizcommon.features.delegate.DelegateStoreService;
import com.bilibili.playerbizcommon.input.panels.InteractDanmakuListPanel;
import com.bilibili.playerbizcommon.view.DanmakuExpressionView;
import java.util.Map;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import se0.k;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.collection.Collections;
import tv.danmaku.biliplayerv2.router.PlayerRouteUris;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.CurrentVideoPointer;
import tv.danmaku.biliplayerv2.service.IPlayerService;
import tv.danmaku.biliplayerv2.service.IPlayerServiceManager;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;
import tv.danmaku.biliplayerv2.service.LifecycleState;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.biz.DanmakuCommandPanelsObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.IDanmakuParamsChangeObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.VideoDetailStateChange;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.service.interact.core.api.InteractApiService;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;
import tv.danmaku.biliplayerv2.service.interact.core.model.DanmakuParams;
import tv.danmaku.biliplayerv2.service.interact.core.sender.DanmakuSendParams;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/input/DanmakuInputWindowService.class */
public final class DanmakuInputWindowService implements IPlayerService, Qq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f79654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f79655b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public DanmakuExpressionView.a f79658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public com.bilibili.playerbizcommon.playerinput.a f79659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public com.bilibili.playerbizcommon.features.danmaku.input.a f79660g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<DelegateStoreService> f79656c = new PlayerServiceManager.Client<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<pq0.c> f79657d = new PlayerServiceManager.Client<>();
    public final Collections.SafeIteratorList<com.bilibili.playerbizcommon.features.danmaku.input.b> h = Q.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f79661i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final e f79662j = new e(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final b f79663k = new b(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final a f79664l = new a(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final d f79665m = new d(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommon.features.danmaku.input.e f79666n = new Observer(this) { // from class: com.bilibili.playerbizcommon.features.danmaku.input.e

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DanmakuInputWindowService f79686a;

        {
            this.f79686a = this;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            AbstractC5109a.h hVar = (AbstractC5109a.h) obj;
            VideoDetailStateChange.Request request = new VideoDetailStateChange.Request();
            VideoDetailStateChange.VoteState voteState = new VideoDetailStateChange.VoteState();
            voteState.setVoteId(hVar.f56605a);
            voteState.setOptionIndex(Integer.valueOf(hVar.f56606b));
            request.setVoteState(voteState);
            IPlayerContainer iPlayerContainer = this.f79686a.f79654a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            IRemoteHandler remoteHandler = iPlayerContainer2.getInteractLayerService().getRemoteHandler();
            if (remoteHandler != null) {
                remoteHandler.onVideoDetailStateChanged(request);
            }
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/input/DanmakuInputWindowService$a.class */
    public static final class a implements DanmakuCommandPanelsObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DanmakuInputWindowService f79667a;

        public a(DanmakuInputWindowService danmakuInputWindowService) {
            this.f79667a = danmakuInputWindowService;
        }

        public final void onDataSetChanged(CommandsPanel commandsPanel) {
            com.bilibili.playerbizcommon.playerinput.a aVar = this.f79667a.f79659f;
            if (aVar != null) {
                Cq0.b.t(aVar, commandsPanel, null, null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_TARGET_IMAGE);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/input/DanmakuInputWindowService$b.class */
    public static final class b implements IDanmakuParamsChangeObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DanmakuInputWindowService f79668a;

        public b(DanmakuInputWindowService danmakuInputWindowService) {
            this.f79668a = danmakuInputWindowService;
        }

        public final void onChanged(DanmakuParams danmakuParams) {
            com.bilibili.playerbizcommon.playerinput.a aVar = this.f79668a.f79659f;
            if (aVar != null) {
                Cq0.b.t(aVar, null, danmakuParams.getDmViewReply(), null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_SEGMENT_USE_TEMPERATURE);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.danmaku.input.DanmakuInputWindowService$buyVipFromDanmakuColor$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/input/DanmakuInputWindowService$buyVipFromDanmakuColor$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.playerbizcommon.features.danmaku.input.c $params;
        Object L$0;
        Object L$1;
        int label;
        final DanmakuInputWindowService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.playerbizcommon.features.danmaku.input.c cVar, DanmakuInputWindowService danmakuInputWindowService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$params = cVar;
            this.this$0 = danmakuInputWindowService;
        }

        @JvmStatic
        @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "getServices", owner = {"com.bilibili.lib.blrouter.BLRouter"})
        @NotNull
        private static <T> ServicesProvider<T> __Ghost$Insertion$com_bilibili_gripper_router_aop_RouterHook_getServices(@NotNull BLRouter bLRouter, @NotNull Class<T> cls) {
            o00.a.a();
            return bLRouter.getServices(cls);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(DanmakuInputWindowService danmakuInputWindowService, com.bilibili.playerbizcommon.features.danmaku.input.c cVar, Ref.BooleanRef booleanRef) {
            IPlayerContainer iPlayerContainer = danmakuInputWindowService.f79654a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            if (iPlayerContainer2.getControlContainerService().getScreenModeType() == ScreenModeType.LANDSCAPE_FULLSCREEN) {
                cVar.f79681e.invoke();
                booleanRef.element = cVar.f79679c;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(Result result, DanmakuInputWindowService danmakuInputWindowService, com.bilibili.playerbizcommon.features.danmaku.input.b bVar) {
            boolean z6 = Result.isSuccess-impl(result.unbox-impl());
            com.bilibili.playerbizcommon.features.danmaku.input.a aVar = danmakuInputWindowService.f79660g;
            bVar.a(aVar != null ? aVar.f79675b : 0L, z6);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$params, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:132:0x03b0  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x03ce  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x020d  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x028d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 1047
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.danmaku.input.DanmakuInputWindowService.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/input/DanmakuInputWindowService$c.class */
    public static final class c extends BiliApiDataCallback<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.bilibili.playerbizcommon.input.panels.c f79669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CommandsDanmaku f79670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DanmakuInputWindowService f79671d;

        public c(com.bilibili.playerbizcommon.input.panels.c cVar, CommandsDanmaku commandsDanmaku, DanmakuInputWindowService danmakuInputWindowService) {
            this.f79669b = cVar;
            this.f79670c = commandsDanmaku;
            this.f79671d = danmakuInputWindowService;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(String str) {
            com.bilibili.playerbizcommon.input.panels.c cVar = this.f79669b;
            CommandsDanmaku commandsDanmaku = this.f79670c;
            cVar.b(commandsDanmaku);
            IPlayerContainer iPlayerContainer = this.f79671d.f79654a;
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
            this.f79669b.a(th);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/input/DanmakuInputWindowService$d.class */
    public static final class d implements ControlContainerObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DanmakuInputWindowService f79672a;

        public d(DanmakuInputWindowService danmakuInputWindowService) {
            this.f79672a = danmakuInputWindowService;
        }

        public final void onControlContainerChanged(ControlContainerType controlContainerType, ScreenModeType screenModeType) {
            com.bilibili.playerbizcommon.playerinput.a aVar = this.f79672a.f79659f;
            if (aVar != null) {
                aVar.i();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/input/DanmakuInputWindowService$e.class */
    public static final class e implements IVideosPlayDirectorService.VideoPlayEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DanmakuInputWindowService f79673a;

        public e(DanmakuInputWindowService danmakuInputWindowService) {
            this.f79673a = danmakuInputWindowService;
        }

        public final void onVideoItemWillChange(CurrentVideoPointer currentVideoPointer, CurrentVideoPointer currentVideoPointer2, Video video) {
            DanmakuInputWindowService danmakuInputWindowService = this.f79673a;
            danmakuInputWindowService.f79659f = null;
            com.bilibili.playerbizcommon.features.danmaku.input.a aVar = danmakuInputWindowService.f79660g;
            if (aVar != null) {
                aVar.f79676c = null;
            }
        }
    }

    @Override // Qq0.a
    public final void C(boolean z6) {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.dm-send.up-checkbox.0.player", new String[]{"upcheckbox", z6 ? "1" : "0", "danmaku_type", z6 ? "1" : "0"}));
    }

    @Override // Qq0.a
    public final void D(@NotNull String str) {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.player.dm-send.color.player", new String[]{"is_locked", "1", "new_ui", "1", "color", str}));
    }

    @Override // Qq0.a
    public final boolean E() {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        return iPlayerContainer2.getPlayerSettingService().getBoolean("danmaku_support_box_checked_by_user", true);
    }

    @Override // Qq0.a
    public final void G() {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        IPlayerSettingService playerSettingService = iPlayerContainer2.getPlayerSettingService();
        if (playerSettingService.getBoolean("danmaku_danmaku_sent", false)) {
            return;
        }
        playerSettingService.putBoolean("danmaku_danmaku_sent", true);
    }

    @Override // Qq0.a
    public final void O() {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.dm-send.dm-order.commit.player", new String[0]));
    }

    @Override // Qq0.a
    public final void P() {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.player.dm-send.dm-clear.player", new String[0]));
    }

    @Override // Qq0.a
    public final void R(int i7) {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.dm-send.dm-order.order-click.player", new String[]{"danmaku_type", String.valueOf(i7)}));
    }

    @Override // Qq0.a
    public final void T() {
        com.bilibili.playerbizcommon.playerinput.a aVar = this.f79659f;
        if (aVar != null) {
            aVar.i();
        }
        PlayerContainer playerContainer = this.f79654a;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams((int) DpUtils.dp2px(playerContainer2.getContext(), 400.0f), -1);
        layoutParams.setLayoutType(4);
        IPlayerContainer iPlayerContainer = this.f79654a;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer = null;
        }
        iPlayerContainer.getFunctionWidgetService().showWidget(com.bilibili.playerbizcommon.features.danmaku.c.class, layoutParams, new oq0.f(0));
    }

    @Override // Qq0.a
    public final void Z(@NotNull String str) {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.player.dm-send.recommender-click.player", new String[]{"recommender", str}));
    }

    @Override // Qq0.a
    @NotNull
    public final Rq0.d a() {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        long currentPosition = iPlayerContainer2.getPlayerCoreService().getCurrentPosition();
        IPlayerContainer iPlayerContainer3 = this.f79654a;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        return new Rq0.d(currentPosition, iPlayerContainer3.getPlayerCoreService().getDuration());
    }

    @Override // Qq0.a
    public final void addDanmakuColorfulEnableObserver(@NotNull com.bilibili.playerbizcommon.features.danmaku.input.b bVar) {
        Collections.SafeIteratorList<com.bilibili.playerbizcommon.features.danmaku.input.b> safeIteratorList = this.h;
        if (safeIteratorList.contains(bVar)) {
            return;
        }
        safeIteratorList.add(bVar);
    }

    @Override // Qq0.a
    public final void b(@NotNull CommandsDanmaku commandsDanmaku) {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerCoreService().seekTo(commandsDanmaku.getProgress());
        com.bilibili.playerbizcommon.playerinput.a aVar = this.f79659f;
        if (aVar != null) {
            aVar.i();
        }
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f79654a = playerContainer;
    }

    @Override // Qq0.a
    public final void buyVipFromDanmakuColor(@NotNull com.bilibili.playerbizcommon.features.danmaku.input.c cVar) {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        BuildersKt.launch$default(tv.danmaku.biliplayerv2.c.a(iPlayerContainer2), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(cVar, this, null), 3, (Object) null);
    }

    public final void c(@NotNull CommandsDanmaku commandsDanmaku, @Nullable com.bilibili.playerbizcommon.input.panels.c cVar) {
        String accessKey;
        Video.DisplayParams displayParams;
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.danmaku-set.dm-order-list.delete.player", new String[0]));
        PlayerContainer playerContainer = this.f79654a;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        if (!BiliAccounts.get(playerContainer2.getContext()).isLogin()) {
            PlayerRouteUris.Routers routers = PlayerRouteUris.Routers.INSTANCE;
            PlayerContainer playerContainer3 = this.f79654a;
            if (playerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer3 = null;
            }
            PlayerRouteUris.Routers.login$default(routers, playerContainer3.getContext(), 0, (String) null, 4, (Object) null);
            return;
        }
        PlayerContainer playerContainer4 = this.f79654a;
        PlayerContainer playerContainer5 = playerContainer4;
        if (playerContainer4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer5 = null;
        }
        AccessToken accessToken = BiliAccounts.get(playerContainer5.getContext()).getAccessToken();
        if (accessToken == null || (accessKey = accessToken.getAccessKey()) == null) {
            return;
        }
        IPlayerContainer iPlayerContainer3 = this.f79654a;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        Video.PlayableParams currentPlayableParams = iPlayerContainer3.getVideoPlayDirectorService().getCurrentPlayableParams();
        if (currentPlayableParams == null || (displayParams = currentPlayableParams.getDisplayParams()) == null) {
            return;
        }
        ((InteractApiService) ServiceGenerator.createService(InteractApiService.class)).deleteCommandDanmaku(accessKey, String.valueOf(displayParams.getAvid()), String.valueOf(displayParams.getCid()), "2", String.valueOf(commandsDanmaku.getId())).enqueue(new c(cVar, commandsDanmaku, this));
    }

    @Override // Qq0.a
    @Nullable
    public final PostPanelV2 d() {
        pq0.c cVar = (pq0.c) this.f79657d.getService();
        return cVar != null ? cVar.f125562b : null;
    }

    @Override // Qq0.a
    public final boolean d0() {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        return iPlayerContainer2.getPlayerSettingService().getBoolean("danmaku_danmaku_sent", false);
    }

    @Override // Qq0.a
    public final boolean e(@NotNull DanmakuSendParams danmakuSendParams) {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        IInteractLayerService interactLayerService = iPlayerContainer2.getInteractLayerService();
        PlayerContainer playerContainer = this.f79654a;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer = null;
        }
        return interactLayerService.sendDanmaku(playerContainer.getContext(), DanmakuSendParams.copy$default(danmakuSendParams, (String) null, 0, 0, 0, "1", (String) null, false, 0, false, (Boolean) null, (Long) null, false, (String) null, (Integer) null, (Integer) null, 0L, 0L, 0L, (String) null, 524239, (Object) null));
    }

    @Override // Qq0.a
    public final long f() {
        Video.DisplayParams displayParams;
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        Video.PlayableParams currentPlayableParams = iPlayerContainer2.getVideoPlayDirectorService().getCurrentPlayableParams();
        return (currentPlayableParams == null || (displayParams = currentPlayableParams.getDisplayParams()) == null) ? 0L : displayParams.getCid();
    }

    @Override // Qq0.a
    public final void g(@NotNull String str, @Nullable String str2) {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.player.dm-send.size.player", new String[]{"is_locked", "1", "new_ui", "1", TextSource.CFG_SIZE, str}));
    }

    @Override // Qq0.a
    public final boolean getColorfulEnable() {
        return this.f79661i;
    }

    @Override // Qq0.a
    @NotNull
    public final com.bilibili.playerbizcommon.features.danmaku.input.a getDanmakuColorful() {
        com.bilibili.playerbizcommon.features.danmaku.input.a aVar = this.f79660g;
        com.bilibili.playerbizcommon.features.danmaku.input.a aVar2 = aVar;
        if (aVar == null) {
            aVar2 = new com.bilibili.playerbizcommon.features.danmaku.input.a(false, 0L, null);
        }
        return aVar2;
    }

    @Override // Qq0.a
    public final void h0() {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.dm-send.dm-order.tab-click.player", new String[0]));
    }

    @Override // Qq0.a
    public final boolean j() {
        return this.f79655b;
    }

    @Override // Qq0.a
    public final void l(@NotNull String str, @Nullable String str2) {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.player.dm-send.color.player", new String[]{"is_locked", "1", "new_ui", "1", "color", str}));
    }

    @Override // Qq0.a
    public final void n(@NotNull String str, @Nullable String str2) {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.player.dm-send.mode.player", new String[]{"is_locked", "1", "new_ui", "1", IDeviceColorModule.EDGE_MODE_KEY, str}));
    }

    @Override // Qq0.a
    public final void o() {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.dm-send.send-set.0.player", new String[0]));
    }

    @Override // Qq0.a
    public final void onInputWindowDismiss(@Nullable String str) {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        LifecycleState lifecycleState = iPlayerContainer2.getActivityStateService().getLifecycleState();
        if (this.f79655b && lifecycleState == LifecycleState.ACTIVITY_RESUME) {
            IPlayerContainer iPlayerContainer3 = this.f79654a;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer3 = null;
            }
            iPlayerContainer3.getPlayerCoreService().resume();
        }
        this.f79655b = false;
    }

    @Override // Qq0.a
    public final void onInputWindowShow() {
        Video.DanmakuResolveParams danmakuResolveParams;
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        Video.PlayableParams currentPlayableParams = iPlayerContainer2.getVideoPlayDirectorService().getCurrentPlayableParams();
        if ((currentPlayableParams == null || (danmakuResolveParams = currentPlayableParams.getDanmakuResolveParams()) == null) ? false : danmakuResolveParams.isRealTime()) {
            return;
        }
        IPlayerContainer iPlayerContainer3 = this.f79654a;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        if (iPlayerContainer4.getPlayerCoreService().getState() == 4) {
            this.f79655b = true;
            IPlayerContainer iPlayerContainer5 = this.f79654a;
            if (iPlayerContainer5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer5 = null;
            }
            iPlayerContainer5.getPlayerCoreService().pause();
        }
    }

    public final void onStart(@Nullable PlayerSharingBundle playerSharingBundle) {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        IPlayerServiceManager playerServiceManager = iPlayerContainer2.getPlayerServiceManager();
        PlayerServiceManager.ServiceDescriptor.Companion companion = PlayerServiceManager.ServiceDescriptor.Companion;
        playerServiceManager.bindService(companion.obtain(DelegateStoreService.class), this.f79656c);
        IPlayerContainer iPlayerContainer3 = this.f79654a;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        iPlayerContainer4.getPlayerServiceManager().bindService(companion.obtain(pq0.c.class), this.f79657d);
        IPlayerContainer iPlayerContainer5 = this.f79654a;
        IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer6 = null;
        }
        iPlayerContainer6.getVideoPlayDirectorService().addVideoPlayEventListener(this.f79662j);
        IPlayerContainer iPlayerContainer7 = this.f79654a;
        IPlayerContainer iPlayerContainer8 = iPlayerContainer7;
        if (iPlayerContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer8 = null;
        }
        iPlayerContainer8.getInteractLayerService().addDanmakuParamsChangedObserver(this.f79663k);
        IPlayerContainer iPlayerContainer9 = this.f79654a;
        IPlayerContainer iPlayerContainer10 = iPlayerContainer9;
        if (iPlayerContainer9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer10 = null;
        }
        iPlayerContainer10.getInteractLayerService().addDanmakuCommandPanelsObserver(this.f79664l);
        IPlayerContainer iPlayerContainer11 = this.f79654a;
        IPlayerContainer iPlayerContainer12 = iPlayerContainer11;
        if (iPlayerContainer11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer12 = null;
        }
        iPlayerContainer12.getControlContainerService().registerState(this.f79665m);
        PlayerContainer playerContainer = this.f79654a;
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
            Violet.INSTANCE.ofChannel(AbstractC5109a.h.class).observeUnSticky(lifecycleOwner, this.f79666n);
        }
        this.f79658e = new DanmakuExpressionView.a(new Oa.g(this, 4), new X61.g(this, 3), new BS0.a(this, 5), new Hf.e(this, 5));
    }

    public final void onStop() {
        this.f79658e = null;
        Violet.INSTANCE.ofChannel(AbstractC5109a.h.class).removeObserver(this.f79666n);
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getVideoPlayDirectorService().removeVideoPlayEventListener(this.f79662j);
        IPlayerContainer iPlayerContainer3 = this.f79654a;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        iPlayerContainer4.getInteractLayerService().removeDanmakuParamsChangedObserver(this.f79663k);
        IPlayerContainer iPlayerContainer5 = this.f79654a;
        IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer6 = null;
        }
        iPlayerContainer6.getInteractLayerService().removeDanmakuCommandPanelsObserver(this.f79664l);
        IPlayerContainer iPlayerContainer7 = this.f79654a;
        IPlayerContainer iPlayerContainer8 = iPlayerContainer7;
        if (iPlayerContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer8 = null;
        }
        iPlayerContainer8.getControlContainerService().unregisterState(this.f79665m);
        IPlayerContainer iPlayerContainer9 = this.f79654a;
        IPlayerContainer iPlayerContainer10 = iPlayerContainer9;
        if (iPlayerContainer9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer10 = null;
        }
        IPlayerServiceManager playerServiceManager = iPlayerContainer10.getPlayerServiceManager();
        PlayerServiceManager.ServiceDescriptor.Companion companion = PlayerServiceManager.ServiceDescriptor.Companion;
        playerServiceManager.unbindService(companion.obtain(DelegateStoreService.class), this.f79656c);
        IPlayerContainer iPlayerContainer11 = this.f79654a;
        if (iPlayerContainer11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer11 = null;
        }
        iPlayerContainer11.getPlayerServiceManager().unbindService(companion.obtain(pq0.c.class), this.f79657d);
    }

    @Override // Qq0.a
    public final long p() {
        Video.DisplayParams displayParams;
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        Video.PlayableParams currentPlayableParams = iPlayerContainer2.getVideoPlayDirectorService().getCurrentPlayableParams();
        return (currentPlayableParams == null || (displayParams = currentPlayableParams.getDisplayParams()) == null) ? 0L : displayParams.getAvid();
    }

    @Override // Qq0.a
    public final boolean r(int i7, @NotNull Map<String, ? extends Object> map) {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        IInteractLayerService interactLayerService = iPlayerContainer2.getInteractLayerService();
        PlayerContainer playerContainer = this.f79654a;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer = null;
        }
        return interactLayerService.sendCommandDanmaku(playerContainer.getContext(), i7, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r0(@org.jetbrains.annotations.Nullable com.bilibili.playerbizcommon.features.danmaku.input.d r14) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.danmaku.input.DanmakuInputWindowService.r0(com.bilibili.playerbizcommon.features.danmaku.input.d):void");
    }

    @Override // Qq0.a
    public final void removeDanmakuColorfulEnableObserver(@NotNull com.bilibili.playerbizcommon.features.danmaku.input.b bVar) {
        this.h.remove(bVar);
    }

    @Override // Qq0.a
    public final void s(boolean z6) {
        com.bilibili.playerbizcommon.playerinput.a aVar;
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.danmaku-set.dm-order-list.click.player", new String[]{Constant.IN_KEY_LOCATION, "1"}));
        if (z6 || (aVar = this.f79659f) == null) {
            return;
        }
        aVar.i();
    }

    @Override // Qq0.a
    public final void setDanmakuColorful(@NotNull com.bilibili.playerbizcommon.features.danmaku.input.a aVar) {
        this.f79660g = aVar;
    }

    @Override // Qq0.a
    public final void u(@NotNull CommandsDanmaku commandsDanmaku, @Nullable InteractDanmakuListPanel.a aVar) {
        c(commandsDanmaku, aVar);
    }

    @Override // Qq0.a
    public final void v(boolean z6) {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        IPlayerSettingService playerSettingService = iPlayerContainer2.getPlayerSettingService();
        if (!playerSettingService.getBoolean("danmaku_support_box_checked_by_user", false)) {
            playerSettingService.putBoolean("danmaku_support_box_checked_by_user", true);
        }
        IPlayerContainer iPlayerContainer3 = this.f79654a;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        iPlayerContainer3.getPlayerSettingService().putBoolean("danmaku_support_box_checked", z6);
    }

    @Override // Qq0.a
    public final boolean z() {
        IPlayerContainer iPlayerContainer = this.f79654a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        return iPlayerContainer2.getPlayerSettingService().getBoolean("danmaku_support_box_checked", true);
    }
}
