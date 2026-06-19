package com.bilibili.pegasus.holders;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/LargeCoverSingleV9Holder$mInlineLikeButtonHelper$2$1.class */
public final /* synthetic */ class LargeCoverSingleV9Holder$mInlineLikeButtonHelper$2$1 extends FunctionReferenceImpl implements Function1<Long, Unit> {
    public LargeCoverSingleV9Holder$mInlineLikeButtonHelper$2$1(Object obj) {
        super(1, obj, LargeCoverSingleV9Holder.class, "notifyChronosDataUpdate", "notifyChronosDataUpdate(J)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j7) {
        LargeCoverSingleV9Holder largeCoverSingleV9Holder = (LargeCoverSingleV9Holder) ((CallableReference) this).receiver;
        int i7 = LargeCoverSingleV9Holder.f77546z;
        largeCoverSingleV9Holder.F0(j7);
    }
}
