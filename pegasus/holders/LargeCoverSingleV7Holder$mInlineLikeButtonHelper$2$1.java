package com.bilibili.pegasus.holders;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/LargeCoverSingleV7Holder$mInlineLikeButtonHelper$2$1.class */
public final /* synthetic */ class LargeCoverSingleV7Holder$mInlineLikeButtonHelper$2$1 extends FunctionReferenceImpl implements Function1<Long, Unit> {
    public LargeCoverSingleV7Holder$mInlineLikeButtonHelper$2$1(Object obj) {
        super(1, obj, LargeCoverSingleV7Holder.class, "notifyChronosDataUpdate", "notifyChronosDataUpdate(J)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j7) {
        com.bilibili.pegasus.common.h hVar;
        LargeCoverSingleV7Holder largeCoverSingleV7Holder = (LargeCoverSingleV7Holder) ((CallableReference) this).receiver;
        int i7 = LargeCoverSingleV7Holder.f77535u;
        fp0.h hVar2 = (fp0.h) largeCoverSingleV7Holder.getBindData();
        if (hVar2 == null || j7 != hVar2.getAid() || (hVar = largeCoverSingleV7Holder.f77543r) == null) {
            return;
        }
        hVar.updateRepositoryData(hVar2);
    }
}
