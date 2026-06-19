package com.bilibili.pegasus.promo.setting;

import android.content.Context;
import android.view.View;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/l.class */
public final /* synthetic */ class l implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = RecommendSettingColumnEntryItemView.f78543d;
        BLRouter.routeTo$default(RouteRequestKt.toRouteRequest("bilibili://pegasus/setting/recommend/column"), (Context) null, 2, (Object) null);
    }
}
