package com.bilibili.ship.theseus.ugc.intro;

import com.bapis.bilibili.app.viewunite.common.Module;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/h.class */
public final /* synthetic */ class h implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.ugc.intro.videomentioned.module.n f97012a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        Module module = mVar.f124400a;
        if (module.hasVideoMentions()) {
            mVar.a(this.f97012a.a(com.bilibili.playerbizcommonv2.videomentioned.i.a(module.getVideoMentions()), module.getVideoMentions().getMentionsList()));
        }
    }
}
