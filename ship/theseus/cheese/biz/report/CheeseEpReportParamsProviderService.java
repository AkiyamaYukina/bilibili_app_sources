package com.bilibili.ship.theseus.cheese.biz.report;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import eu0.C6985d;
import eu0.C6986e;
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
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/CheeseEpReportParamsProviderService.class */
@StabilityInferred(parameters = 0)
public final class CheeseEpReportParamsProviderService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f90448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C6985d f90449c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.report.CheeseEpReportParamsProviderService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/CheeseEpReportParamsProviderService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseEpReportParamsProviderService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseEpReportParamsProviderService cheeseEpReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseEpReportParamsProviderService;
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
                String strB = C6986e.b(this.this$0.f90449c);
                BLog.d("epReportService payType = ".concat(strB));
                PageReportService pageReportService = this.this$0.f90448b;
                Map<String, String> mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("pay_type", strB), TuplesKt.to("epid", String.valueOf(this.this$0.f90449c.f117521q))});
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

    @Inject
    public CheeseEpReportParamsProviderService(@NotNull CoroutineScope coroutineScope, @NotNull PageReportService pageReportService, @NotNull C6985d c6985d) {
        this.f90447a = coroutineScope;
        this.f90448b = pageReportService;
        this.f90449c = c6985d;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
