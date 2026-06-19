package com.bilibili.ogv.kmm.operation.timefree;

import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.C6542t;
import fk0.C7119c;
import kntr.common.komponent.KomponentScope;
import ml0.C8011b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/timefree/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ogv.operation3.module.operablecard.a f68878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C6542t f68880c;

    public a(com.bilibili.ogv.operation3.module.operablecard.a aVar, boolean z6, int i7, C8011b c8011b, KomponentScope<Object> komponentScope, C7119c c7119c, LimitedTimeFreeRank limitedTimeFreeRank) {
        this.f68878a = aVar;
        this.f68879b = z6 ? 0 : i7 + 1;
        this.f68880c = new C6542t(c7119c, c8011b.a(komponentScope, aVar, null), limitedTimeFreeRank.f68861c.h, komponentScope, false);
    }
}
