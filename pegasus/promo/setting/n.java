package com.bilibili.pegasus.promo.setting;

import android.content.Context;
import androidx.preference.Preference;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/n.class */
public final /* synthetic */ class n implements Preference.c {
    @Override // androidx.preference.Preference.c
    public final boolean onPreferenceClick(Preference preference) {
        BLRouter.routeTo$default(RouteRequestKt.toRouteRequest("bilibili://pegasus/setting/recommend-label?from=1"), (Context) null, 2, (Object) null);
        return true;
    }
}
