package com.bilibili.pegasus.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/g.class */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f79149a;

    public g(RecyclerView recyclerView, h hVar) {
        this.f79149a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f79149a.f79150a.invoke();
    }
}
