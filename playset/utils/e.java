package com.bilibili.playset.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pvtracker.PageViewTracker;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/utils/e.class */
@StabilityInferred(parameters = 1)
public final class e {
    public static void a(@NotNull com.bilibili.playset.api.c cVar, long j7, long j8, @NotNull String str, @NotNull String str2) {
        Pair pair = TuplesKt.to("flow", str);
        Pair pair2 = TuplesKt.to("oid", String.valueOf(j7));
        Pair pair3 = TuplesKt.to("playlist_id", String.valueOf(j8));
        Pair pair4 = TuplesKt.to("state", str2);
        Pair pair5 = TuplesKt.to("is_valid", cVar.y() ? "1" : "0");
        String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
        String str3 = strCurrentPolarisActionId;
        if (strCurrentPolarisActionId == null) {
            str3 = "";
        }
        Neurons.reportClick(false, "playlist.playlist-detail.detailpage-contentlist.0.click", MapsKt.mapOf(new Pair[]{pair, pair2, pair3, pair4, pair5, TuplesKt.to("action_id", str3), TuplesKt.to("fav_type", String.valueOf(cVar.l()))}));
    }
}
