package com.bilibili.ship.theseus.ogv.intro;

import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ogv.intro.headline.CreateOgvHeadlineComponent;
import com.bilibili.ship.theseus.ogv.intro.headline.OgvHeadlineData;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/p.class */
public final /* synthetic */ class C6200p implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreateOgvHeadlineComponent f93332a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        mVar.a(this.f93332a.c((OgvHeadlineData) JsonUtilKt.parseJson(Pj0.e.a(mVar.f124400a.getOgvTitle()), new C6205v().getType())));
    }
}
