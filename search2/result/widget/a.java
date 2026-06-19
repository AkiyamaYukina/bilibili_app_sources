package com.bilibili.search2.result.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/widget/a.class */
public final class a implements Fi.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f88598a;

    public a(b bVar) {
        this.f88598a = bVar;
    }

    public final void Q(RecyclerView.ViewHolder viewHolder, boolean z6) {
        if (z6) {
            this.f88598a.f88599b.invoke();
        }
        if (viewHolder instanceof Fi.c) {
            ((Fi.c) viewHolder).Q(viewHolder, z6);
        }
    }
}
