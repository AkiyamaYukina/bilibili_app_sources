package com.bilibili.pegasus.components.interest.ui.v35.page;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4825B;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/h.class */
public final class h extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV35FirstTab f76811a;

    public h(InterestChooseV35FirstTab interestChooseV35FirstTab) {
        this.f76811a = interestChooseV35FirstTab;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        RecyclerView recyclerView;
        C4825B c4825b = this.f76811a.f76799b;
        So0.f fVar = null;
        RecyclerView.Adapter adapter = (c4825b == null || (recyclerView = c4825b.f53666e) == null) ? null : recyclerView.getAdapter();
        if (adapter instanceof So0.f) {
            fVar = (So0.f) adapter;
        }
        int i8 = 1;
        if (fVar != null) {
            i8 = 1;
            if (((ArrayList) fVar.f23077c).get(i7) instanceof String) {
                i8 = 2;
            }
        }
        return i8;
    }
}
