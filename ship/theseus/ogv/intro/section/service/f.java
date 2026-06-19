package com.bilibili.ship.theseus.ogv.intro.section.service;

import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import cv0.C6762e;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/f.class */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f93791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f93792c;

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.f93790a = i7;
        this.f93791b = obj;
        this.f93792c = obj2;
    }

    public final Object invoke() {
        switch (this.f93790a) {
            case 0:
                h hVar = (h) this.f93791b;
                Gu0.a aVar = hVar.f93796b;
                OgvSeason ogvSeason = hVar.f93797c;
                long j7 = ogvSeason.f94449a;
                aVar.getClass();
                boolean zO = Gu0.a.o(j7);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("click_status", zO ? "0" : "1");
                Map<String, String> map = ((Hu0.b) this.f93792c).f8792b.f93532k;
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                PageReportService.g(hVar.f93798d, "united.player-video-detail.episode.reverse.click", linkedHashMap, 4);
                Gu0.a aVar2 = hVar.f93796b;
                aVar2.getClass();
                aVar2.p(ogvSeason.f94449a, !Gu0.a.o(r0));
                break;
            case 1:
                Exception exc = (Exception) this.f93792c;
                Function1 function1 = (Function1) this.f93791b;
                if (function1 != null) {
                    function1.invoke(exc);
                }
                break;
            default:
                ((C6762e) this.f93791b).a(null);
                ((MutableStateFlow) this.f93792c).setValue(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
