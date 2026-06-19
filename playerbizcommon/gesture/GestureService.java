package com.bilibili.playerbizcommon.gesture;

import Aq0.A;
import Aq0.B;
import Aq0.C;
import Aq0.C1416d;
import Aq0.C1417e;
import Aq0.C1418f;
import Aq0.C1420h;
import Aq0.E;
import Aq0.F;
import Aq0.H;
import Aq0.I;
import Aq0.J;
import Aq0.RunnableC1415c;
import Aq0.u;
import Aq0.w;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.thread.HandlerThreads;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.panel.BuiltInLayer;
import tv.danmaku.biliplayerv2.panel.IPanelContainer;
import tv.danmaku.biliplayerv2.panel.IPlayerLayer;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerServiceManager;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.LifecycleObserver;
import tv.danmaku.biliplayerv2.service.LifecycleState;
import tv.danmaku.biliplayerv2.service.M;
import tv.danmaku.biliplayerv2.service.OnVideoLayerAttachedObserver;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.RenderLayerTransform;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosRequestHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosResponseWrapper;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.RegisterGestureEvents;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.service.interact.core.IInteractCoreService;
import tv.danmaku.biliplayerv2.service.render.wholescene.WholeSceneModeChangeObserver;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.report.statistics.StatisticsService;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService.class */
public final class GestureService implements IGestureService {

    @NotNull
    public static final a Companion = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f79988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E f79989b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public OriginScrollListener f79991d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public FunctionWidgetToken f79998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f79999m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public J f80001o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f80003q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public RegisterGestureEvents.Request f80006t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public C1418f f80007u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public ChronosGestureCallback f80008v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PriorityGestureProcessor<OriginScrollListener> f79990c = new PriorityGestureProcessor<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PriorityGestureProcessor<OnSingleTapListener> f79992e = new PriorityGestureProcessor<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PriorityGestureProcessor<OnDoubleTapListener> f79993f = new PriorityGestureProcessor<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PriorityGestureProcessor<OnLongPressListener> f79994g = new PriorityGestureProcessor<>();

