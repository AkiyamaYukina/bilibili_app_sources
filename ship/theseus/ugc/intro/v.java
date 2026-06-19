package com.bilibili.ship.theseus.ugc.intro;

import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesService;
import com.bilibili.ship.theseus.ugc.intro.uplikes.UserList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/v.class */
public final /* synthetic */ class v implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UgcUpLikesService f97838a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        mVar.a(this.f97838a.b((UserList) JsonUtilKt.parseJson(Pj0.e.a(mVar.f124400a.getList()), new w().getType())));
    }
}
