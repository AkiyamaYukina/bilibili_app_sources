package com.bilibili.ship.theseus.ogv.intro;

import com.bilibili.ship.theseus.ogv.activity.ActivityDialogActionType;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.DeliveryOperationAction;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/G.class */
public final class G implements com.bilibili.ship.theseus.united.page.restrictionlayer.t<DeliveryOperationAction> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvActivityService f92215a;

    public G(OgvActivityService ogvActivityService) {
        this.f92215a = ogvActivityService;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final void a(DeliveryOperationAction deliveryOperationAction) {
        DeliveryOperationAction deliveryOperationAction2 = deliveryOperationAction;
        String str = deliveryOperationAction2.f102521a;
        if (str == null) {
            return;
        }
        this.f92215a.f(str, deliveryOperationAction2.f102522b, deliveryOperationAction2.f102523c ? ActivityDialogActionType.EXPOSURE : ActivityDialogActionType.EXEC);
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final Class<DeliveryOperationAction> b() {
        return DeliveryOperationAction.class;
    }
}
