package com.bilibili.ship.theseus.ogv;

import com.bilibili.ship.theseus.ogv.requestreport.OgvDataRequestFailedReporter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvIjkReportService$reportOnIJKFailed$1.class */
final /* synthetic */ class OgvIjkReportService$reportOnIJKFailed$1 extends FunctionReferenceImpl implements Function0<Boolean> {
    public OgvIjkReportService$reportOnIJKFailed$1(Object obj) {
        super(0, obj, OgvDataRequestFailedReporter.class, "enabled", "enabled()Z", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Boolean m8931invoke() {
        ((OgvDataRequestFailedReporter) ((CallableReference) this).receiver).getClass();
        return Boolean.valueOf(Hj0.a.a("ogv_detail_failed_report_switch", true));
    }
}
