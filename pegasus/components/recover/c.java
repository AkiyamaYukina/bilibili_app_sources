package com.bilibili.pegasus.components.recover;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/c.class */
public final class c extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardRecoverComponent f77152a;

    public c(CardRecoverComponent cardRecoverComponent) {
        this.f77152a = cardRecoverComponent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        super.onScrollStateChanged(recyclerView, i7);
        if (i7 == 1 || i7 == 2) {
            this.f77152a.c("scroll");
        }
    }
}
