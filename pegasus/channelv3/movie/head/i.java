package com.bilibili.pegasus.channelv3.movie.head;

import android.content.Context;
import android.view.View;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/i.class */
public final /* synthetic */ class i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f75420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f75421b;

    public /* synthetic */ i(m mVar, c cVar) {
        this.f75420a = mVar;
        this.f75421b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m mVar = this.f75420a;
        c cVar = this.f75421b;
        e.a(mVar.b(), MovieButtonName.WATCH, false);
        BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(cVar.f75402c), (Context) null, 2, (Object) null);
    }
}
