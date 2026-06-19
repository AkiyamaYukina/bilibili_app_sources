package com.bilibili.playerbizcommonv2.widget.seek.v3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.SeekBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.playerbizcommon.gesture.HorizontalScrollListener;
import com.bilibili.playerbizcommon.gesture.IGestureService;
import com.bilibili.playerbizcommon.widget.control.seekbar.PlayerSeekbarThumbWrapper;
import com.bilibili.playerbizcommonv2.utils.o;
import com.bilibili.playerbizcommonv2.utils.r;
import com.bilibili.playerbizcommonv2.widget.base.i;
import com.bilibili.playerbizcommonv2.widget.seek.v3.m;
import com.bilibili.playerbizcommonv2.widget.seek.v3.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.android.util.AppBuildConfig;
import tv.danmaku.biliplayerv2.DisplayOrientation;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainerKt;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.panel.IPanelContainer;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.PlayerProgressObserver;
import tv.danmaku.biliplayerv2.service.SeekGestureEnableObserver;
import tv.danmaku.biliplayerv2.service.SeekService;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.VideoDirectorObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo;
import tv.danmaku.biliplayerv2.service.network.PlayerFreeDataHelper;
import tv.danmaku.biliplayerv2.service.render.wholescene.WholeSceneModeChangeObserver;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3.class */
@StabilityInferred(parameters = 0)
public final class PlayerSeekWidget3 extends com.bilibili.playerbizcommonv2.widget.seek.v3.e implements IControlWidget {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f82911L = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final Lazy f82912A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public FunctionWidgetToken f82913B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommon.widget.control.seekbar.a f82914C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Inject
    public IPlayerCoreService f82915D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Inject
    public IControlContainerService f82916E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Inject
    public SeekService f82917F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Inject
    public IGestureService f82918G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Inject
    public AbsFunctionWidgetService f82919H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Inject
    public IReporterService f82920I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Inject
    public Er0.a f82921J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f82922K;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a f82923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final c f82924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final g f82925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final b f82926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final d f82927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public PlayerContainer f82928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f82929o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final PlayerSeekbarThumbWrapper f82930p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public FunctionWidgetToken f82931q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f82932r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f82933s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f82934t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public ScreenModeType f82935u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public DisplayOrientation f82936v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f82937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f82938x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f82939y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public Drawable f82940z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$a.class */
    public static final class a implements HorizontalScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f82942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PlayerSeekWidget3 f82943c;

        public a(PlayerSeekWidget3 playerSeekWidget3) {
            this.f82943c = playerSeekWidget3;
        }

        @Override // com.bilibili.playerbizcommon.gesture.HorizontalScrollListener
        public final void onCancel() {
            PlayerSeekWidget3.z(this.f82943c);
        }

        @Override // com.bilibili.playerbizcommon.gesture.HorizontalScrollListener
        public final void onScroll(float f7, Pair<Float, Float> pair) {
            PlayerSeekWidget3 playerSeekWidget3 = this.f82943c;
            if (playerSeekWidget3.f82931q != null) {
                int gestureWidth = playerSeekWidget3.getGestureClient().getGestureWidth();
                int gestureHeight = playerSeekWidget3.getGestureClient().getGestureHeight();
                float f8 = gestureWidth;
                boolean z6 = ((Number) pair.getFirst()).floatValue() < 0.1f * f8 && ((Number) pair.getSecond()).floatValue() < ((float) gestureHeight) * 0.3f;
                boolean z7 = z6;
                if (((Number) pair.getFirst()).floatValue() > f8 * 0.9f) {
                    z7 = z6;
                    if (((Number) pair.getSecond()).floatValue() < gestureHeight * 0.3f) {
                        z7 = true;
                    }
                }
                if (playerSeekWidget3.f82932r != z7) {
                    playerSeekWidget3.f82932r = z7;
                    playerSeekWidget3.f82933s = true;
                }
            }
            if (playerSeekWidget3.f82914C.f80626b) {
                float duration = playerSeekWidget3.getPlayerCoreService().getDuration();
                if (duration != 0.0f) {
                    playerSeekWidget3.f82914C.a((int) duration);
                }
            }
            int i7 = (int) ((playerSeekWidget3.f82914C.f80625a * f7) + this.f82941a);
            this.f82942b = i7;
            int iMin = Math.min(Math.max(i7, 0), playerSeekWidget3.getMax());
            this.f82942b = iMin;
            playerSeekWidget3.setProgress(iMin);
            PlayerSeekWidget3.o(playerSeekWidget3, this.f82942b);
        }

