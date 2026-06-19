package com.bilibili.playerbizcommon.features.background;

import Ah0.InterfaceC1405e;
import Aj.f;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.PowerManager;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.foundation.Q;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.base.BiliContext;
import com.bilibili.base.ipc.IPCAppStateManager;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.media.util.PlayerCloudSetting;
import com.bilibili.moduleservice.player.MiniPlayerAutoPlaySetting;
import com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerWindowManager;
import com.mall.ui.page.ip.view.v1;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.player.notification.BackgroundMusicService;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainerKt;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.PlayerSharingType;
import tv.danmaku.biliplayerv2.collection.Collections;
import tv.danmaku.biliplayerv2.service.IActivityStateService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.LifecycleObserver;
import tv.danmaku.biliplayerv2.service.LifecycleState;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.VideoDirectorObserver;
import tv.danmaku.biliplayerv2.service.business.ShutOffTimingService;
import tv.danmaku.biliplayerv2.service.lock.DisablePlayLock;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.videoplayer.core.log.PlayerLog;
import uq0.InterfaceC8756d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/BackgroundPlayService.class */
public final class BackgroundPlayService implements com.bilibili.playerbizcommon.features.background.h {

    @NotNull
    public static final String BUNDLE_KEY_FROM_NOTIFICATION = "bundle_key_from_notification";

    @NotNull
    public static final a Companion = new Object();
    public static final int FIXED_PLAY_MODE_NONE = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final j f79573A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final f f79574B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final c f79575C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final i f79576D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final g f79577E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommon.features.background.c f79578F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final d f79579G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final h f79580H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f79581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IActivityStateService f79582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IPlayerCoreService f79583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Integer f79585e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f79587g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f79588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f79589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public DisablePlayLock f79590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public BackgroundMusicService f79591l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public b f79593n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f79596q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final MiniPlayerAutoPlaySetting f79597r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final IMiniPlayerWindowManager f79598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Job f79599t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f79600u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f79601v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f79602w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f79603x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Lazy f79604y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final e f79605z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79586f = true;
    public boolean h = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommon.features.background.f f79592m = new com.bilibili.playerbizcommon.features.background.f();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Collections.SafeIteratorList<com.bilibili.playerbizcommon.features.background.g> f79594o = Q.b();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<PlayerHeadsetService> f79595p = new PlayerServiceManager.Client<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/BackgroundPlayService$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/BackgroundPlayService$b.class */
    public interface b {
        boolean a();

