package com.bilibili.pegasus.components.interest.ui.v31.page;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4867j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/g.class */
public final class g extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV31FirstTab f76618a;

    public g(InterestChooseV31FirstTab interestChooseV31FirstTab) {
        this.f76618a = interestChooseV31FirstTab;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        RecyclerView recyclerView;
        C4867j c4867j = this.f76618a.f76602b;
        Mo0.i iVar = null;
        RecyclerView.Adapter adapter = (c4867j == null || (recyclerView = c4867j.f54066e) == null) ? null : recyclerView.getAdapter();
        if (adapter instanceof Mo0.i) {
            iVar = (Mo0.i) adapter;
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
