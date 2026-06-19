package com.bilibili.pegasus.components.interest.ui.v32.page;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4879p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/h.class */
public final class h extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV32FirstTab f76682a;

    public h(InterestChooseV32FirstTab interestChooseV32FirstTab) {
        this.f76682a = interestChooseV32FirstTab;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        RecyclerView recyclerView;
        C4879p c4879p = this.f76682a.f76667b;
        No0.i iVar = null;
        RecyclerView.Adapter adapter = (c4879p == null || (recyclerView = c4879p.f54118d) == null) ? null : recyclerView.getAdapter();
        if (adapter instanceof No0.i) {
            iVar = (No0.i) adapter;
        }
        int i8 = 1;
        if (iVar != null) {
            i8 = 1;
            if (iVar.getItemViewType(i7) == 0) {
                i8 = 2;
            }
        }
        return i8;
    }
}
