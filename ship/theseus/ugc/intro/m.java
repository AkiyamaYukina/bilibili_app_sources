package com.bilibili.ship.theseus.ugc.intro;

import com.bapis.bilibili.app.viewunite.common.ActivityIFrame;
import com.bilibili.ship.theseus.ugc.intro.iframe.UgcIntroIframeService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/m.class */
public final /* synthetic */ class m implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UgcIntroIframeService f97078a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        ActivityIFrame activityIframe = mVar.f124400a.getActivityIframe();
        mVar.a(this.f97078a.a(new com.bilibili.ship.theseus.ugc.intro.iframe.a(activityIframe.getUrl(), activityIframe.getAspectRatio())));
    }
}
