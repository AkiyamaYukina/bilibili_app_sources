package com.bilibili.pegasus.page;

import android.view.View;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/n.class */
public final class RunnableC5725n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f78427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5724m f78428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f78429c;

    public RunnableC5725n(View view, C5724m c5724m, int i7) {
        this.f78427a = view;
        this.f78428b = c5724m;
        this.f78429c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        if (this.f78428b.c() || (i7 = this.f78429c) <= 0) {
            return;
        }
        C5724m c5724m = this.f78428b;
        if (c5724m.f78420g && c5724m.f78421i == null) {
            RunnableC5722k runnableC5722k = new RunnableC5722k(c5724m, i7 - 1);
            c5724m.f78421i = runnableC5722k;
            c5724m.f78414a.postOnAnimation(runnableC5722k);
        }
    }
}
