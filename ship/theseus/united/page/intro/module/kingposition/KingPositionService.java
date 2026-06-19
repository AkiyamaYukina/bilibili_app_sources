package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.gestures.o0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.v1.ReqUserExtra;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.base.BiliContext;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.bus.Violet;
import com.bilibili.community.like.LikeRepository;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.riskcontrol.ActionValidateHelper;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.moduleservice.main.MainCommonService;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.paycoin.C5579c;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import com.bilibili.playset.widget.favorite.FavFrom;
import com.bilibili.playset.widget.favorite.FavSnackBarUtil;
import com.bilibili.playset.widget.favorite.FavoriteDialog;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.activityresult.ActivityResultRepository;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2;
import com.bilibili.ship.theseus.united.page.intro.module.season.Y;
import com.bilibili.ship.theseus.united.page.popupwindow.PopupWindowRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.google.gson.JsonObject;
import com.tencent.connect.common.Constants;
import iv0.C7620a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qv0.C8487a;
import tv.danmaku.android.log.BLog;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService.class */
@StabilityInferred(parameters = 0)
public final class KingPositionService {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f100351A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public SharedPreferencesHelper f100352B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public FavoriteDialog f100353C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public C5579c f100354D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final Lazy f100355E = LazyKt.lazy(new BG0.b(10));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public String f100356F = "";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public String f100357G = "";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final t f100358H = new t(this, 0);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f100359I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f100360J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f100361K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f100362L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public Cc.h f100363M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Triple<Boolean, Boolean, Boolean>> f100364N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f100365O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f100366P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public final Lazy f100367Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public BiliGuideBubble f100368R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @Nullable
    public BiliGuideBubble f100369S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f100370T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f100372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f100373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BusinessType f100374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f100375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f100376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f100377g;

