package com.bilibili.ship.theseus.ugc.intro;

import com.bapis.bilibili.app.viewunite.common.Covenanter;
import com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/p.class */
public final /* synthetic */ class p implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpGuardianService f97113a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        Covenanter covenanter = mVar.f124400a.getCovenanter();
        boolean z6 = false;
        boolean z7 = covenanter.getIsFollowDisplay() == 1;
        if (covenanter.getIsInteractDisplay() == 1) {
            z6 = true;
        }
        mVar.a(this.f97113a.c(new com.bilibili.ship.theseus.ugc.intro.upguardian.e(covenanter.getText().getTitle(), covenanter.getText().getSubtitle(), z7, z6)));
    }
}
