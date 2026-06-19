package com.bilibili.ship.theseus.united.report;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/report/ViewReportParamsProviderService.class */
@StabilityInferred(parameters = 0)
public final class ViewReportParamsProviderService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f104834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageReportService f104836c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.report.ViewReportParamsProviderService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/report/ViewReportParamsProviderService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ViewReportParamsProviderService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ViewReportParamsProviderService viewReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = viewReportParamsProviderService;
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
                ViewReportParamsProviderService viewReportParamsProviderService = this.this$0;
                PageReportService pageReportService = viewReportParamsProviderService.f104836c;
                Map<String, String> map = viewReportParamsProviderService.f104834a;
                this.label = 1;
                if (pageReportService.e(map, this) == coroutine_suspended) {
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
    public ViewReportParamsProviderService(@NotNull Map<String, String> map, @NotNull CoroutineScope coroutineScope, @NotNull PageReportService pageReportService) {
        this.f104834a = map;
        this.f104835b = coroutineScope;
        this.f104836c = pageReportService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
