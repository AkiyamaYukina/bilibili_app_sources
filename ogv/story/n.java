package com.bilibili.ogv.story;

import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformEpisode;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.story.h;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function5;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/n.class */
public final class n implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f73096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function5<Long, Long, Integer, Long, Long, Unit> f73097b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(o oVar, Function5<? super Long, ? super Long, ? super Integer, ? super Long, ? super Long, Unit> function5) {
        this.f73096a = oVar;
        this.f73097b = function5;
    }

    @Override // com.bilibili.ogv.story.h.a
    public final void a(BangumiUniformEpisode bangumiUniformEpisode, int i7) {
        o oVar = this.f73096a;
        HashMap<String, String> mapF = oVar.f();
        mapF.put("select_content_id", String.valueOf(bangumiUniformEpisode.a()));
        Map<? extends String, ? extends String> map = bangumiUniformEpisode.v;
        Map<? extends String, ? extends String> mapEmptyMap = map;
        if (map == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        mapF.putAll(mapEmptyMap);
        mapF.put("position", String.valueOf(i7 + 1));
        Neurons.reportClick(false, "main.ugc-video-detail-vertical.content-select-panel.0.click", mapF);
        this.f73097b.invoke(Long.valueOf(bangumiUniformEpisode.f), Long.valueOf(bangumiUniformEpisode.g), Integer.valueOf(i7), Long.valueOf(oVar.f73100c), Long.valueOf(bangumiUniformEpisode.a()));
    }
}
