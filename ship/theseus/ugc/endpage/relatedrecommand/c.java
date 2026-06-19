package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand;

import com.bilibili.app.gemini.ugc.feature.o;
import com.tencent.connect.common.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/c.class */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f96855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UGCEndPageRelatedComponentsTransformer f96856c;

    public /* synthetic */ c(int i7, o oVar, UGCEndPageRelatedComponentsTransformer uGCEndPageRelatedComponentsTransformer) {
        this.f96854a = i7;
        this.f96855b = oVar;
        this.f96856c = uGCEndPageRelatedComponentsTransformer;
    }

    public final Object invoke(Object obj) {
        o oVar = (o) obj;
        UGCEndPageRelatedComponentsTransformer uGCEndPageRelatedComponentsTransformer = this.f96856c;
        IReporterService reporterService = uGCEndPageRelatedComponentsTransformer.f96797d.getReporterService();
        b.a(this.f96854a, this.f96855b, reporterService, uGCEndPageRelatedComponentsTransformer.f96798e, uGCEndPageRelatedComponentsTransformer.f96799f);
        long j7 = oVar.m;
        String str = oVar.j;
        com.bilibili.ship.theseus.ugc.c.a(uGCEndPageRelatedComponentsTransformer.f96795b, j7, -1L, oVar.l, Constants.VIA_REPORT_TYPE_QQFAVORITES, str, 0, false, 64);
        return Unit.INSTANCE;
    }
}
