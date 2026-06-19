package com.bilibili.ship.theseus.ogv.intro;

import com.bilibili.ship.theseus.ogv.activity.OgvActivityService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.VipFreeOperationAction;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/L.class */
public final class L implements com.bilibili.ship.theseus.united.page.restrictionlayer.t<VipFreeOperationAction> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvActivityService f92232a;

    public L(OgvActivityService ogvActivityService) {
        this.f92232a = ogvActivityService;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.bilibili.ship.theseus.united.page.restrictionlayer.VipFreeOperationAction r5) {
        /*
            r4 = this;
            r0 = r5
            com.bilibili.ship.theseus.united.page.restrictionlayer.VipFreeOperationAction r0 = (com.bilibili.ship.theseus.united.page.restrictionlayer.VipFreeOperationAction) r0
            com.bilibili.ship.theseus.united.page.restrictionlayer.TaskParamVo r0 = r0.f102724b
            r5 = r0
            r0 = r4
            com.bilibili.ship.theseus.ogv.activity.OgvActivityService r0 = r0.f92232a
            r7 = r0
            r0 = r7
            com.bilibili.ship.theseus.united.page.screenstate.c r0 = r0.f91397k
            r0.g()
            r0 = r7
            com.bilibili.ship.theseus.keel.player.h r0 = r0.f91401o
            r0.pause()
            com.bilibili.ship.theseus.ogv.operation.OgvActionType r0 = com.bilibili.ship.theseus.ogv.operation.OgvActionType.VIP_FREE
            r8 = r0
            r0 = r5
            if (r0 == 0) goto L31
            r0 = r5
            java.util.Map r0 = r0.a()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L35
        L31:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r5 = r0
        L35:
            r0 = r8
            java.lang.String r0 = r0.getValue()
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "action://"
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "action_params"
            r2 = r5
            java.lang.String r2 = com.bilibili.okretro.call.json.JsonUtilKt.toJson(r2)
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
            r0 = r7
            r1 = r6
            android.net.Uri r1 = r1.build()
            r0.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.L.a(com.bilibili.ship.theseus.united.page.restrictionlayer.s):void");
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final Class<VipFreeOperationAction> b() {
        return VipFreeOperationAction.class;
    }
}
