package com.bilibili.ship.theseus.ogv.intro;

import com.bapis.bilibili.app.viewunite.common.ActivityEntrance;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ogv.intro.activityentrance.OgvActivityEntranceUIComponentService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/l.class */
public final /* synthetic */ class C6196l implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvActivityEntranceUIComponentService f93222a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        List<ActivityEntrance> activityEntranceList = mVar.f124400a.getActivityEntranceModule().getActivityEntranceList();
        ArrayList arrayList = new ArrayList();
        for (ActivityEntrance activityEntrance : activityEntranceList) {
            com.bilibili.ship.theseus.ogv.intro.activityentrance.ActivityEntrance activityEntrance2 = activityEntrance.getActivityType() == 1 ? null : (com.bilibili.ship.theseus.ogv.intro.activityentrance.ActivityEntrance) JsonUtilKt.parseJson(Pj0.e.a(activityEntrance), new r().getType());
            if (activityEntrance2 != null) {
                arrayList.add(activityEntrance2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        mVar.a(this.f93222a.a(arrayList));
    }
}
