package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.widget.TextView;
import zh1.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/z.class */
public final class z extends a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UgcIntroductionComponent f97400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f97401b;

    public z(UgcIntroductionComponent ugcIntroductionComponent, TextView textView) {
        this.f97400a = ugcIntroductionComponent;
        this.f97401b = textView;
    }

    public final void b() {
        this.f97400a.f97271a.c(this.f97401b.getText().toString(), true);
    }
}
