package com.bilibili.ship.theseus.ogv.intro.headline;

import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/d.class */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreateOgvHeadlineComponent f93125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OgvHeadlineData f93126b;

    public /* synthetic */ d(CreateOgvHeadlineComponent createOgvHeadlineComponent, OgvHeadlineData ogvHeadlineData) {
        this.f93125a = createOgvHeadlineComponent;
        this.f93126b = ogvHeadlineData;
    }

    public final Object invoke(Object obj) {
        CreateOgvHeadlineComponent createOgvHeadlineComponent = this.f93125a;
        PageReportService pageReportService = createOgvHeadlineComponent.f93098f;
        long j7 = createOgvHeadlineComponent.f93097e.f94449a;
        com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
        com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(j7));
        com.bilibili.community.follow.b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN);
        }
        PageReportService.g(pageReportService, "united.player-video-detail.video-information-ogv.follow-bangumi.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("follow_status", Tj0.a.a(bVar2.a)), TuplesKt.to("button_type", Tj0.a.a(this.f93126b.c()))}), 4);
        BuildersKt.launch$default(createOgvHeadlineComponent.f93093a, (CoroutineContext) null, (CoroutineStart) null, new CreateOgvHeadlineComponent$invoke$headlineVm$4$1(createOgvHeadlineComponent, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
