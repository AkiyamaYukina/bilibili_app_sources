package com.bilibili.ship.theseus.ugc.intro.upguardian;

import com.bilibili.app.screen.adjust.widget.z;
import com.bilibili.upguardian.sign.UpGuardianSignView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/k.class */
public final class k implements UpGuardianSignView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f97633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UpGuardianSignView f97634b;

    public k(j jVar, UpGuardianSignView upGuardianSignView) {
        this.f97633a = jVar;
        this.f97634b = upGuardianSignView;
    }

    public final void a() {
        z.a(this.f97634b);
    }

    public final void b() {
        this.f97633a.f97629d.invoke();
    }

    public final void c() {
        z.a(this.f97634b);
    }
}