    @NotNull
    public final PriorityGestureProcessor<A> h = new PriorityGestureProcessor<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PriorityGestureProcessor<OnDownListener> f79995i = new PriorityGestureProcessor<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final PriorityGestureProcessor<OnUpListener> f79996j = new PriorityGestureProcessor<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final PriorityGestureProcessor<C> f79997k = new PriorityGestureProcessor<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final C1416d f80000n = new C1416d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f80002p = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f80004r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f80005s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final o f80009w = new o(this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final r f80010x = new r(this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final m f80011y = new m(this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final d f80012z = new d(this);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final g f79974A = new g(this);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final f f79975B = new f(this);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final c f79976C = new c(this);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final b f79977D = new b(this);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final h f79978E = new h(this);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final e f79979F = new e(this);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final t f79980G = new t(this);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final k f79981H = new k(this);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final j f79982I = new j(this);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final l f79983J = new l(this);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final n f79984K = new n(this);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final p f79985L = new p(this);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public final i f79986M = new i(this);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public final q f79987N = new q(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$b.class */
    public static final class b implements OnLongPressListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureService f80013a;

        public b(GestureService gestureService) {
            this.f80013a = gestureService;
        }

        @Override // com.bilibili.playerbizcommon.gesture.OnLongPressListener
        public final boolean onLongPress(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            GestureService gestureService = this.f80013a;
            boolean z6 = false;
            if (gestureService.f80004r) {
                if (gestureService.f80006t == null) {
                    z6 = false;
                } else {
                    IPlayerContainer iPlayerContainer = gestureService.f79988a;
                    IPlayerContainer iPlayerContainer2 = iPlayerContainer;
                    if (iPlayerContainer == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                        iPlayerContainer2 = null;
                    }
                    IRemoteHandler remoteHandler = iPlayerContainer2.getInteractLayerService().getRemoteHandler();
                    z6 = false;
                    if (remoteHandler != null) {
                        z6 = false;
                        if (IRemoteHandler.dispatchRpcGesture$default(remoteHandler, motionEvent.getX(), motionEvent.getY(), 2, 0, 8, (Object) null)) {
                            z6 = true;
                        }
                    }
                }
            }
            return z6;
        }

        @Override // com.bilibili.playerbizcommon.gesture.OnLongPressListener
        public final void onLongPressEnd(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return;
            }
            GestureService gestureService = this.f80013a;
            if (!gestureService.f80004r || gestureService.f80006t == null) {
                return;
            }
            IPlayerContainer iPlayerContainer = gestureService.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            IRemoteHandler remoteHandler = iPlayerContainer2.getInteractLayerService().getRemoteHandler();
            if (remoteHandler != null) {
                remoteHandler.dispatchRpcGesture(motionEvent.getX(), motionEvent.getY(), 2, 2);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$c.class */
    public static final class c implements OnDoubleTapListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureService f80014a;

        public c(GestureService gestureService) {
            this.f80014a = gestureService;
        }

        @Override // com.bilibili.playerbizcommon.gesture.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            GestureService gestureService = this.f80014a;
            boolean z6 = false;
            if (gestureService.f80004r) {
                if (gestureService.f80006t == null) {
                    z6 = false;
                } else {
                    IPlayerContainer iPlayerContainer = gestureService.f79988a;
                    IPlayerContainer iPlayerContainer2 = iPlayerContainer;
                    if (iPlayerContainer == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                        iPlayerContainer2 = null;
                    }
                    IRemoteHandler remoteHandler = iPlayerContainer2.getInteractLayerService().getRemoteHandler();
                    z6 = false;
                    if (remoteHandler != null) {
                        z6 = false;
                        if (IRemoteHandler.dispatchRpcGesture$default(remoteHandler, motionEvent.getX(), motionEvent.getY(), 1, 0, 8, (Object) null)) {
                            z6 = true;
                        }
                    }
                }
            }
            return z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$d.class */
    public static final class d implements OnSingleTapListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureService f80015a;

        public d(GestureService gestureService) {
            this.f80015a = gestureService;
        }

        @Override // com.bilibili.playerbizcommon.gesture.OnSingleTapListener
        public final boolean onTap(MotionEvent motionEvent) {
            F f7;
            GestureService gestureService = this.f80015a;
            boolean z6 = false;
            if (gestureService.f80004r) {
                if (gestureService.f80006t == null) {
                    z6 = false;
                } else {
                    IPlayerContainer iPlayerContainer = gestureService.f79988a;
                    IPlayerContainer iPlayerContainer2 = iPlayerContainer;
                    if (iPlayerContainer == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                        iPlayerContainer2 = null;
                    }
                    IRemoteHandler remoteHandler = iPlayerContainer2.getInteractLayerService().getRemoteHandler();
                    z6 = false;
                    if (remoteHandler != null) {
                        float x6 = motionEvent.getX();
                        float y6 = motionEvent.getY();
                        C1418f c1418f = gestureService.f80007u;
                        z6 = false;
                        if (IRemoteHandler.dispatchRpcGesture$default(remoteHandler, x6, y6 + ((c1418f == null || (f7 = c1418f.f525a) == null) ? 0.0f : f7.getTranslationY()), 0, 0, 8, (Object) null)) {
                            z6 = true;
                        }
                    }
                }
            }
            return z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$e.class */
    public static final class e implements OriginScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f80016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f80017b = DpUtils.dp2px(BiliContext.application(), 5.0f);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GestureService f80018c;

        public e(GestureService gestureService) {
            this.f80018c = gestureService;
        }

        @Override // com.bilibili.playerbizcommon.gesture.OriginScrollListener
        public final void onCancel() {
            GestureService gestureService = this.f80018c;
            if (!gestureService.f80004r || gestureService.f80006t == null) {
                return;
            }
            IPlayerContainer iPlayerContainer = gestureService.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            IRemoteHandler remoteHandler = iPlayerContainer2.getInteractLayerService().getRemoteHandler();
            if (remoteHandler != null) {
                remoteHandler.dispatchRpcGesture(0.0f, 0.0f, 5, 3);
            }
            ChronosGestureCallback chronosGestureCallback = gestureService.f80008v;
            if (chronosGestureCallback != null) {
                chronosGestureCallback.onCancel();
            }
        }

        @Override // com.bilibili.playerbizcommon.gesture.OriginScrollListener
        public final void onOriginScroll(Pair<Float, Float> pair, float f7, float f8) {
            double d7 = f8;
            this.f80016a = Math.sqrt((d7 * d7) + ((double) (f7 * f7))) + this.f80016a;
            GestureService gestureService = this.f80018c;
            if (!gestureService.f80004r || gestureService.f80006t == null || this.f80016a < this.f80017b) {
                return;
            }
            IPlayerContainer iPlayerContainer = gestureService.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            IRemoteHandler remoteHandler = iPlayerContainer2.getInteractLayerService().getRemoteHandler();
            if (remoteHandler != null) {
                remoteHandler.dispatchRpcGesture(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue(), 5, 1);
            }
            this.f80016a = 0.0d;
        }

        @Override // com.bilibili.playerbizcommon.gesture.OriginScrollListener
        public final boolean onOriginScrollStart(Pair<Float, Float> pair) {
            if (this.f80016a != 0.0d) {
                this.f80016a = 0.0d;
            }
            GestureService gestureService = this.f80018c;
            boolean z6 = false;
            if (gestureService.f80004r) {
                if (gestureService.f80006t == null) {
                    z6 = false;
                } else {
                    IPlayerContainer iPlayerContainer = gestureService.f79988a;
                    IPlayerContainer iPlayerContainer2 = iPlayerContainer;
                    if (iPlayerContainer == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                        iPlayerContainer2 = null;
                    }
                    IRemoteHandler remoteHandler = iPlayerContainer2.getInteractLayerService().getRemoteHandler();
                    boolean z7 = false;
                    if (remoteHandler != null) {
                        z7 = false;
                        if (IRemoteHandler.dispatchRpcGesture$default(remoteHandler, ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue(), 5, 0, 8, (Object) null)) {
                            z7 = true;
                        }
                    }
                    ChronosGestureCallback chronosGestureCallback = gestureService.f80008v;
                    z6 = z7;
                    if (chronosGestureCallback != null) {
                        chronosGestureCallback.onHandledScrollEvents(z7);
                        z6 = z7;
                    }
                }
            }
            return z6;
        }

        @Override // com.bilibili.playerbizcommon.gesture.OriginScrollListener
        public final void onOriginScrollStop(Pair<Float, Float> pair) {
            GestureService gestureService = this.f80018c;
            if (!gestureService.f80004r || gestureService.f80006t == null) {
                return;
            }
            IPlayerContainer iPlayerContainer = gestureService.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            IRemoteHandler remoteHandler = iPlayerContainer2.getInteractLayerService().getRemoteHandler();
            if (remoteHandler != null) {
                remoteHandler.dispatchRpcGesture(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue(), 5, 2);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$f.class */
    public static final class f implements OnDownListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureService f80019a;

        public f(GestureService gestureService) {
            this.f80019a = gestureService;
        }

        @Override // com.bilibili.playerbizcommon.gesture.OnDownListener
        public final void onDown(MotionEvent motionEvent) {
            IPlayerContainer iPlayerContainer = this.f80019a.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            IRemoteHandler remoteHandler = iPlayerContainer2.getInteractLayerService().getRemoteHandler();
            if (remoteHandler != null) {
                remoteHandler.dispatchRpcTouch(motionEvent.getX(), motionEvent.getY(), 0);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$g.class */
    public static final class g implements OnUpListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureService f80020a;

        public g(GestureService gestureService) {
            this.f80020a = gestureService;
        }

        @Override // com.bilibili.playerbizcommon.gesture.OnUpListener
        public final void onUp(MotionEvent motionEvent) {
            GestureService gestureService = this.f80020a;
            IPlayerContainer iPlayerContainer = gestureService.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            IRemoteHandler remoteHandler = iPlayerContainer2.getInteractLayerService().getRemoteHandler();
            if (remoteHandler != null) {
                remoteHandler.dispatchRpcTouch(motionEvent.getX(), motionEvent.getY(), 1);
            }
            ChronosGestureCallback chronosGestureCallback = gestureService.f80008v;
            if (chronosGestureCallback != null) {
                chronosGestureCallback.onUp();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$h.class */
    public static final class h implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureService f80021a;

        public h(GestureService gestureService) {
            this.f80021a = gestureService;
        }

        @Override // Aq0.C
        public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            GestureService gestureService = this.f80021a;
            boolean z6 = false;
            if (gestureService.f80004r) {
                if (gestureService.f80006t == null) {
                    z6 = false;
                } else {
                    IPlayerContainer iPlayerContainer = gestureService.f79988a;
                    IPlayerContainer iPlayerContainer2 = iPlayerContainer;
                    if (iPlayerContainer == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                        iPlayerContainer2 = null;
                    }
                    IRemoteHandler remoteHandler = iPlayerContainer2.getInteractLayerService().getRemoteHandler();
                    z6 = false;
                    if (remoteHandler != null) {
                        z6 = false;
                        if (IRemoteHandler.dispatchRpcGesture$default(remoteHandler, -1.0f, -1.0f, 4, 0, 8, (Object) null)) {
                            z6 = true;
                        }
                    }
                }
            }
            return z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$i.class */
    public static final class i implements ControlContainerObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureService f80022a;

        public i(GestureService gestureService) {
            this.f80022a = gestureService;
        }

        public final void onControlContainerChanged(ControlContainerType controlContainerType, ScreenModeType screenModeType) {
            ScreenModeType screenModeType2 = ScreenModeType.THUMB;
            GestureService gestureService = this.f80022a;
            if (screenModeType == screenModeType2) {
                gestureService.f80011y.f80027b = false;
            } else {
                gestureService.f80011y.f80027b = true;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$j.class */
    public static final class j implements OnDoubleTapListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureService f80023a;

        public j(GestureService gestureService) {
            this.f80023a = gestureService;
        }

        @Override // com.bilibili.playerbizcommon.gesture.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            GestureService gestureService = this.f80023a;
            IPlayerContainer iPlayerContainer = gestureService.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            IPlayerCoreService playerCoreService = iPlayerContainer2.getPlayerCoreService();
            boolean z6 = playerCoreService.getState() == 4;
            IPlayerContainer iPlayerContainer3 = gestureService.f79988a;
            IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer4 = null;
            }
            iPlayerContainer4.getReporterService().report(new NeuronsEvents.NormalEvent("player.player.gesture.play-pause.player", new String[]{"play_control", z6 ? "1" : "2"}));
            if (!z6) {
                playerCoreService.resume();
                return true;
            }
            Lazy lazy = StatisticsService.t;
            IPlayerContainer iPlayerContainer5 = gestureService.f79988a;
            if (iPlayerContainer5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer5 = null;
            }
            StatisticsService.a.a(iPlayerContainer5, "1");
            playerCoreService.pause();
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$k.class */
    public static final class k implements OnSingleTapListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureService f80024a;

        public k(GestureService gestureService) {
            this.f80024a = gestureService;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        @Override // com.bilibili.playerbizcommon.gesture.OnSingleTapListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onTap(android.view.MotionEvent r7) {
            /*
                r6 = this;
                r0 = r6
                com.bilibili.playerbizcommon.gesture.GestureService r0 = r0.f80024a
                r11 = r0
                r0 = r11
                tv.danmaku.biliplayerv2.PlayerContainer r0 = com.bilibili.playerbizcommon.gesture.GestureService.access$getMPlayerContainer$p(r0)
                r9 = r0
                r0 = 0
                r8 = r0
                r0 = r9
                r7 = r0
                r0 = r9
                if (r0 != 0) goto L1b
                java.lang.String r0 = "mPlayerContainer"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
                r7 = r0
            L1b:
                r0 = r7
                tv.danmaku.biliplayerv2.service.IControlContainerService r0 = r0.getControlContainerService()
                r12 = r0
                r0 = r12
                boolean r0 = r0.isControllerEnable()
                if (r0 != 0) goto L2f
                r0 = 0
                return r0
            L2f:
                java.util.HashMap r0 = new java.util.HashMap
                r1 = r0
                r1.<init>()
                r10 = r0
                r0 = r11
                tv.danmaku.biliplayerv2.PlayerContainer r0 = com.bilibili.playerbizcommon.gesture.GestureService.access$getMPlayerContainer$p(r0)
                r9 = r0
                r0 = r9
                r7 = r0
                r0 = r9
                if (r0 != 0) goto L4b
                java.lang.String r0 = "mPlayerContainer"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
                r7 = r0
            L4b:
                r0 = r7
                tv.danmaku.biliplayerv2.service.IPlayDirector r0 = tv.danmaku.biliplayerv2.PlayerContainerKt.getPlayDirector(r0)
                tv.danmaku.biliplayerv2.service.Video$PlayableParams r0 = r0.getCurrentPlayableParams()
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L64
                r0 = r7
                java.lang.String r0 = r0.getTrackId()
                r9 = r0
                r0 = r9
                r7 = r0
                r0 = r9
                if (r0 != 0) goto L67
            L64:
                java.lang.String r0 = ""
                r7 = r0
            L67:
                r0 = r10
                java.lang.String r1 = "track_id"
                r2 = r7
                java.lang.Object r0 = r0.put(r1, r2)
                r0 = r11
                tv.danmaku.biliplayerv2.PlayerContainer r0 = com.bilibili.playerbizcommon.gesture.GestureService.access$getMPlayerContainer$p(r0)
                r7 = r0
                r0 = r7
                if (r0 != 0) goto L86
                java.lang.String r0 = "mPlayerContainer"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = r8
                r7 = r0
                goto L86
            L86:
                r0 = r7
                tv.danmaku.biliplayerv2.service.report.IReporterService r0 = r0.getReporterService()
                tv.danmaku.biliplayerv2.service.report.NeuronsEvents$b r1 = new tv.danmaku.biliplayerv2.service.report.NeuronsEvents$b
                r2 = r1
                java.lang.String r3 = "player.player.gesture.control.player"
                r4 = r10
                r2.<init>(r3, r4)
                r0.report(r1)
                r0 = r12
                boolean r0 = r0.isShowing()
                if (r0 != 0) goto Lb0
                r0 = r12
                r0.show()
                goto Lb7
            Lb0:
                r0 = r12
                r0.hide()
            Lb7:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.gesture.GestureService.k.onTap(android.view.MotionEvent):boolean");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$l.class */
    public static final class l implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureService f80025a;

        public l(GestureService gestureService) {
            this.f80025a = gestureService;
        }

        @Override // Aq0.C
        public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            GestureService gestureService = this.f80025a;
            if (!gestureService.f80005s) {
                return false;
            }
            IPlayerContainer iPlayerContainer = gestureService.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            IReporterService reporterService = iPlayerContainer2.getReporterService();
            IPlayerContainer iPlayerContainer3 = gestureService.f79988a;
            IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer4 = null;
            }
            reporterService.report(new NeuronsEvents.NormalEvent("player.player.gesture.danmaku.player", new String[]{"condition", iPlayerContainer4.getInteractLayerService().isDanmakuVisible() ? "2" : "1"}));
            IPlayerContainer iPlayerContainer5 = gestureService.f79988a;
            IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
            if (iPlayerContainer5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer6 = null;
            }
            if (iPlayerContainer6.getInteractLayerService().isDanmakuVisible()) {
                IPlayerContainer iPlayerContainer7 = gestureService.f79988a;
                IPlayerContainer iPlayerContainer8 = iPlayerContainer7;
                if (iPlayerContainer7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer8 = null;
                }
                IInteractCoreService.hideDanmaku$default(iPlayerContainer8.getInteractLayerService(), false, 1, (Object) null);
                return true;
            }
            IPlayerContainer iPlayerContainer9 = gestureService.f79988a;
            IPlayerContainer iPlayerContainer10 = iPlayerContainer9;
            if (iPlayerContainer9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer10 = null;
            }
            IInteractCoreService.showDanmaku$default(iPlayerContainer10.getInteractLayerService(), false, 1, (Object) null);
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$m.class */
    public static final class m implements com.bilibili.playerbizcommon.gesture.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f80026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f80027b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GestureService f80028c;

        public m(GestureService gestureService) {
            this.f80028c = gestureService;
        }

        public static final boolean d(m mVar) {
            IPlayerContainer iPlayerContainer = mVar.f80028c.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            RenderLayerTransform currentLayerTransform = iPlayerContainer2.getRenderContainerService().getCurrentLayerTransform();
            boolean z6 = false;
            if (currentLayerTransform != null && (currentLayerTransform.getRotate() % 360 != 0.0f || currentLayerTransform.getScale() != 1.0f || currentLayerTransform.getTranslationX() != 0 || currentLayerTransform.getTranslationY() != 0)) {
                z6 = true;
            }
            return z6;
        }

        public static int e(RenderLayerTransform renderLayerTransform) {
            float rotate;
            if (renderLayerTransform.getRotate() < 0.0f) {
                rotate = renderLayerTransform.getRotate() + 360;
            } else {
                rotate = renderLayerTransform.getRotate();
            }
            return ((int) (((double) (rotate / 90)) + 0.5d)) * 90;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0170  */
        @Override // com.bilibili.playerbizcommon.gesture.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                Method dump skipped, instruction units count: 564
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.gesture.GestureService.m.a():void");
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
        }

        @Override // com.bilibili.playerbizcommon.gesture.RotateGestureDetector.OnRotateGestureListener
        public final boolean onRotate(RotateGestureDetector rotateGestureDetector) {
            if (!this.f80027b || rotateGestureDetector == null) {
                return true;
            }
            if (rotateGestureDetector.getDegree() > 0.0f) {
                this.f80026a = true;
            }
            IPlayerContainer iPlayerContainer = this.f80028c.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            RenderLayerTransform currentLayerTransform = iPlayerContainer2.getRenderContainerService().getCurrentLayerTransform();
            if (currentLayerTransform == null) {
                return true;
            }
            IPlayerContainer iPlayerContainer3 = this.f80028c.f79988a;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer3 = null;
            }
            iPlayerContainer3.getRenderContainerService().rotateCurrentLayer(rotateGestureDetector.getDegree() + currentLayerTransform.getRotate());
            return true;
        }

        @Override // com.bilibili.playerbizcommon.gesture.RotateGestureDetector.OnRotateGestureListener
        public final boolean onRotateBegin(RotateGestureDetector rotateGestureDetector) {
            if (!this.f80027b) {
                return true;
            }
            this.f80026a = false;
            return true;
        }

        @Override // com.bilibili.playerbizcommon.gesture.RotateGestureDetector.OnRotateGestureListener
        public final void onRotateEnd(RotateGestureDetector rotateGestureDetector) {
            if (this.f80027b && this.f80026a) {
                this.f80026a = false;
                IPlayerContainer iPlayerContainer = this.f80028c.f79988a;
                IPlayerContainer iPlayerContainer2 = iPlayerContainer;
                if (iPlayerContainer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer2 = null;
                }
                iPlayerContainer2.getReporterService().report(new NeuronsEvents.NormalEvent("player.player.gesture.rotate.player", new String[0]));
            }
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (!this.f80027b) {
                return true;
            }
            IPlayerContainer iPlayerContainer = this.f80028c.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            RenderLayerTransform currentLayerTransform = iPlayerContainer2.getRenderContainerService().getCurrentLayerTransform();
            if (currentLayerTransform == null) {
                return true;
            }
            float fMax = Math.max(Math.min(scaleGestureDetector.getScaleFactor() * currentLayerTransform.getScale(), 5.0f), 0.2f);
            if (Float.isNaN(fMax) || Float.isInfinite(fMax)) {
                return true;
            }
            IPlayerContainer iPlayerContainer3 = this.f80028c.f79988a;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer3 = null;
            }
            iPlayerContainer3.getRenderContainerService().scaleCurrentLayer(fMax);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
            if (!this.f80027b) {
                return true;
            }
            IPlayerContainer iPlayerContainer = this.f80028c.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            if (iPlayerContainer2.getRenderContainerService().getCurrentLayerTransform() == null) {
                return true;
            }
            IPlayerContainer iPlayerContainer3 = this.f80028c.f79988a;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer3 = null;
            }
            iPlayerContainer3.getRenderContainerService().translateCurrentLayer((int) (r0.getTranslationX() - f7), (int) (r0.getTranslationY() - f8));
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$n.class */
    public static final class n implements I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureService f80029a;

        public n(GestureService gestureService) {
            this.f80029a = gestureService;
        }

        @Override // Aq0.I
        public final void a(float f7, int i7) {
            GestureService gestureService = this.f80029a;
            if (i7 == 5) {
                gestureService.f80000n.a(TYPE.BRIGHTNESS, f7);
            } else {
                if (i7 != 6) {
                    return;
                }
                gestureService.f80000n.a(TYPE.VOLUME, f7);
            }
        }

        @Override // Aq0.I
        public final void b(float f7, int i7) {
            GestureService gestureService = this.f80029a;
            if (i7 == 5) {
                gestureService.f80000n.c(TYPE.BRIGHTNESS);
            } else {
                if (i7 != 6) {
                    return;
                }
                gestureService.f80000n.c(TYPE.VOLUME);
            }
        }

        @Override // Aq0.I
        public final void c(float f7, int i7) {
            GestureService gestureService = this.f80029a;
            if (i7 == 5) {
                PlayerLog.i("GestureService", "on scroll start to change brightness,progress:" + f7);
                gestureService.f80000n.b(TYPE.BRIGHTNESS);
                return;
            }
            if (i7 != 6) {
                return;
            }
            PlayerLog.i("GestureService", "on scroll start to change volume,progress:" + f7);
            gestureService.f80000n.b(TYPE.VOLUME);
        }

        @Override // Aq0.I
        public final void onCancel() {
            RunnableC1415c runnableC1415c = this.f80029a.f80000n.f498f;
            HandlerThreads.remove(0, runnableC1415c);
            HandlerThreads.postDelayed(0, runnableC1415c, 0L);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$o.class */
    public static final class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureService f80030a;

        public o(GestureService gestureService) {
            this.f80030a = gestureService;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$p.class */
    public static final class p implements M {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureService f80031a;

        public p(GestureService gestureService) {
            this.f80031a = gestureService;
        }

        public final void a(Vi1.c cVar) {
            GestureService gestureService = this.f80031a;
            if (cVar.e % 360 == 0.0f && Math.abs(cVar.c) == 1.0f && cVar.d == 1.0f && cVar.a == 0.0f && cVar.b == 0.0f) {
                GestureService.access$hideResetFunctionWidget(gestureService);
            } else {
                GestureService.access$showResetFunctionWidget(gestureService);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$q.class */
    public static final class q implements OnVideoLayerAttachedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureService f80032a;

        public q(GestureService gestureService) {
            this.f80032a = gestureService;
        }

        public final void onAttached() {
            GestureService gestureService = this.f80032a;
            IPlayerContainer iPlayerContainer = gestureService.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            if (iPlayerContainer2.getRenderContainerService().isRenderLayerSupportTransform()) {
                gestureService.setResizableGestureListener(null, true);
            } else {
                IGestureService.setResizableGestureListener$default(gestureService, null, false, 2, null);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$r.class */
    public static final class r implements WholeSceneModeChangeObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f80033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f80034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f80035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final GestureService f80036d;

        public r(GestureService gestureService) {
            this.f80036d = gestureService;
        }

        public final void onEnterWholeScene() {
            GestureService gestureService = this.f80036d;
            gestureService.getClass();
            IPlayerContainer iPlayerContainer = gestureService.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            IRenderContainerService.resetRenderContainer$default(iPlayerContainer2.getRenderContainerService(), false, (AnimatorListenerAdapter) null, 2, (Object) null);
            if (gestureService.isVerticalScrollEnable()) {
                this.f80033a = true;
                gestureService.setVerticalScrollEnable(false);
            }
            if (gestureService.isHorizontalScrollEnable()) {
                this.f80034b = true;
                gestureService.setHorizontalScrollEnable(false);
            }
            if (!gestureService.isResizeGestureForbidden()) {
                this.f80035c = true;
                gestureService.forbiddenResizeGesture(true);
            }
            if (gestureService.f80001o == null) {
                PlayerContainer playerContainer = gestureService.f79988a;
                PlayerContainer playerContainer2 = playerContainer;
                if (playerContainer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    playerContainer2 = null;
                }
                gestureService.f80001o = new J(playerContainer2);
            }
            J j7 = gestureService.f80001o;
            J j8 = j7;
            if (j7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWholeScreenInputEventDetector");
                j8 = null;
            }
            int gestureWidth = gestureService.getGestureWidth();
            int gestureHeight = gestureService.getGestureHeight();
            j8.f479d = gestureWidth;
            j8.f478c = gestureHeight;
            J j9 = gestureService.f80001o;
            J j10 = j9;
            if (j9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWholeScreenInputEventDetector");
                j10 = null;
            }
            IPlayerServiceManager playerServiceManager = j10.f476a.getPlayerServiceManager();
            PlayerServiceManager.ServiceDescriptor serviceDescriptorObtain = PlayerServiceManager.ServiceDescriptor.Companion.obtain(GestureService.class);
            PlayerServiceManager.Client<GestureService> client = j10.f477b;
            playerServiceManager.bindService(serviceDescriptorObtain, client);
            GestureService gestureService2 = (GestureService) client.getService();
            if (gestureService2 != null) {
                IGestureService.addOriginScrollListener$default(gestureService2, j10, 0, 2, null);
            }
            J j11 = gestureService.f80001o;
            if (j11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWholeScreenInputEventDetector");
                j11 = null;
            }
            j11.f480e = gestureService.f80009w;
        }

        public final void onExitWholeScene() {
            boolean z6 = this.f80033a;
            GestureService gestureService = this.f80036d;
            if (z6) {
                gestureService.setVerticalScrollEnable(true);
            }
            if (this.f80034b) {
                gestureService.setHorizontalScrollEnable(true);
            }
            if (this.f80035c) {
                gestureService.forbiddenResizeGesture(false);
            }
            if (gestureService.f80001o != null) {
                J j7 = gestureService.f80001o;
                J j8 = j7;
                if (j7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWholeScreenInputEventDetector");
                    j8 = null;
                }
                PlayerServiceManager.Client<GestureService> client = j8.f477b;
                GestureService gestureService2 = (GestureService) client.getService();
                if (gestureService2 != null) {
                    gestureService2.removeOriginScrollListener(j8);
                }
                j8.f476a.getPlayerServiceManager().unbindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(GestureService.class), client);
                j8.f482g = 0.0f;
                j8.h = 0.0f;
                J j9 = gestureService.f80001o;
                J j10 = j9;
                if (j9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWholeScreenInputEventDetector");
                    j10 = null;
                }
                j10.f480e = null;
            }
            gestureService.getClass();
        }

        public final void onWholeSceneReset() {
            GestureService gestureService = this.f80036d;
            if (gestureService.f80001o != null) {
                J j7 = gestureService.f80001o;
                J j8 = j7;
                if (j7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWholeScreenInputEventDetector");
                    j8 = null;
                }
                j8.f482g = 0.0f;
                j8.h = 0.0f;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$s.class */
    public static final class s implements LifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureService f80037a;

        public s(GestureService gestureService) {
            this.f80037a = gestureService;
        }

        public final void onLifecycleChanged(LifecycleState lifecycleState) {
            GestureService gestureService = this.f80037a;
            IPlayerContainer iPlayerContainer = gestureService.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.addPlayerLayer(BuiltInLayer.LayerRender, gestureService.f80007u);
            IPlayerContainer iPlayerContainer3 = gestureService.f79988a;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer3 = null;
            }
            iPlayerContainer3.getActivityStateService().unregisterLifecycle(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/GestureService$t.class */
    public static final class t implements ChronosRequestHandler<RegisterGestureEvents.Request, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f80038a = Reflection.typeOf(RegisterGestureEvents.Request.class).isMarkedNullable();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GestureService f80039b;

        public t(GestureService gestureService) {
            this.f80039b = gestureService;
        }

        public final Class<RegisterGestureEvents.Request> getRequestClass() {
            return RegisterGestureEvents.Request.class;
        }

        public final boolean getRequestNullable() {
            return this.f80038a;
        }

        public final ChronosResponseWrapper<Void> handle(RegisterGestureEvents.Request request) {
            RegisterGestureEvents.Request request2 = request;
            GestureService gestureService = this.f80039b;
            gestureService.f80006t = request2;
            GestureService.access$clearAllChronosGesturesCallback(gestureService);
            int[] gestures = request2.getGestures();
            if (gestures != null) {
                for (int i7 : gestures) {
                    if (i7 == 0) {
                        gestureService.addOnSingleTapListener(gestureService.f80012z, 3);
                    } else if (i7 == 1) {
                        gestureService.addOnDoubleTapListener(gestureService.f79976C, 3);
                    } else if (i7 == 2) {
                        gestureService.addOnLongPressListener(gestureService.f79977D, 3);
                    } else if (i7 == 4) {
                        gestureService.addOnTwoFingerDoubleTapListener(gestureService.f79978E, 3);
                    } else if (i7 == 5) {
                        gestureService.addOriginScrollListener(gestureService.f79979F, 3);
                    }
                }
            }
            return new ChronosResponseWrapper.Success((Object) null);
        }
    }

    public static final void access$clearAllChronosGesturesCallback(GestureService gestureService) {
        gestureService.removeOnSingleTapListener(gestureService.f80012z);
        gestureService.removeOnDoubleTapListener(gestureService.f79976C);
        gestureService.removeOnLongPressListener(gestureService.f79977D);
        gestureService.removeOnTwoFingerDoubleTapListener(gestureService.f79978E);
        gestureService.removeOriginScrollListener(gestureService.f79979F);
    }

    public static final void access$hideResetFunctionWidget(GestureService gestureService) {
        FunctionWidgetToken functionWidgetToken = gestureService.f79998l;
        if (functionWidgetToken == null || !functionWidgetToken.isShowing()) {
            return;
        }
        IPlayerContainer iPlayerContainer = gestureService.f79988a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getFunctionWidgetService().hideWidget(gestureService.f79998l);
    }

    public static final void access$showResetFunctionWidget(GestureService gestureService) {
        FunctionWidgetToken functionWidgetToken = gestureService.f79998l;
        IPlayerContainer iPlayerContainer = null;
        if (functionWidgetToken != null && !functionWidgetToken.isRemoved()) {
            IPlayerContainer iPlayerContainer2 = gestureService.f79988a;
            if (iPlayerContainer2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getFunctionWidgetService().showWidget(gestureService.f79998l);
            return;
        }
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-2, -2);
        layoutParams.setLayoutType(13);
        layoutParams.setExitAnim(-1);
        layoutParams.setEnterAnim(-1);
        layoutParams.setFunctionType(0);
        layoutParams.touchOutsideDismiss(false);
        IPlayerContainer iPlayerContainer3 = gestureService.f79988a;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
        } else {
            iPlayerContainer = iPlayerContainer3;
        }
        gestureService.f79998l = iPlayerContainer.getFunctionWidgetService().showWidget(H.class, layoutParams);
    }

    public final void a() {
        if (this.f80003q) {
            E e7 = this.f79989b;
            E e8 = e7;
            if (e7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
                e8 = null;
            }
            e8.f467k = true;
            IPlayerContainer iPlayerContainer = this.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            if (iPlayerContainer2.getRenderContainerService().isRenderLayerSupportTransform()) {
                setResizableGestureListener(null, true);
            } else {
                IGestureService.setResizableGestureListener$default(this, null, false, 2, null);
            }
            IPlayerContainer iPlayerContainer3 = this.f79988a;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer3 = null;
            }
            iPlayerContainer3.getRenderContainerService().addVideoLayerAttachedObserver(this.f79987N);
        }
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void addOnDoubleTapListener(@NotNull OnDoubleTapListener onDoubleTapListener, int i7) {
        if (this.f80002p) {
            this.f79993f.addProcessCallback(onDoubleTapListener, i7);
        }
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void addOnDownListener(@NotNull OnDownListener onDownListener, int i7) {
        if (this.f80002p) {
            this.f79995i.addProcessCallback(onDownListener, i7);
        }
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void addOnLongPressListener(@NotNull OnLongPressListener onLongPressListener, int i7) {
        if (this.f80002p) {
            this.f79994g.addProcessCallback(onLongPressListener, i7);
        }
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void addOnLongPressScrollListener(@NotNull A a7, int i7) {
        this.h.addProcessCallback(a7, i7);
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void addOnSingleTapListener(@NotNull OnSingleTapListener onSingleTapListener, int i7) {
        if (this.f80002p) {
            this.f79992e.addProcessCallback(onSingleTapListener, i7);
        }
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void addOnTwoFingerDoubleTapListener(@NotNull C c7, int i7) {
        if (this.f80002p) {
            this.f79997k.addProcessCallback(c7, i7);
        }
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void addOnUpListener(@NotNull OnUpListener onUpListener, int i7) {
        if (this.f80002p) {
            this.f79996j.addProcessCallback(onUpListener, i7);
        }
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void addOriginScrollListener(@NotNull OriginScrollListener originScrollListener, int i7) {
        if (this.f80002p) {
            this.f79990c.addProcessCallback(originScrollListener, i7);
        }
    }

    public final void b() {
        IPlayerContainer iPlayerContainer = this.f79988a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getRenderContainerService().removeRenderContainerChangedObserver(this.f79985L);
        IPlayerContainer iPlayerContainer3 = this.f79988a;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        iPlayerContainer3.getControlContainerService().unregisterState(this.f79986M);
    }

    public void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f79988a = playerContainer;
        this.f79999m = (this.f80002p || this.f80003q) ? false : true;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        this.f80000n.f493a = playerContainer2;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x022c  */
    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.gesture.GestureService.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void enablePlayerDoubleTap(boolean z6) {
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        C1417e c1417e = e8.f460c;
        if (c1417e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e = null;
        }
        c1417e.f499a.f521v = z6;
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void enableTwoFingerDoubleTap(boolean z6) {
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        com.bilibili.playerbizcommon.gesture.c cVar = e8.f461d;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResizeGestureDetector");
            cVar = null;
        }
        cVar.f80074n = z6;
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void forbiddenInnerTouchEvent(boolean z6) {
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        e8.h = z6;
        if (z6 && e8.f466j) {
            e8.f466j = false;
            MotionEvent motionEventObtain = MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 3, 0.0f, 0.0f, 0);
            motionEventObtain.setAction(3);
            C1417e c1417e = e8.f460c;
            C1417e c1417e2 = c1417e;
            if (c1417e == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
                c1417e2 = null;
            }
            c1417e2.a(motionEventObtain);
            com.bilibili.playerbizcommon.gesture.c cVar = e8.f461d;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mResizeGestureDetector");
                cVar = null;
            }
            cVar.a(motionEventObtain);
        }
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void forbiddenResizeGesture(boolean z6) {
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        e8.f467k = !z6;
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public int getGestureHeight() {
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        return e8.f459b;
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    @Nullable
    public IPlayerLayer<F> getGestureLayer() {
        return this.f80007u;
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public int getGestureWidth() {
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        return e8.f458a;
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public boolean isHorizontalScrollEnable() {
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        C1417e c1417e = e8.f460c;
        if (c1417e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e = null;
        }
        return c1417e.f499a.f519t;
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public boolean isLongPressEnabled() {
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        C1417e c1417e = e8.f460c;
        if (c1417e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e = null;
        }
        return c1417e.f499a.f520u;
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public boolean isResizeGestureForbidden() {
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        return !e8.f467k;
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public boolean isVerticalScrollEnable() {
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        C1417e c1417e = e8.f460c;
        if (c1417e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e = null;
        }
        return c1417e.f499a.f518s;
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [Aq0.E, java.lang.Object] */
    public void onStart(@Nullable PlayerSharingBundle playerSharingBundle) {
        PlayerContainer playerContainer = this.f79988a;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        C1418f c1418f = new C1418f(playerContainer2.getContext());
        this.f80007u = c1418f;
        F f7 = c1418f.f525a;
        if (f7 != null) {
            f7.f469a = this;
        }
        PlayerContainer playerContainer3 = this.f79988a;
        PlayerContainer playerContainer4 = playerContainer3;
        if (playerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer4 = null;
        }
        if (playerContainer4.getPanelContainer() != null) {
            IPlayerContainer iPlayerContainer = this.f79988a;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.addPlayerLayer(BuiltInLayer.LayerRender, this.f80007u);
        } else {
            IPlayerContainer iPlayerContainer3 = this.f79988a;
            IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer4 = null;
            }
            iPlayerContainer4.getActivityStateService().registerLifecycle(new s(this), new LifecycleState[]{LifecycleState.FRAGMENT_VIEW_CREATED});
        }
        PlayerContainer playerContainer5 = this.f79988a;
        PlayerContainer playerContainer6 = playerContainer5;
        if (playerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer6 = null;
        }
        IPanelContainer panelContainer = playerContainer6.getPanelContainer();
        int width = panelContainer != null ? panelContainer.getWidth() : 0;
        PlayerContainer playerContainer7 = this.f79988a;
        PlayerContainer playerContainer8 = playerContainer7;
        if (playerContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer8 = null;
        }
        IPanelContainer panelContainer2 = playerContainer8.getPanelContainer();
        int height = panelContainer2 != null ? panelContainer2.getHeight() : 0;
        PlayerContainer playerContainer9 = this.f79988a;
        PlayerContainer playerContainer10 = playerContainer9;
        if (playerContainer9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer10 = null;
        }
        ?? obj = new Object();
        obj.f458a = width;
        obj.f459b = height;
        obj.f460c = new C1417e(playerContainer10.getContext().getApplicationContext(), width, height);
        obj.f461d = new com.bilibili.playerbizcommon.gesture.c(playerContainer10);
        this.f79989b = obj;
        obj.f464g = (obj.f464g & (-2)) | 1;
        obj.f464g = (obj.f464g & (-5)) | 4;
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        e8.getClass();
        e8.f464g = (e8.f464g & (-3)) | 2;
        E e9 = this.f79989b;
        E e10 = e9;
        if (e9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e10 = null;
        }
        u uVar = new u(this);
        C1417e c1417e = e10.f460c;
        C1417e c1417e2 = c1417e;
        if (c1417e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e2 = null;
        }
        c1417e2.f499a.f512m = uVar;
        addOnSingleTapListener(this.f79981H, 1);
        E e11 = this.f79989b;
        E e12 = e11;
        if (e11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e12 = null;
        }
        C1420h c1420h = new C1420h(this);
        C1417e c1417e3 = e12.f460c;
        C1417e c1417e4 = c1417e3;
        if (c1417e3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e4 = null;
        }
        c1417e4.f499a.f511l = c1420h;
        addOnDoubleTapListener(this.f79982I, 0);
        IGestureService.setVerticalScrollListener$default(this, this.f79984K, false, 2, null);
        E e13 = this.f79989b;
        E e14 = e13;
        if (e13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e14 = null;
        }
        Aq0.q qVar = new Aq0.q(this);
        C1417e c1417e5 = e14.f460c;
        C1417e c1417e6 = c1417e5;
        if (c1417e5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e6 = null;
        }
        c1417e6.f499a.f509j = qVar;
        E e15 = this.f79989b;
        E e16 = e15;
        if (e15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e16 = null;
        }
        Aq0.o oVar = new Aq0.o(this);
        C1417e c1417e7 = e16.f460c;
        C1417e c1417e8 = c1417e7;
        if (c1417e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e8 = null;
        }
        c1417e8.f499a.f510k = oVar;
        E e17 = this.f79989b;
        E e18 = e17;
        if (e17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e18 = null;
        }
        w wVar = new w(this);
        com.bilibili.playerbizcommon.gesture.c cVar = e18.f461d;
        com.bilibili.playerbizcommon.gesture.c cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResizeGestureDetector");
            cVar2 = null;
        }
        cVar2.h = wVar;
        addOnTwoFingerDoubleTapListener(this.f79983J, 1);
        E e19 = this.f79989b;
        E e20 = e19;
        if (e19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e20 = null;
        }
        Aq0.s sVar = new Aq0.s(this);
        C1417e c1417e9 = e20.f460c;
        C1417e c1417e10 = c1417e9;
        if (c1417e9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e10 = null;
        }
        c1417e10.f499a.f515p = sVar;
        E e21 = this.f79989b;
        E e22 = e21;
        if (e21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e22 = null;
        }
        Aq0.k kVar = new Aq0.k(this);
        C1417e c1417e11 = e22.f460c;
        C1417e c1417e12 = c1417e11;
        if (c1417e11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e12 = null;
        }
        c1417e12.f499a.f513n = kVar;
        E e23 = this.f79989b;
        E e24 = e23;
        if (e23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e24 = null;
        }
        Aq0.m mVar = new Aq0.m(this);
        C1417e c1417e13 = e24.f460c;
        C1417e c1417e14 = c1417e13;
        if (c1417e13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e14 = null;
        }
        c1417e14.f499a.f514o = mVar;
        a();
        IGestureService.addOnUpListener$default(this, this.f79974A, 0, 2, null);
        IGestureService.addOnDownListener$default(this, this.f79975B, 0, 2, null);
        IPlayerContainer iPlayerContainer5 = this.f79988a;
        IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer6 = null;
        }
        iPlayerContainer6.getRenderContainerService().addWholeSceneModeChangeObserver(this.f80010x);
        IPlayerContainer iPlayerContainer7 = this.f79988a;
        if (iPlayerContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer7 = null;
        }
        iPlayerContainer7.getInteractLayerService().registerChronosMessageHandler(this.f79980G);
    }

    public void onStop() {
        F f7;
        removeOnSingleTapListener(this.f80012z);
        removeOnDoubleTapListener(this.f79976C);
        removeOnLongPressListener(this.f79977D);
        removeOnTwoFingerDoubleTapListener(this.f79978E);
        removeOriginScrollListener(this.f79979F);
        removeOnUpListener(this.f79974A);
        removeOnDownListener(this.f79975B);
        removeOnSingleTapListener(this.f79981H);
        removeOnDoubleTapListener(this.f79982I);
        removeOnTwoFingerDoubleTapListener(this.f79983J);
        IGestureService.setResizableGestureListener$default(this, null, false, 2, null);
        IGestureService.setVerticalScrollListener$default(this, null, false, 2, null);
        IPlayerContainer iPlayerContainer = this.f79988a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getInteractLayerService().unregisterChronosMessageHandler(this.f79980G);
        IPlayerContainer iPlayerContainer3 = this.f79988a;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        IRenderContainerService renderContainerService = iPlayerContainer4.getRenderContainerService();
        renderContainerService.removeWholeSceneModeChangObserver(this.f80010x);
        renderContainerService.removeVideoLayerAttachedObserver(this.f79987N);
        b();
        C1416d c1416d = this.f80000n;
        c1416d.f493a = null;
        c1416d.f494b = null;
        c1416d.f495c = false;
        c1416d.f496d = false;
        c1416d.f497e = null;
        C1418f c1418f = this.f80007u;
        if (c1418f != null && (f7 = c1418f.f525a) != null) {
            f7.f469a = null;
        }
        PlayerContainer playerContainer = this.f79988a;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        IPanelContainer panelContainer = playerContainer2.getPanelContainer();
        if (panelContainer != null) {
            panelContainer.removeLayer(this.f80007u);
        }
        this.f79996j.clear();
        this.f79995i.clear();
        this.f79990c.clear();
        this.f79992e.clear();
        this.f79993f.clear();
        this.f79994g.clear();
        this.h.clear();
        this.f79997k.clear();
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        C1417e c1417e = e8.f460c;
        C1417e c1417e2 = c1417e;
        if (c1417e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e2 = null;
        }
        c1417e2.f499a.f517r = null;
        E e9 = this.f79989b;
        E e10 = e9;
        if (e9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e10 = null;
        }
        C1417e c1417e3 = e10.f460c;
        C1417e c1417e4 = c1417e3;
        if (c1417e3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e4 = null;
        }
        c1417e4.f499a.f516q = null;
        E e11 = this.f79989b;
        E e12 = e11;
        if (e11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e12 = null;
        }
        e12.a(null);
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void removeOnDoubleTapListener(@NotNull OnDoubleTapListener onDoubleTapListener) {
        this.f79993f.removeProcessCallback(onDoubleTapListener);
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void removeOnDownListener(@NotNull OnDownListener onDownListener) {
        this.f79995i.removeProcessCallback(onDownListener);
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void removeOnLongPressListener(@NotNull OnLongPressListener onLongPressListener) {
        this.f79994g.removeProcessCallback(onLongPressListener);
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void removeOnLongPressScrollListener(@NotNull A a7) {
        this.h.removeProcessCallback(a7);
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void removeOnSingleTapListener(@NotNull OnSingleTapListener onSingleTapListener) {
        this.f79992e.removeProcessCallback(onSingleTapListener);
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void removeOnTwoFingerDoubleTapListener(@NotNull C c7) {
        this.f79997k.removeProcessCallback(c7);
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void removeOnUpListener(@NotNull OnUpListener onUpListener) {
        this.f79996j.removeProcessCallback(onUpListener);
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void removeOriginScrollListener(@NotNull OriginScrollListener originScrollListener) {
        this.f79990c.removeProcessCallback(originScrollListener);
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void setChronosGestureCallback(@NotNull ChronosGestureCallback chronosGestureCallback) {
        this.f80008v = chronosGestureCallback;
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void setChronosGestureEnable(boolean z6) {
        this.f80004r = z6;
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void setGestureSize(int i7, int i8) {
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        e8.f458a = i7;
        e8.f459b = i8;
        C1417e c1417e = e8.f460c;
        C1417e c1417e2 = c1417e;
        if (c1417e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e2 = null;
        }
        C1417e.a aVar = c1417e2.f499a;
        aVar.f501a = i7;
        aVar.f502b = i8;
        J j7 = this.f80001o;
        if (j7 != null) {
            if (j7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWholeScreenInputEventDetector");
                j7 = null;
            }
            j7.f479d = i7;
            j7.f478c = i8;
        }
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void setHorizontalScrollEnable(boolean z6) {
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        C1417e c1417e = e8.f460c;
        if (c1417e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e = null;
        }
        c1417e.f499a.f519t = z6;
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void setHorizontalScrollListener(@Nullable HorizontalScrollListener horizontalScrollListener) {
        if (this.f80002p) {
            E e7 = this.f79989b;
            E e8 = e7;
            if (e7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
                e8 = null;
            }
            C1417e c1417e = e8.f460c;
            if (c1417e == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
                c1417e = null;
            }
            c1417e.f499a.f517r = horizontalScrollListener;
        }
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void setLongPressEnabled(boolean z6) {
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        C1417e c1417e = e8.f460c;
        if (c1417e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e = null;
        }
        c1417e.f499a.f520u = z6;
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void setNormalGestureEnable(boolean z6) {
        this.f80002p = z6;
        if (z6) {
            return;
        }
        removeOnSingleTapListener(this.f79981H);
        removeOnDoubleTapListener(this.f79982I);
        removeOnTwoFingerDoubleTapListener(this.f79983J);
        IGestureService.setVerticalScrollListener$default(this, null, false, 2, null);
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void setOnTouchListener(@Nullable B b7) {
        if (this.f80002p) {
            E e7 = this.f79989b;
            E e8 = e7;
            if (e7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
                e8 = null;
            }
            e8.f465i = b7;
        }
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void setResizableGestureListener(@Nullable com.bilibili.playerbizcommon.gesture.d dVar, boolean z6) {
        if (this.f80003q) {
            q qVar = this.f79987N;
            if (dVar != null) {
                IPlayerContainer iPlayerContainer = this.f79988a;
                IPlayerContainer iPlayerContainer2 = iPlayerContainer;
                if (iPlayerContainer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer2 = null;
                }
                iPlayerContainer2.getRenderContainerService().removeVideoLayerAttachedObserver(qVar);
                b();
                E e7 = this.f79989b;
                if (e7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
                    e7 = null;
                }
                e7.a(dVar);
                return;
            }
            if (!z6) {
                E e8 = this.f79989b;
                E e9 = e8;
                if (e8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
                    e9 = null;
                }
                e9.a(null);
                return;
            }
            IPlayerContainer iPlayerContainer3 = this.f79988a;
            IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer4 = null;
            }
            if (iPlayerContainer4.getRenderContainerService().getCurrentLayerType() == null) {
                IPlayerContainer iPlayerContainer5 = this.f79988a;
                if (iPlayerContainer5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer5 = null;
                }
                iPlayerContainer5.getRenderContainerService().addVideoLayerAttachedObserver(qVar);
                return;
            }
            IPlayerContainer iPlayerContainer6 = this.f79988a;
            IPlayerContainer iPlayerContainer7 = iPlayerContainer6;
            if (iPlayerContainer6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer7 = null;
            }
            if (!iPlayerContainer7.getRenderContainerService().isRenderLayerSupportTransform()) {
                E e10 = this.f79989b;
                E e11 = e10;
                if (e10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
                    e11 = null;
                }
                e11.a(null);
                return;
            }
            E e12 = this.f79989b;
            E e13 = e12;
            if (e12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
                e13 = null;
            }
            e13.a(this.f80011y);
            IPlayerContainer iPlayerContainer8 = this.f79988a;
            IPlayerContainer iPlayerContainer9 = iPlayerContainer8;
            if (iPlayerContainer8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer9 = null;
            }
            iPlayerContainer9.getRenderContainerService().addRenderContainerChangedObserver(this.f79985L);
            IPlayerContainer iPlayerContainer10 = this.f79988a;
            IPlayerContainer iPlayerContainer11 = iPlayerContainer10;
            if (iPlayerContainer10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer11 = null;
            }
            iPlayerContainer11.getControlContainerService().registerState(this.f79986M);
            IPlayerContainer iPlayerContainer12 = this.f79988a;
            if (iPlayerContainer12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer12 = null;
            }
            forbiddenResizeGesture(!iPlayerContainer12.getPlayerSettingService().getBoolean("PlayerResize", true));
        }
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void setResizeGestureEnable(boolean z6) {
        boolean z7 = this.f80003q;
        this.f80003q = z6;
        if (z7 != z6) {
            a();
        }
        if (this.f80003q) {
            return;
        }
        IGestureService.setResizableGestureListener$default(this, null, false, 2, null);
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void setTwoFingerDoubleTapEnable(boolean z6) {
        this.f80005s = z6;
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void setVerticalScrollEnable(boolean z6) {
        E e7 = this.f79989b;
        E e8 = e7;
        if (e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            e8 = null;
        }
        C1417e c1417e = e8.f460c;
        if (c1417e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
            c1417e = null;
        }
        c1417e.f499a.f518s = z6;
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void setVerticalScrollListener(@Nullable I i7, boolean z6) {
        if (this.f80002p) {
            if (i7 != null) {
                E e7 = this.f79989b;
                E e8 = e7;
                if (e7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
                    e8 = null;
                }
                C1417e c1417e = e8.f460c;
                if (c1417e == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
                    c1417e = null;
                }
                c1417e.f499a.f516q = i7;
                return;
            }
            E e9 = this.f79989b;
            E e10 = e9;
            if (e9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
                e10 = null;
            }
            n nVar = z6 ? this.f79984K : null;
            C1417e c1417e2 = e10.f460c;
            if (c1417e2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCustomGestureDetector");
                c1417e2 = null;
            }
            c1417e2.f499a.f516q = nVar;
        }
    }

    @Override // com.bilibili.playerbizcommon.gesture.IGestureService
    public void updateViewPort(@NotNull Rect rect) {
        C1418f c1418f;
        IPlayerContainer iPlayerContainer = this.f79988a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        IPanelContainer panelContainer = iPlayerContainer2.getRenderContainerService().getPanelContainer();
        if (panelContainer == null || (c1418f = this.f80007u) == null) {
            return;
        }
        IPlayerLayer.onViewPortUpdate$default(c1418f, rect, panelContainer.getWidth(), panelContainer.getHeight(), false, 8, (Object) null);
    }
}
