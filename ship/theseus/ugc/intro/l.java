package com.bilibili.ship.theseus.ugc.intro;

import com.bapis.bilibili.app.viewunite.common.LiveOrder;
import com.bapis.bilibili.app.viewunite.common.ReserveCalendarInfo;
import com.bilibili.ship.theseus.united.page.intro.module.liveorder.DetailReserveService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/l.class */
public final /* synthetic */ class l implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DetailReserveService f97077a;

    /* JADX WARN: Type inference failed for: r0v23, types: [com.bilibili.ship.theseus.united.page.intro.module.liveorder.l, java.lang.Object] */
    @Override // nv0.h
    public final void a(nv0.m mVar) {
        LiveOrder liveOrder = mVar.f124400a.getLiveOrder();
        long sid = liveOrder.getSid();
        String text = liveOrder.getText();
        String business = liveOrder.getBusiness();
        boolean isFollow = liveOrder.getIsFollow();
        ReserveCalendarInfo reserveCalendarInfo = liveOrder.getReserveCalendarInfo();
        String title = reserveCalendarInfo.getTitle();
        long startTs = reserveCalendarInfo.getStartTs();
        long endTs = reserveCalendarInfo.getEndTs();
        String description = reserveCalendarInfo.getDescription();
        String businessId = reserveCalendarInfo.getBusinessId();
        ?? obj = new Object();
        obj.f100539a = title;
        obj.f100540b = startTs;
        obj.f100541c = endTs;
        obj.f100542d = description;
        obj.f100543e = businessId;
        mVar.a(this.f97077a.f(new com.bilibili.ship.theseus.united.page.intro.module.liveorder.f(sid, text, business, isFollow, obj)));
    }
}
