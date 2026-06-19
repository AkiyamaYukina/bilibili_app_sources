package com.bilibili.ship.theseus.ogv.castscreen;

import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.projection.commonburid.CastCommonParameters;
import com.bilibili.lib.projection.commonburid.CastContentType;
import com.bilibili.lib.projection.commonburid.CastEnterSource;
import com.bilibili.lib.projection.commonburid.CastEventTrackingManager;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import com.bilibili.ship.theseus.united.page.playingarea.g;
import com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository;
import com.bilibili.ship.theseus.united.page.toolbar.j;
import com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/OgvCastScreenService.class */
@StabilityInferred(parameters = 0)
public final class OgvCastScreenService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f91658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f91659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BusinessCastScreenService f91660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7893a f91661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<ProjectionItemData> f91662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final g f91663g;

    @NotNull
    public final OgvCurrentEpisodeRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ToolbarCastScreenRepository f91664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final FullScreenThreePointEventRepository f91665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final j f91666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Flow<ExtraInfo> f91667l;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.castscreen.OgvCastScreenService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/OgvCastScreenService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvCastScreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.castscreen.OgvCastScreenService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/OgvCastScreenService$1$1.class */
        public static final class C06791 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final OgvCastScreenService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06791(OgvCastScreenService ogvCastScreenService, Continuation<C06791> continuation) {
                super(2, continuation);
                this.this$0 = ogvCastScreenService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06791(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                WithVideoProgress withVideoProgressP;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                com.bilibili.ship.theseus.keel.player.j jVarJ = this.this$0.f91658b.j();
                this.this$0.b((jVarJ == null || (withVideoProgressP = jVarJ.p()) == null) ? 0L : withVideoProgressP.L(), false, true);
                CastCommonParameters castCommonParametersA = OgvCastScreenService.a(this.this$0, CastEnterSource.CastEnterSourceDetailDialogProjectionIcon);
                CastEventTrackingManager.Companion companion = CastEventTrackingManager.Companion;
                companion.instance().updateCommonParams(castCommonParametersA);
                CastEventTrackingManager.trackClick$default(companion.instance(), "main.public.screencast-entry.all.click", null, 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvCastScreenService ogvCastScreenService, Continuation<AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvCastScreenService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvCastScreenService ogvCastScreenService = this.this$0;
                SharedFlow<Unit> sharedFlow = ogvCastScreenService.f91666k.f103408m;
                C06791 c06791 = new C06791(ogvCastScreenService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c06791, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.castscreen.OgvCastScreenService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/OgvCastScreenService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvCastScreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.castscreen.OgvCastScreenService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/OgvCastScreenService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final OgvCastScreenService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OgvCastScreenService ogvCastScreenService, Continuation<AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ogvCastScreenService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                WithVideoProgress withVideoProgressP;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                com.bilibili.ship.theseus.keel.player.j jVarJ = this.this$0.f91658b.j();
                this.this$0.b((jVarJ == null || (withVideoProgressP = jVarJ.p()) == null) ? 0L : withVideoProgressP.L(), false, true);
                CastCommonParameters castCommonParametersA = OgvCastScreenService.a(this.this$0, CastEnterSource.CastEnterSourceDetailProjectionIcon);
                CastEventTrackingManager.Companion companion = CastEventTrackingManager.Companion;
                companion.instance().updateCommonParams(castCommonParametersA);
                CastEventTrackingManager.trackClick$default(companion.instance(), "main.public.screencast-entry.all.click", null, 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvCastScreenService ogvCastScreenService, Continuation<AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvCastScreenService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvCastScreenService ogvCastScreenService = this.this$0;
                SharedFlow<Unit> sharedFlow = ogvCastScreenService.f91664i.f103360u;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ogvCastScreenService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.castscreen.OgvCastScreenService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/OgvCastScreenService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvCastScreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.castscreen.OgvCastScreenService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/OgvCastScreenService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final OgvCastScreenService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OgvCastScreenService ogvCastScreenService, Continuation<AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ogvCastScreenService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                WithVideoProgress withVideoProgressP;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                com.bilibili.ship.theseus.keel.player.j jVarJ = this.this$0.f91658b.j();
                this.this$0.b((jVarJ == null || (withVideoProgressP = jVarJ.p()) == null) ? 0L : withVideoProgressP.L(), false, false);
                CastCommonParameters castCommonParametersA = OgvCastScreenService.a(this.this$0, CastEnterSource.CastEnterSourceHorizontalPlayerProjectionIcon);
                CastEventTrackingManager.Companion companion = CastEventTrackingManager.Companion;
                companion.instance().updateCommonParams(castCommonParametersA);
                CastEventTrackingManager.trackClick$default(companion.instance(), "main.public.screencast-entry.all.click", null, 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OgvCastScreenService ogvCastScreenService, Continuation<AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ogvCastScreenService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvCastScreenService ogvCastScreenService = this.this$0;
                SharedFlow<Unit> sharedFlow = ogvCastScreenService.f91665j.h;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ogvCastScreenService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.castscreen.OgvCastScreenService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/OgvCastScreenService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvCastScreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.castscreen.OgvCastScreenService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/OgvCastScreenService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<OgvEpisode, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvCastScreenService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OgvCastScreenService ogvCastScreenService, Continuation<AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ogvCastScreenService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(OgvEpisode ogvEpisode, Continuation<Unit> continuation) {
                return create(ogvEpisode, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    Method dump skipped, instruction units count: 357
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.castscreen.OgvCastScreenService.AnonymousClass4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(OgvCastScreenService ogvCastScreenService, Continuation<AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = ogvCastScreenService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvCastScreenService ogvCastScreenService = this.this$0;
                OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1 = ogvCastScreenService.h.f92119v;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ogvCastScreenService, null);
                this.label = 1;
                if (FlowKt.collectLatest(ogvCurrentEpisodeRepository$special$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.castscreen.OgvCastScreenService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/OgvCastScreenService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvCastScreenService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.castscreen.OgvCastScreenService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/OgvCastScreenService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ExtraInfo, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvCastScreenService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OgvCastScreenService ogvCastScreenService, Continuation<AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ogvCastScreenService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(ExtraInfo extraInfo, Continuation<Unit> continuation) {
                return create(extraInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ExtraInfo extraInfo = (ExtraInfo) this.L$0;
                if (extraInfo == null) {
                    return Unit.INSTANCE;
                }
                if (((Boolean) Ju0.a.f11694a.a(extraInfo)).booleanValue()) {
                    this.this$0.f91664i.a("ogvCastDrmSuppressor");
                } else {
                    this.this$0.f91664i.b("ogvCastDrmSuppressor");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(OgvCastScreenService ogvCastScreenService, Continuation<AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = ogvCastScreenService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvCastScreenService ogvCastScreenService = this.this$0;
                Flow<ExtraInfo> flow = ogvCastScreenService.f91667l;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ogvCastScreenService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    @Inject
    public OgvCastScreenService(@NotNull CoroutineScope coroutineScope, @NotNull OgvSeason ogvSeason, @NotNull h hVar, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull BusinessCastScreenService businessCastScreenService, @NotNull C7893a c7893a, @NotNull List<ProjectionItemData> list, @NotNull g gVar, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull ToolbarCastScreenRepository toolbarCastScreenRepository, @NotNull FullScreenThreePointEventRepository fullScreenThreePointEventRepository, @NotNull j jVar, @NotNull Flow<ExtraInfo> flow) {
        this.f91657a = coroutineScope;
        this.f91658b = hVar;
        this.f91659c = theseusCastScreenRepository;
        this.f91660d = businessCastScreenService;
        this.f91661e = c7893a;
        this.f91662f = list;
        this.f91663g = gVar;
        this.h = ogvCurrentEpisodeRepository;
        this.f91664i = toolbarCastScreenRepository;
        this.f91665j = fullScreenThreePointEventRepository;
        this.f91666k = jVar;
        this.f91667l = flow;
        BLog.i("OgvCastScreenService-<init>", "[theseus-ogv-OgvCastScreenService-<init>] " + C3751q.a(ogvSeason.f94449a, "seasonId:"));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
    }

    public static final CastCommonParameters a(OgvCastScreenService ogvCastScreenService, CastEnterSource castEnterSource) {
        OgvEpisode ogvEpisodeC = ogvCastScreenService.h.c();
        return ogvEpisodeC == null ? new CastCommonParameters("", castEnterSource, CastContentType.CastContentTypeUnknown) : new CastCommonParameters(JsonUtilKt.toJson(MapsKt.mapOf(new Pair[]{TuplesKt.to(GameCardButton.extraAvid, String.valueOf(ogvEpisodeC.a())), TuplesKt.to("cid", String.valueOf(ogvEpisodeC.f93561g))})), castEnterSource, CastContentType.CastContentTypePGC);
    }

    public final void b(long j7, boolean z6, boolean z7) {
        if (this.f91662f.isEmpty()) {
            BLog.e("OgvCastScreenService-tryEnterCastScreen", "[theseus-ogv-OgvCastScreenService-tryEnterCastScreen] Failed to enter cast screen: item list is empty.", (Throwable) null);
            return;
        }
        C7893a c7893a = this.f91661e;
        PlayingAreaDescription playingAreaDescriptionA = c7893a.a();
        if (playingAreaDescriptionA != null && playingAreaDescriptionA.a()) {
            this.f91663g.d();
        }
        List<ProjectionItemData> list = this.f91662f;
        Iterator<ProjectionItemData> it = list.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            ProjectionItemData next = it.next();
            C7893a.C1318a c1318aC = c7893a.c();
            if (c1318aC != null && next.f63477d == c1318aC.f123395a.f123398b) {
                break;
            } else {
                i7++;
            }
        }
        b bVar = new b(i7, list, z6, z7);
        BusinessCastScreenService.d dVar = new BusinessCastScreenService.d(j7);
        BusinessCastScreenService businessCastScreenService = this.f91660d;
        businessCastScreenService.getClass();
        businessCastScreenService.f99099p.setValue(new BusinessCastScreenService.c(bVar, dVar));
    }
}
