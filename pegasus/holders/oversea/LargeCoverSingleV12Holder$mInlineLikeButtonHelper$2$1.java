package com.bilibili.pegasus.holders.oversea;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/LargeCoverSingleV12Holder$mInlineLikeButtonHelper$2$1.class */
public final /* synthetic */ class LargeCoverSingleV12Holder$mInlineLikeButtonHelper$2$1 extends FunctionReferenceImpl implements Function1<Long, Unit> {
    public LargeCoverSingleV12Holder$mInlineLikeButtonHelper$2$1(Object obj) {
        super(1, obj, LargeCoverSingleV12Holder.class, "notifyChronosDataUpdate", "notifyChronosDataUpdate(J)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j7) {
        LargeCoverSingleV12Holder largeCoverSingleV12Holder = (LargeCoverSingleV12Holder) ((CallableReference) this).receiver;
        int i7 = LargeCoverSingleV12Holder.f77934y;
        largeCoverSingleV12Holder.F0(j7);
    }
}
