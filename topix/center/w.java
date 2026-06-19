package com.bilibili.topix.center;

import android.view.View;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.neuron.api.Neurons;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/w.class */
public final /* synthetic */ class w implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (!(tag instanceof Section)) {
            tag = null;
        }
        Section section = (Section) tag;
        if (section == null) {
            return;
        }
        String moreLink = section.getMoreLink();
        if (moreLink != null) {
            BLRouter.routeTo(RouteRequestKt.toRouteRequest(moreLink), view.getContext());
        }
        TopixCenterItemType childType = section.getChildType();
        if (childType != null) {
            Neurons.reportClick(false, "dt.new-topic-center.topic-card.more.click", MapsKt.mapOf(TuplesKt.to("sub_module", childType.getLabel())));
        }
    }
}
