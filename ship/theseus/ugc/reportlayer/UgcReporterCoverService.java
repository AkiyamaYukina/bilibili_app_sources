package com.bilibili.ship.theseus.ugc.reportlayer;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.app.comm.webview.message.WebBusModel;
import com.bilibili.bangumi.logic.page.detail.service.e;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import com.bilibili.ship.theseus.united.page.toolbar.j;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uq0.InterfaceC8754b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService.class */
@StabilityInferred(parameters = 0)
public final class UgcReporterCoverService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f98469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f98470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final j f98471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f98472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ToolbarRepository f98473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageReportService f98474g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f98475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final PlayerHeadsetService f98476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f98477k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Av0.a f98478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final b f98479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final a f98480n = new a(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Job f98481o;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.reportlayer.UgcReporterCoverService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcReporterCoverService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.reportlayer.UgcReporterCoverService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$1$1.class */
        public static final class C09221 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final UgcReporterCoverService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09221(UgcReporterCoverService ugcReporterCoverService, Continuation<? super C09221> continuation) {
                super(2, continuation);
                this.this$0 = ugcReporterCoverService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C09221(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UgcReporterCoverService ugcReporterCoverService = this.this$0;
                    this.label = 1;
                    ugcReporterCoverService.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcReporterCoverService$doAppeal$2(ugcReporterCoverService, null), this);
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
        public AnonymousClass1(UgcReporterCoverService ugcReporterCoverService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcReporterCoverService;
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
                UgcReporterCoverService ugcReporterCoverService = this.this$0;
                SharedFlow<Unit> sharedFlow = ugcReporterCoverService.f98471d.f103401e;
                C09221 c09221 = new C09221(ugcReporterCoverService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c09221, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.reportlayer.UgcReporterCoverService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcReporterCoverService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.reportlayer.UgcReporterCoverService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final UgcReporterCoverService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcReporterCoverService ugcReporterCoverService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcReporterCoverService;
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
                Job job = this.this$0.f98481o;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UgcReporterCoverService ugcReporterCoverService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ugcReporterCoverService;
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
                UgcReporterCoverService ugcReporterCoverService = this.this$0;
                MutableSharedFlow<Unit> mutableSharedFlow = ugcReporterCoverService.f98473f.f103294r;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ugcReporterCoverService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableSharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.reportlayer.UgcReporterCoverService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcReporterCoverService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.reportlayer.UgcReporterCoverService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<WebBusModel, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UgcReporterCoverService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.reportlayer.UgcReporterCoverService$3$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$3$1$a.class */
            public static final class a extends TypeToken<JsonObject> {
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcReporterCoverService ugcReporterCoverService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcReporterCoverService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(WebBusModel webBusModel, Continuation<? super Unit> continuation) {
                return create(webBusModel, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    WebBusModel webBusModel = (WebBusModel) this.L$0;
                    String name = webBusModel.getName();
                    String str = (String) ConfigManager.Companion.config().get("videodetail.player_reporter_layer_switch", "true");
                    Boolean boolBoxBoolean = str != null ? Boxing.boxBoolean(Boolean.parseBoolean(str)) : null;
                    if (Intrinsics.areEqual(name, "video_appeal_report_success") && Intrinsics.areEqual(boolBoxBoolean, Boxing.boxBoolean(true))) {
                        try {
                            JsonElement jsonElement = ((JsonObject) JsonUtilKt.parseJson(webBusModel.getData(), new a().getType())).get(GameCardButton.extraAvid);
                            long asLong = jsonElement != null ? jsonElement.getAsLong() : 0L;
                            UgcReporterCoverService ugcReporterCoverService = this.this$0;
                            if (asLong == ugcReporterCoverService.f98478l.f590a) {
                                PageReportService.i(ugcReporterCoverService.f98474g, "player.player.report-av-entry.show.player", null, 4);
                                UgcReporterCoverService ugcReporterCoverService2 = this.this$0;
                                this.label = 1;
                                ugcReporterCoverService2.getClass();
                                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcReporterCoverService$cancelAndShowReporter$2(ugcReporterCoverService2, null), this);
                                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objCoroutineScope = Unit.INSTANCE;
                                }
                                if (objCoroutineScope == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } catch (Exception e7) {
                            e.a("[theseus-ugc-UgcReporterCoverService$3$1-invokeSuspend] ", C4496a.a("error data:", webBusModel.getData()), "UgcReporterCoverService$3$1-invokeSuspend", (Throwable) null);
                            return Unit.INSTANCE;
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
        public AnonymousClass3(UgcReporterCoverService ugcReporterCoverService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ugcReporterCoverService;
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
                this.label = 1;
                if (YieldKt.yield(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            Flow flowA = com.bilibili.ogv.infra.violet.c.a(WebBusModel.class);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 2;
            if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$a.class */
    public static final class a implements InterfaceC8754b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UgcReporterCoverService f98482a;

        public a(UgcReporterCoverService ugcReporterCoverService) {
            this.f98482a = ugcReporterCoverService;
        }

        @Override // uq0.InterfaceC8754b
        public final void d() {
            Job job = this.f98482a.f98481o;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }

        @Override // uq0.InterfaceC8754b
        public final void e() {
            Job job = this.f98482a.f98481o;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }

        @Override // uq0.InterfaceC8754b
        public final void pause() {
        }

        @Override // uq0.InterfaceC8754b
        public final void resume() {
            Job job = this.f98482a.f98481o;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    @Inject
    public UgcReporterCoverService(@NotNull CoroutineScope coroutineScope, @NotNull h hVar, @NotNull ComponentActivity componentActivity, @NotNull j jVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull ToolbarRepository toolbarRepository, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull PlayerHeadsetService playerHeadsetService, @NotNull DetailRelateRepository detailRelateRepository, @NotNull Av0.a aVar2, @NotNull b bVar) {
        this.f98468a = coroutineScope;
        this.f98469b = hVar;
        this.f98470c = componentActivity;
        this.f98471d = jVar;
        this.f98472e = aVar;
        this.f98473f = toolbarRepository;
        this.f98474g = pageReportService;
        this.h = cVar;
        this.f98475i = theseusFloatLayerService;
        this.f98476j = playerHeadsetService;
        this.f98477k = detailRelateRepository;
        this.f98478l = aVar2;
        this.f98479m = bVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }
}
