package com.bilibili.ogv.misc.timeline;

import android.view.View;
import java.util.ArrayList;
import yP.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/d.class */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f69444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f69445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f69446c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f69444a = i7;
        this.f69445b = obj;
        this.f69446c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f69444a) {
            case 0:
                BangumiTimelineActivity bangumiTimelineActivity = (BangumiTimelineActivity) this.f69445b;
                c cVar = (c) this.f69446c;
                int i7 = BangumiTimelineActivity.f69394W;
                a.a(bangumiTimelineActivity);
                cVar.dismiss();
                break;
            default:
                a.d dVar = (a.d) this.f69445b;
                a.f fVar = (a.f) this.f69446c;
                int iO = dVar.c.O() + 1;
                yP.a aVar = dVar.c;
                aVar.notifyItemRemoved(((ArrayList) aVar.d).indexOf(fVar));
                ((ArrayList) dVar.c.d).remove(fVar);
                ((ArrayList) dVar.c.d).add(iO, fVar);
                fVar.d = false;
                dVar.c.notifyItemInserted(iO);
                yP.a.N(dVar.c);
                if (dVar.c.O() == 2) {
                    yP.a aVar2 = dVar.c;
                    aVar2.notifyItemRangeChanged(3, aVar2.getItemCount() - 3);
                }
                break;
        }
    }
}
