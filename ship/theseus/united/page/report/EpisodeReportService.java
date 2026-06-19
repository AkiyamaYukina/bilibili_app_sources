package com.bilibili.ship.theseus.united.page.report;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.card.GameCardButton;
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
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/EpisodeReportService.class */
@StabilityInferred(parameters = 0)
public final class EpisodeReportService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f102472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C7893a f102473c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.report.EpisodeReportService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/EpisodeReportService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final EpisodeReportService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.report.EpisodeReportService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/EpisodeReportService$1$1.class */
        public static final class C11041 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final EpisodeReportService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11041(EpisodeReportService episodeReportService, Continuation<? super C11041> continuation) {
                super(2, continuation);
                this.this$0 = episodeReportService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11041 c11041 = new C11041(this.this$0, continuation);
                c11041.L$0 = obj;
                return c11041;
            }

            public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
                return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C7893a.C1318a c1318a = (C7893a.C1318a) this.L$0;
                    if (c1318a == null) {
                        return Unit.INSTANCE;
                    }
                    PageReportService pageReportService = this.this$0.f102472b;
                    C7893a.C1318a.C1319a c1319a = c1318a.f123395a;
                    Map<String, String> mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("cid", String.valueOf(c1319a.f123398b)), TuplesKt.to(GameCardButton.extraAvid, String.valueOf(c1319a.f123397a))});
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
        public AnonymousClass1(EpisodeReportService episodeReportService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = episodeReportService;
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
                EpisodeReportService episodeReportService = this.this$0;
                StateFlow<C7893a.C1318a> stateFlow = episodeReportService.f102473c.f123393f;
                C11041 c11041 = new C11041(episodeReportService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c11041, this) == coroutine_suspended) {
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
    public EpisodeReportService(@NotNull CoroutineScope coroutineScope, @NotNull PageReportService pageReportService, @NotNull C7893a c7893a) {
        this.f102471a = coroutineScope;
        this.f102472b = pageReportService;
        this.f102473c = c7893a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
