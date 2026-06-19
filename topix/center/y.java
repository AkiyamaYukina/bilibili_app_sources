package com.bilibili.topix.center;

import android.view.View;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/y.class */
public final /* synthetic */ class y implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (!(tag instanceof TopicItem)) {
            tag = null;
        }
        TopicItem topicItem = (TopicItem) tag;
        if (topicItem != null) {
            q.b(topicItem.getType(), topicItem, topicItem.getPos());
            String jumpUrl = topicItem.getJumpUrl();
            if (jumpUrl != null) {
                BLRouter.routeTo(RouteRequestKt.toRouteRequest(jumpUrl).newBuilder().extras(new Hz.e(1)).build(), view.getContext());
            }
        }
    }
}
