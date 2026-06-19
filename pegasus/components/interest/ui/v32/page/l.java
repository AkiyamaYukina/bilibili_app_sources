package com.bilibili.pegasus.components.interest.ui.v32.page;

import No0.q;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4879p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/l.class */
public final class l extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV32SecondTab f76688a;

    public l(InterestChooseV32SecondTab interestChooseV32SecondTab) {
        this.f76688a = interestChooseV32SecondTab;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        RecyclerView recyclerView;
        C4879p c4879p = this.f76688a.f76668b;
        q qVar = null;
        RecyclerView.Adapter adapter = (c4879p == null || (recyclerView = c4879p.f54118d) == null) ? null : recyclerView.getAdapter();
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
