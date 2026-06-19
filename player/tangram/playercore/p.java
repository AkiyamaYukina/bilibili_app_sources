package com.bilibili.player.tangram.playercore;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/p.class */
public final class p implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PCSFacadeImpl f79452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f79453b;

    public p(PCSFacadeImpl pCSFacadeImpl, q qVar) {
        this.f79452a = pCSFacadeImpl;
        this.f79453b = qVar;
    }

    public final Object invoke(Object obj) {
        this.f79452a.f79384a.removePlayerSourceObserver(this.f79453b);
        return Unit.INSTANCE;
    }
}
