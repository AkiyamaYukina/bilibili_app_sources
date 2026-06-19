package com.bilibili.playerbizcommon.features.network;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.CheckBox;
import androidx.compose.foundation.lazy.layout.H0;
import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.RunnableC4587e;
import bF0.C5068x0;
import c6.Q;
import com.alipay.sdk.app.PayTask;
import com.bapis.bilibili.app.im.v1.KSessionPageType;
import com.bapis.bilibili.app.view.v1.TFInfoReply;
import com.bilibili.app.authorspace.ui.C0;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.fd_service.FreeDataManager;
import com.bilibili.fd_service.demiware.DemiwareCondition;
import com.bilibili.fd_service.demiware.DemiwareEndReason;
import com.bilibili.fd_service.demiware.DemiwareListener;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.gripper.api.SuspendProducer;
import com.bilibili.lib.gripper.api.hiltlike.Component_jvmKt;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.playerbizcommon.features.network.PlayerNetworkFunctionWidget;
import com.bilibili.upper.module.contribute.dynamic.DynamicEditDialogFragment;
import com.google.common.collect.ImmutableSet;
import dagger.internal.Preconditions;
import im.session.IMSessionStateMachine;
import im.session.IMSessionViewModel;
import im.session.service.IMSessionBroadcastService;
import im.session.service.IMSessionSecondaryDataSourceService;
import im.session.service.m;
import im.session.service.s;
import im.session.service.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.base.hilt.component.HiltSingletonComponent_androidKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.webrtc.SurfaceTextureHelper;
import tv.danmaku.bili.a;
import tv.danmaku.bili.n;
import tv.danmaku.biliplayerv2.HookErrorType;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.PlayerSharingType;
import tv.danmaku.biliplayerv2.collection.Collections;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.CurrentVideoPointer;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.IPlayerReleaseObserver;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;
import tv.danmaku.biliplayerv2.service.LifecycleObserver;
import tv.danmaku.biliplayerv2.service.LifecycleState;
import tv.danmaku.biliplayerv2.service.OnMeteredNetworkUrlHookListener;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.lock.DisablePlayLock;
import tv.danmaku.biliplayerv2.service.network.PlayerFreeDataHelper;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;
import tv.danmaku.ijk.media.player.IjkMediaAsset;
import tv.danmaku.ijk.media.player.IjkNetworkUtils;
import tv.danmaku.videoplayer.core.log.PlayerLog;
import tv.danmaku.videoplayer.core.media.ijk.IjkOptionsHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkService.class */
public final class PlayerNetworkService implements IPlayerNetworkService, OnMeteredNetworkUrlHookListener, LifecycleObserver {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static int f79873A = 0;

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String KEY_SHARE_NETWORK_ENVIRONMENT = "key_share_network_environment";
    public static final int STRATEGY_0 = 0;
    public static final int STRATEGY_1 = 1;
    public static final int STRATEGY_2 = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static boolean f79874z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f79875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public VideoEnvironment f79876b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f79879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f79881g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Class<? extends AbsFunctionWidget> f79882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public FunctionWidgetToken f79883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public INetworkAlertHandler f79884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public INetworkToastHandler f79885l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public DisablePlayLock f79887n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public VideoEnvironment f79889p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f79890q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public PlayerToast f79892s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f79893t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f79894u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public TFInfoReply f79895v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public PlayerToast f79896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final e f79897x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final d f79898y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collections.SafeIteratorList<VideoEnvironmentObserver> f79877c = Collections.safeIteratorList(new ArrayList());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public ShowAlertMode f79878d = ShowAlertMode.AppOnce;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f79886m = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f79888o = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f79891r = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkService$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkService$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f79899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f79900b;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:57:0x00ce
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.network.PlayerNetworkService.b.m8281clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkService$c.class */
    public static final class c implements DemiwareListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerNetworkService f79901a;

        public c(PlayerNetworkService playerNetworkService) {
            this.f79901a = playerNetworkService;
        }

