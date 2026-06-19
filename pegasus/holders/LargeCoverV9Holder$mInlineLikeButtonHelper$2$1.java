package com.bilibili.pegasus.holders;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/LargeCoverV9Holder$mInlineLikeButtonHelper$2$1.class */
public final /* synthetic */ class LargeCoverV9Holder$mInlineLikeButtonHelper$2$1 extends FunctionReferenceImpl implements Function1<Long, Unit> {
    public LargeCoverV9Holder$mInlineLikeButtonHelper$2$1(Object obj) {
        super(1, obj, LargeCoverV9Holder.class, "notifyChronosDataUpdate", "notifyChronosDataUpdate(J)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j7) {
        LargeCoverV9Holder largeCoverV9Holder = (LargeCoverV9Holder) ((CallableReference) this).receiver;
        int i7 = LargeCoverV9Holder.f77583F;
        largeCoverV9Holder.F0(j7);
    }
}
