package com.bilibili.ogv.kmm.operation.vippreview;

import kntr.base.router.Router;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mk0.C8008d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/c.class */
public final class c implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Router f68927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VipOfflinePreviewActiveCard f68928b;

    public c(Router router, VipOfflinePreviewActiveCard vipOfflinePreviewActiveCard) {
        this.f68927a = router;
        this.f68928b = vipOfflinePreviewActiveCard;
    }

    public final Object invoke() {
        C8008d.a(this.f68928b.f68882a.f68904d, this.f68927a);
        return Unit.INSTANCE;
    }
}