        public final void onDemiwareEnd(DemiwareEndReason demiwareEndReason) {
            this.f79901a.f79891r = false;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkService$d.class */
    public static final class d implements IPlayerReleaseObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerNetworkService f79902a;

        public d(PlayerNetworkService playerNetworkService) {
            this.f79902a = playerNetworkService;
        }

        public final void onPlayerItemRelease() {
            PlayerNetworkService playerNetworkService = this.f79902a;
            playerNetworkService.h = false;
            playerNetworkService.b();
        }

        public final void onPlayerItemWillChanged() {
            PlayerNetworkService playerNetworkService = this.f79902a;
            playerNetworkService.h = false;
            playerNetworkService.b();
        }

        public final void onPlayerWillRelease() {
            PlayerNetworkService playerNetworkService = this.f79902a;
            playerNetworkService.h = false;
            playerNetworkService.b();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkService$e.class */
    public static final class e implements IVideosPlayDirectorService.VideoPlayEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerNetworkService f79903a;

        public e(PlayerNetworkService playerNetworkService) {
            this.f79903a = playerNetworkService;
        }

        public final void onVideoItemCompleted(CurrentVideoPointer currentVideoPointer, Video video) {
            DemiwareCondition demiwareConditionCheckDemiwareCondition;
            PlayerNetworkService playerNetworkService = this.f79903a;
            playerNetworkService.f79888o = false;
            FreeDataManager freeDataManagerAccess$getMFreeDataManager$p = PlayerNetworkService.access$getMFreeDataManager$p(playerNetworkService);
            if (freeDataManagerAccess$getMFreeDataManager$p == null || (demiwareConditionCheckDemiwareCondition = freeDataManagerAccess$getMFreeDataManager$p.checkDemiwareCondition()) == null || !demiwareConditionCheckDemiwareCondition.isDemiware()) {
                return;
            }
            PlayerNetworkService.access$hideDemiewareToast(playerNetworkService);
        }

        public final void onVideoItemStart(CurrentVideoPointer currentVideoPointer, Video video) {
            DemiwareCondition demiwareConditionCheckDemiwareCondition;
            PlayerNetworkService playerNetworkService = this.f79903a;
            playerNetworkService.f79876b = null;
            playerNetworkService.f79889p = null;
            playerNetworkService.f79888o = true;
            FreeDataManager freeDataManagerAccess$getMFreeDataManager$p = PlayerNetworkService.access$getMFreeDataManager$p(playerNetworkService);
            if (freeDataManagerAccess$getMFreeDataManager$p == null || (demiwareConditionCheckDemiwareCondition = freeDataManagerAccess$getMFreeDataManager$p.checkDemiwareCondition()) == null || !demiwareConditionCheckDemiwareCondition.isDemiware()) {
                return;
            }
            playerNetworkService.getClass();
        }

        public final void onVideoItemWillChange(CurrentVideoPointer currentVideoPointer, CurrentVideoPointer currentVideoPointer2, Video video) {
            PlayerNetworkService playerNetworkService = this.f79903a;
            playerNetworkService.h = false;
            playerNetworkService.b();
            playerNetworkService.f79881g = null;
        }

        public final void onVideoWillChange(Video video, Video video2) {
            if (Intrinsics.areEqual(video2, video)) {
                return;
            }
            PlayerNetworkService playerNetworkService = this.f79903a;
            playerNetworkService.f79880f = false;
            FunctionWidgetToken functionWidgetToken = playerNetworkService.f79883j;
            if (functionWidgetToken == null || !functionWidgetToken.isShowing()) {
                return;
            }
            playerNetworkService.p(new QG.c(playerNetworkService, 1));
        }
    }

    public PlayerNetworkService() {
        new c(this);
        this.f79897x = new e(this);
        this.f79898y = new d(this);
    }

    public static final Object access$fetcherToastDataFromRemote(PlayerNetworkService playerNetworkService, Continuation continuation) {
        playerNetworkService.getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new PlayerNetworkService$fetcherToastDataFromRemote$2(null), continuation);
    }

    public static final /* synthetic */ FreeDataManager access$getMFreeDataManager$p(PlayerNetworkService playerNetworkService) {
        playerNetworkService.getClass();
        return null;
    }

    public static final void access$hideDemiewareToast(PlayerNetworkService playerNetworkService) {
        PlayerToast playerToast = playerNetworkService.f79892s;
        if (playerToast != null) {
            IPlayerContainer iPlayerContainer = playerNetworkService.f79875a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getToastService().dismissToast(playerToast);
            playerNetworkService.f79892s = null;
        }
    }

