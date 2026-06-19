package com.bilibili.pegasus.components.interest.ui.v34.page;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4893w;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/page/h.class */
public final class h extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV34FirstTab f76778a;

    public h(InterestChooseV34FirstTab interestChooseV34FirstTab) {
        this.f76778a = interestChooseV34FirstTab;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        RecyclerView recyclerView;
        C4893w c4893w = this.f76778a.f76765b;
        Qo0.f fVar = null;
        RecyclerView.Adapter adapter = (c4893w == null || (recyclerView = c4893w.f54179e) == null) ? null : recyclerView.getAdapter();
        if (adapter instanceof Qo0.f) {
            fVar = (Qo0.f) adapter;
        }
        int i8 = 1;
        if (fVar != null) {
            i8 = 1;
            if (((ArrayList) fVar.f20116c).get(i7) instanceof String) {
                i8 = 2;
            }
        }
        return i8;
    }
}
