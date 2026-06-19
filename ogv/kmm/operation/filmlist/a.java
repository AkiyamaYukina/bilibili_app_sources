package com.bilibili.ogv.kmm.operation.filmlist;

import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.C6542t;
import fk0.C7119c;
import it0.C7615a;
import kntr.common.komponent.KomponentScope;
import ml0.C8011b;
import ml0.InterfaceC8012c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/filmlist/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ogv.operation3.module.operablecard.a f68293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC8012c f68295c;

    public a(com.bilibili.ogv.operation3.module.operablecard.a aVar, boolean z6, int i7, C8011b c8011b, KomponentScope<Object> komponentScope, boolean z7, C7119c c7119c, CardCollection cardCollection) {
        this.f68293a = aVar;
        this.f68294b = z6 ? i7 + 1 : 0;
        C7615a c7615aA = c8011b.a(komponentScope, aVar, null);
        this.f68295c = z7 ? new C6542t(c7119c, c7615aA, cardCollection.f68278b.f68290g, komponentScope, false) : c7615aA;
    }
}
