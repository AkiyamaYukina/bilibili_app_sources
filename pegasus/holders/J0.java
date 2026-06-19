package com.bilibili.pegasus.holders;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.BasePegasusHolder;
import com.bilibili.pegasus.PegasusHolderData;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/J0.class */
@StabilityInferred(parameters = 0)
public final class J0 extends BasePegasusHolder<fp0.p> {
    public final /* bridge */ /* synthetic */ void onBind(PegasusHolderData pegasusHolderData) {
    }

    public final void onFirstExpose(PegasusHolderData pegasusHolderData, int i7) {
        super/*com.bilibili.pegasus.PegasusHolder*/.onFirstExpose((fp0.p) pegasusHolderData, i7);
        Neurons.reportExposure$default(false, "tm.recommend.feed-card.recover-strip.show", (Map) null, (List) null, 12, (Object) null);
    }
}
