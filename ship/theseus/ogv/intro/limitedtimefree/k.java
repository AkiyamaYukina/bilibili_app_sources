package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import com.bilibili.ship.theseus.ogv.activity.ActivityDialogActionType;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import xl0.C8986a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/k.class */
public final class k implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvLimitedTimeFreeTicketsInfo f93257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f93258b;

    public k(l lVar, OgvLimitedTimeFreeTicketsInfo ogvLimitedTimeFreeTicketsInfo) {
        this.f93257a = ogvLimitedTimeFreeTicketsInfo;
        this.f93258b = lVar;
    }

    public final Object invoke() {
        OgvLimitedTimeFreeTicketsInfo ogvLimitedTimeFreeTicketsInfo = this.f93257a;
        boolean zA = ogvLimitedTimeFreeTicketsInfo.a();
        l lVar = this.f93258b;
        if (!zA || com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
            String str = ogvLimitedTimeFreeTicketsInfo.f93240j.f91354d;
            ActivityDialogActionType activityDialogActionType = ActivityDialogActionType.EXEC;
            lVar.getClass();
            BuildersKt.launch$default(lVar.f93259a, (CoroutineContext) null, (CoroutineStart) null, new CreateOgvLimitedTimeFreeTicketsComponent$reportAction$1(lVar, ogvLimitedTimeFreeTicketsInfo.f93232a, str, activityDialogActionType, null), 3, (Object) null);
            PageReportService.g(lVar.f93260b, "united.player-video-detail.middle-leadtab.0.click", ogvLimitedTimeFreeTicketsInfo.f93241k, 4);
        } else {
            Qj0.g.e(lVar.f93263e, C8986a.a());
        }
        return Unit.INSTANCE;
    }
}
