package com.bilibili.ogv.kmm.operation.inlinefeed;

import com.bilibili.ogv.kmm.operation.inlinefeed.w;
import com.bilibili.ogv.operation3.module.followable.CreateFollowableSeasonModel$invoke$1;
import it0.C7615a;
import kntr.common.komponent.KomponentScope;
import ml0.C8011b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/s.class */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w.c f68421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C7615a f68422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bilibili.ogv.kmm.operation.inlinevideo.b f68423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CreateFollowableSeasonModel$invoke$1 f68424d;

    public s(w.c cVar, C8011b c8011b, KomponentScope<Object> komponentScope, com.bilibili.ogv.operation3.module.followable.h hVar, com.bilibili.ogv.kmm.operation.inlinevideo.c cVar2, w wVar) {
        this.f68421a = cVar;
        this.f68422b = c8011b.a(komponentScope, cVar, null);
        com.bilibili.ogv.kmm.operation.inlinevideo.g gVar = cVar.f68452e;
        this.f68423c = gVar != null ? new com.bilibili.ogv.kmm.operation.inlinevideo.b(wVar.f68441a, gVar, cVar2) : null;
        this.f68424d = hVar.a(komponentScope, cVar);
    }
}
