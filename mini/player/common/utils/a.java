package com.bilibili.mini.player.common.utils;

import Rf0.f;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/utils/a.class */
public final class a implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66089a;

    public a(String str) {
        this.f66089a = str;
    }

    @Override // Rf0.f.a
    public final void onNegativeClick() {
        Neurons.reportClick(false, "app.miniplayer.permission-floating-window.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("option", "0"), TuplesKt.to("spmid", this.f66089a)}));
    }

    @Override // Rf0.f.a
    public final void onPositiveClick() {
        Neurons.reportClick(false, "app.miniplayer.permission-floating-window.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("option", "1"), TuplesKt.to("spmid", this.f66089a)}));
    }

    @Override // Rf0.f.a
    public final void onShow() {
        Neurons.reportExposure$default(false, "app.miniplayer.permission-floating-window.0.show", MapsKt.mapOf(TuplesKt.to("spmid", this.f66089a)), (List) null, 8, (Object) null);
    }
}
