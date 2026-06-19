package com.bilibili.pegasus.holders.oversea;

import android.view.View;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent;
import ip0.C7609b;
import op0.C8249a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/v.class */
public final /* synthetic */ class v implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f78059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f78060c;

    public /* synthetic */ v(int i7, Object obj, Object obj2) {
        this.f78058a = i7;
        this.f78059b = obj;
        this.f78060c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f78058a) {
            case 0:
                LargeCoverSingleV12Holder largeCoverSingleV12Holder = (LargeCoverSingleV12Holder) this.f78059b;
                C7609b c7609b = (C7609b) this.f78060c;
                jp0.d dVarK = c7609b.k();
                C8249a.f(largeCoverSingleV12Holder, ListExtentionsKt.toUri(dVarK != null ? dVarK.a(c7609b.getUri()) : null), null, null, false, null, null, 254);
                break;
            default:
                RecommendUpComponent recommendUpComponent = (RecommendUpComponent) this.f78059b;
                com.bilibili.app.gemini.ui.n nVar = (com.bilibili.app.gemini.ui.n) this.f78060c;
                recommendUpComponent.h.invoke();
                recommendUpComponent.a(nVar);
                break;
        }
    }
}
