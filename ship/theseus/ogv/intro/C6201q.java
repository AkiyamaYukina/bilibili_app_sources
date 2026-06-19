package com.bilibili.ship.theseus.ogv.intro;

import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ogv.intro.reservereminder.OgvReserveReminderUIComponentService;
import com.bilibili.ship.theseus.ogv.intro.reservereminder.OgvReserveReminderVo;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/q.class */
public final /* synthetic */ class C6201q implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvReserveReminderUIComponentService f93377a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        OgvReserveReminderVo ogvReserveReminderVo = (OgvReserveReminderVo) JsonUtilKt.parseJson(Pj0.e.a(mVar.f124400a.getOgvReserveReminder()), new A().getType());
        if (ogvReserveReminderVo.f93396d == null) {
            return;
        }
        mVar.a(this.f93377a.d(ogvReserveReminderVo));
    }
}
