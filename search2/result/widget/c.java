package com.bilibili.search2.result.widget;

import E80.g0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/widget/c.class */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f88600a;

    public c(RecyclerView recyclerView, d dVar) {
        this.f88600a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g0 g0Var = this.f88600a.f88601a;
        if (g0Var != null) {
            g0Var.invoke(Boolean.FALSE);
        }
    }
}
