package com.bilibili.ship.theseus.ogv.report;

import com.bilibili.framework.exposure.core.ExposureLayoutInfo;
import com.bilibili.ship.theseus.ogv.report.ExposureEntryRecordService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/a.class */
public final class a implements ExposureEntryRecordService.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Flow<Unit> f94392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0<Unit> f94393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableStateFlow<ExposureLayoutInfo> f94394c;

    public a(Flow<Unit> flow, Function0<Unit> function0, MutableStateFlow<ExposureLayoutInfo> mutableStateFlow) {
        this.f94392a = flow;
        this.f94393b = function0;
        this.f94394c = mutableStateFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // com.bilibili.ship.theseus.ogv.report.ExposureEntryRecordService.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.report.ExposureEntryRecordService$newExposureEntry$1$awaitFirstExposureEvent$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.ship.theseus.ogv.report.ExposureEntryRecordService$newExposureEntry$1$awaitFirstExposureEvent$1 r0 = (com.bilibili.ship.theseus.ogv.report.ExposureEntryRecordService$newExposureEntry$1$awaitFirstExposureEvent$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L2f
        L25:
            com.bilibili.ship.theseus.ogv.report.ExposureEntryRecordService$newExposureEntry$1$awaitFirstExposureEvent$1 r0 = new com.bilibili.ship.theseus.ogv.report.ExposureEntryRecordService$newExposureEntry$1$awaitFirstExposureEvent$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L2f:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L59
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L4f
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L71
        L4f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L59:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r5
            kotlinx.coroutines.flow.Flow<kotlin.Unit> r0 = r0.f94392a
            r1 = r6
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r0, r1)
            r1 = r8
            if (r0 != r1) goto L71
            r0 = r8
            return r0
        L71:
            r0 = r5
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.f94393b
            java.lang.Object r0 = r0.invoke()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.report.a.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void onNewLayoutInfoReceived(ExposureLayoutInfo exposureLayoutInfo) {
        this.f94394c.setValue(exposureLayoutInfo);
    }
}
