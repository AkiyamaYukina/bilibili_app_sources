package com.bilibili.pegasus.verticaltab.cards;

import com.bilibili.pegasus.verticaltab.api.model.VerticalLargeCoverV9Item;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/cards/VerticalLargeCoverV9Holder$mInlineLikeButtonHelper$2$1.class */
public final /* synthetic */ class VerticalLargeCoverV9Holder$mInlineLikeButtonHelper$2$1 extends FunctionReferenceImpl implements Function1<Long, Unit> {
    public VerticalLargeCoverV9Holder$mInlineLikeButtonHelper$2$1(Object obj) {
        super(1, obj, VerticalLargeCoverV9Holder.class, "notifyChronosDataUpdate", "notifyChronosDataUpdate(J)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j7) {
        Ep0.b bVar;
        VerticalLargeCoverV9Holder verticalLargeCoverV9Holder = (VerticalLargeCoverV9Holder) ((CallableReference) this).receiver;
        int i7 = VerticalLargeCoverV9Holder.f78949s;
        VerticalLargeCoverV9Item verticalLargeCoverV9Item = (VerticalLargeCoverV9Item) verticalLargeCoverV9Holder.getData();
        if (verticalLargeCoverV9Item == null || j7 != verticalLargeCoverV9Item.getAid() || (bVar = verticalLargeCoverV9Holder.f78955o) == null) {
            return;
        }
        bVar.updateRepositoryData(verticalLargeCoverV9Item);
    }
}
