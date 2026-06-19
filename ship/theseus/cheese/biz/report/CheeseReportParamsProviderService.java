package com.bilibili.ship.theseus.cheese.biz.report;

import androidx.compose.runtime.internal.StabilityInferred;
import au0.C4911a;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6101w;
import com.bilibili.ship.theseus.cheese.biz.intro.publisher.p;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import eu0.C7007z;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/CheeseReportParamsProviderService.class */
@StabilityInferred(parameters = 0)
public final class CheeseReportParamsProviderService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f90455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C4911a f90456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f90457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final p f90458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C6101w f90459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.bean.b f90460g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.report.CheeseReportParamsProviderService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/CheeseReportParamsProviderService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseReportParamsProviderService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseReportParamsProviderService cheeseReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseReportParamsProviderService;
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
                CheeseReportParamsProviderService cheeseReportParamsProviderService = this.this$0;
                PageReportService pageReportService = cheeseReportParamsProviderService.f90455b;
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                C4911a c4911a = cheeseReportParamsProviderService.f90456c;
                mapCreateMapBuilder.put("season_id", String.valueOf(c4911a.f54237a));
                mapCreateMapBuilder.put("csource", c4911a.f54238b);
                mapCreateMapBuilder.put(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_MSOURCE, c4911a.f54240d);
                mapCreateMapBuilder.put("follow_status", ((Boolean) cheeseReportParamsProviderService.f90458e.f89883f.getValue()).booleanValue() ? "1" : "0");
                mapCreateMapBuilder.put("pay_status", cheeseReportParamsProviderService.f90457d ? "1" : "0");
                mapCreateMapBuilder.put("new_play", "1");
                mapCreateMapBuilder.put("track_id", c4911a.f54248m);
                String str = c4911a.h;
                if (str.length() > 0) {
                    String str2 = c4911a.f54243g;
                    if (str2.length() > 0) {
                        mapCreateMapBuilder.put("query", str);
                        mapCreateMapBuilder.put("s_trackId", str2);
                        mapCreateMapBuilder.put("queryFrom", c4911a.f54238b);
                    }
                }
                com.bilibili.ship.theseus.united.bean.a aVar = cheeseReportParamsProviderService.f90460g.f98750l;
                if (aVar != null) {
                    Long lBoxLong = Boxing.boxLong(aVar.f98739a);
                    if (lBoxLong.longValue() <= 0) {
                        lBoxLong = null;
                    }
                    if (lBoxLong != null) {
                        mapCreateMapBuilder.put("highlight_cut_id", String.valueOf(lBoxLong.longValue()));
                    }
                }
                Map<String, String> mapBuild = MapsKt.build(mapCreateMapBuilder);
                this.label = 1;
                if (pageReportService.e(mapBuild, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.report.CheeseReportParamsProviderService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/CheeseReportParamsProviderService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseReportParamsProviderService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheeseReportParamsProviderService cheeseReportParamsProviderService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheeseReportParamsProviderService;
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
                ResultKt.throwOnFailure(obj);
                CheeseReportParamsProviderService cheeseReportParamsProviderService = this.this$0;
                PageReportService pageReportService = cheeseReportParamsProviderService.f90455b;
                Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("csource", cheeseReportParamsProviderService.f90456c.f54238b), TuplesKt.to("follow_status", ((Boolean) this.this$0.f90458e.f89883f.getValue()).booleanValue() ? "1" : "0"), TuplesKt.to("pay_status", this.this$0.f90457d ? "1" : "0"), TuplesKt.to("track_id", this.this$0.f90456c.f54248m), TuplesKt.to("season_id", String.valueOf(this.this$0.f90456c.f54237a))});
                this.label = 1;
                if (pageReportService.d(mapMapOf, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.report.CheeseReportParamsProviderService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/CheeseReportParamsProviderService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.report.CheeseReportParamsProviderService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/CheeseReportParamsProviderService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final CheeseReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseReportParamsProviderService cheeseReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseReportParamsProviderService;
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
                Map mapBuild;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                PageReportService pageReportService = this.this$0.f90455b;
                String str = z6 ? "1" : "0";
                Map<String, String> map = pageReportService.f102489b;
                if (map != null && map.containsKey("follow_status")) {
                    pageReportService.f102489b.put("follow_status", str);
                    if (pageReportService.f102489b == null) {
                        mapBuild = null;
                    } else {
                        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                        Map<String, String> map2 = pageReportService.f102489b;
                        if (map2 != null) {
                            mapCreateMapBuilder.putAll(map2);
                        }
                        mapBuild = MapsKt.build(mapCreateMapBuilder);
                    }
                    pageReportService.f102488a.notifyExtraReportParamsChanged(mapBuild);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CheeseReportParamsProviderService cheeseReportParamsProviderService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = cheeseReportParamsProviderService;
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
                CheeseReportParamsProviderService cheeseReportParamsProviderService = this.this$0;
                StateFlow<Boolean> stateFlow = cheeseReportParamsProviderService.f90458e.f89883f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseReportParamsProviderService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.report.CheeseReportParamsProviderService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/CheeseReportParamsProviderService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.report.CheeseReportParamsProviderService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/CheeseReportParamsProviderService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7007z, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseReportParamsProviderService cheeseReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseReportParamsProviderService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C7007z c7007z, Continuation<? super Unit> continuation) {
                return create(c7007z, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C7007z c7007z = (C7007z) this.L$0;
                    PageReportService pageReportService = this.this$0.f90455b;
                    Map<String, String> mapMapOf = MapsKt.mapOf(TuplesKt.to("cpbg_token", c7007z.f117614o.length() > 0 ? c7007z.f117601a : "-100"));
                    this.label = 1;
                    if (pageReportService.e(mapMapOf, this) == coroutine_suspended) {
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
        public AnonymousClass4(CheeseReportParamsProviderService cheeseReportParamsProviderService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = cheeseReportParamsProviderService;
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
                CheeseReportParamsProviderService cheeseReportParamsProviderService = this.this$0;
                StateFlow<C7007z> stateFlow = cheeseReportParamsProviderService.f90459f.f89782d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseReportParamsProviderService, null);
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

    @Inject
    public CheeseReportParamsProviderService(@NotNull CoroutineScope coroutineScope, @NotNull PageReportService pageReportService, @NotNull C4911a c4911a, boolean z6, @NotNull p pVar, @NotNull C6101w c6101w, @NotNull com.bilibili.ship.theseus.united.bean.b bVar) {
        this.f90454a = coroutineScope;
        this.f90455b = pageReportService;
        this.f90456c = c4911a;
        this.f90457d = z6;
        this.f90458e = pVar;
        this.f90459f = c6101w;
        this.f90460g = bVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }
}
