package com.bilibili.ship.theseus.ugc.intro;

import com.bapis.bilibili.app.viewunite.common.Headline;
import com.bapis.bilibili.app.viewunite.common.Label;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.C6266b;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/f.class */
public final /* synthetic */ class f implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UgcHeadlineService f97010a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        com.bilibili.ship.theseus.ugc.intro.ugcheadline.d dVar;
        Headline headLine = mVar.f124400a.getHeadLine();
        String content = headLine.getContent();
        if (headLine.hasLabel()) {
            Label label = headLine.getLabel();
            dVar = new com.bilibili.ship.theseus.ugc.intro.ugcheadline.d(label.getType(), label.getUri(), label.getIcon(), label.getIconNight(), label.getIconWidth(), label.getIconHeight(), label.getLottie(), label.getLottieNight(), label.getReportMap());
        } else {
            dVar = null;
        }
        mVar.a(this.f97010a.a(new C6266b(content, dVar)));
    }
}
