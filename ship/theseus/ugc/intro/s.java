package com.bilibili.ship.theseus.ugc.intro;

import com.bapis.bilibili.app.viewunite.common.ActivityReserve;
import com.bapis.bilibili.app.viewunite.common.BizReserveActivityParam;
import com.bapis.bilibili.app.viewunite.common.ReserveButton;
import com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.ReserveBizType;
import com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.UgcPartyInfoService;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/s.class */
public final /* synthetic */ class s implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UgcPartyInfoService f97181a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.g, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // nv0.h
    public final void a(nv0.m mVar) {
        ActivityReserve activityReserve = mVar.f124400a.getActivityReserve();
        String title = activityReserve.getTitle();
        StatInfoData statInfoDataB = com.bilibili.ship.theseus.united.page.view.b.b(activityReserve.getVt());
        StatInfoData statInfoDataB2 = com.bilibili.ship.theseus.united.page.view.b.b(activityReserve.getDanmaku());
        ReserveButton button = activityReserve.getButton();
        boolean status = button.getStatus();
        String text = button.getText();
        String selectedText = button.getSelectedText();
        int i7 = com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.h.f97441a[button.getOrderType().ordinal()];
        ReserveBizType reserveBizType = i7 != 1 ? i7 != 2 ? ReserveBizType.BizTypeNone : ReserveBizType.BizTypeFavSeason : ReserveBizType.BizTypeReserveActivity;
        BizReserveActivityParam reserve = button.getReserve();
        long activityId = reserve.getActivityId();
        String from = reserve.getFrom();
        String type = reserve.getType();
        long oid = reserve.getOid();
        long reserveId = reserve.getReserveId();
        ?? obj = new Object();
        obj.f97418a = activityId;
        obj.f97419b = from;
        obj.f97420c = type;
        obj.f97421d = oid;
        obj.f97422e = reserveId;
        long seasonId = button.getFav().getSeasonId();
        ?? obj2 = new Object();
        obj2.f97417a = seasonId;
        ?? obj3 = new Object();
        obj3.f97423a = status;
        obj3.f97424b = text;
        obj3.f97425c = selectedText;
        obj3.f97426d = reserveBizType;
        obj3.f97427e = obj;
        obj3.f97428f = obj2;
        String preTitle = activityReserve.getPreTitle();
        String epCountDesc = activityReserve.getEpCountDesc();
        ?? obj4 = new Object();
        obj4.f97435a = title;
        obj4.f97436b = statInfoDataB;
        obj4.f97437c = statInfoDataB2;
        obj4.f97438d = obj3;
        obj4.f97439e = preTitle;
        obj4.f97440f = epCountDesc;
        mVar.a(this.f97181a.a(obj4));
    }
}
