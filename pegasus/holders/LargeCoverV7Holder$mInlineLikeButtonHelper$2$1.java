package com.bilibili.pegasus.holders;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/LargeCoverV7Holder$mInlineLikeButtonHelper$2$1.class */
public final /* synthetic */ class LargeCoverV7Holder$mInlineLikeButtonHelper$2$1 extends FunctionReferenceImpl implements Function1<Long, Unit> {
    public LargeCoverV7Holder$mInlineLikeButtonHelper$2$1(Object obj) {
        super(1, obj, LargeCoverV7Holder.class, "notifyChronosDataUpdate", "notifyChronosDataUpdate(J)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j7) {
        com.bilibili.pegasus.common.h hVar;
        LargeCoverV7Holder largeCoverV7Holder = (LargeCoverV7Holder) ((CallableReference) this).receiver;
        int i7 = LargeCoverV7Holder.f77564C;
        fp0.k kVar = (fp0.k) largeCoverV7Holder.getBindData();
        if (kVar == null || j7 != kVar.getAid() || (hVar = largeCoverV7Holder.f77582z) == null) {
            return;
        }
        hVar.updateRepositoryData(kVar);
    }
}
