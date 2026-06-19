package com.bilibili.ship.theseus.ugc.intro;

import android.app.Activity;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.ship.theseus.united.page.restrictionlayer.P;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/A.class */
public final class A implements com.bilibili.ship.theseus.united.page.restrictionlayer.t<P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f96929a;

    public A(Activity activity) {
        this.f96929a = activity;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final void a(P p7) {
        P p8 = p7;
        defpackage.a.b("[theseus-ugc-UGCOperationActionHandlerModule$vip$$inlined$OperationActionHandler$1-handle] ", C4496a.a("action vip, route to ", p8.f102611a), "UGCOperationActionHandlerModule$vip$$inlined$OperationActionHandler$1-handle");
        String str = p8.f102611a;
        if (str != null) {
            BLRouter.routeTo(RouteRequestKt.toRouteRequest(str), this.f96929a);
        }
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final Class<P> b() {
        return P.class;
    }
}
