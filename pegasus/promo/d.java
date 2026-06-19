package com.bilibili.pegasus.promo;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/d.class */
public final class d extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasePromoFragment f78506a;

    public d(BasePromoFragment basePromoFragment) {
        this.f78506a = basePromoFragment;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        BasePromoFragment basePromoFragment = this.f78506a;
        return basePromoFragment.nf().f(basePromoFragment.mf().getItemViewType(i7)) ? 2 : 1;
    }
}
