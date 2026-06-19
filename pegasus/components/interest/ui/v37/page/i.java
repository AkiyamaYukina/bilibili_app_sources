package com.bilibili.pegasus.components.interest.ui.v37.page;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4839P;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/i.class */
public final class i extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV37Dialog f76895a;

    public i(InterestChooseV37Dialog interestChooseV37Dialog) {
        this.f76895a = interestChooseV37Dialog;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        RecyclerView recyclerView;
        C4839P c4839p = this.f76895a.f76881f;
        Wo0.d dVar = null;
        RecyclerView.Adapter adapter = (c4839p == null || (recyclerView = c4839p.f53805d) == null) ? null : recyclerView.getAdapter();
        if (adapter instanceof Wo0.d) {
            dVar = (Wo0.d) adapter;
        }
        int i8 = 1;
        if (dVar != null) {
            i8 = 1;
            if (((ArrayList) dVar.f27021c).get(i7) instanceof String) {
                i8 = 2;
            }
        }
        return i8;
    }
}
