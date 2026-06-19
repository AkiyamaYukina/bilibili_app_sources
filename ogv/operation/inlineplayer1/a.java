package com.bilibili.ogv.operation.inlineplayer1;

import I3.A1;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ad.adview.pegasus.holders.inline.pegasus.m;
import com.bilibili.base.BiliContext;
import com.bilibili.bililive.camera.CameraManager;
import com.bilibili.column.ui.upper.ColumnArticleEditActivity;
import com.bilibili.fd_service.FreeDataManager;
import com.bilibili.fd_service.demiware.DemiwareCondition;
import com.bilibili.fd_service.demiware.DemiwareEndReason;
import com.bilibili.fd_service.demiware.DemiwareListener;
import com.bilibili.lib.tf.TfChangeCallback;
import com.bilibili.lib.tf.TfTypeExt;
import com.bilibili.ogv.operation.inlineplayer1.OGVBannerInlinePlayerFragment;
import com.bilibili.playerbizcommon.features.network.INetworkAlertHandler;
import com.bilibili.playerbizcommon.features.network.IPlayerNetworkService;
import com.bilibili.playerbizcommon.features.network.PlayerNetworkFunctionWidget;
import com.bilibili.playerbizcommon.features.network.ShowAlertMode;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import com.bilibili.playerbizcommon.features.network.VideoEnvironmentObserver;
import com.vivo.libra.ILibraSdk;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.HookErrorType;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.PlayerSharingType;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.CurrentVideoPointer;
import tv.danmaku.biliplayerv2.service.IActivityStateService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerReleaseObserver;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;
import tv.danmaku.biliplayerv2.service.LifecycleObserver;
import tv.danmaku.biliplayerv2.service.LifecycleState;
import tv.danmaku.biliplayerv2.service.OnMeteredNetworkUrlHookListener;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.ResolveListener;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.lock.DisablePlayLock;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.ijk.media.player.IjkNetworkUtils;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer1/a.class */
@StabilityInferred(parameters = 0)
public final class a implements IPlayerNetworkService, OnMeteredNetworkUrlHookListener, LifecycleObserver {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final ReentrantLock f70231x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Condition f70232y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f70233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public VideoEnvironment f70234b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public OGVBannerInlinePlayerFragment.a f70236d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f70238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public INetworkAlertHandler f70239g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public DisablePlayLock f70240i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f70243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f70244m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f70246o;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerCoreService f70252u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @InjectPlayerService
    private IVideosPlayDirectorService f70253v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @InjectPlayerService
    private IActivityStateService f70254w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<VideoEnvironmentObserver> f70235c = com.bilibili.app.dialogmanager2.c.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public ShowAlertMode f70237e = ShowAlertMode.EveryTime;
    public boolean h = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f70241j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public IjkNetworkUtils.NetWorkType f70242k = IjkNetworkUtils.NetWorkType.NONE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f70245n = LazyKt.lazy(new A1(3));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final d f70247p = new d(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final b f70248q = new b(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final e f70249r = new e(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final c f70250s = new c(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Handler f70251t = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.bilibili.ogv.operation.inlineplayer1.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer1/a$a.class */
    public static final /* synthetic */ class C0427a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f70255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f70256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int[] f70257c;

        static {
            int[] iArr = new int[VideoEnvironment.values().length];
            try {
                iArr[VideoEnvironment.DRM_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[VideoEnvironment.THIRD_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[VideoEnvironment.MOBILE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[VideoEnvironment.FREE_DATA_FAIL.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[VideoEnvironment.FREE_DATA_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f70255a = iArr;
            int[] iArr2 = new int[TfTypeExt.values().length];
            try {
                iArr2[TfTypeExt.C_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr2[TfTypeExt.U_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr2[TfTypeExt.T_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr2[TfTypeExt.C_PKG.ordinal()] = 4;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr2[TfTypeExt.U_PKG.ordinal()] = 5;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr2[TfTypeExt.T_PKG.ordinal()] = 6;
            } catch (NoSuchFieldError e17) {
            }
            f70256b = iArr2;
            int[] iArr3 = new int[ShowAlertMode.values().length];
            try {
                iArr3[ShowAlertMode.None.ordinal()] = 1;
            } catch (NoSuchFieldError e18) {
            }
            f70257c = iArr3;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer1/a$b.class */
    public static final class b implements DemiwareListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f70258a;

        public b(a aVar) {
            this.f70258a = aVar;
        }

        public final void onDemiwareEnd(DemiwareEndReason demiwareEndReason) {
            ReentrantLock reentrantLock = a.f70231x;
            this.f70258a.getClass();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer1/a$c.class */
    public static final class c implements IPlayerReleaseObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f70259a;

        public c(a aVar) {
            this.f70259a = aVar;
        }

        public final void onPlayerItemRelease() {
            a aVar = this.f70259a;
            aVar.f70238f = false;
            aVar.f();
        }

        public final void onPlayerItemWillChanged() {
            a aVar = this.f70259a;
            aVar.f70238f = false;
            aVar.f();
        }

        public final void onPlayerWillRelease() {
            a aVar = this.f70259a;
            aVar.f70238f = false;
            aVar.f();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer1/a$d.class */
    public static final class d extends TfChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f70260a;

        public d(a aVar) {
            this.f70260a = aVar;
        }

        @Override // com.bilibili.lib.tf.TfChangeCallback
        public final void OnTfChange() {
            ReentrantLock reentrantLock = a.f70231x;
            a aVar = this.f70260a;
            FreeDataManager freeDataManagerE = aVar.e();
            aVar.f70243l = freeDataManagerE != null ? freeDataManagerE.isTf() : false;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer1/a$e.class */
    public static final class e implements IVideosPlayDirectorService.VideoPlayEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f70261a;

        public e(a aVar) {
            this.f70261a = aVar;
        }

        public final void onVideoItemCompleted(CurrentVideoPointer currentVideoPointer, Video video) {
        }

        public final void onVideoItemStart(CurrentVideoPointer currentVideoPointer, Video video) {
            DemiwareCondition demiwareConditionCheckDemiwareCondition;
            a aVar = this.f70261a;
            aVar.f70241j = true;
            FreeDataManager freeDataManagerE = aVar.e();
            if (freeDataManagerE == null || (demiwareConditionCheckDemiwareCondition = freeDataManagerE.checkDemiwareCondition()) == null) {
                return;
            }
            demiwareConditionCheckDemiwareCondition.isDemiware();
        }

        public final void onVideoItemWillChange(CurrentVideoPointer currentVideoPointer, CurrentVideoPointer currentVideoPointer2, Video video) {
            super.onVideoItemWillChange(currentVideoPointer, currentVideoPointer2, video);
            a aVar = this.f70261a;
            aVar.f70238f = false;
            aVar.f();
            aVar.getClass();
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f70231x = reentrantLock;
        f70232y = reentrantLock.newCondition();
    }

    public static void a(a aVar) {
        VideoEnvironment videoEnvironment = aVar.f70234b;
        VideoEnvironment videoEnvironment2 = VideoEnvironment.WIFI_FREE;
        aVar.f70234b = videoEnvironment2;
        PlayerLog.i("PlayerNetworkService", "disable play false on network wifi");
        DisablePlayLock disablePlayLock = aVar.f70240i;
        if (disablePlayLock != null && disablePlayLock.isHeld()) {
            IPlayerCoreService iPlayerCoreService = aVar.f70252u;
            IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
            if (iPlayerCoreService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
                iPlayerCoreService2 = null;
            }
            iPlayerCoreService2.releaseDisablePlayLock(aVar.f70240i);
            aVar.f70240i = null;
        }
        if (videoEnvironment != videoEnvironment2 && videoEnvironment != VideoEnvironment.FREE_DATA_SUCCESS) {
            aVar.g();
        }
        Iterator<VideoEnvironmentObserver> it = aVar.f70235c.iterator();
        while (it.hasNext()) {
            it.next().onVideoEnvironmentChanged(aVar.f70234b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.bilibili.ogv.operation.inlineplayer1.a r9, tv.danmaku.ijk.media.player.IjkNetworkUtils.NetWorkType r10, kotlin.jvm.internal.Ref.ObjectRef r11) {
        /*
            Method dump skipped, instruction units count: 931
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation.inlineplayer1.a.b(com.bilibili.ogv.operation.inlineplayer1.a, tv.danmaku.ijk.media.player.IjkNetworkUtils$NetWorkType, kotlin.jvm.internal.Ref$ObjectRef):void");
    }

    public static void c(a aVar) {
        if (aVar.f70238f) {
            aVar.f70238f = false;
            PlayerContainer playerContainer = aVar.f70233a;
            PlayerContainer playerContainer2 = playerContainer;
            if (playerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer2 = null;
            }
            Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(playerContainer2.getContext());
            boolean z6 = false;
            if (activityFindActivityOrNull != null) {
                z6 = false;
                if (BiliContext.topActivity() == activityFindActivityOrNull) {
                    z6 = true;
                }
            }
            if (aVar.h && z6) {
                IPlayerCoreService iPlayerCoreService = aVar.f70252u;
                if (iPlayerCoreService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
                    iPlayerCoreService = null;
                }
                iPlayerCoreService.resume();
            }
        }
    }

    public static void d(PlayerSharingBundle playerSharingBundle, a aVar) {
        if (playerSharingBundle == null || !playerSharingBundle.getBundle().getBoolean("key_share_dialog_is_showing")) {
            return;
        }
        PlayerLog.i("PlayerNetworkService", "disable play true on network share");
        DisablePlayLock disablePlayLock = aVar.f70240i;
        if (disablePlayLock == null || !disablePlayLock.isHeld()) {
            IPlayerCoreService iPlayerCoreService = aVar.f70252u;
            IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
            if (iPlayerCoreService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
                iPlayerCoreService2 = null;
            }
            aVar.f70240i = iPlayerCoreService2.acquireDisablePlayLock("backgroundPlay");
        }
        OGVBannerInlinePlayerFragment.a aVar2 = aVar.f70236d;
        if (aVar2 != null) {
            aVar2.b(true);
        }
        aVar.f70238f = playerSharingBundle.getBundle().getBoolean("key_share_resume_when_unlock");
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public final void allowToContinuePlay() {
        PlayerLog.i("PlayerNetworkService", "user allow mobile network play");
        OGVBannerInlinePlayerFragment.a aVar = this.f70236d;
        if (aVar != null) {
            aVar.b(false);
        }
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f70233a = playerContainer;
    }

    public final FreeDataManager e() {
        return (FreeDataManager) this.f70245n.getValue();
    }

    public final void f() {
        PlayerLog.i("PlayerNetworkService", "disable play false on network lock release");
        DisablePlayLock disablePlayLock = this.f70240i;
        if (disablePlayLock != null && disablePlayLock.isHeld()) {
            IPlayerCoreService iPlayerCoreService = this.f70252u;
            IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
            if (iPlayerCoreService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
                iPlayerCoreService2 = null;
            }
            iPlayerCoreService2.releaseDisablePlayLock(this.f70240i);
            this.f70240i = null;
        }
        ReentrantLock reentrantLock = f70231x;
        reentrantLock.lock();
        try {
            PlayerLog.i("PlayerNetworkService", "notify ijk thread");
            f70232y.signalAll();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void g() {
        PlayerLog.i("PlayerNetworkService", "disable play false on network lock release and play");
        DisablePlayLock disablePlayLock = this.f70240i;
        if (disablePlayLock != null && disablePlayLock.isHeld()) {
            IPlayerCoreService iPlayerCoreService = this.f70252u;
            IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
            if (iPlayerCoreService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
                iPlayerCoreService2 = null;
            }
            iPlayerCoreService2.releaseDisablePlayLock(this.f70240i);
            this.f70240i = null;
        }
        ReentrantLock reentrantLock = f70231x;
        reentrantLock.lock();
        try {
            final int i7 = 0;
            this.f70251t.post(new Runnable(this, i7) { // from class: Mk0.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f16211a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f16212b;

                {
                    this.f16211a = i7;
                    this.f16212b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f16211a) {
                        case 0:
                            com.bilibili.ogv.operation.inlineplayer1.a.c((com.bilibili.ogv.operation.inlineplayer1.a) this.f16212b);
                            break;
                        case 1:
                            ColumnArticleEditActivity columnArticleEditActivity = (ColumnArticleEditActivity) this.f16212b;
                            int[] iArr = ColumnArticleEditActivity.v0;
                            columnArticleEditActivity.U6();
                            break;
                        default:
                            py.a aVar = ((CameraManager) this.f16212b).e;
                            if (aVar != null) {
                                aVar.g();
                            }
                            break;
                    }
                }
            });
            PlayerLog.i("PlayerNetworkService", "notify ijk thread");
            f70232y.signalAll();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public final long getCurrentMediaSize() {
        return 0L;
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    @Nullable
    public final INetworkAlertHandler getNetworkAlertHandler() {
        return this.f70239g;
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    @Nullable
    public final VideoEnvironment getVideoEnvironment() {
        return this.f70234b;
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public final void goToFreeData() {
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public final boolean isNetworkPanelShowed() {
        return false;
    }

    public final void onCollectSharedParams(@NotNull PlayerSharingType playerSharingType, @NotNull PlayerSharingBundle playerSharingBundle) {
        playerSharingBundle.getBundle().putBoolean("key_share_dialog_is_showing", false);
        playerSharingBundle.getBundle().putBoolean("key_share_resume_when_unlock", this.f70238f);
    }

    public final void onLifecycleChanged(@NotNull LifecycleState lifecycleState) {
        if (lifecycleState == LifecycleState.ACTIVITY_RESUME && this.f70244m) {
            this.f70244m = false;
            if (this.f70243l) {
                this.f70238f = false;
                f();
                IVideosPlayDirectorService iVideosPlayDirectorService = this.f70253v;
                IVideosPlayDirectorService iVideosPlayDirectorService2 = iVideosPlayDirectorService;
                if (iVideosPlayDirectorService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("directorService");
                    iVideosPlayDirectorService2 = null;
                }
                IVideosPlayDirectorService.updateMediaResource$default(iVideosPlayDirectorService2, true, (ResolveListener) null, 2, (Object) null);
            }
        }
    }

    @Nullable
    public final String onMeteredNetworkUrlHook(@Nullable String str, @NotNull final IjkNetworkUtils.NetWorkType netWorkType, @Nullable HookErrorType hookErrorType) {
        IjkNetworkUtils.NetWorkType netWorkType2 = IjkNetworkUtils.NetWorkType.WIFI;
        Handler handler = this.f70251t;
        if (netWorkType == netWorkType2) {
            PlayerLog.i("PlayerNetworkService", "network change to wifi");
            final int i7 = 0;
            handler.post(new Runnable(this, i7) { // from class: Mk0.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f16204a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f16205b;

                {
                    this.f16204a = i7;
                    this.f16205b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f16204a) {
                        case 0:
                            com.bilibili.ogv.operation.inlineplayer1.a.a((com.bilibili.ogv.operation.inlineplayer1.a) this.f16205b);
                            break;
                        case 1:
                            ((ILibraSdk.b) this.f16205b).f();
                            break;
                        default:
                            ColumnArticleEditActivity columnArticleEditActivity = (ColumnArticleEditActivity) this.f16205b;
                            if (!columnArticleEditActivity.N) {
                                columnArticleEditActivity.getSupportActionBar().setTitle(columnArticleEditActivity.J.getTitle());
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            if (str != null) {
                objectRef.element = str;
                PlayerLog.i("PlayerNetworkService", "network change to mobile");
                ReentrantLock reentrantLock = f70231x;
                reentrantLock.lock();
                try {
                    try {
                        handler.post(new Runnable(this, netWorkType, objectRef) { // from class: Mk0.d

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final com.bilibili.ogv.operation.inlineplayer1.a f16206a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final IjkNetworkUtils.NetWorkType f16207b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final Ref.ObjectRef f16208c;

                            {
                                this.f16206a = this;
                                this.f16207b = netWorkType;
                                this.f16208c = objectRef;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                com.bilibili.ogv.operation.inlineplayer1.a.b(this.f16206a, this.f16207b, this.f16208c);
                            }
                        });
                        PlayerLog.i("PlayerNetworkService", "block ijk thread");
                        f70232y.await();
                    } catch (InterruptedException e7) {
                        PlayerLog.e("PlayerNetworkService", e7);
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    String str2 = (String) objectRef.element;
                    str = str2;
                    if (this.f70234b == VideoEnvironment.FREE_DATA_SUCCESS) {
                        str = m.a(str2, "free_traffic", "1");
                    }
                    objectRef.element = str;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
        return str;
    }

    public final void onStart(@Nullable final PlayerSharingBundle playerSharingBundle) {
        IPlayerCoreService iPlayerCoreService = this.f70252u;
        IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
        if (iPlayerCoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService2 = null;
        }
        iPlayerCoreService2.addPlayerReleaseObserver(this.f70250s);
        IPlayerCoreService iPlayerCoreService3 = this.f70252u;
        IPlayerCoreService iPlayerCoreService4 = iPlayerCoreService3;
        if (iPlayerCoreService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService4 = null;
        }
        iPlayerCoreService4.setMeteredNetworkUrlHookListener(this);
        IVideosPlayDirectorService iVideosPlayDirectorService = this.f70253v;
        IVideosPlayDirectorService iVideosPlayDirectorService2 = iVideosPlayDirectorService;
        if (iVideosPlayDirectorService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("directorService");
            iVideosPlayDirectorService2 = null;
        }
        iVideosPlayDirectorService2.addVideoPlayEventListener(this.f70249r);
        this.f70251t.post(new Runnable(playerSharingBundle, this) { // from class: Mk0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerSharingBundle f16209a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.bilibili.ogv.operation.inlineplayer1.a f16210b;

            {
                this.f16209a = playerSharingBundle;
                this.f16210b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.bilibili.ogv.operation.inlineplayer1.a.d(this.f16209a, this.f16210b);
            }
        });
        IActivityStateService iActivityStateService = this.f70254w;
        IActivityStateService iActivityStateService2 = iActivityStateService;
        if (iActivityStateService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityStateService");
            iActivityStateService2 = null;
        }
        iActivityStateService2.registerLifecycle(this, new LifecycleState[]{LifecycleState.ACTIVITY_RESUME});
        if (this.f70246o != 0) {
            FreeDataManager freeDataManagerE = e();
            if (freeDataManagerE != null) {
                freeDataManagerE.removeTfChangeCallback(this.f70246o);
                Unit unit = Unit.INSTANCE;
            }
            this.f70246o = 0L;
        }
        FreeDataManager freeDataManagerE2 = e();
        Long lValueOf = null;
        if (freeDataManagerE2 != null) {
            lValueOf = Long.valueOf(freeDataManagerE2.addTfChangeCallback(this.f70247p));
        }
        this.f70246o = lValueOf.longValue();
    }

    public final void onStop() {
        f();
        IPlayerCoreService iPlayerCoreService = this.f70252u;
        IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
        if (iPlayerCoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService2 = null;
        }
        iPlayerCoreService2.removePlayerReleaseObserver(this.f70250s);
        IPlayerCoreService iPlayerCoreService3 = this.f70252u;
        IPlayerCoreService iPlayerCoreService4 = iPlayerCoreService3;
        if (iPlayerCoreService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService4 = null;
        }
        iPlayerCoreService4.setMeteredNetworkUrlHookListener((OnMeteredNetworkUrlHookListener) null);
        IVideosPlayDirectorService iVideosPlayDirectorService = this.f70253v;
        IVideosPlayDirectorService iVideosPlayDirectorService2 = iVideosPlayDirectorService;
        if (iVideosPlayDirectorService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("directorService");
            iVideosPlayDirectorService2 = null;
        }
        iVideosPlayDirectorService2.removeVideoPlayEventListener(this.f70249r);
        FreeDataManager freeDataManagerE = e();
        if (freeDataManagerE != null) {
            freeDataManagerE.unregisterDemiwareListener(this.f70248q);
        }
        IActivityStateService iActivityStateService = this.f70254w;
        if (iActivityStateService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityStateService");
            iActivityStateService = null;
        }
        iActivityStateService.unregisterLifecycle(this);
        if (this.f70246o != 0) {
            FreeDataManager freeDataManagerE2 = e();
            if (freeDataManagerE2 != null) {
                freeDataManagerE2.removeTfChangeCallback(this.f70246o);
                Unit unit = Unit.INSTANCE;
            }
            this.f70246o = 0L;
        }
        this.f70235c.clear();
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public final void refreshFreeDataPanel(@NotNull Map<String, PlayerNetworkFunctionWidget.PanelCustomData> map) {
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public final void registerVideoEnvironmentObserver(@NotNull VideoEnvironmentObserver videoEnvironmentObserver) {
        if (this.f70235c.contains(videoEnvironmentObserver)) {
            return;
        }
        this.f70235c.add(videoEnvironmentObserver);
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public final void replayAfterFreeDataActive() {
        this.f70244m = true;
    }

    @NotNull
    public final PlayerServiceManager.ServiceConfig serviceConfig() {
        return PlayerServiceManager.ServiceConfig.Companion.obtain(true);
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public final void setEnableResumePlay(boolean z6) {
        this.h = z6;
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public final void setNetworkAlertHandler(@Nullable INetworkAlertHandler iNetworkAlertHandler) {
        this.f70239g = iNetworkAlertHandler;
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public final void setNetworkStrategy(int i7) {
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public final void setNetworkWidgetClass(@NotNull Class<? extends AbsFunctionWidget> cls) {
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public final void setShowAlertMode(@NotNull ShowAlertMode showAlertMode) {
        this.f70237e = showAlertMode;
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public final void showToastForNetWorkState(int i7) {
    }

    @Override // com.bilibili.playerbizcommon.features.network.IPlayerNetworkService
    public final void unregisterVideoEnvironmentObserver(@NotNull VideoEnvironmentObserver videoEnvironmentObserver) {
        Iterator<VideoEnvironmentObserver> it = this.f70235c.iterator();
        while (it.hasNext()) {
            VideoEnvironmentObserver next = it.next();
            if (next != null && Intrinsics.areEqual(next, videoEnvironmentObserver)) {
                it.remove();
            }
        }
    }
}
