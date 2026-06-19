package com.bilibili.ship.theseus.united.page.intro.module.season;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.widget.ListGameCardButton;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.pegasus.ext.router.SpecialSpmidType;
import java.util.LinkedHashMap;
import op0.C8249a;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/u.class */
public final /* synthetic */ class ViewOnClickListenerC6358u implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f101703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f101704c;

    public /* synthetic */ ViewOnClickListenerC6358u(int i7, Object obj, Object obj2) {
        this.f101702a = i7;
        this.f101703b = obj;
        this.f101704c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mi.a aVar;
        switch (this.f101702a) {
            case 0:
                C6360w c6360w = (C6360w) this.f101703b;
                RecyclerView recyclerView = (RecyclerView) this.f101704c;
                c6360w.f101714q.invoke();
                recyclerView.stopScroll();
                break;
            default:
                wp0.i iVar = (wp0.i) this.f101703b;
                hp0.h hVarH = ((hp0.i) this.f101704c).h();
                C8249a.f(iVar, ListExtentionsKt.toUri(hVarH != null ? hVarH.getUri() : null), null, null, false, SpecialSpmidType.TYPE_NOTIFY, null, 158);
                hp0.i iVar2 = (hp0.i) iVar.getBindData();
                if (iVar2 != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(wp0.i.I0(iVar2));
                    ListGameCardButton listGameCardButton = iVar.f128923v;
                    if (listGameCardButton != null && (aVar = listGameCardButton.b) != null) {
                        aVar.e(linkedHashMap);
                    }
                }
                iVar.G0("content_click");
                break;
        }
    }
}
