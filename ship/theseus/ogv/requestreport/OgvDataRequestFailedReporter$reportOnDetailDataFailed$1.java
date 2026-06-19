package com.bilibili.ship.theseus.ogv.requestreport;

import Hj0.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/requestreport/OgvDataRequestFailedReporter$reportOnDetailDataFailed$1.class */
public final /* synthetic */ class OgvDataRequestFailedReporter$reportOnDetailDataFailed$1 extends FunctionReferenceImpl implements Function0<Boolean> {
    public OgvDataRequestFailedReporter$reportOnDetailDataFailed$1(Object obj) {
        super(0, obj, OgvDataRequestFailedReporter.class, "enabled", "enabled()Z", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Boolean m9132invoke() {
        ((OgvDataRequestFailedReporter) ((CallableReference) this).receiver).getClass();
        return Boolean.valueOf(a.a("ogv_detail_failed_report_switch", true));
    }
}
