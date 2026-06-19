package com.bilibili.pegasus.components.interest.ui.v33.page;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4891v;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/g.class */
public final class g extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV33FirstTab f76731a;

    public g(InterestChooseV33FirstTab interestChooseV33FirstTab) {
        this.f76731a = interestChooseV33FirstTab;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        RecyclerView recyclerView;
        C4891v c4891v = this.f76731a.f76720b;
        Oo0.f fVar = null;
        RecyclerView.Adapter adapter = (c4891v == null || (recyclerView = c4891v.f54168e) == null) ? null : recyclerView.getAdapter();
        if (adapter instanceof Oo0.f) {
            fVar = (Oo0.f) adapter;
        }
        int i8 = 1;
        if (fVar != null) {
            i8 = 1;
            if (((ArrayList) fVar.f17978c).get(i7) instanceof String) {
                i8 = 2;
            }
        }
        return i8;
    }
}
