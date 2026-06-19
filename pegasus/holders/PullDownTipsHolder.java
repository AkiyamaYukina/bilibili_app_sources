package com.bilibili.pegasus.holders;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.data.base.BasePegasusData;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/PullDownTipsHolder.class */
@StabilityInferred(parameters = 0)
public final class PullDownTipsHolder extends AbstractC5652d<fp0.o> {
    public PullDownTipsHolder(@NotNull View view) {
        super(view);
        view.setOnClickListener(new Va.g(this, view));
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: onBind */
    public final /* bridge */ /* synthetic */ void u0(PegasusHolderData pegasusHolderData) {
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    public final void onExposeEnd(int i7, @NotNull View view) {
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    public final void onExposeStart(int i7, @NotNull View view) {
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    public final /* bridge */ /* synthetic */ void onFirstExpose(PegasusHolderData pegasusHolderData, int i7) {
        y0((fp0.o) pegasusHolderData);
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    public final /* bridge */ /* synthetic */ void onRecoverFirstExpose(PegasusHolderData pegasusHolderData, int i7) {
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    public final /* bridge */ /* synthetic */ void u0(BasePegasusData basePegasusData) {
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: v0 */
    public final /* bridge */ /* synthetic */ void onFirstExpose(BasePegasusData basePegasusData, int i7) {
        y0((fp0.o) basePegasusData);
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: w0 */
    public final /* bridge */ /* synthetic */ void onRecoverFirstExpose(BasePegasusData basePegasusData, int i7) {
    }

    public final void y0(@NotNull fp0.o oVar) {
        if (oVar.f118900B.isExposed()) {
            return;
        }
        Neurons.reportExposure$default(false, "tm.recommend.refresh-bar.0.show", MapsKt.hashMapOf(new Pair[]{TuplesKt.to("refresh_type", "1")}), (List) null, 8, (Object) null);
    }
}
