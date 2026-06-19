package com.bilibili.ship.theseus.united.page.pausedpage;

import L3.a0;
import Vn.A;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.animation.C3357h;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.C4690e;
import androidx.recyclerview.widget.v;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.adcommon.config.DDConfig;
import com.bilibili.gripper.api.ad.biz.bussinessaccount.BizAccountViewModel;
import com.bilibili.gripper.api.ad.biz.panel.IPanelController;
import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;
import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.IVDPausedPage;
import com.bilibili.playerbizcommon.gesture.IGestureService;
import com.bilibili.playerbizcommon.gesture.OnDoubleTapListener;
import com.bilibili.ship.theseus.united.page.ad.AdPanelHelper;
import com.bilibili.ship.theseus.united.page.ad.AdPanelRepository;
import com.bilibili.ship.theseus.united.page.ad.AdRepository;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.pausedpage.a;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.playingarea.a;
import com.bilibili.ship.theseus.united.page.tab.u;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import com.bilibili.ship.theseus.united.widget.TouchAwareConstraintLayout;
import com.bilibili.ship.theseus.united.widget.TouchAwareToolbar;
import com.google.android.material.appbar.AppBarLayout;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kntr.app.ad.base.IKSourceContent;
import kntr.common.ad.capability.report.IReportable;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import tv.danmaku.biliplayerv2.service.z;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;
import zv0.C9268a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService.class */
@StabilityInferred(parameters = 0)
public final class PausedPageService {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f102137C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public IKSourceContent f102138D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public volatile boolean f102139E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public volatile boolean f102140F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public volatile boolean f102141G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f102142H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public Long f102143I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f102144J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f102148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AdRepository f102149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Er0.a f102150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IGestureService f102151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f102152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final z f102153g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.pausedpage.b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f102154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f102155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final C7893a f102156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a f102157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final PageNestedScrollFusionRepository f102158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f102159n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final u f102160o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ToolbarRepository f102161p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final ViewReply f102162q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final String f102163r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final IToastService f102164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Flow<c> f102165t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f102166u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Flow<C9268a.C1396a> f102167v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public Job f102168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public PlayerToast f102169x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public PauseTriggerSource f102170y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public FlowState f102171z = FlowState.IDLE;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f102135A = 3;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public b f102136B = new b(0);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final e f102145K = new e(this);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final Lazy f102146L = LazyKt.lazy(new a0(6));

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$10, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$10.class */
    public static final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(PausedPageService pausedPageService, Continuation<? super AnonymousClass10> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass10(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                this.label = 1;
                if (PausedPageService.i(pausedPageService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$11, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$11.class */
    public static final class AnonymousClass11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(PausedPageService pausedPageService, Continuation<? super AnonymousClass11> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass11(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                this.label = 1;
                if (PausedPageService.d(pausedPageService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$12, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$12.class */
    public static final class AnonymousClass12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(PausedPageService pausedPageService, Continuation<? super AnonymousClass12> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass12(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                this.label = 1;
                if (PausedPageService.c(pausedPageService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$13, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$13.class */
    public static final class AnonymousClass13 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(PausedPageService pausedPageService, Continuation<? super AnonymousClass13> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass13(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                this.label = 1;
                if (PausedPageService.g(pausedPageService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$14, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$14.class */
    public static final class AnonymousClass14 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(PausedPageService pausedPageService, Continuation<? super AnonymousClass14> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass14(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                this.label = 1;
                if (PausedPageService.e(pausedPageService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$15, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$15.class */
    public static final class AnonymousClass15 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(PausedPageService pausedPageService, Continuation<? super AnonymousClass15> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass15(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                this.label = 1;
                if (PausedPageService.f(pausedPageService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$16, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$16.class */
    public static final class AnonymousClass16 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass16(PausedPageService pausedPageService, Continuation<? super AnonymousClass16> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass16(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                this.label = 1;
                if (PausedPageService.b(pausedPageService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$17, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$17.class */
    public static final class AnonymousClass17 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass17(PausedPageService pausedPageService, Continuation<? super AnonymousClass17> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass17(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                this.label = 1;
                pausedPageService.getClass();
                Object objCollectLatest = FlowKt.collectLatest(pausedPageService.f102165t, new PausedPageService$collectPausedPageAnchor$2(pausedPageService, null), this);
                if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollectLatest = Unit.INSTANCE;
                }
                if (objCollectLatest == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$18, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$18.class */
    public static final class AnonymousClass18 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass18(PausedPageService pausedPageService, Continuation<? super AnonymousClass18> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass18(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            AppBarLayout appBarLayout;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<C9268a.C1396a> flow = this.this$0.f102167v;
                PausedPageService$18$appBarLayout$1 pausedPageService$18$appBarLayout$1 = new PausedPageService$18$appBarLayout$1(null);
                this.label = 1;
                Object objFirstOrNull = FlowKt.firstOrNull(flow, pausedPageService$18$appBarLayout$1, this);
                obj = objFirstOrNull;
                if (objFirstOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C9268a.C1396a c1396a = (C9268a.C1396a) obj;
            if (c1396a == null || (appBarLayout = c1396a.f130936a) == null) {
                return Unit.INSTANCE;
            }
            AdPanelRepository adPanelRepository = this.this$0.f102149c.f98927b;
            adPanelRepository.f98915o = appBarLayout;
            AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = adPanelRepository.f98914n;
            if (onOffsetChangedListener != null) {
                onOffsetChangedListener.onOffsetChanged(appBarLayout, 0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$19, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$19.class */
    public static final class AnonymousClass19 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass19(PausedPageService pausedPageService, Continuation<? super AnonymousClass19> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass19(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                this.label = 1;
                Object objCollectLatest = FlowKt.collectLatest(pausedPageService.f102161p.f103294r, new PausedPageService$collectToolbarActionPlay$2(pausedPageService, null), this);
                if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollectLatest = Unit.INSTANCE;
                }
                if (objCollectLatest == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final PausedPageService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$2$a.class */
        public static final class a implements OnDoubleTapListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PausedPageService f102172a;

            public a(PausedPageService pausedPageService) {
                this.f102172a = pausedPageService;
            }

            @Override // com.bilibili.playerbizcommon.gesture.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                PausedPageService pausedPageService = this.f102172a;
                if (pausedPageService.f102152f.getState() == 4) {
                    PausedPageService.o(pausedPageService, PauseTriggerSource.DOUBLE_TAP);
                    return false;
                }
                pausedPageService.r(AdPausedPageTriggerReason.RESUME_PLAY);
                return false;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PausedPageService pausedPageService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            a aVar2;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                aVar = new a(pausedPageService);
                IGestureService.addOnDoubleTapListener$default(pausedPageService.f102151e, aVar, 0, 2, null);
                PausedPageService pausedPageService2 = this.this$0;
                pausedPageService2.f102152f.registerState(pausedPageService2.f102145K, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 101, 100});
                try {
                    this.L$0 = aVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    aVar2 = aVar;
                    th = th2;
                    this.this$0.f102151e.removeOnDoubleTapListener(aVar2);
                    PausedPageService pausedPageService3 = this.this$0;
                    pausedPageService3.f102152f.unregisterState(pausedPageService3.f102145K);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a aVar3 = (a) this.L$0;
                aVar2 = aVar3;
                try {
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar3;
                } catch (Throwable th3) {
                    th = th3;
                    this.this$0.f102151e.removeOnDoubleTapListener(aVar2);
                    PausedPageService pausedPageService32 = this.this$0;
                    pausedPageService32.f102152f.unregisterState(pausedPageService32.f102145K);
                    throw th;
                }
            }
            aVar2 = aVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$20, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$20.class */
    public static final class AnonymousClass20 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$20$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$20$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PausedPageService f102173a;

            public a(PausedPageService pausedPageService) {
                this.f102173a = pausedPageService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                PausedPageService pausedPageService = this.f102173a;
                if (zBooleanValue) {
                    pausedPageService.getClass();
                } else {
                    int i7 = d.f102189a[pausedPageService.f102171z.ordinal()];
                    if (i7 == 2) {
                        pausedPageService.s(AdPausedPageTriggerReason.ORIENTATION_TO_LANDSCAPE);
                    } else if (i7 == 3 || i7 == 4 || i7 == 5) {
                        pausedPageService.r(AdPausedPageTriggerReason.ORIENTATION_TO_LANDSCAPE);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass20(PausedPageService pausedPageService, Continuation<? super AnonymousClass20> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass20(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow stateFlowC = this.this$0.f102159n.c();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>(stateFlowC) { // from class: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$20$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f102174a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$20$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$20$invokeSuspend$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f102175a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$20$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$20$invokeSuspend$$inlined$map$1$2$1.class */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            Object result;
                            final AnonymousClass2 this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                super(continuation);
                                this.this$0 = anonymousClass2;
                            }

                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return this.this$0.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f102175a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r0 = r7
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$20$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$20$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$20$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                r9 = r0
                                r0 = r9
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L29
                                r0 = r9
                                r1 = r8
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                int r1 = r1 + r2
                                r0.label = r1
                                r0 = r9
                                r7 = r0
                                goto L33
                            L29:
                                com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$20$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$20$invokeSuspend$$inlined$map$1$2$1
                                r1 = r0
                                r2 = r5
                                r3 = r7
                                r1.<init>(r2, r3)
                                r7 = r0
                            L33:
                                r0 = r7
                                java.lang.Object r0 = r0.result
                                r10 = r0
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                r9 = r0
                                r0 = r7
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                if (r0 == 0) goto L5e
                                r0 = r8
                                r1 = 1
                                if (r0 != r1) goto L54
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                goto L86
                            L54:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                r1 = r0
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r0
                            L5e:
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                r0 = r6
                                com.bilibili.ship.theseus.united.page.screenstate.c$a r0 = (com.bilibili.ship.theseus.united.page.screenstate.c.a) r0
                                boolean r0 = r0.f102987a
                                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                                r6 = r0
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f102175a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r9
                                if (r0 != r1) goto L86
                                r0 = r9
                                return r0
                            L86:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$20$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f102174a = stateFlowC;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f102174a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowDistinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$21, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$21.class */
    public static final class AnonymousClass21 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$21$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$21$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final PausedPageService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PausedPageService pausedPageService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pausedPageService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                this.this$0.f102139E = z6;
                PausedPageService pausedPageService = this.this$0;
                BLog.i("PausedPageService", "popoverChanged source=player showing=" + z6 + " hasPopover=" + ((pausedPageService.f102139E || pausedPageService.f102140F) ? 1 : 0));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass21(PausedPageService pausedPageService, Continuation<? super AnonymousClass21> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass21(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                StateFlow<Boolean> stateFlow = pausedPageService.f102166u.f99662l;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(pausedPageService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$22, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$22.class */
    public static final class AnonymousClass22 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$22$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$22$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final PausedPageService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PausedPageService pausedPageService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = pausedPageService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                this.this$0.f102140F = z6;
                PausedPageService pausedPageService = this.this$0;
                BLog.i("PausedPageService", "popoverChanged source=ad showing=" + z6 + " hasPopover=" + ((pausedPageService.f102139E || pausedPageService.f102140F) ? 1 : 0));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass22(PausedPageService pausedPageService, Continuation<? super AnonymousClass22> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass22(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final MutableStateFlow panelShowing = BizAccountViewModel.Companion.get(this.this$0.f102148b).getPanelShowing();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>(panelShowing) { // from class: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$22$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MutableStateFlow f102176a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$22$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$22$invokeSuspend$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f102177a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$22$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$22$invokeSuspend$$inlined$map$1$2$1.class */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            Object result;
                            final AnonymousClass2 this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                super(continuation);
                                this.this$0 = anonymousClass2;
                            }

                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return this.this$0.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f102177a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r0 = r7
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$22$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$22$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$22$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                r10 = r0
                                r0 = r10
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L29
                                r0 = r10
                                r1 = r8
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                int r1 = r1 + r2
                                r0.label = r1
                                r0 = r10
                                r7 = r0
                                goto L33
                            L29:
                                com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$22$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$22$invokeSuspend$$inlined$map$1$2$1
                                r1 = r0
                                r2 = r5
                                r3 = r7
                                r1.<init>(r2, r3)
                                r7 = r0
                            L33:
                                r0 = r7
                                java.lang.Object r0 = r0.result
                                r11 = r0
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                r10 = r0
                                r0 = r7
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                if (r0 == 0) goto L5e
                                r0 = r8
                                r1 = 1
                                if (r0 != r1) goto L54
                                r0 = r11
                                kotlin.ResultKt.throwOnFailure(r0)
                                goto L9a
                            L54:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                r1 = r0
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r0
                            L5e:
                                r0 = r11
                                kotlin.ResultKt.throwOnFailure(r0)
                                r0 = r6
                                com.bilibili.gripper.api.ad.biz.bussinessaccount.BizAccountPanelState r0 = (com.bilibili.gripper.api.ad.biz.bussinessaccount.BizAccountPanelState) r0
                                r6 = r0
                                r0 = r6
                                if (r0 == 0) goto L79
                                r0 = r6
                                com.bilibili.gripper.api.ad.biz.bussinessaccount.BizAccountPanelState r1 = com.bilibili.gripper.api.ad.biz.bussinessaccount.BizAccountPanelState.HIDDEN
                                if (r0 == r1) goto L79
                                r0 = 1
                                r9 = r0
                                goto L7c
                            L79:
                                r0 = 0
                                r9 = r0
                            L7c:
                                r0 = r9
                                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                                r6 = r0
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f102177a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r10
                                if (r0 != r1) goto L9a
                                r0 = r10
                                return r0
                            L9a:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$22$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f102176a = panelShowing;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f102176a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PausedPageService pausedPageService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                this.label = 1;
                final StateFlow<C7893a.C1318a> stateFlow = pausedPageService.f102156k.f123393f;
                Object objCollect = FlowKt.distinctUntilChanged(new Flow<Long>(stateFlow) { // from class: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectEpisodeChangeForSessionPlayTs$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f102187a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectEpisodeChangeForSessionPlayTs$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$collectEpisodeChangeForSessionPlayTs$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f102188a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectEpisodeChangeForSessionPlayTs$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$collectEpisodeChangeForSessionPlayTs$$inlined$map$1$2$1.class */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            Object result;
                            final AnonymousClass2 this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                super(continuation);
                                this.this$0 = anonymousClass2;
                            }

                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return this.this$0.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f102188a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r0 = r7
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectEpisodeChangeForSessionPlayTs$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectEpisodeChangeForSessionPlayTs$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectEpisodeChangeForSessionPlayTs$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                r9 = r0
                                r0 = r9
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L29
                                r0 = r9
                                r1 = r8
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                int r1 = r1 + r2
                                r0.label = r1
                                r0 = r9
                                r7 = r0
                                goto L33
                            L29:
                                com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectEpisodeChangeForSessionPlayTs$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectEpisodeChangeForSessionPlayTs$$inlined$map$1$2$1
                                r1 = r0
                                r2 = r5
                                r3 = r7
                                r1.<init>(r2, r3)
                                r7 = r0
                            L33:
                                r0 = r7
                                java.lang.Object r0 = r0.result
                                r10 = r0
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                r9 = r0
                                r0 = r7
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                if (r0 == 0) goto L5e
                                r0 = r8
                                r1 = 1
                                if (r0 != r1) goto L54
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                goto L94
                            L54:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                r1 = r0
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r0
                            L5e:
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                r0 = r6
                                lv0.a$a r0 = (lv0.C7893a.C1318a) r0
                                r6 = r0
                                r0 = r6
                                if (r0 == 0) goto L7a
                                r0 = r6
                                lv0.a$a$a r0 = r0.f123395a
                                long r0 = r0.f123398b
                                java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
                                r6 = r0
                                goto L7c
                            L7a:
                                r0 = 0
                                r6 = r0
                            L7c:
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f102188a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r9
                                if (r0 != r1) goto L94
                                r0 = r9
                                return r0
                            L94:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectEpisodeChangeForSessionPlayTs$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f102187a = stateFlow;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect2 = this.f102187a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect2 : Unit.INSTANCE;
                    }
                }).collect(new com.bilibili.ship.theseus.united.page.pausedpage.c(pausedPageService), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.ship.theseus.united.page.pausedpage.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PausedPageService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PausedPageService pausedPageService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pausedPageService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(com.bilibili.ship.theseus.united.page.pausedpage.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00df  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) throws kotlin.NoWhenBranchMatchedException {
                /*
                    Method dump skipped, instruction units count: 795
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.AnonymousClass4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PausedPageService pausedPageService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                SharedFlow<com.bilibili.ship.theseus.united.page.pausedpage.a> sharedFlow = pausedPageService.h.f102203b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(pausedPageService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(PausedPageService pausedPageService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                this.label = 1;
                pausedPageService.getClass();
                Object objCollectLatest = FlowKt.collectLatest(pausedPageService.f102165t, new PausedPageService$collectView$2(pausedPageService, null), this);
                if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollectLatest = Unit.INSTANCE;
                }
                if (objCollectLatest == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(PausedPageService pausedPageService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                this.label = 1;
                if (PausedPageService.h(pausedPageService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(PausedPageService pausedPageService, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                this.label = 1;
                if (PausedPageService.l(pausedPageService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$8.class */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(PausedPageService pausedPageService, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass8(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                this.label = 1;
                if (PausedPageService.k(pausedPageService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$9.class */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PausedPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(PausedPageService pausedPageService, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = pausedPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass9(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PausedPageService pausedPageService = this.this$0;
                this.label = 1;
                if (PausedPageService.j(pausedPageService, this) == coroutine_suspended) {
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$FlowState.class */
    public static final class FlowState {
        private static final EnumEntries $ENTRIES;
        private static final FlowState[] $VALUES;

        @NotNull
        private final String value;
        public static final FlowState IDLE = new FlowState("IDLE", 0, "idle");
        public static final FlowState REQUESTING = new FlowState("REQUESTING", 1, "requesting");
        public static final FlowState COUNTDOWN = new FlowState("COUNTDOWN", 2, "countdown");
        public static final FlowState STOCK_WAITING = new FlowState("STOCK_WAITING", 3, "stock_waiting");
        public static final FlowState PANEL_VISIBLE = new FlowState("PANEL_VISIBLE", 4, "panel_visible");

        private static final /* synthetic */ FlowState[] $values() {
            return new FlowState[]{IDLE, REQUESTING, COUNTDOWN, STOCK_WAITING, PANEL_VISIBLE};
        }

        static {
            FlowState[] flowStateArr$values = $values();
            $VALUES = flowStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(flowStateArr$values);
        }

        private FlowState(String str, int i7, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<FlowState> getEntries() {
            return $ENTRIES;
        }

        public static FlowState valueOf(String str) {
            return (FlowState) Enum.valueOf(FlowState.class, str);
        }

        public static FlowState[] values() {
            return (FlowState[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$PauseTriggerSource.class */
    public static final class PauseTriggerSource {
        private static final EnumEntries $ENTRIES;
        private static final PauseTriggerSource[] $VALUES;

        @NotNull
        private final String value;
        public static final PauseTriggerSource WIDGET = new PauseTriggerSource("WIDGET", 0, "widget");
        public static final PauseTriggerSource DOUBLE_TAP = new PauseTriggerSource("DOUBLE_TAP", 1, "double_tap");

        private static final /* synthetic */ PauseTriggerSource[] $values() {
            return new PauseTriggerSource[]{WIDGET, DOUBLE_TAP};
        }

        static {
            PauseTriggerSource[] pauseTriggerSourceArr$values = $values();
            $VALUES = pauseTriggerSourceArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(pauseTriggerSourceArr$values);
        }

        private PauseTriggerSource(String str, int i7, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<PauseTriggerSource> getEntries() {
            return $ENTRIES;
        }

        public static PauseTriggerSource valueOf(String str) {
            return (PauseTriggerSource) Enum.valueOf(PauseTriggerSource.class, str);
        }

        public static PauseTriggerSource[] values() {
            return (PauseTriggerSource[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f102178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f102179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f102180c;

        public a(long j7, long j8, long j9) {
            this.f102178a = j7;
            this.f102179b = j8;
            this.f102180c = j9;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f102178a == aVar.f102178a && this.f102179b == aVar.f102179b && this.f102180c == aVar.f102180c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f102180c) + C3554n0.a(Long.hashCode(this.f102178a) * 31, 31, this.f102179b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("PlaybackReportSnapshot(avid=");
            sb.append(this.f102178a);
            sb.append(", progressMs=");
            sb.append(this.f102179b);
            sb.append(", durationMs=");
            return android.support.v4.media.session.a.a(sb, this.f102180c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f102181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f102182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final IReportable f102183c;

        public b() {
            this(0);
        }

        public /* synthetic */ b(int i7) {
            this(false, false, null);
        }

        public b(boolean z6, boolean z7, @Nullable IReportable iReportable) {
            this.f102181a = z6;
            this.f102182b = z7;
            this.f102183c = iReportable;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f102181a == bVar.f102181a && this.f102182b == bVar.f102182b && Intrinsics.areEqual(this.f102183c, bVar.f102183c);
        }

        public final int hashCode() {
            int iA = androidx.compose.animation.z.a(Boolean.hashCode(this.f102181a) * 31, 31, this.f102182b);
            IReportable iReportable = this.f102183c;
            return iA + (iReportable == null ? 0 : iReportable.hashCode());
        }

        @NotNull
        public final String toString() {
            return "RequestReturnSnapshot(returned=" + this.f102181a + ", hasData=" + this.f102182b + ", reportable=" + this.f102183c + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TouchAwareConstraintLayout f102184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TouchAwareToolbar f102185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final View f102186c;

        public c(@NotNull TouchAwareConstraintLayout touchAwareConstraintLayout, @NotNull TouchAwareToolbar touchAwareToolbar, @Nullable View view) {
            this.f102184a = touchAwareConstraintLayout;
            this.f102185b = touchAwareToolbar;
            this.f102186c = view;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$d.class */
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f102189a;

        static {
            int[] iArr = new int[FlowState.values().length];
            try {
                iArr[FlowState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[FlowState.PANEL_VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[FlowState.REQUESTING.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[FlowState.COUNTDOWN.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[FlowState.STOCK_WAITING.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f102189a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$e.class */
    public static final class e implements PlayerStateObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PausedPageService f102190a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$e$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f102191a;

            static {
                int[] iArr = new int[FlowState.values().length];
                try {
                    iArr[FlowState.REQUESTING.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[FlowState.COUNTDOWN.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[FlowState.STOCK_WAITING.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[FlowState.PANEL_VISIBLE.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                try {
                    iArr[FlowState.IDLE.ordinal()] = 5;
                } catch (NoSuchFieldError e11) {
                }
                f102191a = iArr;
            }
        }

        public e(PausedPageService pausedPageService) {
            this.f102190a = pausedPageService;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final void onPlayerStateChanged(int i7) throws NoWhenBranchMatchedException {
            PausedPageService pausedPageService = this.f102190a;
            int i8 = pausedPageService.f102142H;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (i8 != 4 && i7 == 4) {
                pausedPageService.f102143I = Long.valueOf(jElapsedRealtime);
                pausedPageService.f102144J = 0L;
            } else if (i8 == 4 && i7 != 4) {
                Long l7 = pausedPageService.f102143I;
                pausedPageService.f102144J = l7 == null ? RangesKt.coerceAtLeast(pausedPageService.f102144J, 0L) : RangesKt.coerceAtLeast(jElapsedRealtime - l7.longValue(), 0L);
                pausedPageService.f102143I = null;
            }
            pausedPageService.f102142H = i7;
            if (i7 != 4) {
                return;
            }
            int i9 = a.f102191a[pausedPageService.f102171z.ordinal()];
            if (i9 == 1 || i9 == 2 || i9 == 3) {
                pausedPageService.r(AdPausedPageTriggerReason.RESUME_PLAY);
            } else if (i9 == 4) {
                pausedPageService.s(AdPausedPageTriggerReason.RESUME_PLAY);
            } else if (i9 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Inject
    public PausedPageService(@NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull AdRepository adRepository, @NotNull Er0.a aVar, @NotNull IGestureService iGestureService, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull z zVar, @NotNull com.bilibili.ship.theseus.united.page.pausedpage.b bVar, @NotNull PageAdRepository pageAdRepository, @NotNull BackActionRepository backActionRepository, @NotNull C7893a c7893a, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar2, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull u uVar, @NotNull ToolbarRepository toolbarRepository, @NotNull ViewReply viewReply, @NotNull String str, @NotNull IToastService iToastService, @NotNull Flow<c> flow, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull Flow<C9268a.C1396a> flow2) {
        this.f102147a = coroutineScope;
        this.f102148b = fragmentActivity;
        this.f102149c = adRepository;
        this.f102150d = aVar;
        this.f102151e = iGestureService;
        this.f102152f = iPlayerCoreService;
        this.f102153g = zVar;
        this.h = bVar;
        this.f102154i = pageAdRepository;
        this.f102155j = backActionRepository;
        this.f102156k = c7893a;
        this.f102157l = aVar2;
        this.f102158m = pageNestedScrollFusionRepository;
        this.f102159n = cVar;
        this.f102160o = uVar;
        this.f102161p = toolbarRepository;
        this.f102162q = viewReply;
        this.f102163r = str;
        this.f102164s = iToastService;
        this.f102165t = flow;
        this.f102166u = theseusFloatLayerService;
        this.f102167v = flow2;
        adRepository.f98927b.f98919s = new com.bilibili.bililive.room.ui.roomv3.player.z(this, 3);
        y("service_init");
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass8(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass9(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass10(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass11(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass12(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass13(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass14(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass15(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass16(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass17(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass18(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass19(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass20(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass21(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass22(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List a(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService r11) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.a(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerBgmWidget$1
            if (r0 == 0) goto L2c
            r0 = r6
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerBgmWidget$1 r0 = (com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerBgmWidget$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L36
        L2c:
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerBgmWidget$1 r0 = new com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerBgmWidget$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L36:
            r0 = r6
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            com.bilibili.app.gemini.ugc.feature.E$a r0 = com.bilibili.app.gemini.ugc.feature.E.a.a
            r8 = r0
            r0 = r5
            Er0.a r0 = r0.f102150d
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L70
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L64
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L64:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6c
            goto L96
        L6c:
            r5 = move-exception
            goto La0
        L70:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.pausedpage.d r0 = new com.bilibili.ship.theseus.united.page.pausedpage.d
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
            r0 = r9
            r1 = r8
            r2 = r5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L6c
            r1 = r10
            if (r0 != r1) goto L96
            r0 = r10
            return r0
        L96:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L6c
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
            r0 = r5
            throw r0     // Catch: java.lang.Throwable -> L6c
        La0:
            r0 = r9
            r1 = r8
            r0.remove(r1)
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.b(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerFullStoryWidget$1
            if (r0 == 0) goto L2c
            r0 = r6
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerFullStoryWidget$1 r0 = (com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerFullStoryWidget$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L36
        L2c:
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerFullStoryWidget$1 r0 = new com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerFullStoryWidget$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L36:
            r0 = r6
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            com.bilibili.app.gemini.player.widget.story.j$a r0 = com.bilibili.app.gemini.player.widget.story.j.a.a
            r9 = r0
            r0 = r5
            Er0.a r0 = r0.f102150d
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L70
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L64
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L64:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6c
            goto L96
        L6c:
            r5 = move-exception
            goto La0
        L70:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.pausedpage.e r0 = new com.bilibili.ship.theseus.united.page.pausedpage.e
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
            r0 = r8
            r1 = r9
            r2 = r5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L6c
            r1 = r10
            if (r0 != r1) goto L96
            r0 = r10
            return r0
        L96:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L6c
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
            r0 = r5
            throw r0     // Catch: java.lang.Throwable -> L6c
        La0:
            r0 = r8
            r1 = r9
            r0.remove(r1)
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.c(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerFullscreenWidget$1
            if (r0 == 0) goto L2c
            r0 = r6
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerFullscreenWidget$1 r0 = (com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerFullscreenWidget$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L36
        L2c:
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerFullscreenWidget$1 r0 = new com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerFullscreenWidget$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L36:
            r0 = r6
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            com.bilibili.app.gemini.player.widget.story.k$a r0 = com.bilibili.app.gemini.player.widget.story.k.a.a
            r9 = r0
            r0 = r5
            Er0.a r0 = r0.f102150d
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L70
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L64
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L64:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6c
            goto L96
        L6c:
            r5 = move-exception
            goto La0
        L70:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.pausedpage.f r0 = new com.bilibili.ship.theseus.united.page.pausedpage.f
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
            r0 = r8
            r1 = r9
            r2 = r5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L6c
            r1 = r10
            if (r0 != r1) goto L96
            r0 = r10
            return r0
        L96:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L6c
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
            r0 = r5
            throw r0     // Catch: java.lang.Throwable -> L6c
        La0:
            r0 = r8
            r1 = r9
            r0.remove(r1)
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.d(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerHalfWatchpointTextWidgetWidget$1
            if (r0 == 0) goto L2c
            r0 = r6
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerHalfWatchpointTextWidgetWidget$1 r0 = (com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerHalfWatchpointTextWidgetWidget$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L36
        L2c:
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerHalfWatchpointTextWidgetWidget$1 r0 = new com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerHalfWatchpointTextWidgetWidget$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L36:
            r0 = r6
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            com.bilibili.app.gemini.player.widget.watchpoint.l$a r0 = com.bilibili.app.gemini.player.widget.watchpoint.l.a.a
            r9 = r0
            r0 = r5
            Er0.a r0 = r0.f102150d
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L70
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L64
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L64:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6c
            goto L96
        L6c:
            r5 = move-exception
            goto La0
        L70:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.pausedpage.g r0 = new com.bilibili.ship.theseus.united.page.pausedpage.g
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
            r0 = r8
            r1 = r9
            r2 = r5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L6c
            r1 = r10
            if (r0 != r1) goto L96
            r0 = r10
            return r0
        L96:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L6c
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
            r0 = r5
            throw r0     // Catch: java.lang.Throwable -> L6c
        La0:
            r0 = r8
            r1 = r9
            r0.remove(r1)
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.e(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerHalfWatchpointWidgetWidget$1
            if (r0 == 0) goto L2c
            r0 = r6
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerHalfWatchpointWidgetWidget$1 r0 = (com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerHalfWatchpointWidgetWidget$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L36
        L2c:
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerHalfWatchpointWidgetWidget$1 r0 = new com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerHalfWatchpointWidgetWidget$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L36:
            r0 = r6
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            com.bilibili.app.gemini.player.widget.watchpoint.m$a r0 = com.bilibili.app.gemini.player.widget.watchpoint.m.a.a
            r9 = r0
            r0 = r5
            Er0.a r0 = r0.f102150d
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L70
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L64
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L64:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6c
            goto L96
        L6c:
            r5 = move-exception
            goto La0
        L70:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.pausedpage.h r0 = new com.bilibili.ship.theseus.united.page.pausedpage.h
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
            r0 = r8
            r1 = r9
            r2 = r5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L6c
            r1 = r10
            if (r0 != r1) goto L96
            r0 = r10
            return r0
        L96:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L6c
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
            r0 = r5
            throw r0     // Catch: java.lang.Throwable -> L6c
        La0:
            r0 = r8
            r1 = r9
            r0.remove(r1)
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.f(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerWatchpointTextWidgetWidget$1
            if (r0 == 0) goto L2c
            r0 = r6
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerWatchpointTextWidgetWidget$1 r0 = (com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerWatchpointTextWidgetWidget$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L36
        L2c:
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerWatchpointTextWidgetWidget$1 r0 = new com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectGeminiPlayerWatchpointTextWidgetWidget$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L36:
            r0 = r6
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            com.bilibili.app.gemini.player.widget.watchpoint.n$a r0 = com.bilibili.app.gemini.player.widget.watchpoint.n.a.a
            r8 = r0
            r0 = r5
            Er0.a r0 = r0.f102150d
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L70
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L64
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L64:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6c
            goto L96
        L6c:
            r5 = move-exception
            goto La0
        L70:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.pausedpage.i r0 = new com.bilibili.ship.theseus.united.page.pausedpage.i
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
            r0 = r9
            r1 = r8
            r2 = r5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L6c
            r1 = r10
            if (r0 != r1) goto L96
            r0 = r10
            return r0
        L96:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L6c
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
            r0 = r5
            throw r0     // Catch: java.lang.Throwable -> L6c
        La0:
            r0 = r9
            r1 = r8
            r0.remove(r1)
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.g(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPlayOrPause$1
            if (r0 == 0) goto L2c
            r0 = r6
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPlayOrPause$1 r0 = (com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPlayOrPause$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L36
        L2c:
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPlayOrPause$1 r0 = new com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPlayOrPause$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L36:
            r0 = r6
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            com.bilibili.playerbizcommonv2.widget.base.d$a r0 = com.bilibili.playerbizcommonv2.widget.base.d.a.f82392a
            r8 = r0
            r0 = r5
            Er0.a r0 = r0.f102150d
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L70
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L64
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L64:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6c
            goto L96
        L6c:
            r5 = move-exception
            goto La0
        L70:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.pausedpage.l r0 = new com.bilibili.ship.theseus.united.page.pausedpage.l
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
            r0 = r9
            r1 = r8
            r2 = r5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L6c
            r1 = r10
            if (r0 != r1) goto L96
            r0 = r10
            return r0
        L96:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L6c
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
            r0 = r5
            throw r0     // Catch: java.lang.Throwable -> L6c
        La0:
            r0 = r9
            r1 = r8
            r0.remove(r1)
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.h(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPlayerGestureDrag$1
            if (r0 == 0) goto L2c
            r0 = r6
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPlayerGestureDrag$1 r0 = (com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPlayerGestureDrag$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L36
        L2c:
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPlayerGestureDrag$1 r0 = new com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPlayerGestureDrag$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L36:
            r0 = r6
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r5
            com.bilibili.playerbizcommon.gesture.IGestureService r0 = r0.f102151e
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L6b
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L5f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5f:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L67
            goto L9b
        L67:
            r5 = move-exception
            goto La5
        L6b:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.pausedpage.m r0 = new com.bilibili.ship.theseus.united.page.pausedpage.m
            r1 = r0
            r2 = r5
            androidx.fragment.app.FragmentActivity r2 = r2.f102148b
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            int r2 = r2.getScaledTouchSlop()
            r3 = r5
            r1.<init>(r2, r3)
            r5 = r0
            r0 = r8
            r1 = r5
            r0.setOnTouchListener(r1)     // Catch: java.lang.Throwable -> L67
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L67
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L67
            r1 = r9
            if (r0 != r1) goto L9b
            r0 = r9
            return r0
        L9b:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L67
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: java.lang.Throwable -> L67
            r0 = r5
            throw r0     // Catch: java.lang.Throwable -> L67
        La5:
            r0 = r8
            r1 = 0
            r0.setOnTouchListener(r1)
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.i(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPlayerSeek$1
            if (r0 == 0) goto L2c
            r0 = r6
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPlayerSeek$1 r0 = (com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPlayerSeek$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L36
        L2c:
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPlayerSeek$1 r0 = new com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectPlayerSeek$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L36:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r5
            tv.danmaku.biliplayerv2.service.IPlayerCoreService r0 = r0.f102152f
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L75
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L5f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5f:
            r0 = r6
            java.lang.Object r0 = r0.L$0
            com.bilibili.ship.theseus.united.page.pausedpage.n r0 = (com.bilibili.ship.theseus.united.page.pausedpage.n) r0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L71
            goto La4
        L71:
            r6 = move-exception
            goto Lb8
        L75:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.pausedpage.n r0 = new com.bilibili.ship.theseus.united.page.pausedpage.n
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
            r0 = r8
            r1 = r5
            r0.registerSeekObserver(r1)     // Catch: java.lang.Throwable -> Lb7
            r0 = r6
            r1 = r5
            r0.L$0 = r1     // Catch: java.lang.Throwable -> Lb7
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> Lb7
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> Lb7
            r6 = r0
            r0 = r6
            r1 = r10
            if (r0 != r1) goto La2
            r0 = r10
            return r0
        La2:
            r0 = r5
            r6 = r0
        La4:
            r0 = r6
            r5 = r0
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L71
            r9 = r0
            r0 = r6
            r5 = r0
            r0 = r9
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            r0 = r6
            r5 = r0
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> L71
        Lb7:
            r6 = move-exception
        Lb8:
            r0 = r8
            r1 = r5
            r0.unregisterSeekObserver(r1)
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.j(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectSeekDragging$1
            if (r0 == 0) goto L2c
            r0 = r6
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectSeekDragging$1 r0 = (com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectSeekDragging$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L36
        L2c:
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectSeekDragging$1 r0 = new com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectSeekDragging$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L36:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r5
            tv.danmaku.biliplayerv2.service.z r0 = r0.f102153g
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L75
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L5f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5f:
            r0 = r6
            java.lang.Object r0 = r0.L$0
            com.bilibili.ship.theseus.united.page.pausedpage.o r0 = (com.bilibili.ship.theseus.united.page.pausedpage.o) r0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L71
            goto La4
        L71:
            r6 = move-exception
            goto Lb8
        L75:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.pausedpage.o r0 = new com.bilibili.ship.theseus.united.page.pausedpage.o
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
            r0 = r8
            r1 = r5
            r0.registerDraggingProgress(r1)     // Catch: java.lang.Throwable -> Lb7
            r0 = r6
            r1 = r5
            r0.L$0 = r1     // Catch: java.lang.Throwable -> Lb7
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> Lb7
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> Lb7
            r6 = r0
            r0 = r6
            r1 = r10
            if (r0 != r1) goto La2
            r0 = r10
            return r0
        La2:
            r0 = r5
            r6 = r0
        La4:
            r0 = r6
            r5 = r0
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L71
            r9 = r0
            r0 = r6
            r5 = r0
            r0 = r9
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            r0 = r6
            r5 = r0
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> L71
        Lb7:
            r6 = move-exception
        Lb8:
            r0 = r8
            r1 = r5
            r0.unregisterDraggingProgress(r1)
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.k(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectSeekWidget$1
            if (r0 == 0) goto L2c
            r0 = r6
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectSeekWidget$1 r0 = (com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectSeekWidget$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L36
        L2c:
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectSeekWidget$1 r0 = new com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$collectSeekWidget$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L36:
            r0 = r6
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            com.bilibili.playerbizcommonv2.widget.seek.v3.q$a r0 = com.bilibili.playerbizcommonv2.widget.seek.v3.q.a.f83066a
            r9 = r0
            r0 = r5
            Er0.a r0 = r0.f102150d
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L70
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L64
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L64:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6c
            goto L96
        L6c:
            r5 = move-exception
            goto La0
        L70:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.pausedpage.p r0 = new com.bilibili.ship.theseus.united.page.pausedpage.p
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
            r0 = r8
            r1 = r9
            r2 = r5
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L6c
            r1 = r10
            if (r0 != r1) goto L96
            r0 = r10
            return r0
        L96:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L6c
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
            r0 = r5
            throw r0     // Catch: java.lang.Throwable -> L6c
        La0:
            r0 = r8
            r1 = r9
            r0.remove(r1)
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.l(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService r13, com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.PauseTriggerSource r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.m(com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService, com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$PauseTriggerSource, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Pair n(PausedPageService pausedPageService) {
        com.bilibili.ship.theseus.united.page.playingarea.a aVar = pausedPageService.f102157l;
        Pair<Integer, Integer> pairD = aVar.d();
        a.C1102a c1102aC = aVar.c();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(((Number) pairD.getFirst()).intValue(), 0);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(((Number) pairD.getSecond()).intValue(), 0);
        int iCoerceAtLeast3 = RangesKt.coerceAtLeast(c1102aC.f102351a, 0);
        int iCoerceAtLeast4 = RangesKt.coerceAtLeast(c1102aC.f102352b, 0);
        int iCoerceAtLeast5 = RangesKt.coerceAtLeast(iCoerceAtLeast2 - iCoerceAtLeast4, 0);
        int iCoerceAtLeast6 = RangesKt.coerceAtLeast(MathKt.roundToInt(com.bilibili.playerbizcommonv2.utils.g.a(iCoerceAtLeast)), 0);
        int iCoerceAtLeast7 = RangesKt.coerceAtLeast(MathKt.roundToInt(com.bilibili.playerbizcommonv2.utils.g.a(iCoerceAtLeast5)), 0);
        StringBuilder sbB = A.b(iCoerceAtLeast, iCoerceAtLeast2, "resolveNonPlayerAreaSize rootPx=", "x", " playerPx=");
        C4690e.a(iCoerceAtLeast3, iCoerceAtLeast4, "x", " nonPlayerPx=", sbB);
        C4690e.a(iCoerceAtLeast, iCoerceAtLeast5, "x", " nonPlayerDp=", sbB);
        C3357h.c(iCoerceAtLeast6, iCoerceAtLeast7, "x", "PausedPageService", sbB);
        return TuplesKt.to(Integer.valueOf(iCoerceAtLeast6), Integer.valueOf(iCoerceAtLeast7));
    }

    public static final void o(PausedPageService pausedPageService, PauseTriggerSource pauseTriggerSource) {
        pausedPageService.getClass();
        if (!DDConfig.INSTANCE.getPausePageEnable()) {
            defpackage.a.b("skipPausedPageFlow reason=config_disabled source=", pauseTriggerSource.getValue(), "PausedPageService");
            return;
        }
        if (!pausedPageService.f102159n.h().f102987a) {
            defpackage.a.b("skipPausedPageFlow reason=horizontal_orientation source=", pauseTriggerSource.getValue(), "PausedPageService");
            return;
        }
        Job job = pausedPageService.f102168w;
        pausedPageService.f102168w = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        defpackage.a.b("startPausedPageFlow source=", pauseTriggerSource.getValue(), "PausedPageService");
        pausedPageService.f102170y = pauseTriggerSource;
        pausedPageService.z(FlowState.REQUESTING);
        pausedPageService.f102136B = new b(0);
        pausedPageService.f102137C = false;
        pausedPageService.f102138D = null;
        Job jobLaunch$default = BuildersKt.launch$default(pausedPageService.f102147a, (CoroutineContext) null, CoroutineStart.LAZY, new PausedPageService$startPausedPageFlow$job$1(pausedPageService, pauseTriggerSource, null), 1, (Object) null);
        pausedPageService.f102168w = jobLaunch$default;
        jobLaunch$default.start();
    }

    public final void p(String str) {
        PauseTriggerSource pauseTriggerSource = this.f102170y;
        if (pauseTriggerSource != null) {
            j4.o.a("cancelPausedPageFlow source=", pauseTriggerSource.getValue(), " reason=", str, "PausedPageService");
        } else {
            defpackage.a.b("cancelPausedPageFlow source=unknown reason=", str, "PausedPageService");
        }
        Job job = this.f102168w;
        this.f102168w = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        q(null);
        this.f102170y = null;
        this.f102137C = false;
        this.f102138D = null;
        z(FlowState.IDLE);
    }

    public final void q(AdPausedPageTriggerReason adPausedPageTriggerReason) {
        AdPanelHelper adPanelHelper;
        AdPanelHelper adPanelHelper2;
        AdPanelHelper adPanelHelper3;
        PlayerToast playerToast = this.f102169x;
        if (playerToast != null) {
            this.f102164s.dismissToast(playerToast);
        }
        this.f102169x = null;
        int i7 = this.f102135A;
        AdPanelRepository adPanelRepository = this.f102149c.f98927b;
        adPanelRepository.getClass();
        if (i7 == 3 || i7 == 4) {
            AdPanelHelper adPanelHelper4 = adPanelRepository.f98912l;
            if (adPanelHelper4 != null && adPanelHelper4.b() && (adPanelHelper = adPanelRepository.f98912l) != null) {
                adPanelHelper.a(adPausedPageTriggerReason, true);
            }
        } else {
            Integer num = adPanelRepository.f98925y;
            if (num != null && num.intValue() == i7 && (adPanelHelper2 = adPanelRepository.f98911k) != null && adPanelHelper2.b() && (adPanelHelper3 = adPanelRepository.f98911k) != null) {
                IPanelController.hidePanel$default(adPanelHelper3, false, 1, (Object) null);
            }
        }
        this.f102135A = 3;
    }

    public final void r(AdPausedPageTriggerReason adPausedPageTriggerReason) {
        int i7 = d.f102189a[this.f102171z.ordinal()];
        if (i7 == 1) {
            PauseTriggerSource pauseTriggerSource = this.f102170y;
            String value = "none";
            if (pauseTriggerSource != null) {
                value = pauseTriggerSource.getValue();
                if (value == null) {
                    value = "none";
                }
            }
            String value2 = this.f102171z.getValue();
            StringBuilder sb = new StringBuilder("ignoreCancel reason=");
            sb.append(adPausedPageTriggerReason);
            sb.append(" source=");
            sb.append(value);
            sb.append(" flow=");
            bilibili.live.app.service.resolver.b.a(sb, value2, "PausedPageService");
            return;
        }
        if (i7 != 2) {
            v("cancel", adPausedPageTriggerReason);
            this.h.f102202a.tryEmit(new a.C1079a(adPausedPageTriggerReason));
            return;
        }
        if (adPausedPageTriggerReason != AdPausedPageTriggerReason.CLICK_UNDER_PLAYER) {
            s(adPausedPageTriggerReason);
            return;
        }
        PauseTriggerSource pauseTriggerSource2 = this.f102170y;
        String value3 = "none";
        if (pauseTriggerSource2 != null) {
            value3 = pauseTriggerSource2.getValue();
            if (value3 == null) {
                value3 = "none";
            }
        }
        String value4 = this.f102171z.getValue();
        StringBuilder sb2 = new StringBuilder("ignoreCancel reason=");
        sb2.append(adPausedPageTriggerReason);
        sb2.append(" source=");
        sb2.append(value3);
        sb2.append(" flow=");
        com.bilibili.app.dialogmanager2.b.b(value4, " detail=excluded_when_panel_visible", "PausedPageService", sb2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason r5) {
        /*
            r4 = this;
            r0 = r4
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$FlowState r0 = r0.f102171z
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$FlowState r1 = com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.FlowState.IDLE
            if (r0 != r1) goto L5c
            r0 = r4
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$PauseTriggerSource r0 = r0.f102170y
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L1e
            r0 = r6
            java.lang.String r0 = r0.getValue()
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L22
        L1e:
            java.lang.String r0 = "none"
            r6 = r0
        L22:
            r0 = r4
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$FlowState r0 = r0.f102171z
            java.lang.String r0 = r0.getValue()
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "ignoreClose reason="
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = " source="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = " flow="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r8
            java.lang.String r2 = "PausedPageService"
            bilibili.live.app.service.resolver.b.a(r0, r1, r2)
            return
        L5c:
            r0 = r4
            java.lang.String r1 = "close"
            r2 = r5
            r0.v(r1, r2)
            com.bilibili.ship.theseus.united.page.pausedpage.a$b r0 = new com.bilibili.ship.theseus.united.page.pausedpage.a$b
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            com.bilibili.ship.theseus.united.page.pausedpage.b r0 = r0.h
            kotlinx.coroutines.flow.MutableSharedFlow<com.bilibili.ship.theseus.united.page.pausedpage.a> r0 = r0.f102202a
            r1 = r5
            boolean r0 = r0.tryEmit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.s(com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(kntr.app.ad.base.protocol.biz.vd.pausedpage.IAdPausedPageData r8, com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.PauseTriggerSource r9, kotlinx.coroutines.Job r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.t(kntr.app.ad.base.protocol.biz.vd.pausedpage.IAdPausedPageData, com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$PauseTriggerSource, kotlinx.coroutines.Job, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean u(Job job) {
        return job != null && this.f102168w == job;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.String r5, com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason r6) {
        /*
            r4 = this;
            r0 = r4
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$PauseTriggerSource r0 = r0.f102170y
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L1b
            r0 = r8
            java.lang.String r0 = r0.getValue()
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L20
        L1b:
            java.lang.String r0 = "none"
            r8 = r0
        L20:
            r0 = r5
            r9 = r0
            r0 = r5
            int r0 = r0.length()
            if (r0 <= 0) goto L55
            r0 = r5
            r1 = 0
            char r0 = r0.charAt(r1)
            char r0 = java.lang.Character.toUpperCase(r0)
            r7 = r0
            r0 = r5
            r1 = 1
            java.lang.String r0 = r0.substring(r1)
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            r9 = r0
        L55:
            r0 = r4
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$FlowState r0 = r0.f102171z
            java.lang.String r0 = r0.getValue()
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "emit"
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            java.lang.String r1 = " reason="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            java.lang.String r1 = " source="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            java.lang.String r1 = " flow="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "PausedPageService"
            r1 = r10
            java.lang.String r1 = r1.toString()
            tv.danmaku.android.log.BLog.i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.v(java.lang.String, com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0004 A[PHI: r12
  0x0004: PHI (r12v6 java.lang.Long) = (r12v0 java.lang.Long), (r12v3 java.lang.Long) binds: [B:3:0x0001, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.a w(java.lang.Long r12) {
        /*
            r11 = this;
            r0 = r12
            if (r0 == 0) goto Lc
        L4:
            r0 = r12
            long r0 = r0.longValue()
            r13 = r0
            goto L31
        Lc:
            r0 = r11
            lv0.a r0 = r0.f102156k
            lv0.a$a r0 = r0.c()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L26
            r0 = r12
            lv0.a$a$a r0 = r0.f123395a
            long r0 = r0.f123397a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12 = r0
            goto L28
        L26:
            r0 = 0
            r12 = r0
        L28:
            r0 = r12
            if (r0 == 0) goto L2f
            goto L4
        L2f:
            r0 = 0
            r13 = r0
        L31:
            r0 = r11
            tv.danmaku.biliplayerv2.service.IPlayerCoreService r0 = r0.f102152f
            r12 = r0
            com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$a r0 = new com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$a
            r1 = r0
            r2 = r13
            r3 = r12
            int r3 = r3.getCurrentPosition()
            long r3 = (long) r3
            r4 = 0
            long r3 = kotlin.ranges.RangesKt.coerceAtLeast(r3, r4)
            r4 = r12
            int r4 = r4.getDuration()
            long r4 = (long) r4
            r5 = 0
            long r4 = kotlin.ranges.RangesKt.coerceAtLeast(r4, r5)
            r1.<init>(r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService.w(java.lang.Long):com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService$a");
    }

    public final void x(AdPausedPageTriggerReason adPausedPageTriggerReason) {
        a aVarW = w(null);
        ((IVDPausedPage.ICountdownReporter) this.f102146L.getValue()).reportFlowCancelled(adPausedPageTriggerReason, this.f102138D, aVarW.f102178a, aVarW.f102179b, aVarW.f102180c);
    }

    public final void y(String str) {
        int state = this.f102152f.getState();
        this.f102142H = state;
        Long lValueOf = state == 4 ? Long.valueOf(SystemClock.elapsedRealtime()) : null;
        this.f102143I = lValueOf;
        this.f102144J = 0L;
        v.a(androidx.constraintlayout.widget.e.a(state, "sessionPlayTracker reset reason=", str, " state=", " startElapsedMs="), lValueOf != null ? lValueOf.longValue() : -1L, "PausedPageService");
    }

    public final void z(FlowState flowState) {
        if (this.f102171z == flowState) {
            return;
        }
        this.f102171z = flowState;
        defpackage.a.b("flowState=", flowState.getValue(), "PausedPageService");
    }
}
