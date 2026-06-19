package com.bilibili.pegasus.components.windowpane;

import androidx.recyclerview.widget.GridLayoutManager;
import com.bilibili.pegasus.vm.PegasusViewModel;
import mp0.C8028c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/windowpane/f.class */
public final class f extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowPaneStyleComponent f77238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77239b;

    public f(WindowPaneStyleComponent windowPaneStyleComponent, int i7) {
        this.f77238a = windowPaneStyleComponent;
        this.f77239b = i7;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        return ((C8028c) ((PegasusViewModel) this.f77238a.f77226l.getValue()).f79020m.getValue()).f123831a.f123826a.get(i7).getHolderStyle().isSmallCard() ? 1 : this.f77239b;
    }
}
