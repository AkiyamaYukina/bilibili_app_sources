package com.bilibili.pegasus.channelv3.movie.relation;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/relation/c.class */
public final class c {
    @NotNull
    public static final HashMap<String, String> a(@NotNull e eVar) {
        return MapsKt.hashMapOf(new Pair[]{TuplesKt.to("channel_id", String.valueOf(eVar.f75470d)), TuplesKt.to("from", eVar.f75471e), TuplesKt.to("page_entity_id", eVar.f75473g), TuplesKt.to("page_entity_name", eVar.f75472f), TuplesKt.to("tab_name", eVar.h)});
    }
}
