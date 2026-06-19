package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/d.class */
public final class d extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f93652a;

    public d(boolean z6) {
        this.f93652a = z6;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        return this.f93652a ? 1 : 2;
    }
}
