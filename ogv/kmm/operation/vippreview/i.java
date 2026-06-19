package com.bilibili.ogv.kmm.operation.vippreview;

import com.bilibili.ogv.kmm.operation.vippreview.VipOfflinePreviewActiveCard;
import it0.C7615a;
import kntr.common.komponent.KomponentScope;
import ml0.C8011b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/i.class */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VipOfflinePreviewActiveCard.c f68941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C7615a f68942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bilibili.ogv.kmm.operation.reservation.a f68943c;

    public i(VipOfflinePreviewActiveCard.c cVar, C8011b c8011b, KomponentScope<Object> komponentScope, com.bilibili.ogv.kmm.operation.reservation.b bVar) {
        this.f68941a = cVar;
        this.f68942b = c8011b.a(komponentScope, cVar, null);
        this.f68943c = new com.bilibili.ogv.kmm.operation.reservation.a(komponentScope.getCoroutineScope(), bVar);
    }
}
