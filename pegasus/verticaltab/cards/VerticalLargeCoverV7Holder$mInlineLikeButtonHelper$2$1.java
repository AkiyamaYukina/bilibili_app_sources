package com.bilibili.pegasus.verticaltab.cards;

import com.bilibili.pegasus.verticaltab.api.model.VerticalLargeCoverV7Item;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/cards/VerticalLargeCoverV7Holder$mInlineLikeButtonHelper$2$1.class */
public final /* synthetic */ class VerticalLargeCoverV7Holder$mInlineLikeButtonHelper$2$1 extends FunctionReferenceImpl implements Function1<Long, Unit> {
    public VerticalLargeCoverV7Holder$mInlineLikeButtonHelper$2$1(Object obj) {
        super(1, obj, VerticalLargeCoverV7Holder.class, "notifyChronosDataUpdate", "notifyChronosDataUpdate(J)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j7) {
        Ep0.a aVar;
        VerticalLargeCoverV7Holder verticalLargeCoverV7Holder = (VerticalLargeCoverV7Holder) ((CallableReference) this).receiver;
        int i7 = VerticalLargeCoverV7Holder.f78939s;
        VerticalLargeCoverV7Item verticalLargeCoverV7Item = (VerticalLargeCoverV7Item) verticalLargeCoverV7Holder.getData();
        if (verticalLargeCoverV7Item == null || j7 != verticalLargeCoverV7Item.getAid() || (aVar = verticalLargeCoverV7Holder.f78946p) == null) {
            return;
        }
        aVar.updateRepositoryData(verticalLargeCoverV7Item);
    }
}
