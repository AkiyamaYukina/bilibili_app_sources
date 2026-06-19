package com.bilibili.ship.theseus.ugc.intro.upguardian;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/h.class */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpGuardianService f97624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97625b;

    public /* synthetic */ h(UpGuardianService upGuardianService, int i7) {
        this.f97624a = upGuardianService;
        this.f97625b = i7;
    }

    public final Object invoke() {
        this.f97624a.d(this.f97625b, "2");
        return Unit.INSTANCE;
    }
}
