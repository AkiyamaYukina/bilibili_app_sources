package com.bilibili.pegasus.page;

import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/k.class */
public final /* synthetic */ class RunnableC5722k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5724m f78411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78412b;

    public /* synthetic */ RunnableC5722k(C5724m c5724m, int i7) {
        this.f78411a = c5724m;
        this.f78412b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5724m c5724m = this.f78411a;
        int i7 = this.f78412b;
        c5724m.f78421i = null;
        RecyclerView recyclerView = c5724m.f78414a;
        OneShotPreDrawListener.add(recyclerView, new RunnableC5725n(recyclerView, c5724m, i7));
    }
}
