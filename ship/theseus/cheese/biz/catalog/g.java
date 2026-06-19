package com.bilibili.ship.theseus.cheese.biz.catalog;

import Vn.A;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bu0.C5165a;
import eu0.C6979B;
import fu0.C7200w;
import java.util.ArrayList;
import java.util.Iterator;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/g.class */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheeseCatalogTabFragment f89167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89168b;

    public /* synthetic */ g(CheeseCatalogTabFragment cheeseCatalogTabFragment, int i7) {
        this.f89167a = cheeseCatalogTabFragment;
        this.f89168b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object next;
        RecyclerView recyclerView;
        Context context;
        C7200w c7200w;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        CheeseCatalogTabFragment cheeseCatalogTabFragment = this.f89167a;
        int i7 = this.f89168b;
        C7200w c7200w2 = cheeseCatalogTabFragment.f89138j;
        RecyclerView.LayoutManager layoutManager = (c7200w2 == null || (recyclerView3 = c7200w2.f119623c) == null) ? null : recyclerView3.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        Iterator it = ((ArrayList) cheeseCatalogTabFragment.f89141m.f57024e).iterator();
        do {
            next = null;
            if (!it.hasNext()) {
                break;
            } else {
                next = it.next();
            }
        } while (!(((C5165a) next).f57015b instanceof C6979B));
        boolean z6 = next != null;
        StringBuilder sbB = A.b(i7, iFindFirstCompletelyVisibleItemPosition, "anchorPlayingEp, playingIndex: ", ", firstPos: ", ", hasSection: ");
        sbB.append(z6);
        BLog.d(sbB.toString());
        C7200w c7200w3 = cheeseCatalogTabFragment.f89138j;
        if (c7200w3 == null || (recyclerView = c7200w3.f119623c) == null || (context = recyclerView.getContext()) == null || !z6 || iFindFirstCompletelyVisibleItemPosition != i7 || (c7200w = cheeseCatalogTabFragment.f89138j) == null || (recyclerView2 = c7200w.f119623c) == null) {
            return;
        }
        recyclerView2.scrollBy(0, -((int) Uj0.c.a(40, context)));
    }
}
