package com.bilibili.ship.theseus.playlist.uicomponent;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/E.class */
public final class E extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f95989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f95990b;

    public E(D d7, ConstraintLayout constraintLayout) {
        this.f95989a = d7;
        this.f95990b = constraintLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        super.onScrolled(recyclerView, i7, i8);
        ConstraintLayout constraintLayout = this.f95990b;
        D d7 = this.f95989a;
        if (i8 == 0) {
            d7.c(constraintLayout, recyclerView);
        } else {
            d7.getClass();
            D.d(i8, constraintLayout);
        }
    }
}
