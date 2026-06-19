package com.bilibili.pegasus.channelv3.movie.video;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/video/e.class */
public final class e {
    @NotNull
    public static final HashMap<String, String> a(@NotNull f fVar) {
        return MapsKt.hashMapOf(new Pair[]{TuplesKt.to("channel_id", String.valueOf(fVar.f75500b)), TuplesKt.to("from", fVar.f75501c), TuplesKt.to("page_entity_id", fVar.f75503e), TuplesKt.to("page_entity_name", fVar.f75502d)});
    }
}
