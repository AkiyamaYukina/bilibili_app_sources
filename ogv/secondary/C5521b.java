package com.bilibili.ogv.secondary;

import kntr.base.router.Router;
import kntr.common.router.UrisKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.bilibili.ogv.secondary.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/b.class */
public final class C5521b implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Router f72659a;

    public C5521b(Router router) {
        this.f72659a = router;
    }

    public final Object invoke() {
        this.f72659a.launch(UrisKt.toUri("bilibili://search"));
        return Unit.INSTANCE;
    }
}
