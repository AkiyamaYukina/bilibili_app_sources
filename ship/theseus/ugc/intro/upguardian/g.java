package com.bilibili.ship.theseus.ugc.intro.upguardian;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/g.class */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpGuardianService f97622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97623b;

    public /* synthetic */ g(UpGuardianService upGuardianService, int i7) {
        this.f97622a = upGuardianService;
        this.f97623b = i7;
    }

    public final Object invoke() {
        UpGuardianService upGuardianService = this.f97622a;
        CoroutineScope coroutineScope = upGuardianService.f97580a;
        int i7 = this.f97623b;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UpGuardianService$createInternal$1$1(upGuardianService, i7, null), 3, (Object) null);
        upGuardianService.d(i7, "1");
        return Unit.INSTANCE;
    }
}
