package com.bilibili.ship.theseus.ogv.intro.section.service;

import androidx.collection.ArrayMap;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/b.class */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvPreviewSectionMergedUIComponentService f93780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EpisodeSection f93781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93782c;

    public /* synthetic */ b(OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, EpisodeSection episodeSection, int i7) {
        this.f93780a = ogvPreviewSectionMergedUIComponentService;
        this.f93781b = episodeSection;
        this.f93782c = i7;
    }

    public final Object invoke() {
        OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService = this.f93780a;
        MutableStateFlow<EpisodeSection> mutableStateFlow = ogvPreviewSectionMergedUIComponentService.f93758l;
        EpisodeSection episodeSection = this.f93781b;
        mutableStateFlow.setValue(episodeSection);
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("card_order", String.valueOf(this.f93782c + 1));
        Map<String, String> map = episodeSection.f93532k;
        if (map != null) {
            arrayMap.putAll(map);
        }
        PageReportService.g(ogvPreviewSectionMergedUIComponentService.h, "united.player-video-detail.aggtabs.0.click", arrayMap, 4);
        return Unit.INSTANCE;
    }
}
