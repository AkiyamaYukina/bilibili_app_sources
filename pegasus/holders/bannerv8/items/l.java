package com.bilibili.pegasus.holders.bannerv8.items;

import android.view.View;
import com.bilibili.pegasus.holders.bannerv8.items.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/l.class */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f77789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f77790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.a f77791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gp0.b f77792d;

    public l(View view, j jVar, j.a aVar, gp0.b bVar) {
        this.f77789a = view;
        this.f77790b = jVar;
        this.f77791c = aVar;
        this.f77792d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77790b.b(this.f77791c, this.f77792d, this.f77789a.getHeight());
    }
}
