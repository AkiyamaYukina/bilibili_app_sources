package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.common.PugvActivityModel;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceTheme;
import com.bilibili.ship.theseus.cheese.biz.intro.attendance.w;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/a0.class */
public final /* synthetic */ class a0 implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.cheese.biz.intro.attendance.l f90394a;

    /* JADX WARN: Type inference failed for: r0v61, types: [com.bilibili.ship.theseus.cheese.biz.intro.attendance.j] */
    @Override // nv0.h
    public final void a(nv0.m mVar) {
        Object next;
        PugvActivityModel pugvActivityModel = mVar.f124400a.getPugvActivityInfo().getPugvActivityModel();
        String activityName = pugvActivityModel.getActivityName();
        String describe = pugvActivityModel.getDescribe();
        String cycleDescribe = pugvActivityModel.getCycleDescribe();
        String avatar = pugvActivityModel.getAvatar();
        if (avatar == null) {
            avatar = "";
        }
        String progressMessage = pugvActivityModel.getProgressMessage();
        if (progressMessage == null) {
            progressMessage = "";
        }
        String activityUrl = pugvActivityModel.getActivityUrl();
        if (activityUrl == null) {
            activityUrl = "";
        }
        boolean bought = pugvActivityModel.getBought();
        String activityImg = pugvActivityModel.getActivityImg();
        if (activityImg == null) {
            activityImg = "";
        }
        CheeseAttendanceTheme.a aVar = CheeseAttendanceTheme.Companion;
        int theme = pugvActivityModel.getTheme();
        aVar.getClass();
        Iterator it = CheeseAttendanceTheme.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((CheeseAttendanceTheme) next).getValue() == theme) {
                    break;
                }
            }
        }
        CheeseAttendanceTheme cheeseAttendanceTheme = (CheeseAttendanceTheme) next;
        CheeseAttendanceTheme cheeseAttendanceTheme2 = cheeseAttendanceTheme;
        if (cheeseAttendanceTheme == null) {
            cheeseAttendanceTheme2 = CheeseAttendanceTheme.DARK;
        }
        com.bilibili.ship.theseus.cheese.biz.intro.attendance.h hVar = new com.bilibili.ship.theseus.cheese.biz.intro.attendance.h(activityName, describe, cycleDescribe, avatar, progressMessage, activityUrl, bought, activityImg, cheeseAttendanceTheme2, pugvActivityModel.getActivityId(), pugvActivityModel.getCurrentProgress());
        com.bilibili.ship.theseus.cheese.biz.intro.attendance.l lVar = this.f90394a;
        com.bilibili.ship.theseus.cheese.biz.intro.attendance.i iVar = lVar.f89324c;
        iVar.f89319a.setValue(hVar);
        BLog.i("CheeseAttendanceService-createAttendance", "[theseus-cheese-CheeseAttendanceService-createAttendance] " + ("setAttendanceData: " + hVar));
        IntroContentSizeRepository introContentSizeRepository = lVar.f89331k;
        mVar.a(new RunningUIComponent(new com.bilibili.ship.theseus.cheese.biz.intro.attendance.a(iVar.f89320b, introContentSizeRepository.f100021b, introContentSizeRepository.f100022c, lVar.f89330j.f102939c, new Function1(lVar) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.attendance.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final l f89321a;

            {
                this.f89321a = lVar;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                w wVar = (w) obj;
                w.c cVar = w.c.f89352b;
                boolean zAreEqual = Intrinsics.areEqual(wVar, cVar);
                l lVar2 = this.f89321a;
                String str = "pugv.detail.activity.share.click";
                if (zAreEqual) {
                    lVar2.getClass();
                    BuildersKt.launch$default(lVar2.f89323b, (CoroutineContext) null, (CoroutineStart) null, new CheeseAttendanceService$share$1(lVar2, "pugv.detail.activity.share.click", null), 3, (Object) null);
                } else {
                    String str2 = wVar.f89349a;
                    if (!lVar2.h.isLogin()) {
                        com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
                    } else if (str2 != null && str2.length() != 0) {
                        BuildersKt.launch$default(lVar2.f89323b, (CoroutineContext) null, (CoroutineStart) null, new CheeseAttendanceService$showAttendanceActivityPanel$1(lVar2, str2, null), 3, (Object) null);
                    }
                }
                lVar2.getClass();
                if (!Intrinsics.areEqual(wVar, cVar)) {
                    if (wVar instanceof w.b) {
                        str = "pugv.detail.activity.url.click";
                    } else {
                        if (!(wVar instanceof w.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "pugv.detail.activity.url-bonus.click";
                    }
                }
                PageReportService.g(lVar2.f89325d, str, lVar2.f89324c.a(), 4);
                return Unit.INSTANCE;
            }
        }, new XR0.b(lVar, 4)), 0, (Function1) null, 6));
    }
}
