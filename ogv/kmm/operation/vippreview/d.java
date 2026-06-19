package com.bilibili.ogv.kmm.operation.vippreview;

import com.bilibili.ogv.kmm.operation.vippreview.VipOfflinePreviewActiveCard;
import kntr.base.router.Router;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mk0.C8008d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/d.class */
public final class d implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Router f68929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VipOfflinePreviewActiveCard.c f68930b;

    public d(Router router, VipOfflinePreviewActiveCard.c cVar) {
        this.f68929a = router;
        this.f68930b = cVar;
    }

    public final Object invoke() {
        C8008d.a(this.f68930b.f68892c, this.f68929a);
        return Unit.INSTANCE;
    }
}