    public final void a() {
        if (this.f79883j != null) {
            if (this.f79891r) {
                o();
            } else {
                IPlayerContainer iPlayerContainer = this.f79875a;
                IPlayerContainer iPlayerContainer2 = iPlayerContainer;
                if (iPlayerContainer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer2 = null;
                }
                iPlayerContainer2.getPlayerCoreService().play();
            }
            IPlayerContainer iPlayerContainer3 = this.f79875a;
            IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer4 = null;
            }
            iPlayerContainer4.getFunctionWidgetService().hideWidget(this.f79883j);
            this.f79883j = null;
        }
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public void allowToContinuePlay() {
        PlayerLog.i("PlayerNetworkService", "user allow mobile network play");
        IPlayerContainer iPlayerContainer = this.f79875a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerSettingService().putLong("key_last_show_network_dialog_time", System.currentTimeMillis());
        this.f79879e = true;
        this.h = true;
        if (this.f79894u == 2) {
            PlayerContainer playerContainer = this.f79875a;
            if (playerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer = null;
            }
            BiliGlobalPreferenceHelper.getBLKVSharedPreference(playerContainer.getContext()).edit().putBoolean("pref_key_mobile_data_auto_play", true).apply();
            f79874z = true;
        }
        a();
        INetworkAlertHandler iNetworkAlertHandler = this.f79884k;
        if (iNetworkAlertHandler != null) {
            iNetworkAlertHandler.onAllowPlayWithMobileData();
        }
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public void allowToContinuePlayOneTime() {
        PlayerLog.i("PlayerNetworkService", "user allow mobile network play one time");
        a();
        INetworkAlertHandler iNetworkAlertHandler = this.f79884k;
        if (iNetworkAlertHandler != null) {
            iNetworkAlertHandler.onAllowPlayWithMobileData();
        }
    }

    public final void b() {
        PlayerLog.i("PlayerNetworkService", "disable play false on network lock release");
        DisablePlayLock disablePlayLock = this.f79887n;
        if (disablePlayLock != null && disablePlayLock.isHeld()) {
            IPlayerContainer iPlayerContainer = this.f79875a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getPlayerCoreService().releaseDisablePlayLock(this.f79887n);
            this.f79887n = null;
        }
        IPlayerContainer iPlayerContainer3 = this.f79875a;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        iPlayerContainer3.getPlayerCoreService().setBufferLimit(false);
    }

    public void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f79875a = playerContainer;
    }

