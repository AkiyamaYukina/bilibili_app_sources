package com.bilibili.topix.center;

import android.content.Context;
import android.view.View;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/g.class */
public final /* synthetic */ class g implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Neurons.reportClick$default(false, "dt.new-topic-center.search-box.0.click", (Map) null, 4, (Object) null);
        BLRouter.routeTo$default(RouteRequestKt.toRouteRequest("bilibili://topix/topic-center/search"), (Context) null, 2, (Object) null);
    }
}
