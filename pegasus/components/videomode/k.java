package com.bilibili.pegasus.components.videomode;

import Lh.r;
import com.bilibili.lib.neuron.api.Neurons;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/k.class */
public final class k {
    public static final void a(@NotNull VideoModeGuideClickArea videoModeGuideClickArea, int i7) {
        Neurons.reportClick(false, "tm.recommend.play-mode-guidance.0.click", MapsKt.hashMapOf(new Pair[]{TuplesKt.to("click_area", videoModeGuideClickArea.getArea()), TuplesKt.to("trigger_type", String.valueOf(i7)), TuplesKt.to("tm_card_play_state", String.valueOf(r.b()))}));
    }
}
