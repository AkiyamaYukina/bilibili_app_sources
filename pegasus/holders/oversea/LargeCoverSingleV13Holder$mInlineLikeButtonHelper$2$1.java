package com.bilibili.pegasus.holders.oversea;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/LargeCoverSingleV13Holder$mInlineLikeButtonHelper$2$1.class */
public final /* synthetic */ class LargeCoverSingleV13Holder$mInlineLikeButtonHelper$2$1 extends FunctionReferenceImpl implements Function1<Long, Unit> {
    public LargeCoverSingleV13Holder$mInlineLikeButtonHelper$2$1(Object obj) {
        super(1, obj, LargeCoverSingleV13Holder.class, "notifyChronosDataUpdate", "notifyChronosDataUpdate(J)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j7) {
        com.bilibili.pegasus.common.h hVar;
        LargeCoverSingleV13Holder largeCoverSingleV13Holder = (LargeCoverSingleV13Holder) ((CallableReference) this).receiver;
        int i7 = LargeCoverSingleV13Holder.f77951v;
        ip0.c cVar = (ip0.c) largeCoverSingleV13Holder.getBindData();
        if (cVar == null || j7 != cVar.getAid() || (hVar = largeCoverSingleV13Holder.f77960s) == null) {
            return;
        }
        hVar.updateRepositoryData(cVar);
    }
}