        default boolean b() {
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/BackgroundPlayService$c.class */
    public static final class c implements LifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BackgroundPlayService f79606a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/BackgroundPlayService$c$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f79607a;

            static {
                int[] iArr = new int[LifecycleState.values().length];
                try {
                    iArr[LifecycleState.ACTIVITY_PAUSE.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[LifecycleState.ACTIVITY_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[LifecycleState.ACTIVITY_START.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[LifecycleState.ACTIVITY_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                f79607a = iArr;
            }
        }

        public c(BackgroundPlayService backgroundPlayService) {
            this.f79606a = backgroundPlayService;
        }

        public final void onLifecycleChanged(LifecycleState lifecycleState) {
            MiniPlayerAutoPlaySetting miniPlayerAutoPlaySetting;
            Integer num;
            int i7 = a.f79607a[lifecycleState.ordinal()];
            BackgroundPlayService backgroundPlayService = this.f79606a;
            if (i7 == 1) {
                if (backgroundPlayService.f79589j) {
                    PlayerLog.i("ActivityState", "player will be shared");
                    return;
                }
                IPlayerCoreService iPlayerCoreService = backgroundPlayService.f79583c;
                IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
                if (iPlayerCoreService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                    iPlayerCoreService2 = null;
                }
                backgroundPlayService.f79584d = iPlayerCoreService2.getState();
                MiniPlayerAutoPlaySetting miniPlayerAutoPlaySetting2 = backgroundPlayService.f79597r;
                if ((miniPlayerAutoPlaySetting2 != null && miniPlayerAutoPlaySetting2.getSpEnableAutoMiniPlay()) || ((miniPlayerAutoPlaySetting = backgroundPlayService.f79597r) != null && miniPlayerAutoPlaySetting.getSpEnableInnerAutoMiniPlay())) {
                    PlayerLog.i("ActivityState", "mAutoOutMiniPlaySp:" + backgroundPlayService.f79597r + "?.spEnableAutoMiniPlay, mAutoInnerMiniPlaySp:" + backgroundPlayService.f79597r + "?.spEnableInnerAutoMiniPlay");
                    return;
                }
                PlayerContainer playerContainer = backgroundPlayService.f79581a;
                PlayerContainer playerContainer2 = playerContainer;
                if (playerContainer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    playerContainer2 = null;
                }
                Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(playerContainer2.getContext());
                if (!backgroundPlayService.isEnable() || (activityFindActivityOrNull != null && activityFindActivityOrNull.isFinishing())) {
                    IPlayerCoreService iPlayerCoreService3 = backgroundPlayService.f79583c;
                    IPlayerCoreService iPlayerCoreService4 = iPlayerCoreService3;
                    if (iPlayerCoreService3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                        iPlayerCoreService4 = null;
                    }
                    iPlayerCoreService4.unregisterState(backgroundPlayService.f79580H);
                    backgroundPlayService.f79585e = null;
                    PlayerContainer playerContainer3 = backgroundPlayService.f79581a;
                    PlayerContainer playerContainer4 = playerContainer3;
                    if (playerContainer3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                        playerContainer4 = null;
                    }
                    if (BackgroundPlayService.access$isInMultiWindowMode(backgroundPlayService, playerContainer4.getContext())) {
                        return;
                    }
                    boolean zIsAvailable = backgroundPlayService.isAvailable();
                    boolean z6 = backgroundPlayService.f79586f;
                    b bVar = backgroundPlayService.f79593n;
                    Boolean boolValueOf = null;
                    if (bVar != null) {
                        boolValueOf = Boolean.valueOf(bVar.b());
                    }
                    boolean zAccess$isEnableInternal = BackgroundPlayService.access$isEnableInternal(backgroundPlayService);
                    StringBuilder sbA = c6.Q.a("disable play true on activity pause isAvailable:", " mSettingAvailable:", " mEnabledExtraJudge:", zIsAvailable, z6);
                    sbA.append(boolValueOf);
                    sbA.append(" isEnableInternal:");
                    sbA.append(zAccess$isEnableInternal);
                    sbA.append(" ");
                    PlayerLog.i("ActivityState", sbA.toString());
                    if (backgroundPlayService.b()) {
                        BackgroundPlayService.access$pausePlayerWithoutLock(backgroundPlayService);
                        return;
                    } else {
                        backgroundPlayService.e();
                        return;
                    }
                }
                return;
            }
            if (i7 != 2) {
                if (i7 == 3) {
                    BackgroundPlayService.access$stopBackground(backgroundPlayService);
                    return;
                } else {
                    if (i7 != 4) {
                        return;
                    }
                    backgroundPlayService.f();
                    backgroundPlayService.stopMusicService$playerbizcommon_apinkRelease();
                    return;
                }
            }
            backgroundPlayService.f79602w = false;
            boolean z7 = backgroundPlayService.f79603x;
            backgroundPlayService.f79603x = false;
            PlayerLog.i("ActivityState", "disable play false on activity resume");
            if (backgroundPlayService.f79590k != null && backgroundPlayService.f79590k.isHeld()) {
                IPlayerCoreService iPlayerCoreService5 = backgroundPlayService.f79583c;
                IPlayerCoreService iPlayerCoreService6 = iPlayerCoreService5;
                if (iPlayerCoreService5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                    iPlayerCoreService6 = null;
                }
                iPlayerCoreService6.releaseDisablePlayLock(backgroundPlayService.f79590k);
                backgroundPlayService.f79590k = null;
            }
            if (backgroundPlayService.d() && BackgroundPlayService.access$isScreenLocked(backgroundPlayService)) {
                return;
            }
            BackgroundPlayService.access$tryToRestorePlayer(backgroundPlayService);
            if (backgroundPlayService.f79584d != 5 && backgroundPlayService.f79584d != 6 && backgroundPlayService.f79584d != 7 && backgroundPlayService.f79584d != 8 && backgroundPlayService.f79584d != 2 && backgroundPlayService.f79584d != 0 && (backgroundPlayService.f79585e == null || ((num = backgroundPlayService.f79585e) != null && num.intValue() == 4))) {
                PlayerServiceManager.Client client = new PlayerServiceManager.Client();
                PlayerServiceManager.ServiceDescriptor serviceDescriptorObtain = PlayerServiceManager.ServiceDescriptor.Companion.obtain(ShutOffTimingService.class);
                IPlayerContainer iPlayerContainer = backgroundPlayService.f79581a;
                IPlayerContainer iPlayerContainer2 = iPlayerContainer;
                if (iPlayerContainer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer2 = null;
                }
                iPlayerContainer2.getPlayerServiceManager().bindService(serviceDescriptorObtain, client);
                ShutOffTimingService service = client.getService();
                if (service != null && service.isInSleepMode()) {
                    return;
                }
                IPlayerContainer iPlayerContainer3 = backgroundPlayService.f79581a;
                IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
                if (iPlayerContainer3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer4 = null;
                }
                iPlayerContainer4.getPlayerServiceManager().unbindService(serviceDescriptorObtain, client);
                IPlayerCoreService iPlayerCoreService7 = backgroundPlayService.f79583c;
                IPlayerCoreService iPlayerCoreService8 = iPlayerCoreService7;
                if (iPlayerCoreService7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                    iPlayerCoreService8 = null;
                }
                if (iPlayerCoreService8.getState() != 4 && !z7) {
                    IPlayerCoreService iPlayerCoreService9 = backgroundPlayService.f79583c;
                    if (iPlayerCoreService9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                        iPlayerCoreService9 = null;
                    }
                    iPlayerCoreService9.resume();
                }
            }
            backgroundPlayService.f79584d = 0;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/BackgroundPlayService$d.class */
    public static final class d extends BiliContext.ActivityStateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutableStateFlow<WeakReference<Activity>> f79608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StateFlow<WeakReference<Activity>> f79609b;

        public d() {
            WeakReference weakReference = null;
            MutableStateFlow<WeakReference<Activity>> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
            this.f79608a = MutableStateFlow;
            this.f79609b = FlowKt.asStateFlow(MutableStateFlow);
            Activity activity = BiliContext.topActivity();
            MutableStateFlow.setValue(activity != null ? new WeakReference(activity) : weakReference);
        }

        public final void onActivityPaused(Activity activity) {
            MutableStateFlow<WeakReference<Activity>> mutableStateFlow = this.f79608a;
            WeakReference weakReference = (WeakReference) mutableStateFlow.getValue();
            if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
                mutableStateFlow.setValue((Object) null);
            }
        }

        public final void onActivityResumed(Activity activity) {
            MutableStateFlow<WeakReference<Activity>> mutableStateFlow = this.f79608a;
            WeakReference weakReference = (WeakReference) mutableStateFlow.getValue();
            if ((weakReference != null ? (Activity) weakReference.get() : null) != activity) {
                mutableStateFlow.setValue(new WeakReference(activity));
            }
        }

        public final void onActivityStopped(Activity activity) {
            MutableStateFlow<WeakReference<Activity>> mutableStateFlow = this.f79608a;
            WeakReference weakReference = (WeakReference) mutableStateFlow.getValue();
            if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
                mutableStateFlow.setValue((Object) null);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/BackgroundPlayService$e.class */
    public static final class e implements tv.danmaku.biliplayerv2.service.setting.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BackgroundPlayService f79610a;

        public e(BackgroundPlayService backgroundPlayService) {
            this.f79610a = backgroundPlayService;
        }

        public final void c() {
            PlayerHeadsetService playerHeadsetService = (PlayerHeadsetService) this.f79610a.f79595p.getService();
            if (playerHeadsetService != null) {
                playerHeadsetService.updatePlaybackState();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/BackgroundPlayService$f.class */
    public static final class f implements IPCAppStateManager.IPCActivityStateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BackgroundPlayService f79611a;

        public f(BackgroundPlayService backgroundPlayService) {
            this.f79611a = backgroundPlayService;
        }

        public final void onForegroundActivitiesChanged(int i7, int i8) {
        }

        public final void onVisibleCountChanged(int i7, int i8) {
            IMiniPlayerWindowManager iMiniPlayerWindowManager;
            PlayerLog.i("BackgroundPlayService", this + ", onVisibleCountChanged, last: " + i7 + " current: " + i8);
            BackgroundPlayService backgroundPlayService = this.f79611a;
            if (backgroundPlayService.d()) {
                if (BackgroundPlayService.access$isScreenLocked(backgroundPlayService) && (BackgroundPlayService.access$isCurrentActivityOnTop(backgroundPlayService) || backgroundPlayService.f79588i)) {
                    BackgroundPlayService.access$tryToStartBackgroundPlay(backgroundPlayService);
                    boolean z6 = false;
                    if (BiliContext.isVisible()) {
                        z6 = false;
                        if (BackgroundPlayService.access$isCurrentActivityOnTop(backgroundPlayService)) {
                            z6 = true;
                        }
                    }
                    backgroundPlayService.f79601v = z6;
                    return;
                }
                if (i8 == 0 && BackgroundPlayService.access$isCurrentActivityOnTop(backgroundPlayService)) {
                    BackgroundPlayService.access$tryToStartBackgroundPlay(backgroundPlayService);
                    boolean z7 = false;
                    if (BiliContext.isVisible()) {
                        z7 = false;
                        if (BackgroundPlayService.access$isCurrentActivityOnTop(backgroundPlayService)) {
                            z7 = true;
                        }
                    }
                    backgroundPlayService.f79601v = z7;
                    return;
                }
                if (BackgroundPlayService.access$isCurrentActivityActive(backgroundPlayService) && !BackgroundPlayService.access$isScreenLocked(backgroundPlayService) && i8 == 1) {
                    PlayerLog.i("BackgroundPlayService", this + ", try to restore player");
                    BackgroundPlayService.access$tryToRestorePlayer(backgroundPlayService);
                    boolean z8 = false;
                    if (BiliContext.isVisible()) {
                        z8 = false;
                        if (BackgroundPlayService.access$isCurrentActivityOnTop(backgroundPlayService)) {
                            z8 = true;
                        }
                    }
                    backgroundPlayService.f79601v = z8;
                    return;
                }
                if (BackgroundPlayService.access$isCurrentActivityOnTop(backgroundPlayService) || i8 != 1 || (iMiniPlayerWindowManager = backgroundPlayService.f79598s) == null || iMiniPlayerWindowManager.isMiniPlayerActive(true)) {
                    boolean z9 = false;
                    if (BiliContext.isVisible()) {
                        z9 = false;
                        if (BackgroundPlayService.access$isCurrentActivityOnTop(backgroundPlayService)) {
                            z9 = true;
                        }
                    }
                    backgroundPlayService.f79601v = z9;
                    return;
                }
                PlayerLog.i("BackgroundPlayService", this + ", inactive, pause anyway");
                IPlayerCoreService iPlayerCoreService = backgroundPlayService.f79583c;
                IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
                if (iPlayerCoreService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                    iPlayerCoreService2 = null;
                }
                iPlayerCoreService2.unregisterState(backgroundPlayService.f79580H);
                backgroundPlayService.f79585e = null;
                BackgroundPlayService.access$pausePlayerWithoutLock(backgroundPlayService);
                boolean z10 = false;
                if (BiliContext.isVisible()) {
                    z10 = false;
                    if (BackgroundPlayService.access$isCurrentActivityOnTop(backgroundPlayService)) {
                        z10 = true;
                    }
                }
                backgroundPlayService.f79601v = z10;
                return;
            }
            if (backgroundPlayService.f79601v && !BackgroundPlayService.access$isCurrentActivityActive(backgroundPlayService) && i8 == 0) {
                PlayerLog.i("BackgroundPlayService", this + ", background");
                backgroundPlayService.f79600u = true;
                BackgroundPlayService.access$tryToStartBackgroundPlay(backgroundPlayService);
            }
            if (!backgroundPlayService.f79601v && !BackgroundPlayService.access$isCurrentActivityActive(backgroundPlayService) && i8 == 1 && BiliContext.isVisible() && !BackgroundPlayService.access$isCurrentActivityOnTop(backgroundPlayService)) {
                PlayerLog.i("BackgroundPlayService", this + ", new page");
                IMiniPlayerWindowManager iMiniPlayerWindowManager2 = backgroundPlayService.f79598s;
                if (iMiniPlayerWindowManager2 != null && !iMiniPlayerWindowManager2.isMiniPlayerActive(true)) {
                    IPlayerCoreService iPlayerCoreService3 = backgroundPlayService.f79583c;
                    IPlayerCoreService iPlayerCoreService4 = iPlayerCoreService3;
                    if (iPlayerCoreService3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                        iPlayerCoreService4 = null;
                    }
                    iPlayerCoreService4.unregisterState(backgroundPlayService.f79580H);
                    backgroundPlayService.f79585e = null;
                    backgroundPlayService.e();
                }
            }
            if (!BackgroundPlayService.access$isCurrentActivityActive(backgroundPlayService) && !BiliContext.isVisible() && i8 == 1) {
                if (!backgroundPlayService.f79602w) {
                    PlayerLog.i("BackgroundPlayService", this + ", new process");
                    backgroundPlayService.f79602w = true;
                }
                IMiniPlayerWindowManager iMiniPlayerWindowManager3 = backgroundPlayService.f79598s;
                if (iMiniPlayerWindowManager3 != null && !iMiniPlayerWindowManager3.isMiniPlayerActive(true)) {
                    IPlayerCoreService iPlayerCoreService5 = backgroundPlayService.f79583c;
                    IPlayerCoreService iPlayerCoreService6 = iPlayerCoreService5;
                    if (iPlayerCoreService5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                        iPlayerCoreService6 = null;
                    }
                    iPlayerCoreService6.unregisterState(backgroundPlayService.f79580H);
                    backgroundPlayService.f79585e = null;
                    backgroundPlayService.e();
                }
            }
            if (backgroundPlayService.f79600u && BackgroundPlayService.access$isCurrentActivityActive(backgroundPlayService) && i8 > 0) {
                backgroundPlayService.f79600u = false;
                PlayerLog.i("BackgroundPlayService", this + ", foreground");
                IPlayerCoreService iPlayerCoreService7 = backgroundPlayService.f79583c;
                IPlayerCoreService iPlayerCoreService8 = iPlayerCoreService7;
                if (iPlayerCoreService7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                    iPlayerCoreService8 = null;
                }
                iPlayerCoreService8.unregisterState(backgroundPlayService.f79580H);
                backgroundPlayService.f79585e = null;
            }
            boolean z11 = false;
            if (BiliContext.isVisible()) {
                z11 = false;
                if (BackgroundPlayService.access$isCurrentActivityOnTop(backgroundPlayService)) {
                    z11 = true;
                }
            }
            backgroundPlayService.f79601v = z11;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/BackgroundPlayService$g.class */
    public static final class g implements VideoDirectorObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BackgroundPlayService f79612a;

        public g(BackgroundPlayService backgroundPlayService) {
            this.f79612a = backgroundPlayService;
        }

        public final void onPlayableParamsChanged(Video.PlayableParams playableParams) {
            BackgroundPlayService.access$updateMusicServiceMediaData(this.f79612a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/BackgroundPlayService$h.class */
    public static final class h implements PlayerStateObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BackgroundPlayService f79613a;

        public h(BackgroundPlayService backgroundPlayService) {
            this.f79613a = backgroundPlayService;
        }

        public final void onPlayerStateChanged(int i7) {
            this.f79613a.f79585e = Integer.valueOf(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/BackgroundPlayService$i.class */
    public static final class i implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BackgroundPlayService f79614a;

        public i(BackgroundPlayService backgroundPlayService) {
            this.f79614a = backgroundPlayService;
        }

        @Override // android.content.ServiceConnection
        public final void onNullBinding(ComponentName componentName) {
            PlayerLog.i("BackgroundPlay", "bind service but Binder is null");
            BackgroundPlayService.access$releaseWhenUnablePlayBack(this.f79614a);
            this.f79614a.e();
            this.f79614a.stopMusicService$playerbizcommon_apinkRelease();
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, tv.danmaku.biliplayerv2.collection.Collections$IteratorAction] */
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (!(iBinder instanceof BackgroundMusicService.b)) {
                PlayerLog.e("BackgroundPlay", "Illegal service error -> " + iBinder);
                return;
            }
            PlayerLog.i("BackgroundPlay", "onServiceConnected:" + componentName);
            this.f79614a.f79594o.forEach((Collections.IteratorAction) new Object());
            IPlayerContainer iPlayerContainer = this.f79614a.f79581a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getReporterService().report(new NeuronsEvents.Switch(NeuronsEvents.Switch.Type.PAGE_BACKGROUND, new String[]{"screen_long_edge", String.valueOf(dj1.b.b), "screen_short_edge", String.valueOf(dj1.b.c)}));
            BackgroundMusicService.b bVar = (BackgroundMusicService.b) iBinder;
            this.f79614a.f79591l = bVar.a();
            BackgroundMusicService backgroundMusicService = this.f79614a.f79591l;
            if (backgroundMusicService != null) {
                PlayerHeadsetService playerHeadsetService = (PlayerHeadsetService) this.f79614a.f79595p.getService();
                backgroundMusicService.o(playerHeadsetService != null ? playerHeadsetService.getMediaSession(false) : null);
            }
            BackgroundPlayService.access$getNotificationHelper(this.f79614a).a(bVar.a());
            PlayerHeadsetService playerHeadsetService2 = (PlayerHeadsetService) this.f79614a.f79595p.getService();
            if (playerHeadsetService2 != null) {
                playerHeadsetService2.updatePlaybackState();
            }
            this.f79614a.f79585e = null;
            this.f79614a.f79588i = true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            PlayerLog.i("BackgroundPlay", "onServiceDisconnected:" + componentName);
            this.f79614a.f79588i = false;
            BackgroundPlayService.access$getNotificationHelper(this.f79614a).a(null);
            PlayerHeadsetService playerHeadsetService = (PlayerHeadsetService) this.f79614a.f79595p.getService();
            if (playerHeadsetService != null) {
                playerHeadsetService.updatePlaybackState();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/BackgroundPlayService$j.class */
    public static final class j implements InterfaceC8756d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BackgroundPlayService f79615a;

        public j(BackgroundPlayService backgroundPlayService) {
            this.f79615a = backgroundPlayService;
        }

        @Override // uq0.InterfaceC8756d
        public final void a() {
            BackgroundPlayService backgroundPlayService = this.f79615a;
            if (backgroundPlayService.isEnable() || backgroundPlayService.b()) {
                BackgroundPlayService.access$getNotificationHelper(backgroundPlayService).e();
            } else {
                PlayerLog.i("BackgroundPlayService", "background play not enable, stop notification");
                BackgroundPlayService.access$getNotificationHelper(backgroundPlayService).d();
            }
        }

        @Override // uq0.InterfaceC8756d
        public final void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            BackgroundPlayService backgroundPlayService = this.f79615a;
            if (!backgroundPlayService.isEnable() && !backgroundPlayService.b()) {
                PlayerLog.i("BackgroundPlayService", "background play not enable, stop notification");
                BackgroundPlayService.access$getNotificationHelper(backgroundPlayService).d();
            } else {
                if (playbackStateCompat == null || !(playbackStateCompat.getState() == 1 || playbackStateCompat.getState() == 0)) {
                    BackgroundPlayService.access$getNotificationHelper(backgroundPlayService).e();
                    return;
                }
                PlayerLog.i("BackgroundPlayService", "notification will stop,state =" + playbackStateCompat.getState());
                BackgroundPlayService.access$getNotificationHelper(backgroundPlayService).d();
            }
        }

        @Override // uq0.InterfaceC8756d
        public final void onSessionDestroyed() {
            BackgroundPlayService.access$getNotificationHelper(this.f79615a).c();
        }

        @Override // uq0.InterfaceC8756d
        public final void onSessionReady() {
            BackgroundPlayService backgroundPlayService = this.f79615a;
            Lq0.d dVarAccess$getNotificationHelper = BackgroundPlayService.access$getNotificationHelper(backgroundPlayService);
            PlayerHeadsetService playerHeadsetService = (PlayerHeadsetService) backgroundPlayService.f79595p.getService();
            Lq0.b mediaSessionPlayback = null;
            MediaSessionCompat mediaSession = playerHeadsetService != null ? playerHeadsetService.getMediaSession(false) : null;
            PlayerHeadsetService playerHeadsetService2 = (PlayerHeadsetService) backgroundPlayService.f79595p.getService();
            if (playerHeadsetService2 != null) {
                mediaSessionPlayback = playerHeadsetService2.getMediaSessionPlayback();
            }
            dVarAccess$getNotificationHelper.b(mediaSession, mediaSessionPlayback);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [com.bilibili.playerbizcommon.features.background.c] */
    public BackgroundPlayService() {
        BLRouter bLRouter = BLRouter.INSTANCE;
        this.f79597r = (MiniPlayerAutoPlaySetting) BLRouter.get$default(bLRouter, MiniPlayerAutoPlaySetting.class, (String) null, 2, (Object) null);
        this.f79598s = (IMiniPlayerWindowManager) BLRouter.get$default(bLRouter, IMiniPlayerWindowManager.class, (String) null, 2, (Object) null);
        this.f79604y = LazyKt.lazy(new X61.b(this, 1));
        this.f79605z = new e(this);
        this.f79573A = new j(this);
        this.f79574B = new f(this);
        this.f79575C = new c(this);
        this.f79576D = new i(this);
        this.f79577E = new g(this);
        final int i7 = 0;
        this.f79578F = new Runnable(this, i7) { // from class: com.bilibili.playerbizcommon.features.background.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f79618a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f79619b;

            {
                this.f79618a = i7;
                this.f79619b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f79618a) {
                    case 0:
                        BackgroundPlayService backgroundPlayService = (BackgroundPlayService) this.f79619b;
                        if (!backgroundPlayService.f79588i) {
                            PlayerLog.i("BackgroundPlay", "has not attach service");
                        } else {
                            PlayerLog.i("BackgroundPlay", "background open audio only");
                            IPlayerCoreService iPlayerCoreService = backgroundPlayService.f79583c;
                            IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
                            if (iPlayerCoreService == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                                iPlayerCoreService2 = null;
                            }
                            iPlayerCoreService2.setAudioOnly(true);
                        }
                        break;
                    default:
                        v1 v1Var = (v1) this.f79619b;
                        v1Var.d.setVisibility(8);
                        v1Var.b.z.setValue(Boolean.FALSE);
                        break;
                }
            }
        };
        this.f79579G = new d();
        this.f79580H = new h(this);
    }

    public static final Lq0.d access$getNotificationHelper(BackgroundPlayService backgroundPlayService) {
        return (Lq0.d) backgroundPlayService.f79604y.getValue();
    }

    public static final boolean access$isCurrentActivityActive(BackgroundPlayService backgroundPlayService) {
        IPlayerContainer iPlayerContainer = backgroundPlayService.f79581a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        return iPlayerContainer2.getActivityStateService().getLifecycleState().compareTo(LifecycleState.ACTIVITY_PAUSE) < 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean access$isCurrentActivityOnTop(com.bilibili.playerbizcommon.features.background.BackgroundPlayService r3) {
        /*
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            android.app.Activity r0 = com.bilibili.base.BiliContext.topActivity()
            if (r0 == 0) goto L32
            android.app.Activity r0 = com.bilibili.base.BiliContext.topActivity()
            r6 = r0
            r0 = r3
            tv.danmaku.biliplayerv2.PlayerContainer r0 = r0.f79581a
            r5 = r0
            r0 = r5
            r3 = r0
            r0 = r5
            if (r0 != 0) goto L22
            java.lang.String r0 = "mPlayerContainer"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r3 = r0
        L22:
            r0 = r6
            r1 = r3
            android.content.Context r1 = r1.getContext()
            androidx.fragment.app.FragmentActivity r1 = kntr.base.android.legacy.context.ContextUtilKt.findFragmentActivityOrNull(r1)
            if (r0 != r1) goto L32
            r0 = 1
            r4 = r0
            goto L34
        L32:
            r0 = 0
            r4 = r0
        L34:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.background.BackgroundPlayService.access$isCurrentActivityOnTop(com.bilibili.playerbizcommon.features.background.BackgroundPlayService):boolean");
    }

    public static final boolean access$isEnableInternal(BackgroundPlayService backgroundPlayService) {
        boolean zB;
        if (backgroundPlayService.h) {
            z50.a aVar = PlayerCloudSetting.a;
            zB = PlayerCloudSetting.b(PlayerCloudSetting.Setting.BackgroundPlay);
        } else {
            zB = backgroundPlayService.f79587g;
        }
        return zB;
    }

    public static final boolean access$isInMultiWindowMode(BackgroundPlayService backgroundPlayService, Context context) {
        backgroundPlayService.getClass();
        return (context instanceof Activity) && ((Activity) context).isInMultiWindowMode();
    }

    public static final boolean access$isScreenLocked(BackgroundPlayService backgroundPlayService) {
        PlayerContainer playerContainer = backgroundPlayService.f79581a;
        PowerManager powerManager = null;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(playerContainer2.getContext());
        Object systemService = activityFindActivityOrNull != null ? activityFindActivityOrNull.getSystemService("power") : null;
        if (systemService instanceof PowerManager) {
            powerManager = (PowerManager) systemService;
        }
        boolean z6 = false;
        if (powerManager != null) {
            z6 = false;
            if (powerManager.isInteractive()) {
                z6 = true;
            }
        }
        return !z6;
    }

    public static final void access$pausePlayerWithoutLock(BackgroundPlayService backgroundPlayService) {
        if (backgroundPlayService.f79584d == 4) {
            IPlayerCoreService iPlayerCoreService = backgroundPlayService.f79583c;
            IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
            if (iPlayerCoreService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                iPlayerCoreService2 = null;
            }
            iPlayerCoreService2.pause();
        }
    }

    public static final void access$releaseWhenUnablePlayBack(BackgroundPlayService backgroundPlayService) {
        IPlayerCoreService iPlayerCoreService = backgroundPlayService.f79583c;
        IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
        if (iPlayerCoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
            iPlayerCoreService2 = null;
        }
        iPlayerCoreService2.unregisterState(backgroundPlayService.f79580H);
        backgroundPlayService.f79585e = null;
        backgroundPlayService.f();
    }

    public static final void access$stopBackground(BackgroundPlayService backgroundPlayService) {
        if (backgroundPlayService.isBackgroundRunning() || BackgroundMusicService.g || BackgroundMusicService.f) {
            backgroundPlayService.stopMusicService$playerbizcommon_apinkRelease();
        }
    }

    public static final void access$tryToRestorePlayer(BackgroundPlayService backgroundPlayService) {
        IPlayerCoreService iPlayerCoreService = backgroundPlayService.f79583c;
        IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
        if (iPlayerCoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
            iPlayerCoreService2 = null;
        }
        iPlayerCoreService2.tryToRestoreFromShutDownByOthers();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void access$tryToStartBackgroundPlay(com.bilibili.playerbizcommon.features.background.BackgroundPlayService r7) {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.background.BackgroundPlayService.access$tryToStartBackgroundPlay(com.bilibili.playerbizcommon.features.background.BackgroundPlayService):void");
    }

    public static final void access$updateMusicServiceMediaData(BackgroundPlayService backgroundPlayService) {
        if (backgroundPlayService.f79588i) {
            backgroundPlayService.a();
        }
    }

    public final void a() {
        Class<?> cls;
        try {
            PlayerContainer playerContainer = this.f79581a;
            PlayerContainer playerContainer2 = playerContainer;
            if (playerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer2 = null;
            }
            Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(playerContainer2.getContext());
            if (activityFindActivityOrNull == null) {
                PlayerLog.i("BackgroundPlay", "start background play fail,Because of activity is null");
                return;
            }
            BackgroundMusicService.g = true;
            activityFindActivityOrNull.bindService(new Intent(activityFindActivityOrNull, (Class<?>) BackgroundMusicService.class), this.f79576D, 1);
            Intent intent = new Intent(activityFindActivityOrNull, (Class<?>) BackgroundMusicService.class);
            Intent intent2 = activityFindActivityOrNull.getIntent();
            if (intent2 != null) {
                Intent intent3 = new Intent(intent2);
                intent3.putExtra(BUNDLE_KEY_FROM_NOTIFICATION, true);
                intent.putExtra("intent.data", intent3);
            }
            intent.putExtra("activity.class", activityFindActivityOrNull.getClass());
            try {
                String string = activityFindActivityOrNull.getPackageManager().getActivityInfo(activityFindActivityOrNull.getComponentName(), 128).metaData.getString("android.support.PARENT_ACTIVITY");
                cls = string == null ? null : Class.forName(string);
            } catch (Exception e7) {
                PlayerLog.e("BackgroundPlay", "MainActivity not found! " + e7);
                cls = null;
            }
            if (cls != null) {
                intent.putExtra("activity.main.class", cls);
            }
            activityFindActivityOrNull.startService(intent);
        } catch (Exception e8) {
            this.f79588i = false;
            PlayerLog.w("BackgroundPlay", "bindService", e8);
        }
    }

    public void addBackgroundPlayEventObserver(@NotNull com.bilibili.playerbizcommon.features.background.g gVar) {
        Collections.SafeIteratorList<com.bilibili.playerbizcommon.features.background.g> safeIteratorList = this.f79594o;
        if (safeIteratorList.contains(gVar)) {
            return;
        }
        safeIteratorList.add(gVar);
    }

    public final boolean b() {
        return this.f79596q && isAvailable();
    }

    public void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f79581a = playerContainer;
    }

    public final void c() {
        if (d()) {
            return;
        }
        Job job = this.f79599t;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        LifecycleOwner lifecycleOwner = this.f79582b;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (lifecycleOwner == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityStateService");
            lifecycleOwner2 = null;
        }
        this.f79599t = BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new BackgroundPlayService$initTopActivityObserve$1(this, null), 3, (Object) null);
    }

    public final boolean d() {
        PlayerContainer playerContainer = null;
        InterfaceC1405e interfaceC1405e = (InterfaceC1405e) BLRouter.get$default(BLRouter.INSTANCE, InterfaceC1405e.class, (String) null, 2, (Object) null);
        boolean z6 = false;
        if (interfaceC1405e != null) {
            PlayerContainer playerContainer2 = this.f79581a;
            if (playerContainer2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            } else {
                playerContainer = playerContainer2;
            }
            z6 = false;
            if (interfaceC1405e.b(playerContainer.getContext())) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void e() {
        DisablePlayLock disablePlayLock = this.f79590k;
        if (disablePlayLock == null || !disablePlayLock.isHeld()) {
            IPlayerCoreService iPlayerCoreService = this.f79583c;
            IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
            if (iPlayerCoreService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                iPlayerCoreService2 = null;
            }
            this.f79590k = iPlayerCoreService2.acquireDisablePlayLock("BackgroundPlayService");
        }
        if (this.f79584d == 4) {
            IPlayerCoreService iPlayerCoreService3 = this.f79583c;
            if (iPlayerCoreService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                iPlayerCoreService3 = null;
            }
            iPlayerCoreService3.pause();
        }
    }

    public final void f() {
        synchronized (this) {
            Lazy lazy = Aj.f.p;
            f.a.a().h("BackgroundPlayService");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isAvailable() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.playerbizcommon.features.background.BackgroundPlayService$b r0 = r0.f79593n
            r6 = r0
            r0 = 0
            r5 = r0
            r0 = r6
            if (r0 == 0) goto L32
            r0 = r6
            boolean r0 = r0.b()
            if (r0 != 0) goto L32
            r0 = r2
            com.bilibili.playerbizcommon.features.background.BackgroundPlayService$b r0 = r0.f79593n
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L2d
            r0 = r6
            boolean r0 = r0.a()
            r3 = r0
            goto L8e
        L2d:
            r0 = 1
            r3 = r0
            goto L8e
        L32:
            r0 = r2
            tv.danmaku.biliplayerv2.PlayerContainer r0 = r0.f79581a
            r8 = r0
            r0 = 0
            r7 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            if (r0 != 0) goto L4d
            java.lang.String r0 = "mPlayerContainer"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r6 = r0
        L4d:
            r0 = r6
            tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService r0 = r0.getPlayerSettingService()
            Oi1.d r0 = r0.getCloudConfig()
            boolean r0 = r0.s()
            if (r0 == 0) goto L8c
            r0 = r2
            tv.danmaku.biliplayerv2.PlayerContainer r0 = r0.f79581a
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L77
            java.lang.String r0 = "mPlayerContainer"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = r7
            r6 = r0
            goto L77
        L77:
            r0 = r6
            tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService r0 = r0.getPlayerSettingService()
            Oi1.d r0 = r0.getCloudConfig()
            boolean r0 = r0.h()
            if (r0 != 0) goto L8c
            goto L2d
        L8c:
            r0 = 0
            r3 = r0
        L8e:
            r0 = r5
            r4 = r0
            r0 = r2
            boolean r0 = r0.f79586f
            if (r0 == 0) goto L9f
            r0 = r5
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L9f
            r0 = 1
            r4 = r0
        L9f:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.background.BackgroundPlayService.isAvailable():boolean");
    }

    @Override // com.bilibili.playerbizcommon.features.background.h
    public boolean isBackgroundRunning() {
        return this.f79588i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @Override // com.bilibili.playerbizcommon.features.background.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isEnable() {
        /*
            r2 = this;
            r0 = r2
            boolean r0 = r0.isAvailable()
            if (r0 == 0) goto L2a
            r0 = r2
            boolean r0 = r0.h
            if (r0 == 0) goto L1c
            z50.a r0 = com.bilibili.lib.media.util.PlayerCloudSetting.a
            r4 = r0
            com.bilibili.lib.media.util.PlayerCloudSetting$Setting r0 = com.bilibili.lib.media.util.PlayerCloudSetting.Setting.BackgroundPlay
            boolean r0 = com.bilibili.lib.media.util.PlayerCloudSetting.b(r0)
            r3 = r0
            goto L21
        L1c:
            r0 = r2
            boolean r0 = r0.f79587g
            r3 = r0
        L21:
            r0 = r3
            if (r0 == 0) goto L2a
            r0 = 1
            r3 = r0
            goto L2c
        L2a:
            r0 = 0
            r3 = r0
        L2c:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.background.BackgroundPlayService.isEnable():boolean");
    }

    @Override // com.bilibili.playerbizcommon.features.background.h
    public boolean isSettingAvailable() {
        return this.f79586f;
    }

    public void onAttachByShared(@NotNull PlayerSharingType playerSharingType, @Nullable PlayerSharingBundle playerSharingBundle) {
        this.f79589j = false;
        this.f79603x = true;
        c();
    }

    public void onCollectSharedParams(@NotNull PlayerSharingType playerSharingType, @NotNull PlayerSharingBundle playerSharingBundle) {
        Job job = this.f79599t;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f79599t = null;
        this.f79589j = true;
        this.f79603x = false;
        HandlerThreads.remove(0, this.f79578F);
        PlayerLog.i("BackgroundPlay", "bg service ready to share");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStart(@org.jetbrains.annotations.Nullable tv.danmaku.biliplayerv2.PlayerSharingBundle r8) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.background.BackgroundPlayService.onStart(tv.danmaku.biliplayerv2.PlayerSharingBundle):void");
    }

    public void onStop() {
        Job job = this.f79599t;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f79599t = null;
        IPCAppStateManager.getInstance().removeIPCActivityStateCallback(this.f79574B);
        f();
        PlayerServiceManager.Client<PlayerHeadsetService> client = this.f79595p;
        PlayerHeadsetService playerHeadsetService = (PlayerHeadsetService) client.getService();
        if (playerHeadsetService != null) {
            playerHeadsetService.setMediaSessionControllerCallback(null);
        }
        IPlayerContainer iPlayerContainer = this.f79581a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerServiceManager().unbindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(PlayerHeadsetService.class), client);
        BiliContext.unregisterActivityStateCallback(this.f79579G);
        IPlayerContainer iPlayerContainer3 = this.f79581a;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        iPlayerContainer4.getPlayerSettingService().removeCloudConfigObserver(this.f79605z);
        IPlayerCoreService iPlayerCoreService = this.f79583c;
        IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
        if (iPlayerCoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
            iPlayerCoreService2 = null;
        }
        iPlayerCoreService2.unregisterState(this.f79580H);
        IActivityStateService iActivityStateService = this.f79582b;
        IActivityStateService iActivityStateService2 = iActivityStateService;
        if (iActivityStateService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityStateService");
            iActivityStateService2 = null;
        }
        iActivityStateService2.unregisterLifecycle(this.f79575C);
        IPlayerContainer iPlayerContainer5 = this.f79581a;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer5 = null;
        }
        PlayerContainerKt.getPlayDirector(iPlayerContainer5).removeVideoDirectorObserver(this.f79577E);
        HandlerThreads.remove(0, this.f79578F);
        stopMusicService$playerbizcommon_apinkRelease();
    }

    public void removeBackgroundPlayEventObserver(@NotNull com.bilibili.playerbizcommon.features.background.g gVar) {
        this.f79594o.remove(gVar);
    }

    @NotNull
    public PlayerServiceManager.ServiceConfig serviceConfig() {
        return PlayerServiceManager.ServiceConfig.Companion.obtain(true);
    }

    public void setAlwaysDisplayBackgroundControls(boolean z6) {
        this.f79596q = z6;
    }

    public void setCustomBackgroundDataProvider(@Nullable com.bilibili.playerbizcommon.features.background.a aVar) {
        Lq0.b mediaSessionPlayback;
        if (aVar == null) {
            return;
        }
        aVar.f79617b = this.f79592m;
        PlayerHeadsetService playerHeadsetService = (PlayerHeadsetService) this.f79595p.getService();
        if (playerHeadsetService == null || (mediaSessionPlayback = playerHeadsetService.getMediaSessionPlayback()) == null) {
            return;
        }
        mediaSessionPlayback.h(aVar);
    }

    @Override // com.bilibili.playerbizcommon.features.background.h
    public void setEnable(boolean z6) {
        setEnable(z6, true);
    }

    public void setEnable(boolean z6, boolean z7) {
        if (!z6 || isAvailable()) {
            if (z7) {
                z50.a aVar = PlayerCloudSetting.a;
                PlayerCloudSetting.d(PlayerCloudSetting.Setting.BackgroundPlay, z6, false);
                PlayerLog.i("BackgroundPlay", "background play set enable is " + z6);
            }
            this.f79587g = z6;
            this.h = z7;
            if (z6) {
                return;
            }
            IPlayerCoreService iPlayerCoreService = this.f79583c;
            IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
            if (iPlayerCoreService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                iPlayerCoreService2 = null;
            }
            iPlayerCoreService2.unregisterState(this.f79580H);
            this.f79585e = null;
        }
    }

    public final void setEnabledExtraJudge(@Nullable b bVar) {
        this.f79593n = bVar;
    }

    public final void setFixedPlayMode(int i7) {
        this.f79592m.f79622b = i7;
        PlayerHeadsetService playerHeadsetService = (PlayerHeadsetService) this.f79595p.getService();
        if (playerHeadsetService != null) {
            playerHeadsetService.updatePlaybackState();
        }
    }

    @Override // com.bilibili.playerbizcommon.features.background.h
    public void setSettingAvailable(boolean z6) {
        this.f79586f = z6;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, tv.danmaku.biliplayerv2.collection.Collections$IteratorAction] */
    public final void stopMusicService$playerbizcommon_apinkRelease() {
        boolean z6 = this.f79588i;
        boolean z7 = BackgroundMusicService.f;
        boolean z8 = BackgroundMusicService.g;
        StringBuilder sbA = c6.Q.a("isAttachToService: ", ", isRunning: ", ", isStarting: ", z6, z7);
        sbA.append(z8);
        PlayerLog.i("BackgroundPlay", sbA.toString());
        if (this.f79588i || BackgroundMusicService.f || BackgroundMusicService.g) {
            this.f79594o.forEach((Collections.IteratorAction) new Object());
            IPlayerContainer iPlayerContainer = this.f79581a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getReporterService().report(new NeuronsEvents.Switch(NeuronsEvents.Switch.Type.BACKGROUND_PAGE, new String[]{"screen_long_edge", String.valueOf(dj1.b.b), "screen_short_edge", String.valueOf(dj1.b.c)}));
            PlayerContainer playerContainer = this.f79581a;
            PlayerContainer playerContainer2 = playerContainer;
            if (playerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer2 = null;
            }
            Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(playerContainer2.getContext());
            if (activityFindActivityOrNull != null) {
                try {
                    activityFindActivityOrNull.unbindService(this.f79576D);
                } catch (IllegalArgumentException e7) {
                    PlayerLog.e("BackgroundPlay", "WTF! Service not registered when serviceBind is true!!");
                }
            }
            Lazy lazy = this.f79604y;
            ((Lq0.d) lazy.getValue()).a(null);
            ((Lq0.d) lazy.getValue()).d();
            PlayerHeadsetService playerHeadsetService = (PlayerHeadsetService) this.f79595p.getService();
            if (playerHeadsetService != null) {
                playerHeadsetService.updatePlaybackState();
            }
            this.f79588i = false;
            this.f79591l = null;
            HandlerThreads.remove(0, this.f79578F);
            IPlayerCoreService iPlayerCoreService = this.f79583c;
            if (iPlayerCoreService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                iPlayerCoreService = null;
            }
            iPlayerCoreService.setAudioOnly(false);
            PlayerLog.i("BackgroundPlay", "background close audio only");
            if (activityFindActivityOrNull != null) {
                try {
                    activityFindActivityOrNull.stopService(new Intent(activityFindActivityOrNull, (Class<?>) BackgroundMusicService.class));
                } catch (Exception e8) {
                    PlayerLog.e("BackgroundPlay", e8);
                }
            }
            PlayerLog.i("BackgroundPlay", "stop background music service");
        }
    }

    public void switchPlayModeEnable(boolean z6) {
        this.f79592m.f79623c = z6;
        PlayerHeadsetService playerHeadsetService = (PlayerHeadsetService) this.f79595p.getService();
        if (playerHeadsetService != null) {
            playerHeadsetService.updatePlaybackState();
        }
    }

    public void useNewNotificationType() {
        this.f79592m.f79621a = 1;
        PlayerHeadsetService playerHeadsetService = (PlayerHeadsetService) this.f79595p.getService();
        if (playerHeadsetService != null) {
            playerHeadsetService.updatePlaybackState();
        }
    }

    public final void useOldNotificationType() {
        this.f79592m.f79621a = 0;
        PlayerHeadsetService playerHeadsetService = (PlayerHeadsetService) this.f79595p.getService();
        if (playerHeadsetService != null) {
            playerHeadsetService.updatePlaybackState();
        }
    }
}
