package com.bilibili.ship.theseus.ugc;

import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ov0.InterfaceC8269a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/p.class */
public final class p implements InterfaceC8269a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebFloatLayerService f97986a;

    public p(WebFloatLayerService webFloatLayerService) {
        this.f97986a = webFloatLayerService;
    }

    @Override // ov0.InterfaceC8269a
    public final Object a(String str, SuspendLambda suspendLambda) {
        Object objF = WebFloatLayerService.f(this.f97986a, str, suspendLambda);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : Unit.INSTANCE;
    }
}