        @Override // com.bilibili.playerbizcommon.gesture.HorizontalScrollListener
        public final void onScrollStart(float f7, Pair<Float, Float> pair) {
            PlayerSeekWidget3 playerSeekWidget3 = this.f82943c;
            playerSeekWidget3.getControlContainerService().removeHideTask();
            IPlayerCoreService playerCoreService = playerSeekWidget3.getPlayerCoreService();
            int duration = playerCoreService.getDuration();
            int currentPosition = playerCoreService.getCurrentPosition();
            float bufferedPercentage = playerCoreService.getBufferedPercentage();
            if (currentPosition >= 0 && duration > 0) {
                int i7 = currentPosition;
                if (currentPosition > duration) {
                    i7 = duration;
                }
                playerSeekWidget3.setMax(duration);
                if (!playerSeekWidget3.f82961b) {
                    playerSeekWidget3.setProgress(i7);
                }
                playerSeekWidget3.setSecondaryProgress((int) (duration * bufferedPercentage));
            }
            this.f82941a = playerSeekWidget3.getProgress();
            PlayerSeekWidget3.v(playerSeekWidget3, false);
        }

        @Override // com.bilibili.playerbizcommon.gesture.HorizontalScrollListener
        public final void onScrollStop(float f7, Pair<Float, Float> pair) {
            PlayerSeekWidget3 playerSeekWidget3 = this.f82943c;
            playerSeekWidget3.getControlContainerService().addHideTask();
            playerSeekWidget3.setProgress(this.f82942b);
            PlayerSeekWidget3.z(playerSeekWidget3);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$b.class */
    public static final class b implements PlayerProgressObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerSeekWidget3 f82944a;

        public b(PlayerSeekWidget3 playerSeekWidget3) {
            this.f82944a = playerSeekWidget3;
        }

        public final void onPlayerProgressChange(int i7, int i8) {
            PlayerSeekWidget3 playerSeekWidget3 = this.f82944a;
            float bufferedPercentage = playerSeekWidget3.getPlayerCoreService().getBufferedPercentage();
            playerSeekWidget3.setMax(i8);
            if (!playerSeekWidget3.f82961b) {
                playerSeekWidget3.setProgress(i7);
            }
            playerSeekWidget3.setSecondaryProgress((int) (i8 * bufferedPercentage));
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        Object result;
        final PlayerSeekWidget3 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayerSeekWidget3 playerSeekWidget3, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = playerSeekWidget3;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$bindToView$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
        private Object L$0;
        int label;
        final PlayerSeekWidget3 this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$bindToView$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final PlayerSeekWidget3 this$0;

            /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$2$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$bindToView$2$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlayerSeekWidget3 f82945a;

                public a(PlayerSeekWidget3 playerSeekWidget3) {
                    this.f82945a = playerSeekWidget3;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    this.f82945a.setSeekBarProcessDrawable((List) obj);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayerSeekWidget3 playerSeekWidget3, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playerSeekWidget3;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow watchPointListFlow = this.this$0.getSeekService().getWatchPointListFlow();
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (watchPointListFlow.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$bindToView$2$2.class */
        public static final class C05462 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final PlayerSeekWidget3 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05462(PlayerSeekWidget3 playerSeekWidget3, Continuation<? super C05462> continuation) {
                super(2, continuation);
                this.this$0 = playerSeekWidget3;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05462(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PlayerSeekWidget3 playerSeekWidget3 = this.this$0;
                    this.label = 1;
                    int i8 = PlayerSeekWidget3.f82911L;
                    playerSeekWidget3.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new PlayerSeekWidget3$millisecondsActive$2(playerSeekWidget3, null), this);
                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCoroutineScope = Unit.INSTANCE;
                    }
                    if (objCoroutineScope == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlayerSeekWidget3 playerSeekWidget3, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playerSeekWidget3;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01d3  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0248  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0258  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x02a1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 806
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$c.class */
    public static final class c implements SeekGestureEnableObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerSeekWidget3 f82946a;

        public c(PlayerSeekWidget3 playerSeekWidget3) {
            this.f82946a = playerSeekWidget3;
        }

        public final void onSeekGestureEnableChange(boolean z6) {
            PlayerSeekWidget3 playerSeekWidget3 = this.f82946a;
            if (z6) {
                playerSeekWidget3.getGestureClient().setHorizontalScrollListener(playerSeekWidget3.f82923i);
            } else {
                playerSeekWidget3.getGestureClient().setHorizontalScrollListener(null);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$d.class */
    public static final class d implements VideoDirectorObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerSeekWidget3 f82947a;

        public d(PlayerSeekWidget3 playerSeekWidget3) {
            this.f82947a = playerSeekWidget3;
        }

        public final void onItemStart(Video.PlayableParams playableParams) {
            int i7 = PlayerSeekWidget3.f82911L;
            this.f82947a.F();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onItemWillChange(tv.danmaku.biliplayerv2.service.Video.PlayableParams r4, tv.danmaku.biliplayerv2.service.Video.PlayableParams r5) {
            /*
                r3 = this;
                r0 = r5
                r1 = r4
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                r6 = r0
                r0 = r3
                com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3 r0 = r0.f82947a
                r5 = r0
                r0 = r6
                if (r0 != 0) goto L17
                r0 = r5
                com.bilibili.playerbizcommon.widget.control.seekbar.a r0 = r0.f82914C
                r1 = 1
                r0.f80626b = r1
            L17:
                r0 = r5
                tv.danmaku.biliplayerv2.PlayerContainer r0 = r0.f82928n
                r4 = r0
                r0 = r4
                if (r0 == 0) goto L49
                r0 = r4
                tv.danmaku.biliplayerv2.service.IPlayDirector r0 = tv.danmaku.biliplayerv2.PlayerContainerKt.getPlayDirector(r0)
                r4 = r0
                r0 = r4
                if (r0 == 0) goto L49
                r0 = r4
                tv.danmaku.biliplayerv2.service.Video$PlayableParams r0 = r0.getCurrentPlayableParams()
                r4 = r0
                r0 = r4
                if (r0 == 0) goto L49
                r0 = r4
                tv.danmaku.biliplayerv2.service.Video$DisplayParams r0 = r0.getDisplayParams()
                r4 = r0
                r0 = r4
                if (r0 == 0) goto L49
                r0 = r4
                tv.danmaku.biliplayerv2.DisplayOrientation r0 = r0.getDisplayOrientation()
                r4 = r0
                r0 = r4
                if (r0 == 0) goto L49
                goto L4d
            L49:
                tv.danmaku.biliplayerv2.DisplayOrientation r0 = tv.danmaku.biliplayerv2.DisplayOrientation.LANDSCAPE
                r4 = r0
            L4d:
                r0 = r5
                r1 = r4
                r0.f82936v = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.d.onItemWillChange(tv.danmaku.biliplayerv2.service.Video$PlayableParams, tv.danmaku.biliplayerv2.service.Video$PlayableParams):void");
        }

        public final void onPlayableParamsChanged(Video.PlayableParams playableParams) {
            int i7 = PlayerSeekWidget3.f82911L;
            this.f82947a.F();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$e.class */
    public static final class e implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerSeekWidget3 f82948a;

        public e(PlayerSeekWidget3 playerSeekWidget3) {
            this.f82948a = playerSeekWidget3;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
            com.bilibili.playerbizcommon.widget.control.seekbar.b bVar = this.f82948a.f82930p.f80622c;
            if (bVar != null) {
                bVar.onProgressChanged(i7);
            }
            if (z6) {
                PlayerSeekWidget3.o(this.f82948a, i7);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            ViewParent parent = this.f82948a.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            PlayerSeekWidget3.v(this.f82948a, true);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            ViewParent parent = this.f82948a.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            PlayerSeekWidget3.z(this.f82948a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$f.class */
    public static final class f implements com.bilibili.playerbizcommon.widget.control.seekbar.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerSeekWidget3 f82949a;

        public f(PlayerSeekWidget3 playerSeekWidget3) {
            this.f82949a = playerSeekWidget3;
        }

        @Override // com.bilibili.playerbizcommon.widget.control.seekbar.f
        public final long a() {
            return this.f82949a.f82929o;
        }

        @Override // com.bilibili.playerbizcommon.widget.control.seekbar.f
        public final void b(Drawable drawable) {
            if (drawable == null) {
                return;
            }
            PlayerSeekWidget3 playerSeekWidget3 = this.f82949a;
            playerSeekWidget3.f82940z = drawable;
            if (playerSeekWidget3.f82939y || !playerSeekWidget3.f82938x) {
                playerSeekWidget3.setThumbInternal(drawable);
            }
        }

        @Override // com.bilibili.playerbizcommon.widget.control.seekbar.f
        public final void c() {
            PlayerSeekWidget3 playerSeekWidget3 = this.f82949a;
            k.d(playerSeekWidget3.getSeekbarProgressDrawable(), playerSeekWidget3.f82961b, false, true, 2);
        }

        @Override // com.bilibili.playerbizcommon.widget.control.seekbar.f
        public final Context x() {
            return this.f82949a.getContext();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$g.class */
    public static final class g implements WholeSceneModeChangeObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerSeekWidget3 f82950a;

        public g(PlayerSeekWidget3 playerSeekWidget3) {
            this.f82950a = playerSeekWidget3;
        }

        public final void onEnterWholeScene() {
            this.f82950a.getGestureClient().setHorizontalScrollListener(null);
        }

        public final void onExitWholeScene() {
            PlayerSeekWidget3 playerSeekWidget3 = this.f82950a;
            playerSeekWidget3.getGestureClient().setHorizontalScrollListener(playerSeekWidget3.f82923i);
        }
    }

    public PlayerSeekWidget3(@NotNull Context context) {
        this(context, null);
    }

    public PlayerSeekWidget3(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        f fVar = new f(this);
        this.f82923i = new a(this);
        e eVar = new e(this);
        this.f82924j = new c(this);
        this.f82925k = new g(this);
        this.f82926l = new b(this);
        this.f82927m = new d(this);
        this.f82930p = new PlayerSeekbarThumbWrapper(fVar);
        this.f82935u = ScreenModeType.THUMB;
        this.f82936v = DisplayOrientation.LANDSCAPE;
        this.f82937w = AppBuildConfig.Companion.isHDApp();
        this.f82938x = true;
        this.f82939y = true;
        this.f82912A = LazyKt.lazy(new com.bilibili.app.comment3.ui.view.i(this, 2));
        this.f82914C = new com.bilibili.playerbizcommon.widget.control.seekbar.a();
        this.f82922K = true;
        setThumb(new ColorDrawable(0));
        F();
        setOnSeekBarChangeListener(eVar);
        setAccessibilityDelegate(new o(this));
    }

    private final com.bilibili.playerbizcommonv2.widget.base.i getContainerSizeDelegate() {
        return (com.bilibili.playerbizcommonv2.widget.base.i) getDelegateStoreService().get(i.a.f82406a);
    }

    private final Drawable getInactiveThumb() {
        return (Drawable) this.f82912A.getValue();
    }

    private final q getSeekWidgetDelegate() {
        return (q) getDelegateStoreService().get(q.a.f83066a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.bilibili.playerbizcommonv2.utils.o getUiStyleDelegate() {
        return (com.bilibili.playerbizcommonv2.utils.o) getDelegateStoreService().get(o.a.f81942a);
    }

    private final com.bilibili.playerbizcommonv2.utils.r getWindowSizeDelegate() {
        return (com.bilibili.playerbizcommonv2.utils.r) getDelegateStoreService().get(r.a.f81944a);
    }

    public static final void k(PlayerSeekWidget3 playerSeekWidget3, boolean z6) {
        if (!playerSeekWidget3.f82938x || playerSeekWidget3.f82939y == z6) {
            return;
        }
        com.bilibili.playerbizcommon.widget.control.seekbar.b bVar = playerSeekWidget3.f82930p.f80622c;
        if (bVar != null) {
            bVar.d(z6);
        }
        if (z6) {
            Drawable drawable = playerSeekWidget3.f82940z;
            if (drawable != null) {
                playerSeekWidget3.setThumbInternal(drawable);
            }
            final k seekbarProgressDrawable = playerSeekWidget3.getSeekbarProgressDrawable();
            seekbarProgressDrawable.f83015z = true;
            seekbarProgressDrawable.c(false);
            ValueAnimator valueAnimator = seekbarProgressDrawable.f83010u;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(seekbarProgressDrawable) { // from class: com.bilibili.playerbizcommonv2.widget.seek.v3.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final k f82974a;

                {
                    this.f82974a = seekbarProgressDrawable;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    k kVar = this.f82974a;
                    int iFloatValue = (int) (((Float) valueAnimator2.getAnimatedValue()).floatValue() * 255);
                    int i7 = kVar.f82993c;
                    f fVar = kVar.f82989A[2];
                    if (fVar != null) {
                        fVar.h = (iFloatValue << 24) | (i7 & ViewCompat.MEASURED_SIZE_MASK);
                    }
                }
            });
            valueAnimatorOfFloat.addListener(new i(seekbarProgressDrawable));
            valueAnimatorOfFloat.start();
            seekbarProgressDrawable.f83010u = valueAnimatorOfFloat;
        } else {
            playerSeekWidget3.setThumbInternal(playerSeekWidget3.getInactiveThumb());
            k seekbarProgressDrawable2 = playerSeekWidget3.getSeekbarProgressDrawable();
            if (seekbarProgressDrawable2.f83015z) {
                seekbarProgressDrawable2.f83015z = false;
                seekbarProgressDrawable2.c(false);
            }
        }
        playerSeekWidget3.setProgressDrawable(playerSeekWidget3.getSeekbarProgressDrawable().a());
        playerSeekWidget3.f82939y = z6;
    }

    public static final void o(PlayerSeekWidget3 playerSeekWidget3, int i7) {
        IPanelContainer panelContainer;
        playerSeekWidget3.getSeekService().setDraggingProgress(i7, playerSeekWidget3.getMax());
        FunctionWidgetToken functionWidgetToken = playerSeekWidget3.f82931q;
        if (functionWidgetToken == null || !playerSeekWidget3.f82933s) {
            return;
        }
        playerSeekWidget3.f82933s = false;
        m.a aVar = new m.a();
        aVar.f83053c = playerSeekWidget3.f82932r;
        if (playerSeekWidget3.G()) {
            aVar.f83052b = 1;
        } else {
            aVar.f83052b = 2;
        }
        int[] iArr = new int[2];
        PlayerContainer playerContainer = playerSeekWidget3.f82928n;
        if (playerContainer != null && (panelContainer = playerContainer.getPanelContainer()) != null) {
            panelContainer.location(playerSeekWidget3, iArr);
        }
        int i8 = iArr[0];
        aVar.f83054d = new Rect(i8, iArr[1], playerSeekWidget3.getWidth() + i8, playerSeekWidget3.getHeight() + iArr[1]);
        playerSeekWidget3.getFunctionWidgetService().updateFunctionWidgetConfiguration(functionWidgetToken, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSeekBarProcessDrawable(List<ChronosThumbnailInfo.WatchPoint> list) {
        List listEmptyList;
        int duration = getPlayerCoreService().getDuration() / 1000;
        k seekbarProgressDrawable = getSeekbarProgressDrawable();
        if (list != null) {
            List<ChronosThumbnailInfo.WatchPoint> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (true) {
                listEmptyList = arrayList;
                if (!it.hasNext()) {
                    break;
                }
                ChronosThumbnailInfo.WatchPoint watchPoint = (ChronosThumbnailInfo.WatchPoint) it.next();
                com.bilibili.playerbizcommonv2.utils.o uiStyleDelegate = getUiStyleDelegate();
                boolean z6 = true;
                if (uiStyleDelegate != null && uiStyleDelegate.b() && watchPoint.getType() == 2) {
                    return;
                }
                int from = watchPoint.getFrom();
                int to2 = watchPoint.getTo();
                if (watchPoint.getType() != 1) {
                    z6 = false;
                }
                arrayList.add(new s(from, to2, z6, new com.bilibili.app.authorspace.header.banner.q(1, this, watchPoint)));
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        seekbarProgressDrawable.b(duration, listEmptyList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setThumbInternal(Drawable drawable) {
        setThumb(drawable);
        requestLayout();
    }

    public static final void v(PlayerSeekWidget3 playerSeekWidget3, boolean z6) {
        PlayerContainer playerContainer;
        IInteractLayerService interactLayerService;
        playerSeekWidget3.setSeeking(true);
        playerSeekWidget3.getSeekService().setDraggingByUser(true);
        PlayerSeekbarThumbWrapper playerSeekbarThumbWrapper = playerSeekWidget3.f82930p;
        int progress = playerSeekWidget3.getProgress();
        com.bilibili.playerbizcommon.widget.control.seekbar.b bVar = playerSeekbarThumbWrapper.f80622c;
        if (bVar != null) {
            bVar.a(progress);
        }
        m.a aVar = new m.a();
        aVar.f83051a = z6;
        FunctionWidgetToken functionWidgetToken = playerSeekWidget3.f82931q;
        if (functionWidgetToken == null || functionWidgetToken.isRemoved()) {
            IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
            layoutParams.setLayoutType(32);
            layoutParams.setFunctionType(1);
            layoutParams.setEnterAnim(-1);
            layoutParams.setExitAnim(-1);
            playerSeekWidget3.f82931q = playerSeekWidget3.getFunctionWidgetService().showWidget(m.class, layoutParams, aVar);
        } else {
            playerSeekWidget3.getFunctionWidgetService().showWidget(playerSeekWidget3.f82931q, aVar);
        }
        playerSeekWidget3.f82934t = playerSeekWidget3.getSeekService().isSimpleProgressShowing();
        playerSeekWidget3.getSeekService().hideSimpleProgress();
        k.d(playerSeekWidget3.getSeekbarProgressDrawable(), true, true, false, 4);
        playerSeekWidget3.f82933s = true;
        if (!playerSeekWidget3.G() || (playerContainer = playerSeekWidget3.f82928n) == null || (interactLayerService = playerContainer.getInteractLayerService()) == null) {
            return;
        }
        interactLayerService.loadThumbnailIfNeed2();
    }

    public static final void z(PlayerSeekWidget3 playerSeekWidget3) {
        if (!playerSeekWidget3.f82961b) {
            BLog.i("PlayerSeekWidget3", "cancel stopTrackingTouch cause of not seeking");
            return;
        }
        FunctionWidgetToken functionWidgetToken = playerSeekWidget3.f82931q;
        if (functionWidgetToken != null) {
            playerSeekWidget3.getFunctionWidgetService().hideWidget(functionWidgetToken);
        }
        if (playerSeekWidget3.f82934t) {
            playerSeekWidget3.getSeekService().tryToShowSimpleProgress();
        }
        playerSeekWidget3.getSeekService().setDraggingByUser(false);
        com.bilibili.playerbizcommon.widget.control.seekbar.b bVar = playerSeekWidget3.f82930p.f80622c;
        if (bVar != null) {
            bVar.b();
        }
        k.d(playerSeekWidget3.getSeekbarProgressDrawable(), false, true, true, 1);
        int state = playerSeekWidget3.getPlayerCoreService().getState();
        if (!playerSeekWidget3.f82932r && (state == 4 || state == 5 || state == 6)) {
            int currentPosition = playerSeekWidget3.getPlayerCoreService().getCurrentPosition();
            int progress = playerSeekWidget3.getProgress() - currentPosition;
            if (progress > 2000 || progress < -500) {
                playerSeekWidget3.getPlayerCoreService().seekTo(playerSeekWidget3.getProgress());
            } else {
                playerSeekWidget3.setProgress(currentPosition);
            }
        }
        playerSeekWidget3.setSeeking(false);
        playerSeekWidget3.f82932r = false;
        playerSeekWidget3.f82933s = false;
    }

    public final void F() {
        com.bilibili.playerbizcommon.widget.control.seekbar.e eVar;
        Video.DisplayParams displayParams;
        IPlayDirector playDirector;
        BLog.i("PlayerSeekWidget3", "loadIcon");
        PlayerSeekbarThumbWrapper playerSeekbarThumbWrapper = this.f82930p;
        PlayerContainer playerContainer = this.f82928n;
        Video.PlayableParams currentPlayableParams = (playerContainer == null || (playDirector = PlayerContainerKt.getPlayDirector(playerContainer)) == null) ? null : playDirector.getCurrentPlayableParams();
        if (currentPlayableParams == null || (displayParams = currentPlayableParams.getDisplayParams()) == null) {
            eVar = new com.bilibili.playerbizcommon.widget.control.seekbar.e();
        } else {
            this.f82929o = displayParams.getCid();
            eVar = new com.bilibili.playerbizcommon.widget.control.seekbar.e(displayParams.getSeekIconUrl1(), displayParams.getCid(), displayParams.getSeekIconUrl2(), displayParams.getDragLeftIcon(), displayParams.getMiddleIcon(), displayParams.getDragRightIcon(), displayParams.getDragSpriteImg(), displayParams.getDragSpriteMeta(), displayParams.getFinishSpriteImg(), displayParams.getFinishSpriteMeta());
        }
        playerSeekbarThumbWrapper.a(eVar);
    }

    public final boolean G() {
        PlayerContainer playerContainer;
        IInteractLayerService interactLayerService;
        com.bilibili.playerbizcommonv2.utils.r windowSizeDelegate;
        StateFlow<WindowSizeClass> windowSizeFlow;
        WindowSizeClass windowSizeClass;
        boolean z6 = true;
        if (this.f82935u == ScreenModeType.THUMB && !this.f82937w) {
            int availableWidth = getFunctionWidgetService().getAvailableWidth();
            int availableHeight = getFunctionWidgetService().getAvailableHeight();
            if (availableWidth > 0 && availableHeight > 0) {
                if (this.f82936v == DisplayOrientation.LANDSCAPE || !((windowSizeDelegate = getWindowSizeDelegate()) == null || (windowSizeFlow = windowSizeDelegate.getWindowSizeFlow()) == null || (windowSizeClass = (WindowSizeClass) windowSizeFlow.getValue()) == null || !KScreenAdjustUtilsKt.isLarge(windowSizeClass))) {
                    com.bilibili.playerbizcommonv2.widget.base.i containerSizeDelegate = getContainerSizeDelegate();
                    int iA = containerSizeDelegate != null ? containerSizeDelegate.a() : 0;
                    if (iA > 0) {
                        if (iA > availableHeight) {
                            return false;
                        }
                    } else if (availableHeight / availableWidth < 0.5525f) {
                        return false;
                    }
                } else if (availableHeight / availableWidth < 1.0f) {
                    return false;
                }
            }
        }
        int networkWithoutCache = ConnectivityMonitor.getInstance().getNetworkWithoutCache();
        if (((networkWithoutCache != 2 || !PlayerFreeDataHelper.INSTANCE.isFreeCardUser()) && networkWithoutCache != 1) || (playerContainer = this.f82928n) == null || (interactLayerService = playerContainer.getInteractLayerService()) == null || !interactLayerService.hasThumbnails2()) {
            z6 = false;
        }
        return z6;
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f82928n = playerContainer;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) throws kotlin.KotlinNothingValueException {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.AnonymousClass1
            if (r0 == 0) goto L27
            r0 = r6
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$1 r0 = (com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.AnonymousClass1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L27
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L31
        L27:
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$1 r0 = new com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L31:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L5c
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L54
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L54:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L7d
        L5c:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$2 r0 = new com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$bindToView$2
            r1 = r0
            r2 = r5
            r3 = 0
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r6
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r8
            if (r0 != r1) goto L7d
            r0 = r8
            return r0
        L7d:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3.bindToView(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        q seekWidgetDelegate;
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && this.f82921J != null && (seekWidgetDelegate = getSeekWidgetDelegate()) != null) {
            seekWidgetDelegate.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @NotNull
    public final IControlContainerService getControlContainerService() {
        IControlContainerService iControlContainerService = this.f82916E;
        if (iControlContainerService != null) {
            return iControlContainerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
        return null;
    }

    @NotNull
    public final Er0.a getDelegateStoreService() {
        Er0.a aVar = this.f82921J;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
        return null;
    }

    @NotNull
    public final AbsFunctionWidgetService getFunctionWidgetService() {
        AbsFunctionWidgetService absFunctionWidgetService = this.f82919H;
        if (absFunctionWidgetService != null) {
            return absFunctionWidgetService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
        return null;
    }

    @NotNull
    public final IGestureService getGestureClient() {
        IGestureService iGestureService = this.f82918G;
        if (iGestureService != null) {
            return iGestureService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gestureClient");
        return null;
    }

    public boolean getMembersInjector() {
        return this.f82922K;
    }

    @NotNull
    public final IPlayerCoreService getPlayerCoreService() {
        IPlayerCoreService iPlayerCoreService = this.f82915D;
        if (iPlayerCoreService != null) {
            return iPlayerCoreService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
        return null;
    }

    @NotNull
    public final IReporterService getReporterService() {
        IReporterService iReporterService = this.f82920I;
        if (iReporterService != null) {
            return iReporterService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reporterService");
        return null;
    }

    @NotNull
    public final SeekService getSeekService() {
        SeekService seekService = this.f82917F;
        if (seekService != null) {
            return seekService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("seekService");
        return null;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bilibili.playerbizcommon.widget.control.seekbar.b bVar = this.f82930p.f80622c;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        com.bilibili.playerbizcommon.widget.control.seekbar.b bVar;
        com.bilibili.playerbizcommon.widget.control.seekbar.b bVar2 = this.f82930p.f80622c;
        if ((bVar2 != null ? bVar2.c() : false) && (bVar = this.f82930p.f80622c) != null) {
            bVar.g();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.bilibili.playerbizcommonv2.widget.seek.v3.e, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(CollectionsKt.listOf(new Rect(0, 0, i7, i8)));
        }
        this.f82933s = true;
    }

    public final void setControlContainerService(@NotNull IControlContainerService iControlContainerService) {
        this.f82916E = iControlContainerService;
    }

    public final void setDelegateStoreService(@NotNull Er0.a aVar) {
        this.f82921J = aVar;
    }

    public final void setFunctionWidgetService(@NotNull AbsFunctionWidgetService absFunctionWidgetService) {
        this.f82919H = absFunctionWidgetService;
    }

    public final void setGestureClient(@NotNull IGestureService iGestureService) {
        this.f82918G = iGestureService;
    }

    public final void setPlayerCoreService(@NotNull IPlayerCoreService iPlayerCoreService) {
        this.f82915D = iPlayerCoreService;
    }

    public final void setReporterService(@NotNull IReporterService iReporterService) {
        this.f82920I = iReporterService;
    }

    public final void setSeekService(@NotNull SeekService seekService) {
        this.f82917F = seekService;
    }
}
