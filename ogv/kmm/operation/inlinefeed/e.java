package com.bilibili.ogv.kmm.operation.inlinefeed;

import com.bilibili.ogv.kmm.operation.inlinefeed.a;
import com.bilibili.ogv.operation3.module.followable.CreateFollowableSeasonModel$invoke$1;
import it0.C7615a;
import kntr.common.komponent.KomponentScope;
import ml0.C8011b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/e.class */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.c f68377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C7615a f68378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bilibili.ogv.kmm.operation.inlinevideo.b f68379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CreateFollowableSeasonModel$invoke$1 f68380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bilibili.ogv.operation3.module.feedback.g f68381e;

    public e(a.c cVar, C8011b c8011b, KomponentScope<Object> komponentScope, com.bilibili.ogv.operation3.module.followable.h hVar, com.bilibili.ogv.operation3.module.feedback.h hVar2, com.bilibili.ogv.kmm.operation.inlinevideo.c cVar2, a aVar) {
        this.f68377a = cVar;
        this.f68378b = c8011b.a(komponentScope, cVar, null);
        com.bilibili.ogv.kmm.operation.inlinevideo.g gVar = cVar.f68352g;
        this.f68379c = gVar != null ? new com.bilibili.ogv.kmm.operation.inlinevideo.b(aVar.f68339a, gVar, cVar2) : null;
        this.f68380d = hVar.a(komponentScope, cVar);
        this.f68381e = new com.bilibili.ogv.operation3.module.feedback.g(komponentScope.getCoroutineScope(), hVar2, cVar, cVar);
    }
}
