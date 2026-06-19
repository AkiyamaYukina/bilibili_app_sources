package com.bilibili.pegasus.holders;

import android.view.View;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/v0.class */
public final /* synthetic */ class ViewOnLongClickListenerC5703v0 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f78108b;

    public /* synthetic */ ViewOnLongClickListenerC5703v0(Object obj, int i7) {
        this.f78107a = i7;
        this.f78108b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f78107a) {
            case 0:
                LargeCoverV9Holder largeCoverV9Holder = (LargeCoverV9Holder) this.f78108b;
                rp0.p.c(largeCoverV9Holder, true, ListExtentionsKt.getGlobalRect(largeCoverV9Holder.E0()));
                return true;
            default:
                com.bilibili.ship.theseus.ugc.endpage.qoe.i iVar = ((UgcDmQoeComponent.b) this.f78108b).f96647a;
                if (iVar == null) {
                    return false;
                }
                iVar.c();
                return false;
        }
    }
}
