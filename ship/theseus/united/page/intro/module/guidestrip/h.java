package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import com.bilibili.ship.theseus.united.page.intro.module.guidestrip.GuideStripUIComponentService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/h.class */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GuideStripVo f100142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GuideStripUIComponentService f100143b;

    public /* synthetic */ h(GuideStripUIComponentService guideStripUIComponentService, GuideStripVo guideStripVo) {
        this.f100142a = guideStripVo;
        this.f100143b = guideStripUIComponentService;
    }

    public final Object invoke() {
        GuideStripVo guideStripVo = this.f100142a;
        int i7 = GuideStripUIComponentService.a.f100078b[guideStripVo.f100088k.ordinal()];
        GuideStripUIComponentService guideStripUIComponentService = this.f100143b;
        if (i7 == 1) {
            guideStripUIComponentService.getClass();
            BuildersKt.launch$default(guideStripUIComponentService.f100076i, (CoroutineContext) null, (CoroutineStart) null, new GuideStripUIComponentService$showCancelApprovalPopup$1(guideStripUIComponentService, null), 3, (Object) null);
        }
        Map<String, String> mapB = guideStripVo.b();
        guideStripUIComponentService.getClass();
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("position", "2")});
        mapMutableMapOf.putAll(mapB);
        Unit unit = Unit.INSTANCE;
        PageReportService.g(guideStripUIComponentService.f100070b, "united.player-video-detail.banner.0.click", mapMutableMapOf, 4);
        return Unit.INSTANCE;
    }
}
