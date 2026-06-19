package com.bilibili.playset;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/s0.class */
public final class s0 extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f85613a;

    public s0(x0 x0Var) {
        this.f85613a = x0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i7, int i8) {
        for (int i9 = i7; i9 < i7 + i8; i9++) {
            x0 x0Var = this.f85613a;
            if (x0Var.f123367a.a(i9).f123366d == 2) {
                ((HashMap) x0Var.f85829c.f84004g.f129851e).remove(Long.valueOf(x0Var.b(i9)));
            }
        }
    }
}
