package com.bilibili.ogv.misc.reserve;

import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/reserve/i.class */
public final class i extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReserveListActivity f69192c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ReserveListActivity reserveListActivity) {
        super(reserveListActivity);
        this.f69192c = reserveListActivity;
    }

    @Override // com.bilibili.ogv.misc.reserve.a
    public final int a(RecyclerView recyclerView) {
        return (int) TypedValue.applyDimension(1, this.f69192c.f69176N ? 54 : 12, recyclerView.getContext().getResources().getDisplayMetrics());
    }
}
