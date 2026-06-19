package com.bilibili.ship.theseus.ogv.intro;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ogv.activity.ActivityDialogActionType;
import com.bilibili.ship.theseus.ogv.intro.limitedtimefree.OgvLimitedTimeFreeTicketsInfo;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/e.class */
public final /* synthetic */ class C6187e implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.ogv.intro.limitedtimefree.l f92660a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        final OgvLimitedTimeFreeTicketsInfo ogvLimitedTimeFreeTicketsInfo = (OgvLimitedTimeFreeTicketsInfo) JsonUtilKt.parseJson(Pj0.e.a(mVar.f124400a.getActivityGuidanceBar()), new x().getType());
        final com.bilibili.ship.theseus.ogv.intro.limitedtimefree.l lVar = this.f92660a;
        lVar.getClass();
        mVar.a(new RunningUIComponent(new com.bilibili.ship.theseus.ogv.intro.limitedtimefree.j(ThemeStrategy.FollowApp, lVar, ogvLimitedTimeFreeTicketsInfo, new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new Function0(lVar, ogvLimitedTimeFreeTicketsInfo) { // from class: com.bilibili.ship.theseus.ogv.intro.limitedtimefree.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final l f93252a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final OgvLimitedTimeFreeTicketsInfo f93253b;

            {
                this.f93252a = lVar;
                this.f93253b = ogvLimitedTimeFreeTicketsInfo;
            }

            public final Object invoke() {
                OgvLimitedTimeFreeTicketsInfo ogvLimitedTimeFreeTicketsInfo2 = this.f93253b;
                String str = ogvLimitedTimeFreeTicketsInfo2.f93232a;
                ActivityDialogActionType activityDialogActionType = ActivityDialogActionType.EXPOSURE;
                l lVar2 = this.f93252a;
                lVar2.getClass();
                BuildersKt.launch$default(lVar2.f93259a, (CoroutineContext) null, (CoroutineStart) null, new CreateOgvLimitedTimeFreeTicketsComponent$reportAction$1(lVar2, str, null, activityDialogActionType, null), 3, (Object) null);
                PageReportService.i(lVar2.f93260b, "united.player-video-detail.middle-leadtab.0.show", ogvLimitedTimeFreeTicketsInfo2.f93241k, 4);
                return Unit.INSTANCE;
            }
        })), 0, (Function1) null, 6));
    }
}
