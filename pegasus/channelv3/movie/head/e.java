package com.bilibili.pegasus.channelv3.movie.head;

import com.bilibili.lib.neuron.api.Neurons;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/e.class */
public final class e {
    public static final void a(@NotNull ChannelMovieHeadVM channelMovieHeadVM, @NotNull MovieButtonName movieButtonName, boolean z6) {
        HashMap<String, String> mapB = b(channelMovieHeadVM);
        mapB.put("button_name", movieButtonName.getBtName());
        if (movieButtonName != MovieButtonName.WATCH) {
            mapB.put("button_status", z6 ? "1" : "0");
        }
        Unit unit = Unit.INSTANCE;
        Neurons.reportClick(false, "traffic.movie-channel-detail.head-info.0.click", mapB);
    }

    @NotNull
    public static final HashMap<String, String> b(@NotNull ChannelMovieHeadVM channelMovieHeadVM) {
        return MapsKt.hashMapOf(new Pair[]{TuplesKt.to("channel_id", String.valueOf(channelMovieHeadVM.f75384f.f75449a)), TuplesKt.to("page_entity_id", channelMovieHeadVM.f75382d.f75403d), TuplesKt.to("page_entity_name", channelMovieHeadVM.f75380b)});
    }
}
