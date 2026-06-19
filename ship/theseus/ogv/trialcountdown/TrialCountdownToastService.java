package com.bilibili.ship.theseus.ogv.trialcountdown;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.playingarea.i;
import com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.C6384i;
import com.bilibili.ship.theseus.united.page.restrictionlayer.C6386k;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IToastService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/trialcountdown/TrialCountdownToastService.class */
@StabilityInferred(parameters = 0)
public final class TrialCountdownToastService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f94586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final j f94587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IToastService f94588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageReportService f94589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f94590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C6386k f94591g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.trialcountdown.TrialCountdownToastService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/trialcountdown/TrialCountdownToastService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Flow<Pair<FullPromptBarVo, Duration>> $toastMaterialFlow;
        int label;
        final TrialCountdownToastService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.trialcountdown.TrialCountdownToastService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/trialcountdown/TrialCountdownToastService$1$1.class */
        public static final class C07491 extends SuspendLambda implements Function2<Pair<? extends FullPromptBarVo, ? extends Duration>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TrialCountdownToastService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07491(TrialCountdownToastService trialCountdownToastService, Continuation<? super C07491> continuation) {
                super(2, continuation);
                this.this$0 = trialCountdownToastService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07491 c07491 = new C07491(this.this$0, continuation);
                c07491.L$0 = obj;
                return c07491;
            }

            public final Object invoke(Pair<FullPromptBarVo, Duration> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.L$0;
                    if (pair == null) {
                        return Unit.INSTANCE;
                    }
                    FullPromptBarVo fullPromptBarVo = (FullPromptBarVo) pair.component1();
                    Duration duration = (Duration) pair.component2();
                    TrialCountdownToastService trialCountdownToastService = this.this$0;
                    long j7 = duration.unbox-impl();
                    this.label = 1;
                    trialCountdownToastService.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new TrialCountdownToastService$runToast$2(fullPromptBarVo, trialCountdownToastService, j7, null), this);
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
        public AnonymousClass1(Flow<Pair<FullPromptBarVo, Duration>> flow, TrialCountdownToastService trialCountdownToastService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$toastMaterialFlow = flow;
            this.this$0 = trialCountdownToastService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$toastMaterialFlow, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Pair<FullPromptBarVo, Duration>> flow = this.$toastMaterialFlow;
                C07491 c07491 = new C07491(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c07491, this) == coroutine_suspended) {
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
    public TrialCountdownToastService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull j jVar, @NotNull IToastService iToastService, @NotNull PageReportService pageReportService, @NotNull i iVar, @NotNull C6384i c6384i, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar) {
        this.f94585a = coroutineScope;
        this.f94586b = context;
        this.f94587c = jVar;
        this.f94588d = iToastService;
        this.f94589e = pageReportService;
        this.f94590f = cVar;
        TrialCountdownToastService$createOperationText$1 trialCountdownToastService$createOperationText$1 = new TrialCountdownToastService$createOperationText$1(this);
        this.f94591g = new C6386k(new C6384i(c6384i.f102744a, c6384i.f102745b, c6384i.f102746c, trialCountdownToastService$createOperationText$1, c6384i.f102748e));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.combine(episodeExtraInfoRepository.f99566b, jVar.d(), jVar.s(), iVar.f102367c, new TrialCountdownToastService$toastMaterialFlow$1(null)), new TrialCountdownToastService$special$$inlined$flatMapLatest$1(null, this))), this, null), 3, (Object) null);
    }

    public static final void a(TrialCountdownToastService trialCountdownToastService, Map map) {
        com.bilibili.ship.theseus.united.page.screenstate.c cVar = trialCountdownToastService.f94590f;
        c.a aVarH = cVar.h();
        map.put("state", !Intrinsics.areEqual(cVar.f(), Boolean.TRUE) ? !aVarH.f102988b ? "1" : "2" : !aVarH.f102988b ? "3" : "4");
    }
}
