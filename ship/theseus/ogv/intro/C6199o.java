package com.bilibili.ship.theseus.ogv.intro;

import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ogv.intro.sponsor.IntroSponsorService;
import com.bilibili.ship.theseus.ogv.pay.sponsor.BangumiSponsorRankSummary;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/o.class */
public final /* synthetic */ class C6199o implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntroSponsorService f93331a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        mVar.a(this.f93331a.a((BangumiSponsorRankSummary) JsonUtilKt.parseJson(Pj0.e.a(mVar.f124400a.getSponsor()), new C().getType())));
    }
}
