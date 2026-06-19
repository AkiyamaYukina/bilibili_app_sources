package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.ui.Modifier;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ComposeExposureLayoutInfoCollectorKt;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/h.class */
public final class C6383h implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExposureEntry f102740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReportVo f102741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C6384i f102742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f102743d;

    public C6383h(ReportVo reportVo, final C6384i c6384i, final s sVar) {
        final String str;
        this.f102741b = reportVo;
        this.f102742c = c6384i;
        this.f102743d = sVar;
        ExposureEntry exposureEntry = (reportVo == null || (str = (String) com.bilibili.ogv.infra.util.i.a(reportVo.d())) == null) ? null : new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new Function0(this, c6384i, str, sVar) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C6383h f102736a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C6384i f102737b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f102738c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final s f102739d;

            {
                this.f102736a = this;
                this.f102737b = c6384i;
                this.f102738c = str;
                this.f102739d = sVar;
            }

            public final Object invoke() {
                Map<String, String> mapC;
                C6383h c6383h = this.f102736a;
                c6383h.getClass();
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                ReportVo reportVo2 = c6383h.f102741b;
                if (reportVo2 != null && (mapC = reportVo2.c()) != null) {
                    mapCreateMapBuilder.putAll(mapC);
                }
                Function1<Map<String, String>, Unit> function1 = c6383h.f102742c.f102747d;
                if (function1 != null) {
                    function1.invoke(mapCreateMapBuilder);
                }
                Map mapBuild = MapsKt.build(mapCreateMapBuilder);
                C6384i c6384i2 = this.f102737b;
                PageReportService pageReportService = c6384i2.f102744a;
                String str2 = this.f102738c;
                PageReportService.i(pageReportService, str2, mapBuild, 4);
                s sVar2 = this.f102739d;
                if (sVar2 instanceof q) {
                    TaskParamVo taskParamVoA = ((q) sVar2).a();
                    Map<String, String> mapA = taskParamVoA != null ? taskParamVoA.a() : null;
                    Map<String, String> mapEmptyMap = mapA;
                    if (mapA == null) {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    c6384i2.f102746c.a(str2, null, MapsKt.plus(mapBuild, mapEmptyMap));
                }
                return Unit.INSTANCE;
            }
        });
        this.f102740a = exposureEntry;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.x
    public final Modifier a(Modifier modifier) {
        ExposureEntry exposureEntry = this.f102740a;
        Modifier modifierCollectExposureLayoutInfo = modifier;
        if (exposureEntry != null) {
            modifierCollectExposureLayoutInfo = ComposeExposureLayoutInfoCollectorKt.collectExposureLayoutInfo(modifier, exposureEntry);
        }
        final s sVar = this.f102743d;
        Modifier modifierM1186clickableoSLSa3U$default = modifierCollectExposureLayoutInfo;
        if (sVar != null) {
            final C6384i c6384i = this.f102742c;
            final ReportVo reportVo = this.f102741b;
            modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(modifierCollectExposureLayoutInfo, false, null, null, null, new Function0(sVar, c6384i, reportVo, this) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final s f102732a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C6384i f102733b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final ReportVo f102734c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final C6383h f102735d;

                {
                    this.f102732a = sVar;
                    this.f102733b = c6384i;
                    this.f102734c = reportVo;
                    this.f102735d = this;
                }

                public final Object invoke() {
                    String str;
                    Unit unit;
                    Map<String, String> mapC;
                    C6384i c6384i2 = this.f102733b;
                    Function1<s, s> function1 = c6384i2.f102748e;
                    s sVar2 = this.f102732a;
                    s sVar3 = sVar2;
                    if (function1 != null) {
                        sVar3 = (s) function1.invoke(sVar2);
                    }
                    c6384i2.f102745b.a(sVar3);
                    ReportVo reportVo2 = this.f102734c;
                    if (reportVo2 == null || (str = (String) com.bilibili.ogv.infra.util.i.a(reportVo2.b())) == null) {
                        unit = Unit.INSTANCE;
                    } else {
                        C6383h c6383h = this.f102735d;
                        c6383h.getClass();
                        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                        ReportVo reportVo3 = c6383h.f102741b;
                        if (reportVo3 != null && (mapC = reportVo3.c()) != null) {
                            mapCreateMapBuilder.putAll(mapC);
                        }
                        Function1<Map<String, String>, Unit> function12 = c6383h.f102742c.f102747d;
                        if (function12 != null) {
                            function12.invoke(mapCreateMapBuilder);
                        }
                        Map mapBuild = MapsKt.build(mapCreateMapBuilder);
                        PageReportService.g(c6384i2.f102744a, str, mapBuild, 4);
                        if (sVar3 instanceof q) {
                            TaskParamVo taskParamVoA = ((q) sVar3).a();
                            Map<String, String> mapA = taskParamVoA != null ? taskParamVoA.a() : null;
                            Map<String, String> mapEmptyMap = mapA;
                            if (mapA == null) {
                                mapEmptyMap = MapsKt.emptyMap();
                            }
                            c6384i2.f102746c.a(str, null, MapsKt.plus(mapBuild, mapEmptyMap));
                        }
                        unit = Unit.INSTANCE;
                    }
                    return unit;
                }
            }, 15, null);
        }
        return modifierM1186clickableoSLSa3U$default;
    }
}
