package com.bilibili.ship.theseus.ogv.trialcountdown;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/trialcountdown/TrialCountdownToastService$createOperationText$1.class */
public final /* synthetic */ class TrialCountdownToastService$createOperationText$1 extends FunctionReferenceImpl implements Function1<Map<String, String>, Unit> {
    public TrialCountdownToastService$createOperationText$1(Object obj) {
        super(1, obj, TrialCountdownToastService.class, "fillReport", "fillReport(Ljava/util/Map;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, String>) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Map<String, String> map) {
        TrialCountdownToastService.a((TrialCountdownToastService) ((CallableReference) this).receiver, map);
    }
}
