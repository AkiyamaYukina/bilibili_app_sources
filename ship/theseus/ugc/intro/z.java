package com.bilibili.ship.theseus.ugc.intro;

import android.app.Activity;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.ship.theseus.united.page.restrictionlayer.LinkOperationAction;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/z.class */
public final class z implements com.bilibili.ship.theseus.united.page.restrictionlayer.t<LinkOperationAction> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f97921a;

    public z(Activity activity) {
        this.f97921a = activity;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final void a(LinkOperationAction linkOperationAction) {
        LinkOperationAction linkOperationAction2 = linkOperationAction;
        defpackage.a.b("[theseus-ugc-UGCOperationActionHandlerModule$link$$inlined$OperationActionHandler$1-handle] ", C4496a.a("action link to ", linkOperationAction2.f102572a), "UGCOperationActionHandlerModule$link$$inlined$OperationActionHandler$1-handle");
        BLRouter.routeTo(RouteRequestKt.toRouteRequest(linkOperationAction2.f102572a), this.f97921a);
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final Class<LinkOperationAction> b() {
        return LinkOperationAction.class;
    }
}
