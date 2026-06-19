package com.bilibili.pegasus.components.interest.ui.v31.page;

import Mo0.q;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4867j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/k.class */
public final class k extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV31SecondTab f76623a;

    public k(InterestChooseV31SecondTab interestChooseV31SecondTab) {
        this.f76623a = interestChooseV31SecondTab;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        RecyclerView recyclerView;
        C4867j c4867j = this.f76623a.f76603b;
        q qVar = null;
        RecyclerView.Adapter adapter = (c4867j == null || (recyclerView = c4867j.f54066e) == null) ? null : recyclerView.getAdapter();
        if (adapter instanceof q) {
            qVar = (q) adapter;
        }
        int i8 = 1;
        if (qVar != null) {
            int itemViewType = qVar.getItemViewType(i7);
            i8 = (itemViewType == 1 || itemViewType == 3 || itemViewType == 4) ? 2 : 1;
        }
        return i8;
    }
}
