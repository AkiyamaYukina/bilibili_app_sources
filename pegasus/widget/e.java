package com.bilibili.pegasus.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.holders.C5647b;
import com.bilibili.pegasus.holders.C5702v;
import vp0.C8840a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/e.class */
public final class e implements Fi.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f79147a;

    public e(f fVar) {
        this.f79147a = fVar;
    }

    public final void Q(RecyclerView.ViewHolder viewHolder, boolean z6) {
        if (z6) {
            if ((viewHolder instanceof C5647b) || (viewHolder instanceof C8840a) || (viewHolder instanceof C5702v)) {
                this.f79147a.f79148b.invoke();
            }
        }
    }

    public final void n(RecyclerView.ViewHolder viewHolder, boolean z6) {
        if (z6) {
            if ((viewHolder instanceof C5647b) || (viewHolder instanceof C8840a) || (viewHolder instanceof C5702v)) {
                this.f79147a.f79148b.invoke();
            }
        }
    }
}
