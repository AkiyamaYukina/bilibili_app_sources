package com.bilibili.ship.theseus.ugc.intro.mhy;

import com.bilibili.ship.theseus.ugc.intro.mhy.d;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.utils.q;
import ev0.InterfaceC7008a;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/UgcStarRailService$create$component$1.class */
public final /* synthetic */ class UgcStarRailService$create$component$1 extends FunctionReferenceImpl implements Function1<d.c, Unit> {
    final a $starRail;
    final UgcStarRailService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcStarRailService$create$component$1(a aVar, UgcStarRailService ugcStarRailService) {
        super(1, Intrinsics.Kotlin.class, "handleItemClick", "create$handleItemClick(Lcom/bilibili/ship/theseus/ugc/intro/mhy/ActivityStarRail;Lcom/bilibili/ship/theseus/ugc/intro/mhy/UgcStarRailService;Lcom/bilibili/ship/theseus/ugc/intro/mhy/UgcStarRailComponent$StarRail;)V", 0);
        this.$starRail = aVar;
        this.this$0 = ugcStarRailService;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((d.c) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(d.c cVar) {
        a aVar = this.$starRail;
        UgcStarRailService ugcStarRailService = this.this$0;
        b bVar = (b) CollectionsKt.getOrNull(aVar.f97083b, cVar.f97105a);
        if (bVar == null) {
            return;
        }
        int i7 = bVar.f97088e;
        if (i7 == 1) {
            BLog.i("UgcStarRailService-create$handleItemClick", "[theseus-ugc-UgcStarRailService-create$handleItemClick] StarRail.STATUS_SELECTED");
            return;
        }
        if (i7 != 2) {
            BLog.i("UgcStarRailService-create$handleItemClick", "[theseus-ugc-UgcStarRailService-create$handleItemClick] StarRail.STATUS_LOCK");
            q.b(2131848986);
        } else {
            BLog.i("UgcStarRailService-create$handleItemClick", "[theseus-ugc-UgcStarRailService-create$handleItemClick] StarRail.STATUS_UNLOCK");
            PageReportService.g(ugcStarRailService.f97079a, "united.player-video-detail.activity-module.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("goto_daid", String.valueOf(bVar.f97084a)), TuplesKt.to("goto_avid", String.valueOf(bVar.f97085b)), TuplesKt.to("button_position", String.valueOf(cVar.f97105a))}), 4);
            InterfaceC7008a.e((InterfaceC7008a) ugcStarRailService.f97080b.get(), bVar.f97085b, bVar.f97086c, null, "united.player-video-detail.activity-module.0", null, 0, null, false, 490);
        }
    }
}
