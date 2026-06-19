package com.bilibili.playset;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ks0.AbstractC7785a;
import ks0.InterfaceC7786b;
import ls0.C7889a;

/* JADX INFO: renamed from: com.bilibili.playset.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/p.class */
public final class C5996p extends C7889a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f85181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f85182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ls0.f f85183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC7785a<InterfaceC7786b> f85184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.bilibili.playset.api.f f85185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f85186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f85187g;

    /* JADX INFO: renamed from: com.bilibili.playset.p$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/p$a.class */
    public final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5996p f85188a;

        public a(C5996p c5996p) {
            this.f85188a = c5996p;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bilibili.playset.l, ls0.f] */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C5996p c5996p = this.f85188a;
            c5996p.f85183c.t(c5996p.f85184d, c5996p);
        }
    }

    public C5996p() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.playset.p] */
    public static C5996p q0(InterfaceC5988l<InterfaceC7786b> interfaceC5988l, ViewGroup viewGroup) {
        View viewA = p.a(viewGroup, 2131499711, viewGroup, false);
        ?? viewHolder = new RecyclerView.ViewHolder(viewA);
        viewHolder.f85187g = new a(viewHolder);
        viewHolder.f85183c = (ls0.f) interfaceC5988l;
        viewHolder.f85181a = (TextView) viewA.findViewById(2131308897);
        viewHolder.f85182b = (TextView) viewA.findViewById(2131314778);
        viewHolder.f85186f = viewA.findViewById(2131305804);
        return viewHolder;
    }

    public final void p0(AbstractC7785a<InterfaceC7786b> abstractC7785a, com.bilibili.playset.api.f fVar) {
        this.f85184d = abstractC7785a;
        this.f85185e = fVar;
        int i7 = fVar.f84073a;
        if (i7 == 1) {
            s0();
        } else if (i7 == 2) {
            t0();
        } else {
            if (i7 != 3) {
                throw new IllegalStateException("unknown state");
            }
            r0();
        }
    }

    public final void r0() {
        this.f85181a.setVisibility(8);
        this.f85182b.setVisibility(8);
        this.itemView.setOnClickListener(null);
    }

    public final void s0() {
        this.f85181a.setVisibility(0);
        this.f85182b.setVisibility(8);
        this.itemView.setOnClickListener(this.f85187g);
    }

    public final void t0() {
        this.f85181a.setVisibility(8);
        this.f85182b.setVisibility(0);
        this.itemView.setOnClickListener(null);
    }
}
