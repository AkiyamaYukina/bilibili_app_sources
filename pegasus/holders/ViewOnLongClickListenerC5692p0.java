package com.bilibili.pegasus.holders;

import android.view.View;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.card.IInlineCard;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/p0.class */
public final /* synthetic */ class ViewOnLongClickListenerC5692p0 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IInlineCard f78078b;

    public /* synthetic */ ViewOnLongClickListenerC5692p0(IInlineCard iInlineCard, int i7) {
        this.f78077a = i7;
        this.f78078b = iInlineCard;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f78077a) {
            case 0:
                C5695r0 c5695r0 = (C5695r0) this.f78078b;
                rp0.p.c(c5695r0, true, ListExtentionsKt.getGlobalRect(c5695r0.f78081k.f53672d.f53934b));
                break;
            default:
                ((jt0.m) this.f78078b).f122651f.x0("long_press");
                break;
        }
        return true;
    }
}
