package com.bilibili.ship.theseus.ogv.intro.headline;

import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/e.class */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvHeadlineData f93127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreateOgvHeadlineComponent f93128b;

    public /* synthetic */ e(CreateOgvHeadlineComponent createOgvHeadlineComponent, OgvHeadlineData ogvHeadlineData) {
        this.f93127a = ogvHeadlineData;
        this.f93128b = createOgvHeadlineComponent;
    }

    public final Object invoke() {
        DeliveryButton deliveryButtonA = this.f93127a.a();
        if (deliveryButtonA != null) {
            CreateOgvHeadlineComponent createOgvHeadlineComponent = this.f93128b;
            PageReportService.g(createOgvHeadlineComponent.f93098f, "united.player-video-detail.newchenbao.button.click", deliveryButtonA.f93106d, 4);
            BuildersKt.launch$default(createOgvHeadlineComponent.f93093a, (CoroutineContext) null, (CoroutineStart) null, new CreateOgvHeadlineComponent$invoke$headlineVm$5$1$1(createOgvHeadlineComponent, deliveryButtonA, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
