package com.bilibili.search2.result.user;

import android.view.View;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.tgwt.square.q;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/user/e.class */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f88551b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f88550a = i7;
        this.f88551b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RouteRequest routeRequest;
        switch (this.f88550a) {
            case 0:
                SearchResultUserFragment searchResultUserFragment = (SearchResultUserFragment) this.f88551b;
                boolean z6 = SearchResultUserFragment.f88520K;
                searchResultUserFragment.loadData(true);
                break;
            case 1:
                String str = ((q) this.f88551b).f112164b;
                if (str != null && (routeRequest = RouteRequestKt.toRouteRequest(str)) != null) {
                    Qj0.g.c(view.getContext(), routeRequest);
                    break;
                }
                break;
            default:
                ((com.bilibili.bililive.room.ui.roomv3.setting.h) this.f88551b).p0();
                break;
        }
    }
}
