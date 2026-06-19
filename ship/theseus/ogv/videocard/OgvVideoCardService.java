package com.bilibili.ship.theseus.ogv.videocard;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.home.v1.l;
import com.bilibili.community.follow.FollowSeasonRepository$flowOfFollowSeason$;
import com.bilibili.community.like.LikeRepository;
import com.bilibili.community.like.LikeRepository$flowOfLike$;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.ship.theseus.ogv.router.OpenPageProtocol;
import com.bilibili.ship.theseus.ogv.videocard.b;
import com.bilibili.ship.theseus.ogv.vip.d;
import com.bilibili.ship.theseus.united.page.error.OnRenderLayerFloatLayerManager;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kntr.base.router.Router;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.core.DanmakuVisibleObserver;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import xl0.C8986a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService.class */
@StabilityInferred(parameters = 0)
public final class OgvVideoCardService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f94631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OnRenderLayerFloatLayerManager f94633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f94634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f94635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Context f94636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f94637g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IReporterService f94638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f94639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f94640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MediaScopedState f94641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.player.mediaplay.c f94642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final OgvVideoCardApiService f94643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final IToastService f94644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Router f94645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final PageReportService f94646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f94647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f94648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<i> f94649t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public ArrayList<i> f94650u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Map<String, Integer> f94651v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public List<com.bilibili.ship.theseus.ogv.bugle.a> f94652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<com.bilibili.ship.theseus.ogv.bugle.a> f94653x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f94654y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final a f94655z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videocard.OgvVideoCardService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
        int label;
        final OgvVideoCardService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvVideoCardService ogvVideoCardService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvVideoCardService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
            return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OgvVideoCardService.k(this.this$0);
            OgvVideoCardService.g(this.this$0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videocard.OgvVideoCardService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
        int label;
        final OgvVideoCardService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvVideoCardService ogvVideoCardService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvVideoCardService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
            return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OgvVideoCardService.k(this.this$0);
            OgvVideoCardService.g(this.this$0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videocard.OgvVideoCardService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Duration, Continuation<? super Unit>, Object> {
        long J$0;
        int label;
        final OgvVideoCardService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OgvVideoCardService ogvVideoCardService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ogvVideoCardService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.J$0 = ((Duration) obj).unbox-impl();
            return anonymousClass3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m9159invokeVtjQ1oo(((Duration) obj).unbox-impl(), (Continuation) obj2);
        }

        /* JADX INFO: renamed from: invoke-VtjQ1oo, reason: not valid java name */
        public final Object m9159invokeVtjQ1oo(long j7, Continuation<? super Unit> continuation) {
            return create(Duration.box-impl(j7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            long j7 = this.J$0;
            this.this$0.j(j7);
            this.this$0.f(j7);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videocard.OgvVideoCardService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvVideoCardService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(OgvVideoCardService ogvVideoCardService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = ogvVideoCardService;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OgvVideoCardService ogvVideoCardService = this.this$0;
                    ogvVideoCardService.f94634d.registerDanmakuVisibleObserver(ogvVideoCardService.f94655z);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                OgvVideoCardService ogvVideoCardService2 = this.this$0;
                ogvVideoCardService2.f94634d.unregisterDanmakuVisibleObserver(ogvVideoCardService2.f94655z);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videocard.OgvVideoCardService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvVideoCardService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videocard.OgvVideoCardService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<i, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvVideoCardService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OgvVideoCardService ogvVideoCardService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ogvVideoCardService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(i iVar, Continuation<? super Unit> continuation) {
                return create(iVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    i iVar = (i) this.L$0;
                    if (iVar != null) {
                        OgvVideoCardService ogvVideoCardService = this.this$0;
                        ogvVideoCardService.getClass();
                        int i8 = iVar.f94737P;
                        if (i8 != 2 && i8 != 6 && i8 != 7) {
                            ogvVideoCardService.f94638i.report(new NeuronsEvents.b("player.player.order-cards.show.player", iVar.f94736O));
                        } else if (!iVar.f94738Q) {
                            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                            mapCreateMapBuilder.putAll(iVar.f94736O);
                            mapCreateMapBuilder.put("version", "2");
                            PageReportService.i(ogvVideoCardService.f94646q, "pgc.pgc-video-detail.interact-toast.0.show", MapsKt.build(mapCreateMapBuilder), 4);
                            if (iVar.f94729H) {
                                Neurons.reportExposure$default(false, "pgc.pgc-video-detail.interact-toast.close.show", iVar.f94736O, (List) null, 8, (Object) null);
                            }
                            iVar.f94738Q = true;
                        }
                        OgvVideoCardService ogvVideoCardService2 = this.this$0;
                        this.label = 1;
                        ogvVideoCardService2.getClass();
                        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvVideoCardService$showWidgetByVm$2(iVar, ogvVideoCardService2, null), this);
                        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCoroutineScope = Unit.INSTANCE;
                        }
                        if (objCoroutineScope == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        public AnonymousClass5(OgvVideoCardService ogvVideoCardService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = ogvVideoCardService;
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
                OgvVideoCardService ogvVideoCardService = this.this$0;
                MutableStateFlow<i> mutableStateFlow = ogvVideoCardService.f94649t;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ogvVideoCardService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videocard.OgvVideoCardService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvVideoCardService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videocard.OgvVideoCardService$6$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$6$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.ship.theseus.ogv.bugle.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvVideoCardService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OgvVideoCardService ogvVideoCardService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ogvVideoCardService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(com.bilibili.ship.theseus.ogv.bugle.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.bilibili.ship.theseus.ogv.bugle.a aVar = (com.bilibili.ship.theseus.ogv.bugle.a) this.L$0;
                    if (aVar != null) {
                        OgvVideoCardService ogvVideoCardService = this.this$0;
                        ogvVideoCardService.getClass();
                        if (!aVar.f91641o) {
                            PageReportService.i(ogvVideoCardService.f94646q, "united.player-video-detail.player.operation-dm.show", aVar.f91637k, 4);
                            aVar.f91641o = true;
                        }
                        aVar.f91640n = true;
                        long jLongValue = 0;
                        Long l7 = aVar.f91635i;
                        long jLongValue2 = l7 != null ? l7.longValue() : 0L;
                        Long l8 = aVar.f91636j;
                        if (l8 != null) {
                            jLongValue = l8.longValue();
                        }
                        if (OgvVideoCardService.n(jLongValue2, jLongValue)) {
                            BuildersKt.launch$default(ogvVideoCardService.f94632b, (CoroutineContext) null, (CoroutineStart) null, new OgvVideoCardService$reportOperationCardShown$1(ogvVideoCardService, jLongValue2, jLongValue, 8, aVar.f91638l, aVar.f91628a, null), 3, (Object) null);
                        }
                        OgvVideoCardService ogvVideoCardService2 = this.this$0;
                        this.label = 1;
                        if (OgvVideoCardService.b(ogvVideoCardService2, aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        public AnonymousClass6(OgvVideoCardService ogvVideoCardService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = ogvVideoCardService;
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
                OgvVideoCardService ogvVideoCardService = this.this$0;
                MutableStateFlow<com.bilibili.ship.theseus.ogv.bugle.a> mutableStateFlow = ogvVideoCardService.f94653x;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ogvVideoCardService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$MediaScopedState.class */
    @StabilityInferred(parameters = 0)
    public static final class MediaScopedState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Deferred<BiliApiResponse<List<PlayerCardVO>>> f94656a;

        @Inject
        public MediaScopedState(@NotNull CoroutineScope coroutineScope, long j7, @NotNull OgvVideoCardApiService ogvVideoCardApiService) {
            this.f94656a = BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new OgvVideoCardService$MediaScopedState$dataDeferred$1(ogvVideoCardApiService, j7, null), 3, (Object) null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$a.class */
    public static final class a implements DanmakuVisibleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvVideoCardService f94657a;

        public a(OgvVideoCardService ogvVideoCardService) {
            this.f94657a = ogvVideoCardService;
        }

        public final void onDanmakuVisibleChanged(boolean z6, boolean z7) {
            OgvVideoCardService ogvVideoCardService = this.f94657a;
            ogvVideoCardService.f94654y.setValue(Boolean.valueOf(z6));
            com.bilibili.ship.theseus.keel.player.j jVar = ogvVideoCardService.f94635e;
            ogvVideoCardService.j(jVar.F());
            ogvVideoCardService.f(jVar.F());
        }
    }

    @Inject
    public OgvVideoCardService(@NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull CoroutineScope coroutineScope, @NotNull OnRenderLayerFloatLayerManager onRenderLayerFloatLayerManager, @NotNull IInteractLayerService iInteractLayerService, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull Context context, long j7, long j8, @NotNull IReporterService iReporterService, @NotNull BiliAccounts biliAccounts, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull MediaScopedState mediaScopedState, @NotNull com.bilibili.ship.theseus.united.player.mediaplay.c cVar2, @NotNull OgvVideoCardApiService ogvVideoCardApiService, @NotNull IToastService iToastService, @NotNull Router router, @NotNull PageReportService pageReportService, @NotNull AbsFunctionWidgetService absFunctionWidgetService) {
        this.f94631a = cVar;
        this.f94632b = coroutineScope;
        this.f94633c = onRenderLayerFloatLayerManager;
        this.f94634d = iInteractLayerService;
        this.f94635e = jVar;
        this.f94636f = context;
        this.f94637g = j7;
        this.h = j8;
        this.f94638i = iReporterService;
        this.f94639j = biliAccounts;
        this.f94640k = hVar;
        this.f94641l = mediaScopedState;
        this.f94642m = cVar2;
        this.f94643n = ogvVideoCardApiService;
        this.f94644o = iToastService;
        this.f94645p = router;
        this.f94646q = pageReportService;
        this.f94647r = absFunctionWidgetService;
        long avid = jVar.f().getAvid();
        this.f94648s = avid;
        this.f94649t = StateFlowKt.MutableStateFlow((Object) null);
        this.f94653x = StateFlowKt.MutableStateFlow((Object) null);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.f94654y = MutableStateFlow;
        this.f94655z = new a(this);
        MutableStateFlow.setValue(Boolean.valueOf(iInteractLayerService.isDanmakuVisible()));
        FlowKt.launchIn(FlowKt.onEach(hVar.f91107a.f79286c, new AnonymousClass1(this, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(cVar.c(), new AnonymousClass2(this, null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(jVar.J(), new AnonymousClass3(this, null)), coroutineScope);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this, null), 3, (Object) null);
        this.f94650u = null;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new OgvVideoCardService$fetchCardList$1(this, null), 3, (Object) null);
        com.bilibili.community.follow.c cVar3 = com.bilibili.community.follow.c.a;
        FlowKt.launchIn(FlowKt.onEach(new FollowSeasonRepository$flowOfFollowSeason$.inlined.map.1(com.bilibili.community.follow.c.c.b(com.bilibili.community.follow.c.a(j7))), new OgvVideoCardService$fetchCardList$2(this, null)), coroutineScope);
        LikeRepository.a.getClass();
        FlowKt.launchIn(FlowKt.onEach(new LikeRepository$flowOfLike$.inlined.map.1(LikeRepository.c.b(com.bilibili.community.b.a(avid))), new OgvVideoCardService$fetchCardList$3(this, null)), coroutineScope);
    }

    /* JADX WARN: Type inference failed for: r0v163, types: [com.bilibili.ship.theseus.ogv.videocard.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [androidx.databinding.a, com.bilibili.ship.theseus.ogv.videocard.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v122, types: [com.bilibili.ship.theseus.ogv.videocard.c] */
    public static final void a(final OgvVideoCardService ogvVideoCardService, List list) {
        if (list == null) {
            ogvVideoCardService.getClass();
            return;
        }
        i iVarC = ogvVideoCardService.c();
        String str = iVarC != null ? iVarC.f94747f : null;
        ArrayList<PlayerCardVO> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            PlayerCardVO playerCardVO = (PlayerCardVO) next;
            boolean z6 = !(playerCardVO.f() == 2 || playerCardVO.f() == 6) || playerCardVO.n().length() > 0;
            int iF = playerCardVO.f();
            if ((2 <= iF && iF < 4) || playerCardVO.f() == 6 || playerCardVO.f() == 7) {
                if (!Intrinsics.areEqual(playerCardVO.m(), str) && z6) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (final PlayerCardVO playerCardVO2 : arrayList) {
            Context context = ogvVideoCardService.f94636f;
            boolean z7 = !ogvVideoCardService.f94631a.h().f102988b;
            float f7 = 50;
            int iB = Uj0.c.b(f7, context);
            int iB2 = Uj0.c.b(f7, context);
            float f8 = 8;
            int iB3 = Uj0.c.b(f8, context);
            int iB4 = Uj0.c.b(f8, context);
            int iB5 = Uj0.c.b(6, context);
            final ?? aVar = new androidx.databinding.a();
            aVar.f94742a = iB;
            aVar.f94743b = iB2;
            aVar.f94744c = iB3;
            aVar.f94745d = iB4;
            aVar.f94746e = iB5;
            aVar.f94747f = "";
            aVar.f94748g = "";
            Duration.Companion companion = Duration.Companion;
            aVar.f94750j = companion.getZERO-UwyO8pc();
            aVar.f94751k = companion.getZERO-UwyO8pc();
            aVar.f94762v = true;
            aVar.f94764x = "";
            aVar.f94765y = "";
            aVar.f94766z = "";
            aVar.f94722A = true;
            aVar.f94736O = MapsKt.emptyMap();
            aVar.f94737P = 1;
            aVar.f94740S = companion.getZERO-UwyO8pc();
            aVar.f94741T = companion.getZERO-UwyO8pc();
            aVar.f94756p = playerCardVO2.k();
            aVar.f94752l = playerCardVO2.x();
            aVar.h = playerCardVO2.j();
            long j7 = playerCardVO2.f94672B;
            aVar.f94749i = j7 != 0 ? Long.valueOf(j7) : playerCardVO2.r();
            aVar.f94739R = playerCardVO2.e();
            aVar.f94736O = playerCardVO2.f94689n;
            aVar.f94750j = playerCardVO2.l();
            aVar.f94737P = playerCardVO2.f();
            aVar.f94751k = playerCardVO2.i();
            aVar.f94747f = playerCardVO2.m();
            aVar.f94748g = playerCardVO2.B();
            String strZ = playerCardVO2.z();
            if (!Intrinsics.areEqual(strZ, aVar.f94764x)) {
                aVar.f94764x = strZ;
                aVar.notifyPropertyChanged(640);
            }
            String strN = playerCardVO2.n();
            if (!Intrinsics.areEqual(strN, aVar.f94759s)) {
                aVar.f94759s = strN;
                aVar.notifyPropertyChanged(299);
            }
            boolean zU = playerCardVO2.u();
            if (zU != aVar.f94762v) {
                aVar.f94762v = zU;
                aVar.notifyPropertyChanged(570);
            }
            aVar.u(playerCardVO2.v() == 1);
            aVar.f94753m = playerCardVO2.a();
            aVar.f94740S = playerCardVO2.h();
            aVar.f94741T = playerCardVO2.g();
            aVar.f94754n = playerCardVO2.f94671A;
            if (z7 != aVar.f94722A) {
                aVar.f94722A = z7;
                aVar.notifyPropertyChanged(254);
            }
            String str2 = aVar.f94765y;
            String str3 = playerCardVO2.f94673C;
            if (!Intrinsics.areEqual(str3, str2)) {
                aVar.f94765y = str3;
                aVar.notifyPropertyChanged(633);
            }
            String strW = playerCardVO2.w();
            if (!Intrinsics.areEqual(strW, aVar.f94766z)) {
                aVar.f94766z = strW;
                aVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_NAIL_LIMIT);
            }
            aVar.f94729H = playerCardVO2.t();
            aVar.f94730I = playerCardVO2.c();
            if (playerCardVO2.f() == 2 || playerCardVO2.f() == 6) {
                if (true != aVar.f94726E) {
                    aVar.f94726E = true;
                    aVar.notifyPropertyChanged(SearchBangumiItem.TYPE_FULLNET_BANGUMI);
                }
                b bVarB = b.a.b(context, playerCardVO2.A(), z7, aVar.f94737P);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{bVarB.f94708f, bVarB.f94709g});
                float f9 = 12;
                gradientDrawable.setCornerRadius(Uj0.c.a(f9, context));
                if (!Intrinsics.areEqual(gradientDrawable, bVarB.f94707e)) {
                    bVarB.f94707e = gradientDrawable;
                    bVarB.notifyPropertyChanged(34);
                }
                if (!Intrinsics.areEqual(bVarB, aVar.f94760t)) {
                    aVar.f94760t = bVarB;
                    aVar.notifyPropertyChanged(77);
                }
                b bVarB2 = b.a.b(context, playerCardVO2.s(), z7, aVar.f94737P);
                GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{bVarB2.f94708f, bVarB2.f94709g});
                gradientDrawable2.setCornerRadius(Uj0.c.a(f9, context));
                if (!Intrinsics.areEqual(gradientDrawable2, bVarB2.f94707e)) {
                    bVarB2.f94707e = gradientDrawable2;
                    bVarB2.notifyPropertyChanged(34);
                }
                if (!Intrinsics.areEqual(bVarB2, aVar.f94761u)) {
                    aVar.f94761u = bVarB2;
                    aVar.notifyPropertyChanged(543);
                }
                if (true != aVar.f94725D) {
                    aVar.f94725D = true;
                    aVar.notifyPropertyChanged(81);
                }
            } else if (aVar.f94725D) {
                aVar.f94725D = false;
                aVar.notifyPropertyChanged(81);
            }
            GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Uj0.a.a(0, "#E62F3238"), Uj0.a.a(0, "#E62F3238")});
            gradientDrawable3.setCornerRadius(Uj0.c.a(4, context));
            if (!Intrinsics.areEqual(gradientDrawable3, aVar.f94724C)) {
                aVar.f94724C = gradientDrawable3;
                aVar.notifyPropertyChanged(34);
            }
            aVar.f94728G = new View.OnClickListener(ogvVideoCardService, aVar) { // from class: com.bilibili.ship.theseus.ogv.videocard.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final OgvVideoCardService f94710a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final i f94711b;

                {
                    this.f94710a = ogvVideoCardService;
                    this.f94711b = aVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OgvVideoCardService ogvVideoCardService2 = this.f94710a;
                    i iVar = this.f94711b;
                    ogvVideoCardService2.getClass();
                    OgvVideoCardService.m(iVar);
                    ogvVideoCardService2.j(ogvVideoCardService2.f94635e.F());
                    PageReportService.g(ogvVideoCardService2.f94646q, "pgc.pgc-video-detail.interact-toast.close.click", iVar.f94736O, 4);
                }
            };
            if (playerCardVO2.f() == 2 || playerCardVO2.f() == 6 || playerCardVO2.f() == 7) {
                ?? r02 = new View.OnClickListener(aVar, playerCardVO2, ogvVideoCardService) { // from class: com.bilibili.ship.theseus.ogv.videocard.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final i f94712a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final PlayerCardVO f94713b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final OgvVideoCardService f94714c;

                    {
                        this.f94712a = aVar;
                        this.f94713b = playerCardVO2;
                        this.f94714c = ogvVideoCardService;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        i iVar = this.f94712a;
                        PlayerCardVO playerCardVO3 = this.f94713b;
                        OgvVideoCardService ogvVideoCardService2 = this.f94714c;
                        if (!iVar.f94763w || ((iVar.f94752l && iVar.f94762v) || playerCardVO3.f() == 7)) {
                            if (playerCardVO3.p() && !ogvVideoCardService2.f94639j.isLogin()) {
                                Qj0.g.e(view.getContext(), C8986a.a());
                                return;
                            }
                            int iE = playerCardVO3.e();
                            if (iE == 0) {
                                ogvVideoCardService2.l(true, iVar, !iVar.f94763w);
                                ogvVideoCardService2.d(iVar);
                                return;
                            }
                            if (iE == 3) {
                                ogvVideoCardService2.l(true, iVar, !iVar.f94763w);
                                if (playerCardVO3.o().length() > 0) {
                                    ogvVideoCardService2.d(iVar);
                                    ogvVideoCardService2.f94631a.d();
                                    BLRouter.routeTo(new RouteRequest.Builder(Uri.parse(playerCardVO3.o())).build(), view.getContext());
                                    return;
                                }
                                return;
                            }
                            if (iE == 6) {
                                if (iVar.f94737P == 7) {
                                    ogvVideoCardService2.l(true, iVar, false);
                                    if (Duration.compareTo-LRDsOJo(iVar.f94740S, Duration.Companion.getZERO-UwyO8pc()) >= 0) {
                                        ogvVideoCardService2.d(iVar);
                                    }
                                } else {
                                    ogvVideoCardService2.l(true, iVar, !iVar.f94763w);
                                    ogvVideoCardService2.d(iVar);
                                }
                                if (playerCardVO3.o().length() > 0) {
                                    OpenPageProtocol.b(ogvVideoCardService2.f94645p).launch(com.bilibili.lib.brouter.uri.Uri.Companion.parse(playerCardVO3.o()));
                                    return;
                                }
                                return;
                            }
                            if (iE != 7) {
                                BuildersKt.launch$default(ogvVideoCardService2.f94632b, (CoroutineContext) null, (CoroutineStart) null, new OgvVideoCardService$newVm$2$1(ogvVideoCardService2, iVar, null), 3, (Object) null);
                                return;
                            }
                            ogvVideoCardService2.l(true, iVar, !iVar.f94763w);
                            if (playerCardVO3.o().length() > 0) {
                                ogvVideoCardService2.d(iVar);
                                ogvVideoCardService2.f94631a.d();
                                ogvVideoCardService2.f94645p.launch(d.a.a(com.bilibili.lib.brouter.uri.Uri.Companion.parse(playerCardVO3.o()), "pgc.pgc-video-detail.interact-toast.0.click", null, playerCardVO3.q()));
                            }
                        }
                    }
                };
                if (!Intrinsics.areEqual((Object) r02, aVar.f94727F)) {
                    aVar.f94727F = r02;
                    aVar.notifyPropertyChanged(403);
                }
            }
            arrayList2.add(aVar);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        ogvVideoCardService.f94650u = new ArrayList<>(arrayList2);
        if (ogvVideoCardService.c() != null) {
            ogvVideoCardService.f94650u.add(ogvVideoCardService.c());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.ogv.videocard.OgvVideoCardService r9, com.bilibili.ship.theseus.ogv.bugle.a r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.videocard.OgvVideoCardService.b(com.bilibili.ship.theseus.ogv.videocard.OgvVideoCardService, com.bilibili.ship.theseus.ogv.bugle.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static /* synthetic */ void g(OgvVideoCardService ogvVideoCardService) {
        ogvVideoCardService.f(ogvVideoCardService.f94635e.F());
    }

    public static /* synthetic */ void k(OgvVideoCardService ogvVideoCardService) {
        ogvVideoCardService.j(ogvVideoCardService.f94635e.F());
    }

    public static void m(i iVar) {
        iVar.f94755o = true;
        iVar.f94731J = 0;
        iVar.s(null);
    }

    public static boolean n(long j7, long j8) {
        return (j7 == 0 || j8 == 0) ? false : true;
    }

    public static boolean o(long j7, i iVar) {
        boolean z6 = false;
        if (iVar.f94755o) {
            return false;
        }
        boolean z7 = Duration.compareTo-LRDsOJo(iVar.f94750j, j7) < 0 && Duration.compareTo-LRDsOJo(iVar.f94751k, j7) > 0;
        boolean z8 = iVar.f94753m == 0 && (!iVar.f94763w || iVar.f94762v || iVar.f94730I);
        int i7 = iVar.f94737P;
        if ((i7 == 2 || i7 == 6) && z7 && z8) {
            iVar.f94731J = 1;
        }
        boolean z9 = iVar.f94731J == 1;
        if ((z7 && z8) || z9) {
            z6 = true;
        }
        return z6;
    }

    public final i c() {
        return (i) this.f94649t.getValue();
    }

    public final void d(i iVar) {
        if (iVar.f94763w) {
            return;
        }
        iVar.u(true);
        if (iVar.f94762v || iVar.f94730I) {
            return;
        }
        iVar.f94731J = 1;
        BuildersKt.launch$default(this.f94632b, (CoroutineContext) null, (CoroutineStart) null, new OgvVideoCardService$markSelected$1(iVar, this, null), 3, (Object) null);
    }

    public final boolean e(int i7, long j7, int i8, long j8) {
        Map<String, Integer> map;
        boolean z6 = true;
        if (i7 == 7 || (map = this.f94651v) == null) {
            return true;
        }
        Integer num = map.get(l.a(i7, j7, "ssid", "-"));
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = map.get(l.a(i7, j8, "epid", "-"));
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        StringBuilder sbB = O4.c.b(i7, j7, "ssid", "-");
        sbB.append("-");
        sbB.append(i8);
        Integer num3 = map.get(sbB.toString());
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        StringBuilder sbB2 = O4.c.b(i7, j8, "epid", "-");
        sbB2.append("-");
        sbB2.append(i8);
        Integer num4 = map.get(sbB2.toString());
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        if (iIntValue3 > 0 && iIntValue4 > 0) {
            return true;
        }
        if (iIntValue <= 0 || iIntValue2 <= 0) {
            z6 = false;
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r9) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.videocard.OgvVideoCardService.f(long):void");
    }

    public final void h(boolean z6) {
        ArrayList<i> arrayList = this.f94650u;
        if (arrayList != null) {
            ArrayList<i> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                i iVar = (i) obj;
                Long l7 = iVar.f94749i;
                if (l7 != null && l7.longValue() == this.f94637g && iVar.f94739R == 1) {
                    arrayList2.add(obj);
                }
            }
            for (i iVar2 : arrayList2) {
                iVar2.u(z6);
                if (c() == iVar2) {
                    if (iVar2.f94763w) {
                        d(iVar2);
                    } else {
                        iVar2.f94731J = 0;
                        iVar2.s(null);
                    }
                }
            }
        }
    }

    public final void i(boolean z6) {
        ArrayList<i> arrayList = this.f94650u;
        if (arrayList != null) {
            ArrayList<i> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                i iVar = (i) obj;
                Long l7 = iVar.h;
                if (l7 != null && l7.longValue() == this.h && iVar.f94739R == 4) {
                    arrayList2.add(obj);
                }
            }
            for (i iVar2 : arrayList2) {
                iVar2.u(z6);
                if (iVar2 == c()) {
                    if (iVar2.f94763w) {
                        d(iVar2);
                    } else {
                        iVar2.f94731J = 0;
                        iVar2.s(null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(long r6) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.videocard.OgvVideoCardService.j(long):void");
    }

    public final void l(boolean z6, i iVar, boolean z7) {
        int i7 = iVar.f94737P;
        if (i7 == 2 || i7 == 6 || i7 == 7) {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.putAll(iVar.f94736O);
            mapCreateMapBuilder.put("operation", z6 ? "1" : "0");
            mapCreateMapBuilder.put("version", "2");
            PageReportService.g(this.f94646q, "pgc.pgc-video-detail.interact-toast.0.click", MapsKt.build(mapCreateMapBuilder), 4);
            return;
        }
        Map mapCreateMapBuilder2 = MapsKt.createMapBuilder();
        mapCreateMapBuilder2.putAll(iVar.f94736O);
        mapCreateMapBuilder2.put("order_result", z6 ? "1" : "0");
        mapCreateMapBuilder2.put("order_status", z7 ? "1" : "2");
        this.f94638i.report(new NeuronsEvents.b("player.player.order-cards.click.player", MapsKt.build(mapCreateMapBuilder2)));
    }
}
