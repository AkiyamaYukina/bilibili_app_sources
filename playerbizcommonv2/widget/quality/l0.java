package com.bilibili.playerbizcommonv2.widget.quality;

import java.util.Map;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/l0.class */
public final /* synthetic */ class l0 {
    public static void a(String str, Map map, IReporterService iReporterService) {
        iReporterService.report(new NeuronsEvents.b(str, map));
    }
}
