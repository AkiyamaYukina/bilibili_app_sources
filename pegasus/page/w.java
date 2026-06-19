package com.bilibili.pegasus.page;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/w.class */
public final class w implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f78443a;

    public w(x xVar) {
        this.f78443a = xVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        RecyclerView.Adapter adapter = this.f78443a.f78445b.getAdapter();
        if ((adapter != null ? adapter.getItemCount() : 0) <= 1 || !this.f78443a.f78445b.isShown()) {
            return;
        }
        this.f78443a.f78445b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        x.b(this.f78443a);
    }
}
