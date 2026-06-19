package com.bilibili.ship.theseus.ogv.intro;

import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ogv.intro.followup.OgvGuideOfFollowUpperData;
import com.bilibili.ship.theseus.ogv.intro.followup.OgvGuideOfFollowUpperService;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/j.class */
public final /* synthetic */ class C6194j implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvGuideOfFollowUpperService f93182a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        mVar.a(this.f93182a.a((OgvGuideOfFollowUpperData) JsonUtilKt.parseJson(Pj0.e.a(mVar.f124400a.getFollowLayer()), new C6204u().getType())));
    }
}
