package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ship.theseus.united.page.intro.module.guidestrip.GuideStripUIComponentService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/g.class */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GuideStripUIComponentService f100140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GuideStripVo f100141b;

    public /* synthetic */ g(GuideStripUIComponentService guideStripUIComponentService, GuideStripVo guideStripVo) {
        this.f100140a = guideStripUIComponentService;
        this.f100141b = guideStripVo;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke() throws NoWhenBranchMatchedException {
        ProfessionPopup professionPopup;
        GuideStripVo guideStripVo = this.f100141b;
        Map<String, String> mapB = guideStripVo.b();
        GuideStripUIComponentService guideStripUIComponentService = this.f100140a;
        guideStripUIComponentService.getClass();
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("position", "1")});
        mapMutableMapOf.putAll(mapB);
        Unit unit = Unit.INSTANCE;
        PageReportService.g(guideStripUIComponentService.f100070b, "united.player-video-detail.banner.0.click", mapMutableMapOf, 4);
        int i7 = GuideStripUIComponentService.a.f100077a[guideStripVo.f100089l.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                BLRouter.routeTo(new RouteRequest.Builder(guideStripVo.f100087j).build(), guideStripUIComponentService.f100069a);
            } else if (i7 == 3) {
                BuildersKt.launch$default(guideStripUIComponentService.f100076i, (CoroutineContext) null, (CoroutineStart) null, new GuideStripUIComponentService$create$vm$2$1(guideStripUIComponentService, guideStripVo, null), 3, (Object) null);
            } else {
                if (i7 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                ProfessionHonorExtend professionHonorExtend = guideStripVo.f100092o;
                if (professionHonorExtend != null && (professionPopup = professionHonorExtend.f100096c) != null) {
                    BuildersKt.launch$default(guideStripUIComponentService.f100076i, (CoroutineContext) null, (CoroutineStart) null, new GuideStripUIComponentService$showExplanationPopup$1$1(guideStripUIComponentService, professionPopup, null), 3, (Object) null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
