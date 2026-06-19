package com.bilibili.ship.theseus.ogv.intro;

import android.content.Context;
import android.net.Uri;
import com.bilibili.ship.theseus.united.page.restrictionlayer.LinkOperationAction;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/I.class */
public final class I implements com.bilibili.ship.theseus.united.page.restrictionlayer.t<LinkOperationAction> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.page.screenstate.c f92221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bilibili.ship.theseus.keel.player.h f92222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f92223c;

    public I(com.bilibili.ship.theseus.united.page.screenstate.c cVar, com.bilibili.ship.theseus.keel.player.h hVar, Context context) {
        this.f92221a = cVar;
        this.f92222b = hVar;
        this.f92223c = context;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final void a(LinkOperationAction linkOperationAction) {
        this.f92221a.g();
        this.f92222b.pause();
        Qj0.g.e(this.f92223c, Uri.parse(linkOperationAction.f102572a));
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final Class<LinkOperationAction> b() {
        return LinkOperationAction.class;
    }
}