    public final void c(String str, String str2) {
        HashMap map = new HashMap();
        map.put("player_type", this.f79894u == 2 ? "ogv" : "ugc");
        map.put("tips_id", str2);
        BiliAccountInfo.Companion companion = BiliAccountInfo.Companion;
        VipUserInfo vipInfo = companion.get().getVipInfo();
        map.put("vip_type", String.valueOf(vipInfo != null ? Integer.valueOf(vipInfo.getVipType()) : null));
        VipUserInfo vipInfo2 = companion.get().getVipInfo();
        Integer numValueOf = null;
        if (vipInfo2 != null) {
            numValueOf = Integer.valueOf(vipInfo2.getVipStatus());
        }
        map.put("vip_status", String.valueOf(numValueOf));
        Neurons.report$default(true, 9, str, map, (String) null, 0, 48, (Object) null);
        System.out.println((Object) android.support.v4.media.a.a("aylong: eventid = ", str, " "));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(tv.danmaku.biliplayerv2.PlayerSharingBundle r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.network.PlayerNetworkService.d(tv.danmaku.biliplayerv2.PlayerSharingBundle, boolean):void");
    }

    public final void e() {
        synchronized (this.f79877c) {
            Collections.SafeIteratorList<VideoEnvironmentObserver> safeIteratorList = this.f79877c;
            if (safeIteratorList != null) {
                safeIteratorList.forEach(new Collections.IteratorAction(this) { // from class: com.bilibili.playerbizcommon.features.network.j

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PlayerNetworkService f79924a;

                    {
                        this.f79924a = this;
                    }

                    public final void run(Object obj) {
                        ((VideoEnvironmentObserver) obj).onVideoEnvironmentChanged(this.f79924a.f79876b);
                    }
                });
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void f(boolean z6) {
        PlayerNetworkFunctionWidget.b bVar;
        PlayerLog.i("PlayerNetworkService", "disable play true on network mobile");
        DisablePlayLock disablePlayLock = this.f79887n;
        if (disablePlayLock == null || !disablePlayLock.isHeld()) {
            IPlayerContainer iPlayerContainer = this.f79875a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            this.f79887n = iPlayerContainer2.getPlayerCoreService().acquireDisablePlayLock("PlayerNetworkService");
        }
        FunctionWidgetToken functionWidgetToken = this.f79883j;
        if (functionWidgetToken == null || !functionWidgetToken.isShowing()) {
            if (this.f79880f) {
                o();
                return;
            }
            IPlayerContainer iPlayerContainer3 = this.f79875a;
            IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer4 = null;
            }
            int state = iPlayerContainer4.getPlayerCoreService().getState();
            if (state == 0 || state == 2 || state == 3 || state == 4) {
                this.h = true;
                IPlayerContainer iPlayerContainer5 = this.f79875a;
                IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
                if (iPlayerContainer5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer6 = null;
                }
                iPlayerContainer6.getPlayerCoreService().pause();
            }
            this.f79880f = true;
            IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
            if (this.f79882i == null) {
                int i7 = this.f79894u;
                bVar = new PlayerNetworkFunctionWidget.b(i7 == 1 || i7 == 0, this.f79890q);
            } else {
                bVar = null;
            }
            layoutParams.setFunctionType(1);
            layoutParams.setEnterAnim(-1);
            layoutParams.setExitAnim(-1);
            IPlayerContainer iPlayerContainer7 = this.f79875a;
            IPlayerContainer iPlayerContainer8 = iPlayerContainer7;
            if (iPlayerContainer7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer8 = null;
            }
            iPlayerContainer8.getPlayerCoreService().setBufferLimit(true);
            IPlayerContainer iPlayerContainer9 = this.f79875a;
            if (iPlayerContainer9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer9 = null;
            }
            AbsFunctionWidgetService functionWidgetService = iPlayerContainer9.getFunctionWidgetService();
            Class<? extends AbsFunctionWidget> cls = this.f79882i;
            Class<? extends AbsFunctionWidget> cls2 = cls;
            if (cls == null) {
                cls2 = PlayerNetworkFunctionWidget.class;
            }
            this.f79883j = functionWidgetService.showWidget(cls2, layoutParams, bVar);
            if (z6) {
                if (this.f79894u == 2) {
                    f79874z = true;
                }
                final int i8 = 0;
                p(new Function1(this, i8) { // from class: com.bilibili.playerbizcommon.features.network.k

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f79925a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f79926b;

                    {
                        this.f79925a = i8;
                        this.f79926b = this;
                    }

                    /* JADX WARN: Type inference failed for: r10v7, types: [im.session.service.f, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r11v7, types: [im.session.service.e, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r9v3, types: [im.session.service.i, java.lang.Object] */
                    public final Object invoke(Object obj) {
                        CheckBox checkBox;
                        TintLinearLayout tintLinearLayout;
                        CheckBox checkBox2;
                        TintLinearLayout tintLinearLayout2;
                        switch (this.f79925a) {
                            case 0:
                                TFInfoReply tFInfoReply = (TFInfoReply) obj;
                                PlayerNetworkService playerNetworkService = (PlayerNetworkService) this.f79926b;
                                FunctionWidgetToken functionWidgetToken2 = playerNetworkService.f79883j;
                                if (functionWidgetToken2 != null) {
                                    playerNetworkService.c("player.player.network-layer-freeflow.show.player", String.valueOf(tFInfoReply.getTipsId()));
                                    IPlayerContainer iPlayerContainer10 = playerNetworkService.f79875a;
                                    IPlayerContainer iPlayerContainer11 = iPlayerContainer10;
                                    if (iPlayerContainer10 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                                        iPlayerContainer11 = null;
                                    }
                                    iPlayerContainer11.getFunctionWidgetService().updateFunctionWidgetConfiguration(functionWidgetToken2, new PlayerNetworkFunctionWidget.Configuration(new PlayerNetworkFunctionWidget.PanelCustomData("", tFInfoReply.getTfPanelCustomized().getRightBtnLink(), tFInfoReply.getTfPanelCustomized().getRightBtnText(), "", C4496a.a(":", tFInfoReply.getTfPanelCustomized().getMainLabel())), PlayerNetworkFunctionWidget.PanelType.NORMAL));
                                }
                                return Unit.INSTANCE;
                            case 1:
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                DynamicEditDialogFragment dynamicEditDialogFragment = (DynamicEditDialogFragment) this.f79926b;
                                if (zBooleanValue) {
                                    C5068x0 c5068x0 = dynamicEditDialogFragment.b;
                                    if (c5068x0 != null && (tintLinearLayout2 = c5068x0.f56319l) != null) {
                                        tintLinearLayout2.setVisibility(0);
                                    }
                                    C5068x0 c5068x02 = dynamicEditDialogFragment.b;
                                    if (c5068x02 != null && (checkBox2 = c5068x02.f56310b) != null) {
                                        checkBox2.setChecked(true);
                                    }
                                } else {
                                    C5068x0 c5068x03 = dynamicEditDialogFragment.b;
                                    if (c5068x03 != null && (tintLinearLayout = c5068x03.f56319l) != null) {
                                        tintLinearLayout.setVisibility(8);
                                    }
                                    C5068x0 c5068x04 = dynamicEditDialogFragment.b;
                                    if (c5068x04 != null && (checkBox = c5068x04.f56310b) != null) {
                                        checkBox.setChecked(false);
                                    }
                                }
                                return Unit.INSTANCE;
                            case 2:
                                a.i1 i1VarK1 = ((im.session.di.b) Component_jvmKt.entryPoint(HiltSingletonComponent_androidKt.getHiltSingletonComponent(), Reflection.getOrCreateKotlinClass(im.session.di.b.class))).k1();
                                KSessionPageType kSessionPageType = (KSessionPageType) this.f79926b;
                                Preconditions.checkNotNull(kSessionPageType);
                                a.j1 j1Var = i1VarK1.a;
                                yW0.b bVarB = yW0.b.b(new n(j1Var));
                                return new IMSessionViewModel(kSessionPageType, new IMSessionStateMachine(kSessionPageType, (IMSessionBroadcastService) j1Var.ub.get(), new IMSessionSecondaryDataSourceService(new im.session.service.request.d((u) bVarB.get())), new s((u) bVarB.get()), (im.session.service.i) new Object(), (im.session.service.f) new Object(), (im.session.service.e) new Object(), (m) null, j1Var.getAccount(), (u) bVarB.get(), (im.session.service.n) null, (im.session.service.g) Preconditions.checkNotNullFromProvides((im.session.service.g) ((SuspendProducer) j1Var.Pb.get()).get())), ImmutableSet.of(new Object(), (xX0.b) Preconditions.checkNotNullFromProvides(com.bilibili.bplus.im.badge.h.provideSessionEventCallback((com.bilibili.bplus.im.badge.a) Preconditions.checkNotNullFromProvides((com.bilibili.bplus.im.badge.a) ((SuspendProducer) j1Var.g7.get()).get())))));
                            default:
                                ((km.c) this.f79926b).b.reportPlayer(new NeuronsEvents.NormalEvent("player.player.dm-send.preview-show.player", new String[]{TextSource.CFG_CONTENT, (String) obj}));
                                return Unit.INSTANCE;
                        }
                    }
                });
            }
        }
    }

    public final void g(VideoEnvironment videoEnvironment, Context context) {
        boolean z6;
        Integer intOrNull;
        long currentMediaSize = getCurrentMediaSize();
        INetworkToastHandler iNetworkToastHandler = this.f79885l;
        if (iNetworkToastHandler == null || !INetworkToastHandler.showCustomToast$default(iNetworkToastHandler, videoEnvironment, currentMediaSize, true, false, false, 24, null)) {
            IPlayerContainer iPlayerContainer = this.f79875a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            MediaResource mediaResource = iPlayerContainer2.getPlayerCoreService().getMediaResource();
            boolean z7 = false;
            if (mediaResource != null ? mediaResource.isDrm() : false) {
                j(currentMediaSize > 0 ? context.getString(2131846366, String.valueOf(currentMediaSize)) : context.getString(2131845638), false, false);
            } else if (!this.f79880f) {
                j(this.f79894u == 2 ? context.getString(2131846366, String.valueOf(getCurrentMediaSize())) : context.getString(2131845638), true, false);
                if (f79873A < 2) {
                    String str = (String) ConfigManager.Companion.config().get("freedata.mobile_free_data_toast_times", "0");
                    int iIntValue = (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue();
                    if (iIntValue <= 0) {
                        z6 = false;
                    } else {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        IPlayerContainer iPlayerContainer3 = this.f79875a;
                        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
                        if (iPlayerContainer3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                            iPlayerContainer4 = null;
                        }
                        if (jCurrentTimeMillis - iPlayerContainer4.getPlayerSettingService().getLong("key_custom_show_open_free_toast_time", 0L) < 86400000) {
                            IPlayerContainer iPlayerContainer5 = this.f79875a;
                            IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
                            if (iPlayerContainer5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                                iPlayerContainer6 = null;
                            }
                            int i7 = iPlayerContainer6.getPlayerSettingService().getInt("key_custom_show_open_free_toast_times", 0);
                            if (i7 < iIntValue) {
                                z7 = true;
                            }
                            z6 = z7;
                            if (z7) {
                                IPlayerContainer iPlayerContainer7 = this.f79875a;
                                if (iPlayerContainer7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                                    iPlayerContainer7 = null;
                                }
                                iPlayerContainer7.getPlayerSettingService().putInt("key_custom_show_open_free_toast_times", i7 + 1);
                                z6 = z7;
                            }
                        } else {
                            IPlayerContainer iPlayerContainer8 = this.f79875a;
                            IPlayerContainer iPlayerContainer9 = iPlayerContainer8;
                            if (iPlayerContainer8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                                iPlayerContainer9 = null;
                            }
                            iPlayerContainer9.getPlayerSettingService().putLong("key_custom_show_open_free_toast_time", System.currentTimeMillis());
                            IPlayerContainer iPlayerContainer10 = this.f79875a;
                            if (iPlayerContainer10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                                iPlayerContainer10 = null;
                            }
                            iPlayerContainer10.getPlayerSettingService().putInt("key_custom_show_open_free_toast_times", 1);
                            z6 = true;
                        }
                    }
                    if (z6) {
                        this.f79880f = true;
                        p(new H0(this, 2));
                    }
                }
            }
        }
        if (this.f79883j != null) {
            a();
        } else {
            o();
        }
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public long getCurrentMediaSize() {
        IPlayerContainer iPlayerContainer = this.f79875a;
        IPlayerContainer iPlayerContainer2 = null;
        IPlayerContainer iPlayerContainer3 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        MediaResource mediaResource = iPlayerContainer3.getPlayerCoreService().getMediaResource();
        if (mediaResource == null) {
            return 0L;
        }
        PlayIndex playIndex = mediaResource.getPlayIndex();
        if ((playIndex != null ? playIndex.mQuality : 0) == 0) {
            return 0L;
        }
        IjkMediaAsset.VideoCodecType videoCodecType = IjkOptionsHelper.isHevcEnable(BiliContext.application()) ? IjkMediaAsset.VideoCodecType.H265 : IjkMediaAsset.VideoCodecType.H264;
        IPlayerContainer iPlayerContainer4 = this.f79875a;
        if (iPlayerContainer4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
        } else {
            iPlayerContainer2 = iPlayerContainer4;
        }
        long mediaSize = iPlayerContainer2.getPlayerCoreService().getMediaSize(videoCodecType);
        long j7 = mediaSize / 1048576;
        long j8 = j7;
        if (mediaSize % 1048576 > 0) {
            j8 = j7 + 1;
        }
        return j8;
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    @Nullable
    public INetworkAlertHandler getNetworkAlertHandler() {
        return this.f79884k;
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    @Nullable
    public VideoEnvironment getVideoEnvironment() {
        return this.f79876b;
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public void goToFreeData() {
        TFInfoReply tFInfoReply = this.f79895v;
        if (tFInfoReply != null) {
            c("player.player.network-layer-freeflow.click.player", String.valueOf(tFInfoReply.getTipsId()));
        }
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public boolean isNetworkPanelShowed() {
        FunctionWidgetToken functionWidgetToken = this.f79883j;
        return functionWidgetToken != null && functionWidgetToken.isShowing();
    }

    public final void j(String str, boolean z6, boolean z7) {
        INetworkToastHandler iNetworkToastHandler = this.f79885l;
        if (iNetworkToastHandler != null) {
            iNetworkToastHandler.showToast(str, z6, z7);
            return;
        }
        if (!this.f79880f || z7) {
            this.f79880f = true;
            this.f79881g = str;
            PlayerToast playerToastBuild = qb.g.a(32, 17, "extra_title", str).duration(PayTask.f60018j).build();
            IPlayerContainer iPlayerContainer = this.f79875a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getToastService().showToast(playerToastBuild);
            if (z6) {
                Neurons.report$default(true, 9, "player.player.toast-dataplan.dataplan-show.player", (Map) null, (String) null, 0, 56, (Object) null);
            }
        }
    }

    public final void l(VideoEnvironment videoEnvironment, boolean z6) {
        PlayerContainer playerContainer = this.f79875a;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        Context context = playerContainer2.getContext();
        long currentMediaSize = getCurrentMediaSize();
        INetworkToastHandler iNetworkToastHandler = this.f79885l;
        if (iNetworkToastHandler == null || !INetworkToastHandler.showCustomToast$default(iNetworkToastHandler, videoEnvironment, currentMediaSize, true, z6, false, 16, null)) {
            int i7 = videoEnvironment == null ? -1 : b.f79899a[videoEnvironment.ordinal()];
            if (i7 == 1) {
                j((currentMediaSize <= 0 || z6) ? context.getString(2131845638) : context.getString(2131846976, String.valueOf(currentMediaSize)), true, true);
                return;
            }
            if (i7 == 2) {
                j((currentMediaSize <= 0 || z6) ? context.getString(2131845638) : context.getString(2131846976, String.valueOf(currentMediaSize)), true, !Intrinsics.areEqual(this.f79881g, r11));
            } else if (i7 == 3) {
                j((currentMediaSize <= 0 || z6) ? context.getString(2131846786) : context.getString(2131845658, String.valueOf(currentMediaSize)), true, true);
            } else {
                if (i7 != 4) {
                    return;
                }
                j(PlayerFreeDataHelper.INSTANCE.getFreeDataResultCode() == 2036 ? context.getString(2131846758) : context.getString(2131847523), true, false);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean n() throws NoWhenBranchMatchedException {
        int i7 = b.f79900b[this.f79878d.ordinal()];
        boolean z6 = true;
        if (i7 != 1) {
            if (i7 == 2) {
                z6 = f79874z;
            } else if (i7 == 3) {
                z6 = this.f79879e;
            } else {
                if (i7 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                z6 = false;
            }
        }
        return z6;
    }

    public final void o() {
        PlayerLog.i("PlayerNetworkService", "disable play false on network lock release and play");
        DisablePlayLock disablePlayLock = this.f79887n;
        if (disablePlayLock != null && disablePlayLock.isHeld()) {
            IPlayerContainer iPlayerContainer = this.f79875a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getPlayerCoreService().releaseDisablePlayLock(this.f79887n);
            this.f79887n = null;
        }
        final int i7 = 0;
        HandlerThreads.post(0, new Runnable(this, i7) { // from class: com.bilibili.playerbizcommon.features.network.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f79922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f79923b;

            {
                this.f79922a = i7;
                this.f79923b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f79922a) {
                    case 0:
                        PlayerNetworkService playerNetworkService = (PlayerNetworkService) this.f79923b;
                        PlayerLog.i("PlayerNetworkService", "ready to resume because of network: " + playerNetworkService.h);
                        if (playerNetworkService.h) {
                            playerNetworkService.h = false;
                            PlayerContainer playerContainer = playerNetworkService.f79875a;
                            PlayerContainer playerContainer2 = playerContainer;
                            if (playerContainer == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                                playerContainer2 = null;
                            }
                            Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(playerContainer2.getContext());
                            boolean z6 = false;
                            if (activityFindActivityOrNull != null) {
                                z6 = false;
                                if (BiliContext.topActivitiy() == activityFindActivityOrNull) {
                                    z6 = true;
                                }
                            }
                            PlayerContainer playerContainer3 = playerNetworkService.f79875a;
                            PlayerContainer playerContainer4 = playerContainer3;
                            if (playerContainer3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                                playerContainer4 = null;
                            }
                            boolean zAreEqual = Intrinsics.areEqual(playerContainer4.getContext(), BiliContext.application());
                            StringBuilder sbA = Q.a("resume because of network: mEnableResumePlay=", ",isTopStack=", ",isApplicationContext=", playerNetworkService.f79886m, z6);
                            sbA.append(zAreEqual);
                            PlayerLog.i("PlayerNetworkService", sbA.toString());
                            if ((playerNetworkService.f79886m && z6) || zAreEqual) {
                                IPlayerContainer iPlayerContainer3 = playerNetworkService.f79875a;
                                if (iPlayerContainer3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                                    iPlayerContainer3 = null;
                                }
                                iPlayerContainer3.getPlayerCoreService().resume();
                                break;
                            }
                        }
                        break;
                    default:
                        SurfaceTextureHelper.c((SurfaceTextureHelper) this.f79923b);
                        break;
                }
            }
        });
        IPlayerContainer iPlayerContainer3 = this.f79875a;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        iPlayerContainer3.getPlayerCoreService().setBufferLimit(false);
    }

    public void onAttachByShared(@NotNull PlayerSharingType playerSharingType, @Nullable PlayerSharingBundle playerSharingBundle) {
        d(playerSharingBundle, true);
    }

    public void onCollectSharedParams(@NotNull PlayerSharingType playerSharingType, @NotNull PlayerSharingBundle playerSharingBundle) {
        Bundle bundle = playerSharingBundle.getBundle();
        FunctionWidgetToken functionWidgetToken = this.f79883j;
        boolean z6 = false;
        if (functionWidgetToken != null) {
            z6 = false;
            if (functionWidgetToken.isShowing()) {
                z6 = true;
            }
        }
        bundle.putBoolean("key_share_dialog_is_showing", z6);
        playerSharingBundle.getBundle().putBoolean("key_share_resume_when_unlock", this.h);
        VideoEnvironment videoEnvironment = this.f79876b;
        if (videoEnvironment != null) {
            playerSharingBundle.getBundle().putString(KEY_SHARE_NETWORK_ENVIRONMENT, videoEnvironment.name());
            PlayerLog.i("PlayerNetworkService", "save environment " + this.f79876b + " to bundle");
        }
        b();
    }

    public void onLifecycleChanged(@NotNull LifecycleState lifecycleState) {
        if (lifecycleState == LifecycleState.ACTIVITY_RESUME) {
            refreshOnFreeDataActive();
        }
    }

    @Nullable
    public String onMeteredNetworkUrlHook(@Nullable final String str, @NotNull final IjkNetworkUtils.NetWorkType netWorkType, @Nullable HookErrorType hookErrorType) {
        PlayerContainer playerContainer = this.f79875a;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        playerContainer2.getContext();
        if (netWorkType == IjkNetworkUtils.NetWorkType.WIFI) {
            PlayerLog.i("PlayerNetworkService", "network change to wifi");
            HandlerThreads.post(0, new RunnableC4587e(this, 1));
        } else if (str != null) {
            PlayerLog.i("PlayerNetworkService", "network change to mobile");
            HandlerThreads.post(0, new Runnable(this, netWorkType, str) { // from class: com.bilibili.playerbizcommon.features.network.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlayerNetworkService f79919a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final IjkNetworkUtils.NetWorkType f79920b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f79921c;

                {
                    this.f79919a = this;
                    this.f79920b = netWorkType;
                    this.f79921c = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:53:0x019c  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instruction units count: 1167
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.network.h.run():void");
                }
            });
        }
        return str;
    }

    public void onStart(@Nullable PlayerSharingBundle playerSharingBundle) {
        IPlayerContainer iPlayerContainer = this.f79875a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerCoreService().addPlayerReleaseObserver(this.f79898y);
        IPlayerContainer iPlayerContainer3 = this.f79875a;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        iPlayerContainer4.getPlayerCoreService().setMeteredNetworkUrlHookListener(this);
        IPlayerContainer iPlayerContainer5 = this.f79875a;
        IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer6 = null;
        }
        iPlayerContainer6.getVideoPlayDirectorService().addVideoPlayEventListener(this.f79897x);
        d(playerSharingBundle, false);
        IPlayerContainer iPlayerContainer7 = this.f79875a;
        if (iPlayerContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer7 = null;
        }
        iPlayerContainer7.getActivityStateService().registerLifecycle(this, new LifecycleState[]{LifecycleState.ACTIVITY_RESUME});
    }

    public void onStop() {
        b();
        IPlayerContainer iPlayerContainer = this.f79875a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerCoreService().removePlayerReleaseObserver(this.f79898y);
        IPlayerContainer iPlayerContainer3 = this.f79875a;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        iPlayerContainer4.getPlayerCoreService().setMeteredNetworkUrlHookListener((OnMeteredNetworkUrlHookListener) null);
        IPlayerContainer iPlayerContainer5 = this.f79875a;
        IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer6 = null;
        }
        iPlayerContainer6.getVideoPlayDirectorService().removeVideoPlayEventListener(this.f79897x);
        IPlayerContainer iPlayerContainer7 = this.f79875a;
        if (iPlayerContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer7 = null;
        }
        iPlayerContainer7.getActivityStateService().unregisterLifecycle(this);
        this.f79877c.clear();
    }

    public final void p(Function1<? super TFInfoReply, Unit> function1) {
        int i7 = this.f79894u;
        if ((i7 == 1 || i7 == 2) && C0.b()) {
            IPlayerContainer iPlayerContainer = this.f79875a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            BuildersKt.launch$default(tv.danmaku.biliplayerv2.c.a(iPlayerContainer2), (CoroutineContext) null, (CoroutineStart) null, new PlayerNetworkService$updateFreeDataToastData$1(this, function1, null), 3, (Object) null);
        }
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public void refreshFreeDataPanel(@NotNull Map<String, PlayerNetworkFunctionWidget.PanelCustomData> map) {
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public void refreshOnFreeDataActive() {
        if (this.f79893t) {
            this.f79893t = false;
        }
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public void registerVideoEnvironmentObserver(@NotNull VideoEnvironmentObserver videoEnvironmentObserver) {
        synchronized (this.f79877c) {
            if (!this.f79877c.contains(videoEnvironmentObserver)) {
                this.f79877c.add(videoEnvironmentObserver);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public void replayAfterFreeDataActive() {
        this.f79893t = true;
    }

    @NotNull
    public PlayerServiceManager.ServiceConfig serviceConfig() {
        return PlayerServiceManager.ServiceConfig.Companion.obtain(true);
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public void setEnableResumePlay(boolean z6) {
        this.f79886m = z6;
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public void setNetworkAlertHandler(@Nullable INetworkAlertHandler iNetworkAlertHandler) {
        this.f79884k = iNetworkAlertHandler;
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public void setNetworkStrategy(int i7) {
        this.f79894u = i7;
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public void setNetworkToastHandler(@Nullable INetworkToastHandler iNetworkToastHandler) {
        this.f79885l = iNetworkToastHandler;
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public void setNetworkWidgetClass(@NotNull Class<? extends AbsFunctionWidget> cls) {
        this.f79882i = cls;
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public void setShowAlertMode(@NotNull ShowAlertMode showAlertMode) {
        this.f79878d = showAlertMode;
    }

    public final void setWidgetDelDataSizeEnable(boolean z6) {
    }

    public final void setWidgetNoMoreEnable(boolean z6) {
        this.f79890q = z6;
    }

    public final void showDemiwareUIElementEnable(boolean z6) {
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public void showToastForNetWorkState(int i7) {
        FunctionWidgetToken functionWidgetToken = this.f79883j;
        if (functionWidgetToken == null || !functionWidgetToken.isShowing()) {
            if (i7 == 0) {
                l(this.f79876b, true);
            } else {
                l(this.f79876b, false);
            }
        }
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public void unregisterVideoEnvironmentObserver(@NotNull VideoEnvironmentObserver videoEnvironmentObserver) {
        synchronized (this.f79877c) {
            this.f79877c.remove(videoEnvironmentObserver);
        }
    }
}