    @NotNull
    public final RelationRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Y f100378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final KingPositionRepository f100379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.toolbar.j f100380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final C8487a f100381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final PopupWindowRepository f100382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final ActivityResultRepository f100383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f100384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final C7893a f100385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final C8043a f100386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.intro.module.owner.r f100387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f100388s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final PageReportService f100389t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final b f100390u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final HalfScreenDanmakuInputService f100391v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f100392w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f100393x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f100394y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final C7620a f100395z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final KingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$1$1.class */
        public static final class C10051 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
            final Ref.LongRef $lastCid;
            Object L$0;
            int label;
            final KingPositionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10051(Ref.LongRef longRef, KingPositionService kingPositionService, Continuation<? super C10051> continuation) {
                super(2, continuation);
                this.$lastCid = longRef;
                this.this$0 = kingPositionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10051 c10051 = new C10051(this.$lastCid, this.this$0, continuation);
                c10051.L$0 = obj;
                return c10051;
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
                    FavoriteDialog favoriteDialog = this.this$0.f100353C;
                    if (favoriteDialog != null) {
                        if (favoriteDialog.isShowing()) {
                            favoriteDialog.dismiss();
                        }
                        favoriteDialog.f85702t = null;
                    }
                    KingPositionService kingPositionService = this.this$0;
                    kingPositionService.f100353C = null;
                    C5579c c5579c = kingPositionService.f100354D;
                    if (c5579c != null) {
                        c5579c.d();
                    }
                    this.this$0.f100354D = null;
                }
                this.$lastCid.element = c1319a.f123398b;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(KingPositionService kingPositionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = kingPositionService;
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
                Ref.LongRef longRefB = o0.b(obj);
                KingPositionService kingPositionService = this.this$0;
                StateFlow<C7893a.C1318a> stateFlow = kingPositionService.f100385p.f123393f;
                C10051 c10051 = new C10051(longRefB, kingPositionService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c10051, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$10, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$10.class */
    public static final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final KingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$10$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$10$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final KingPositionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(KingPositionService kingPositionService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionService;
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
                this.this$0.h.p();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(KingPositionService kingPositionService, Continuation<? super AnonymousClass10> continuation) {
            super(2, continuation);
            this.this$0 = kingPositionService;
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
                KingPositionService kingPositionService = this.this$0;
                SharedFlow<Unit> sharedFlow = kingPositionService.f100380k.f103418w;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(kingPositionService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final KingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KingPositionService f100396a;

            public a(KingPositionService kingPositionService) {
                this.f100396a = kingPositionService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                if (((Boolean) obj).booleanValue()) {
                    KingPositionService.a(this.f100396a, "united.player-video-detail.user-action.like");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(KingPositionService kingPositionService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = kingPositionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
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
                KingPositionService kingPositionService = this.this$0;
                SharedFlow<Boolean> sharedFlow = kingPositionService.f100379j.f100347y;
                a aVar = new a(kingPositionService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final KingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KingPositionService f100397a;

            public a(KingPositionService kingPositionService) {
                this.f100397a = kingPositionService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                KingPositionService.a(this.f100397a, "united.player-video-detail.user-action.highlyrec");
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(KingPositionService kingPositionService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = kingPositionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
                KingPositionService kingPositionService = this.this$0;
                SharedFlow<Unit> sharedFlow = kingPositionService.f100379j.f100315A;
                a aVar = new a(kingPositionService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final KingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KingPositionService f100398a;

            public a(KingPositionService kingPositionService) {
                this.f100398a = kingPositionService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                KingPositionService.a(this.f100398a, "united.player-video-detail.user-action.coin");
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(KingPositionService kingPositionService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = kingPositionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
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
                KingPositionService kingPositionService = this.this$0;
                SharedFlow<Unit> sharedFlow = kingPositionService.f100379j.f100345w;
                a aVar = new a(kingPositionService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final KingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$5$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$5$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KingPositionService f100399a;

            public a(KingPositionService kingPositionService) {
                this.f100399a = kingPositionService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                KingPositionService.a(this.f100399a, "united.player-video-detail.user-action.share");
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(KingPositionService kingPositionService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = kingPositionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
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
                KingPositionService kingPositionService = this.this$0;
                SharedFlow<Unit> sharedFlow = kingPositionService.f100381l.f126354e;
                a aVar = new a(kingPositionService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final KingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$6$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$6$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KingPositionService f100400a;

            public a(KingPositionService kingPositionService) {
                this.f100400a = kingPositionService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                KingPositionService.a(this.f100400a, "united.player-video-detail.user-action.collect");
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(KingPositionService kingPositionService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = kingPositionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, continuation);
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
                KingPositionService kingPositionService = this.this$0;
                SharedFlow<Unit> sharedFlow = kingPositionService.f100379j.f100337o;
                a aVar = new a(kingPositionService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final KingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$7$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$7$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KingPositionService f100401a;

            public a(KingPositionService kingPositionService) {
                this.f100401a = kingPositionService;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                this.f100401a.k(true);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(KingPositionService kingPositionService, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = kingPositionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.this$0, continuation);
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
                KingPositionService kingPositionService = this.this$0;
                SharedFlow<Unit> sharedFlow = kingPositionService.f100379j.f100317C;
                a aVar = new a(kingPositionService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$8.class */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final KingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$8$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$8$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KingPositionService f100402a;

            public a(KingPositionService kingPositionService) {
                this.f100402a = kingPositionService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                KingPositionService kingPositionService = this.f100402a;
                kingPositionService.i(a.a(kingPositionService.d(), false, false, true, false, null, 27));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(KingPositionService kingPositionService, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.this$0 = kingPositionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass8(this.this$0, continuation);
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
                KingPositionService kingPositionService = this.this$0;
                SharedFlow<Unit> sharedFlow = kingPositionService.f100379j.f100321G;
                a aVar = new a(kingPositionService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$9.class */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final KingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$9$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$9$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KingPositionService f100403a;

            public a(KingPositionService kingPositionService) {
                this.f100403a = kingPositionService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                KingPositionService kingPositionService = this.f100403a;
                kingPositionService.i(a.a(kingPositionService.d(), false, false, false, true, (String) obj, 7));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(KingPositionService kingPositionService, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = kingPositionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass9(this.this$0, continuation);
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
                KingPositionService kingPositionService = this.this$0;
                SharedFlow<String> sharedFlow = kingPositionService.f100381l.f126357i;
                a aVar = new a(kingPositionService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f100404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f100405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f100406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f100407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f100408e;

        public a() {
            this(0);
        }

        public /* synthetic */ a(int i7) {
            this(null, false, false, false, false);
        }

        public a(@Nullable String str, boolean z6, boolean z7, boolean z8, boolean z9) {
            this.f100404a = z6;
            this.f100405b = z7;
            this.f100406c = z8;
            this.f100407d = z9;
            this.f100408e = str;
        }

        public static a a(a aVar, boolean z6, boolean z7, boolean z8, boolean z9, String str, int i7) {
            if ((i7 & 1) != 0) {
                z6 = aVar.f100404a;
            }
            if ((i7 & 2) != 0) {
                z7 = aVar.f100405b;
            }
            if ((i7 & 4) != 0) {
                z8 = aVar.f100406c;
            }
            if ((i7 & 8) != 0) {
                z9 = aVar.f100407d;
            }
            if ((i7 & 16) != 0) {
                str = aVar.f100408e;
            }
            aVar.getClass();
            return new a(str, z6, z7, z8, z9);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f100404a == aVar.f100404a && this.f100405b == aVar.f100405b && this.f100406c == aVar.f100406c && this.f100407d == aVar.f100407d && Intrinsics.areEqual(this.f100408e, aVar.f100408e);
        }

        public final int hashCode() {
            int iA = androidx.compose.animation.z.a(androidx.compose.animation.z.a(androidx.compose.animation.z.a(Boolean.hashCode(this.f100404a) * 31, 31, this.f100405b), 31, this.f100406c), 31, this.f100407d);
            String str = this.f100408e;
            return iA + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ComponentState(deepBlueTripleGuideShow=");
            sb.append(this.f100404a);
            sb.append(", tripleGuideShow=");
            sb.append(this.f100405b);
            sb.append(", favGuideShow=");
            sb.append(this.f100406c);
            sb.append(", shareGuideShow=");
            sb.append(this.f100407d);
            sb.append(", shareGuideTips=");
            return C8770a.a(sb, this.f100408e, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$b.class */
    public interface b {
        @Nullable
        O a();

        @Nullable
        String getLikeAnimation();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$c.class */
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f100409a;

        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BusinessType.OGV.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BusinessType.CHEESE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f100409a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$d.class */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f100413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ref.ObjectRef<InterfaceC6298l> f100414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.ObjectRef<InterfaceC6294h> f100415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ref.ObjectRef<InterfaceC6297k> f100416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Ref.ObjectRef<InterfaceC6299m> f100417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Ref.ObjectRef<InterfaceC6295i> f100418f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Ref.ObjectRef<InterfaceC6296j> f100419g;
        public final KingPositionService h;

        public d(p pVar, Ref.ObjectRef<InterfaceC6298l> objectRef, Ref.ObjectRef<InterfaceC6294h> objectRef2, Ref.ObjectRef<InterfaceC6297k> objectRef3, Ref.ObjectRef<InterfaceC6299m> objectRef4, Ref.ObjectRef<InterfaceC6295i> objectRef5, Ref.ObjectRef<InterfaceC6296j> objectRef6, KingPositionService kingPositionService) {
            this.f100413a = pVar;
            this.f100414b = objectRef;
            this.f100415c = objectRef2;
            this.f100416d = objectRef3;
            this.f100417e = objectRef4;
            this.f100418f = objectRef5;
            this.f100419g = objectRef6;
            this.h = kingPositionService;
        }

        public final boolean a() {
            return this.h.h.g();
        }

        public final boolean b() {
            return this.h.h.i();
        }

        public final boolean c() {
            return this.h.h.j();
        }

        public final long d() {
            return this.h.h.a();
        }

        public final boolean e() {
            C6289c c6289c = this.f100413a.f100470a.get(KingPositionType.COIN);
            return c6289c != null ? c6289c.f100459b : false;
        }

        public final boolean f() {
            C6289c c6289c = this.f100413a.f100470a.get(KingPositionType.DISLIKE);
            return c6289c != null ? c6289c.f100459b : false;
        }

        public final boolean g() {
            C6289c c6289c = this.f100413a.f100470a.get(KingPositionType.LIKE);
            return c6289c != null ? c6289c.f100459b : false;
        }

        public final boolean h() {
            C6289c c6289c = this.f100413a.f100470a.get(KingPositionType.SHARE);
            return c6289c != null ? c6289c.f100459b : false;
        }

        public final long i() {
            return this.h.h.f();
        }

        public final Drawable j() {
            return this.h.f100379j.a();
        }

        public final long k() {
            return this.h.h.l();
        }

        public final long l() {
            return this.h.h.q();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$e.class */
    public static final class e implements IVideoLikeRouteService.ActionLikeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KingPositionService f100420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f100421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f100422c;

        public e(KingPositionService kingPositionService, boolean z6, boolean z7) {
            this.f100420a = kingPositionService;
            this.f100421b = z6;
            this.f100422c = z7;
        }

        @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
        public final boolean isCancel() {
            return !CoroutineScopeKt.isActive(this.f100420a.f100371a);
        }

        @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
        public final void onRequestFailed(Throwable th) {
            if (this.f100420a.f100351A && this.f100422c) {
                com.bilibili.ship.theseus.united.utils.q.c(th != null ? th.getMessage() : null);
            }
        }

        @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
        public final void onRequestSuccess(String str, String str2) {
            KingPositionService kingPositionService = this.f100420a;
            RelationRepository relationRepository = kingPositionService.h;
            boolean z6 = this.f100421b;
            boolean z7 = !z6;
            if (relationRepository.h() != z7) {
                com.bilibili.ship.theseus.united.page.view.a aVar = relationRepository.f103995c;
                if (!z6 && relationRepository.j()) {
                    long jL = relationRepository.l();
                    long jA = aVar.a();
                    LikeRepository.a.getClass();
                    LikeRepository.e(jA, jL - 1);
                    relationRepository.y(false);
                }
                relationRepository.v(z7);
                Violet.INSTANCE.sendMsg(new Mq0.c(aVar.a(), relationRepository.h()));
            }
            if (kingPositionService.f100351A && this.f100422c) {
                if (z6) {
                    com.bilibili.ship.theseus.united.utils.q.b(2131845567);
                } else {
                    com.bilibili.ship.theseus.united.utils.q.b(2131841683);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$f.class */
    public static final class f implements IVideoLikeRouteService.ActionLikeNologinCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KingPositionService f100423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f100424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f100425c;

        public f(KingPositionService kingPositionService, boolean z6, boolean z7) {
            this.f100423a = kingPositionService;
            this.f100424b = z6;
            this.f100425c = z7;
        }

        @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeNologinCallback
        public final boolean isCancel() {
            return !CoroutineScopeKt.isActive(this.f100423a.f100371a);
        }

        @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeNologinCallback
        public final void onRequestFailed(Throwable th) {
            String message = th != null ? th.getMessage() : null;
            if (this.f100423a.f100351A) {
                com.bilibili.ship.theseus.united.utils.q.c(message);
            }
        }

        @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeNologinCallback
        public final void onRequestSuccess(String str, int i7, String str2) {
            boolean z6 = this.f100425c;
            KingPositionService kingPositionService = this.f100423a;
            boolean z7 = this.f100424b;
            if (!z7) {
                RelationRepository relationRepository = kingPositionService.h;
                boolean z8 = !z6;
                relationRepository.o(z8);
                String str3 = str;
                if (StringsKt.isBlank(str)) {
                    str3 = "";
                }
                kingPositionService.m(str3, null, z8);
                kingPositionService.f100379j.f100346x.tryEmit(Boolean.valueOf(z8));
            } else if (!z6) {
                kingPositionService.h.o(true);
                String str4 = str;
                if (StringsKt.isBlank(str)) {
                    str4 = "";
                }
                kingPositionService.m(str4, null, true);
            }
            if (z7 || i7 == 1) {
                kingPositionService.f100379j.f100334l.tryEmit(Unit.INSTANCE);
                t tVar = kingPositionService.f100358H;
                HandlerThreads.remove(0, tVar);
                HandlerThreads.postDelayed(0, tVar, 1500L);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$g.class */
    public static final class g implements FavSnackBarUtil.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f100426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KingPositionService f100428c;

        public g(int i7, String str, KingPositionService kingPositionService) {
            this.f100426a = i7;
            this.f100427b = str;
            this.f100428c = kingPositionService;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // com.bilibili.playset.widget.favorite.FavSnackBarUtil.b
        public final void onClick() throws NoWhenBranchMatchedException {
            int i7 = this.f100426a;
            boolean zA = FavSnackBarUtil.a.a(i7, 2131851777);
            KingPositionService kingPositionService = this.f100428c;
            if (!zA) {
                if (FavSnackBarUtil.a.a(i7, 2131851776)) {
                    kingPositionService.k(true);
                }
            } else {
                String str = this.f100427b;
                if (str.length() == 0) {
                    BLog.i("KingPositionService$showFavSnackBar$1-onClick", "[theseus-united-KingPositionService$showFavSnackBar$1-onClick] targetUri is null");
                } else {
                    BLRouter.routeTo(new RouteRequest.Builder(str).flags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE).build(), kingPositionService.f100372b);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$h.class */
    public static final class h implements com.bilibili.playset.widget.favorite.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KingPositionService f100429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ref.BooleanRef f100430b;

        public h(KingPositionService kingPositionService, Ref.BooleanRef booleanRef) {
            this.f100429a = kingPositionService;
            this.f100430b = booleanRef;
        }

        @Override // com.bilibili.playset.widget.favorite.k
        public final void a() {
            this.f100429a.h(null, null, null, "new", null, false);
        }

        @Override // com.bilibili.playset.widget.favorite.k
        public final void c(Boolean bool) {
            this.f100429a.h(null, null, null, "watch_later", Intrinsics.areEqual(bool, Boolean.TRUE) ? "1" : "0", false);
        }

        @Override // com.bilibili.playset.widget.favorite.k
        public final void e(String str, String str2, String str3, Boolean bool, boolean z6) {
            this.f100429a.h(str, str2, str3, "complete", Intrinsics.areEqual(bool, Boolean.TRUE) ? "1" : "0", z6);
        }

        @Override // com.bilibili.playset.widget.favorite.k
        public final void f(String str, boolean z6) {
            this.f100430b.element = z6;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // com.bilibili.playset.widget.favorite.k
        public final void g(int i7, String str, String str2, boolean z6) throws NoWhenBranchMatchedException {
            this.f100429a.j(str, i7, z6, str2, FavFrom.Dialog);
        }
    }

    @Inject
    public KingPositionService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull ComponentActivity componentActivity, @NotNull com.bilibili.ship.theseus.united.page.view.t tVar, @NotNull BusinessType businessType, @NotNull BiliAccountInfo biliAccountInfo, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull RelationRepository relationRepository, @NotNull Y y6, @NotNull KingPositionRepository kingPositionRepository, @NotNull com.bilibili.ship.theseus.united.page.toolbar.j jVar, @NotNull C8487a c8487a, @NotNull PopupWindowRepository popupWindowRepository, @NotNull ActivityResultRepository activityResultRepository, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull C7893a c7893a, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.united.page.intro.module.owner.r rVar, @NotNull ActivityColorRepository activityColorRepository, @NotNull PageReportService pageReportService, @NotNull b bVar, @NotNull HalfScreenDanmakuInputService halfScreenDanmakuInputService, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull TheseusFloatLayerService theseusFloatLayerService2, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2, @NotNull C7620a c7620a) {
        this.f100371a = coroutineScope;
        this.f100372b = context;
        this.f100373c = componentActivity;
        this.f100374d = businessType;
        this.f100375e = biliAccountInfo;
        this.f100376f = dVar;
        this.f100377g = aVar;
        this.h = relationRepository;
        this.f100378i = y6;
        this.f100379j = kingPositionRepository;
        this.f100380k = jVar;
        this.f100381l = c8487a;
        this.f100382m = popupWindowRepository;
        this.f100383n = activityResultRepository;
        this.f100384o = cVar;
        this.f100385p = c7893a;
        this.f100386q = c8043a;
        this.f100387r = rVar;
        this.f100388s = activityColorRepository;
        this.f100389t = pageReportService;
        this.f100390u = bVar;
        this.f100391v = halfScreenDanmakuInputService;
        this.f100392w = theseusFloatLayerService;
        this.f100393x = theseusFloatLayerService2;
        this.f100394y = aVar2;
        this.f100395z = c7620a;
        this.f100351A = !tVar.f104125a.f104104a.f104092a;
        Boolean bool = Boolean.TRUE;
        this.f100364N = StateFlowKt.MutableStateFlow(new Triple(bool, bool, Boolean.FALSE));
        this.f100365O = StateFlowKt.MutableStateFlow(new a(0));
        this.f100366P = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f100367Q = LazyKt.lazy(LazyThreadSafetyMode.NONE, new com.bilibili.search2.result.holder.author.f(this, 1));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass8(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass9(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass10(this, null), 3, (Object) null);
        this.f100370T = true;
    }

    public static final void a(KingPositionService kingPositionService, String str) {
        MainCommonService mainCommonService;
        TheseusFloatLayerService theseusFloatLayerService = kingPositionService.f100392w;
        boolean zB = theseusFloatLayerService.b();
        boolean zBooleanValue = ((Boolean) theseusFloatLayerService.f99659i.getValue()).booleanValue();
        boolean zC = theseusFloatLayerService.c();
        boolean zIsForeground = BiliContext.isForeground();
        if (zB || zBooleanValue || zC || !zIsForeground || (mainCommonService = (MainCommonService) BLRouter.get$default(BLRouter.INSTANCE, MainCommonService.class, (String) null, 2, (Object) null)) == null) {
            return;
        }
        mainCommonService.showNotificationSettingDialog(kingPositionService.f100373c, "18", str);
    }

    @NotNull
    public final RunningUIComponent b(@NotNull p pVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
        KingPositionComponent2.a.C1003a c1003a = new KingPositionComponent2.a.C1003a(new Se.a(this, 6));
        d dVar = new d(pVar, objectRef, objectRef3, objectRef4, objectRef5, objectRef6, objectRef2, this);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(12);
        KingPositionComponent2 kingPositionComponent2 = new KingPositionComponent2(dVar, c1003a, FlowKt.asStateFlow(this.f100365O), MutableStateFlow);
        return new RunningUIComponent(kingPositionComponent2, 0, new KingPositionService$create$1(objectRef, this, MutableStateFlow, objectRef2, objectRef3, objectRef4, objectRef5, c1003a, kingPositionComponent2, null), 2);
    }

    public final void c(boolean z6) {
        Context context = this.f100372b;
        C8043a c8043a = this.f100386q;
        String str = c8043a.a().f123881c;
        JsonObject jsonObject = new JsonObject();
        com.bilibili.ship.theseus.united.page.view.a aVar = this.f100377g;
        jsonObject.addProperty("oid", aVar.b());
        jsonObject.addProperty("sid", aVar.d());
        Unit unit = Unit.INSTANCE;
        if (sh1.o.b(context, "player.ugc-video-detail.user-action.unlike.click", str, 16, JsonUtilKt.toJson(jsonObject))) {
            boolean zH = this.h.h();
            IVideoLikeRouteService.ActionDislikePolymer.Builder builder = new IVideoLikeRouteService.ActionDislikePolymer.Builder();
            builder.setAid(Long.valueOf(aVar.a()));
            builder.setDislike(zH ? 1 : 0);
            builder.setFrom(c8043a.a().f123879a);
            builder.setFromSpmid(c8043a.a().f123881c);
            builder.setSpmid(c8043a.a().f123880b);
            builder.setActionId(PageViewTracker.getInstance().currentPolarisActionId());
            G g7 = (G) this.f100355E.getValue();
            Context context2 = this.f100372b;
            IVideoLikeRouteService.ActionDislikePolymer actionDislikePolymerBuild = builder.build();
            e eVar = new e(this, zH, z6);
            g7.getClass();
            if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
                com.bilibili.ship.theseus.united.utils.q.b(2131832822);
                return;
            }
            boolean z7 = false;
            if (actionDislikePolymerBuild.getDislike() == 1) {
                z7 = true;
            }
            z zVar = new z(eVar, context2, z7);
            IVideoLikeRouteService iVideoLikeRouteService = g7.f100221a;
            if (iVideoLikeRouteService != null) {
                iVideoLikeRouteService.reportActionDislike(actionDislikePolymerBuild, zVar);
            }
        }
    }

    public final a d() {
        return (a) this.f100365O.getValue();
    }

    public final boolean e(boolean z6) {
        boolean z7;
        Integer intOrNull;
        ReqUserExtra reqUserExtra = this.h.f104015x;
        if (reqUserExtra == null || !reqUserExtra.getUserFlagNew()) {
            BLog.i("KingPositionService-isShowTripleGuide", "[theseus-united-KingPositionService-isShowTripleGuide] not show triple guide bubble -> not new user");
            return false;
        }
        if (z6) {
            BLog.i("KingPositionService-isShowTripleGuide", "[theseus-united-KingPositionService-isShowTripleGuide] not show triple guide bubble -> all completed");
            return false;
        }
        String str = (String) Contract.get$default(ConfigManager.Companion.config(), "videodetail.triple_guide_bubble", (Object) null, 2, (Object) null);
        int iIntValue = (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 21 : intOrNull.intValue();
        if (iIntValue <= 0) {
            BLog.i("KingPositionService-isShowTripleGuide", "[theseus-united-KingPositionService-isShowTripleGuide] not show triple guide bubble -> days error");
            return false;
        }
        SharedPreferences sharedPreferences = sh1.g.a;
        long j7 = ((long) iIntValue) * 86400000;
        long j8 = sh1.g.a.getLong("pref_key_triple_guide_time", -1L);
        if (j8 < 0) {
            z7 = true;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            z7 = false;
            if (jCurrentTimeMillis - j8 > j7) {
                z7 = true;
            }
            StringBuilder sbA = z4.e.a(jCurrentTimeMillis, "isOverInterval -> [res = ", ", currentTime = ", z7);
            J1.z.a(j8, ", lastTime = ", ", interval = ", sbA);
            sbA.append(j7);
            sbA.append("]");
            BLog.i("pref_key_triple_guide_time", sbA.toString());
        }
        return z7;
    }

    public final void f(boolean z6) {
        if (z6) {
            this.f100356F = this.f100372b.getString(2131847119);
            this.f100357G = "main.ugc-video-detail.user-action.highlyrec.click";
        } else {
            this.f100356F = this.f100372b.getString(2131847442);
            this.f100357G = "player.ugc-video-detail.user-action.like.click";
        }
        boolean zJ = this.h.j();
        IVideoLikeRouteService.ActionLikeNologinPolymer.Builder builder = new IVideoLikeRouteService.ActionLikeNologinPolymer.Builder();
        builder.setAction(z6 ? IVideoLikeRouteService.ACTION_TRIPLE_LIKE : IVideoLikeRouteService.ACTION_LIKE);
        builder.setAid(Long.valueOf(this.f100377g.a()));
        builder.setLike(z6 ? 0 : Integer.valueOf(zJ ? 1 : 0));
        C8043a c8043a = this.f100386q;
        builder.setFrom(c8043a.a().f123879a);
        builder.setFromSpmid(c8043a.a().f123881c);
        builder.setSpmid(c8043a.a().f123880b);
        builder.setSource(ActionValidateHelper.ACTION_VALIDATE_SOURCE);
        builder.setTrackId(c8043a.a().f123882d);
        builder.setActionId(PageViewTracker.getInstance().currentPolarisActionId());
        G g7 = (G) this.f100355E.getValue();
        IVideoLikeRouteService.ActionLikeNologinPolymer actionLikeNologinPolymerBuild = builder.build();
        f fVar = new f(this, z6, zJ);
        g7.getClass();
        if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
            com.bilibili.ship.theseus.united.utils.q.b(2131832822);
            return;
        }
        B b7 = new B(fVar, actionLikeNologinPolymerBuild.getLike() == 1, g7, this.f100373c, z6, actionLikeNologinPolymerBuild);
        IVideoLikeRouteService iVideoLikeRouteService = g7.f100221a;
        if (iVideoLikeRouteService != null) {
            iVideoLikeRouteService.reportActionLikeNologin(actionLikeNologinPolymerBuild, b7);
        }
    }

    public final void g(boolean z6) {
        RelationRepository relationRepository = this.h;
        String str = z6 ? "3" : relationRepository.i() ? "2" : "1";
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("button_status", relationRepository.i() ? "1" : "0");
        mapCreateMapBuilder.put("action_type", str);
        Unit unit = Unit.INSTANCE;
        PageReportService.g(this.f100389t, "united.player-video-detail.user-action.collect.click", MapsKt.build(mapCreateMapBuilder), 4);
    }

    public final void h(String str, String str2, String str3, String str4, String str5, boolean z6) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        if (str3 != null) {
            mapCreateMapBuilder.put("plnum", str3);
        }
        if (str2 != null) {
            mapCreateMapBuilder.put("is_default", str2);
        }
        if (str != null) {
            mapCreateMapBuilder.put("is_drag", str);
        }
        mapCreateMapBuilder.put("action_type", str4);
        if (str5 != null) {
            mapCreateMapBuilder.put("show_watch_later", str5);
        }
        if (z6) {
            mapCreateMapBuilder.put("platform", "ott-kid");
        }
        Unit unit = Unit.INSTANCE;
        PageReportService.g(this.f100389t, "united.player-video-detail.user-aciton-collect-panel.all.click", MapsKt.build(mapCreateMapBuilder), 4);
    }

    public final void i(a aVar) {
        this.f100365O.setValue(aVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void j(String str, int i7, boolean z6, String str2, FavFrom favFrom) throws NoWhenBranchMatchedException {
        String str3;
        int i8 = c.f100409a[this.f100374d.ordinal()];
        if (i8 == 1) {
            str3 = "3";
        } else if (i8 == 2) {
            str3 = "4";
        } else {
            if (i8 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        }
        FavSnackBarUtil.Scene scene = FavSnackBarUtil.Scene.DetailPage;
        com.bilibili.ship.theseus.united.page.view.a aVar = this.f100377g;
        FavSnackBarUtil.c(this.f100373c, scene, str, i7, z6, favFrom, str3, aVar.a(), aVar.c(), this.f100386q.a().f123880b, new g(i7, str2, this));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void k(final boolean z6) throws NoWhenBranchMatchedException {
        FavoriteDialog.BizType bizType;
        Y y6 = this.f100378i;
        boolean zBooleanValue = ((Boolean) y6.f101643d.getValue()).booleanValue();
        boolean zA = y6.a();
        C8043a c8043a = this.f100386q;
        Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("from", c8043a.a().f123879a), TuplesKt.to("spmid", c8043a.a().f123880b), TuplesKt.to("from_spmid", c8043a.a().f123881c)});
        int i7 = c.f100409a[this.f100374d.ordinal()];
        if (i7 == 1) {
            bizType = FavoriteDialog.BizType.UGC;
        } else {
            if (i7 != 2 && i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bizType = FavoriteDialog.BizType.OGV_AVID;
        }
        com.bilibili.ship.theseus.united.page.view.a aVar = this.f100377g;
        final FavoriteDialog.b bVar = new FavoriteDialog.b(aVar.a(), aVar.c(), bizType, this.h.i(), 209, false, zBooleanValue, !zA, mapMapOf, c8043a.a().f123879a, c8043a.a().f123880b, c8043a.a().f123881c, FavSnackBarUtil.Scene.DetailPage, Boolean.valueOf(aVar.f104050p), z6, false, null, null, null, 491520);
        final FavoriteDialog favoriteDialog = new FavoriteDialog(this.f100373c, bVar, null);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        favoriteDialog.f85702t = new h(this, booleanRef);
        favoriteDialog.setOnDismissListener(new DialogInterface.OnDismissListener(bVar, favoriteDialog, this, booleanRef, z6) { // from class: com.bilibili.ship.theseus.united.page.intro.module.kingposition.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FavoriteDialog.b f100478a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final FavoriteDialog f100479b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final KingPositionService f100480c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Ref.BooleanRef f100481d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final boolean f100482e;

            {
                this.f100478a = bVar;
                this.f100479b = favoriteDialog;
                this.f100480c = this;
                this.f100481d = booleanRef;
                this.f100482e = z6;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                FavoriteDialog.b bVar2 = this.f100478a;
                FavoriteDialog favoriteDialog2 = this.f100479b;
                KingPositionService kingPositionService = this.f100480c;
                Ref.BooleanRef booleanRef2 = this.f100481d;
                boolean z7 = this.f100482e;
                boolean z8 = bVar2.f85708d;
                if (favoriteDialog2.f85699q) {
                    kingPositionService.f100378i.b(true);
                }
                boolean zI = kingPositionService.h.i();
                KingPositionRepository kingPositionRepository = kingPositionService.f100379j;
                RelationRepository relationRepository = kingPositionService.h;
                if (zI != z8) {
                    relationRepository.n(z8);
                    if (z8) {
                        kingPositionRepository.f100336n.tryEmit(Unit.INSTANCE);
                        if (kingPositionService.e(relationRepository.j() && relationRepository.g())) {
                            BuildersKt.launch$default(kingPositionService.f100371a, (CoroutineContext) null, (CoroutineStart) null, new KingPositionService$showFavoriteDialog$2$1(kingPositionService, null), 3, (Object) null);
                        }
                    } else {
                        com.bilibili.ship.theseus.united.utils.q.b(2131845692);
                    }
                }
                if (kingPositionService.f100374d == BusinessType.UGC) {
                    boolean z9 = bVar2.f85711g;
                    Y y7 = kingPositionService.f100378i;
                    y7.f101643d.setValue(Boolean.valueOf(z9));
                    y7.f101642c.l("sp_user_last_operate_favorite", z9);
                }
                if (booleanRef2.element && z7 && !sh1.d.a.getBoolean("pref_key_fav_guide_exposed_unite", false)) {
                    if (!kingPositionService.e(relationRepository.j() && relationRepository.g())) {
                        kingPositionRepository.f100320F.tryEmit(Unit.INSTANCE);
                    }
                }
                kingPositionRepository.f100318D.setValue(Boolean.FALSE);
            }
        });
        favoriteDialog.show();
        this.f100379j.f100318D.setValue(Boolean.TRUE);
        this.f100353C = favoriteDialog;
    }

    public final void l() {
        BuildersKt.launch$default(this.f100371a, (CoroutineContext) null, (CoroutineStart) null, new KingPositionService$showLikeAnimation$1(this, null), 3, (Object) null);
    }

    public final void m(String str, String str2, boolean z6) {
        String string;
        if (this.f100351A) {
            if (z6) {
                string = str;
                if (str2 != null) {
                    string = StringsKt.isBlank(str2) ? str : str2;
                }
            } else {
                string = this.f100372b.getString(2131845836);
            }
            com.bilibili.ship.theseus.united.utils.q.c(string);
        }
    }
}
