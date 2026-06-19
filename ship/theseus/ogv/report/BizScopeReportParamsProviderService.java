package com.bilibili.ship.theseus.ogv.report;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.utils.e;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/BizScopeReportParamsProviderService.class */
@StabilityInferred(parameters = 0)
public final class BizScopeReportParamsProviderService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvSeason f94385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageReportService f94386c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.report.BizScopeReportParamsProviderService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/BizScopeReportParamsProviderService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BizScopeReportParamsProviderService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BizScopeReportParamsProviderService bizScopeReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bizScopeReportParamsProviderService;
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
                PageReportService pageReportService = this.this$0.f94386c;
                Map<String, String> mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("video_detail_session_id", e.b()), TuplesKt.to("season_id", String.valueOf(this.this$0.f94385b.f94449a)), TuplesKt.to("season_type", String.valueOf(this.this$0.f94385b.f94450b.f71782a)), TuplesKt.to("season_status", String.valueOf(this.this$0.f94385b.f94452d.m9146getValue().intValue())), TuplesKt.to("type", "4")});
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.report.BizScopeReportParamsProviderService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/BizScopeReportParamsProviderService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BizScopeReportParamsProviderService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BizScopeReportParamsProviderService bizScopeReportParamsProviderService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = bizScopeReportParamsProviderService;
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
                BizScopeReportParamsProviderService bizScopeReportParamsProviderService = this.this$0;
                PageReportService pageReportService = bizScopeReportParamsProviderService.f94386c;
                Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("season_status", String.valueOf(bizScopeReportParamsProviderService.f94385b.f94452d.m9146getValue().intValue())), TuplesKt.to("season_type", String.valueOf(this.this$0.f94385b.f94450b.f71782a)), TuplesKt.to("season_id", String.valueOf(this.this$0.f94385b.f94449a))});
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

    @Inject
    public BizScopeReportParamsProviderService(@NotNull CoroutineScope coroutineScope, @NotNull OgvSeason ogvSeason, @NotNull PageReportService pageReportService) {
        this.f94384a = coroutineScope;
        this.f94385b = ogvSeason;
        this.f94386c = pageReportService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
