package com.bilibili.pegasus.page;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/i.class */
public final class C5720i extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5721j f78399a;

    public C5720i(C5721j c5721j) {
        this.f78399a = c5721j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        super.onScrollStateChanged(recyclerView, i7);
        C5721j c5721j = this.f78399a;
        if (i7 == 0) {
            c5721j.f78407i = false;
            c5721j.b();
            RunnableC5717f runnableC5717f = new RunnableC5717f(c5721j, 0);
            c5721j.f78406g = runnableC5717f;
            c5721j.f78401b.postDelayed(runnableC5717f, 1500L);
            return;
        }
        c5721j.f78407i = true;
        c5721j.b();
        if (!c5721j.f78409k || c5721j.f78408j) {
            return;
        }
        c5721j.a(0.5f, -30.0f);
    }
}
