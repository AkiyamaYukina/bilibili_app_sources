package com.bilibili.topix.center;

import android.content.Context;
import android.view.View;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/l.class */
public final /* synthetic */ class l implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag != null) {
            if (!(tag instanceof IpTopicItem)) {
                tag = null;
            }
            IpTopicItem ipTopicItem = (IpTopicItem) tag;
            if (ipTopicItem != null) {
                q.a(ipTopicItem.getType(), ipTopicItem, ipTopicItem.getPos(), "jump_biz_detail");
                String jumpUrl = ipTopicItem.getJumpUrl();
                if (jumpUrl != null) {
                    BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(jumpUrl), (Context) null, 2, (Object) null);
                }
            }
        }
    }
}
