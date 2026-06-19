package com.bilibili.search2.result.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/widget/g.class */
public final class g implements Fi.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f88607a;

    public g(h hVar) {
        this.f88607a = hVar;
    }

    public final void Q(RecyclerView.ViewHolder viewHolder, boolean z6) {
        if (z6) {
            this.f88607a.f88609b.invoke();
        }
        if (viewHolder instanceof Fi.c) {
            ((Fi.c) viewHolder).Q(viewHolder, z6);
        }
    }
}
