package com.bilibili.ship.theseus.united.page.toolbar;

import android.os.Bundle;
import androidx.compose.foundation.gestures.o0;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntSize;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bapis.bilibili.community.service.dm.v1.VideoSubtitle;
import com.bapis.bilibili.playershared.SettingItemStyle;
import com.bapis.bilibili.playershared.SettingItemType;
import com.bilibili.app.gemini.share.f;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.digital.widget.intent.DigitalWidgetIntentDispatcherActivity;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.moduleservice.main.MainCommonService;
import com.bilibili.playerbizcommon.features.background.BackgroundPlayService;
import com.bilibili.playerbizcommonv2.widget.setting.W;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import com.mall.data.page.feeds.MallInfiniteFeedsCardBean;
import com.mall.ui.page.feeds.MallStoryFeedsFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sj.c;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.fullscreen.state.t0;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import yk.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService.class */
@StabilityInferred(parameters = 0)
public final class MenuService {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f103233A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final C6424h f103234B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f103235C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final W f103236D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final c f103237E = new c(this);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public Job f103238F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final List<String> f103239G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f103240H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f103241I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f103242J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f103244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final FragmentManager f103245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C8043a f103246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7893a f103247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f103248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final j f103249g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.interactvideo.e h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IRenderContainerService f103250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f103251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f103252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final IReporterService f103253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f103254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f103255n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ToolbarRepository f103256o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.gemini.share.d f103257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final BackgroundPlayService f103258q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final WebFloatLayerService f103259r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f103260s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final wv0.a f103261t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f103262u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f103263v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final IToastService f103264w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommonv2.service.ai.a f103265x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f103266y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Er0.a f103267z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MenuService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MenuService menuService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = menuService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(MenuService menuService) {
            BLog.i("MenuService", "onClick overflow");
            Job job = menuService.f103238F;
            if (job != null && job.isActive()) {
                BLog.i("MenuService$1-invokeSuspend$lambda$0", "[theseus-united-MenuService$1-invokeSuspend$lambda$0] menu job is running");
                return Unit.INSTANCE;
            }
            menuService.f103253l.report(new NeuronsEvents.NormalEvent("player.player.bilimore.half.player", new String[0]));
            menuService.f103238F = BuildersKt.launch$default(menuService.f103243a, (CoroutineContext) null, (CoroutineStart) null, new MenuService$1$1$1(menuService, null), 3, (Object) null);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MenuService menuService = this.this$0;
                ToolbarRepository toolbarRepository = menuService.f103256o;
                A a7 = new A(menuService);
                this.label = 1;
                if (toolbarRepository.g(a7, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MenuService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
            final Ref.LongRef $lastCid;
            Object L$0;
            int label;
            final MenuService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.LongRef longRef, MenuService menuService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$lastCid = longRef;
                this.this$0 = menuService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lastCid, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
                return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C7893a.C1318a c1318a = (C7893a.C1318a) this.L$0;
                if (c1318a == null) {
                    return Unit.INSTANCE;
                }
                long j7 = this.$lastCid.element;
                C7893a.C1318a.C1319a c1319a = c1318a.f123395a;
                if (j7 != c1319a.f123398b) {
                    this.this$0.getClass();
                    this.this$0.e();
                }
                this.$lastCid.element = c1319a.f123398b;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MenuService menuService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = menuService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                Ref.LongRef longRefB = o0.b(obj);
                MenuService menuService = this.this$0;
                StateFlow<C7893a.C1318a> stateFlow = menuService.f103247e.f123393f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(longRefB, menuService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MenuService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final MenuService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MenuService menuService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = menuService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.j();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MenuService menuService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = menuService;
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
                MenuService menuService = this.this$0;
                SharedFlow<Unit> sharedFlow = menuService.f103249g.f103410o;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(menuService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MenuService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final MenuService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MenuService menuService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = menuService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<Unit> mutableSharedFlow = this.this$0.f103249g.f103402f;
                Unit unit = Unit.INSTANCE;
                mutableSharedFlow.tryEmit(unit);
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(MenuService menuService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = menuService;
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
                MenuService menuService = this.this$0;
                SharedFlow<Unit> sharedFlow = menuService.f103249g.f103412q;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(menuService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MenuService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final MenuService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MenuService menuService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = menuService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f(false);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(MenuService menuService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = menuService;
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
                MenuService menuService = this.this$0;
                SharedFlow<Unit> sharedFlow = menuService.f103249g.f103414s;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(menuService, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$a.class */
    public interface a {
        default void a() {
        }

        default int b() {
            return 0;
        }

        default void c() {
        }

        @NotNull
        default String d() {
            return "";
        }

        default void e() {
        }

        default void f() {
        }

        @NotNull
        default String g() {
            return "";
        }

        long getAvid();

        @NotNull
        BusinessType getBusinessType();

        long getCid();

        default boolean h() {
            return true;
        }

        @NotNull
        default String i() {
            return "";
        }

        @NotNull
        default Map<String, String> j() {
            return MapsKt.emptyMap();
        }

        default void k() {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f103268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f103269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int[] f103270c;

        static {
            int[] iArr = new int[SettingItemType.values().length];
            try {
                iArr[SettingItemType.SETTING_FREYAENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SettingItemType.SETTING_DUB.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[SettingItemType.SETTING_SUBTITLE_EXCHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[SettingItemType.SETTING_AI_AUDIO_EXCHANGE.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[SettingItemType.SETTING_MORE_PLAY.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[SettingItemType.SETTING_NOTE.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[SettingItemType.SETTING_REPORT.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[SettingItemType.SETTING_FEEDBACK.ordinal()] = 8;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[SettingItemType.SETTING_TIMING_SWITCH.ordinal()] = 9;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[SettingItemType.SETTING_DM.ordinal()] = 10;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[SettingItemType.SETTING_BIHUO.ordinal()] = 11;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[SettingItemType.SETTING_PLAYBACK_MODE.ordinal()] = 12;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[SettingItemType.SETTING_BACKGROUND_PLAY.ordinal()] = 13;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr[SettingItemType.SETTING_SUBTITLE.ordinal()] = 14;
            } catch (NoSuchFieldError e20) {
            }
            try {
                iArr[SettingItemType.SETTING_AI_AUDIO.ordinal()] = 15;
            } catch (NoSuchFieldError e21) {
            }
            try {
                iArr[SettingItemType.SETTING_FLIP_CONF.ordinal()] = 16;
            } catch (NoSuchFieldError e22) {
            }
            try {
                iArr[SettingItemType.SETTING_SKIP_OPED.ordinal()] = 17;
            } catch (NoSuchFieldError e23) {
            }
            try {
                iArr[SettingItemType.SETTING_PLAYBACK_RATE.ordinal()] = 18;
            } catch (NoSuchFieldError e24) {
            }
            try {
                iArr[SettingItemType.SETTING_LOOP_PLAYBACK.ordinal()] = 19;
            } catch (NoSuchFieldError e25) {
            }
            try {
                iArr[SettingItemType.SETTING_DISLIKE.ordinal()] = 20;
            } catch (NoSuchFieldError e26) {
            }
            try {
                iArr[SettingItemType.SETTING_WATCH_LATER.ordinal()] = 21;
            } catch (NoSuchFieldError e27) {
            }
            try {
                iArr[SettingItemType.SETTING_SMALL_WINDOW.ordinal()] = 22;
            } catch (NoSuchFieldError e28) {
            }
            try {
                iArr[SettingItemType.SETTING_DOWNlOAD.ordinal()] = 23;
            } catch (NoSuchFieldError e29) {
            }
            try {
                iArr[SettingItemType.SETTING_PROJECT.ordinal()] = 24;
            } catch (NoSuchFieldError e30) {
            }
            try {
                iArr[SettingItemType.SETTING_BACKTRACKING.ordinal()] = 25;
            } catch (NoSuchFieldError e31) {
            }
            try {
                iArr[SettingItemType.SETTING_FREE_GIFT.ordinal()] = 26;
            } catch (NoSuchFieldError e32) {
            }
            try {
                iArr[SettingItemType.SETTING_TRANSLATE.ordinal()] = 27;
            } catch (NoSuchFieldError e33) {
            }
            f103268a = iArr;
            int[] iArr2 = new int[SettingItemStyle.values().length];
            try {
                iArr2[SettingItemStyle.SETTING_STYLE_MORE.ordinal()] = 1;
            } catch (NoSuchFieldError e34) {
            }
            try {
                iArr2[SettingItemStyle.SETTING_STYLE_SWITCH.ordinal()] = 2;
            } catch (NoSuchFieldError e35) {
            }
            try {
                iArr2[SettingItemStyle.SETTING_STYLE_SELECT.ordinal()] = 3;
            } catch (NoSuchFieldError e36) {
            }
            f103269b = iArr2;
            int[] iArr3 = new int[BusinessType.values().length];
            try {
                iArr3[BusinessType.OGV.ordinal()] = 1;
            } catch (NoSuchFieldError e37) {
            }
            try {
                iArr3[BusinessType.CHEESE.ordinal()] = 2;
            } catch (NoSuchFieldError e38) {
            }
            f103270c = iArr3;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$c.class */
    public static final class c implements f.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuService f103271a;

        public c(MenuService menuService) {
            this.f103271a = menuService;
        }

        public final void c(boolean z6) {
            this.f103271a.e();
        }

        public final void onShareSuccess() {
            this.f103271a.f103249g.f103417v.tryEmit(Unit.INSTANCE);
        }
    }

    @Inject
    public MenuService(@NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull FragmentManager fragmentManager, @NotNull C8043a c8043a, @NotNull C7893a c7893a, @NotNull BackActionRepository backActionRepository, @NotNull j jVar, @NotNull com.bilibili.ship.theseus.united.page.interactvideo.e eVar, @NotNull IRenderContainerService iRenderContainerService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull IInteractLayerService iInteractLayerService, @NotNull IReporterService iReporterService, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull PlayerContainer playerContainer, @NotNull ToolbarRepository toolbarRepository, @NotNull com.bilibili.app.gemini.share.d dVar, @NotNull BackgroundPlayService backgroundPlayService, @NotNull WebFloatLayerService webFloatLayerService, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull wv0.a aVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2, @NotNull IInteractLayerService iInteractLayerService2, @NotNull IToastService iToastService, @NotNull com.bilibili.playerbizcommonv2.service.ai.a aVar3, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull Er0.a aVar4, @NotNull IControlContainerService iControlContainerService) {
        this.f103243a = coroutineScope;
        this.f103244b = fragmentActivity;
        this.f103245c = fragmentManager;
        this.f103246d = c8043a;
        this.f103247e = c7893a;
        this.f103248f = backActionRepository;
        this.f103249g = jVar;
        this.h = eVar;
        this.f103250i = iRenderContainerService;
        this.f103251j = iPlayerSettingService;
        this.f103252k = iInteractLayerService;
        this.f103253l = iReporterService;
        this.f103254m = hVar;
        this.f103255n = playerContainer;
        this.f103256o = toolbarRepository;
        this.f103257p = dVar;
        this.f103258q = backgroundPlayService;
        this.f103259r = webFloatLayerService;
        this.f103260s = theseusFloatLayerService;
        this.f103261t = aVar;
        this.f103262u = aVar2;
        this.f103263v = iInteractLayerService2;
        this.f103264w = iToastService;
        this.f103265x = aVar3;
        this.f103266y = iPlayerCoreService;
        this.f103267z = aVar4;
        this.f103233A = iControlContainerService;
        this.f103234B = new C6424h(coroutineScope, fragmentActivity, aVar3);
        final int i7 = 0;
        final int i8 = 0;
        this.f103236D = new W(new WQ.G(this, 5), new Function1(this) { // from class: com.bilibili.ship.theseus.united.page.toolbar.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MenuService f103437a;

            {
                this.f103437a = this;
            }

            public final Object invoke(Object obj) {
                MenuService menuService = this.f103437a;
                BuildersKt.launch$default(menuService.f103243a, (CoroutineContext) null, (CoroutineStart) null, new MenuService$adapter$2$1(menuService, (String) obj, null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        }, new Function1(this, i7) { // from class: com.bilibili.ship.theseus.united.page.toolbar.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f103449a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f103450b;

            {
                this.f103449a = i7;
                this.f103450b = this;
            }

            public final Object invoke(Object obj) {
                Unit unit;
                switch (this.f103449a) {
                    case 0:
                        ((MenuService) this.f103450b).k("", (Map) obj);
                        return Unit.INSTANCE;
                    case 1:
                        ((MallStoryFeedsFragment) this.f103450b).xf(((MallInfiniteFeedsCardBean) obj).getChangeBoxUrl());
                        return Unit.INSTANCE;
                    default:
                        List list = (List) obj;
                        iz0.i iVar = (iz0.i) this.f103450b;
                        gz0.a.a("【编辑器-音乐推荐】", "[取帧成功]～准备画面识别,isTaskRunning=" + iVar.a());
                        if (iVar.a()) {
                            hz0.c cVar = iVar.d;
                            if (cVar.a.f107912c == 0) {
                                cVar.c = list;
                            } else {
                                cVar.c(list);
                            }
                            unit = Unit.INSTANCE;
                        } else {
                            unit = Unit.INSTANCE;
                        }
                        return unit;
                }
            }
        }, new Function1(this, i8) { // from class: com.bilibili.ship.theseus.united.page.toolbar.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f103454a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f103455b;

            {
                this.f103454a = i8;
                this.f103455b = this;
            }

            public final Object invoke(Object obj) {
                Object obj2 = this.f103455b;
                switch (this.f103454a) {
                    case 0:
                        MenuService menuService = (MenuService) obj2;
                        menuService.getClass();
                        HashMap map = new HashMap();
                        map.putAll((Map) obj);
                        menuService.f103253l.report(new NeuronsEvents.b("player.player.half-option-more.show.player", map));
                        break;
                    case 1:
                        ((MutableFloatState) obj2).setFloatValue((int) (((IntSize) obj).m3976unboximpl() >> 32));
                        break;
                    case 2:
                        ((Function1) obj2).invoke(new t0((String) obj));
                        break;
                    default:
                        MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                        int i9 = DigitalWidgetIntentDispatcherActivity.x;
                        Bundle extras = ((DigitalWidgetIntentDispatcherActivity) obj2).getIntent().getExtras();
                        if (extras != null) {
                            for (String str : extras.keySet()) {
                                mutableBundleLike.put(str, String.valueOf(extras.get(str)));
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
        this.f103239G = CollectionsKt.listOf(new String[]{fragmentActivity.getString(2131845589), fragmentActivity.getString(2131847390), fragmentActivity.getString(2131847169)});
        this.f103240H = StateFlowKt.MutableStateFlow(0);
        this.f103241I = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f103242J = StateFlowKt.MutableStateFlow(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.united.page.toolbar.MenuService r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.toolbar.MenuService$createSettingGroup$1
            if (r0 == 0) goto L2c
            r0 = r7
            com.bilibili.ship.theseus.united.page.toolbar.MenuService$createSettingGroup$1 r0 = (com.bilibili.ship.theseus.united.page.toolbar.MenuService$createSettingGroup$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L36
        L2c:
            com.bilibili.ship.theseus.united.page.toolbar.MenuService$createSettingGroup$1 r0 = new com.bilibili.ship.theseus.united.page.toolbar.MenuService$createSettingGroup$1
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L36:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L69
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L5e
            r0 = r7
            java.lang.Object r0 = r0.L$0
            java.util.List r0 = (java.util.List) r0
            r6 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L9f
        L5e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L69:
            r0 = r10
            java.util.ArrayList r0 = B0.b.a(r0)
            r10 = r0
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getIO()
            r11 = r0
            com.bilibili.ship.theseus.united.page.toolbar.MenuService$createSettingGroup$2 r0 = new com.bilibili.ship.theseus.united.page.toolbar.MenuService$createSettingGroup$2
            r1 = r0
            r2 = r6
            r3 = r10
            r4 = 0
            r1.<init>(r2, r3, r4)
            r6 = r0
            r0 = r7
            r1 = r10
            r0.L$0 = r1
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r11
            r1 = r6
            r2 = r7
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r2)
            r1 = r9
            if (r0 != r1) goto L9c
            r0 = r9
            r6 = r0
            goto L9f
        L9c:
            r0 = r10
            r6 = r0
        L9f:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.toolbar.MenuService.a(com.bilibili.ship.theseus.united.page.toolbar.MenuService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.united.page.toolbar.MenuService r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 1187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.toolbar.MenuService.b(com.bilibili.ship.theseus.united.page.toolbar.MenuService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit d(com.bilibili.ship.theseus.united.page.toolbar.MenuService r6, kotlin.jvm.internal.Ref.BooleanRef r7, int r8, int r9, int r10, com.bilibili.playerbizcommonv2.widget.setting.channel.x r11) {
        /*
            r0 = r6
            com.bilibili.playerbizcommonv2.service.ai.a r0 = r0.f103265x
            com.bilibili.lib.media.resource.LanguageItem r0 = r0.n0()
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L35
            r0 = r14
            boolean r0 = r0.b()
            r13 = r0
            r0 = 1
            r12 = r0
            r0 = r13
            r1 = 1
            if (r0 != r1) goto L35
            r0 = r6
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r0.f103242J
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L35
            goto L38
        L35:
            r0 = 0
            r12 = r0
        L38:
            r0 = r7
            r1 = r12
            r0.element = r1
            r0 = r11
            if (r0 == 0) goto L8c
            r0 = r6
            androidx.fragment.app.FragmentActivity r0 = r0.f103244b
            r6 = r0
            r0 = r12
            if (r0 == 0) goto L59
            r0 = r6
            r1 = r8
            r2 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = com.bilibili.playerbizcommonv2.utils.p.c(r0, r1, r2)
            r8 = r0
            goto L5f
        L59:
            r0 = r6
            r1 = r8
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            r8 = r0
        L5f:
            r0 = r7
            boolean r0 = r0.element
            if (r0 == 0) goto L72
            r0 = r6
            r1 = r9
            r2 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = com.bilibili.playerbizcommonv2.utils.p.c(r0, r1, r2)
            r9 = r0
            goto L78
        L72:
            r0 = r6
            r1 = r9
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            r9 = r0
        L78:
            r0 = r11
            r1 = r8
            r2 = r9
            r3 = r6
            r4 = r10
            int r3 = androidx.core.content.ContextCompat.getColor(r3, r4)
            r0.c(r1, r2, r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r6 = r0
            goto L8e
        L8c:
            r0 = 0
            r6 = r0
        L8e:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.toolbar.MenuService.d(com.bilibili.ship.theseus.united.page.toolbar.MenuService, kotlin.jvm.internal.Ref$BooleanRef, int, int, int, com.bilibili.playerbizcommonv2.widget.setting.channel.x):kotlin.Unit");
    }

    public static boolean l() {
        if (ConnectivityMonitor.getInstance().isNetworkActive()) {
            return false;
        }
        com.bilibili.ship.theseus.united.utils.q.b(2131841454);
        BLog.i("MenuService-showNetworkError", "[theseus-united-MenuService-showNetworkError] network error");
        return true;
    }

    public final boolean c() {
        List subtitlesList;
        Oi1.d cloudConfig = this.f103251j.getCloudConfig();
        boolean z6 = true;
        boolean z7 = cloudConfig.r() && ConnectivityMonitor.getInstance().isNetworkActive();
        IInteractLayerService iInteractLayerService = this.f103252k;
        boolean z8 = iInteractLayerService.isSubtitleAvailable() && cloudConfig.S();
        VideoSubtitle subtitleData = iInteractLayerService.getSubtitleData();
        int size = (subtitleData == null || (subtitlesList = subtitleData.getSubtitlesList()) == null) ? 0 : subtitlesList.size();
        if (!z7 || !z8 || size <= 0) {
            z6 = false;
        }
        return z6;
    }

    public final void e() {
        Job job = this.f103238F;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    public final void f(boolean z6) {
        MainCommonService mainCommonService;
        a aVar = this.f103249g.f103399c;
        if (aVar == null || !aVar.h()) {
            com.bilibili.ship.theseus.united.utils.q.b(2131851661);
            return;
        }
        C7893a.C1318a c1318aC = this.f103247e.c();
        if (c1318aC == null || (mainCommonService = (MainCommonService) BLRouter.get$default(BLRouter.INSTANCE, MainCommonService.class, (String) null, 2, (Object) null)) == null) {
            return;
        }
        long j7 = c1318aC.f123395a.f123397a;
        C8043a c8043a = this.f103246d;
        MainCommonService.addToWatchLater$default(mainCommonService, this.f103244b, String.valueOf(j7), c8043a.a().f123879a, c8043a.a().f123880b, 12, z6, 0, 64, null);
    }

    public final yk.c g() {
        return (yk.c) this.f103267z.get(c.a.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0 r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.toolbar.MenuService$keepDetailTranslationAction$1
            if (r0 == 0) goto L2b
            r0 = r7
            com.bilibili.ship.theseus.united.page.toolbar.MenuService$keepDetailTranslationAction$1 r0 = (com.bilibili.ship.theseus.united.page.toolbar.MenuService$keepDetailTranslationAction$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2b
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L35
        L2b:
            com.bilibili.ship.theseus.united.page.toolbar.MenuService$keepDetailTranslationAction$1 r0 = new com.bilibili.ship.theseus.united.page.toolbar.MenuService$keepDetailTranslationAction$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L35:
            r0 = r7
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L65
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L59
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L59:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L61
            goto L80
        L61:
            r6 = move-exception
            goto L8a
        L65:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            r1 = r6
            r0.f103235C = r1     // Catch: java.lang.Throwable -> L61
            r0 = r7
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L61
            r0 = r7
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L61
            r1 = r10
            if (r0 != r1) goto L80
            r0 = r10
            return r0
        L80:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L61
            r6 = r0
            r0 = r6
            r0.<init>()     // Catch: java.lang.Throwable -> L61
            r0 = r6
            throw r0     // Catch: java.lang.Throwable -> L61
        L8a:
            r0 = r5
            r1 = 0
            r0.f103235C = r1
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.toolbar.MenuService.h(kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r4 = this;
            r0 = r4
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r0.f103241I
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7 = r0
            r0 = r4
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> r0 = r0.f103240H
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r6 = r0
            r0 = 1
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L30
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L30
            r0 = 4
            r5 = r0
            goto L54
        L30:
            r0 = r7
            if (r0 == 0) goto L3e
            r0 = r6
            r1 = 2
            if (r0 != r1) goto L3e
        L39:
            r0 = 0
            r5 = r0
            goto L54
        L3e:
            r0 = r7
            if (r0 != 0) goto L4b
            r0 = r6
            if (r0 != 0) goto L4b
            r0 = 2
            r5 = r0
            goto L54
        L4b:
            r0 = r7
            if (r0 != 0) goto L39
            r0 = r6
            r1 = 2
            if (r0 != r1) goto L39
        L54:
            r0 = r4
            tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService r0 = r0.f103251j
            java.lang.String r1 = "pref_player_completion_action_key3"
            r2 = r5
            r0.putInt(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.toolbar.MenuService.i():void");
    }

    public final void j() {
        j jVar = this.f103249g;
        a aVar = jVar.f103399c;
        BusinessType businessType = aVar != null ? aVar.getBusinessType() : null;
        if ((businessType == null ? -1 : b.f103270c[businessType.ordinal()]) == 1) {
            a aVar2 = jVar.f103399c;
            if (aVar2 != null) {
                aVar2.f();
                return;
            }
            return;
        }
        C7893a.C1318a c1318aC = this.f103247e.c();
        if (c1318aC == null) {
            BLog.e("MenuService-doPlayerReport", "[theseus-united-MenuService-doPlayerReport] currentEpisode is null", (Throwable) null);
            return;
        }
        c.a aVarA = c.a.a("30", "vinfo");
        Map map = sj.c.a;
        aVarA.b();
        Bundle bundle = new Bundle();
        C7893a.C1318a.C1319a c1319a = c1318aC.f123395a;
        bundle.putLong("key_avid", c1319a.f123397a);
        bundle.putLong("key_cid", c1319a.f123398b);
        bundle.putLong("key_season_id", 0L);
        bundle.putBoolean("key_is_bangumi", false);
        bundle.putBoolean("key_is_show_bangumi_skip_head_option", false);
        bundle.putBoolean("key_from_player", false);
        bundle.putString("key_player_tag", null);
        C8043a c8043a = this.f103246d;
        bundle.putString("key_spmid", c8043a.a().f123880b);
        bundle.putString("key_from_spmid", c8043a.a().f123881c);
        BLRouter.routeTo(new RouteRequest.Builder("bilibili://feedback/player").extras(new com.bilibili.biligame.ui.update.g(bundle, 1)).build(), this.f103244b);
    }

    public final void k(String str, Map map) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        if (str.length() > 0) {
            map2.put("value", str);
        }
        this.f103253l.report(new NeuronsEvents.b("player.player.half-option-more.click.player", map2));
    }
}
