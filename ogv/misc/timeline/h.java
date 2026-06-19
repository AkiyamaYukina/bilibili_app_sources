package com.bilibili.ogv.misc.timeline;

import android.view.View;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.pegasus.holders.C5695r0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/h.class */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f69454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f69455b;

    public /* synthetic */ h(Object obj, int i7) {
        this.f69454a = i7;
        this.f69455b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f69454a) {
            case 0:
                j jVar = (j) this.f69455b;
                new SharedPreferencesHelper(view.getContext()).setBoolean(2131833238, true);
                int itemCount = jVar.getItemCount();
                jVar.f69458c = false;
                jVar.notifyItemRemoved(itemCount - 1);
                break;
            default:
                ((C5695r0) this.f69455b).E0("0");
                break;
        }
    }
}
