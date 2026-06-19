package com.bilibili.pegasus.components.interest.ui.v30.page;

import Jh.v;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/h.class */
public final class h extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV30FirstTab f76579a;

    public h(InterestChooseV30FirstTab interestChooseV30FirstTab) {
        this.f76579a = interestChooseV30FirstTab;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        v vVar = this.f76579a.f76566b;
        v vVar2 = vVar;
        if (vVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar2 = null;
        }
        RecyclerView.Adapter adapter = vVar2.d.getAdapter();
        Lo0.f fVar = null;
        if (adapter instanceof Lo0.f) {
            fVar = (Lo0.f) adapter;
        }
        int i8 = 1;
        if (fVar != null) {
            i8 = 1;
            if (((ArrayList) fVar.f14747c).get(i7) instanceof String) {
                i8 = 2;
            }
        }
        return i8;
    }
}
