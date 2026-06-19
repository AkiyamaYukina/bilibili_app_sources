package com.bilibili.pegasus.components.interest.ui.v29.page;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4876n0;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v29/page/f.class */
public final class f extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV29FirstTab f76547a;

    public f(InterestChooseV29FirstTab interestChooseV29FirstTab) {
        this.f76547a = interestChooseV29FirstTab;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        RecyclerView recyclerView;
        C4876n0 c4876n0 = this.f76547a.f76538b;
        Jo0.c cVar = null;
        RecyclerView.Adapter adapter = (c4876n0 == null || (recyclerView = c4876n0.f54106d) == null) ? null : recyclerView.getAdapter();
        if (adapter instanceof Jo0.c) {
            cVar = (Jo0.c) adapter;
        }
        int i8 = 1;
        if (cVar != null) {
            i8 = 1;
            if (((ArrayList) cVar.f11599c).get(i7) instanceof String) {
                i8 = 2;
            }
        }
        return i8;
    }
}
